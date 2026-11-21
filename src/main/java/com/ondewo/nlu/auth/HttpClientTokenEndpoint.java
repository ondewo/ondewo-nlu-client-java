package com.ondewo.nlu.auth;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.time.Duration;
import java.util.Map;
import java.util.StringJoiner;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509ExtendedTrustManager;

/**
 * The default {@link TokenEndpoint}: {@code java.net.http.HttpClient}, with the request timeout
 * the provider asks for and the connect timeout bounded by the same value.
 *
 * <p>{@code verifySsl = false} gives THIS client a trust-all {@link SSLContext} that also skips
 * the host name check. It is scoped to the token-endpoint call: no JVM-wide default and no system
 * property is touched.
 */
final class HttpClientTokenEndpoint implements TokenEndpoint {

    private final HttpClient client;

    /** @param verifySsl whether Keycloak's TLS certificate (and host name) is verified */
    HttpClientTokenEndpoint(final boolean verifySsl) {
        final HttpClient.Builder builder =
                HttpClient.newBuilder()
                        .connectTimeout(seconds(KeycloakTokenProvider.HTTP_TIMEOUT_S))
                        .followRedirects(HttpClient.Redirect.NEVER);
        if (!verifySsl) {
            builder.sslContext(trustAllContext("TLS"));
        }
        this.client = builder.build();
    }

    @Override
    public TokenHttpResponse post(
            final String url, final Map<String, String> form, final double timeoutSeconds)
            throws IOException {
        final HttpRequest request =
                HttpRequest.newBuilder(URI.create(url))
                        .timeout(seconds(timeoutSeconds))
                        .header("Content-Type", "application/x-www-form-urlencoded")
                        .header("Accept", "application/json")
                        .POST(HttpRequest.BodyPublishers.ofString(encode(form)))
                        .build();
        try {
            final HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            return new TokenHttpResponse(response.statusCode(), response.body());
        } catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
            final InterruptedIOException interrupted =
                    new InterruptedIOException("interrupted while waiting for the token endpoint");
            interrupted.initCause(e);
            throw interrupted;
        }
    }

    /**
     * @param form the fields
     * @return {@code application/x-www-form-urlencoded} body, fields in iteration order
     */
    static String encode(final Map<String, String> form) {
        final StringJoiner body = new StringJoiner("&");
        for (final Map.Entry<String, String> field : form.entrySet()) {
            body.add(
                    URLEncoder.encode(field.getKey(), StandardCharsets.UTF_8)
                            + "="
                            + URLEncoder.encode(field.getValue(), StandardCharsets.UTF_8));
        }
        return body.toString();
    }

    private static Duration seconds(final double seconds) {
        return Duration.ofNanos((long) (seconds * 1_000_000_000L));
    }

    /**
     * @param protocol the {@link SSLContext} protocol; a parameter only so the test can reach the
     *     failure
     * @return a context that trusts every server certificate
     */
    static SSLContext trustAllContext(final String protocol) {
        try {
            final SSLContext context = SSLContext.getInstance(protocol);
            context.init(null, new TrustManager[] {new TrustAll()}, new SecureRandom());
            return context;
        } catch (final GeneralSecurityException e) {
            throw new IllegalStateException(
                    "could not create the " + protocol + " context of keycloakVerifySsl=false", e);
        }
    }

    /**
     * Accepts every certificate. An {@link X509ExtendedTrustManager}, so JSSE leaves the
     * endpoint (host name) check to it as well - which it skips.
     */
    static final class TrustAll extends X509ExtendedTrustManager {

        @Override
        public void checkClientTrusted(final X509Certificate[] chain, final String authType) {}

        @Override
        public void checkServerTrusted(final X509Certificate[] chain, final String authType) {}

        @Override
        public void checkClientTrusted(
                final X509Certificate[] chain, final String authType, final Socket socket) {}

        @Override
        public void checkServerTrusted(
                final X509Certificate[] chain, final String authType, final Socket socket) {}

        @Override
        public void checkClientTrusted(
                final X509Certificate[] chain, final String authType, final SSLEngine engine) {}

        @Override
        public void checkServerTrusted(
                final X509Certificate[] chain, final String authType, final SSLEngine engine) {}

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }
}
