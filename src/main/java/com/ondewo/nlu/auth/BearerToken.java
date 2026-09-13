package com.ondewo.nlu.auth;

import io.grpc.ClientInterceptor;
import io.grpc.Metadata;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.MetadataUtils;

/**
 * The bearer token an ONDEWO server expects on every gRPC call.
 *
 * <p>This is the only hand-written class of this client. It lives in its own package on
 * purpose: {@code make generate_ondewo_protos} sweeps the leaf packages protoc regenerates
 * ({@code com.ondewo.nlu}, {@code ondewo.nlu}, {@code ondewo.qa}), and anything sitting in a
 * sibling package such as this one survives a regeneration untouched.
 *
 * <p>Usage:
 *
 * <pre>{@code
 * ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).useTransportSecurity().build();
 * AgentsGrpc.AgentsBlockingStub stub =
 *     new BearerToken(accessToken).attachTo(AgentsGrpc.newBlockingStub(channel));
 * }</pre>
 */
public final class BearerToken {

    /**
     * gRPC lower-cases every header name, so the key is spelled lower-case here as well - a
     * {@code Metadata.Key} built from a name containing an upper-case letter is rejected.
     */
    private static final Metadata.Key<String> AUTHORIZATION =
            Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);

    private final String accessToken;

    /**
     * @param accessToken the raw token, without the {@code Bearer } prefix
     * @throws IllegalArgumentException if the token is null or blank - failing here beats
     *     sending an {@code authorization: Bearer } header and debugging an UNAUTHENTICATED
     *     status later
     */
    public BearerToken(final String accessToken) {
        if (accessToken == null || accessToken.trim().isEmpty()) {
            throw new IllegalArgumentException("accessToken must not be null or blank");
        }
        this.accessToken = accessToken;
    }

    /** @return fresh call headers carrying {@code authorization: Bearer <token>} */
    public Metadata toMetadata() {
        final Metadata metadata = new Metadata();
        metadata.put(AUTHORIZATION, "Bearer " + accessToken);
        return metadata;
    }

    /** @return an interceptor that attaches {@link #toMetadata()} to every outgoing call */
    public ClientInterceptor toInterceptor() {
        return MetadataUtils.newAttachHeadersInterceptor(toMetadata());
    }

    /**
     * Returns a copy of {@code stub} that authenticates every call with this token. gRPC stubs
     * are immutable, so the argument is left unchanged.
     */
    public <S extends AbstractStub<S>> S attachTo(final S stub) {
        return stub.withInterceptors(toInterceptor());
    }
}
