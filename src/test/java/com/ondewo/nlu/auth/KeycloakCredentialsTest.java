package com.ondewo.nlu.auth;

import static com.ondewo.nlu.auth.Fakes.CLIENT_ID;
import static com.ondewo.nlu.auth.Fakes.KEYCLOAK_URL;
import static com.ondewo.nlu.auth.Fakes.PASSWORD;
import static com.ondewo.nlu.auth.Fakes.REALM;
import static com.ondewo.nlu.auth.Fakes.USERNAME;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.security.NoSuchAlgorithmException;

/** Validation, redaction (T59) and the registry key (T52, T53) of {@link KeycloakCredentials}. */
class KeycloakCredentialsTest {

    private static KeycloakCredentials of(final String password, final String refreshToken) {
        return new KeycloakCredentials(KEYCLOAK_URL, REALM, CLIENT_ID, USERNAME, password, null, true, refreshToken);
    }

    @Test
    void keepsEveryValueInPositionalOrderWithTheRefreshTokenLast() {
        final KeycloakCredentials credentials =
                new KeycloakCredentials(KEYCLOAK_URL, REALM, CLIENT_ID, USERNAME, PASSWORD, 120, false, "off-1");
        assertEquals(KEYCLOAK_URL, credentials.getKeycloakUrl());
        assertEquals(REALM, credentials.getRealm());
        assertEquals(CLIENT_ID, credentials.getClientId());
        assertEquals(USERNAME, credentials.getUsername());
        assertEquals(PASSWORD, credentials.getPassword());
        assertEquals(120, credentials.getTokenExpirationInS());
        assertFalse(credentials.isVerifySsl());
        assertEquals("off-1", credentials.getRefreshToken());
    }

    @Test
    void nullsAreEmpty() {
        final KeycloakCredentials credentials =
                new KeycloakCredentials(KEYCLOAK_URL, REALM, CLIENT_ID, null, null, null, true, "off-1");
        assertEquals("", credentials.getUsername());
        assertEquals("", credentials.getPassword());
        assertNull(credentials.getTokenExpirationInS());
        assertThrows(IllegalArgumentException.class, () -> of(null, null));
    }

    @ParameterizedTest
    @CsvSource({"'',r,c", "u,'',c", "u,r,''", "'','',''"})
    void t61AnIncompleteTripleIsRefusedNamingTheThreeFields(final String url, final String realm, final String clientId) {
        final IllegalArgumentException raised =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> new KeycloakCredentials(url, realm, clientId, USERNAME, PASSWORD, null, true, ""));
        assertEquals(
                "The Keycloak fields `keycloak_url`, `realm`, and `client_id` must be provided together in KeycloakCredentials.",
                raised.getMessage());
    }

    @Test
    void t57NeitherPasswordNorTokenIsRefused() {
        final IllegalArgumentException raised = assertThrows(IllegalArgumentException.class, () -> of("", ""));
        assertTrue(raised.getMessage().contains("`password`"));
        assertTrue(raised.getMessage().contains("`refresh_token`"));
    }

    @Test
    void t56TokenOnlyAndPasswordOnlyAndBothAreValid() {
        assertEquals("off-1", of("", "off-1").getRefreshToken());
        assertEquals(PASSWORD, of(PASSWORD, "").getPassword());
        assertEquals("off-1", of(PASSWORD, "off-1").getRefreshToken());
    }

    @Test
    void t59RenderingRedactsSetSecretsAndShowsEmptyOnes() {
        final String withBoth = of(PASSWORD, "off-secret-1").toString();
        assertFalse(withBoth.contains(PASSWORD));
        assertFalse(withBoth.contains("off-secret-1"));
        assertTrue(withBoth.contains("password=***REDACTED***"), withBoth);
        assertTrue(withBoth.contains("refreshToken=***REDACTED***}"), withBoth);
        assertTrue(withBoth.contains("username=" + USERNAME), withBoth);

        final String tokenOnly = of("", "off-secret-1").toString();
        assertTrue(tokenOnly.contains("password=,"), tokenOnly);
        assertTrue(of(PASSWORD, "").toString().endsWith("refreshToken=}"));

        assertEquals("", KeycloakCredentials.redact(null));
        assertEquals("", KeycloakCredentials.redact(""));
        assertEquals("***REDACTED***", KeycloakCredentials.redact("x"));
    }

    @Test
    void t52T53TheKeyIsAHexDigestWithoutASecret() {
        final String key = of(PASSWORD, "off-secret-key-9").registryKey();
        assertTrue(key.matches("[0-9a-f]{64}"), key);
        assertFalse(key.contains("off-secret-key-9"));
        assertFalse(key.contains(PASSWORD));
    }

    @Test
    void theKeyIsTheSha256OfTheFieldsJoinedWithNul() {
        // The same bytes as the python SDKs: verify_ssl renders as python's str(bool).
        final String expected =
                KeycloakCredentials.sha256Hex(
                        "SHA-256",
                        String.join("\0", KEYCLOAK_URL, REALM, CLIENT_ID, USERNAME, PASSWORD, "120", "False", "off-1"));
        assertEquals(expected, new KeycloakCredentials(KEYCLOAK_URL, REALM, CLIENT_ID, USERNAME, PASSWORD, 120, false, "off-1").registryKey());
        assertEquals(
                KeycloakCredentials.sha256Hex("SHA-256", String.join("\0", KEYCLOAK_URL, REALM, CLIENT_ID, USERNAME, PASSWORD, "", "True", "")),
                of(PASSWORD, "").registryKey());
        // a known vector, so the hex rendering keeps its leading zeros
        assertEquals("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", KeycloakCredentials.sha256Hex("SHA-256", ""));
    }

    @Test
    void everyFieldTakesPartInTheKey() {
        final String base = of(PASSWORD, "").registryKey();
        assertNotEquals(base, new KeycloakCredentials(KEYCLOAK_URL, REALM, CLIENT_ID, USERNAME, PASSWORD, 1, true, "").registryKey());
        assertNotEquals(base, new KeycloakCredentials(KEYCLOAK_URL, REALM, CLIENT_ID, USERNAME, PASSWORD, null, false, "").registryKey());
        assertNotEquals(base, of(PASSWORD, "off-1").registryKey());
    }

    @Test
    void aMissingDigestIsAnIllegalState() {
        final IllegalStateException raised =
                assertThrows(IllegalStateException.class, () -> KeycloakCredentials.sha256Hex("NO-SUCH-DIGEST", "x"));
        assertInstanceOf(NoSuchAlgorithmException.class, raised.getCause());
    }
}
