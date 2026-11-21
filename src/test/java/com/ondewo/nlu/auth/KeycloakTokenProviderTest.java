package com.ondewo.nlu.auth;

import static com.ondewo.nlu.auth.Fakes.CLIENT_ID;
import static com.ondewo.nlu.auth.Fakes.KEYCLOAK_URL;
import static com.ondewo.nlu.auth.Fakes.PASSWORD;
import static com.ondewo.nlu.auth.Fakes.REALM;
import static com.ondewo.nlu.auth.Fakes.TOKEN_URL;
import static com.ondewo.nlu.auth.Fakes.USERNAME;
import static com.ondewo.nlu.auth.Fakes.build;
import static com.ondewo.nlu.auth.Fakes.credentials;
import static com.ondewo.nlu.auth.Fakes.refused;
import static com.ondewo.nlu.auth.Fakes.runLoop;
import static com.ondewo.nlu.auth.Fakes.token;
import static com.ondewo.nlu.auth.Fakes.unavailable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.gson.JsonParser;
import com.ondewo.nlu.auth.Fakes.FakeClock;
import com.ondewo.nlu.auth.Fakes.FakeTransport;
import com.ondewo.nlu.auth.Fakes.LogCapture;
import com.ondewo.nlu.auth.Fakes.ScriptedStop;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.ConnectException;
import java.net.http.HttpTimeoutException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * The cross-SDK Keycloak test catalogue (T01-T47) against {@link KeycloakTokenProvider}: a fake
 * token endpoint, a fake monotonic clock, a fixed jitter and a scripted stop signal, so no test
 * touches a network or sleeps for real (T26 and T41 use the real clock on purpose).
 */
class KeycloakTokenProviderTest {

    private static final KeycloakTimings T = KeycloakTimings.DEFAULTS;

    private static double backoff(final int failures, final double fraction) {
        return KeycloakTokenProvider.backoffDelaySeconds(failures, () -> fraction, T);
    }

    @Nested
    class TheBackoffLadder {

        @Test
        void t01TheCeilingDoublesFromTheBaseAndStopsAtTheMaximum() {
            final List<Double> delays =
                    IntStream.rangeClosed(1, 10).mapToObj(n -> backoff(n, 1.0)).collect(Collectors.toList());
            assertEquals(Arrays.asList(5.0, 10.0, 20.0, 40.0, 80.0, 160.0, 300.0, 300.0, 300.0, 300.0), delays);
        }

        @Test
        void t02AZeroFractionAlwaysWaitsTheBase() {
            final Set<Double> delays =
                    IntStream.range(1, 20).mapToObj(n -> backoff(n, 0.0)).collect(Collectors.toSet());
            assertEquals(Collections.singleton(5.0), delays);
        }

        @Test
        void t03TheDelayIsDrawnInsideTheWindow() {
            assertEquals(7.5, backoff(2, 0.5));
            assertEquals(8.75, backoff(3, 0.25));
        }

        @ParameterizedTest
        @ValueSource(doubles = {-1.0, -0.001, 1.5, 1e9, Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY})
        void t04AFaultyJitterSourceIsClampedIntoTheWindow(final double fraction) {
            final double delay = backoff(4, fraction);
            assertTrue(delay >= 5.0 && delay <= 40.0, "delay " + delay);
        }

        @ParameterizedTest
        @ValueSource(ints = {0, -3, Integer.MIN_VALUE})
        void t05ANonPositiveFailureCountIsTheFirstFailure(final int failures) {
            assertEquals(5.0, backoff(failures, 1.0));
        }

        @Test
        void theExponentCapComesFromTheTimingsNotTheConstant() {
            final KeycloakTimings capped = new KeycloakTimings(30, 1, 5, 1e9, 10, 5, 2);
            assertEquals(20.0, KeycloakTokenProvider.backoffDelaySeconds(3, () -> 1.0, capped));
            assertEquals(20.0, KeycloakTokenProvider.backoffDelaySeconds(50, () -> 1.0, capped));
            final KeycloakTimings uncapped = new KeycloakTimings(30, 1, 5, 1e9, 10, 5, 0);
            assertEquals(5.0, KeycloakTokenProvider.backoffDelaySeconds(9, () -> 1.0, uncapped));
            final KeycloakTimings negative = new KeycloakTimings(30, 1, 5, 1e9, 10, 5, -4);
            assertEquals(5.0, KeycloakTokenProvider.backoffDelaySeconds(9, () -> 1.0, negative));
            assertEquals(KeycloakTokenProvider.MAX_RETRY_EXPONENT, T.maxRetryExponent);
            assertEquals(
                    KeycloakTokenProvider.MAX_RETRY_EXPONENT, new KeycloakTimings(30, 1, 5, 300, 10, 5).maxRetryExponent);
        }

        @Test
        void t06AHugeFailureCountNeitherOverflowsNorExceedsTheCeiling() {
            assertEquals(300.0, backoff(1_000_000_000, 1.0));
            assertEquals(300.0, backoff(Integer.MAX_VALUE, 1.0));
        }

        @Test
        void t07TheConstantsKeepTheirDocumentedValuesAndRelations() {
            assertEquals(30.0, KeycloakTokenProvider.EXPIRY_LEEWAY_S);
            assertEquals(1.0, KeycloakTokenProvider.MIN_REFRESH_DELAY_S);
            assertEquals(5.0, KeycloakTokenProvider.RETRY_BASE_DELAY_S);
            assertEquals(300.0, KeycloakTokenProvider.RETRY_MAX_DELAY_S);
            assertEquals(6, KeycloakTokenProvider.MAX_RETRY_EXPONENT);
            assertEquals(10.0, KeycloakTokenProvider.HTTP_TIMEOUT_S);
            assertEquals(500, KeycloakTokenProvider.MAX_ERROR_BODY_CHARS);
            assertEquals(5.0, KeycloakTokenProvider.THREAD_JOIN_TIMEOUT_S);
            assertTrue(T.retryBaseDelayS > T.minRefreshDelayS);
            assertTrue(T.retryBaseDelayS * Math.pow(2, KeycloakTokenProvider.MAX_RETRY_EXPONENT) >= T.retryMaxDelayS);
            assertTrue(T.httpTimeoutS < T.expiryLeewayS);
            assertEquals(KeycloakTokenProvider.EXPIRY_LEEWAY_S, T.expiryLeewayS);
            assertEquals(KeycloakTokenProvider.MIN_REFRESH_DELAY_S, T.minRefreshDelayS);
            assertEquals(KeycloakTokenProvider.RETRY_MAX_DELAY_S, T.retryMaxDelayS);
            assertEquals(KeycloakTokenProvider.HTTP_TIMEOUT_S, T.httpTimeoutS);
            assertEquals(KeycloakTokenProvider.THREAD_JOIN_TIMEOUT_S, T.threadJoinTimeoutS);
        }
    }

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class TheBackgroundLoopSurvivesEveryFailure {

        @Test
        void t08ARefusedRefreshIsRetriedAndTheProviderRecovers() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1"), refused(), token("acc-3"));
            final ScriptedStop stop = new ScriptedStop(clock, false, false);
            final KeycloakTokenProvider provider = build(transport, clock, stop, 0.0, null);

            runLoop(provider, stop, clock);

            assertEquals(Arrays.asList("password", "refresh_token", "refresh_token"), transport.grants());
            assertEquals("acc-3", provider.getAccessToken());
            assertEquals(0, provider.consecutiveRefreshFailures);
        }

        Stream<Arguments> failures() {
            return Stream.of(
                    Arguments.of("network", new IOException("network unreachable")),
                    Arguments.of("connection-refused", new ConnectException("connection refused")),
                    Arguments.of("timeout", new HttpTimeoutException("read timed out")),
                    Arguments.of("runtime-bug", new IllegalStateException("a bug in a custom transport")),
                    Arguments.of("null-response", null),
                    Arguments.of("503", unavailable()),
                    Arguments.of("502-empty", refused(502, "")),
                    Arguments.of("non-json-200", refused(200, "<html>bad gateway</html>")),
                    Arguments.of("empty-200", refused(200, "")),
                    Arguments.of("trailing-data-200", refused(200, "{\"access_token\":\"a\"} trailing")),
                    Arguments.of("json-array", refused(200, "[\"not\",\"an\",\"object\"]")),
                    Arguments.of("no-access-token", refused(200, "{\"expires_in\":300}")),
                    Arguments.of("bad-expires-in", refused(200, "{\"access_token\":\"acc\",\"expires_in\":\"soon\"}")));
        }

        @ParameterizedTest(name = "t09 {0}")
        @MethodSource("failures")
        void t09NoKindOfFailureEndsTheLoop(final String name, final Object failure) {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1"), failure, token("acc-ok"));
            final ScriptedStop stop = new ScriptedStop(clock, false, false);
            final KeycloakTokenProvider provider = build(transport, clock, stop, 0.0, null);

            runLoop(provider, stop, clock);

            assertEquals(3, transport.calls.size(), "the loop stopped at the failure");
            assertEquals("acc-ok", provider.getAccessToken());
        }

        @Test
        void t10APersistentFailureKeepsTheLoopAliveWithoutRepairingTheProvider() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1"), refused());
            final ScriptedStop stop = ScriptedStop.timeouts(clock, 6);
            final KeycloakTokenProvider provider = build(transport, clock, stop, 0.0, null);

            runLoop(provider, stop, clock);

            final List<String> expected = new ArrayList<>(Collections.singletonList("password"));
            expected.addAll(Collections.nCopies(6, "refresh_token"));
            assertEquals(expected, transport.grants());
            assertEquals("acc-1", provider.getAccessToken());
            assertEquals(6, provider.consecutiveRefreshFailures);
        }

        @Test
        void t11NoFailureIsEverAnsweredWithAPasswordGrant() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport =
                    new FakeTransport(token("acc-1"), refused(401, "{\"error\":\"invalid_client\"}"));
            final ScriptedStop stop = ScriptedStop.timeouts(clock, 10);
            runLoop(build(transport, clock, stop, 0.0, null), stop, clock);

            assertEquals(1, Collections.frequency(transport.grants(), "password"));
        }
    }

    @Nested
    class TheBackgroundLoopBacksOff {

        @Test
        void t12TheFirstRetryWaitsTheBaseNotTheFloor() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1"), unavailable(), token("acc-2"));
            final ScriptedStop stop = new ScriptedStop(clock, false, false);
            runLoop(build(transport, clock, stop, 0.0, null), stop, clock);

            assertEquals(270.0, stop.waits.get(0));
            assertEquals(5.0, stop.waits.get(1));
        }

        @Test
        void t13ConsecutiveFailuresClimbTheLadderToTheCeiling() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1"), unavailable());
            final ScriptedStop stop = ScriptedStop.timeouts(clock, 9);
            runLoop(build(transport, clock, stop, 1.0, null), stop, clock);

            assertEquals(
                    Arrays.asList(5.0, 10.0, 20.0, 40.0, 80.0, 160.0, 300.0, 300.0, 300.0),
                    stop.waits.subList(1, stop.waits.size()));
        }

        @Test
        void t14ASuccessResetsTheLadderToTheHealthySchedule() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport =
                    new FakeTransport(token("acc-1"), unavailable(), unavailable(), token("acc-4", 120), unavailable());
            final ScriptedStop stop = ScriptedStop.timeouts(clock, 4);
            try (LogCapture logs = new LogCapture()) {
                runLoop(build(transport, clock, stop, 1.0, null), stop, clock);

                assertEquals(Arrays.asList(270.0, 5.0, 10.0, 90.0, 5.0), stop.waits);
                assertEquals(1, logs.count("INFO", "recovered after 2 failed attempt(s)"));
            }
        }

        @Test
        void t15TheBackoffIsMeasuredFromWhenTheFailureWasRecorded() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport =
                    new FakeTransport(token("acc-1"), unavailable()) {
                        @Override
                        void beforeAnswer(final Map<String, String> form) {
                            if ("refresh_token".equals(form.get("grant_type"))) {
                                clock.now += KeycloakTokenProvider.HTTP_TIMEOUT_S;
                            }
                        }
                    };
            final ScriptedStop stop = new ScriptedStop(clock, false, false);
            runLoop(build(transport, clock, stop, 0.0, null), stop, clock);

            assertEquals(5.0, stop.waits.get(1));
        }

        @Test
        void t16TheLoginDeadlineStillEndsTheLoopWhileItBacksOff() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1", 30), unavailable());
            final ScriptedStop stop = ScriptedStop.timeouts(clock, 50);
            runLoop(build(transport, clock, stop, 1.0, 100), stop, clock);

            assertTrue(clock.now <= 1000 + 100 + KeycloakTokenProvider.MIN_REFRESH_DELAY_S, "clock " + clock.now);
            assertTrue(stop.isSet(), "the loop did not stop at the deadline");
            assertTrue(stop.waits.stream().allMatch(delay -> delay <= 100.0), stop.waits.toString());
        }

        @Test
        void t17StopDuringABackoffWaitEndsTheLoopWithoutAnotherRequest() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1"), unavailable());
            final ScriptedStop stop = new ScriptedStop(clock, Arrays.asList(270.0, 1.0), false, true);
            runLoop(build(transport, clock, stop, 0.0, null), stop, clock);

            assertEquals(Arrays.asList("password", "refresh_token"), transport.grants());
        }

        @Test
        void t18ACollectedProviderEndsTheLoopBeforeAndAfterAWait() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1"));
            final ScriptedStop stop = ScriptedStop.timeouts(clock, 3);
            final KeycloakTokenProvider provider = build(transport, clock, stop, 0.0, null);

            final WeakReference<KeycloakTokenProvider> gone = new WeakReference<>(provider);
            gone.clear();
            KeycloakTokenProvider.refreshLoop(gone, stop, clock);
            assertTrue(stop.waits.isEmpty());

            final WeakReference<KeycloakTokenProvider> goneDuringTheWait =
                    new WeakReference<KeycloakTokenProvider>(provider) {
                        private int reads;

                        @Override
                        public KeycloakTokenProvider get() {
                            return reads++ == 0 ? super.get() : null;
                        }
                    };
            KeycloakTokenProvider.refreshLoop(goneDuringTheWait, stop, clock);

            assertEquals(1, stop.waits.size());
            assertEquals(1, transport.calls.size(), "a collected provider was refreshed");
        }

        @Test
        void t18AClosedProviderEndsTheLoopWithoutARequest() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1"));
            final ScriptedStop stop = ScriptedStop.timeouts(clock, 3);
            final KeycloakTokenProvider provider = build(transport, clock, stop, 0.0, null);
            provider.close();

            runLoop(provider, stop, clock);

            assertTrue(provider.isClosed());
            assertTrue(stop.waits.isEmpty());
            assertEquals(1, transport.calls.size());
        }

        @Test
        void anInterruptedWaitEndsTheLoopAndKeepsTheInterruptFlag() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1"));
            final ScriptedStop stop = ScriptedStop.timeouts(clock, 3);
            stop.interruptNext = true;
            try {
                runLoop(build(transport, clock, stop, 0.0, null), stop, clock);
                assertTrue(Thread.currentThread().isInterrupted());
            } finally {
                Thread.interrupted();
            }
            assertEquals(1, transport.calls.size());
        }

        @Test
        void aTinyExpiryWaitsTheFloorNotZero() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1", 0), token("acc-2", 300));
            final ScriptedStop stop = new ScriptedStop(clock, false);
            runLoop(build(transport, clock, stop, 0.0, null), stop, clock);

            assertEquals(1.0, stop.waits.get(0));
            assertEquals(270.0, stop.waits.get(1));
        }

        @Test
        void aFarDeadlineDoesNotShortenTheHealthyWait() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1"));
            final ScriptedStop stop = new ScriptedStop(clock);
            runLoop(build(transport, clock, stop, 0.0, 10_000), stop, clock);

            assertEquals(Collections.singletonList(270.0), stop.waits);
        }
    }

    @Nested
    class TheLazyPathHonoursTheBackoff {

        @Test
        void t19AStillValidTokenIsServedWhenItsRefreshFails() {
            final FakeClock clock = new FakeClock(1000);
            final KeycloakTokenProvider provider = build(new FakeTransport(token("acc-1"), unavailable()), clock);
            clock.now += 300 - 30 + 1;
            try (LogCapture logs = new LogCapture()) {
                assertEquals("Bearer acc-1", provider.authorizationHeaderValue());
                assertEquals(1, logs.count("WARNING", "refresh failed (attempt 1)"));
                assertEquals(1, logs.count("WARNING", "stays valid for 29.0s"));
            }
        }

        @Test
        void t20NoRequestIsSentWhileTheBackoffRuns() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1"), unavailable());
            final KeycloakTokenProvider provider = build(transport, clock);
            clock.now += 275;
            for (int i = 0; i < 100; i++) {
                provider.authorizationHeaderValue();
                clock.now += 0.04;
            }
            assertEquals(Arrays.asList("password", "refresh_token"), transport.grants());
        }

        @Test
        void t21AnExpiredTokenRaisesDuringTheBackoffWithoutARequest() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1"), unavailable());
            final KeycloakTokenProvider provider = build(transport, clock, null, 1.0, null);
            clock.now += 299;
            provider.authorizationHeaderValue();
            clock.now += 2;

            final KeycloakAuthenticationException raised =
                    assertThrows(KeycloakAuthenticationException.class, provider::authorizationHeaderValue);
            assertTrue(raised.getMessage().contains("backing off after 1 consecutive failure"), raised.getMessage());
            assertTrue(raised.getMessage().endsWith("the next attempt is due in 3.0s"), raised.getMessage());
            assertEquals(2, transport.calls.size());
        }

        @Test
        void t22AnExpiredTokenWhoseRefreshFailsRaises() {
            final FakeClock clock = new FakeClock(1000);
            final KeycloakTokenProvider provider = build(new FakeTransport(token("acc-1"), refused()), clock);
            clock.now += 400;
            try (LogCapture logs = new LogCapture()) {
                final KeycloakAuthenticationException raised =
                        assertThrows(KeycloakAuthenticationException.class, provider::authorizationHeaderValue);
                assertTrue(raised.getMessage().contains("status 400"), raised.getMessage());
                assertEquals(1, logs.count("WARNING", "the current access token has expired"));
            }
        }

        @Test
        void t23ANonKeycloakErrorReachesTheCallerAsAKeycloakErrorWithItsCause() {
            final FakeClock clock = new FakeClock(1000);
            final IllegalStateException bug = new IllegalStateException("transport bug");
            final KeycloakTokenProvider provider = build(new FakeTransport(token("acc-1"), bug), clock);
            clock.now += 400;

            final KeycloakAuthenticationException raised =
                    assertThrows(KeycloakAuthenticationException.class, provider::authorizationHeaderValue);
            assertSame(bug, raised.getCause());
            assertEquals("Keycloak token refresh failed (IllegalStateException: transport bug)", raised.getMessage());
        }

        @Test
        void t24TheLazyPathRetriesOnceTheBackoffElapsesAndRecovers() {
            final FakeClock clock = new FakeClock(1000);
            final KeycloakTokenProvider provider =
                    build(new FakeTransport(token("acc-1"), unavailable(), token("acc-3")), clock);
            clock.now += 280;
            provider.authorizationHeaderValue();
            clock.now += 5;
            try (LogCapture logs = new LogCapture()) {
                assertEquals("Bearer acc-3", provider.authorizationHeaderValue());
                assertEquals(0, provider.consecutiveRefreshFailures);
                assertEquals(1, logs.count("INFO", "recovered after 1 failed attempt"));
            }
        }

        @Test
        void t25ALazyFailureSchedulesTheBackgroundLoopsNextWake() {
            final FakeClock clock = new FakeClock(1000);
            final ScriptedStop stop = new ScriptedStop(clock, false);
            final KeycloakTokenProvider provider =
                    build(new FakeTransport(token("acc-1"), unavailable(), token("acc-3")), clock, stop, 1.0, null);
            clock.now += 280;
            provider.authorizationHeaderValue();
            clock.now += 2;

            runLoop(provider, stop, clock);

            assertEquals(3.0, stop.waits.get(0), 1e-9);
            assertEquals("acc-3", provider.getAccessToken());
        }

        @Test
        void t26ConcurrentCallsDuringAnOutageSendOneRequestAndNeverRaise() throws Exception {
            final FakeTransport transport =
                    FakeTransport.delayed(50, token("acc-1", 20), new IOException("down"));
            final KeycloakTokenProvider provider =
                    new KeycloakTokenProvider(
                            credentials(PASSWORD, ""),
                            transport,
                            KeycloakTokenProvider::monotonicSeconds,
                            () -> 0.0,
                            new StopSignal.Latch(),
                            false,
                            T);
            final List<String> values = Collections.synchronizedList(new ArrayList<>());
            final List<Throwable> errors = Collections.synchronizedList(new ArrayList<>());
            final CountDownLatch start = new CountDownLatch(1);
            final List<Thread> threads = new ArrayList<>();
            for (int t = 0; t < 16; t++) {
                final Thread thread =
                        new Thread(
                                () -> {
                                    try {
                                        start.await();
                                        for (int i = 0; i < 20; i++) {
                                            values.add(provider.authorizationHeaderValue());
                                        }
                                    } catch (final Throwable e) {
                                        errors.add(e);
                                    }
                                });
                threads.add(thread);
                thread.start();
            }
            start.countDown();
            for (final Thread thread : threads) {
                thread.join(30_000);
            }

            assertTrue(errors.isEmpty(), "calls failed while the token was still valid: " + errors);
            assertEquals(320, values.size());
            assertEquals(Collections.singleton("Bearer acc-1"), Set.copyOf(values));
            assertEquals(Arrays.asList("password", "refresh_token"), transport.grants());
        }

        @Test
        void aTokenOutsideTheLeewayIsServedWithoutARequest() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1"));
            final KeycloakTokenProvider provider = build(transport, clock);
            clock.now += 269;

            assertEquals("Bearer acc-1", provider.authorizationHeaderValue());
            assertEquals("Bearer acc-1", provider.toMetadata().get(io.grpc.Metadata.Key.of("authorization", io.grpc.Metadata.ASCII_STRING_MARSHALLER)));
            assertEquals(1, transport.calls.size());
        }

        @Test
        void afterTheDeadlineTheTokenLapsesWithoutARequestOrAnError() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1"), token("acc-2"));
            final KeycloakTokenProvider provider = build(transport, clock, null, 0.0, 100);
            clock.now += 400;

            assertEquals("Bearer acc-1", provider.authorizationHeaderValue());
            assertEquals(1, transport.calls.size());
        }

        @Test
        void beforeTheDeadlineTheLazyPathStillRefreshes() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1"), token("acc-2"));
            final KeycloakTokenProvider provider = build(transport, clock, null, 0.0, 1000);
            clock.now += 280;

            assertEquals("Bearer acc-2", provider.authorizationHeaderValue());
        }
    }

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class TheTokenEndpointAnswerIsValidated {

        Stream<Arguments> networkFailures() {
            return Stream.of(
                    Arguments.of(new IOException("unreachable")),
                    Arguments.of(new ConnectException("refused")),
                    Arguments.of(new HttpTimeoutException("timed out")),
                    Arguments.of(new IOException()));
        }

        @ParameterizedTest
        @MethodSource("networkFailures")
        void t27ANetworkFailureAtLoginIsAKeycloakErrorWithItsCause(final IOException failure) {
            final KeycloakAuthenticationException raised =
                    assertThrows(
                            KeycloakAuthenticationException.class,
                            () -> build(new FakeTransport(failure), new FakeClock(0)));
            assertTrue(raised.getMessage().startsWith("Keycloak token login could not reach the token endpoint ("), raised.getMessage());
            assertTrue(raised.getMessage().contains(failure.getClass().getSimpleName() + ": "), raised.getMessage());
            assertSame(failure, raised.getCause());
        }

        @Test
        void aTransportBugAtLoginIsWrappedToo() {
            final RuntimeException bug = new UnsupportedOperationException("bug");
            final KeycloakAuthenticationException raised =
                    assertThrows(KeycloakAuthenticationException.class, () -> build(new FakeTransport(bug), new FakeClock(0)));
            assertEquals("Keycloak token login failed (UnsupportedOperationException: bug)", raised.getMessage());
            assertSame(bug, raised.getCause());
        }

        @ParameterizedTest
        @ValueSource(strings = {"<html>bad gateway</html>", "", "{\"access_token\":\"a\"} x", "{'access_token':'a'}", "nope"})
        void t28ABodyThatIsNotStrictJsonIsAKeycloakError(final String body) {
            final KeycloakAuthenticationException raised =
                    assertThrows(
                            KeycloakAuthenticationException.class,
                            () -> build(new FakeTransport(refused(200, body)), new FakeClock(0)));
            assertEquals("Keycloak token login returned status 200 with a body that is not JSON", raised.getMessage());
            assertNotNull(raised.getCause());
        }

        @ParameterizedTest
        @ValueSource(strings = {"[\"access_token\"]=array", "\"text\"=string", "42=number", "true=boolean", "null=null"})
        void t29AJsonBodyThatIsNotAnObjectIsAKeycloakError(final String bodyAndType) {
            final String[] parts = bodyAndType.split("=");
            final KeycloakAuthenticationException raised =
                    assertThrows(
                            KeycloakAuthenticationException.class,
                            () -> build(new FakeTransport(refused(200, parts[0])), new FakeClock(0)));
            assertEquals("Keycloak token login returned a JSON " + parts[1] + " instead of an object", raised.getMessage());
        }

        @Test
        void t30AHugeErrorPageIsTruncatedInTheMessage() {
            final StringBuilder page = new StringBuilder("<html>");
            for (int i = 0; i < 10_000; i++) {
                page.append('x');
            }
            final KeycloakAuthenticationException raised =
                    assertThrows(
                            KeycloakAuthenticationException.class,
                            () -> build(new FakeTransport(refused(502, page + "</html>")), new FakeClock(0)));
            assertTrue(raised.getMessage().length() < KeycloakTokenProvider.MAX_ERROR_BODY_CHARS + 200);
            assertTrue(raised.getMessage().startsWith("Keycloak token login failed with status 502: <html>xxx"));
        }

        @Test
        void aNullBodyIsReadAsEmpty() {
            final KeycloakAuthenticationException raised =
                    assertThrows(
                            KeycloakAuthenticationException.class,
                            () -> build(new FakeTransport(refused(500, null)), new FakeClock(0)));
            assertEquals("Keycloak token login failed with status 500: ", raised.getMessage());
        }

        @ParameterizedTest
        @ValueSource(ints = {199, 300, 302, 400, 401, 403, 500})
        void everyStatusOutside2xxIsRefused(final int status) {
            final KeycloakAuthenticationException raised =
                    assertThrows(
                            KeycloakAuthenticationException.class,
                            () -> build(new FakeTransport(refused(status, "{}")), new FakeClock(0)));
            assertEquals("Keycloak token login failed with status " + status + ": {}", raised.getMessage());
        }

        @Test
        void aNon200SuccessStatusIsAccepted() {
            final FakeTransport transport = new FakeTransport(new TokenHttpResponse(201, token("acc-1").body()));
            assertEquals("acc-1", build(transport, new FakeClock(0)).getAccessToken());
        }

        @ParameterizedTest
        @ValueSource(
                strings = {
                    "{\"refresh_token\":\"secret-offline-token-77\",\"expires_in\":300}",
                    "{\"access_token\":\"\",\"refresh_token\":\"secret-offline-token-77\"}",
                    "{\"access_token\":7,\"refresh_token\":\"secret-offline-token-77\"}",
                    "{\"access_token\":{\"v\":\"secret-offline-token-77\"},\"refresh_token\":\"x\"}",
                    "{\"access_token\":null,\"refresh_token\":\"secret-offline-token-77\"}"
                })
        void t31AResponseWithoutAnAccessTokenNamesFieldsNeverValues(final String body) {
            final KeycloakAuthenticationException raised =
                    assertThrows(
                            KeycloakAuthenticationException.class,
                            () -> build(new FakeTransport(refused(200, body)), new FakeClock(0)));
            assertTrue(raised.getMessage().contains("refresh_token"), raised.getMessage());
            assertFalse(raised.getMessage().contains("secret-offline-token-77"), raised.getMessage());
            assertTrue(raised.getMessage().startsWith("Keycloak token response did not contain an access_token; the response carried the fields ["));
            assertTrue(raised.getMessage().endsWith("] (values withheld: a token response is credential material)"));
        }

        @Test
        void theFieldNamesAreSorted() {
            final KeycloakAuthenticationException raised =
                    assertThrows(
                            KeycloakAuthenticationException.class,
                            () -> build(new FakeTransport(refused(200, "{\"z\":1,\"expires_in\":2,\"a\":3}")), new FakeClock(0)));
            assertTrue(raised.getMessage().contains("['a', 'expires_in', 'z']"), raised.getMessage());
        }

        @Test
        void s1FieldNamesAreQuotedAsPythonReprQuotesThem() {
            assertEquals("[]", KeycloakTokenProvider.pythonListOfNames(Collections.emptyList()));
            assertEquals("['a', 'b']", KeycloakTokenProvider.pythonListOfNames(Arrays.asList("b", "a")));
            assertEquals("[\"it's\"]", KeycloakTokenProvider.pythonListOfNames(Collections.singletonList("it's")));
            assertEquals("['a\\'\"b']", KeycloakTokenProvider.pythonListOfNames(Collections.singletonList("a'\"b")));
            assertEquals(
                    "['c\\x01', 'd\\x7f', 'n\\n', 'r\\r', 't\\t', 'x\\\\y']",
                    KeycloakTokenProvider.pythonListOfNames(
                            Arrays.asList("x\\y", "n\n", "t\t", "c\u0001", "r\r", "d\u007f")));
        }

        @Test
        void t32ANonNumericExpiresInLeavesThePreviousTokenUntouched() {
            final FakeClock clock = new FakeClock(1000);
            final KeycloakTokenProvider provider =
                    build(new FakeTransport(token("acc-1"), refused(200, "{\"access_token\":\"acc-bad\",\"expires_in\":\"soon\",\"refresh_token\":\"off-bad\"}"), token("acc-2")), clock);
            clock.now += 280;
            provider.authorizationHeaderValue();

            assertEquals("acc-1", provider.getAccessToken());
            assertEquals(1300.0, provider.accessTokenExpiresAt);
        }

        @ParameterizedTest
        @ValueSource(strings = {"\"soon\"", "true", "false", "null", "[300]", "{\"s\":300}", "\"1e400\"", "1e400", "\"NaN\"", "\"Infinity\"", "\"\"", "\"300d\""})
        void everyNonNumericExpiresInIsRefused(final String expiresIn) {
            final KeycloakAuthenticationException raised =
                    assertThrows(
                            KeycloakAuthenticationException.class,
                            () -> build(new FakeTransport(refused(200, "{\"access_token\":\"a\",\"expires_in\":" + expiresIn + "}")), new FakeClock(0)));
            assertEquals("Keycloak token response carried a non-numeric expires_in (value withheld)", raised.getMessage());
        }

        @Test
        void t33ANumericStringExpiresInIsAccepted() {
            assertEquals(1300.0, build(new FakeTransport(token("acc-1", "300")), new FakeClock(1000)).accessTokenExpiresAt);
            assertEquals(1300.5, build(new FakeTransport(token("acc-1", " 300.5 ")), new FakeClock(1000)).accessTokenExpiresAt);
            assertEquals(1300.0, build(new FakeTransport(token("acc-1", 3e2)), new FakeClock(1000)).accessTokenExpiresAt);
        }

        @Test
        void t34ANegativeExpiresInCountsAsAlreadyExpired() {
            assertEquals(1000.0, build(new FakeTransport(token("acc-1", -50)), new FakeClock(1000)).accessTokenExpiresAt);
        }

        @Test
        void aMissingExpiresInCountsAsZero() {
            final FakeTransport transport = new FakeTransport(refused(200, "{\"access_token\":\"acc-1\"}"));
            assertEquals(1000.0, build(transport, new FakeClock(1000)).accessTokenExpiresAt);
        }

        @Test
        void t35ARefreshWithoutANewRefreshTokenKeepsThePreviousOne() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport =
                    new FakeTransport(
                            token("acc-1", 300, "off-1"),
                            token("acc-2", 300, null),
                            refused(200, "{\"access_token\":\"acc-3\",\"expires_in\":300,\"refresh_token\":\"\"}"),
                            token("acc-4"));
            final KeycloakTokenProvider provider = build(transport, clock);
            for (int i = 0; i < 3; i++) {
                clock.now += 280;
                provider.authorizationHeaderValue();
            }
            final List<String> sent = transport.calls.subList(1, 4).stream().map(call -> call.get("refresh_token")).collect(Collectors.toList());
            assertEquals(Arrays.asList("off-1", "off-1", "off-1"), sent);
        }

        @Test
        void t36TheGrantFormsTheUrlAndTheTimeoutAreExact() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1", 300, "off-1"), token("acc-2"));
            final KeycloakTokenProvider provider =
                    new KeycloakTokenProvider(
                            new KeycloakCredentials(KEYCLOAK_URL + "//", REALM, CLIENT_ID, USERNAME, PASSWORD, null, true, ""),
                            transport, clock, () -> 0.0, new StopSignal.Latch(), false, T);
            clock.now += 280;
            provider.authorizationHeaderValue();

            assertEquals(
                    Arrays.asList(
                            Arrays.asList("grant_type", "password"),
                            Arrays.asList("client_id", CLIENT_ID),
                            Arrays.asList("username", USERNAME),
                            Arrays.asList("password", PASSWORD),
                            Arrays.asList("scope", "offline_access")),
                    entries(transport.calls.get(0)));
            assertEquals(
                    Arrays.asList(
                            Arrays.asList("grant_type", "refresh_token"),
                            Arrays.asList("client_id", CLIENT_ID),
                            Arrays.asList("refresh_token", "off-1")),
                    entries(transport.calls.get(1)));
            assertEquals(Arrays.asList(TOKEN_URL, TOKEN_URL), transport.urls);
            assertEquals(Arrays.asList(10.0, 10.0), transport.timeouts);
        }

        @Test
        void aUrlOfOnlySlashesIsStrippedToNothing() {
            final FakeTransport transport = new FakeTransport(token("acc-1"));
            new KeycloakTokenProvider(
                    new KeycloakCredentials("///", REALM, CLIENT_ID, USERNAME, PASSWORD, null, true, ""),
                    transport, new FakeClock(0), () -> 0.0, new StopSignal.Latch(), false, T);
            assertEquals("/realms/" + REALM + "/protocol/openid-connect/token", transport.urls.get(0));
        }

        private List<List<String>> entries(final Map<String, String> form) {
            return form.entrySet().stream().map(e -> Arrays.asList(e.getKey(), e.getValue())).collect(Collectors.toList());
        }

        @Test
        void theStrictParserReadsAnObject() throws IOException {
            assertEquals(JsonParser.parseString("{\"a\":1}"), KeycloakTokenProvider.parseStrictJson(" {\"a\":1} "));
        }
    }

    @Nested
    class NoCredentialReachesALogOrAnError {

        @Test
        void t37TheFailureLinesAndErrorsCarryNoCredential() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport =
                    new FakeTransport(token("acc-secret-1", 300, "off-secret-1"), unavailable(), token("acc-secret-2"));
            final ScriptedStop stop = new ScriptedStop(clock, false, false);
            final List<String> errors = new ArrayList<>();
            try (LogCapture logs = new LogCapture()) {
                final KeycloakTokenProvider provider = build(transport, clock, stop, 0.0, null);
                runLoop(provider, stop, clock);
                clock.now += 1000;
                final FakeTransport failing = new FakeTransport(token("acc-secret-1", 300, "off-secret-1"), refused());
                final KeycloakTokenProvider other = build(failing, clock);
                clock.now += 1000;
                errors.add(assertThrows(KeycloakAuthenticationException.class, other::authorizationHeaderValue).getMessage());
                errors.add(assertThrows(KeycloakAuthenticationException.class, other::authorizationHeaderValue).getMessage());
                errors.add(provider.toString());

                final String rendered = logs.rendered();
                assertTrue(rendered.contains("refresh failed (attempt 1)"), rendered);
                assertTrue(rendered.contains("recovered"), rendered);
                for (final String secret : Arrays.asList(PASSWORD, "acc-secret-1", "off-secret-1", "acc-secret-2")) {
                    assertFalse(rendered.contains(secret), secret + " reached a log line");
                    for (final String error : errors) {
                        assertFalse(error.contains(secret), secret + " reached an error: " + error);
                    }
                }
            }
        }

        @Test
        void aBackgroundFailureWithAnExpiredTokenIsSwallowedAfterOneWarning() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1", 0), refused());
            final ScriptedStop stop = new ScriptedStop(clock, false);
            try (LogCapture logs = new LogCapture()) {
                runLoop(build(transport, clock, stop, 0.0, null), stop, clock);
                assertEquals(1, logs.count("WARNING", "refresh failed (attempt 1)"));
                assertEquals(1, logs.count("FINE", "will be retried (KeycloakAuthenticationException: Keycloak token refresh failed with status 400"));
            }
        }
    }

    @Nested
    class StopIsSafeFromAnyState {

        @Test
        void t38StopIsIdempotentAndSafeWithoutAThread() {
            final KeycloakTokenProvider provider = build(new FakeTransport(token("acc-1")), new FakeClock(0));
            assertNull(provider.worker);
            provider.stop();
            provider.close();
            assertTrue(provider.isClosed());
        }

        @Test
        void t39StopFromTheWorkerThreadNeverJoinsItself() {
            final KeycloakTokenProvider provider = build(new FakeTransport(token("acc-1")), new FakeClock(0));
            provider.worker = Thread.currentThread();
            final long started = System.nanoTime();
            provider.close();
            assertTrue(System.nanoTime() - started < 1_000_000_000L, "close() joined its own thread");
        }

        @Test
        void t39TheLazyPathStillWorksAfterStop() {
            final FakeClock clock = new FakeClock(1000);
            final KeycloakTokenProvider provider = build(new FakeTransport(token("acc-1"), token("acc-2")), clock);
            provider.close();
            clock.now += 280;
            assertEquals("Bearer acc-2", provider.authorizationHeaderValue());
        }

        @Test
        void t40AnInterruptedJoinDoesNotEscapeAndKeepsTheFlag() throws Exception {
            final KeycloakTokenProvider provider = build(new FakeTransport(token("acc-1")), new FakeClock(0));
            final CountDownLatch release = new CountDownLatch(1);
            final Thread stuck = new Thread(() -> awaitQuietly(release));
            stuck.start();
            provider.worker = stuck;
            try {
                Thread.currentThread().interrupt();
                provider.close();
                assertTrue(Thread.interrupted(), "the interrupt flag was lost");
            } finally {
                release.countDown();
                stuck.join(5_000);
            }
        }

        @Test
        void t40AJoinThatTimesOutDoesNotEscape() throws Exception {
            final KeycloakTokenProvider provider =
                    new KeycloakTokenProvider(
                            credentials(PASSWORD, ""), new FakeTransport(token("acc-1")), new FakeClock(0), () -> 0.0,
                            new StopSignal.Latch(), false, new KeycloakTimings(30, 1, 5, 300, 10, 0.05));
            final CountDownLatch release = new CountDownLatch(1);
            final Thread stuck = new Thread(() -> awaitQuietly(release));
            stuck.start();
            provider.worker = stuck;
            try {
                assertTimeoutPreemptively(Duration.ofSeconds(2), provider::close);
                assertTrue(stuck.isAlive());
            } finally {
                release.countDown();
                stuck.join(5_000);
            }
        }

        private void awaitQuietly(final CountDownLatch latch) {
            try {
                latch.await();
            } catch (final InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        @Test
        void theProductionLatchSignalsAndTimesOut() throws Exception {
            final StopSignal.Latch latch = new StopSignal.Latch();
            assertFalse(latch.isSet());
            assertFalse(latch.await(0.001));
            assertFalse(latch.await(-1));
            latch.set();
            latch.set();
            assertTrue(latch.isSet());
            assertTrue(latch.await(300));
        }
    }

    @Nested
    class TheRealThreadRecovers {

        @Test
        void t41TheThreadSurvivesFailuresAndTheTokenRecovers() throws Exception {
            final FakeTransport transport =
                    new FakeTransport(
                            token("acc-1", 0.1), new IOException("down"), unavailable(),
                            new IllegalStateException("bug"), token("acc-ok", 3600));
            final KeycloakTokenProvider provider =
                    new KeycloakTokenProvider(
                            credentials(PASSWORD, ""), transport, KeycloakTokenProvider::monotonicSeconds,
                            Math::random, new StopSignal.Latch(), true, new KeycloakTimings(0.05, 0.01, 0.05, 0.05, 10, 5));
            final Thread worker = provider.worker;
            try {
                assertEquals("keycloak-token-refresh-" + CLIENT_ID, worker.getName());
                assertTrue(worker.isDaemon());
                final long deadline = System.nanoTime() + 10_000_000_000L;
                while (!"acc-ok".equals(provider.getAccessToken()) && System.nanoTime() < deadline) {
                    Thread.sleep(10);
                }
                assertEquals("acc-ok", provider.getAccessToken(), "no recovery; grants so far: " + transport.grants());
                assertTrue(worker.isAlive(), "the refresh thread died");
                assertEquals(Arrays.asList("password", "refresh_token", "refresh_token", "refresh_token", "refresh_token"), transport.grants());
            } finally {
                provider.close();
            }
            assertFalse(worker.isAlive());
        }

        @Test
        void anUnreachableProviderStopsItsThread() throws Exception {
            final StopSignal.Latch latch = new StopSignal.Latch();
            Thread worker =
                    new KeycloakTokenProvider(
                            credentials(PASSWORD, ""), new FakeTransport(token("acc-1")), KeycloakTokenProvider::monotonicSeconds,
                            () -> 0.0, latch, true, T).worker;
            final long deadline = System.nanoTime() + 20_000_000_000L;
            while (!latch.isSet() && System.nanoTime() < deadline) {
                System.gc();
                Thread.sleep(20);
            }
            assertTrue(latch.isSet(), "the cleaner never stopped the thread of a collected provider");
            worker.join(5_000);
            assertFalse(worker.isAlive());
        }

        @Test
        void theMonotonicClockAdvances() {
            final double first = KeycloakTokenProvider.monotonicSeconds();
            assertTrue(KeycloakTokenProvider.monotonicSeconds() >= first);
        }
    }

    @Nested
    class TheOfflineTokenStartUp {

        private KeycloakTokenProvider handedOff(
                final FakeTransport transport, final FakeClock clock, final String password,
                final Integer tokenExpirationInS, final StopSignal stop) {
            return new KeycloakTokenProvider(
                    credentials(password, "off-handed-0", tokenExpirationInS), transport, clock, () -> 0.0,
                    stop == null ? new StopSignal.Latch() : stop, false, T);
        }

        @Test
        void t42TheStartUpIsARefreshGrantWithTheHandedOffToken() {
            final FakeTransport transport = new FakeTransport(token("acc-1", 300, "off-1"));
            final KeycloakTokenProvider provider = handedOff(transport, new FakeClock(1000), "", null, null);

            assertEquals(Collections.singletonList("refresh_token"), transport.grants());
            assertEquals("off-handed-0", transport.calls.get(0).get("refresh_token"));
            assertFalse(transport.calls.get(0).containsKey("password"));
            assertEquals("acc-1", provider.getAccessToken());
        }

        @Test
        void t43APasswordAlongsideTheTokenIsNeverSent() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1"), refused(), token("acc-3"));
            final KeycloakTokenProvider provider = handedOff(transport, clock, PASSWORD, null, null);
            clock.now += 280;
            provider.authorizationHeaderValue();
            clock.now += 5;
            provider.authorizationHeaderValue();

            assertFalse(transport.grants().contains("password"));
            assertTrue(transport.calls.stream().noneMatch(call -> call.containsKey("password")));
        }

        @Test
        void t44ARefusedStartUpTokenRaisesWithoutAPasswordFallback() {
            final FakeTransport transport = new FakeTransport(refused(), token("acc-never"));
            final KeycloakAuthenticationException raised =
                    assertThrows(
                            KeycloakAuthenticationException.class,
                            () -> handedOff(transport, new FakeClock(1000), PASSWORD, null, null));
            assertTrue(raised.getMessage().startsWith("Keycloak token refresh failed with status 400"), raised.getMessage());
            assertEquals(Collections.singletonList("refresh_token"), transport.grants());
        }

        @Test
        void t45TheRotatedRefreshTokenIsUsedFromThenOn() {
            final FakeClock clock = new FakeClock(1000);
            final FakeTransport transport = new FakeTransport(token("acc-1", 300, "off-rotated"), token("acc-2"));
            final KeycloakTokenProvider provider = handedOff(transport, clock, "", null, null);
            clock.now += 280;
            provider.authorizationHeaderValue();

            assertEquals("off-rotated", transport.calls.get(1).get("refresh_token"));
        }

        @Test
        void t46TheAutoRefreshDeadlineIsArmedOnTheOfflineTokenPath() {
            final FakeClock clock = new FakeClock(1000);
            final ScriptedStop stop = ScriptedStop.timeouts(clock, 50);
            final KeycloakTokenProvider provider = handedOff(new FakeTransport(token("acc-1", 60)), clock, "", 200, stop);

            assertEquals(1200.0, provider.loginDeadline);
            runLoop(provider, stop, clock);
            assertTrue(stop.isSet());
            assertTrue(clock.now <= 1200 + KeycloakTokenProvider.MIN_REFRESH_DELAY_S, "clock " + clock.now);
        }

        @Test
        void t47TheBackgroundLoopSurvivesAFailingOfflineToken() {
            final FakeClock clock = new FakeClock(1000);
            final ScriptedStop stop = new ScriptedStop(clock, false, false, false);
            final FakeTransport transport = new FakeTransport(token("acc-1"), refused(), refused(), token("acc-4"));
            final KeycloakTokenProvider provider = handedOff(transport, clock, "", null, stop);

            runLoop(provider, stop, clock);

            assertEquals(Collections.nCopies(4, "refresh_token"), transport.grants());
            assertEquals("acc-4", provider.getAccessToken());
        }
    }

    @Nested
    class ThePublicConstructors {

        @Test
        void bothPublicConstructorsUseTheRealTransportAndReportAnUnreachableEndpoint() {
            final KeycloakAuthenticationException viaCredentials =
                    assertThrows(
                            KeycloakAuthenticationException.class,
                            () -> new KeycloakTokenProvider(
                                    new KeycloakCredentials("http://127.0.0.1:1/auth", REALM, CLIENT_ID, USERNAME, PASSWORD, null, true, "")));
            assertTrue(viaCredentials.getMessage().startsWith("Keycloak token login could not reach the token endpoint ("), viaCredentials.getMessage());
            assertFalse(viaCredentials.getMessage().contains(PASSWORD));

            final KeycloakAuthenticationException positional =
                    assertThrows(
                            KeycloakAuthenticationException.class,
                            () -> new KeycloakTokenProvider("http://127.0.0.1:1/auth", REALM, CLIENT_ID, USERNAME, "", null, false, "off-handed-0"));
            assertTrue(positional.getMessage().startsWith("Keycloak token refresh could not reach the token endpoint ("), positional.getMessage());
            assertFalse(positional.getMessage().contains("off-handed-0"));
        }

        @Test
        void t55TheRefreshTokenIsTheLastPositionalParameter() throws Exception {
            final Class<?>[] parameters =
                    KeycloakTokenProvider.class
                            .getConstructor(String.class, String.class, String.class, String.class, String.class, Integer.class, boolean.class, String.class)
                            .getParameterTypes();
            assertEquals(8, parameters.length);
            assertEquals(String.class, parameters[7]);
        }

        @Test
        void theErrorKeepsItsCauseAndItsMessage() {
            final IOException cause = new IOException("x");
            assertSame(cause, new KeycloakAuthenticationException("m", cause).getCause());
            assertNull(new KeycloakAuthenticationException("m").getCause());
            assertInstanceOf(RuntimeException.class, new KeycloakAuthenticationException("m"));
        }

        @Test
        void describeRendersAnAbsentMessageEmpty() {
            assertEquals("IOException: ", KeycloakTokenProvider.describe(new IOException()));
            assertEquals("IOException: m", KeycloakTokenProvider.describe(new IOException("m")));
        }
    }
}
