package com.ondewo.nlu.auth;

/**
 * A door into this package for the tests of other packages: a logged-in provider on a scripted
 * endpoint, with no background thread and no network.
 */
public final class TestProviders {

    private TestProviders() {}

    /**
     * @param credentials the identity
     * @param accessToken the token the start-up request returns, valid for 300 s
     * @return a provider that serves {@code Bearer <accessToken>}
     */
    public static KeycloakTokenProvider serving(final KeycloakCredentials credentials, final String accessToken) {
        return new KeycloakTokenProvider(
                credentials,
                new Fakes.FakeTransport(Fakes.token(accessToken)),
                KeycloakTokenProvider::monotonicSeconds,
                () -> 0.0,
                new StopSignal.Latch(),
                false,
                KeycloakTimings.DEFAULTS);
    }

    /** @return a provider whose token has expired and whose every refresh is refused */
    public static KeycloakTokenProvider expired(final KeycloakCredentials credentials) {
        return new KeycloakTokenProvider(
                credentials,
                new Fakes.FakeTransport(Fakes.token("acc-expired", 0), Fakes.refused()),
                KeycloakTokenProvider::monotonicSeconds,
                () -> 0.0,
                new StopSignal.Latch(),
                false,
                KeycloakTimings.DEFAULTS);
    }
}
