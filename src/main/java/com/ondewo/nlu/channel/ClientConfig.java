package com.ondewo.nlu.channel;

import com.ondewo.nlu.auth.KeycloakCredentials;

import java.util.Optional;

/**
 * Where and how to connect to an ONDEWO server: host, port, and the TLS / mutual-TLS material.
 *
 * <p>Immutable; build one with {@link #builder()} and open a channel with {@link GrpcChannels}.
 * The three certificate fields hold PEM <b>content</b>, never a file path - read the files
 * yourself, e.g. {@code Files.readString(Path.of("certs/ca.pem"))}.
 *
 * <ul>
 *   <li>{@code grpcCert}: the CA (or self-signed server certificate) to trust. Empty means the
 *       JVM's default trust store.
 *   <li>{@code grpcClientCert} / {@code grpcClientKey}: the client identity for mutual TLS. Both
 *       or neither; the key must be an unencrypted PKCS#8 PEM.
 *   <li>{@code useSecureChannel}: {@code true} by default. A plaintext channel cannot carry a
 *       client identity.
 * </ul>
 *
 * <p>Keycloak (optional): {@code keycloakUrl}, {@code realm} and {@code clientId} are all set or
 * all empty. When set, {@link GrpcChannels} authenticates every call with a token from the shared
 * {@code com.ondewo.nlu.auth.KeycloakTokenProvider}, which needs EITHER {@code password} (a
 * password grant with {@code username}) OR {@code refreshToken} (a handed-off offline token; the
 * password is then never sent). When the three are empty no {@code authorization} header is
 * attached.
 *
 * <p>Every rule is checked by {@link Builder#build()}, so an invalid config never reaches gRPC.
 * No error message and no {@link #toString()} renders a PEM, the key, the password or the
 * refresh token.
 *
 * <p>This class lives in its own package on purpose: {@code make generate_ondewo_protos} deletes
 * only the {@code *.java} files of the leaf packages protoc regenerates, so a sibling package such
 * as this one survives a regeneration untouched.
 */
public final class ClientConfig {

    /** What {@link #toString()} shows instead of a non-empty secret. */
    static final String REDACTED = "***REDACTED***";

    private final String host;
    private final int port;
    private final String grpcCert;
    private final String grpcClientCert;
    private final String grpcClientKey;
    private final boolean useSecureChannel;
    private final String keycloakUrl;
    private final String realm;
    private final String clientId;
    private final String username;
    private final String password;
    private final Integer tokenExpirationInS;
    private final boolean keycloakVerifySsl;
    private final String refreshToken;
    private final KeycloakCredentials keycloakCredentials;

    private ClientConfig(final Builder builder) {
        this.host = builder.host;
        this.port = builder.port;
        this.grpcCert = builder.grpcCert;
        this.grpcClientCert = builder.grpcClientCert;
        this.grpcClientKey = builder.grpcClientKey;
        this.useSecureChannel = builder.useSecureChannel;
        this.keycloakUrl = builder.keycloakUrl;
        this.realm = builder.realm;
        this.clientId = builder.clientId;
        this.username = builder.username;
        this.password = builder.password;
        this.tokenExpirationInS = builder.tokenExpirationInS;
        this.keycloakVerifySsl = builder.keycloakVerifySsl;
        this.refreshToken = builder.refreshToken;
        this.keycloakCredentials =
                keycloakUrl.isEmpty()
                        ? null
                        : new KeycloakCredentials(
                                keycloakUrl,
                                realm,
                                clientId,
                                username,
                                password,
                                tokenExpirationInS,
                                keycloakVerifySsl,
                                refreshToken);
    }

    /** @return a builder with {@code useSecureChannel = true} and no certificate set */
    public static Builder builder() {
        return new Builder();
    }

    /** @return the host name or IP literal, without brackets or port */
    public String getHost() {
        return host;
    }

    /** @return the TCP port, 1 to 65535 */
    public int getPort() {
        return port;
    }

    /** @return PEM of the CA to trust; empty for the JVM's default trust store */
    public String getGrpcCert() {
        return grpcCert;
    }

    /** @return PEM of the client certificate chain; empty without mutual TLS */
    public String getGrpcClientCert() {
        return grpcClientCert;
    }

    /** @return PEM of the client private key; empty without mutual TLS. Never log it. */
    public String getGrpcClientKey() {
        return grpcClientKey;
    }

    /** @return {@code true} for TLS (the default), {@code false} for plaintext */
    public boolean isUseSecureChannel() {
        return useSecureChannel;
    }

    /** @return Keycloak base URL (before {@code /realms/<realm>}); empty without Keycloak */
    public String getKeycloakUrl() {
        return keycloakUrl;
    }

    /** @return the Keycloak realm; empty without Keycloak */
    public String getRealm() {
        return realm;
    }

    /** @return the public Keycloak SDK client id; empty without Keycloak */
    public String getClientId() {
        return clientId;
    }

    /** @return the technical user of the password grant */
    public String getUsername() {
        return username;
    }

    /** @return the technical user's password. Never log it. */
    public String getPassword() {
        return password;
    }

    /** @return how long the token auto-refresh runs in seconds, {@code null} for no bound */
    public Integer getTokenExpirationInS() {
        return tokenExpirationInS;
    }

    /** @return whether the token-endpoint call verifies Keycloak's TLS certificate */
    public boolean isKeycloakVerifySsl() {
        return keycloakVerifySsl;
    }

    /** @return the handed-off Keycloak offline refresh token. Never log it. */
    public String getRefreshToken() {
        return refreshToken;
    }

    /** @return {@code true} when {@code keycloakUrl}, {@code realm} and {@code clientId} are set */
    public boolean isKeycloakConfigured() {
        return keycloakCredentials != null;
    }

    /** @return the Keycloak identity of this config, empty when Keycloak is not configured */
    public Optional<KeycloakCredentials> keycloakCredentials() {
        return Optional.ofNullable(keycloakCredentials);
    }

    /** @return {@code true} when a client certificate and key are set (mutual TLS) */
    public boolean hasClientIdentity() {
        return !grpcClientCert.isEmpty();
    }

    /**
     * The gRPC target {@code host:port}. A bare IPv6 literal is bracketed ({@code [::1]:50051});
     * a host that is already bracketed or carries a scheme ({@code dns:///...}) is left alone.
     *
     * @return the target string to hand to {@code Grpc.newChannelBuilder}
     */
    public String target() {
        final String bracketed = isBareIpv6Literal(host) ? "[" + host + "]" : host;
        return bracketed + ":" + port;
    }

    /**
     * Renders every field for logging. {@code grpcClientKey}, {@code password} and {@code
     * refreshToken} show as {@value #REDACTED} (empty when unset), and the certificates show only
     * their length, so neither a secret nor a PEM ever ends up in a log line.
     */
    @Override
    public String toString() {
        return "ClientConfig{host="
                + host
                + ", port="
                + port
                + ", useSecureChannel="
                + useSecureChannel
                + ", grpcCert="
                + describePem(grpcCert)
                + ", grpcClientCert="
                + describePem(grpcClientCert)
                + ", grpcClientKey="
                + KeycloakCredentials.redact(grpcClientKey)
                + ", keycloakUrl="
                + keycloakUrl
                + ", realm="
                + realm
                + ", clientId="
                + clientId
                + ", username="
                + username
                + ", password="
                + KeycloakCredentials.redact(password)
                + ", tokenExpirationInS="
                + tokenExpirationInS
                + ", keycloakVerifySsl="
                + keycloakVerifySsl
                + ", refreshToken="
                + KeycloakCredentials.redact(refreshToken)
                + "}";
    }

    private static String describePem(final String pem) {
        return pem.isEmpty() ? "" : "<PEM, " + pem.length() + " chars>";
    }

    /**
     * Whether {@code host} is an IPv6 address literal that needs brackets in a target: at least
     * two colons and nothing but hex digits, colons and dots (an IPv4 tail), optionally followed
     * by a {@code %zone}. Pure text inspection, so no name is ever resolved here. A scheme such as
     * {@code dns:///name} has a slash and a host name has at most one colon, so neither matches.
     */
    static boolean isBareIpv6Literal(final String host) {
        final int zone = host.indexOf('%');
        final String address = zone < 0 ? host : host.substring(0, zone);
        int colons = 0;
        for (int i = 0; i < address.length(); i++) {
            final char c = address.charAt(i);
            if (c == ':') {
                colons++;
            } else if (c != '.' && Character.digit(c, 16) < 0) {
                return false;
            }
        }
        return colons >= 2;
    }

    /** Collects the fields of a {@link ClientConfig}; {@link #build()} validates them. */
    public static final class Builder {

        private String host = "";
        private int port;
        private String grpcCert = "";
        private String grpcClientCert = "";
        private String grpcClientKey = "";
        private boolean useSecureChannel = true;
        private String keycloakUrl = "";
        private String realm = "";
        private String clientId = "";
        private String username = "";
        private String password = "";
        private Integer tokenExpirationInS;
        private boolean keycloakVerifySsl = true;
        private String refreshToken = "";

        private Builder() {}

        /** @param host host name or IP literal (IPv6 without brackets is fine) */
        public Builder host(final String host) {
            this.host = orEmpty(host);
            return this;
        }

        /** @param port TCP port, 1 to 65535 */
        public Builder port(final int port) {
            this.port = port;
            return this;
        }

        /** @param grpcCert PEM content of the CA to trust; null or empty for the default store */
        public Builder grpcCert(final String grpcCert) {
            this.grpcCert = orEmpty(grpcCert);
            return this;
        }

        /** @param grpcClientCert PEM content of the client certificate (chain) for mutual TLS */
        public Builder grpcClientCert(final String grpcClientCert) {
            this.grpcClientCert = orEmpty(grpcClientCert);
            return this;
        }

        /** @param grpcClientKey PEM content of the unencrypted PKCS#8 client key for mutual TLS */
        public Builder grpcClientKey(final String grpcClientKey) {
            this.grpcClientKey = orEmpty(grpcClientKey);
            return this;
        }

        /** @param useSecureChannel {@code false} for a plaintext channel (not for production) */
        public Builder useSecureChannel(final boolean useSecureChannel) {
            this.useSecureChannel = useSecureChannel;
            return this;
        }

        /**
         * @param keycloakUrl Keycloak base URL, the part before {@code /realms/<realm>}, e.g.
         *     {@code https://host/auth}
         */
        public Builder keycloakUrl(final String keycloakUrl) {
            this.keycloakUrl = orEmpty(keycloakUrl);
            return this;
        }

        /** @param realm the Keycloak realm, e.g. {@code ondewo-ccai-platform} */
        public Builder realm(final String realm) {
            this.realm = orEmpty(realm);
            return this;
        }

        /** @param clientId the PUBLIC SDK client id, e.g. {@code ondewo-nlu-cai-sdk-public} */
        public Builder clientId(final String clientId) {
            this.clientId = orEmpty(clientId);
            return this;
        }

        /** @param username the technical user of the password grant */
        public Builder username(final String username) {
            this.username = orEmpty(username);
            return this;
        }

        /** @param password the technical user's password; not needed with {@code refreshToken} */
        public Builder password(final String password) {
            this.password = orEmpty(password);
            return this;
        }

        /**
         * @param tokenExpirationInS how long the token auto-refresh runs, in seconds from the first
         *     token; {@code null} (the default) refreshes until the offline session ends
         */
        public Builder tokenExpirationInS(final Integer tokenExpirationInS) {
            this.tokenExpirationInS = tokenExpirationInS;
            return this;
        }

        /**
         * @param keycloakVerifySsl {@code false} skips the verification of Keycloak's TLS
         *     certificate on the token-endpoint call only (a self-signed local ingress); default
         *     {@code true}
         */
        public Builder keycloakVerifySsl(final boolean keycloakVerifySsl) {
            this.keycloakVerifySsl = keycloakVerifySsl;
            return this;
        }

        /**
         * @param refreshToken a handed-off Keycloak OFFLINE refresh token: the provider starts with
         *     a refresh grant and never sends a password, not even as a fallback
         */
        public Builder refreshToken(final String refreshToken) {
            this.refreshToken = orEmpty(refreshToken);
            return this;
        }

        /**
         * @return the validated, immutable config
         * @throws IllegalArgumentException if the host is blank, the port is out of range, only
         *     one of {@code grpcClientCert} / {@code grpcClientKey} is set, or a plaintext channel
         *     is asked to carry a client identity, only some of {@code keycloakUrl} / {@code
         *     realm} / {@code clientId} are set, or Keycloak is set without a {@code password} or
         *     {@code refreshToken}. The message names fields, never their values.
         */
        public ClientConfig build() {
            if (host.trim().isEmpty()) {
                throw new IllegalArgumentException("ClientConfig: host must not be blank");
            }
            if (port < 1 || port > 65535) {
                throw new IllegalArgumentException(
                        "ClientConfig: port must be between 1 and 65535, got " + port);
            }
            if (grpcClientCert.isEmpty() != grpcClientKey.isEmpty()) {
                throw new IllegalArgumentException(
                        "ClientConfig: grpcClientCert and grpcClientKey must be set together for"
                                + " mutual TLS, or both left empty (only "
                                + (grpcClientCert.isEmpty() ? "grpcClientKey" : "grpcClientCert")
                                + " is set)");
            }
            if (!useSecureChannel && !grpcClientCert.isEmpty()) {
                throw new IllegalArgumentException(
                        "ClientConfig: useSecureChannel=false cannot carry a client identity"
                                + " (grpcClientCert / grpcClientKey) for "
                                + host
                                + ":"
                                + port
                                + " - it would be silently dropped. Use a secure channel or"
                                + " remove the identity.");
            }
            final int keycloakFields =
                    (keycloakUrl.isEmpty() ? 0 : 1)
                            + (realm.isEmpty() ? 0 : 1)
                            + (clientId.isEmpty() ? 0 : 1);
            if (keycloakFields != 0 && keycloakFields != 3) {
                throw new IllegalArgumentException(
                        "The Keycloak fields `keycloak_url`, `realm`, and `client_id` must be"
                                + " provided together in ClientConfig.");
            }
            if (keycloakFields == 3 && password.isEmpty() && refreshToken.isEmpty()) {
                throw new IllegalArgumentException(
                        "Either the field `password` or the field `refresh_token` is mandatory in"
                                + " ClientConfig.");
            }
            return new ClientConfig(this);
        }

        private static String orEmpty(final String value) {
            return value == null ? "" : value;
        }
    }
}
