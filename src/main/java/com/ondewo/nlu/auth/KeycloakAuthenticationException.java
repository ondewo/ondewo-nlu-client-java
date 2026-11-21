package com.ondewo.nlu.auth;

/**
 * The one error every Keycloak failure of {@link KeycloakTokenProvider} surfaces as: a refused
 * login or refresh, an unreachable token endpoint, an unusable token response, and the lazy read
 * of an access token that has expired and could not be refreshed.
 *
 * <p>The underlying error, when there is one, is reachable through {@link #getCause()}. The
 * message never contains a password, a refresh token or an access token.
 */
public class KeycloakAuthenticationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /** @param message what failed; never carries a credential */
    public KeycloakAuthenticationException(final String message) {
        super(message);
    }

    /**
     * @param message what failed; never carries a credential
     * @param cause the error that made it fail
     */
    public KeycloakAuthenticationException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
