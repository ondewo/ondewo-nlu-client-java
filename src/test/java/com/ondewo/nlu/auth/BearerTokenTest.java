package com.ondewo.nlu.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.inprocess.InProcessChannelBuilder;
import ondewo.nlu.AgentsGrpc;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Unit tests for the only hand-written class of this client. Together with the interceptor
 * round trip in {@code GeneratedServicesTest} they hold {@link BearerToken} at 100 percent
 * instruction, branch and method coverage, which the jacoco rule in pom.xml enforces.
 */
class BearerTokenTest {

    private static final Metadata.Key<String> AUTHORIZATION =
            Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);

    /** Never connected to anything - a stub only needs a channel to be constructed. */
    private ManagedChannel channel;

    @BeforeEach
    void openChannel() {
        channel = InProcessChannelBuilder.forName("bearer-token-test-never-served").build();
    }

    @AfterEach
    void closeChannel() {
        channel.shutdownNow();
    }

    @ParameterizedTest(name = "rejects [{0}]")
    @NullSource
    @ValueSource(strings = {"", "   ", "\t"})
    void rejectsAMissingToken(final String token) {
        final IllegalArgumentException thrown =
                assertThrows(IllegalArgumentException.class, () -> new BearerToken(token));

        assertEquals("accessToken must not be null or blank", thrown.getMessage());
    }

    @Test
    void putsThePrefixedTokenIntoTheAuthorizationHeader() {
        final Metadata metadata = new BearerToken("s3cr3t").toMetadata();

        assertEquals("Bearer s3cr3t", metadata.get(AUTHORIZATION));
    }

    @Test
    void handsOutFreshHeadersEveryTime() {
        // gRPC consumes one Metadata instance per call, so handing out a shared one is a bug.
        final BearerToken token = new BearerToken("s3cr3t");

        assertNotSame(token.toMetadata(), token.toMetadata());
    }

    @Test
    void buildsAnInterceptor() {
        assertNotNull(new BearerToken("s3cr3t").toInterceptor());
    }

    @Test
    void attachToReturnsAnAuthenticatedCopyOfEveryStubFlavour() {
        // gRPC stubs are immutable: withInterceptors() has to return a copy, never mutate.
        final BearerToken token = new BearerToken("s3cr3t");
        final AgentsGrpc.AgentsBlockingStub blocking = AgentsGrpc.newBlockingStub(channel);
        final AgentsGrpc.AgentsFutureStub future = AgentsGrpc.newFutureStub(channel);
        final AgentsGrpc.AgentsStub async = AgentsGrpc.newStub(channel);

        assertNotSame(blocking, token.attachTo(blocking));
        assertNotSame(future, token.attachTo(future));
        assertNotSame(async, token.attachTo(async));
    }
}
