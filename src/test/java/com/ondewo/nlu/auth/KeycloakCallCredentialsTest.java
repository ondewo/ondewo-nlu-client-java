package com.ondewo.nlu.auth;

import static com.ondewo.nlu.auth.Fakes.PASSWORD;
import static com.ondewo.nlu.auth.Fakes.credentials;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.grpc.CallCredentials;
import io.grpc.CallOptions;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Server;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.ServerInterceptors;
import io.grpc.ServerServiceDefinition;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.stub.ClientCalls;
import io.grpc.stub.ServerCalls;

import ondewo.nlu.AgentsGrpc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/** The token reaches the server as {@code authorization: Bearer <token>} on every call. */
class KeycloakCallCredentialsTest {

    private static final Metadata.Key<String> AUTHORIZATION =
            Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);
    private static final Metadata.Key<String> OTHER =
            Metadata.Key.of("x-other", Metadata.ASCII_STRING_MARSHALLER);

    private static final MethodDescriptor<byte[], byte[]> ECHO =
            MethodDescriptor.<byte[], byte[]>newBuilder()
                    .setType(MethodDescriptor.MethodType.UNARY)
                    .setFullMethodName("ondewo.test.Echo/Echo")
                    .setRequestMarshaller(new Bytes())
                    .setResponseMarshaller(new Bytes())
                    .build();

    private final List<Metadata> seen = new CopyOnWriteArrayList<>();
    private Server server;
    private ManagedChannel channel;

    @BeforeEach
    void startServer() throws IOException {
        final String name = "keycloak-" + UUID.randomUUID();
        final ServerServiceDefinition echo =
                ServerServiceDefinition.builder("ondewo.test.Echo")
                        .addMethod(ECHO, ServerCalls.asyncUnaryCall((request, observer) -> {
                            observer.onNext(request);
                            observer.onCompleted();
                        }))
                        .build();
        final ServerInterceptor capture =
                new ServerInterceptor() {
                    @Override
                    public <Q, S> ServerCall.Listener<Q> interceptCall(
                            final ServerCall<Q, S> call, final Metadata headers, final ServerCallHandler<Q, S> next) {
                        seen.add(headers);
                        return next.startCall(call, headers);
                    }
                };
        server = InProcessServerBuilder.forName(name).directExecutor().addService(ServerInterceptors.intercept(echo, capture)).build().start();
        channel = InProcessChannelBuilder.forName(name).directExecutor().build();
    }

    @AfterEach
    void stopServer() {
        channel.shutdownNow();
        server.shutdownNow();
    }

    private byte[] call(final io.grpc.Channel target, final CallOptions options) {
        return ClientCalls.blockingUnaryCall(target, ECHO, options, new byte[] {1});
    }

    @Test
    void theInterceptorAttachesTheBearerToken() {
        final KeycloakTokenProvider provider = TestProviders.serving(credentials(PASSWORD, ""), "acc-1");
        call(io.grpc.ClientInterceptors.intercept(channel, provider.toInterceptor()), CallOptions.DEFAULT);
        call(io.grpc.ClientInterceptors.intercept(channel, provider.toInterceptor()), CallOptions.DEFAULT);

        assertEquals(2, seen.size());
        assertEquals("Bearer acc-1", seen.get(0).get(AUTHORIZATION));
        assertEquals("Bearer acc-1", seen.get(1).get(AUTHORIZATION));
    }

    @Test
    void theInterceptorComposesWithCallCredentialsTheCallAlreadyCarries() {
        final KeycloakTokenProvider provider = TestProviders.serving(credentials(PASSWORD, ""), "acc-1");
        final CallCredentials other =
                new CallCredentials() {
                    @Override
                    public void applyRequestMetadata(final RequestInfo info, final Executor executor, final MetadataApplier applier) {
                        final Metadata headers = new Metadata();
                        headers.put(OTHER, "kept");
                        applier.apply(headers);
                    }
                };
        call(io.grpc.ClientInterceptors.intercept(channel, provider.toInterceptor()), CallOptions.DEFAULT.withCallCredentials(other));

        assertEquals("Bearer acc-1", seen.get(0).get(AUTHORIZATION));
        assertEquals("kept", seen.get(0).get(OTHER));
    }

    @Test
    void attachToReturnsAnAuthenticatingCopyOfTheStub() {
        final KeycloakTokenProvider provider = TestProviders.serving(credentials("", "off-1"), "acc-9");
        final AgentsGrpc.AgentsBlockingStub stub = AgentsGrpc.newBlockingStub(channel);
        final AgentsGrpc.AgentsBlockingStub authenticated = provider.attachTo(stub);
        assertNotSame(stub, authenticated);
        assertEquals(provider.toCallCredentials().getClass(), authenticated.getCallOptions().getCredentials().getClass());
        call(channel, authenticated.getCallOptions());
        assertEquals("Bearer acc-9", seen.get(0).get(AUTHORIZATION));
    }

    @Test
    void anExpiredTokenFailsTheCallUnauthenticatedWithTheKeycloakErrorAsCause() {
        final KeycloakTokenProvider provider = TestProviders.expired(credentials(PASSWORD, ""));
        final StatusRuntimeException raised =
                assertThrows(
                        StatusRuntimeException.class,
                        () -> call(channel, CallOptions.DEFAULT.withCallCredentials(provider.toCallCredentials())));
        assertEquals(Status.Code.UNAUTHENTICATED, raised.getStatus().getCode());
        assertInstanceOf(KeycloakAuthenticationException.class, raised.getStatus().getCause());
        assertTrue(raised.getStatus().getDescription().contains("status 400"));
        assertTrue(seen.isEmpty(), "a call without a valid token reached the server");
    }

    private static final class Bytes implements MethodDescriptor.Marshaller<byte[]> {
        @Override
        public InputStream stream(final byte[] value) {
            return new ByteArrayInputStream(value);
        }

        @Override
        public byte[] parse(final InputStream stream) {
            try {
                return stream.readAllBytes();
            } catch (final IOException e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
