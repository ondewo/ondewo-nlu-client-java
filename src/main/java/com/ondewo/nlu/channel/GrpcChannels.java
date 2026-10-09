package com.ondewo.nlu.channel;

import io.grpc.ChannelCredentials;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.TlsChannelCredentials;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Opens gRPC channels to an ONDEWO server from a {@link ClientConfig}: plaintext, TLS against
 * the JVM's trust store or a custom CA, or mutual TLS - with the ONDEWO channel defaults.
 *
 * <pre>{@code
 * ClientConfig config = ClientConfig.builder()
 *     .host("nlu.example.com").port(443)
 *     .grpcCert(Files.readString(Path.of("certs/ca.pem")))
 *     .build();
 * ManagedChannel channel = GrpcChannels.newChannel(config);
 * }</pre>
 *
 * <p>One channel serves every stub of every service: build it once and share it.
 */
public final class GrpcChannels {

    /** Keepalive ping interval during active calls, see the README for why it is 5 minutes. */
    public static final long KEEPALIVE_TIME_MS = 300_000L;

    /** How long to wait for a keepalive ping ack before the connection is declared dead. */
    public static final long KEEPALIVE_TIMEOUT_MS = 20_000L;

    /** Largest message the channel accepts, the same {@code 2^31 - 1} as the Python clients. */
    public static final int MAX_MESSAGE_LENGTH = Integer.MAX_VALUE;

    private static final Logger LOGGER = Logger.getLogger(GrpcChannels.class.getName());

    private GrpcChannels() {}

    /**
     * @param config validated connection settings
     * @return a started channel; shut it down when done
     */
    public static ManagedChannel newChannel(final ClientConfig config) {
        return newChannelBuilder(config).build();
    }

    /**
     * Returns a builder with the credentials and the ONDEWO defaults applied, for callers that
     * add their own settings - e.g. {@code overrideAuthority("name-in-the-SAN")} when connecting by
     * an IP the server certificate does not list, or interceptors.
     *
     * @param config validated connection settings
     * @return a channel builder for {@link ClientConfig#target()}
     * @throws IllegalArgumentException if the TLS material is not loadable PEM
     */
    public static ManagedChannelBuilder<?> newChannelBuilder(final ClientConfig config) {
        final ChannelCredentials credentials = credentials(config);
        final ManagedChannelBuilder<?> builder;
        try {
            builder = Grpc.newChannelBuilder(config.target(), credentials);
        } catch (final RuntimeException e) {
            // e.g. a file path instead of PEM content. Neither message renders the material.
            throw new IllegalArgumentException(
                    "GrpcChannels: could not create the channel to "
                            + config.target()
                            + ". grpcCert, grpcClientCert and grpcClientKey must hold PEM content,"
                            + " not file paths, and the key must be an unencrypted PKCS#8 PEM",
                    e);
        }
        return builder.keepAliveTime(KEEPALIVE_TIME_MS, TimeUnit.MILLISECONDS)
                .keepAliveTimeout(KEEPALIVE_TIMEOUT_MS, TimeUnit.MILLISECONDS)
                .keepAliveWithoutCalls(false)
                .maxInboundMessageSize(MAX_MESSAGE_LENGTH);
    }

    /**
     * @param config validated connection settings
     * @return insecure credentials (with a warning naming {@code host:port}), or TLS credentials
     *     trusting {@code grpcCert} (the JVM default when empty) and presenting the client
     *     identity when one is set
     */
    public static ChannelCredentials credentials(final ClientConfig config) {
        if (!config.isUseSecureChannel()) {
            LOGGER.log(
                    Level.WARNING,
                    "Opening an INSECURE (plaintext) gRPC channel to {0}: traffic is not encrypted",
                    config.target());
            return InsecureChannelCredentials.create();
        }
        return tlsCredentials(
                pemStream(config.getGrpcCert()),
                pemStream(config.getGrpcClientCert()),
                pemStream(config.getGrpcClientKey()));
    }

    /**
     * @param rootCerts PEM to trust, {@code null} for the JVM default trust store
     * @param clientCert client certificate PEM, {@code null} without mutual TLS
     * @param clientKey client key PEM, {@code null} exactly when {@code clientCert} is
     */
    static ChannelCredentials tlsCredentials(
            final InputStream rootCerts,
            final InputStream clientCert,
            final InputStream clientKey) {
        final TlsChannelCredentials.Builder tls = TlsChannelCredentials.newBuilder();
        try {
            if (rootCerts != null) {
                tls.trustManager(rootCerts);
            }
            if (clientCert != null) {
                tls.keyManager(clientCert, clientKey);
            }
        } catch (final IOException e) {
            throw new UncheckedIOException("could not read the TLS material of the channel", e);
        }
        return tls.build();
    }

    private static InputStream pemStream(final String pem) {
        return pem.isEmpty()
                ? null
                : new ByteArrayInputStream(pem.getBytes(StandardCharsets.UTF_8));
    }
}
