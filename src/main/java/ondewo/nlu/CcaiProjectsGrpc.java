package ondewo.nlu;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage Call Center AI (CCAI service) Projects.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class CcaiProjectsGrpc {

  private CcaiProjectsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.nlu.CcaiProjects";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.CcaiProjectOuterClass.GetCcaiProjectRequest,
      ondewo.nlu.CcaiProjectOuterClass.CcaiProject> getGetCcaiProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCcaiProject",
      requestType = ondewo.nlu.CcaiProjectOuterClass.GetCcaiProjectRequest.class,
      responseType = ondewo.nlu.CcaiProjectOuterClass.CcaiProject.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.CcaiProjectOuterClass.GetCcaiProjectRequest,
      ondewo.nlu.CcaiProjectOuterClass.CcaiProject> getGetCcaiProjectMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.CcaiProjectOuterClass.GetCcaiProjectRequest, ondewo.nlu.CcaiProjectOuterClass.CcaiProject> getGetCcaiProjectMethod;
    if ((getGetCcaiProjectMethod = CcaiProjectsGrpc.getGetCcaiProjectMethod) == null) {
      synchronized (CcaiProjectsGrpc.class) {
        if ((getGetCcaiProjectMethod = CcaiProjectsGrpc.getGetCcaiProjectMethod) == null) {
          CcaiProjectsGrpc.getGetCcaiProjectMethod = getGetCcaiProjectMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.CcaiProjectOuterClass.GetCcaiProjectRequest, ondewo.nlu.CcaiProjectOuterClass.CcaiProject>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCcaiProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.CcaiProjectOuterClass.GetCcaiProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.CcaiProjectOuterClass.CcaiProject.getDefaultInstance()))
              .setSchemaDescriptor(new CcaiProjectsMethodDescriptorSupplier("GetCcaiProject"))
              .build();
        }
      }
    }
    return getGetCcaiProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectRequest,
      ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectResponse> getCreateCcaiProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCcaiProject",
      requestType = ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectRequest.class,
      responseType = ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectRequest,
      ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectResponse> getCreateCcaiProjectMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectRequest, ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectResponse> getCreateCcaiProjectMethod;
    if ((getCreateCcaiProjectMethod = CcaiProjectsGrpc.getCreateCcaiProjectMethod) == null) {
      synchronized (CcaiProjectsGrpc.class) {
        if ((getCreateCcaiProjectMethod = CcaiProjectsGrpc.getCreateCcaiProjectMethod) == null) {
          CcaiProjectsGrpc.getCreateCcaiProjectMethod = getCreateCcaiProjectMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectRequest, ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCcaiProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CcaiProjectsMethodDescriptorSupplier("CreateCcaiProject"))
              .build();
        }
      }
    }
    return getCreateCcaiProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectRequest,
      ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectResponse> getDeleteCcaiProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCcaiProject",
      requestType = ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectRequest.class,
      responseType = ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectRequest,
      ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectResponse> getDeleteCcaiProjectMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectRequest, ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectResponse> getDeleteCcaiProjectMethod;
    if ((getDeleteCcaiProjectMethod = CcaiProjectsGrpc.getDeleteCcaiProjectMethod) == null) {
      synchronized (CcaiProjectsGrpc.class) {
        if ((getDeleteCcaiProjectMethod = CcaiProjectsGrpc.getDeleteCcaiProjectMethod) == null) {
          CcaiProjectsGrpc.getDeleteCcaiProjectMethod = getDeleteCcaiProjectMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectRequest, ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCcaiProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CcaiProjectsMethodDescriptorSupplier("DeleteCcaiProject"))
              .build();
        }
      }
    }
    return getDeleteCcaiProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsRequest,
      ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsResponse> getListCcaiProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCcaiProjects",
      requestType = ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsRequest.class,
      responseType = ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsRequest,
      ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsResponse> getListCcaiProjectsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsRequest, ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsResponse> getListCcaiProjectsMethod;
    if ((getListCcaiProjectsMethod = CcaiProjectsGrpc.getListCcaiProjectsMethod) == null) {
      synchronized (CcaiProjectsGrpc.class) {
        if ((getListCcaiProjectsMethod = CcaiProjectsGrpc.getListCcaiProjectsMethod) == null) {
          CcaiProjectsGrpc.getListCcaiProjectsMethod = getListCcaiProjectsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsRequest, ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCcaiProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CcaiProjectsMethodDescriptorSupplier("ListCcaiProjects"))
              .build();
        }
      }
    }
    return getListCcaiProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectRequest,
      ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectResponse> getUpdateCcaiProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCcaiProject",
      requestType = ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectRequest.class,
      responseType = ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectRequest,
      ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectResponse> getUpdateCcaiProjectMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectRequest, ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectResponse> getUpdateCcaiProjectMethod;
    if ((getUpdateCcaiProjectMethod = CcaiProjectsGrpc.getUpdateCcaiProjectMethod) == null) {
      synchronized (CcaiProjectsGrpc.class) {
        if ((getUpdateCcaiProjectMethod = CcaiProjectsGrpc.getUpdateCcaiProjectMethod) == null) {
          CcaiProjectsGrpc.getUpdateCcaiProjectMethod = getUpdateCcaiProjectMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectRequest, ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCcaiProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CcaiProjectsMethodDescriptorSupplier("UpdateCcaiProject"))
              .build();
        }
      }
    }
    return getUpdateCcaiProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.CcaiProjectOuterClass.GetCcaiServiceRequest,
      ondewo.nlu.CcaiProjectOuterClass.CcaiService> getGetCcaiServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCcaiService",
      requestType = ondewo.nlu.CcaiProjectOuterClass.GetCcaiServiceRequest.class,
      responseType = ondewo.nlu.CcaiProjectOuterClass.CcaiService.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.CcaiProjectOuterClass.GetCcaiServiceRequest,
      ondewo.nlu.CcaiProjectOuterClass.CcaiService> getGetCcaiServiceMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.CcaiProjectOuterClass.GetCcaiServiceRequest, ondewo.nlu.CcaiProjectOuterClass.CcaiService> getGetCcaiServiceMethod;
    if ((getGetCcaiServiceMethod = CcaiProjectsGrpc.getGetCcaiServiceMethod) == null) {
      synchronized (CcaiProjectsGrpc.class) {
        if ((getGetCcaiServiceMethod = CcaiProjectsGrpc.getGetCcaiServiceMethod) == null) {
          CcaiProjectsGrpc.getGetCcaiServiceMethod = getGetCcaiServiceMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.CcaiProjectOuterClass.GetCcaiServiceRequest, ondewo.nlu.CcaiProjectOuterClass.CcaiService>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCcaiService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.CcaiProjectOuterClass.GetCcaiServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.CcaiProjectOuterClass.CcaiService.getDefaultInstance()))
              .setSchemaDescriptor(new CcaiProjectsMethodDescriptorSupplier("GetCcaiService"))
              .build();
        }
      }
    }
    return getGetCcaiServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CcaiProjectsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CcaiProjectsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CcaiProjectsStub>() {
        @java.lang.Override
        public CcaiProjectsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CcaiProjectsStub(channel, callOptions);
        }
      };
    return CcaiProjectsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CcaiProjectsBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CcaiProjectsBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CcaiProjectsBlockingV2Stub>() {
        @java.lang.Override
        public CcaiProjectsBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CcaiProjectsBlockingV2Stub(channel, callOptions);
        }
      };
    return CcaiProjectsBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CcaiProjectsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CcaiProjectsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CcaiProjectsBlockingStub>() {
        @java.lang.Override
        public CcaiProjectsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CcaiProjectsBlockingStub(channel, callOptions);
        }
      };
    return CcaiProjectsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CcaiProjectsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CcaiProjectsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CcaiProjectsFutureStub>() {
        @java.lang.Override
        public CcaiProjectsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CcaiProjectsFutureStub(channel, callOptions);
        }
      };
    return CcaiProjectsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage Call Center AI (CCAI service) Projects.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Retrieves information about a specific CCAI service project.
     * </pre>
     */
    default void getCcaiProject(ondewo.nlu.CcaiProjectOuterClass.GetCcaiProjectRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.CcaiProjectOuterClass.CcaiProject> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCcaiProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new CCAI service project based on the provided request.
     * </pre>
     */
    default void createCcaiProject(ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCcaiProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a CCAI service project identified by the provided request.
     * </pre>
     */
    default void deleteCcaiProject(ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCcaiProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all CCAI service projects based on the provided request.
     * </pre>
     */
    default void listCcaiProjects(ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCcaiProjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the information of an existing CCAI service project.
     * </pre>
     */
    default void updateCcaiProject(ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCcaiProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves information about a specific CCAI service.
     * </pre>
     */
    default void getCcaiService(ondewo.nlu.CcaiProjectOuterClass.GetCcaiServiceRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.CcaiProjectOuterClass.CcaiService> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCcaiServiceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CcaiProjects.
   * <pre>
   * Service to manage Call Center AI (CCAI service) Projects.
   * </pre>
   */
  public static abstract class CcaiProjectsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CcaiProjectsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CcaiProjects.
   * <pre>
   * Service to manage Call Center AI (CCAI service) Projects.
   * </pre>
   */
  public static final class CcaiProjectsStub
      extends io.grpc.stub.AbstractAsyncStub<CcaiProjectsStub> {
    private CcaiProjectsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CcaiProjectsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CcaiProjectsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves information about a specific CCAI service project.
     * </pre>
     */
    public void getCcaiProject(ondewo.nlu.CcaiProjectOuterClass.GetCcaiProjectRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.CcaiProjectOuterClass.CcaiProject> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCcaiProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new CCAI service project based on the provided request.
     * </pre>
     */
    public void createCcaiProject(ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCcaiProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a CCAI service project identified by the provided request.
     * </pre>
     */
    public void deleteCcaiProject(ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCcaiProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all CCAI service projects based on the provided request.
     * </pre>
     */
    public void listCcaiProjects(ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCcaiProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the information of an existing CCAI service project.
     * </pre>
     */
    public void updateCcaiProject(ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCcaiProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves information about a specific CCAI service.
     * </pre>
     */
    public void getCcaiService(ondewo.nlu.CcaiProjectOuterClass.GetCcaiServiceRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.CcaiProjectOuterClass.CcaiService> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCcaiServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CcaiProjects.
   * <pre>
   * Service to manage Call Center AI (CCAI service) Projects.
   * </pre>
   */
  public static final class CcaiProjectsBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CcaiProjectsBlockingV2Stub> {
    private CcaiProjectsBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CcaiProjectsBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CcaiProjectsBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves information about a specific CCAI service project.
     * </pre>
     */
    public ondewo.nlu.CcaiProjectOuterClass.CcaiProject getCcaiProject(ondewo.nlu.CcaiProjectOuterClass.GetCcaiProjectRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetCcaiProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new CCAI service project based on the provided request.
     * </pre>
     */
    public ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectResponse createCcaiProject(ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateCcaiProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a CCAI service project identified by the provided request.
     * </pre>
     */
    public ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectResponse deleteCcaiProject(ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteCcaiProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all CCAI service projects based on the provided request.
     * </pre>
     */
    public ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsResponse listCcaiProjects(ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListCcaiProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the information of an existing CCAI service project.
     * </pre>
     */
    public ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectResponse updateCcaiProject(ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateCcaiProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves information about a specific CCAI service.
     * </pre>
     */
    public ondewo.nlu.CcaiProjectOuterClass.CcaiService getCcaiService(ondewo.nlu.CcaiProjectOuterClass.GetCcaiServiceRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetCcaiServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CcaiProjects.
   * <pre>
   * Service to manage Call Center AI (CCAI service) Projects.
   * </pre>
   */
  public static final class CcaiProjectsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CcaiProjectsBlockingStub> {
    private CcaiProjectsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CcaiProjectsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CcaiProjectsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves information about a specific CCAI service project.
     * </pre>
     */
    public ondewo.nlu.CcaiProjectOuterClass.CcaiProject getCcaiProject(ondewo.nlu.CcaiProjectOuterClass.GetCcaiProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCcaiProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new CCAI service project based on the provided request.
     * </pre>
     */
    public ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectResponse createCcaiProject(ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCcaiProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a CCAI service project identified by the provided request.
     * </pre>
     */
    public ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectResponse deleteCcaiProject(ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCcaiProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all CCAI service projects based on the provided request.
     * </pre>
     */
    public ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsResponse listCcaiProjects(ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCcaiProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the information of an existing CCAI service project.
     * </pre>
     */
    public ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectResponse updateCcaiProject(ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCcaiProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves information about a specific CCAI service.
     * </pre>
     */
    public ondewo.nlu.CcaiProjectOuterClass.CcaiService getCcaiService(ondewo.nlu.CcaiProjectOuterClass.GetCcaiServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCcaiServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CcaiProjects.
   * <pre>
   * Service to manage Call Center AI (CCAI service) Projects.
   * </pre>
   */
  public static final class CcaiProjectsFutureStub
      extends io.grpc.stub.AbstractFutureStub<CcaiProjectsFutureStub> {
    private CcaiProjectsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CcaiProjectsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CcaiProjectsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves information about a specific CCAI service project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.CcaiProjectOuterClass.CcaiProject> getCcaiProject(
        ondewo.nlu.CcaiProjectOuterClass.GetCcaiProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCcaiProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new CCAI service project based on the provided request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectResponse> createCcaiProject(
        ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCcaiProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a CCAI service project identified by the provided request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectResponse> deleteCcaiProject(
        ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCcaiProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all CCAI service projects based on the provided request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsResponse> listCcaiProjects(
        ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCcaiProjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the information of an existing CCAI service project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectResponse> updateCcaiProject(
        ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCcaiProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves information about a specific CCAI service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.CcaiProjectOuterClass.CcaiService> getCcaiService(
        ondewo.nlu.CcaiProjectOuterClass.GetCcaiServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCcaiServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CCAI_PROJECT = 0;
  private static final int METHODID_CREATE_CCAI_PROJECT = 1;
  private static final int METHODID_DELETE_CCAI_PROJECT = 2;
  private static final int METHODID_LIST_CCAI_PROJECTS = 3;
  private static final int METHODID_UPDATE_CCAI_PROJECT = 4;
  private static final int METHODID_GET_CCAI_SERVICE = 5;

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
        case METHODID_GET_CCAI_PROJECT:
          serviceImpl.getCcaiProject((ondewo.nlu.CcaiProjectOuterClass.GetCcaiProjectRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.CcaiProjectOuterClass.CcaiProject>) responseObserver);
          break;
        case METHODID_CREATE_CCAI_PROJECT:
          serviceImpl.createCcaiProject((ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectResponse>) responseObserver);
          break;
        case METHODID_DELETE_CCAI_PROJECT:
          serviceImpl.deleteCcaiProject((ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectResponse>) responseObserver);
          break;
        case METHODID_LIST_CCAI_PROJECTS:
          serviceImpl.listCcaiProjects((ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CCAI_PROJECT:
          serviceImpl.updateCcaiProject((ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectResponse>) responseObserver);
          break;
        case METHODID_GET_CCAI_SERVICE:
          serviceImpl.getCcaiService((ondewo.nlu.CcaiProjectOuterClass.GetCcaiServiceRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.CcaiProjectOuterClass.CcaiService>) responseObserver);
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
          getGetCcaiProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.CcaiProjectOuterClass.GetCcaiProjectRequest,
              ondewo.nlu.CcaiProjectOuterClass.CcaiProject>(
                service, METHODID_GET_CCAI_PROJECT)))
        .addMethod(
          getCreateCcaiProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectRequest,
              ondewo.nlu.CcaiProjectOuterClass.CreateCcaiProjectResponse>(
                service, METHODID_CREATE_CCAI_PROJECT)))
        .addMethod(
          getDeleteCcaiProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectRequest,
              ondewo.nlu.CcaiProjectOuterClass.DeleteCcaiProjectResponse>(
                service, METHODID_DELETE_CCAI_PROJECT)))
        .addMethod(
          getListCcaiProjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsRequest,
              ondewo.nlu.CcaiProjectOuterClass.ListCcaiProjectsResponse>(
                service, METHODID_LIST_CCAI_PROJECTS)))
        .addMethod(
          getUpdateCcaiProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectRequest,
              ondewo.nlu.CcaiProjectOuterClass.UpdateCcaiProjectResponse>(
                service, METHODID_UPDATE_CCAI_PROJECT)))
        .addMethod(
          getGetCcaiServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.CcaiProjectOuterClass.GetCcaiServiceRequest,
              ondewo.nlu.CcaiProjectOuterClass.CcaiService>(
                service, METHODID_GET_CCAI_SERVICE)))
        .build();
  }

  private static abstract class CcaiProjectsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CcaiProjectsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ondewo.nlu.CcaiProjectOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CcaiProjects");
    }
  }

  private static final class CcaiProjectsFileDescriptorSupplier
      extends CcaiProjectsBaseDescriptorSupplier {
    CcaiProjectsFileDescriptorSupplier() {}
  }

  private static final class CcaiProjectsMethodDescriptorSupplier
      extends CcaiProjectsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CcaiProjectsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CcaiProjectsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CcaiProjectsFileDescriptorSupplier())
              .addMethod(getGetCcaiProjectMethod())
              .addMethod(getCreateCcaiProjectMethod())
              .addMethod(getDeleteCcaiProjectMethod())
              .addMethod(getListCcaiProjectsMethod())
              .addMethod(getUpdateCcaiProjectMethod())
              .addMethod(getGetCcaiServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
