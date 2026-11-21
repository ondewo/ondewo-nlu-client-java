package com.ondewo.nlu.auth;

import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleSupplier;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * The fakes of the Keycloak catalogue: a scripted token endpoint that records every form, a
 * scripted stop signal that drives the background loop on a fake clock, and a log capture. The
 * default script follows the catalogue: clock 1000, first token {@code acc-1} for 300 s.
 */
final class Fakes {

    static final String KEYCLOAK_URL = "https://keycloak.example/auth";
    static final String REALM = "ondewo-test-realm";
    static final String CLIENT_ID = "ondewo-test-sdk-public";
    static final String USERNAME = "technical-user@example.com";
    static final String PASSWORD = "pw-never-logged-5d1c";
    static final String TOKEN_URL =
            KEYCLOAK_URL + "/realms/" + REALM + "/protocol/openid-connect/token";

    private Fakes() {}

    // region responses

    static TokenHttpResponse token(final String access) {
        return token(access, 300, "off-x");
    }

    static TokenHttpResponse token(final String access, final Object expiresIn) {
        return token(access, expiresIn, "off-x");
    }

    /** A 200 token answer; {@code refresh} {@code null} leaves the refresh_token out. */
    static TokenHttpResponse token(final String access, final Object expiresIn, final String refresh) {
        final JsonObject body = new JsonObject();
        body.addProperty("access_token", access);
        if (expiresIn instanceof Number) {
            body.addProperty("expires_in", (Number) expiresIn);
        } else {
            body.addProperty("expires_in", (String) expiresIn);
        }
        if (refresh != null) {
            body.addProperty("refresh_token", refresh);
        }
        return new TokenHttpResponse(200, body.toString());
    }

    /** The dead offline session: HTTP 400 invalid_grant. */
    static TokenHttpResponse refused() {
        return refused(400, "{\"error\":\"invalid_grant\",\"error_description\":\"Offline user session not found\"}");
    }

    static TokenHttpResponse refused(final int status, final String body) {
        return new TokenHttpResponse(status, body);
    }

    static TokenHttpResponse unavailable() {
        return refused(503, "{\"error\":\"temporarily_unavailable\"}");
    }

    // endregion

    /** Replays scripted answers or throws scripted errors; the last step repeats. */
    static class FakeTransport implements TokenEndpoint {

        private final List<Object> steps;
        private final long delayMillis;
        final List<Map<String, String>> calls = new ArrayList<>();
        final List<String> urls = new ArrayList<>();
        final List<Double> timeouts = new ArrayList<>();

        FakeTransport(final Object... steps) {
            this(0L, Arrays.asList(steps));
        }

        private FakeTransport(final long delayMillis, final List<Object> steps) {
            this.steps = new ArrayList<>(steps);
            this.delayMillis = delayMillis;
        }

        /** Every answer is delayed by {@code delayMillis} of real time. */
        static FakeTransport delayed(final long delayMillis, final Object... steps) {
            return new FakeTransport(delayMillis, Arrays.asList(steps));
        }

        @Override
        public TokenHttpResponse post(
                final String url, final Map<String, String> form, final double timeoutSeconds)
                throws IOException {
            final Object step;
            synchronized (this) {
                calls.add(new LinkedHashMap<>(form));
                urls.add(url);
                timeouts.add(timeoutSeconds);
                step = steps.size() > 1 ? steps.remove(0) : steps.get(0);
            }
            beforeAnswer(form);
            if (delayMillis > 0) {
                try {
                    Thread.sleep(delayMillis);
                } catch (final InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (step instanceof IOException) {
                throw (IOException) step;
            }
            if (step instanceof RuntimeException) {
                throw (RuntimeException) step;
            }
            return (TokenHttpResponse) step;
        }

        /** A hook for subclasses, e.g. to advance a fake clock while the request "hangs". */
        void beforeAnswer(final Map<String, String> form) {}

        synchronized List<String> grants() {
            final List<String> grants = new ArrayList<>();
            for (final Map<String, String> call : calls) {
                grants.add(call.get("grant_type"));
            }
            return grants;
        }
    }

    /** A controllable monotonic clock. */
    static final class FakeClock implements DoubleSupplier {

        double now;

        FakeClock(final double start) {
            this.now = start;
        }

        @Override
        public double getAsDouble() {
            return now;
        }
    }

    /**
     * The stand-in of the production latch: {@code await} records the delay, advances the clock by
     * it (or by a scripted amount) and replays a scripted result - {@code true} = stop fired,
     * {@code false} = timed out, i.e. refresh. An exhausted script stops, so no test sleeps.
     */
    static final class ScriptedStop implements StopSignal {

        private final List<Boolean> results;
        private final FakeClock clock;
        private final List<Double> advanceBy;
        private boolean set;
        boolean interruptNext;
        final List<Double> waits = new ArrayList<>();

        ScriptedStop(final FakeClock clock, final Boolean... results) {
            this(clock, null, results);
        }

        ScriptedStop(final FakeClock clock, final List<Double> advanceBy, final Boolean... results) {
            this.clock = clock;
            this.results = new ArrayList<>(Arrays.asList(results));
            this.advanceBy = advanceBy == null ? null : new ArrayList<>(advanceBy);
        }

        static ScriptedStop timeouts(final FakeClock clock, final int count) {
            final Boolean[] results = new Boolean[count];
            Arrays.fill(results, Boolean.FALSE);
            return new ScriptedStop(clock, results);
        }

        @Override
        public boolean isSet() {
            return set;
        }

        @Override
        public void set() {
            set = true;
        }

        @Override
        public boolean await(final double seconds) throws InterruptedException {
            waits.add(seconds);
            if (interruptNext) {
                throw new InterruptedException("scripted interrupt");
            }
            if (advanceBy != null && !advanceBy.isEmpty()) {
                clock.now += advanceBy.remove(0);
            } else {
                clock.now += seconds;
            }
            if (results.isEmpty()) {
                set = true;
                return true;
            }
            final boolean result = results.remove(0);
            set = set || result;
            return result;
        }
    }

    /** Every record of the provider's logger, rendered as {@code LEVEL message}. */
    static final class LogCapture extends Handler implements AutoCloseable {

        private final Logger logger = Logger.getLogger(KeycloakTokenProvider.class.getName());
        private final Level previous;
        final List<String> records = new ArrayList<>();

        LogCapture() {
            previous = logger.getLevel();
            logger.setLevel(Level.ALL);
            setLevel(Level.ALL);
            logger.addHandler(this);
        }

        @Override
        public synchronized void publish(final LogRecord record) {
            String message = record.getMessage();
            final Object[] parameters = record.getParameters();
            if (parameters != null) {
                message = java.text.MessageFormat.format(message, parameters);
            }
            records.add(record.getLevel().getName() + " " + message);
        }

        synchronized String rendered() {
            return String.join("\n", records);
        }

        synchronized long count(final String level, final String fragment) {
            return records.stream()
                    .filter(line -> line.startsWith(level + " ") && line.contains(fragment))
                    .count();
        }

        @Override
        public void flush() {}

        @Override
        public void close() {
            logger.removeHandler(this);
            logger.setLevel(previous);
        }
    }

    static KeycloakCredentials credentials(final String password, final String refreshToken) {
        return credentials(password, refreshToken, null);
    }

    static KeycloakCredentials credentials(
            final String password, final String refreshToken, final Integer tokenExpirationInS) {
        return new KeycloakCredentials(
                KEYCLOAK_URL,
                REALM,
                CLIENT_ID,
                USERNAME,
                password,
                tokenExpirationInS,
                true,
                refreshToken);
    }

    /** A logged-in password provider on a fake clock with a fixed jitter and no thread. */
    static KeycloakTokenProvider build(
            final FakeTransport transport,
            final FakeClock clock,
            final StopSignal stop,
            final double jitter,
            final Integer tokenExpirationInS) {
        return new KeycloakTokenProvider(
                credentials(PASSWORD, "", tokenExpirationInS),
                transport,
                clock,
                () -> jitter,
                stop == null ? new StopSignal.Latch() : stop,
                false,
                KeycloakTimings.DEFAULTS);
    }

    static KeycloakTokenProvider build(final FakeTransport transport, final FakeClock clock) {
        return build(transport, clock, null, 0.0, null);
    }

    static void runLoop(final KeycloakTokenProvider provider, final StopSignal stop, final FakeClock clock) {
        KeycloakTokenProvider.refreshLoop(new java.lang.ref.WeakReference<>(provider), stop, clock);
    }
}
