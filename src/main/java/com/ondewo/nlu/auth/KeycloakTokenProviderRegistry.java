package com.ondewo.nlu.auth;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * One {@link KeycloakTokenProvider} per credential set, shared by every client of that set, so
 * the start-up login runs once. Keyed by {@link KeycloakCredentials#registryKey()} (a SHA-256 of
 * the credentials, never an object identity), held WEAKLY so a provider no client uses any more
 * can be collected, and never handing out a CLOSED provider. Creation is serialised, so two
 * clients starting at once cannot log in twice.
 */
final class KeycloakTokenProviderRegistry {

    static final KeycloakTokenProviderRegistry DEFAULT =
            new KeycloakTokenProviderRegistry(KeycloakTokenProvider::new);

    private final Function<KeycloakCredentials, KeycloakTokenProvider> factory;
    private final ReferenceQueue<KeycloakTokenProvider> collected = new ReferenceQueue<>();

    /** Package-private so a test can reach an entry. */
    final Map<String, KeyedReference> providers = new HashMap<>();

    KeycloakTokenProviderRegistry(
            final Function<KeycloakCredentials, KeycloakTokenProvider> factory) {
        this.factory = factory;
    }

    synchronized KeycloakTokenProvider get(final KeycloakCredentials credentials) {
        purgeCollected();
        final String key = credentials.registryKey();
        final KeyedReference reference = providers.get(key);
        KeycloakTokenProvider provider = reference == null ? null : reference.get();
        if (provider == null || provider.isClosed()) {
            provider = factory.apply(credentials);
            providers.put(key, new KeyedReference(key, provider, collected));
        }
        return provider;
    }

    private void purgeCollected() {
        Reference<? extends KeycloakTokenProvider> gone;
        while ((gone = collected.poll()) != null) {
            final KeyedReference keyed = (KeyedReference) gone;
            providers.remove(keyed.key, keyed);
        }
    }

    /** A weak reference that remembers its key, so a collected entry can be removed. */
    static final class KeyedReference extends WeakReference<KeycloakTokenProvider> {

        final String key;

        KeyedReference(
                final String key,
                final KeycloakTokenProvider provider,
                final ReferenceQueue<KeycloakTokenProvider> queue) {
            super(provider, queue);
            this.key = key;
        }
    }
}
