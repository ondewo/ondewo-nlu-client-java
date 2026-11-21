package com.ondewo.nlu.auth;

import java.io.IOException;
import java.util.Map;

/**
 * The HTTP transport of the Keycloak token endpoint. The default is {@link HttpClientTokenEndpoint};
 * the unit tests inject a scripted fake, so no test needs a network.
 */
interface TokenEndpoint {

    /**
     * Sends an {@code application/x-www-form-urlencoded} POST.
     *
     * @param url the token endpoint
     * @param form the form fields, in the order they are sent
     * @param timeoutSeconds bound of the whole exchange
     * @return the answer, whatever its status
     * @throws IOException if the endpoint cannot be reached (refused, DNS, TLS, timeout)
     */
    TokenHttpResponse post(String url, Map<String, String> form, double timeoutSeconds)
            throws IOException;
}
