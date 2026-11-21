package com.ondewo.nlu.auth;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * The Keycloak identity a {@link KeycloakTokenProvider} authenticates as: where the realm is, the
 * public SDK client, and EITHER a technical user's password OR a handed-off offline refresh token.
 *
 * <p>Immutable. {@code com.ondewo.nlu.channel.ClientConfig#keycloakCredentials()} builds one from a
 * client config; build one directly when you manage the token provider yourself.
 *
 * <p>When {@code refreshToken} is set the provider starts with a {@code refresh_token} grant and
 * never sends the password, not even as a fallback. Neither {@link #toString()} nor any error
 * message renders the password or the refresh token.
 */
public final class KeycloakCredentials {

    /** What {@link #toString()} shows instead of a non-empty secret. */
    static final String REDACTED = "***REDACTED***";

    private final String keycloakUrl;
    private final String realm;
    private final String clientId;
    private final String username;
    private final String password;
    private final Integer tokenExpirationInS;
    private final boolean verifySsl;
    private final String refreshToken;

    /**
     * @param keycloakUrl Keycloak base URL, the part before {@code /realms/<realm>}, e.g.
     *     {@code https://host/auth}
     * @param realm the realm, e.g. {@code ondewo-ccai-platform}
     * @param clientId the PUBLIC SDK client id; no client secret exists and none is sent
     * @param username the technical user of the password grant
     * @param password the technical user's password; may be empty when {@code refreshToken} is set
     * @param tokenExpirationInS how long the auto-refresh runs, in seconds from the initial token;
     *     {@code null} refreshes until the offline session itself ends
     * @param verifySsl whether the token-endpoint call verifies Keycloak's TLS certificate
     *     ({@code false} only for a self-signed local ingress)
     * @param refreshToken a handed-off Keycloak OFFLINE refresh token used instead of the password;
     *     appended LAST so positional callers of earlier parameter lists keep their meaning
     * @throws IllegalArgumentException if any of {@code keycloakUrl}, {@code realm}, {@code
     *     clientId} is empty, or neither {@code password} nor {@code refreshToken} is set
     */
    public KeycloakCredentials(
            final String keycloakUrl,
            final String realm,
            final String clientId,
            final String username,
            final String password,
            final Integer tokenExpirationInS,
            final boolean verifySsl,
            final String refreshToken) {
        this.keycloakUrl = orEmpty(keycloakUrl);
        this.realm = orEmpty(realm);
        this.clientId = orEmpty(clientId);
        this.username = orEmpty(username);
        this.password = orEmpty(password);
        this.tokenExpirationInS = tokenExpirationInS;
        this.verifySsl = verifySsl;
        this.refreshToken = orEmpty(refreshToken);
        if (this.keycloakUrl.isEmpty() || this.realm.isEmpty() || this.clientId.isEmpty()) {
            throw new IllegalArgumentException(
                    "The Keycloak fields `keycloak_url`, `realm`, and `client_id` must be provided"
                            + " together in KeycloakCredentials.");
        }
        if (this.password.isEmpty() && this.refreshToken.isEmpty()) {
            throw new IllegalArgumentException(
                    "Either the field `password` or the field `refresh_token` is mandatory in"
                            + " KeycloakCredentials.");
        }
    }

    /** @return the Keycloak base URL as given */
    public String getKeycloakUrl() {
        return keycloakUrl;
    }

    /** @return the realm */
    public String getRealm() {
        return realm;
    }

    /** @return the public SDK client id */
    public String getClientId() {
        return clientId;
    }

    /** @return the technical user */
    public String getUsername() {
        return username;
    }

    /** @return the password; empty on the offline-token path. Never log it. */
    public String getPassword() {
        return password;
    }

    /** @return the auto-refresh bound in seconds, or {@code null} for none */
    public Integer getTokenExpirationInS() {
        return tokenExpirationInS;
    }

    /** @return whether the token-endpoint call verifies Keycloak's TLS certificate */
    public boolean isVerifySsl() {
        return verifySsl;
    }

    /** @return the handed-off offline refresh token; empty on the password path. Never log it. */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * The key of the shared provider registry: the SHA-256 hex digest of every field joined with
     * {@code '\0'}. Two credential sets share a provider exactly when a shared provider behaves
     * identically for both; the key holds no secret substring. Identical in every ONDEWO SDK.
     *
     * @return 64 lower-case hex characters
     */
    String registryKey() {
        final String joined =
                String.join(
                        "\0",
                        keycloakUrl,
                        realm,
                        clientId,
                        username,
                        password,
                        tokenExpirationInS == null ? "" : tokenExpirationInS.toString(),
                        verifySsl ? "True" : "False",
                        refreshToken);
        return sha256Hex("SHA-256", joined);
    }

    /**
     * @param algorithm the digest algorithm; a parameter only so the test can reach the failure
     * @param text what to hash
     * @return the digest as 64 lower-case hex characters
     */
    static String sha256Hex(final String algorithm, final String text) {
        try {
            final byte[] digest =
                    MessageDigest.getInstance(algorithm).digest(text.getBytes(StandardCharsets.UTF_8));
            return String.format("%064x", new BigInteger(1, digest));
        } catch (final NoSuchAlgorithmException e) {
            throw new IllegalStateException("this JVM offers no " + algorithm + " digest", e);
        }
    }

    /**
     * Renders every field; {@code password} and {@code refreshToken} show as {@value #REDACTED}
     * when set and stay empty when not, because "nobody set it" is usually what is being debugged.
     */
    @Override
    public String toString() {
        return "KeycloakCredentials{keycloakUrl="
                + keycloakUrl
                + ", realm="
                + realm
                + ", clientId="
                + clientId
                + ", username="
                + username
                + ", password="
                + redact(password)
                + ", tokenExpirationInS="
                + tokenExpirationInS
                + ", verifySsl="
                + verifySsl
                + ", refreshToken="
                + redact(refreshToken)
                + "}";
    }

    /**
     * @param secret a credential
     * @return {@value #REDACTED} when set, empty when not
     */
    public static String redact(final String secret) {
        return secret == null || secret.isEmpty() ? "" : REDACTED;
    }

    private static String orEmpty(final String value) {
        return value == null ? "" : value;
    }
}
