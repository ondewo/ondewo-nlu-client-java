package com.ondewo.nlu.auth;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;

import io.grpc.CallCredentials;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.CompositeCallCredentials;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.stub.AbstractStub;

import java.io.IOException;
import java.io.StringReader;
import java.lang.ref.Cleaner;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.function.DoubleSupplier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Acquires and auto-refreshes a Keycloak access token and attaches it to every gRPC call as
 * {@code authorization: Bearer <token>}.
 *
 * <p>Start-up is ONE token request: a {@code refresh_token} grant with a handed-off offline token
 * when {@link KeycloakCredentials#getRefreshToken()} is set (the password is then never sent), else
 * a password grant with {@code scope=offline_access}. From then on the access token is refreshed
 * from the offline refresh token, two ways, both within the {@code tokenExpirationInS} window:
 *
 * <ul>
 *   <li>proactively, by a daemon thread {@code keycloak-token-refresh-<clientId>} that wakes
 *       {@value #EXPIRY_LEEWAY_S} s before expiry;
 *   <li>lazily, on every call ({@link #authorizationHeaderValue()}), when the token is inside that
 *       leeway.
 * </ul>
 *
 * <p>A failed refresh never ends the background thread and is never answered with a password
 * grant. Both paths share ONE jittered backoff ({@value #RETRY_BASE_DELAY_S} s doubling to
 * {@value #RETRY_MAX_DELAY_S} s), so an outage costs one request per backoff step, not one per
 * call. While the backoff runs, a still-valid token keeps being served; only an EXPIRED token
 * raises {@link KeycloakAuthenticationException}.
 *
 * <p>Use {@link #shared(KeycloakCredentials)} so all stubs of one credential set share one
 * provider (one login). {@link #close()} stops the thread; the lazy path keeps working after it.
 * A provider that becomes unreachable stops its thread by itself.
 *
 * <pre>{@code
 * KeycloakTokenProvider tokens = KeycloakTokenProvider.shared(new KeycloakCredentials(
 *     "https://host/auth", "ondewo-ccai-platform", "ondewo-nlu-cai-sdk-public",
 *     "user@example.com", "", null, true, offlineRefreshToken));
 * AgentsGrpc.AgentsBlockingStub stub = tokens.attachTo(AgentsGrpc.newBlockingStub(channel));
 * }</pre>
 */
public final class KeycloakTokenProvider implements AutoCloseable {

    /** Refresh this many seconds before the access token expires. */
    public static final double EXPIRY_LEEWAY_S = 30.0;

    /** Floor of any background wait, so an {@code expires_in} of 0 cannot become a hot loop. */
    public static final double MIN_REFRESH_DELAY_S = 1.0;

    /** First retry delay after a failed refresh. */
    public static final double RETRY_BASE_DELAY_S = 5.0;

    /** Ceiling of the failure backoff. */
    public static final double RETRY_MAX_DELAY_S = 300.0;

    /** Exponent cap of the backoff: {@code 5 * 2^6 = 320 >= 300}. */
    public static final int MAX_RETRY_EXPONENT = 6;

    /** Bound of one token-endpoint call; stays below {@link #EXPIRY_LEEWAY_S}. */
    public static final double HTTP_TIMEOUT_S = 10.0;

    /** A quoted error body is truncated to this many characters. */
    public static final int MAX_ERROR_BODY_CHARS = 500;

    /** Bounded wait for the background thread on {@link #close()}. */
    public static final double THREAD_JOIN_TIMEOUT_S = 5.0;

    private static final Logger LOGGER = Logger.getLogger(KeycloakTokenProvider.class.getName());

    private static final Metadata.Key<String> AUTHORIZATION =
            Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);

    private static final TypeAdapter<JsonElement> JSON = new Gson().getAdapter(JsonElement.class);

    /** Stops the thread of a provider that became unreachable without {@link #close()}. */
    private static final Cleaner CLEANER = Cleaner.create();

    private final String clientId;
    private final String username;
    private final String password;
    private final Integer tokenExpirationInS;
    private final String tokenEndpoint;
    private final TokenEndpoint transport;
    private final DoubleSupplier clock;
    private final DoubleSupplier random;
    private final StopSignal stopSignal;
    private final KeycloakTimings timings;

    /** Serialises the lazy refresh of every call against the background refresh. */
    final Object lock = new Object();

    private volatile String accessToken = "";
    private String refreshToken;
    double accessTokenExpiresAt;
    Double loginDeadline;
    int consecutiveRefreshFailures;
    double nextRefreshAttemptAt;

    /** The background thread; package-private so a test can stand in a thread of its own. */
    volatile Thread worker;

    private final Cleaner.Cleanable cleanable;
    private volatile boolean closed;

    /**
     * Acquires the first token and starts the background refresh.
     *
     * @param credentials the identity to authenticate as
     * @throws KeycloakAuthenticationException if the start-up request fails; nothing is retried
     */
    public KeycloakTokenProvider(final KeycloakCredentials credentials) {
        this(
                credentials,
                null,
                KeycloakTokenProvider::monotonicSeconds,
                Math::random,
                new StopSignal.Latch(),
                true,
                KeycloakTimings.DEFAULTS);
    }

    /**
     * The positional form of {@link #KeycloakTokenProvider(KeycloakCredentials)}; the parameters are
     * those of {@link KeycloakCredentials}, {@code refreshToken} LAST.
     *
     * @throws IllegalArgumentException if the credentials are incomplete
     * @throws KeycloakAuthenticationException if the start-up request fails
     */
    public KeycloakTokenProvider(
            final String keycloakUrl,
            final String realm,
            final String clientId,
            final String username,
            final String password,
            final Integer tokenExpirationInS,
            final boolean verifySsl,
            final String refreshToken) {
        this(
                new KeycloakCredentials(
                        keycloakUrl,
                        realm,
                        clientId,
                        username,
                        password,
                        tokenExpirationInS,
                        verifySsl,
                        refreshToken));
    }

    /**
     * The constructor with every test seam.
     *
     * @param transport the token endpoint; {@code null} for {@link HttpClientTokenEndpoint}
     * @param clock monotonic seconds
     * @param random the backoff jitter, a fraction in {@code [0, 1)}; read on failures only
     * @param stopSignal the stop event and interruptible sleep of the background thread
     * @param startBackgroundRefresh {@code false} to drive {@link #refreshLoop} by hand
     * @param timings the timing constants
     */
    KeycloakTokenProvider(
            final KeycloakCredentials credentials,
            final TokenEndpoint transport,
            final DoubleSupplier clock,
            final DoubleSupplier random,
            final StopSignal stopSignal,
            final boolean startBackgroundRefresh,
            final KeycloakTimings timings) {
        this.clientId = credentials.getClientId();
        this.username = credentials.getUsername();
        this.password = credentials.getPassword();
        this.tokenExpirationInS = credentials.getTokenExpirationInS();
        this.refreshToken = credentials.getRefreshToken();
        this.tokenEndpoint =
                stripTrailingSlashes(credentials.getKeycloakUrl())
                        + "/realms/"
                        + credentials.getRealm()
                        + "/protocol/openid-connect/token";
        this.transport =
                transport != null ? transport : new HttpClientTokenEndpoint(credentials.isVerifySsl());
        this.clock = clock;
        this.random = random;
        this.stopSignal = stopSignal;
        this.timings = timings;

        if (refreshToken.isEmpty()) {
            login();
        } else {
            // Keycloak's brute-force detection counts failed LOGINS: N processes refreshing one
            // offline token at once is not the burst the realm penalises, N password grants is.
            refresh();
        }
        if (tokenExpirationInS != null) {
            loginDeadline = clock.getAsDouble() + tokenExpirationInS;
        }
        // The action holds the stop signal only, never this provider, so it cannot pin it.
        this.cleanable = CLEANER.register(this, stopSignal::set);
        if (startBackgroundRefresh) {
            final Thread thread =
                    new Thread(
                            refreshTask(new WeakReference<>(this), stopSignal, clock),
                            "keycloak-token-refresh-" + clientId);
            thread.setDaemon(true);
            worker = thread;
            thread.start();
        }
    }

    /**
     * The provider shared by every client of {@code credentials}, created (one login) on first use.
     * A closed provider is never handed out again; a new one replaces it.
     *
     * @param credentials the identity to authenticate as
     * @return the shared provider
     * @throws KeycloakAuthenticationException if a new provider's start-up request fails
     */
    public static KeycloakTokenProvider shared(final KeycloakCredentials credentials) {
        return KeycloakTokenProviderRegistry.DEFAULT.get(credentials);
    }

    /** @return the most recent access token, without refreshing */
    public String getAccessToken() {
        return accessToken;
    }

    /** @return whether {@link #close()} has been called */
    public boolean isClosed() {
        return closed;
    }

    /**
     * The value of the {@code authorization} header, refreshing first when the token is inside the
     * leeway and no backoff is running. A failed refresh still returns a token that has not
     * expired yet.
     *
     * @return {@code Bearer <access token>}
     * @throws KeycloakAuthenticationException if the token has expired and could not be refreshed
     */
    public String authorizationHeaderValue() {
        synchronized (lock) {
            refreshIfWithinWindow(clock.getAsDouble());
            return "Bearer " + accessToken;
        }
    }

    /**
     * @return fresh call headers carrying {@link #authorizationHeaderValue()}
     * @throws KeycloakAuthenticationException as {@link #authorizationHeaderValue()}
     */
    public Metadata toMetadata() {
        final Metadata metadata = new Metadata();
        metadata.put(AUTHORIZATION, authorizationHeaderValue());
        return metadata;
    }

    /**
     * Call credentials that read the header on every call, on the call's executor. A token that
     * cannot be served fails the call with {@code UNAUTHENTICATED}, the
     * {@link KeycloakAuthenticationException} as its cause.
     *
     * @return call credentials backed by this provider
     */
    public CallCredentials toCallCredentials() {
        return new TokenCallCredentials(this);
    }

    /**
     * An interceptor that adds {@link #toCallCredentials()} to every call, composed with call
     * credentials the call already carries. {@code GrpcChannels} installs it on the channel when
     * the {@code ClientConfig} configures Keycloak.
     *
     * @return the interceptor
     */
    public ClientInterceptor toInterceptor() {
        final CallCredentials ours = toCallCredentials();
        return new ClientInterceptor() {
            @Override
            public <Q, R> ClientCall<Q, R> interceptCall(
                    final MethodDescriptor<Q, R> method,
                    final CallOptions callOptions,
                    final Channel next) {
                final CallCredentials existing = callOptions.getCredentials();
                final CallCredentials credentials =
                        existing == null ? ours : new CompositeCallCredentials(existing, ours);
                return next.newCall(method, callOptions.withCallCredentials(credentials));
            }
        };
    }

    /**
     * @param stub any generated stub
     * @return a copy of {@code stub} that authenticates every call through this provider
     */
    public <S extends AbstractStub<S>> S attachTo(final S stub) {
        return stub.withCallCredentials(toCallCredentials());
    }

    /**
     * Stops the background refresh and waits for its thread at most {@value #THREAD_JOIN_TIMEOUT_S}
     * s. Idempotent, safe from any state and from the refresh thread itself; never throws. The
     * lazy path keeps refreshing on demand afterwards.
     */
    @Override
    public void close() {
        closed = true;
        stopSignal.set();
        cleanable.clean();
        final Thread thread = worker;
        if (thread != null && thread != Thread.currentThread()) {
            try {
                thread.join((long) (timings.threadJoinTimeoutS * 1000));
            } catch (final InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /** Alias of {@link #close()}. */
    public void stop() {
        close();
    }

    /**
     * Refreshes when the token is inside the leeway, the deadline has not passed and no backoff is
     * running. Shared by the lazy path and the background thread; the caller holds {@link #lock}.
     *
     * @param now the monotonic time, read by the caller
     * @throws KeycloakAuthenticationException if the token has expired and could not be refreshed
     */
    void refreshIfWithinWindow(final double now) {
        if (loginDeadline != null && now >= loginDeadline) {
            return; // the auto-refresh window has closed: the token is allowed to lapse
        }
        if (now < accessTokenExpiresAt - timings.expiryLeewayS) {
            return;
        }
        if (now < nextRefreshAttemptAt) {
            if (now < accessTokenExpiresAt) {
                return;
            }
            throw new KeycloakAuthenticationException(
                    String.format(
                            Locale.ROOT,
                            "The Keycloak access token has expired and the refresh is backing off"
                                    + " after %d consecutive failure(s); the next attempt is due in"
                                    + " %.1fs",
                            consecutiveRefreshFailures,
                            nextRefreshAttemptAt - now));
        }
        try {
            refresh();
        } catch (final KeycloakAuthenticationException e) {
            recordRefreshFailure(e);
            // Re-read the clock: the failed attempt may itself have taken up to the HTTP timeout.
            if (clock.getAsDouble() < accessTokenExpiresAt) {
                return;
            }
            throw e;
        }
        recordRefreshSuccess();
    }

    /**
     * Counts a failure, schedules the next attempt from NOW (not from when the attempt started)
     * and logs ONE warning. Never a password grant.
     */
    private void recordRefreshFailure(final KeycloakAuthenticationException error) {
        final double now = clock.getAsDouble();
        consecutiveRefreshFailures++;
        final double delay = backoffDelaySeconds(consecutiveRefreshFailures, random, timings);
        nextRefreshAttemptAt = now + delay;
        final double remaining = accessTokenExpiresAt - now;
        final String validity =
                remaining > 0
                        ? String.format(
                                Locale.ROOT,
                                "the current access token stays valid for %.1fs",
                                remaining)
                        : "the current access token has expired";
        LOGGER.log(
                Level.WARNING,
                String.format(
                        Locale.ROOT,
                        "Keycloak token refresh failed (attempt %d); retrying in %.1fs, %s (%s)",
                        consecutiveRefreshFailures,
                        delay,
                        validity,
                        describe(error)));
    }

    private void recordRefreshSuccess() {
        if (consecutiveRefreshFailures > 0) {
            LOGGER.log(
                    Level.INFO,
                    "Keycloak token refresh recovered after "
                            + consecutiveRefreshFailures
                            + " failed attempt(s)");
        }
        consecutiveRefreshFailures = 0;
        nextRefreshAttemptAt = 0;
    }

    /**
     * Full jitter over a doubling window: uniform in {@code [base, min(base * 2^(n-1), max)]}.
     *
     * @param failures consecutive failures; below 1 counts as 1
     * @param random a fraction; clamped into {@code [0, 1]}, NaN counts as 0
     * @param timings the constants
     * @return seconds until the next attempt
     */
    static double backoffDelaySeconds(
            final int failures, final DoubleSupplier random, final KeycloakTimings timings) {
        final int exponent = Math.min(Math.max(failures, 1) - 1, MAX_RETRY_EXPONENT);
        final double ceiling =
                Math.min(timings.retryBaseDelayS * Math.pow(2, exponent), timings.retryMaxDelayS);
        final double drawn = random.getAsDouble();
        final double fraction = drawn >= 0.0 ? Math.min(drawn, 1.0) : 0.0;
        return timings.retryBaseDelayS + fraction * (ceiling - timings.retryBaseDelayS);
    }

    private void login() {
        final Map<String, String> form = new LinkedHashMap<>();
        form.put("grant_type", "password");
        form.put("client_id", clientId);
        form.put("username", username);
        form.put("password", password);
        form.put("scope", "offline_access");
        storeTokens(postTokenRequest(form, "login"));
    }

    private void refresh() {
        final Map<String, String> form = new LinkedHashMap<>();
        form.put("grant_type", "refresh_token");
        form.put("client_id", clientId);
        form.put("refresh_token", refreshToken);
        storeTokens(postTokenRequest(form, "refresh"));
    }

    /**
     * POSTs the form and returns the JSON object. Every failure is ONE exception type with the
     * underlying error as its cause.
     */
    private JsonObject postTokenRequest(final Map<String, String> form, final String action) {
        final int status;
        final String body;
        try {
            final TokenHttpResponse response =
                    transport.post(tokenEndpoint, form, timings.httpTimeoutS);
            status = response.statusCode();
            body = response.body();
        } catch (final IOException e) {
            throw new KeycloakAuthenticationException(
                    "Keycloak token "
                            + action
                            + " could not reach the token endpoint ("
                            + describe(e)
                            + ")",
                    e);
        } catch (final RuntimeException e) {
            throw new KeycloakAuthenticationException(
                    "Keycloak token " + action + " failed (" + describe(e) + ")", e);
        }
        if (status < 200 || status >= 300) {
            throw new KeycloakAuthenticationException(
                    "Keycloak token "
                            + action
                            + " failed with status "
                            + status
                            + ": "
                            + body.substring(0, Math.min(body.length(), MAX_ERROR_BODY_CHARS)));
        }
        final JsonElement parsed;
        try {
            parsed = parseStrictJson(body);
        } catch (final IOException | RuntimeException e) {
            throw new KeycloakAuthenticationException(
                    "Keycloak token "
                            + action
                            + " returned status "
                            + status
                            + " with a body that is not JSON",
                    e);
        }
        if (!parsed.isJsonObject()) {
            throw new KeycloakAuthenticationException(
                    "Keycloak token "
                            + action
                            + " returned a JSON "
                            + jsonTypeName(parsed)
                            + " instead of an object");
        }
        return parsed.getAsJsonObject();
    }

    /** One complete strict JSON document; trailing data or an empty body is an error. */
    static JsonElement parseStrictJson(final String body) throws IOException {
        final JsonReader reader = new JsonReader(new StringReader(body));
        final JsonElement element = JSON.read(reader);
        // The reader is strict, so anything but the end of input after the document makes peek()
        // throw ("Expected EOF") instead of returning another token.
        reader.peek();
        return element;
    }

    static String jsonTypeName(final JsonElement element) {
        if (element.isJsonArray()) {
            return "array";
        }
        if (element.isJsonNull()) {
            return "null";
        }
        final JsonPrimitive primitive = element.getAsJsonPrimitive();
        if (primitive.isString()) {
            return "string";
        }
        return primitive.isNumber() ? "number" : "boolean";
    }

    /** Validates EVERYTHING before assigning anything: a malformed response changes no state. */
    private void storeTokens(final JsonObject payload) {
        final String newAccessToken = nonEmptyString(payload.get("access_token"));
        if (newAccessToken == null) {
            // Field NAMES only: a token response is credential material.
            throw new KeycloakAuthenticationException(
                    "Keycloak token response did not contain an access_token; the response"
                            + " carried the fields "
                            + new TreeSet<>(payload.keySet())
                            + " (values withheld: a token response is credential material)");
        }
        final double expiresIn = expiresInSeconds(payload.get("expires_in"));
        accessToken = newAccessToken;
        final String rotated = nonEmptyString(payload.get("refresh_token"));
        if (rotated != null) {
            refreshToken = rotated;
        }
        accessTokenExpiresAt = clock.getAsDouble() + Math.max(expiresIn, 0.0);
    }

    private static String nonEmptyString(final JsonElement element) {
        if (element != null
                && element.isJsonPrimitive()
                && element.getAsJsonPrimitive().isString()
                && !element.getAsString().isEmpty()) {
            return element.getAsString();
        }
        return null;
    }

    /** Missing is 0; a number or a numeric string is accepted; anything else (NaN too) is not. */
    static double expiresInSeconds(final JsonElement element) {
        if (element == null) {
            return 0.0;
        }
        if (element.isJsonPrimitive() && !element.getAsJsonPrimitive().isBoolean()) {
            try {
                final double value = new BigDecimal(element.getAsString().trim()).doubleValue();
                if (!Double.isInfinite(value)) {
                    return value;
                }
            } catch (final NumberFormatException e) {
                // reported below, like every other non-numeric value
            }
        }
        throw new KeycloakAuthenticationException(
                "Keycloak token response carried a non-numeric expires_in (value withheld)");
    }

    /**
     * The background thread's body. It holds the provider WEAKLY and derefs it on every wake, so
     * an unreachable provider is collected and the loop ends. A failure never ends the loop.
     */
    static void refreshLoop(
            final WeakReference<KeycloakTokenProvider> reference,
            final StopSignal stopSignal,
            final DoubleSupplier clock) {
        while (!stopSignal.isSet()) {
            KeycloakTokenProvider provider = reference.get();
            if (provider == null) {
                return;
            }
            final double now = clock.getAsDouble();
            double delay;
            synchronized (provider.lock) {
                final Double deadline = provider.loginDeadline;
                if (deadline != null && now >= deadline) {
                    stopSignal.set(); // the window has closed: let the token lapse
                    return;
                }
                delay = provider.accessTokenExpiresAt - provider.timings.expiryLeewayS - now;
                if (provider.consecutiveRefreshFailures > 0) {
                    // A failed refresh leaves the expiry unchanged; wait for the backoff instead
                    // of retrying at the floor for the whole outage.
                    delay = provider.nextRefreshAttemptAt - now;
                }
                delay = Math.max(delay, provider.timings.minRefreshDelayS);
                if (deadline != null) {
                    delay = Math.min(delay, deadline - now);
                }
            }
            provider = null; // a long wait must not pin the provider
            try {
                if (stopSignal.await(delay)) {
                    return;
                }
            } catch (final InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            provider = reference.get();
            if (provider == null) {
                return;
            }
            try {
                synchronized (provider.lock) {
                    provider.refreshIfWithinWindow(clock.getAsDouble());
                }
            } catch (final RuntimeException e) {
                // Already recorded and warned once by recordRefreshFailure; never warn twice.
                LOGGER.log(Level.FINE, "Keycloak background refresh will be retried ({0})", describe(e));
            }
        }
    }

    private static Runnable refreshTask(
            final WeakReference<KeycloakTokenProvider> reference,
            final StopSignal stopSignal,
            final DoubleSupplier clock) {
        return () -> refreshLoop(reference, stopSignal, clock);
    }

    /** @return {@code <SimpleName>: <message>}, an absent message rendered empty */
    static String describe(final Throwable error) {
        final String message = error.getMessage();
        return error.getClass().getSimpleName() + ": " + (message == null ? "" : message);
    }

    static double monotonicSeconds() {
        return System.nanoTime() / 1_000_000_000.0;
    }

    private static String stripTrailingSlashes(final String url) {
        int end = url.length();
        while (end > 0 && url.charAt(end - 1) == '/') {
            end--;
        }
        return url.substring(0, end);
    }

    /** Reads the header on the call's executor, so a refresh never blocks a transport thread. */
    private static final class TokenCallCredentials extends CallCredentials {

        private final KeycloakTokenProvider provider;

        TokenCallCredentials(final KeycloakTokenProvider provider) {
            this.provider = provider;
        }

        @Override
        public void applyRequestMetadata(
                final RequestInfo requestInfo,
                final Executor appExecutor,
                final MetadataApplier applier) {
            appExecutor.execute(() -> apply(applier));
        }

        private void apply(final MetadataApplier applier) {
            final Metadata headers;
            try {
                headers = provider.toMetadata();
            } catch (final RuntimeException e) {
                applier.fail(Status.UNAUTHENTICATED.withDescription(e.getMessage()).withCause(e));
                return;
            }
            applier.apply(headers);
        }
    }
}
