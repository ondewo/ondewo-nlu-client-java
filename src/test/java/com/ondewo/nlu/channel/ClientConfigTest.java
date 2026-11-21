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
                        + " grpcClientCert=, grpcClientKey=, keycloakUrl=, realm=, clientId=,"
                        + " username=, password=, tokenExpirationInS=null, keycloakVerifySsl=true,"
                        + " refreshToken=}",
                base().build().toString());
    }

    // region Keycloak (catalogue T55-T62)

    private static ClientConfig.Builder keycloak() {
        return base().keycloakUrl("https://keycloak.example/auth")
                .realm("ondewo-test-realm")
                .clientId("ondewo-nlu-cai-sdk-public")
                .username("technical-user@example.com");
    }

    @Test
    void t62WithoutTheTripleKeycloakIsNotConfigured() {
        final ClientConfig config = base().username("u").password("p").refreshToken("t").build();
        assertFalse(config.isKeycloakConfigured());
        assertFalse(config.keycloakCredentials().isPresent());
        assertEquals("", config.getKeycloakUrl());
        assertEquals("", config.getRealm());
        assertEquals("", config.getClientId());
    }

    @Test
    void t58APasswordConfigIsKeycloakConfiguredAndKeepsEveryValue() {
        final ClientConfig config =
                keycloak().password("pw-1").tokenExpirationInS(600).keycloakVerifySsl(false).build();
        assertTrue(config.isKeycloakConfigured());
        assertEquals("https://keycloak.example/auth", config.getKeycloakUrl());
        assertEquals("ondewo-test-realm", config.getRealm());
        assertEquals("ondewo-nlu-cai-sdk-public", config.getClientId());
        assertEquals("technical-user@example.com", config.getUsername());
        assertEquals("pw-1", config.getPassword());
        assertEquals(600, config.getTokenExpirationInS());
        assertFalse(config.isKeycloakVerifySsl());
        assertEquals("", config.getRefreshToken());
        final com.ondewo.nlu.auth.KeycloakCredentials credentials = config.keycloakCredentials().get();
        assertEquals("pw-1", credentials.getPassword());
        assertEquals(600, credentials.getTokenExpirationInS());
        assertFalse(credentials.isVerifySsl());
    }

    @Test
    void t56T60ATokenOnlyConfigIsValidAndCarriesTheTokenWithAnEmptyPassword() {
        final ClientConfig config = keycloak().refreshToken("off-handed-0").build();
        assertTrue(config.isKeycloakConfigured());
        final com.ondewo.nlu.auth.KeycloakCredentials credentials = config.keycloakCredentials().get();
        assertEquals("off-handed-0", credentials.getRefreshToken());
        assertEquals("", credentials.getPassword());
        assertTrue(credentials.isVerifySsl());
        assertEquals(null, credentials.getTokenExpirationInS());
    }

    @Test
    void t57TheTripleWithNeitherPasswordNorTokenIsRefused() {
        final IllegalArgumentException raised =
                assertThrows(IllegalArgumentException.class, () -> keycloak().password(null).refreshToken(null).build());
        assertEquals(
                "Either the field `password` or the field `refresh_token` is mandatory in ClientConfig.",
                raised.getMessage());
    }

    @ParameterizedTest
    @CsvSource({"u,'',''", "'',r,''", "'','',c", "u,r,''", "u,'',c", "'',r,c"})
    void t61APartialTripleIsRefusedNamingTheThreeFields(final String url, final String realm, final String clientId) {
        final IllegalArgumentException raised =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> base().keycloakUrl(url).realm(realm).clientId(clientId).password("p").build());
        assertEquals(
                "The Keycloak fields `keycloak_url`, `realm`, and `client_id` must be provided together"
                        + " in ClientConfig.",
                raised.getMessage());
    }

    @Test
    void v3ANonKeycloakConfigNeedsNoCredential() {
        assertFalse(base().build().isKeycloakConfigured());
    }

    @Test
    void t59RenderingRedactsThePasswordAndTheRefreshToken() {
        final String rendered =
                keycloak().password("pw-never-logged-5d1c").refreshToken("off-secret-1").build().toString();
        assertFalse(rendered.contains("pw-never-logged-5d1c"), rendered);
        assertFalse(rendered.contains("off-secret-1"), rendered);
        assertTrue(rendered.contains("password=" + ClientConfig.REDACTED), rendered);
        assertTrue(rendered.contains("refreshToken=" + ClientConfig.REDACTED + "}"), rendered);
        assertTrue(rendered.contains("keycloakUrl=https://keycloak.example/auth"), rendered);

        final String tokenOnly = keycloak().refreshToken("off-secret-1").build().toString();
        assertTrue(tokenOnly.contains("password=, "), tokenOnly);
    }

    @Test
    void t55TheBuilderHasNoPositionalSurfaceAndAcceptsTheFieldsInAnyOrder() {
        final ClientConfig config =
                base().refreshToken("off-1").clientId("c").username("u").realm("r").keycloakUrl("k").build();
        assertEquals("off-1", config.keycloakCredentials().get().getRefreshToken());
    }

    // endregion
}
