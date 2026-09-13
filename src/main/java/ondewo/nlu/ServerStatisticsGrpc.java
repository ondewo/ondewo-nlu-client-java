package ondewo.nlu;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Server project statistics
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ServerStatisticsGrpc {

  private ServerStatisticsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.nlu.ServerStatistics";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.ondewo.nlu.StatResponse> getGetProjectCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProjectCount",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.ondewo.nlu.StatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.ondewo.nlu.StatResponse> getGetProjectCountMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.ondewo.nlu.StatResponse> getGetProjectCountMethod;
    if ((getGetProjectCountMethod = ServerStatisticsGrpc.getGetProjectCountMethod) == null) {
      synchronized (ServerStatisticsGrpc.class) {
        if ((getGetProjectCountMethod = ServerStatisticsGrpc.getGetProjectCountMethod) == null) {
          ServerStatisticsGrpc.getGetProjectCountMethod = getGetProjectCountMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.ondewo.nlu.StatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProjectCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.StatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServerStatisticsMethodDescriptorSupplier("GetProjectCount"))
              .build();
        }
      }
    }
    return getGetProjectCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.ServerStatisticsOuterClass.GetUserProjectCountRequest,
      com.ondewo.nlu.StatResponse> getGetUserProjectCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserProjectCount",
      requestType = ondewo.nlu.ServerStatisticsOuterClass.GetUserProjectCountRequest.class,
      responseType = com.ondewo.nlu.StatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.ServerStatisticsOuterClass.GetUserProjectCountRequest,
      com.ondewo.nlu.StatResponse> getGetUserProjectCountMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.ServerStatisticsOuterClass.GetUserProjectCountRequest, com.ondewo.nlu.StatResponse> getGetUserProjectCountMethod;
    if ((getGetUserProjectCountMethod = ServerStatisticsGrpc.getGetUserProjectCountMethod) == null) {
      synchronized (ServerStatisticsGrpc.class) {
        if ((getGetUserProjectCountMethod = ServerStatisticsGrpc.getGetUserProjectCountMethod) == null) {
          ServerStatisticsGrpc.getGetUserProjectCountMethod = getGetUserProjectCountMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.ServerStatisticsOuterClass.GetUserProjectCountRequest, com.ondewo.nlu.StatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserProjectCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.ServerStatisticsOuterClass.GetUserProjectCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.StatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServerStatisticsMethodDescriptorSupplier("GetUserProjectCount"))
              .build();
        }
      }
    }
    return getGetUserProjectCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.ondewo.nlu.StatResponse> getGetUserCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserCount",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.ondewo.nlu.StatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.ondewo.nlu.StatResponse> getGetUserCountMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.ondewo.nlu.StatResponse> getGetUserCountMethod;
    if ((getGetUserCountMethod = ServerStatisticsGrpc.getGetUserCountMethod) == null) {
      synchronized (ServerStatisticsGrpc.class) {
        if ((getGetUserCountMethod = ServerStatisticsGrpc.getGetUserCountMethod) == null) {
          ServerStatisticsGrpc.getGetUserCountMethod = getGetUserCountMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.ondewo.nlu.StatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.StatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServerStatisticsMethodDescriptorSupplier("GetUserCount"))
              .build();
        }
      }
    }
    return getGetUserCountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServerStatisticsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerStatisticsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerStatisticsStub>() {
        @java.lang.Override
        public ServerStatisticsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerStatisticsStub(channel, callOptions);
        }
      };
    return ServerStatisticsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ServerStatisticsBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerStatisticsBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerStatisticsBlockingV2Stub>() {
        @java.lang.Override
        public ServerStatisticsBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerStatisticsBlockingV2Stub(channel, callOptions);
        }
      };
    return ServerStatisticsBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServerStatisticsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerStatisticsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerStatisticsBlockingStub>() {
        @java.lang.Override
        public ServerStatisticsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerStatisticsBlockingStub(channel, callOptions);
        }
      };
    return ServerStatisticsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServerStatisticsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerStatisticsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerStatisticsFutureStub>() {
        @java.lang.Override
        public ServerStatisticsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerStatisticsFutureStub(channel, callOptions);
        }
      };
    return ServerStatisticsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Server project statistics
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns the count of projects in the CAI server
     * </pre>
     */
    default void getProjectCount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the count of projects of a user
     * </pre>
     */
    default void getUserProjectCount(ondewo.nlu.ServerStatisticsOuterClass.GetUserProjectCountRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserProjectCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the users count within a project
     * </pre>
     */
    default void getUserCount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserCountMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ServerStatistics.
   * <pre>
   * Server project statistics
   * </pre>
   */
  public static abstract class ServerStatisticsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServerStatisticsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ServerStatistics.
   * <pre>
   * Server project statistics
   * </pre>
   */
  public static final class ServerStatisticsStub
      extends io.grpc.stub.AbstractAsyncStub<ServerStatisticsStub> {
    private ServerStatisticsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerStatisticsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerStatisticsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the count of projects in the CAI server
     * </pre>
     */
    public void getProjectCount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProjectCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the count of projects of a user
     * </pre>
     */
    public void getUserProjectCount(ondewo.nlu.ServerStatisticsOuterClass.GetUserProjectCountRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserProjectCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the users count within a project
     * </pre>
     */
    public void getUserCount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserCountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ServerStatistics.
   * <pre>
   * Server project statistics
   * </pre>
   */
  public static final class ServerStatisticsBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ServerStatisticsBlockingV2Stub> {
    private ServerStatisticsBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerStatisticsBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerStatisticsBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the count of projects in the CAI server
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getProjectCount(com.google.protobuf.Empty request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetProjectCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the count of projects of a user
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getUserProjectCount(ondewo.nlu.ServerStatisticsOuterClass.GetUserProjectCountRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetUserProjectCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the users count within a project
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getUserCount(com.google.protobuf.Empty request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetUserCountMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ServerStatistics.
   * <pre>
   * Server project statistics
   * </pre>
   */
  public static final class ServerStatisticsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServerStatisticsBlockingStub> {
    private ServerStatisticsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerStatisticsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerStatisticsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the count of projects in the CAI server
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getProjectCount(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProjectCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the count of projects of a user
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getUserProjectCount(ondewo.nlu.ServerStatisticsOuterClass.GetUserProjectCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserProjectCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the users count within a project
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getUserCount(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserCountMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ServerStatistics.
   * <pre>
   * Server project statistics
   * </pre>
   */
  public static final class ServerStatisticsFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServerStatisticsFutureStub> {
    private ServerStatisticsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerStatisticsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerStatisticsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the count of projects in the CAI server
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.StatResponse> getProjectCount(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProjectCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the count of projects of a user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.StatResponse> getUserProjectCount(
        ondewo.nlu.ServerStatisticsOuterClass.GetUserProjectCountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserProjectCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the users count within a project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.StatResponse> getUserCount(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserCountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROJECT_COUNT = 0;
  private static final int METHODID_GET_USER_PROJECT_COUNT = 1;
  private static final int METHODID_GET_USER_COUNT = 2;

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
        case METHODID_GET_PROJECT_COUNT:
          serviceImpl.getProjectCount((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse>) responseObserver);
          break;
        case METHODID_GET_USER_PROJECT_COUNT:
          serviceImpl.getUserProjectCount((ondewo.nlu.ServerStatisticsOuterClass.GetUserProjectCountRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse>) responseObserver);
          break;
        case METHODID_GET_USER_COUNT:
          serviceImpl.getUserCount((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse>) responseObserver);
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
          getGetProjectCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.ondewo.nlu.StatResponse>(
                service, METHODID_GET_PROJECT_COUNT)))
        .addMethod(
          getGetUserProjectCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.ServerStatisticsOuterClass.GetUserProjectCountRequest,
              com.ondewo.nlu.StatResponse>(
                service, METHODID_GET_USER_PROJECT_COUNT)))
        .addMethod(
          getGetUserCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.ondewo.nlu.StatResponse>(
                service, METHODID_GET_USER_COUNT)))
        .build();
  }

  private static abstract class ServerStatisticsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServerStatisticsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ondewo.nlu.ServerStatisticsOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServerStatistics");
    }
  }

  private static final class ServerStatisticsFileDescriptorSupplier
      extends ServerStatisticsBaseDescriptorSupplier {
    ServerStatisticsFileDescriptorSupplier() {}
  }

  private static final class ServerStatisticsMethodDescriptorSupplier
      extends ServerStatisticsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ServerStatisticsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ServerStatisticsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServerStatisticsFileDescriptorSupplier())
              .addMethod(getGetProjectCountMethod())
              .addMethod(getGetUserProjectCountMethod())
              .addMethod(getGetUserCountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
