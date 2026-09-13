package ondewo.qa;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * gRPC service for QA functionalities.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class QAGrpc {

  private QAGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.qa.QA";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ondewo.qa.Qa.GetAnswerRequest,
      ondewo.qa.Qa.GetAnswerResponse> getGetAnswerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnswer",
      requestType = ondewo.qa.Qa.GetAnswerRequest.class,
      responseType = ondewo.qa.Qa.GetAnswerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.qa.Qa.GetAnswerRequest,
      ondewo.qa.Qa.GetAnswerResponse> getGetAnswerMethod() {
    io.grpc.MethodDescriptor<ondewo.qa.Qa.GetAnswerRequest, ondewo.qa.Qa.GetAnswerResponse> getGetAnswerMethod;
    if ((getGetAnswerMethod = QAGrpc.getGetAnswerMethod) == null) {
      synchronized (QAGrpc.class) {
        if ((getGetAnswerMethod = QAGrpc.getGetAnswerMethod) == null) {
          QAGrpc.getGetAnswerMethod = getGetAnswerMethod =
              io.grpc.MethodDescriptor.<ondewo.qa.Qa.GetAnswerRequest, ondewo.qa.Qa.GetAnswerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnswer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.qa.Qa.GetAnswerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.qa.Qa.GetAnswerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QAMethodDescriptorSupplier("GetAnswer"))
              .build();
        }
      }
    }
    return getGetAnswerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.qa.Qa.RunScraperRequest,
      ondewo.qa.Qa.RunScraperResponse> getRunScraperMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RunScraper",
      requestType = ondewo.qa.Qa.RunScraperRequest.class,
      responseType = ondewo.qa.Qa.RunScraperResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.qa.Qa.RunScraperRequest,
      ondewo.qa.Qa.RunScraperResponse> getRunScraperMethod() {
    io.grpc.MethodDescriptor<ondewo.qa.Qa.RunScraperRequest, ondewo.qa.Qa.RunScraperResponse> getRunScraperMethod;
    if ((getRunScraperMethod = QAGrpc.getRunScraperMethod) == null) {
      synchronized (QAGrpc.class) {
        if ((getRunScraperMethod = QAGrpc.getRunScraperMethod) == null) {
          QAGrpc.getRunScraperMethod = getRunScraperMethod =
              io.grpc.MethodDescriptor.<ondewo.qa.Qa.RunScraperRequest, ondewo.qa.Qa.RunScraperResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RunScraper"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.qa.Qa.RunScraperRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.qa.Qa.RunScraperResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QAMethodDescriptorSupplier("RunScraper"))
              .build();
        }
      }
    }
    return getRunScraperMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.qa.Qa.UpdateDatabaseRequest,
      ondewo.qa.Qa.UpdateDatabaseResponse> getUpdateDatabaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDatabase",
      requestType = ondewo.qa.Qa.UpdateDatabaseRequest.class,
      responseType = ondewo.qa.Qa.UpdateDatabaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.qa.Qa.UpdateDatabaseRequest,
      ondewo.qa.Qa.UpdateDatabaseResponse> getUpdateDatabaseMethod() {
    io.grpc.MethodDescriptor<ondewo.qa.Qa.UpdateDatabaseRequest, ondewo.qa.Qa.UpdateDatabaseResponse> getUpdateDatabaseMethod;
    if ((getUpdateDatabaseMethod = QAGrpc.getUpdateDatabaseMethod) == null) {
      synchronized (QAGrpc.class) {
        if ((getUpdateDatabaseMethod = QAGrpc.getUpdateDatabaseMethod) == null) {
          QAGrpc.getUpdateDatabaseMethod = getUpdateDatabaseMethod =
              io.grpc.MethodDescriptor.<ondewo.qa.Qa.UpdateDatabaseRequest, ondewo.qa.Qa.UpdateDatabaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDatabase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.qa.Qa.UpdateDatabaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.qa.Qa.UpdateDatabaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QAMethodDescriptorSupplier("UpdateDatabase"))
              .build();
        }
      }
    }
    return getUpdateDatabaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ondewo.qa.Qa.RunTrainingResponse> getRunTrainingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RunTraining",
      requestType = com.google.protobuf.Empty.class,
      responseType = ondewo.qa.Qa.RunTrainingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ondewo.qa.Qa.RunTrainingResponse> getRunTrainingMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, ondewo.qa.Qa.RunTrainingResponse> getRunTrainingMethod;
    if ((getRunTrainingMethod = QAGrpc.getRunTrainingMethod) == null) {
      synchronized (QAGrpc.class) {
        if ((getRunTrainingMethod = QAGrpc.getRunTrainingMethod) == null) {
          QAGrpc.getRunTrainingMethod = getRunTrainingMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, ondewo.qa.Qa.RunTrainingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RunTraining"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.qa.Qa.RunTrainingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QAMethodDescriptorSupplier("RunTraining"))
              .build();
        }
      }
    }
    return getRunTrainingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ondewo.qa.Qa.GetServerStateResponse> getGetServerStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServerState",
      requestType = com.google.protobuf.Empty.class,
      responseType = ondewo.qa.Qa.GetServerStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ondewo.qa.Qa.GetServerStateResponse> getGetServerStateMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, ondewo.qa.Qa.GetServerStateResponse> getGetServerStateMethod;
    if ((getGetServerStateMethod = QAGrpc.getGetServerStateMethod) == null) {
      synchronized (QAGrpc.class) {
        if ((getGetServerStateMethod = QAGrpc.getGetServerStateMethod) == null) {
          QAGrpc.getGetServerStateMethod = getGetServerStateMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, ondewo.qa.Qa.GetServerStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServerState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.qa.Qa.GetServerStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QAMethodDescriptorSupplier("GetServerState"))
              .build();
        }
      }
    }
    return getGetServerStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ondewo.qa.Qa.ListProjectIdsResponse> getListProjectIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProjectIds",
      requestType = com.google.protobuf.Empty.class,
      responseType = ondewo.qa.Qa.ListProjectIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ondewo.qa.Qa.ListProjectIdsResponse> getListProjectIdsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, ondewo.qa.Qa.ListProjectIdsResponse> getListProjectIdsMethod;
    if ((getListProjectIdsMethod = QAGrpc.getListProjectIdsMethod) == null) {
      synchronized (QAGrpc.class) {
        if ((getListProjectIdsMethod = QAGrpc.getListProjectIdsMethod) == null) {
          QAGrpc.getListProjectIdsMethod = getListProjectIdsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, ondewo.qa.Qa.ListProjectIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProjectIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.qa.Qa.ListProjectIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QAMethodDescriptorSupplier("ListProjectIds"))
              .build();
        }
      }
    }
    return getListProjectIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.qa.Qa.GetProjectConfigRequest,
      ondewo.qa.Qa.GetProjectConfigResponse> getGetProjectConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProjectConfig",
      requestType = ondewo.qa.Qa.GetProjectConfigRequest.class,
      responseType = ondewo.qa.Qa.GetProjectConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.qa.Qa.GetProjectConfigRequest,
      ondewo.qa.Qa.GetProjectConfigResponse> getGetProjectConfigMethod() {
    io.grpc.MethodDescriptor<ondewo.qa.Qa.GetProjectConfigRequest, ondewo.qa.Qa.GetProjectConfigResponse> getGetProjectConfigMethod;
    if ((getGetProjectConfigMethod = QAGrpc.getGetProjectConfigMethod) == null) {
      synchronized (QAGrpc.class) {
        if ((getGetProjectConfigMethod = QAGrpc.getGetProjectConfigMethod) == null) {
          QAGrpc.getGetProjectConfigMethod = getGetProjectConfigMethod =
              io.grpc.MethodDescriptor.<ondewo.qa.Qa.GetProjectConfigRequest, ondewo.qa.Qa.GetProjectConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProjectConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.qa.Qa.GetProjectConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.qa.Qa.GetProjectConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QAMethodDescriptorSupplier("GetProjectConfig"))
              .build();
        }
      }
    }
    return getGetProjectConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QAStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QAStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QAStub>() {
        @java.lang.Override
        public QAStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QAStub(channel, callOptions);
        }
      };
    return QAStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static QABlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QABlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QABlockingV2Stub>() {
        @java.lang.Override
        public QABlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QABlockingV2Stub(channel, callOptions);
        }
      };
    return QABlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QABlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QABlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QABlockingStub>() {
        @java.lang.Override
        public QABlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QABlockingStub(channel, callOptions);
        }
      };
    return QABlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QAFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QAFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QAFutureStub>() {
        @java.lang.Override
        public QAFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QAFutureStub(channel, callOptions);
        }
      };
    return QAFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * gRPC service for QA functionalities.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Retrieves an answer based on the provided request.
     * </pre>
     */
    default void getAnswer(ondewo.qa.Qa.GetAnswerRequest request,
        io.grpc.stub.StreamObserver<ondewo.qa.Qa.GetAnswerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnswerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Runs a web scraper job for specified project IDs.
     * </pre>
     */
    default void runScraper(ondewo.qa.Qa.RunScraperRequest request,
        io.grpc.stub.StreamObserver<ondewo.qa.Qa.RunScraperResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRunScraperMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the database for specified project IDs.
     * </pre>
     */
    default void updateDatabase(ondewo.qa.Qa.UpdateDatabaseRequest request,
        io.grpc.stub.StreamObserver<ondewo.qa.Qa.UpdateDatabaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDatabaseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Runs a training job for the QA system.
     * </pre>
     */
    default void runTraining(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ondewo.qa.Qa.RunTrainingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRunTrainingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the server state for QA.
     * </pre>
     */
    default void getServerState(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ondewo.qa.Qa.GetServerStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServerStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists project IDs associated with QA.
     * </pre>
     */
    default void listProjectIds(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ondewo.qa.Qa.ListProjectIdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProjectIdsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the configuration of a specific project.
     * </pre>
     */
    default void getProjectConfig(ondewo.qa.Qa.GetProjectConfigRequest request,
        io.grpc.stub.StreamObserver<ondewo.qa.Qa.GetProjectConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectConfigMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service QA.
   * <pre>
   * gRPC service for QA functionalities.
   * </pre>
   */
  public static abstract class QAImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QAGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service QA.
   * <pre>
   * gRPC service for QA functionalities.
   * </pre>
   */
  public static final class QAStub
      extends io.grpc.stub.AbstractAsyncStub<QAStub> {
    private QAStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QAStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QAStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves an answer based on the provided request.
     * </pre>
     */
    public void getAnswer(ondewo.qa.Qa.GetAnswerRequest request,
        io.grpc.stub.StreamObserver<ondewo.qa.Qa.GetAnswerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnswerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Runs a web scraper job for specified project IDs.
     * </pre>
     */
    public void runScraper(ondewo.qa.Qa.RunScraperRequest request,
        io.grpc.stub.StreamObserver<ondewo.qa.Qa.RunScraperResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRunScraperMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the database for specified project IDs.
     * </pre>
     */
    public void updateDatabase(ondewo.qa.Qa.UpdateDatabaseRequest request,
        io.grpc.stub.StreamObserver<ondewo.qa.Qa.UpdateDatabaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDatabaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Runs a training job for the QA system.
     * </pre>
     */
    public void runTraining(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ondewo.qa.Qa.RunTrainingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRunTrainingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the server state for QA.
     * </pre>
     */
    public void getServerState(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ondewo.qa.Qa.GetServerStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServerStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists project IDs associated with QA.
     * </pre>
     */
    public void listProjectIds(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ondewo.qa.Qa.ListProjectIdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProjectIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the configuration of a specific project.
     * </pre>
     */
    public void getProjectConfig(ondewo.qa.Qa.GetProjectConfigRequest request,
        io.grpc.stub.StreamObserver<ondewo.qa.Qa.GetProjectConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProjectConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service QA.
   * <pre>
   * gRPC service for QA functionalities.
   * </pre>
   */
  public static final class QABlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<QABlockingV2Stub> {
    private QABlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QABlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QABlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves an answer based on the provided request.
     * </pre>
     */
    public ondewo.qa.Qa.GetAnswerResponse getAnswer(ondewo.qa.Qa.GetAnswerRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetAnswerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Runs a web scraper job for specified project IDs.
     * </pre>
     */
    public ondewo.qa.Qa.RunScraperResponse runScraper(ondewo.qa.Qa.RunScraperRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRunScraperMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the database for specified project IDs.
     * </pre>
     */
    public ondewo.qa.Qa.UpdateDatabaseResponse updateDatabase(ondewo.qa.Qa.UpdateDatabaseRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateDatabaseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Runs a training job for the QA system.
     * </pre>
     */
    public ondewo.qa.Qa.RunTrainingResponse runTraining(com.google.protobuf.Empty request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRunTrainingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the server state for QA.
     * </pre>
     */
    public ondewo.qa.Qa.GetServerStateResponse getServerState(com.google.protobuf.Empty request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetServerStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists project IDs associated with QA.
     * </pre>
     */
    public ondewo.qa.Qa.ListProjectIdsResponse listProjectIds(com.google.protobuf.Empty request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListProjectIdsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the configuration of a specific project.
     * </pre>
     */
    public ondewo.qa.Qa.GetProjectConfigResponse getProjectConfig(ondewo.qa.Qa.GetProjectConfigRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetProjectConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service QA.
   * <pre>
   * gRPC service for QA functionalities.
   * </pre>
   */
  public static final class QABlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QABlockingStub> {
    private QABlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QABlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QABlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves an answer based on the provided request.
     * </pre>
     */
    public ondewo.qa.Qa.GetAnswerResponse getAnswer(ondewo.qa.Qa.GetAnswerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnswerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Runs a web scraper job for specified project IDs.
     * </pre>
     */
    public ondewo.qa.Qa.RunScraperResponse runScraper(ondewo.qa.Qa.RunScraperRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRunScraperMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the database for specified project IDs.
     * </pre>
     */
    public ondewo.qa.Qa.UpdateDatabaseResponse updateDatabase(ondewo.qa.Qa.UpdateDatabaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDatabaseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Runs a training job for the QA system.
     * </pre>
     */
    public ondewo.qa.Qa.RunTrainingResponse runTraining(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRunTrainingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the server state for QA.
     * </pre>
     */
    public ondewo.qa.Qa.GetServerStateResponse getServerState(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServerStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists project IDs associated with QA.
     * </pre>
     */
    public ondewo.qa.Qa.ListProjectIdsResponse listProjectIds(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProjectIdsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the configuration of a specific project.
     * </pre>
     */
    public ondewo.qa.Qa.GetProjectConfigResponse getProjectConfig(ondewo.qa.Qa.GetProjectConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProjectConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service QA.
   * <pre>
   * gRPC service for QA functionalities.
   * </pre>
   */
  public static final class QAFutureStub
      extends io.grpc.stub.AbstractFutureStub<QAFutureStub> {
    private QAFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QAFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QAFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves an answer based on the provided request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.qa.Qa.GetAnswerResponse> getAnswer(
        ondewo.qa.Qa.GetAnswerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnswerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Runs a web scraper job for specified project IDs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.qa.Qa.RunScraperResponse> runScraper(
        ondewo.qa.Qa.RunScraperRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRunScraperMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the database for specified project IDs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.qa.Qa.UpdateDatabaseResponse> updateDatabase(
        ondewo.qa.Qa.UpdateDatabaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDatabaseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Runs a training job for the QA system.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.qa.Qa.RunTrainingResponse> runTraining(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRunTrainingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the server state for QA.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.qa.Qa.GetServerStateResponse> getServerState(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServerStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists project IDs associated with QA.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.qa.Qa.ListProjectIdsResponse> listProjectIds(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProjectIdsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the configuration of a specific project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.qa.Qa.GetProjectConfigResponse> getProjectConfig(
        ondewo.qa.Qa.GetProjectConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProjectConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ANSWER = 0;
  private static final int METHODID_RUN_SCRAPER = 1;
  private static final int METHODID_UPDATE_DATABASE = 2;
  private static final int METHODID_RUN_TRAINING = 3;
  private static final int METHODID_GET_SERVER_STATE = 4;
  private static final int METHODID_LIST_PROJECT_IDS = 5;
  private static final int METHODID_GET_PROJECT_CONFIG = 6;

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
        case METHODID_GET_ANSWER:
          serviceImpl.getAnswer((ondewo.qa.Qa.GetAnswerRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.qa.Qa.GetAnswerResponse>) responseObserver);
          break;
        case METHODID_RUN_SCRAPER:
          serviceImpl.runScraper((ondewo.qa.Qa.RunScraperRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.qa.Qa.RunScraperResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DATABASE:
          serviceImpl.updateDatabase((ondewo.qa.Qa.UpdateDatabaseRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.qa.Qa.UpdateDatabaseResponse>) responseObserver);
          break;
        case METHODID_RUN_TRAINING:
          serviceImpl.runTraining((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<ondewo.qa.Qa.RunTrainingResponse>) responseObserver);
          break;
        case METHODID_GET_SERVER_STATE:
          serviceImpl.getServerState((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<ondewo.qa.Qa.GetServerStateResponse>) responseObserver);
          break;
        case METHODID_LIST_PROJECT_IDS:
          serviceImpl.listProjectIds((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<ondewo.qa.Qa.ListProjectIdsResponse>) responseObserver);
          break;
        case METHODID_GET_PROJECT_CONFIG:
          serviceImpl.getProjectConfig((ondewo.qa.Qa.GetProjectConfigRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.qa.Qa.GetProjectConfigResponse>) responseObserver);
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
          getGetAnswerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.qa.Qa.GetAnswerRequest,
              ondewo.qa.Qa.GetAnswerResponse>(
                service, METHODID_GET_ANSWER)))
        .addMethod(
          getRunScraperMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.qa.Qa.RunScraperRequest,
              ondewo.qa.Qa.RunScraperResponse>(
                service, METHODID_RUN_SCRAPER)))
        .addMethod(
          getUpdateDatabaseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.qa.Qa.UpdateDatabaseRequest,
              ondewo.qa.Qa.UpdateDatabaseResponse>(
                service, METHODID_UPDATE_DATABASE)))
        .addMethod(
          getRunTrainingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              ondewo.qa.Qa.RunTrainingResponse>(
                service, METHODID_RUN_TRAINING)))
        .addMethod(
          getGetServerStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              ondewo.qa.Qa.GetServerStateResponse>(
                service, METHODID_GET_SERVER_STATE)))
        .addMethod(
          getListProjectIdsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              ondewo.qa.Qa.ListProjectIdsResponse>(
                service, METHODID_LIST_PROJECT_IDS)))
        .addMethod(
          getGetProjectConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.qa.Qa.GetProjectConfigRequest,
              ondewo.qa.Qa.GetProjectConfigResponse>(
                service, METHODID_GET_PROJECT_CONFIG)))
        .build();
  }

  private static abstract class QABaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QABaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ondewo.qa.Qa.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QA");
    }
  }

  private static final class QAFileDescriptorSupplier
      extends QABaseDescriptorSupplier {
    QAFileDescriptorSupplier() {}
  }

  private static final class QAMethodDescriptorSupplier
      extends QABaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    QAMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (QAGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QAFileDescriptorSupplier())
              .addMethod(getGetAnswerMethod())
              .addMethod(getRunScraperMethod())
              .addMethod(getUpdateDatabaseMethod())
              .addMethod(getRunTrainingMethod())
              .addMethod(getGetServerStateMethod())
              .addMethod(getListProjectIdsMethod())
              .addMethod(getGetProjectConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
