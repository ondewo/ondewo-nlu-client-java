package com.ondewo.nlu.auth;

/**
 * The timing constants of {@link KeycloakTokenProvider}. {@link #DEFAULTS} holds the production
 * values, identical in every ONDEWO client SDK; the tests build shrunk ones so a real worker
 * thread can be exercised in milliseconds.
 */
final class KeycloakTimings {

    static final KeycloakTimings DEFAULTS =
            new KeycloakTimings(
                    KeycloakTokenProvider.EXPIRY_LEEWAY_S,
                    KeycloakTokenProvider.MIN_REFRESH_DELAY_S,
                    KeycloakTokenProvider.RETRY_BASE_DELAY_S,
                    KeycloakTokenProvider.RETRY_MAX_DELAY_S,
                    KeycloakTokenProvider.HTTP_TIMEOUT_S,
                    KeycloakTokenProvider.THREAD_JOIN_TIMEOUT_S);

    final double expiryLeewayS;
    final double minRefreshDelayS;
    final double retryBaseDelayS;
    final double retryMaxDelayS;
    final double httpTimeoutS;
    final double threadJoinTimeoutS;

    KeycloakTimings(
            final double expiryLeewayS,
            final double minRefreshDelayS,
            final double retryBaseDelayS,
            final double retryMaxDelayS,
            final double httpTimeoutS,
            final double threadJoinTimeoutS) {
        this.expiryLeewayS = expiryLeewayS;
        this.minRefreshDelayS = minRefreshDelayS;
        this.retryBaseDelayS = retryBaseDelayS;
        this.retryMaxDelayS = retryMaxDelayS;
        this.httpTimeoutS = httpTimeoutS;
        this.threadJoinTimeoutS = threadJoinTimeoutS;
    }
}
