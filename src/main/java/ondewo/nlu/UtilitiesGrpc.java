package ondewo.nlu;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * This is collection of utility endpoints, intended to language-independent operations, such as code checks, regex checks, etc. Holds a collection of utility functions
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class UtilitiesGrpc {

  private UtilitiesGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.nlu.Utilities";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Utility.ValidateRegexRequest,
      ondewo.nlu.Utility.ValidateRegexResponse> getValidateRegexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateRegex",
      requestType = ondewo.nlu.Utility.ValidateRegexRequest.class,
      responseType = ondewo.nlu.Utility.ValidateRegexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Utility.ValidateRegexRequest,
      ondewo.nlu.Utility.ValidateRegexResponse> getValidateRegexMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Utility.ValidateRegexRequest, ondewo.nlu.Utility.ValidateRegexResponse> getValidateRegexMethod;
    if ((getValidateRegexMethod = UtilitiesGrpc.getValidateRegexMethod) == null) {
      synchronized (UtilitiesGrpc.class) {
        if ((getValidateRegexMethod = UtilitiesGrpc.getValidateRegexMethod) == null) {
          UtilitiesGrpc.getValidateRegexMethod = getValidateRegexMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Utility.ValidateRegexRequest, ondewo.nlu.Utility.ValidateRegexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateRegex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Utility.ValidateRegexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Utility.ValidateRegexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UtilitiesMethodDescriptorSupplier("ValidateRegex"))
              .build();
        }
      }
    }
    return getValidateRegexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Utility.ValidateEmbeddedRegexRequest,
      ondewo.nlu.Utility.ValidateEmbeddedRegexResponse> getValidateEmbeddedRegexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateEmbeddedRegex",
      requestType = ondewo.nlu.Utility.ValidateEmbeddedRegexRequest.class,
      responseType = ondewo.nlu.Utility.ValidateEmbeddedRegexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Utility.ValidateEmbeddedRegexRequest,
      ondewo.nlu.Utility.ValidateEmbeddedRegexResponse> getValidateEmbeddedRegexMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Utility.ValidateEmbeddedRegexRequest, ondewo.nlu.Utility.ValidateEmbeddedRegexResponse> getValidateEmbeddedRegexMethod;
    if ((getValidateEmbeddedRegexMethod = UtilitiesGrpc.getValidateEmbeddedRegexMethod) == null) {
      synchronized (UtilitiesGrpc.class) {
        if ((getValidateEmbeddedRegexMethod = UtilitiesGrpc.getValidateEmbeddedRegexMethod) == null) {
          UtilitiesGrpc.getValidateEmbeddedRegexMethod = getValidateEmbeddedRegexMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Utility.ValidateEmbeddedRegexRequest, ondewo.nlu.Utility.ValidateEmbeddedRegexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateEmbeddedRegex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Utility.ValidateEmbeddedRegexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Utility.ValidateEmbeddedRegexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UtilitiesMethodDescriptorSupplier("ValidateEmbeddedRegex"))
              .build();
        }
      }
    }
    return getValidateEmbeddedRegexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Utility.CleanAllIntentsRequest,
      ondewo.nlu.Utility.CleanAllIntentsResponse> getCleanAllIntentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CleanAllIntents",
      requestType = ondewo.nlu.Utility.CleanAllIntentsRequest.class,
      responseType = ondewo.nlu.Utility.CleanAllIntentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Utility.CleanAllIntentsRequest,
      ondewo.nlu.Utility.CleanAllIntentsResponse> getCleanAllIntentsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Utility.CleanAllIntentsRequest, ondewo.nlu.Utility.CleanAllIntentsResponse> getCleanAllIntentsMethod;
    if ((getCleanAllIntentsMethod = UtilitiesGrpc.getCleanAllIntentsMethod) == null) {
      synchronized (UtilitiesGrpc.class) {
        if ((getCleanAllIntentsMethod = UtilitiesGrpc.getCleanAllIntentsMethod) == null) {
          UtilitiesGrpc.getCleanAllIntentsMethod = getCleanAllIntentsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Utility.CleanAllIntentsRequest, ondewo.nlu.Utility.CleanAllIntentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CleanAllIntents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Utility.CleanAllIntentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Utility.CleanAllIntentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UtilitiesMethodDescriptorSupplier("CleanAllIntents"))
              .build();
        }
      }
    }
    return getCleanAllIntentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Utility.CleanIntentRequest,
      ondewo.nlu.Utility.CleanIntentResponse> getCleanIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CleanIntent",
      requestType = ondewo.nlu.Utility.CleanIntentRequest.class,
      responseType = ondewo.nlu.Utility.CleanIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Utility.CleanIntentRequest,
      ondewo.nlu.Utility.CleanIntentResponse> getCleanIntentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Utility.CleanIntentRequest, ondewo.nlu.Utility.CleanIntentResponse> getCleanIntentMethod;
    if ((getCleanIntentMethod = UtilitiesGrpc.getCleanIntentMethod) == null) {
      synchronized (UtilitiesGrpc.class) {
        if ((getCleanIntentMethod = UtilitiesGrpc.getCleanIntentMethod) == null) {
          UtilitiesGrpc.getCleanIntentMethod = getCleanIntentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Utility.CleanIntentRequest, ondewo.nlu.Utility.CleanIntentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CleanIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Utility.CleanIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Utility.CleanIntentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UtilitiesMethodDescriptorSupplier("CleanIntent"))
              .build();
        }
      }
    }
    return getCleanIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Utility.CleanAllEntityTypesRequest,
      ondewo.nlu.Utility.CleanAllEntityTypesResponse> getCleanAllEntityTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CleanAllEntityTypes",
      requestType = ondewo.nlu.Utility.CleanAllEntityTypesRequest.class,
      responseType = ondewo.nlu.Utility.CleanAllEntityTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Utility.CleanAllEntityTypesRequest,
      ondewo.nlu.Utility.CleanAllEntityTypesResponse> getCleanAllEntityTypesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Utility.CleanAllEntityTypesRequest, ondewo.nlu.Utility.CleanAllEntityTypesResponse> getCleanAllEntityTypesMethod;
    if ((getCleanAllEntityTypesMethod = UtilitiesGrpc.getCleanAllEntityTypesMethod) == null) {
      synchronized (UtilitiesGrpc.class) {
        if ((getCleanAllEntityTypesMethod = UtilitiesGrpc.getCleanAllEntityTypesMethod) == null) {
          UtilitiesGrpc.getCleanAllEntityTypesMethod = getCleanAllEntityTypesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Utility.CleanAllEntityTypesRequest, ondewo.nlu.Utility.CleanAllEntityTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CleanAllEntityTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Utility.CleanAllEntityTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Utility.CleanAllEntityTypesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UtilitiesMethodDescriptorSupplier("CleanAllEntityTypes"))
              .build();
        }
      }
    }
    return getCleanAllEntityTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Utility.CleanEntityTypeRequest,
      ondewo.nlu.Utility.CleanEntityTypeResponse> getCleanEntityTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CleanEntityType",
      requestType = ondewo.nlu.Utility.CleanEntityTypeRequest.class,
      responseType = ondewo.nlu.Utility.CleanEntityTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Utility.CleanEntityTypeRequest,
      ondewo.nlu.Utility.CleanEntityTypeResponse> getCleanEntityTypeMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Utility.CleanEntityTypeRequest, ondewo.nlu.Utility.CleanEntityTypeResponse> getCleanEntityTypeMethod;
    if ((getCleanEntityTypeMethod = UtilitiesGrpc.getCleanEntityTypeMethod) == null) {
      synchronized (UtilitiesGrpc.class) {
        if ((getCleanEntityTypeMethod = UtilitiesGrpc.getCleanEntityTypeMethod) == null) {
          UtilitiesGrpc.getCleanEntityTypeMethod = getCleanEntityTypeMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Utility.CleanEntityTypeRequest, ondewo.nlu.Utility.CleanEntityTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CleanEntityType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Utility.CleanEntityTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Utility.CleanEntityTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UtilitiesMethodDescriptorSupplier("CleanEntityType"))
              .build();
        }
      }
    }
    return getCleanEntityTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Utility.AddTrainingPhrasesRequest,
      ondewo.nlu.Utility.AddTrainingPhrasesResponse> getAddTrainingPhrasesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTrainingPhrases",
      requestType = ondewo.nlu.Utility.AddTrainingPhrasesRequest.class,
      responseType = ondewo.nlu.Utility.AddTrainingPhrasesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Utility.AddTrainingPhrasesRequest,
      ondewo.nlu.Utility.AddTrainingPhrasesResponse> getAddTrainingPhrasesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Utility.AddTrainingPhrasesRequest, ondewo.nlu.Utility.AddTrainingPhrasesResponse> getAddTrainingPhrasesMethod;
    if ((getAddTrainingPhrasesMethod = UtilitiesGrpc.getAddTrainingPhrasesMethod) == null) {
      synchronized (UtilitiesGrpc.class) {
        if ((getAddTrainingPhrasesMethod = UtilitiesGrpc.getAddTrainingPhrasesMethod) == null) {
          UtilitiesGrpc.getAddTrainingPhrasesMethod = getAddTrainingPhrasesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Utility.AddTrainingPhrasesRequest, ondewo.nlu.Utility.AddTrainingPhrasesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddTrainingPhrases"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Utility.AddTrainingPhrasesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Utility.AddTrainingPhrasesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UtilitiesMethodDescriptorSupplier("AddTrainingPhrases"))
              .build();
        }
      }
    }
    return getAddTrainingPhrasesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Utility.AddTrainingPhrasesFromCSVRequest,
      ondewo.nlu.Utility.AddTrainingPhrasesResponse> getAddTrainingPhrasesFromCSVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTrainingPhrasesFromCSV",
      requestType = ondewo.nlu.Utility.AddTrainingPhrasesFromCSVRequest.class,
      responseType = ondewo.nlu.Utility.AddTrainingPhrasesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Utility.AddTrainingPhrasesFromCSVRequest,
      ondewo.nlu.Utility.AddTrainingPhrasesResponse> getAddTrainingPhrasesFromCSVMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Utility.AddTrainingPhrasesFromCSVRequest, ondewo.nlu.Utility.AddTrainingPhrasesResponse> getAddTrainingPhrasesFromCSVMethod;
    if ((getAddTrainingPhrasesFromCSVMethod = UtilitiesGrpc.getAddTrainingPhrasesFromCSVMethod) == null) {
      synchronized (UtilitiesGrpc.class) {
        if ((getAddTrainingPhrasesFromCSVMethod = UtilitiesGrpc.getAddTrainingPhrasesFromCSVMethod) == null) {
          UtilitiesGrpc.getAddTrainingPhrasesFromCSVMethod = getAddTrainingPhrasesFromCSVMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Utility.AddTrainingPhrasesFromCSVRequest, ondewo.nlu.Utility.AddTrainingPhrasesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddTrainingPhrasesFromCSV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Utility.AddTrainingPhrasesFromCSVRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Utility.AddTrainingPhrasesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UtilitiesMethodDescriptorSupplier("AddTrainingPhrasesFromCSV"))
              .build();
        }
      }
    }
    return getAddTrainingPhrasesFromCSVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UtilitiesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UtilitiesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UtilitiesStub>() {
        @java.lang.Override
        public UtilitiesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UtilitiesStub(channel, callOptions);
        }
      };
    return UtilitiesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static UtilitiesBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UtilitiesBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UtilitiesBlockingV2Stub>() {
        @java.lang.Override
        public UtilitiesBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UtilitiesBlockingV2Stub(channel, callOptions);
        }
      };
    return UtilitiesBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UtilitiesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UtilitiesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UtilitiesBlockingStub>() {
        @java.lang.Override
        public UtilitiesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UtilitiesBlockingStub(channel, callOptions);
        }
      };
    return UtilitiesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UtilitiesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UtilitiesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UtilitiesFutureStub>() {
        @java.lang.Override
        public UtilitiesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UtilitiesFutureStub(channel, callOptions);
        }
      };
    return UtilitiesFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * This is collection of utility endpoints, intended to language-independent operations, such as code checks, regex checks, etc. Holds a collection of utility functions
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Validates the validity of python regexes
     * </pre>
     */
    default void validateRegex(ondewo.nlu.Utility.ValidateRegexRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Utility.ValidateRegexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateRegexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validate that entity types with group references have synonyms with
     * capturing groups.
     * </pre>
     */
    default void validateEmbeddedRegex(ondewo.nlu.Utility.ValidateEmbeddedRegexRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Utility.ValidateEmbeddedRegexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateEmbeddedRegexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cleans all intent training phrases and entity annotations of parent
     * </pre>
     */
    default void cleanAllIntents(ondewo.nlu.Utility.CleanAllIntentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Utility.CleanAllIntentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCleanAllIntentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cleans single intent training phrases and entity annotations
     * </pre>
     */
    default void cleanIntent(ondewo.nlu.Utility.CleanIntentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Utility.CleanIntentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCleanIntentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cleans all entity types of parent
     * </pre>
     */
    default void cleanAllEntityTypes(ondewo.nlu.Utility.CleanAllEntityTypesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Utility.CleanAllEntityTypesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCleanAllEntityTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cleans entity type
     * </pre>
     */
    default void cleanEntityType(ondewo.nlu.Utility.CleanEntityTypeRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Utility.CleanEntityTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCleanEntityTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates new training phrases corresponding to intent specified by its intent display name
     * </pre>
     */
    default void addTrainingPhrases(ondewo.nlu.Utility.AddTrainingPhrasesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Utility.AddTrainingPhrasesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTrainingPhrasesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates new training phrases corresponding to intent specified by its intent display name from csv file
     * </pre>
     */
    default void addTrainingPhrasesFromCSV(ondewo.nlu.Utility.AddTrainingPhrasesFromCSVRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Utility.AddTrainingPhrasesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTrainingPhrasesFromCSVMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Utilities.
   * <pre>
   * This is collection of utility endpoints, intended to language-independent operations, such as code checks, regex checks, etc. Holds a collection of utility functions
   * </pre>
   */
  public static abstract class UtilitiesImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UtilitiesGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Utilities.
   * <pre>
   * This is collection of utility endpoints, intended to language-independent operations, such as code checks, regex checks, etc. Holds a collection of utility functions
   * </pre>
   */
  public static final class UtilitiesStub
      extends io.grpc.stub.AbstractAsyncStub<UtilitiesStub> {
    private UtilitiesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UtilitiesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UtilitiesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Validates the validity of python regexes
     * </pre>
     */
    public void validateRegex(ondewo.nlu.Utility.ValidateRegexRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Utility.ValidateRegexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateRegexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validate that entity types with group references have synonyms with
     * capturing groups.
     * </pre>
     */
    public void validateEmbeddedRegex(ondewo.nlu.Utility.ValidateEmbeddedRegexRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Utility.ValidateEmbeddedRegexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateEmbeddedRegexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cleans all intent training phrases and entity annotations of parent
     * </pre>
     */
    public void cleanAllIntents(ondewo.nlu.Utility.CleanAllIntentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Utility.CleanAllIntentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCleanAllIntentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cleans single intent training phrases and entity annotations
     * </pre>
     */
    public void cleanIntent(ondewo.nlu.Utility.CleanIntentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Utility.CleanIntentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCleanIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cleans all entity types of parent
     * </pre>
     */
    public void cleanAllEntityTypes(ondewo.nlu.Utility.CleanAllEntityTypesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Utility.CleanAllEntityTypesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCleanAllEntityTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cleans entity type
     * </pre>
     */
    public void cleanEntityType(ondewo.nlu.Utility.CleanEntityTypeRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Utility.CleanEntityTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCleanEntityTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates new training phrases corresponding to intent specified by its intent display name
     * </pre>
     */
    public void addTrainingPhrases(ondewo.nlu.Utility.AddTrainingPhrasesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Utility.AddTrainingPhrasesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTrainingPhrasesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates new training phrases corresponding to intent specified by its intent display name from csv file
     * </pre>
     */
    public void addTrainingPhrasesFromCSV(ondewo.nlu.Utility.AddTrainingPhrasesFromCSVRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Utility.AddTrainingPhrasesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTrainingPhrasesFromCSVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Utilities.
   * <pre>
   * This is collection of utility endpoints, intended to language-independent operations, such as code checks, regex checks, etc. Holds a collection of utility functions
   * </pre>
   */
  public static final class UtilitiesBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<UtilitiesBlockingV2Stub> {
    private UtilitiesBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UtilitiesBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UtilitiesBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Validates the validity of python regexes
     * </pre>
     */
    public ondewo.nlu.Utility.ValidateRegexResponse validateRegex(ondewo.nlu.Utility.ValidateRegexRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getValidateRegexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validate that entity types with group references have synonyms with
     * capturing groups.
     * </pre>
     */
    public ondewo.nlu.Utility.ValidateEmbeddedRegexResponse validateEmbeddedRegex(ondewo.nlu.Utility.ValidateEmbeddedRegexRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getValidateEmbeddedRegexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cleans all intent training phrases and entity annotations of parent
     * </pre>
     */
    public ondewo.nlu.Utility.CleanAllIntentsResponse cleanAllIntents(ondewo.nlu.Utility.CleanAllIntentsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCleanAllIntentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cleans single intent training phrases and entity annotations
     * </pre>
     */
    public ondewo.nlu.Utility.CleanIntentResponse cleanIntent(ondewo.nlu.Utility.CleanIntentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCleanIntentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cleans all entity types of parent
     * </pre>
     */
    public ondewo.nlu.Utility.CleanAllEntityTypesResponse cleanAllEntityTypes(ondewo.nlu.Utility.CleanAllEntityTypesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCleanAllEntityTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cleans entity type
     * </pre>
     */
    public ondewo.nlu.Utility.CleanEntityTypeResponse cleanEntityType(ondewo.nlu.Utility.CleanEntityTypeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCleanEntityTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates new training phrases corresponding to intent specified by its intent display name
     * </pre>
     */
    public ondewo.nlu.Utility.AddTrainingPhrasesResponse addTrainingPhrases(ondewo.nlu.Utility.AddTrainingPhrasesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getAddTrainingPhrasesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates new training phrases corresponding to intent specified by its intent display name from csv file
     * </pre>
     */
    public ondewo.nlu.Utility.AddTrainingPhrasesResponse addTrainingPhrasesFromCSV(ondewo.nlu.Utility.AddTrainingPhrasesFromCSVRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getAddTrainingPhrasesFromCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Utilities.
   * <pre>
   * This is collection of utility endpoints, intended to language-independent operations, such as code checks, regex checks, etc. Holds a collection of utility functions
   * </pre>
   */
  public static final class UtilitiesBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UtilitiesBlockingStub> {
    private UtilitiesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UtilitiesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UtilitiesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Validates the validity of python regexes
     * </pre>
     */
    public ondewo.nlu.Utility.ValidateRegexResponse validateRegex(ondewo.nlu.Utility.ValidateRegexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateRegexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validate that entity types with group references have synonyms with
     * capturing groups.
     * </pre>
     */
    public ondewo.nlu.Utility.ValidateEmbeddedRegexResponse validateEmbeddedRegex(ondewo.nlu.Utility.ValidateEmbeddedRegexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateEmbeddedRegexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cleans all intent training phrases and entity annotations of parent
     * </pre>
     */
    public ondewo.nlu.Utility.CleanAllIntentsResponse cleanAllIntents(ondewo.nlu.Utility.CleanAllIntentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCleanAllIntentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cleans single intent training phrases and entity annotations
     * </pre>
     */
    public ondewo.nlu.Utility.CleanIntentResponse cleanIntent(ondewo.nlu.Utility.CleanIntentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCleanIntentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cleans all entity types of parent
     * </pre>
     */
    public ondewo.nlu.Utility.CleanAllEntityTypesResponse cleanAllEntityTypes(ondewo.nlu.Utility.CleanAllEntityTypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCleanAllEntityTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cleans entity type
     * </pre>
     */
    public ondewo.nlu.Utility.CleanEntityTypeResponse cleanEntityType(ondewo.nlu.Utility.CleanEntityTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCleanEntityTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates new training phrases corresponding to intent specified by its intent display name
     * </pre>
     */
    public ondewo.nlu.Utility.AddTrainingPhrasesResponse addTrainingPhrases(ondewo.nlu.Utility.AddTrainingPhrasesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTrainingPhrasesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates new training phrases corresponding to intent specified by its intent display name from csv file
     * </pre>
     */
    public ondewo.nlu.Utility.AddTrainingPhrasesResponse addTrainingPhrasesFromCSV(ondewo.nlu.Utility.AddTrainingPhrasesFromCSVRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTrainingPhrasesFromCSVMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Utilities.
   * <pre>
   * This is collection of utility endpoints, intended to language-independent operations, such as code checks, regex checks, etc. Holds a collection of utility functions
   * </pre>
   */
  public static final class UtilitiesFutureStub
      extends io.grpc.stub.AbstractFutureStub<UtilitiesFutureStub> {
    private UtilitiesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UtilitiesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UtilitiesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Validates the validity of python regexes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Utility.ValidateRegexResponse> validateRegex(
        ondewo.nlu.Utility.ValidateRegexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateRegexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validate that entity types with group references have synonyms with
     * capturing groups.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Utility.ValidateEmbeddedRegexResponse> validateEmbeddedRegex(
        ondewo.nlu.Utility.ValidateEmbeddedRegexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateEmbeddedRegexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cleans all intent training phrases and entity annotations of parent
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Utility.CleanAllIntentsResponse> cleanAllIntents(
        ondewo.nlu.Utility.CleanAllIntentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCleanAllIntentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cleans single intent training phrases and entity annotations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Utility.CleanIntentResponse> cleanIntent(
        ondewo.nlu.Utility.CleanIntentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCleanIntentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cleans all entity types of parent
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Utility.CleanAllEntityTypesResponse> cleanAllEntityTypes(
        ondewo.nlu.Utility.CleanAllEntityTypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCleanAllEntityTypesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cleans entity type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Utility.CleanEntityTypeResponse> cleanEntityType(
        ondewo.nlu.Utility.CleanEntityTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCleanEntityTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates new training phrases corresponding to intent specified by its intent display name
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Utility.AddTrainingPhrasesResponse> addTrainingPhrases(
        ondewo.nlu.Utility.AddTrainingPhrasesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTrainingPhrasesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates new training phrases corresponding to intent specified by its intent display name from csv file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Utility.AddTrainingPhrasesResponse> addTrainingPhrasesFromCSV(
        ondewo.nlu.Utility.AddTrainingPhrasesFromCSVRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTrainingPhrasesFromCSVMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VALIDATE_REGEX = 0;
  private static final int METHODID_VALIDATE_EMBEDDED_REGEX = 1;
  private static final int METHODID_CLEAN_ALL_INTENTS = 2;
  private static final int METHODID_CLEAN_INTENT = 3;
  private static final int METHODID_CLEAN_ALL_ENTITY_TYPES = 4;
  private static final int METHODID_CLEAN_ENTITY_TYPE = 5;
  private static final int METHODID_ADD_TRAINING_PHRASES = 6;
  private static final int METHODID_ADD_TRAINING_PHRASES_FROM_CSV = 7;

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
        case METHODID_VALIDATE_REGEX:
          serviceImpl.validateRegex((ondewo.nlu.Utility.ValidateRegexRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Utility.ValidateRegexResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_EMBEDDED_REGEX:
          serviceImpl.validateEmbeddedRegex((ondewo.nlu.Utility.ValidateEmbeddedRegexRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Utility.ValidateEmbeddedRegexResponse>) responseObserver);
          break;
        case METHODID_CLEAN_ALL_INTENTS:
          serviceImpl.cleanAllIntents((ondewo.nlu.Utility.CleanAllIntentsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Utility.CleanAllIntentsResponse>) responseObserver);
          break;
        case METHODID_CLEAN_INTENT:
          serviceImpl.cleanIntent((ondewo.nlu.Utility.CleanIntentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Utility.CleanIntentResponse>) responseObserver);
          break;
        case METHODID_CLEAN_ALL_ENTITY_TYPES:
          serviceImpl.cleanAllEntityTypes((ondewo.nlu.Utility.CleanAllEntityTypesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Utility.CleanAllEntityTypesResponse>) responseObserver);
          break;
        case METHODID_CLEAN_ENTITY_TYPE:
          serviceImpl.cleanEntityType((ondewo.nlu.Utility.CleanEntityTypeRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Utility.CleanEntityTypeResponse>) responseObserver);
          break;
        case METHODID_ADD_TRAINING_PHRASES:
          serviceImpl.addTrainingPhrases((ondewo.nlu.Utility.AddTrainingPhrasesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Utility.AddTrainingPhrasesResponse>) responseObserver);
          break;
        case METHODID_ADD_TRAINING_PHRASES_FROM_CSV:
          serviceImpl.addTrainingPhrasesFromCSV((ondewo.nlu.Utility.AddTrainingPhrasesFromCSVRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Utility.AddTrainingPhrasesResponse>) responseObserver);
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
          getValidateRegexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Utility.ValidateRegexRequest,
              ondewo.nlu.Utility.ValidateRegexResponse>(
                service, METHODID_VALIDATE_REGEX)))
        .addMethod(
          getValidateEmbeddedRegexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Utility.ValidateEmbeddedRegexRequest,
              ondewo.nlu.Utility.ValidateEmbeddedRegexResponse>(
                service, METHODID_VALIDATE_EMBEDDED_REGEX)))
        .addMethod(
          getCleanAllIntentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Utility.CleanAllIntentsRequest,
              ondewo.nlu.Utility.CleanAllIntentsResponse>(
                service, METHODID_CLEAN_ALL_INTENTS)))
        .addMethod(
          getCleanIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Utility.CleanIntentRequest,
              ondewo.nlu.Utility.CleanIntentResponse>(
                service, METHODID_CLEAN_INTENT)))
        .addMethod(
          getCleanAllEntityTypesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Utility.CleanAllEntityTypesRequest,
              ondewo.nlu.Utility.CleanAllEntityTypesResponse>(
                service, METHODID_CLEAN_ALL_ENTITY_TYPES)))
        .addMethod(
          getCleanEntityTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Utility.CleanEntityTypeRequest,
              ondewo.nlu.Utility.CleanEntityTypeResponse>(
                service, METHODID_CLEAN_ENTITY_TYPE)))
        .addMethod(
          getAddTrainingPhrasesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Utility.AddTrainingPhrasesRequest,
              ondewo.nlu.Utility.AddTrainingPhrasesResponse>(
                service, METHODID_ADD_TRAINING_PHRASES)))
        .addMethod(
          getAddTrainingPhrasesFromCSVMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Utility.AddTrainingPhrasesFromCSVRequest,
              ondewo.nlu.Utility.AddTrainingPhrasesResponse>(
                service, METHODID_ADD_TRAINING_PHRASES_FROM_CSV)))
        .build();
  }

  private static abstract class UtilitiesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UtilitiesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ondewo.nlu.Utility.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Utilities");
    }
  }

  private static final class UtilitiesFileDescriptorSupplier
      extends UtilitiesBaseDescriptorSupplier {
    UtilitiesFileDescriptorSupplier() {}
  }

  private static final class UtilitiesMethodDescriptorSupplier
      extends UtilitiesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UtilitiesMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UtilitiesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UtilitiesFileDescriptorSupplier())
              .addMethod(getValidateRegexMethod())
              .addMethod(getValidateEmbeddedRegexMethod())
              .addMethod(getCleanAllIntentsMethod())
              .addMethod(getCleanIntentMethod())
              .addMethod(getCleanAllEntityTypesMethod())
              .addMethod(getCleanEntityTypeMethod())
              .addMethod(getAddTrainingPhrasesMethod())
              .addMethod(getAddTrainingPhrasesFromCSVMethod())
              .build();
        }
      }
    }
    return result;
  }
}
