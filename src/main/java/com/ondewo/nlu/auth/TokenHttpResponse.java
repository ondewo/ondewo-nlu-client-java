package com.ondewo.nlu.auth;

/** The two parts of a token-endpoint answer {@link KeycloakTokenProvider} reads. */
final class TokenHttpResponse {

    private final int statusCode;
    private final String body;

    /**
     * @param statusCode the HTTP status
     * @param body the raw body; {@code null} is read as empty
     */
    TokenHttpResponse(final int statusCode, final String body) {
        this.statusCode = statusCode;
        this.body = body == null ? "" : body;
    }

    int statusCode() {
        return statusCode;
    }

    String body() {
        return body;
    }
}
