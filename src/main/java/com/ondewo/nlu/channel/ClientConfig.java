package com.ondewo.nlu.channel;

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
 * <p>Every rule is checked by {@link Builder#build()}, so an invalid config never reaches gRPC.
 * No error message and no {@link #toString()} renders a PEM or the key.
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

    private ClientConfig(final Builder builder) {
        this.host = builder.host;
        this.port = builder.port;
        this.grpcCert = builder.grpcCert;
        this.grpcClientCert = builder.grpcClientCert;
        this.grpcClientKey = builder.grpcClientKey;
        this.useSecureChannel = builder.useSecureChannel;
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
     * Renders every field for logging. {@code grpcClientKey} shows as {@value #REDACTED} (empty
     * when unset), and the certificates show only their length, so neither a key nor a PEM ever
     * ends up in a log line.
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
                + (grpcClientKey.isEmpty() ? "" : REDACTED)
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
         * @return the validated, immutable config
         * @throws IllegalArgumentException if the host is blank, the port is out of range, only
         *     one of {@code grpcClientCert} / {@code grpcClientKey} is set, or a plaintext channel
         *     is asked to carry a client identity. The message names fields, never their values.
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
            return new ClientConfig(this);
        }

        private static String orEmpty(final String value) {
            return value == null ? "" : value;
        }
    }
}
