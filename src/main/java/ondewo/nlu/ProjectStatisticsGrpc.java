package ondewo.nlu;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Project Root Statistics
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ProjectStatisticsGrpc {

  private ProjectStatisticsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.nlu.ProjectStatistics";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetIntentCountRequest,
      com.ondewo.nlu.StatResponse> getGetIntentCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIntentCount",
      requestType = ondewo.nlu.ProjectStatisticsOuterClass.GetIntentCountRequest.class,
      responseType = com.ondewo.nlu.StatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetIntentCountRequest,
      com.ondewo.nlu.StatResponse> getGetIntentCountMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetIntentCountRequest, com.ondewo.nlu.StatResponse> getGetIntentCountMethod;
    if ((getGetIntentCountMethod = ProjectStatisticsGrpc.getGetIntentCountMethod) == null) {
      synchronized (ProjectStatisticsGrpc.class) {
        if ((getGetIntentCountMethod = ProjectStatisticsGrpc.getGetIntentCountMethod) == null) {
          ProjectStatisticsGrpc.getGetIntentCountMethod = getGetIntentCountMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.ProjectStatisticsOuterClass.GetIntentCountRequest, com.ondewo.nlu.StatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIntentCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.ProjectStatisticsOuterClass.GetIntentCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.StatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectStatisticsMethodDescriptorSupplier("GetIntentCount"))
              .build();
        }
      }
    }
    return getGetIntentCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetEntityTypeCountRequest,
      com.ondewo.nlu.StatResponse> getGetEntityTypeCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEntityTypeCount",
      requestType = ondewo.nlu.ProjectStatisticsOuterClass.GetEntityTypeCountRequest.class,
      responseType = com.ondewo.nlu.StatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetEntityTypeCountRequest,
      com.ondewo.nlu.StatResponse> getGetEntityTypeCountMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetEntityTypeCountRequest, com.ondewo.nlu.StatResponse> getGetEntityTypeCountMethod;
    if ((getGetEntityTypeCountMethod = ProjectStatisticsGrpc.getGetEntityTypeCountMethod) == null) {
      synchronized (ProjectStatisticsGrpc.class) {
        if ((getGetEntityTypeCountMethod = ProjectStatisticsGrpc.getGetEntityTypeCountMethod) == null) {
          ProjectStatisticsGrpc.getGetEntityTypeCountMethod = getGetEntityTypeCountMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.ProjectStatisticsOuterClass.GetEntityTypeCountRequest, com.ondewo.nlu.StatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEntityTypeCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.ProjectStatisticsOuterClass.GetEntityTypeCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.StatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectStatisticsMethodDescriptorSupplier("GetEntityTypeCount"))
              .build();
        }
      }
    }
    return getGetEntityTypeCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest,
      com.ondewo.nlu.StatResponse> getGetUserCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserCount",
      requestType = ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest.class,
      responseType = com.ondewo.nlu.StatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest,
      com.ondewo.nlu.StatResponse> getGetUserCountMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest, com.ondewo.nlu.StatResponse> getGetUserCountMethod;
    if ((getGetUserCountMethod = ProjectStatisticsGrpc.getGetUserCountMethod) == null) {
      synchronized (ProjectStatisticsGrpc.class) {
        if ((getGetUserCountMethod = ProjectStatisticsGrpc.getGetUserCountMethod) == null) {
          ProjectStatisticsGrpc.getGetUserCountMethod = getGetUserCountMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest, com.ondewo.nlu.StatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.StatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectStatisticsMethodDescriptorSupplier("GetUserCount"))
              .build();
        }
      }
    }
    return getGetUserCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest,
      com.ondewo.nlu.StatResponse> getGetSessionCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSessionCount",
      requestType = ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest.class,
      responseType = com.ondewo.nlu.StatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest,
      com.ondewo.nlu.StatResponse> getGetSessionCountMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest, com.ondewo.nlu.StatResponse> getGetSessionCountMethod;
    if ((getGetSessionCountMethod = ProjectStatisticsGrpc.getGetSessionCountMethod) == null) {
      synchronized (ProjectStatisticsGrpc.class) {
        if ((getGetSessionCountMethod = ProjectStatisticsGrpc.getGetSessionCountMethod) == null) {
          ProjectStatisticsGrpc.getGetSessionCountMethod = getGetSessionCountMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest, com.ondewo.nlu.StatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSessionCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.StatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectStatisticsMethodDescriptorSupplier("GetSessionCount"))
              .build();
        }
      }
    }
    return getGetSessionCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest,
      com.ondewo.nlu.StatResponse> getGetTrainingPhraseCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTrainingPhraseCount",
      requestType = ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest.class,
      responseType = com.ondewo.nlu.StatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest,
      com.ondewo.nlu.StatResponse> getGetTrainingPhraseCountMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest, com.ondewo.nlu.StatResponse> getGetTrainingPhraseCountMethod;
    if ((getGetTrainingPhraseCountMethod = ProjectStatisticsGrpc.getGetTrainingPhraseCountMethod) == null) {
      synchronized (ProjectStatisticsGrpc.class) {
        if ((getGetTrainingPhraseCountMethod = ProjectStatisticsGrpc.getGetTrainingPhraseCountMethod) == null) {
          ProjectStatisticsGrpc.getGetTrainingPhraseCountMethod = getGetTrainingPhraseCountMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest, com.ondewo.nlu.StatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTrainingPhraseCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.StatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectStatisticsMethodDescriptorSupplier("GetTrainingPhraseCount"))
              .build();
        }
      }
    }
    return getGetTrainingPhraseCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest,
      com.ondewo.nlu.StatResponse> getGetResponseCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetResponseCount",
      requestType = ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest.class,
      responseType = com.ondewo.nlu.StatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest,
      com.ondewo.nlu.StatResponse> getGetResponseCountMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest, com.ondewo.nlu.StatResponse> getGetResponseCountMethod;
    if ((getGetResponseCountMethod = ProjectStatisticsGrpc.getGetResponseCountMethod) == null) {
      synchronized (ProjectStatisticsGrpc.class) {
        if ((getGetResponseCountMethod = ProjectStatisticsGrpc.getGetResponseCountMethod) == null) {
          ProjectStatisticsGrpc.getGetResponseCountMethod = getGetResponseCountMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest, com.ondewo.nlu.StatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetResponseCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.StatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectStatisticsMethodDescriptorSupplier("GetResponseCount"))
              .build();
        }
      }
    }
    return getGetResponseCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest,
      com.ondewo.nlu.StatResponse> getGetEntityValueCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEntityValueCount",
      requestType = ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest.class,
      responseType = com.ondewo.nlu.StatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest,
      com.ondewo.nlu.StatResponse> getGetEntityValueCountMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest, com.ondewo.nlu.StatResponse> getGetEntityValueCountMethod;
    if ((getGetEntityValueCountMethod = ProjectStatisticsGrpc.getGetEntityValueCountMethod) == null) {
      synchronized (ProjectStatisticsGrpc.class) {
        if ((getGetEntityValueCountMethod = ProjectStatisticsGrpc.getGetEntityValueCountMethod) == null) {
          ProjectStatisticsGrpc.getGetEntityValueCountMethod = getGetEntityValueCountMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest, com.ondewo.nlu.StatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEntityValueCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.StatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectStatisticsMethodDescriptorSupplier("GetEntityValueCount"))
              .build();
        }
      }
    }
    return getGetEntityValueCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest,
      com.ondewo.nlu.StatResponse> getGetEntitySynonymCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEntitySynonymCount",
      requestType = ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest.class,
      responseType = com.ondewo.nlu.StatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest,
      com.ondewo.nlu.StatResponse> getGetEntitySynonymCountMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest, com.ondewo.nlu.StatResponse> getGetEntitySynonymCountMethod;
    if ((getGetEntitySynonymCountMethod = ProjectStatisticsGrpc.getGetEntitySynonymCountMethod) == null) {
      synchronized (ProjectStatisticsGrpc.class) {
        if ((getGetEntitySynonymCountMethod = ProjectStatisticsGrpc.getGetEntitySynonymCountMethod) == null) {
          ProjectStatisticsGrpc.getGetEntitySynonymCountMethod = getGetEntitySynonymCountMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest, com.ondewo.nlu.StatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEntitySynonymCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.StatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectStatisticsMethodDescriptorSupplier("GetEntitySynonymCount"))
              .build();
        }
      }
    }
    return getGetEntitySynonymCountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectStatisticsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectStatisticsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectStatisticsStub>() {
        @java.lang.Override
        public ProjectStatisticsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectStatisticsStub(channel, callOptions);
        }
      };
    return ProjectStatisticsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ProjectStatisticsBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectStatisticsBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectStatisticsBlockingV2Stub>() {
        @java.lang.Override
        public ProjectStatisticsBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectStatisticsBlockingV2Stub(channel, callOptions);
        }
      };
    return ProjectStatisticsBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectStatisticsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectStatisticsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectStatisticsBlockingStub>() {
        @java.lang.Override
        public ProjectStatisticsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectStatisticsBlockingStub(channel, callOptions);
        }
      };
    return ProjectStatisticsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectStatisticsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectStatisticsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectStatisticsFutureStub>() {
        @java.lang.Override
        public ProjectStatisticsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectStatisticsFutureStub(channel, callOptions);
        }
      };
    return ProjectStatisticsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Project Root Statistics
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns the intent count within a project
     * </pre>
     */
    default void getIntentCount(ondewo.nlu.ProjectStatisticsOuterClass.GetIntentCountRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIntentCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the entity types count within a project
     * </pre>
     */
    default void getEntityTypeCount(ondewo.nlu.ProjectStatisticsOuterClass.GetEntityTypeCountRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEntityTypeCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the users count within a project
     * </pre>
     */
    default void getUserCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the sessions count within a project
     * </pre>
     */
    default void getSessionCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSessionCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the training phrases count within a project
     * </pre>
     */
    default void getTrainingPhraseCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTrainingPhraseCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the responses count within a project
     * </pre>
     */
    default void getResponseCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetResponseCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the entity value count within a project
     * </pre>
     */
    default void getEntityValueCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEntityValueCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the entity synonyms count within a project
     * </pre>
     */
    default void getEntitySynonymCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEntitySynonymCountMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProjectStatistics.
   * <pre>
   * Project Root Statistics
   * </pre>
   */
  public static abstract class ProjectStatisticsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProjectStatisticsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProjectStatistics.
   * <pre>
   * Project Root Statistics
   * </pre>
   */
  public static final class ProjectStatisticsStub
      extends io.grpc.stub.AbstractAsyncStub<ProjectStatisticsStub> {
    private ProjectStatisticsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectStatisticsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectStatisticsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the intent count within a project
     * </pre>
     */
    public void getIntentCount(ondewo.nlu.ProjectStatisticsOuterClass.GetIntentCountRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIntentCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the entity types count within a project
     * </pre>
     */
    public void getEntityTypeCount(ondewo.nlu.ProjectStatisticsOuterClass.GetEntityTypeCountRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEntityTypeCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the users count within a project
     * </pre>
     */
    public void getUserCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the sessions count within a project
     * </pre>
     */
    public void getSessionCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSessionCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the training phrases count within a project
     * </pre>
     */
    public void getTrainingPhraseCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTrainingPhraseCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the responses count within a project
     * </pre>
     */
    public void getResponseCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetResponseCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the entity value count within a project
     * </pre>
     */
    public void getEntityValueCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEntityValueCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the entity synonyms count within a project
     * </pre>
     */
    public void getEntitySynonymCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEntitySynonymCountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProjectStatistics.
   * <pre>
   * Project Root Statistics
   * </pre>
   */
  public static final class ProjectStatisticsBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ProjectStatisticsBlockingV2Stub> {
    private ProjectStatisticsBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectStatisticsBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectStatisticsBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the intent count within a project
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getIntentCount(ondewo.nlu.ProjectStatisticsOuterClass.GetIntentCountRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetIntentCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the entity types count within a project
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getEntityTypeCount(ondewo.nlu.ProjectStatisticsOuterClass.GetEntityTypeCountRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetEntityTypeCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the users count within a project
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getUserCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetUserCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the sessions count within a project
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getSessionCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetSessionCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the training phrases count within a project
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getTrainingPhraseCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetTrainingPhraseCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the responses count within a project
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getResponseCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetResponseCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the entity value count within a project
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getEntityValueCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetEntityValueCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the entity synonyms count within a project
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getEntitySynonymCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetEntitySynonymCountMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ProjectStatistics.
   * <pre>
   * Project Root Statistics
   * </pre>
   */
  public static final class ProjectStatisticsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProjectStatisticsBlockingStub> {
    private ProjectStatisticsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectStatisticsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectStatisticsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the intent count within a project
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getIntentCount(ondewo.nlu.ProjectStatisticsOuterClass.GetIntentCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIntentCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the entity types count within a project
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getEntityTypeCount(ondewo.nlu.ProjectStatisticsOuterClass.GetEntityTypeCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEntityTypeCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the users count within a project
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getUserCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the sessions count within a project
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getSessionCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSessionCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the training phrases count within a project
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getTrainingPhraseCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTrainingPhraseCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the responses count within a project
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getResponseCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetResponseCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the entity value count within a project
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getEntityValueCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEntityValueCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the entity synonyms count within a project
     * </pre>
     */
    public com.ondewo.nlu.StatResponse getEntitySynonymCount(ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEntitySynonymCountMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProjectStatistics.
   * <pre>
   * Project Root Statistics
   * </pre>
   */
  public static final class ProjectStatisticsFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProjectStatisticsFutureStub> {
    private ProjectStatisticsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectStatisticsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectStatisticsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the intent count within a project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.StatResponse> getIntentCount(
        ondewo.nlu.ProjectStatisticsOuterClass.GetIntentCountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIntentCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the entity types count within a project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.StatResponse> getEntityTypeCount(
        ondewo.nlu.ProjectStatisticsOuterClass.GetEntityTypeCountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEntityTypeCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the users count within a project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.StatResponse> getUserCount(
        ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the sessions count within a project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.StatResponse> getSessionCount(
        ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSessionCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the training phrases count within a project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.StatResponse> getTrainingPhraseCount(
        ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTrainingPhraseCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the responses count within a project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.StatResponse> getResponseCount(
        ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetResponseCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the entity value count within a project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.StatResponse> getEntityValueCount(
        ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEntityValueCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the entity synonyms count within a project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.StatResponse> getEntitySynonymCount(
        ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEntitySynonymCountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_INTENT_COUNT = 0;
  private static final int METHODID_GET_ENTITY_TYPE_COUNT = 1;
  private static final int METHODID_GET_USER_COUNT = 2;
  private static final int METHODID_GET_SESSION_COUNT = 3;
  private static final int METHODID_GET_TRAINING_PHRASE_COUNT = 4;
  private static final int METHODID_GET_RESPONSE_COUNT = 5;
  private static final int METHODID_GET_ENTITY_VALUE_COUNT = 6;
  private static final int METHODID_GET_ENTITY_SYNONYM_COUNT = 7;

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
        case METHODID_GET_INTENT_COUNT:
          serviceImpl.getIntentCount((ondewo.nlu.ProjectStatisticsOuterClass.GetIntentCountRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse>) responseObserver);
          break;
        case METHODID_GET_ENTITY_TYPE_COUNT:
          serviceImpl.getEntityTypeCount((ondewo.nlu.ProjectStatisticsOuterClass.GetEntityTypeCountRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse>) responseObserver);
          break;
        case METHODID_GET_USER_COUNT:
          serviceImpl.getUserCount((ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse>) responseObserver);
          break;
        case METHODID_GET_SESSION_COUNT:
          serviceImpl.getSessionCount((ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse>) responseObserver);
          break;
        case METHODID_GET_TRAINING_PHRASE_COUNT:
          serviceImpl.getTrainingPhraseCount((ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse>) responseObserver);
          break;
        case METHODID_GET_RESPONSE_COUNT:
          serviceImpl.getResponseCount((ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse>) responseObserver);
          break;
        case METHODID_GET_ENTITY_VALUE_COUNT:
          serviceImpl.getEntityValueCount((ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.StatResponse>) responseObserver);
          break;
        case METHODID_GET_ENTITY_SYNONYM_COUNT:
          serviceImpl.getEntitySynonymCount((ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest) request,
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
          getGetIntentCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.ProjectStatisticsOuterClass.GetIntentCountRequest,
              com.ondewo.nlu.StatResponse>(
                service, METHODID_GET_INTENT_COUNT)))
        .addMethod(
          getGetEntityTypeCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.ProjectStatisticsOuterClass.GetEntityTypeCountRequest,
              com.ondewo.nlu.StatResponse>(
                service, METHODID_GET_ENTITY_TYPE_COUNT)))
        .addMethod(
          getGetUserCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest,
              com.ondewo.nlu.StatResponse>(
                service, METHODID_GET_USER_COUNT)))
        .addMethod(
          getGetSessionCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.ProjectStatisticsOuterClass.GetProjectStatRequest,
              com.ondewo.nlu.StatResponse>(
                service, METHODID_GET_SESSION_COUNT)))
        .addMethod(
          getGetTrainingPhraseCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest,
              com.ondewo.nlu.StatResponse>(
                service, METHODID_GET_TRAINING_PHRASE_COUNT)))
        .addMethod(
          getGetResponseCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest,
              com.ondewo.nlu.StatResponse>(
                service, METHODID_GET_RESPONSE_COUNT)))
        .addMethod(
          getGetEntityValueCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest,
              com.ondewo.nlu.StatResponse>(
                service, METHODID_GET_ENTITY_VALUE_COUNT)))
        .addMethod(
          getGetEntitySynonymCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.ProjectStatisticsOuterClass.GetProjectElementStatRequest,
              com.ondewo.nlu.StatResponse>(
                service, METHODID_GET_ENTITY_SYNONYM_COUNT)))
        .build();
  }

  private static abstract class ProjectStatisticsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectStatisticsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ondewo.nlu.ProjectStatisticsOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProjectStatistics");
    }
  }

  private static final class ProjectStatisticsFileDescriptorSupplier
      extends ProjectStatisticsBaseDescriptorSupplier {
    ProjectStatisticsFileDescriptorSupplier() {}
  }

  private static final class ProjectStatisticsMethodDescriptorSupplier
      extends ProjectStatisticsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProjectStatisticsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProjectStatisticsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectStatisticsFileDescriptorSupplier())
              .addMethod(getGetIntentCountMethod())
              .addMethod(getGetEntityTypeCountMethod())
              .addMethod(getGetUserCountMethod())
              .addMethod(getGetSessionCountMethod())
              .addMethod(getGetTrainingPhraseCountMethod())
              .addMethod(getGetResponseCountMethod())
              .addMethod(getGetEntityValueCountMethod())
              .addMethod(getGetEntitySynonymCountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
