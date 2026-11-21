package com.ondewo.nlu.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpsConfigurator;
import com.sun.net.httpserver.HttpsServer;

import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;
import org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.net.http.HttpTimeoutException;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;

/**
 * The default transport against a real JDK HTTP(S) server on loopback: the form, the headers,
 * the timeout, a refused connection, an interrupted wait, and {@code keycloakVerifySsl}.
 */
class HttpClientTokenEndpointTest {

    private final List<String> bodies = Collections.synchronizedList(new ArrayList<>());
    private final List<String> contentTypes = Collections.synchronizedList(new ArrayList<>());
    private HttpServer server;

    @AfterEach
    void stop() {
        if (server != null) {
            server.stop(0);
        }
    }

    private String start(final HttpServer created, final int status, final String body, final long delayMillis) {
        server = created;
        server.createContext("/", exchange -> answer(exchange, status, body, delayMillis));
        server.start();
        return (server instanceof HttpsServer ? "https" : "http") + "://127.0.0.1:" + server.getAddress().getPort();
    }

    private void answer(final HttpExchange exchange, final int status, final String body, final long delayMillis)
            throws IOException {
        bodies.add(new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8));
        contentTypes.add(exchange.getRequestHeaders().getFirst("Content-Type"));
        if (delayMillis > 0) {
            try {
                Thread.sleep(delayMillis);
            } catch (final InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        final byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
        exchange.sendResponseHeaders(status, bytes.length == 0 ? -1 : bytes.length);
        try (OutputStream out = exchange.getResponseBody()) {
            out.write(bytes);
        }
    }

    private static HttpServer http() throws IOException {
        return HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
    }

    private static Map<String, String> form() {
        final Map<String, String> form = new LinkedHashMap<>();
        form.put("grant_type", "password");
        form.put("username", "user@example.com");
        form.put("password", "p&ss=w rd/ü");
        return form;
    }

    @Test
    void postsTheFormUrlEncodedAndReturnsStatusAndBody() throws Exception {
        final String url = start(http(), 401, "{\"error\":\"invalid_grant\"}", 0);

        final TokenHttpResponse response = new HttpClientTokenEndpoint(true).post(url + "/t", form(), 10);

        assertEquals(401, response.statusCode());
        assertEquals("{\"error\":\"invalid_grant\"}", response.body());
        assertEquals("application/x-www-form-urlencoded", contentTypes.get(0));
        final String sent = bodies.get(0);
        assertEquals("grant_type=password&username=user%40example.com&password=p%26ss%3Dw+rd%2F%C3%BC", sent);
        assertEquals("p&ss=w rd/ü", URLDecoder.decode(sent.split("&")[2].substring("password=".length()), StandardCharsets.UTF_8));
    }

    @Test
    void anEmptyBodyIsEmpty() throws Exception {
        final String url = start(http(), 502, "", 0);
        assertEquals("", new HttpClientTokenEndpoint(true).post(url, form(), 10).body());
    }

    @Test
    void aSlowEndpointTimesOutWithinTheBound() throws Exception {
        final String url = start(http(), 200, "{}", 3_000);
        final long started = System.nanoTime();
        assertThrows(HttpTimeoutException.class, () -> new HttpClientTokenEndpoint(true).post(url, form(), 0.3));
        assertTrue(System.nanoTime() - started < 2_500_000_000L);
    }

    @Test
    void aRefusedConnectionIsAnIoException() {
        assertThrows(IOException.class, () -> new HttpClientTokenEndpoint(true).post("http://127.0.0.1:1/t", form(), 10));
    }

    @Test
    void anInterruptedWaitIsAnInterruptedIoExceptionAndKeepsTheFlag() throws Exception {
        final String url = start(http(), 200, "{}", 2_000);
        Thread.currentThread().interrupt();
        try {
            final InterruptedIOException raised =
                    assertThrows(InterruptedIOException.class, () -> new HttpClientTokenEndpoint(true).post(url, form(), 10));
            assertInstanceOf(InterruptedException.class, raised.getCause());
            assertTrue(Thread.currentThread().isInterrupted());
        } finally {
            Thread.interrupted();
        }
    }

    @Test
    void aSelfSignedKeycloakIsRefusedWhenVerifiedAndAcceptedWhenNot() throws Exception {
        final HttpsServer https = HttpsServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
        https.setHttpsConfigurator(new HttpsConfigurator(selfSignedContext()));
        // CN=keycloak.invalid: the trust-all path must skip the host name check as well.
        final String url = start(https, 200, "{\"access_token\":\"a\"}", 0);

        final IOException refused =
                assertThrows(IOException.class, () -> new HttpClientTokenEndpoint(true).post(url, form(), 10));
        assertTrue(refused instanceof SSLHandshakeException || refused.getCause() instanceof SSLHandshakeException, refused.toString());

        final TokenHttpResponse accepted = new HttpClientTokenEndpoint(false).post(url, form(), 10);
        assertEquals(200, accepted.statusCode());
        assertEquals("{\"access_token\":\"a\"}", accepted.body());
    }

    @Test
    void theTrustAllManagerAcceptsEverythingAndListsNoIssuer() {
        final HttpClientTokenEndpoint.TrustAll trustAll = new HttpClientTokenEndpoint.TrustAll();
        final X509Certificate[] none = new X509Certificate[0];
        trustAll.checkClientTrusted(none, "RSA");
        trustAll.checkServerTrusted(none, "RSA");
        trustAll.checkClientTrusted(none, "RSA", (java.net.Socket) null);
        trustAll.checkServerTrusted(none, "RSA", (java.net.Socket) null);
        trustAll.checkClientTrusted(none, "RSA", (javax.net.ssl.SSLEngine) null);
        trustAll.checkServerTrusted(none, "RSA", (javax.net.ssl.SSLEngine) null);
        assertEquals(0, trustAll.getAcceptedIssuers().length);
    }

    @Test
    void anUnknownProtocolIsAnIllegalState() {
        final IllegalStateException raised =
                assertThrows(IllegalStateException.class, () -> HttpClientTokenEndpoint.trustAllContext("NO-SUCH-TLS"));
        assertInstanceOf(NoSuchAlgorithmException.class, raised.getCause());
        assertFalse(raised.getMessage().contains("password"));
    }

    @Test
    void anEmptyFormIsAnEmptyBody() {
        assertEquals("", HttpClientTokenEndpoint.encode(Collections.emptyMap()));
    }

    @Test
    void theProviderRunsEndToEndOverTheRealTransport() throws Exception {
        final String url = start(http(), 200, "{\"access_token\":\"acc-real\",\"expires_in\":300,\"refresh_token\":\"off-real\"}", 0);
        try (KeycloakTokenProvider provider =
                new KeycloakTokenProvider(url + "/auth/", "realm-x", "client-x", "user-x", "pw-x", null, true, "")) {
            assertEquals("Bearer acc-real", provider.authorizationHeaderValue());
            assertTrue(provider.worker.isAlive());
        }
        assertEquals("grant_type=password&client_id=client-x&username=user-x&password=pw-x&scope=offline_access", bodies.get(0));
    }

    @Test
    void theSharedProviderLogsInOnceForTheSameCredentials() throws Exception {
        final String url = start(http(), 200, "{\"access_token\":\"acc-shared\",\"expires_in\":300}", 0);
        final KeycloakCredentials credentials =
                new KeycloakCredentials(url + "/auth", "realm-s", "client-s", "", "", null, true, "off-shared");
        final KeycloakTokenProvider first = KeycloakTokenProvider.shared(credentials);
        try {
            assertSame(first, KeycloakTokenProvider.shared(credentials));
            assertEquals("acc-shared", first.getAccessToken());
            assertEquals(Collections.singletonList("grant_type=refresh_token&client_id=client-s&refresh_token=off-shared"), bodies);
        } finally {
            first.close();
        }
    }

    private static SSLContext selfSignedContext() throws Exception {
        final KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048);
        final KeyPair keys = generator.generateKeyPair();
        final X500Name name = new X500Name("CN=keycloak.invalid");
        final Date now = new Date();
        final X509Certificate certificate =
                new JcaX509CertificateConverter()
                        .getCertificate(
                                new JcaX509v3CertificateBuilder(
                                                name, BigInteger.ONE, new Date(now.getTime() - 60_000),
                                                new Date(now.getTime() + 3_600_000), name, keys.getPublic())
                                        .build(new JcaContentSignerBuilder("SHA256withRSA").build(keys.getPrivate())));
        final KeyStore store = KeyStore.getInstance("PKCS12");
        store.load(null, null);
        store.setKeyEntry("k", keys.getPrivate(), new char[0], new X509Certificate[] {certificate});
        final KeyManagerFactory factory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        factory.init(store, new char[0]);
        final SSLContext context = SSLContext.getInstance("TLS");
        context.init(factory.getKeyManagers(), null, null);
        return context;
    }
}
