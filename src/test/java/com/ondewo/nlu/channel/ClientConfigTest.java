package com.ondewo.nlu.channel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

/** Validation, IPv6 targets and redaction of {@link ClientConfig}. */
class ClientConfigTest {

    private static TestPki pki;

    @BeforeAll
    static void generatePki() throws Exception {
        pki = TestPki.generate();
    }

    private static ClientConfig.Builder base() {
        return ClientConfig.builder().host("localhost").port(50051);
    }

    /** No message may carry PEM material: neither a label nor a line of base64 body. */
    private static void assertNoPem(final String text) {
        assertFalse(text.contains("BEGIN"), text);
        assertFalse(text.contains("PRIVATE"), text);
        for (final String pem :
                new String[] {pki.client.keyPem, pki.client.certPem, pki.ca.certPem}) {
            final String firstBodyLine = pem.split("\n")[1];
            assertFalse(text.contains(firstBodyLine), text);
        }
    }

    @Test
    void defaultsToASecureChannelWithoutCertificates() {
        final ClientConfig config = base().build();

        assertEquals("localhost", config.getHost());
        assertEquals(50051, config.getPort());
        assertTrue(config.isUseSecureChannel());
        assertEquals("", config.getGrpcCert());
        assertEquals("", config.getGrpcClientCert());
        assertEquals("", config.getGrpcClientKey());
        assertFalse(config.hasClientIdentity());
    }

    @Test
    void keepsEveryValueItIsGiven() {
        final ClientConfig config =
                base().grpcCert(pki.ca.certPem)
                        .grpcClientCert(pki.client.certPem)
                        .grpcClientKey(pki.client.keyPem)
                        .build();

        assertEquals(pki.ca.certPem, config.getGrpcCert());
        assertEquals(pki.client.certPem, config.getGrpcClientCert());
        assertEquals(pki.client.keyPem, config.getGrpcClientKey());
        assertTrue(config.hasClientIdentity());
    }

    @Test
    void treatsNullCertificatesAsUnset() {
        final ClientConfig config =
                base().grpcCert(null).grpcClientCert(null).grpcClientKey(null).build();

        assertEquals("", config.getGrpcCert());
        assertFalse(config.hasClientIdentity());
    }

    @Test
    void emptyStringsOnBothHalvesMeanNoClientIdentity() {
        final ClientConfig config = base().grpcClientCert("").grpcClientKey("").build();

        assertFalse(config.hasClientIdentity());
    }

    @ParameterizedTest(name = "rejects host [{0}]")
    @NullSource
    @ValueSource(strings = {"", "  "})
    void rejectsABlankHost(final String host) {
        final IllegalArgumentException thrown =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> ClientConfig.builder().host(host).port(1).build());

        assertEquals("ClientConfig: host must not be blank", thrown.getMessage());
    }

    @ParameterizedTest(name = "rejects port {0}")
    @ValueSource(ints = {0, -1, 65536})
    void rejectsAPortOutOfRange(final int port) {
        final IllegalArgumentException thrown =
                assertThrows(IllegalArgumentException.class, () -> base().port(port).build());

        assertEquals(
                "ClientConfig: port must be between 1 and 65535, got " + port, thrown.getMessage());
    }

    @ParameterizedTest(name = "accepts port {0}")
    @ValueSource(ints = {1, 65535})
    void acceptsThePortBounds(final int port) {
        assertEquals(port, base().port(port).build().getPort());
    }

    @Test
    void refusesACertificateWithoutItsKey() {
        final IllegalArgumentException thrown =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> base().grpcClientCert(pki.client.certPem).build());

        assertTrue(thrown.getMessage().contains("only grpcClientCert is set"), thrown.getMessage());
        assertNoPem(thrown.getMessage());
    }

    @Test
    void refusesAKeyWithoutItsCertificate() {
        final IllegalArgumentException thrown =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> base().grpcClientKey(pki.client.keyPem).build());

        assertTrue(thrown.getMessage().contains("only grpcClientKey is set"), thrown.getMessage());
        assertNoPem(thrown.getMessage());
    }

    @Test
    void refusesToDropAClientIdentityOnAPlaintextChannel() {
        final IllegalArgumentException thrown =
                assertThrows(
                        IllegalArgumentException.class,
                        () ->
                                base().useSecureChannel(false)
                                        .grpcClientCert(pki.client.certPem)
                                        .grpcClientKey(pki.client.keyPem)
                                        .build());

        assertTrue(thrown.getMessage().contains("useSecureChannel=false"), thrown.getMessage());
        assertTrue(thrown.getMessage().contains("localhost:50051"), thrown.getMessage());
        assertNoPem(thrown.getMessage());
    }

    @Test
    void allowsAPlaintextChannelWithoutIdentity() {
        assertFalse(base().useSecureChannel(false).build().isUseSecureChannel());
    }

    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource({
        "localhost, localhost:50051",
        "10.0.0.5, 10.0.0.5:50051",
        "::1, [::1]:50051",
        "2001:db8::42, [2001:db8::42]:50051",
        "::ffff:10.0.0.5, [::ffff:10.0.0.5]:50051",
        "fe80::1%eth0, [fe80::1%eth0]:50051",
        "[::1], [::1]:50051",
        "dns:///nlu.example.com, dns:///nlu.example.com:50051",
        "cafe:50, cafe:50:50051",
        "fe80::g1, fe80::g1:50051",
    })
    void bracketsOnlyBareIpv6LiteralsInTheTarget(final String host, final String target) {
        assertEquals(target, base().host(host).build().target());
    }

    @Test
    void toStringRedactsTheKeyAndShowsNoPem() {
        final ClientConfig config =
                base().grpcCert(pki.ca.certPem)
                        .grpcClientCert(pki.client.certPem)
                        .grpcClientKey(pki.client.keyPem)
                        .build();

        final String rendered = config.toString();

        assertTrue(rendered.contains("grpcClientKey=" + ClientConfig.REDACTED), rendered);
        assertTrue(rendered.contains("grpcCert=<PEM, " + pki.ca.certPem.length() + " chars>"));
        assertTrue(rendered.contains("host=localhost, port=50051, useSecureChannel=true"));
        assertNoPem(rendered);
    }

    @Test
    void toStringRendersAnUnsetSecretEmpty() {
        assertEquals(
                "ClientConfig{host=localhost, port=50051, useSecureChannel=true, grpcCert=,"
                        + " grpcClientCert=, grpcClientKey=}",
                base().build().toString());
    }
}
