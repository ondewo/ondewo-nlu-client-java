package com.ondewo.nlu.auth;

import static com.ondewo.nlu.auth.Fakes.CLIENT_ID;
import static com.ondewo.nlu.auth.Fakes.KEYCLOAK_URL;
import static com.ondewo.nlu.auth.Fakes.PASSWORD;
import static com.ondewo.nlu.auth.Fakes.REALM;
import static com.ondewo.nlu.auth.Fakes.USERNAME;
import static com.ondewo.nlu.auth.Fakes.token;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.ondewo.nlu.auth.Fakes.FakeClock;
import com.ondewo.nlu.auth.Fakes.FakeTransport;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/** T48-T54: one provider per credential set, keyed by the credentials, never by identity. */
class KeycloakTokenProviderRegistryTest {

    private final List<KeycloakCredentials> built = Collections.synchronizedList(new ArrayList<>());
    private final KeycloakTokenProviderRegistry registry = new KeycloakTokenProviderRegistry(this::construct);

    private KeycloakTokenProvider construct(final KeycloakCredentials credentials) {
        built.add(credentials);
        return new KeycloakTokenProvider(
                credentials, new FakeTransport(token("acc-1")), new FakeClock(0), () -> 0.0,
                new StopSignal.Latch(), false, KeycloakTimings.DEFAULTS);
    }

    private static KeycloakCredentials config(final String field, final String value) {
        return new KeycloakCredentials(
                "keycloak_url".equals(field) ? value : KEYCLOAK_URL,
                "realm".equals(field) ? value : REALM,
                CLIENT_ID,
                "username".equals(field) ? value : USERNAME,
                "password".equals(field) ? value : PASSWORD,
                null,
                true,
                "refresh_token".equals(field) ? value : "");
    }

    @Test
    void t48TheSameCredentialsShareOneProvider() {
        final KeycloakTokenProvider first = registry.get(config("", ""));
        final KeycloakTokenProvider second = registry.get(config("", ""));
        assertSame(first, second);
        assertEquals(1, built.size());
    }

    @ParameterizedTest
    @ValueSource(strings = {"username", "password", "realm", "keycloak_url", "refresh_token"})
    void t49DifferentCredentialsNeverShareAProvider(final String field) {
        assertNotSame(registry.get(config("", "")), registry.get(config(field, "other")));
        assertEquals(2, built.size());
    }

    @Test
    void t50FiftyConfigsWithDistinctUsersAreFiftyConstructions() {
        final List<KeycloakTokenProvider> keep = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            keep.add(registry.get(config("username", "user-" + i + "@example.com")));
        }
        assertEquals(
                IntStream.range(0, 50).mapToObj(i -> "user-" + i + "@example.com").collect(Collectors.toList()),
                built.stream().map(KeycloakCredentials::getUsername).collect(Collectors.toList()));
        assertEquals(50, keep.stream().distinct().count());
    }

    @Test
    void t51TwoOfflineTokensWithNoPasswordNeverShareAProvider() {
        final KeycloakCredentials a = new KeycloakCredentials(KEYCLOAK_URL, REALM, CLIENT_ID, USERNAME, "", null, true, "off-tenant-a");
        final KeycloakCredentials b = new KeycloakCredentials(KEYCLOAK_URL, REALM, CLIENT_ID, USERNAME, "", null, true, "off-tenant-b");
        assertNotSame(registry.get(a), registry.get(b));
        assertEquals(
                List.of("off-tenant-a", "off-tenant-b"),
                built.stream().map(KeycloakCredentials::getRefreshToken).collect(Collectors.toList()));
        assertTrue(built.stream().allMatch(c -> c.getPassword().isEmpty()));
    }

    @Test
    void t54AClosedProviderIsNeverHandedOutAgain() {
        final KeycloakTokenProvider first = registry.get(config("", ""));
        first.close();
        final KeycloakTokenProvider second = registry.get(config("", ""));
        assertNotSame(first, second);
        assertFalse(second.isClosed());
        assertSame(second, registry.get(config("", "")));
        assertEquals(2, built.size());
    }

    @Test
    void aCollectedProviderIsReplacedAndItsEntryPurged() {
        registry.get(config("username", "a"));
        final KeycloakTokenProviderRegistry.KeyedReference entry =
                registry.providers.get(config("username", "a").registryKey());
        entry.clear();
        entry.enqueue();

        registry.get(config("username", "b"));
        assertFalse(registry.providers.containsKey(config("username", "a").registryKey()));

        registry.get(config("username", "a"));
        assertEquals(3, built.size());
    }

    @Test
    void aClearedButNotYetPurgedEntryIsReplaced() {
        registry.get(config("", ""));
        registry.providers.get(config("", "").registryKey()).clear();
        registry.get(config("", ""));
        assertEquals(2, built.size());
    }

    @Test
    void aStalePurgeNeverRemovesTheLiveEntryOfTheSameKey() {
        registry.get(config("", ""));
        final KeycloakTokenProviderRegistry.KeyedReference stale = registry.providers.get(config("", "").registryKey());
        stale.clear();
        final KeycloakTokenProvider live = registry.get(config("", ""));
        stale.enqueue();
        assertSame(live, registry.get(config("", "")));
        assertEquals(2, built.size());
    }

    @Test
    void concurrentFirstUseLogsInOnce() throws Exception {
        final ExecutorService pool = Executors.newFixedThreadPool(16);
        try {
            final CountDownLatch start = new CountDownLatch(1);
            final List<Future<KeycloakTokenProvider>> results = new ArrayList<>();
            for (int i = 0; i < 16; i++) {
                results.add(pool.submit(() -> {
                    start.await();
                    return registry.get(config("", ""));
                }));
            }
            start.countDown();
            final KeycloakTokenProvider first = results.get(0).get();
            for (final Future<KeycloakTokenProvider> result : results) {
                assertSame(first, result.get());
            }
            assertEquals(1, built.size());
        } finally {
            pool.shutdownNow();
        }
    }

    @Test
    void aFailedStartUpIsNotCached() {
        final KeycloakTokenProviderRegistry failing =
                new KeycloakTokenProviderRegistry(c -> {
                    built.add(c);
                    throw new KeycloakAuthenticationException("refused");
                });
        assertThrows(KeycloakAuthenticationException.class, () -> failing.get(config("", "")));
        assertThrows(KeycloakAuthenticationException.class, () -> failing.get(config("", "")));
        assertEquals(2, built.size());
        assertTrue(failing.providers.isEmpty());
    }

    @Test
    void theSharedEntryPointUsesTheDefaultRegistry() {
        final KeycloakAuthenticationException raised =
                assertThrows(
                        KeycloakAuthenticationException.class,
                        () -> KeycloakTokenProvider.shared(
                                new KeycloakCredentials("http://127.0.0.1:1/auth", REALM, CLIENT_ID, USERNAME, PASSWORD, null, true, "")));
        assertTrue(raised.getMessage().contains("could not reach the token endpoint"));
    }
}
