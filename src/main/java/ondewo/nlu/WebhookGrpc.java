package ondewo.nlu;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * service to send requests to a webhook server
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class WebhookGrpc {

  private WebhookGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.nlu.Webhook";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.WebhookOuterClass.WebhookRequest,
      ondewo.nlu.WebhookOuterClass.WebhookResponse> getResponseRefinementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResponseRefinement",
      requestType = ondewo.nlu.WebhookOuterClass.WebhookRequest.class,
      responseType = ondewo.nlu.WebhookOuterClass.WebhookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.WebhookOuterClass.WebhookRequest,
      ondewo.nlu.WebhookOuterClass.WebhookResponse> getResponseRefinementMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.WebhookOuterClass.WebhookRequest, ondewo.nlu.WebhookOuterClass.WebhookResponse> getResponseRefinementMethod;
    if ((getResponseRefinementMethod = WebhookGrpc.getResponseRefinementMethod) == null) {
      synchronized (WebhookGrpc.class) {
        if ((getResponseRefinementMethod = WebhookGrpc.getResponseRefinementMethod) == null) {
          WebhookGrpc.getResponseRefinementMethod = getResponseRefinementMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.WebhookOuterClass.WebhookRequest, ondewo.nlu.WebhookOuterClass.WebhookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResponseRefinement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.WebhookOuterClass.WebhookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.WebhookOuterClass.WebhookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebhookMethodDescriptorSupplier("ResponseRefinement"))
              .build();
        }
      }
    }
    return getResponseRefinementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.WebhookOuterClass.WebhookRequest,
      ondewo.nlu.WebhookOuterClass.WebhookResponse> getSlotFillingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SlotFilling",
      requestType = ondewo.nlu.WebhookOuterClass.WebhookRequest.class,
      responseType = ondewo.nlu.WebhookOuterClass.WebhookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.WebhookOuterClass.WebhookRequest,
      ondewo.nlu.WebhookOuterClass.WebhookResponse> getSlotFillingMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.WebhookOuterClass.WebhookRequest, ondewo.nlu.WebhookOuterClass.WebhookResponse> getSlotFillingMethod;
    if ((getSlotFillingMethod = WebhookGrpc.getSlotFillingMethod) == null) {
      synchronized (WebhookGrpc.class) {
        if ((getSlotFillingMethod = WebhookGrpc.getSlotFillingMethod) == null) {
          WebhookGrpc.getSlotFillingMethod = getSlotFillingMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.WebhookOuterClass.WebhookRequest, ondewo.nlu.WebhookOuterClass.WebhookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SlotFilling"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.WebhookOuterClass.WebhookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.WebhookOuterClass.WebhookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebhookMethodDescriptorSupplier("SlotFilling"))
              .build();
        }
      }
    }
    return getSlotFillingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.WebhookOuterClass.PingRequest,
      ondewo.nlu.WebhookOuterClass.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = ondewo.nlu.WebhookOuterClass.PingRequest.class,
      responseType = ondewo.nlu.WebhookOuterClass.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.WebhookOuterClass.PingRequest,
      ondewo.nlu.WebhookOuterClass.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.WebhookOuterClass.PingRequest, ondewo.nlu.WebhookOuterClass.PingResponse> getPingMethod;
    if ((getPingMethod = WebhookGrpc.getPingMethod) == null) {
      synchronized (WebhookGrpc.class) {
        if ((getPingMethod = WebhookGrpc.getPingMethod) == null) {
          WebhookGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.WebhookOuterClass.PingRequest, ondewo.nlu.WebhookOuterClass.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.WebhookOuterClass.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.WebhookOuterClass.PingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebhookMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.WebhookOuterClass.CreateSessionEntityTypeRequest,
      ondewo.nlu.WebhookOuterClass.SessionEntityType> getCreateSessionEntityTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSessionEntityType",
      requestType = ondewo.nlu.WebhookOuterClass.CreateSessionEntityTypeRequest.class,
      responseType = ondewo.nlu.WebhookOuterClass.SessionEntityType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.WebhookOuterClass.CreateSessionEntityTypeRequest,
      ondewo.nlu.WebhookOuterClass.SessionEntityType> getCreateSessionEntityTypeMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.WebhookOuterClass.CreateSessionEntityTypeRequest, ondewo.nlu.WebhookOuterClass.SessionEntityType> getCreateSessionEntityTypeMethod;
    if ((getCreateSessionEntityTypeMethod = WebhookGrpc.getCreateSessionEntityTypeMethod) == null) {
      synchronized (WebhookGrpc.class) {
        if ((getCreateSessionEntityTypeMethod = WebhookGrpc.getCreateSessionEntityTypeMethod) == null) {
          WebhookGrpc.getCreateSessionEntityTypeMethod = getCreateSessionEntityTypeMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.WebhookOuterClass.CreateSessionEntityTypeRequest, ondewo.nlu.WebhookOuterClass.SessionEntityType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSessionEntityType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.WebhookOuterClass.CreateSessionEntityTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.WebhookOuterClass.SessionEntityType.getDefaultInstance()))
              .setSchemaDescriptor(new WebhookMethodDescriptorSupplier("CreateSessionEntityType"))
              .build();
        }
      }
    }
    return getCreateSessionEntityTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.WebhookOuterClass.UpdateSessionEntityTypeRequest,
      ondewo.nlu.WebhookOuterClass.SessionEntityType> getUpdateSessionEntityTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSessionEntityType",
      requestType = ondewo.nlu.WebhookOuterClass.UpdateSessionEntityTypeRequest.class,
      responseType = ondewo.nlu.WebhookOuterClass.SessionEntityType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.WebhookOuterClass.UpdateSessionEntityTypeRequest,
      ondewo.nlu.WebhookOuterClass.SessionEntityType> getUpdateSessionEntityTypeMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.WebhookOuterClass.UpdateSessionEntityTypeRequest, ondewo.nlu.WebhookOuterClass.SessionEntityType> getUpdateSessionEntityTypeMethod;
    if ((getUpdateSessionEntityTypeMethod = WebhookGrpc.getUpdateSessionEntityTypeMethod) == null) {
      synchronized (WebhookGrpc.class) {
        if ((getUpdateSessionEntityTypeMethod = WebhookGrpc.getUpdateSessionEntityTypeMethod) == null) {
          WebhookGrpc.getUpdateSessionEntityTypeMethod = getUpdateSessionEntityTypeMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.WebhookOuterClass.UpdateSessionEntityTypeRequest, ondewo.nlu.WebhookOuterClass.SessionEntityType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSessionEntityType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.WebhookOuterClass.UpdateSessionEntityTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.WebhookOuterClass.SessionEntityType.getDefaultInstance()))
              .setSchemaDescriptor(new WebhookMethodDescriptorSupplier("UpdateSessionEntityType"))
              .build();
        }
      }
    }
    return getUpdateSessionEntityTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.WebhookOuterClass.DeleteSessionEntityTypeRequest,
      com.google.protobuf.Empty> getDeleteSessionEntityTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSessionEntityType",
      requestType = ondewo.nlu.WebhookOuterClass.DeleteSessionEntityTypeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.WebhookOuterClass.DeleteSessionEntityTypeRequest,
      com.google.protobuf.Empty> getDeleteSessionEntityTypeMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.WebhookOuterClass.DeleteSessionEntityTypeRequest, com.google.protobuf.Empty> getDeleteSessionEntityTypeMethod;
    if ((getDeleteSessionEntityTypeMethod = WebhookGrpc.getDeleteSessionEntityTypeMethod) == null) {
      synchronized (WebhookGrpc.class) {
        if ((getDeleteSessionEntityTypeMethod = WebhookGrpc.getDeleteSessionEntityTypeMethod) == null) {
          WebhookGrpc.getDeleteSessionEntityTypeMethod = getDeleteSessionEntityTypeMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.WebhookOuterClass.DeleteSessionEntityTypeRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSessionEntityType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.WebhookOuterClass.DeleteSessionEntityTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new WebhookMethodDescriptorSupplier("DeleteSessionEntityType"))
              .build();
        }
      }
    }
    return getDeleteSessionEntityTypeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WebhookStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebhookStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebhookStub>() {
        @java.lang.Override
        public WebhookStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebhookStub(channel, callOptions);
        }
      };
    return WebhookStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static WebhookBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebhookBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebhookBlockingV2Stub>() {
        @java.lang.Override
        public WebhookBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebhookBlockingV2Stub(channel, callOptions);
        }
      };
    return WebhookBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WebhookBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebhookBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebhookBlockingStub>() {
        @java.lang.Override
        public WebhookBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebhookBlockingStub(channel, callOptions);
        }
      };
    return WebhookBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WebhookFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebhookFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebhookFutureStub>() {
        @java.lang.Override
        public WebhookFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebhookFutureStub(channel, callOptions);
        }
      };
    return WebhookFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * service to send requests to a webhook server
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * send a request for /response_refinement/ to the webhook server
     * fulfillment messages can be overwritten by the webhook server
     * </pre>
     */
    default void responseRefinement(ondewo.nlu.WebhookOuterClass.WebhookRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.WebhookOuterClass.WebhookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResponseRefinementMethod(), responseObserver);
    }

    /**
     * <pre>
     * send a request for /slot_filling/ to the webhook server
     * parameter values can be provided &amp;amp;
     * context information can be changed by the webhook server
     * </pre>
     */
    default void slotFilling(ondewo.nlu.WebhookOuterClass.WebhookRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.WebhookOuterClass.WebhookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSlotFillingMethod(), responseObserver);
    }

    /**
     * <pre>
     * send a Ping to the webhook server to verify server health
     * will return True if http status_code==200 is detected in the response
     * </pre>
     */
    default void ping(ondewo.nlu.WebhookOuterClass.PingRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.WebhookOuterClass.PingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a session entity type.
     * If the specified session entity type already exists, overrides the session
     * entity type.
     * This method doesn&amp;apos;t work with Google Assistant integration.
     * Contact Dialogflow support if you need to use session entities
     * with Google Assistant integration.
     * </pre>
     */
    default void createSessionEntityType(ondewo.nlu.WebhookOuterClass.CreateSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.WebhookOuterClass.SessionEntityType> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSessionEntityTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified session entity type.
     * This method doesn&amp;apos;t work with Google Assistant integration.
     * Contact Dialogflow support if you need to use session entities
     * with Google Assistant integration.
     * </pre>
     */
    default void updateSessionEntityType(ondewo.nlu.WebhookOuterClass.UpdateSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.WebhookOuterClass.SessionEntityType> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSessionEntityTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified session entity type.
     * This method doesn&amp;apos;t work with Google Assistant integration.
     * Contact Dialogflow support if you need to use session entities
     * with Google Assistant integration.
     * </pre>
     */
    default void deleteSessionEntityType(ondewo.nlu.WebhookOuterClass.DeleteSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSessionEntityTypeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Webhook.
   * <pre>
   * service to send requests to a webhook server
   * </pre>
   */
  public static abstract class WebhookImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WebhookGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Webhook.
   * <pre>
   * service to send requests to a webhook server
   * </pre>
   */
  public static final class WebhookStub
      extends io.grpc.stub.AbstractAsyncStub<WebhookStub> {
    private WebhookStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebhookStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebhookStub(channel, callOptions);
    }

    /**
     * <pre>
     * send a request for /response_refinement/ to the webhook server
     * fulfillment messages can be overwritten by the webhook server
     * </pre>
     */
    public void responseRefinement(ondewo.nlu.WebhookOuterClass.WebhookRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.WebhookOuterClass.WebhookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResponseRefinementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * send a request for /slot_filling/ to the webhook server
     * parameter values can be provided &amp;amp;
     * context information can be changed by the webhook server
     * </pre>
     */
    public void slotFilling(ondewo.nlu.WebhookOuterClass.WebhookRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.WebhookOuterClass.WebhookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSlotFillingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * send a Ping to the webhook server to verify server health
     * will return True if http status_code==200 is detected in the response
     * </pre>
     */
    public void ping(ondewo.nlu.WebhookOuterClass.PingRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.WebhookOuterClass.PingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a session entity type.
     * If the specified session entity type already exists, overrides the session
     * entity type.
     * This method doesn&amp;apos;t work with Google Assistant integration.
     * Contact Dialogflow support if you need to use session entities
     * with Google Assistant integration.
     * </pre>
     */
    public void createSessionEntityType(ondewo.nlu.WebhookOuterClass.CreateSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.WebhookOuterClass.SessionEntityType> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSessionEntityTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified session entity type.
     * This method doesn&amp;apos;t work with Google Assistant integration.
     * Contact Dialogflow support if you need to use session entities
     * with Google Assistant integration.
     * </pre>
     */
    public void updateSessionEntityType(ondewo.nlu.WebhookOuterClass.UpdateSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.WebhookOuterClass.SessionEntityType> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSessionEntityTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified session entity type.
     * This method doesn&amp;apos;t work with Google Assistant integration.
     * Contact Dialogflow support if you need to use session entities
     * with Google Assistant integration.
     * </pre>
     */
    public void deleteSessionEntityType(ondewo.nlu.WebhookOuterClass.DeleteSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSessionEntityTypeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Webhook.
   * <pre>
   * service to send requests to a webhook server
   * </pre>
   */
  public static final class WebhookBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<WebhookBlockingV2Stub> {
    private WebhookBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebhookBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebhookBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * send a request for /response_refinement/ to the webhook server
     * fulfillment messages can be overwritten by the webhook server
     * </pre>
     */
    public ondewo.nlu.WebhookOuterClass.WebhookResponse responseRefinement(ondewo.nlu.WebhookOuterClass.WebhookRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getResponseRefinementMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * send a request for /slot_filling/ to the webhook server
     * parameter values can be provided &amp;amp;
     * context information can be changed by the webhook server
     * </pre>
     */
    public ondewo.nlu.WebhookOuterClass.WebhookResponse slotFilling(ondewo.nlu.WebhookOuterClass.WebhookRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSlotFillingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * send a Ping to the webhook server to verify server health
     * will return True if http status_code==200 is detected in the response
     * </pre>
     */
    public ondewo.nlu.WebhookOuterClass.PingResponse ping(ondewo.nlu.WebhookOuterClass.PingRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a session entity type.
     * If the specified session entity type already exists, overrides the session
     * entity type.
     * This method doesn&amp;apos;t work with Google Assistant integration.
     * Contact Dialogflow support if you need to use session entities
     * with Google Assistant integration.
     * </pre>
     */
    public ondewo.nlu.WebhookOuterClass.SessionEntityType createSessionEntityType(ondewo.nlu.WebhookOuterClass.CreateSessionEntityTypeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateSessionEntityTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified session entity type.
     * This method doesn&amp;apos;t work with Google Assistant integration.
     * Contact Dialogflow support if you need to use session entities
     * with Google Assistant integration.
     * </pre>
     */
    public ondewo.nlu.WebhookOuterClass.SessionEntityType updateSessionEntityType(ondewo.nlu.WebhookOuterClass.UpdateSessionEntityTypeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateSessionEntityTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified session entity type.
     * This method doesn&amp;apos;t work with Google Assistant integration.
     * Contact Dialogflow support if you need to use session entities
     * with Google Assistant integration.
     * </pre>
     */
    public com.google.protobuf.Empty deleteSessionEntityType(ondewo.nlu.WebhookOuterClass.DeleteSessionEntityTypeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteSessionEntityTypeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Webhook.
   * <pre>
   * service to send requests to a webhook server
   * </pre>
   */
  public static final class WebhookBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WebhookBlockingStub> {
    private WebhookBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebhookBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebhookBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * send a request for /response_refinement/ to the webhook server
     * fulfillment messages can be overwritten by the webhook server
     * </pre>
     */
    public ondewo.nlu.WebhookOuterClass.WebhookResponse responseRefinement(ondewo.nlu.WebhookOuterClass.WebhookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResponseRefinementMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * send a request for /slot_filling/ to the webhook server
     * parameter values can be provided &amp;amp;
     * context information can be changed by the webhook server
     * </pre>
     */
    public ondewo.nlu.WebhookOuterClass.WebhookResponse slotFilling(ondewo.nlu.WebhookOuterClass.WebhookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSlotFillingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * send a Ping to the webhook server to verify server health
     * will return True if http status_code==200 is detected in the response
     * </pre>
     */
    public ondewo.nlu.WebhookOuterClass.PingResponse ping(ondewo.nlu.WebhookOuterClass.PingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a session entity type.
     * If the specified session entity type already exists, overrides the session
     * entity type.
     * This method doesn&amp;apos;t work with Google Assistant integration.
     * Contact Dialogflow support if you need to use session entities
     * with Google Assistant integration.
     * </pre>
     */
    public ondewo.nlu.WebhookOuterClass.SessionEntityType createSessionEntityType(ondewo.nlu.WebhookOuterClass.CreateSessionEntityTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSessionEntityTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified session entity type.
     * This method doesn&amp;apos;t work with Google Assistant integration.
     * Contact Dialogflow support if you need to use session entities
     * with Google Assistant integration.
     * </pre>
     */
    public ondewo.nlu.WebhookOuterClass.SessionEntityType updateSessionEntityType(ondewo.nlu.WebhookOuterClass.UpdateSessionEntityTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSessionEntityTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified session entity type.
     * This method doesn&amp;apos;t work with Google Assistant integration.
     * Contact Dialogflow support if you need to use session entities
     * with Google Assistant integration.
     * </pre>
     */
    public com.google.protobuf.Empty deleteSessionEntityType(ondewo.nlu.WebhookOuterClass.DeleteSessionEntityTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSessionEntityTypeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Webhook.
   * <pre>
   * service to send requests to a webhook server
   * </pre>
   */
  public static final class WebhookFutureStub
      extends io.grpc.stub.AbstractFutureStub<WebhookFutureStub> {
    private WebhookFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebhookFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebhookFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * send a request for /response_refinement/ to the webhook server
     * fulfillment messages can be overwritten by the webhook server
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.WebhookOuterClass.WebhookResponse> responseRefinement(
        ondewo.nlu.WebhookOuterClass.WebhookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResponseRefinementMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * send a request for /slot_filling/ to the webhook server
     * parameter values can be provided &amp;amp;
     * context information can be changed by the webhook server
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.WebhookOuterClass.WebhookResponse> slotFilling(
        ondewo.nlu.WebhookOuterClass.WebhookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSlotFillingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * send a Ping to the webhook server to verify server health
     * will return True if http status_code==200 is detected in the response
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.WebhookOuterClass.PingResponse> ping(
        ondewo.nlu.WebhookOuterClass.PingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a session entity type.
     * If the specified session entity type already exists, overrides the session
     * entity type.
     * This method doesn&amp;apos;t work with Google Assistant integration.
     * Contact Dialogflow support if you need to use session entities
     * with Google Assistant integration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.WebhookOuterClass.SessionEntityType> createSessionEntityType(
        ondewo.nlu.WebhookOuterClass.CreateSessionEntityTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSessionEntityTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified session entity type.
     * This method doesn&amp;apos;t work with Google Assistant integration.
     * Contact Dialogflow support if you need to use session entities
     * with Google Assistant integration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.WebhookOuterClass.SessionEntityType> updateSessionEntityType(
        ondewo.nlu.WebhookOuterClass.UpdateSessionEntityTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSessionEntityTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified session entity type.
     * This method doesn&amp;apos;t work with Google Assistant integration.
     * Contact Dialogflow support if you need to use session entities
     * with Google Assistant integration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSessionEntityType(
        ondewo.nlu.WebhookOuterClass.DeleteSessionEntityTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSessionEntityTypeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RESPONSE_REFINEMENT = 0;
  private static final int METHODID_SLOT_FILLING = 1;
  private static final int METHODID_PING = 2;
  private static final int METHODID_CREATE_SESSION_ENTITY_TYPE = 3;
  private static final int METHODID_UPDATE_SESSION_ENTITY_TYPE = 4;
  private static final int METHODID_DELETE_SESSION_ENTITY_TYPE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RESPONSE_REFINEMENT:
          serviceImpl.responseRefinement((ondewo.nlu.WebhookOuterClass.WebhookRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.WebhookOuterClass.WebhookResponse>) responseObserver);
          break;
        case METHODID_SLOT_FILLING:
          serviceImpl.slotFilling((ondewo.nlu.WebhookOuterClass.WebhookRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.WebhookOuterClass.WebhookResponse>) responseObserver);
          break;
        case METHODID_PING:
          serviceImpl.ping((ondewo.nlu.WebhookOuterClass.PingRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.WebhookOuterClass.PingResponse>) responseObserver);
          break;
        case METHODID_CREATE_SESSION_ENTITY_TYPE:
          serviceImpl.createSessionEntityType((ondewo.nlu.WebhookOuterClass.CreateSessionEntityTypeRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.WebhookOuterClass.SessionEntityType>) responseObserver);
          break;
        case METHODID_UPDATE_SESSION_ENTITY_TYPE:
          serviceImpl.updateSessionEntityType((ondewo.nlu.WebhookOuterClass.UpdateSessionEntityTypeRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.WebhookOuterClass.SessionEntityType>) responseObserver);
          break;
        case METHODID_DELETE_SESSION_ENTITY_TYPE:
          serviceImpl.deleteSessionEntityType((ondewo.nlu.WebhookOuterClass.DeleteSessionEntityTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getResponseRefinementMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.WebhookOuterClass.WebhookRequest,
              ondewo.nlu.WebhookOuterClass.WebhookResponse>(
                service, METHODID_RESPONSE_REFINEMENT)))
        .addMethod(
          getSlotFillingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.WebhookOuterClass.WebhookRequest,
              ondewo.nlu.WebhookOuterClass.WebhookResponse>(
                service, METHODID_SLOT_FILLING)))
        .addMethod(
          getPingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.WebhookOuterClass.PingRequest,
              ondewo.nlu.WebhookOuterClass.PingResponse>(
                service, METHODID_PING)))
        .addMethod(
          getCreateSessionEntityTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.WebhookOuterClass.CreateSessionEntityTypeRequest,
              ondewo.nlu.WebhookOuterClass.SessionEntityType>(
                service, METHODID_CREATE_SESSION_ENTITY_TYPE)))
        .addMethod(
          getUpdateSessionEntityTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.WebhookOuterClass.UpdateSessionEntityTypeRequest,
              ondewo.nlu.WebhookOuterClass.SessionEntityType>(
                service, METHODID_UPDATE_SESSION_ENTITY_TYPE)))
        .addMethod(
          getDeleteSessionEntityTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.WebhookOuterClass.DeleteSessionEntityTypeRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_SESSION_ENTITY_TYPE)))
        .build();
  }

  private static abstract class WebhookBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WebhookBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ondewo.nlu.WebhookOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Webhook");
    }
  }

  private static final class WebhookFileDescriptorSupplier
      extends WebhookBaseDescriptorSupplier {
    WebhookFileDescriptorSupplier() {}
  }

  private static final class WebhookMethodDescriptorSupplier
      extends WebhookBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WebhookMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WebhookGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WebhookFileDescriptorSupplier())
              .addMethod(getResponseRefinementMethod())
              .addMethod(getSlotFillingMethod())
              .addMethod(getPingMethod())
              .addMethod(getCreateSessionEntityTypeMethod())
              .addMethod(getUpdateSessionEntityTypeMethod())
              .addMethod(getDeleteSessionEntityTypeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
