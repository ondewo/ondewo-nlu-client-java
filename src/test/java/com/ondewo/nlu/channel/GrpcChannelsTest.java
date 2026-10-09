package com.ondewo.nlu.channel;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import io.grpc.CallOptions;
import io.grpc.ChannelCredentials;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.InsecureServerCredentials;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Server;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerCredentials;
import io.grpc.ServerInterceptor;
import io.grpc.ServerInterceptors;
import io.grpc.ServerServiceDefinition;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.TlsChannelCredentials;
import io.grpc.TlsServerCredentials;
import io.grpc.stub.ClientCalls;
import io.grpc.stub.ServerCalls;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/**
 * Real TLS and mutual-TLS handshakes between {@link GrpcChannels} and an in-process Netty server
 * on a loopback socket, with a PKI generated at test time. An RPC that reaches the server proves
 * the handshake; a refused handshake surfaces as {@code UNAVAILABLE}, never as a crash.
 */
class GrpcChannelsTest {

    /** A trivial unary echo method, so the test does not depend on any generated service. */
    private static final MethodDescriptor<byte[], byte[]> ECHO =
            MethodDescriptor.<byte[], byte[]>newBuilder()
                    .setType(MethodDescriptor.MethodType.UNARY)
                    .setFullMethodName("ondewo.test.Echo/Echo")
                    .setRequestMarshaller(BytesMarshaller.INSTANCE)
                    .setResponseMarshaller(BytesMarshaller.INSTANCE)
                    .build();

    private static TestPki pki;

    private final List<ManagedChannel> channels = new ArrayList<>();
    private final AtomicReference<String> clientSubject = new AtomicReference<>();
    private Server server;

    @BeforeAll
    static void generatePki() throws Exception {
        pki = TestPki.generate();
    }

    @AfterEach
    void shutDown() throws Exception {
        for (final ManagedChannel channel : channels) {
            channel.shutdownNow().awaitTermination(10, TimeUnit.SECONDS);
        }
        if (server != null) {
            server.shutdownNow().awaitTermination(10, TimeUnit.SECONDS);
        }
    }

    // region servers

    private enum ClientAuth {
        NONE,
        REQUIRE
    }

    private static ServerCredentials tlsServer(
            final ClientAuth clientAuth, final String certPem, final String keyPem)
            throws IOException {
        final TlsServerCredentials.Builder tls =
                TlsServerCredentials.newBuilder().keyManager(stream(certPem), stream(keyPem));
        if (clientAuth == ClientAuth.REQUIRE) {
            tls.trustManager(stream(pki.ca.certPem))
                    .clientAuth(TlsServerCredentials.ClientAuth.REQUIRE);
        }
        return tls.build();
    }

    private int startServer(final ServerCredentials credentials) throws IOException {
        final ServerServiceDefinition echo =
                ServerServiceDefinition.builder("ondewo.test.Echo")
                        .addMethod(
                                ECHO,
                                ServerCalls.asyncUnaryCall(
                                        (request, observer) -> {
                                            observer.onNext(request);
                                            observer.onCompleted();
                                        }))
                        .build();
        final ServerInterceptor peerCapture =
                new ServerInterceptor() {
                    @Override
                    public <Q, S> ServerCall.Listener<Q> interceptCall(
                            final ServerCall<Q, S> call,
                            final Metadata headers,
                            final ServerCallHandler<Q, S> next) {
                        clientSubject.set(
                                peerSubject(
                                        call.getAttributes().get(Grpc.TRANSPORT_ATTR_SSL_SESSION)));
                        return next.startCall(call, headers);
                    }
                };
        server =
                Grpc.newServerBuilderForPort(0, credentials)
                        .addService(ServerInterceptors.intercept(echo, peerCapture))
                        .build()
                        .start();
        return ((InetSocketAddress) server.getListenSockets().get(0)).getPort();
    }

    private static String peerSubject(final SSLSession session) {
        if (session == null) {
            return null;
        }
        try {
            final Certificate[] peer = session.getPeerCertificates();
            return ((X509Certificate) peer[0]).getSubjectX500Principal().getName();
        } catch (final SSLPeerUnverifiedException e) {
            return "";
        }
    }

    // endregion

    // region client

    private ClientConfig.Builder client(final int port) {
        return ClientConfig.builder().host("localhost").port(port);
    }

    private byte[] echo(final ClientConfig config) {
        final ManagedChannel channel = GrpcChannels.newChannel(config);
        channels.add(channel);
        return ClientCalls.blockingUnaryCall(
                channel,
                ECHO,
                CallOptions.DEFAULT.withDeadlineAfter(20, TimeUnit.SECONDS),
                "ping".getBytes(StandardCharsets.UTF_8));
    }

    private void assertHandshakeRefused(final ClientConfig config) {
        final StatusRuntimeException thrown =
                assertThrows(StatusRuntimeException.class, () -> echo(config));

        assertEquals(Status.Code.UNAVAILABLE, thrown.getStatus().getCode(), thrown.toString());
    }

    // endregion

    // region real handshakes

    @Test
    void serverAuthenticatedTlsWithACustomCa() throws Exception {
        final int port =
                startServer(tlsServer(ClientAuth.NONE, pki.server.certPem, pki.server.keyPem));

        final byte[] reply = echo(client(port).grpcCert(pki.ca.certPem).build());

        assertArrayEquals("ping".getBytes(StandardCharsets.UTF_8), reply);
        assertEquals("", clientSubject.get());
    }

    @Test
    void emptyStringsOnBothHalvesConnectWithPlainTls() throws Exception {
        final int port =
                startServer(tlsServer(ClientAuth.NONE, pki.server.certPem, pki.server.keyPem));

        echo(client(port).grpcCert(pki.ca.certPem).grpcClientCert("").grpcClientKey("").build());

        assertEquals("", clientSubject.get());
    }

    @Test
    void mutualTlsPresentsTheClientIdentity() throws Exception {
        final int port =
                startServer(tlsServer(ClientAuth.REQUIRE, pki.server.certPem, pki.server.keyPem));

        echo(
                client(port)
                        .grpcCert(pki.ca.certPem)
                        .grpcClientCert(pki.client.certPem)
                        .grpcClientKey(pki.client.keyPem)
                        .build());

        assertEquals("CN=ondewo-test-client", clientSubject.get());
    }

    @Test
    void mutualTlsWithCrlfPems() throws Exception {
        final int port =
                startServer(tlsServer(ClientAuth.REQUIRE, pki.server.certPem, pki.server.keyPem));

        echo(
                client(port)
                        .grpcCert(TestPki.crlf(pki.ca.certPem))
                        .grpcClientCert(TestPki.crlf(pki.client.certPem))
                        .grpcClientKey(TestPki.crlf(pki.client.keyPem))
                        .build());

        assertEquals("CN=ondewo-test-client", clientSubject.get());
    }

    @Test
    void mutualTlsOverIpv6Loopback() throws Exception {
        assumeTrue(ipv6LoopbackAvailable(), "no IPv6 loopback in this environment");
        final int port =
                startServer(tlsServer(ClientAuth.REQUIRE, pki.server.certPem, pki.server.keyPem));
        final ClientConfig config =
                ClientConfig.builder()
                        .host("::1")
                        .port(port)
                        .grpcCert(pki.ca.certPem)
                        .grpcClientCert(pki.client.certPem)
                        .grpcClientKey(pki.client.keyPem)
                        .build();

        assertEquals("[::1]:" + port, config.target());
        echo(config);

        assertEquals("CN=ondewo-test-client", clientSubject.get());
    }

    @Test
    void aServerRequiringClientCertificatesRejectsAClientWithout() throws Exception {
        final int port =
                startServer(tlsServer(ClientAuth.REQUIRE, pki.server.certPem, pki.server.keyPem));

        assertHandshakeRefused(client(port).grpcCert(pki.ca.certPem).build());
        assertNull(clientSubject.get());
    }

    @Test
    void aClientIdentityFromAnUnrelatedCaIsRejected() throws Exception {
        final int port =
                startServer(tlsServer(ClientAuth.REQUIRE, pki.server.certPem, pki.server.keyPem));

        assertHandshakeRefused(
                client(port)
                        .grpcCert(pki.ca.certPem)
                        .grpcClientCert(pki.otherClient.certPem)
                        .grpcClientKey(pki.otherClient.keyPem)
                        .build());
        assertNull(clientSubject.get());
    }

    @Test
    void theWrongCaFailsTheHandshake() throws Exception {
        final int port =
                startServer(tlsServer(ClientAuth.NONE, pki.server.certPem, pki.server.keyPem));

        assertHandshakeRefused(client(port).grpcCert(pki.otherCa.certPem).build());
        assertNull(clientSubject.get());
    }

    @Test
    void withoutGrpcCertTheJvmTrustStoreIsUsedAndRejectsATestCa() throws Exception {
        final int port =
                startServer(tlsServer(ClientAuth.NONE, pki.server.certPem, pki.server.keyPem));

        assertHandshakeRefused(client(port).build());
        assertNull(clientSubject.get());
    }

    @Test
    void aPlaintextChannelReachesAPlaintextServerAndWarns() throws Exception {
        final int port = startServer(InsecureServerCredentials.create());
        final List<LogRecord> records = captureWarnings();

        echo(client(port).useSecureChannel(false).build());

        assertNull(clientSubject.get());
        assertEquals(1, records.size());
        assertEquals(Level.WARNING, records.get(0).getLevel());
        assertEquals("localhost:" + port, records.get(0).getParameters()[0]);
    }

    // endregion

    // region unit

    @Test
    void anInsecureConfigYieldsInsecureCredentialsAndNamesHostAndPortInTheWarning() {
        final List<LogRecord> records = captureWarnings();

        final ChannelCredentials credentials =
                GrpcChannels.credentials(
                        ClientConfig.builder()
                                .host("::1")
                                .port(50051)
                                .useSecureChannel(false)
                                .build());

        assertInstanceOf(InsecureChannelCredentials.class, credentials);
        assertEquals(1, records.size());
        final String message =
                new java.text.MessageFormat(records.get(0).getMessage())
                        .format(records.get(0).getParameters());
        assertTrue(message.contains("[::1]:50051"), message);
        assertTrue(message.contains("INSECURE"), message);
    }

    @Test
    void aSecureConfigWithoutCertificatesTrustsTheJvmStoreAndPresentsNoIdentity() {
        final TlsChannelCredentials credentials =
                (TlsChannelCredentials) GrpcChannels.credentials(client(50051).build());

        assertNull(credentials.getRootCertificates());
        assertNull(credentials.getCertificateChain());
        assertNull(credentials.getPrivateKey());
    }

    @Test
    void aMutualTlsConfigCarriesTheCaAndTheIdentity() {
        final TlsChannelCredentials credentials =
                (TlsChannelCredentials)
                        GrpcChannels.credentials(
                                client(50051)
                                        .grpcCert(pki.ca.certPem)
                                        .grpcClientCert(pki.client.certPem)
                                        .grpcClientKey(pki.client.keyPem)
                                        .build());

        assertArrayEquals(bytes(pki.ca.certPem), credentials.getRootCertificates());
        assertArrayEquals(bytes(pki.client.certPem), credentials.getCertificateChain());
        assertArrayEquals(bytes(pki.client.keyPem), credentials.getPrivateKey());
    }

    @Test
    void anUnreadableStreamBecomesAnUncheckedIoException() {
        final InputStream broken =
                new InputStream() {
                    @Override
                    public int read() throws IOException {
                        throw new IOException("boom");
                    }
                };

        final UncheckedIOException thrown =
                assertThrows(
                        UncheckedIOException.class,
                        () -> GrpcChannels.tlsCredentials(broken, null, null));

        assertEquals("could not read the TLS material of the channel", thrown.getMessage());
    }

    private static void assertRefusedWithoutEchoing(
            final ClientConfig config, final String secret) {
        final IllegalArgumentException thrown =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> GrpcChannels.newChannelBuilder(config));

        assertTrue(
                thrown.getMessage()
                        .startsWith(
                                "GrpcChannels: could not create the channel to localhost:50051."));
        assertFalse(thrown.getMessage().contains(secret), thrown.getMessage());
        assertFalse(String.valueOf(thrown.getCause().getMessage()).contains(secret));
    }

    @Test
    void aGrpcCertThatIsAPathInsteadOfPemIsRefusedWithoutEchoingIt() {
        assertRefusedWithoutEchoing(
                client(50051).grpcCert("/etc/ondewo/certs/ca.pem").build(), "/etc/ondewo");
    }

    @Test
    void aClientKeyThatIsNotPemIsRefusedWithoutEchoingIt() {
        assertRefusedWithoutEchoing(
                client(50051)
                        .grpcCert(pki.ca.certPem)
                        .grpcClientCert(pki.client.certPem)
                        .grpcClientKey("s3cr3t-not-a-pem-key")
                        .build(),
                "s3cr3t");
    }

    @Test
    void aClientCertThatIsNotPemIsRefusedWithoutEchoingIt() {
        assertRefusedWithoutEchoing(
                client(50051)
                        .grpcClientCert("not-a-certificate")
                        .grpcClientKey(pki.client.keyPem)
                        .build(),
                pki.client.keyPem.split("\n")[1]);
    }

    @Test
    void pinsTheChannelDefaults() {
        assertEquals(300_000L, GrpcChannels.KEEPALIVE_TIME_MS);
        assertEquals(20_000L, GrpcChannels.KEEPALIVE_TIMEOUT_MS);
        assertEquals(Integer.MAX_VALUE, GrpcChannels.MAX_MESSAGE_LENGTH);
    }

    // endregion

    // region helpers

    private static boolean ipv6LoopbackAvailable() {
        try (ServerSocket socket = new ServerSocket()) {
            socket.bind(new InetSocketAddress(InetAddress.getByName("::1"), 0));
            return true;
        } catch (final IOException e) {
            return false;
        }
    }

    private static List<LogRecord> captureWarnings() {
        final List<LogRecord> records = new ArrayList<>();
        final Logger logger = Logger.getLogger(GrpcChannels.class.getName());
        logger.addHandler(
                new Handler() {
                    @Override
                    public void publish(final LogRecord record) {
                        records.add(record);
                    }

                    @Override
                    public void flush() {}

                    @Override
                    public void close() {}
                });
        return records;
    }

    private static byte[] bytes(final String text) {
        return text.getBytes(StandardCharsets.UTF_8);
    }

    private static InputStream stream(final String text) {
        return new ByteArrayInputStream(bytes(text));
    }

    /** Passes the request bytes through unchanged. */
    private enum BytesMarshaller implements MethodDescriptor.Marshaller<byte[]> {
        INSTANCE;

        @Override
        public InputStream stream(final byte[] value) {
            return new ByteArrayInputStream(value);
        }

        @Override
        public byte[] parse(final InputStream stream) {
            try {
                return stream.readAllBytes();
            } catch (final IOException e) {
                throw new UncheckedIOException(e);
            }
        }
    }

    // endregion
}
