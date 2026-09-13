package ondewo.nlu;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Project roles
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ProjectRolesGrpc {

  private ProjectRolesGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.nlu.ProjectRoles";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.ProjectRoleOuterClass.CreateProjectRoleRequest,
      ondewo.nlu.ProjectRoleOuterClass.ProjectRole> getCreateProjectRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProjectRole",
      requestType = ondewo.nlu.ProjectRoleOuterClass.CreateProjectRoleRequest.class,
      responseType = ondewo.nlu.ProjectRoleOuterClass.ProjectRole.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.ProjectRoleOuterClass.CreateProjectRoleRequest,
      ondewo.nlu.ProjectRoleOuterClass.ProjectRole> getCreateProjectRoleMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.ProjectRoleOuterClass.CreateProjectRoleRequest, ondewo.nlu.ProjectRoleOuterClass.ProjectRole> getCreateProjectRoleMethod;
    if ((getCreateProjectRoleMethod = ProjectRolesGrpc.getCreateProjectRoleMethod) == null) {
      synchronized (ProjectRolesGrpc.class) {
        if ((getCreateProjectRoleMethod = ProjectRolesGrpc.getCreateProjectRoleMethod) == null) {
          ProjectRolesGrpc.getCreateProjectRoleMethod = getCreateProjectRoleMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.ProjectRoleOuterClass.CreateProjectRoleRequest, ondewo.nlu.ProjectRoleOuterClass.ProjectRole>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProjectRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.ProjectRoleOuterClass.CreateProjectRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.ProjectRoleOuterClass.ProjectRole.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectRolesMethodDescriptorSupplier("CreateProjectRole"))
              .build();
        }
      }
    }
    return getCreateProjectRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.ProjectRoleOuterClass.GetProjectRoleRequest,
      ondewo.nlu.ProjectRoleOuterClass.ProjectRole> getGetProjectRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProjectRole",
      requestType = ondewo.nlu.ProjectRoleOuterClass.GetProjectRoleRequest.class,
      responseType = ondewo.nlu.ProjectRoleOuterClass.ProjectRole.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.ProjectRoleOuterClass.GetProjectRoleRequest,
      ondewo.nlu.ProjectRoleOuterClass.ProjectRole> getGetProjectRoleMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.ProjectRoleOuterClass.GetProjectRoleRequest, ondewo.nlu.ProjectRoleOuterClass.ProjectRole> getGetProjectRoleMethod;
    if ((getGetProjectRoleMethod = ProjectRolesGrpc.getGetProjectRoleMethod) == null) {
      synchronized (ProjectRolesGrpc.class) {
        if ((getGetProjectRoleMethod = ProjectRolesGrpc.getGetProjectRoleMethod) == null) {
          ProjectRolesGrpc.getGetProjectRoleMethod = getGetProjectRoleMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.ProjectRoleOuterClass.GetProjectRoleRequest, ondewo.nlu.ProjectRoleOuterClass.ProjectRole>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProjectRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.ProjectRoleOuterClass.GetProjectRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.ProjectRoleOuterClass.ProjectRole.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectRolesMethodDescriptorSupplier("GetProjectRole"))
              .build();
        }
      }
    }
    return getGetProjectRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.ProjectRoleOuterClass.DeleteProjectRoleRequest,
      com.google.protobuf.Empty> getDeleteProjectRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProjectRole",
      requestType = ondewo.nlu.ProjectRoleOuterClass.DeleteProjectRoleRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.ProjectRoleOuterClass.DeleteProjectRoleRequest,
      com.google.protobuf.Empty> getDeleteProjectRoleMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.ProjectRoleOuterClass.DeleteProjectRoleRequest, com.google.protobuf.Empty> getDeleteProjectRoleMethod;
    if ((getDeleteProjectRoleMethod = ProjectRolesGrpc.getDeleteProjectRoleMethod) == null) {
      synchronized (ProjectRolesGrpc.class) {
        if ((getDeleteProjectRoleMethod = ProjectRolesGrpc.getDeleteProjectRoleMethod) == null) {
          ProjectRolesGrpc.getDeleteProjectRoleMethod = getDeleteProjectRoleMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.ProjectRoleOuterClass.DeleteProjectRoleRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProjectRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.ProjectRoleOuterClass.DeleteProjectRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectRolesMethodDescriptorSupplier("DeleteProjectRole"))
              .build();
        }
      }
    }
    return getDeleteProjectRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.ProjectRoleOuterClass.UpdateProjectRoleRequest,
      ondewo.nlu.ProjectRoleOuterClass.ProjectRole> getUpdateProjectRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProjectRole",
      requestType = ondewo.nlu.ProjectRoleOuterClass.UpdateProjectRoleRequest.class,
      responseType = ondewo.nlu.ProjectRoleOuterClass.ProjectRole.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.ProjectRoleOuterClass.UpdateProjectRoleRequest,
      ondewo.nlu.ProjectRoleOuterClass.ProjectRole> getUpdateProjectRoleMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.ProjectRoleOuterClass.UpdateProjectRoleRequest, ondewo.nlu.ProjectRoleOuterClass.ProjectRole> getUpdateProjectRoleMethod;
    if ((getUpdateProjectRoleMethod = ProjectRolesGrpc.getUpdateProjectRoleMethod) == null) {
      synchronized (ProjectRolesGrpc.class) {
        if ((getUpdateProjectRoleMethod = ProjectRolesGrpc.getUpdateProjectRoleMethod) == null) {
          ProjectRolesGrpc.getUpdateProjectRoleMethod = getUpdateProjectRoleMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.ProjectRoleOuterClass.UpdateProjectRoleRequest, ondewo.nlu.ProjectRoleOuterClass.ProjectRole>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProjectRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.ProjectRoleOuterClass.UpdateProjectRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.ProjectRoleOuterClass.ProjectRole.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectRolesMethodDescriptorSupplier("UpdateProjectRole"))
              .build();
        }
      }
    }
    return getUpdateProjectRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesRequest,
      ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesResponse> getListProjectRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProjectRoles",
      requestType = ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesRequest.class,
      responseType = ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesRequest,
      ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesResponse> getListProjectRolesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesRequest, ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesResponse> getListProjectRolesMethod;
    if ((getListProjectRolesMethod = ProjectRolesGrpc.getListProjectRolesMethod) == null) {
      synchronized (ProjectRolesGrpc.class) {
        if ((getListProjectRolesMethod = ProjectRolesGrpc.getListProjectRolesMethod) == null) {
          ProjectRolesGrpc.getListProjectRolesMethod = getListProjectRolesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesRequest, ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProjectRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectRolesMethodDescriptorSupplier("ListProjectRoles"))
              .build();
        }
      }
    }
    return getListProjectRolesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectRolesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectRolesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectRolesStub>() {
        @java.lang.Override
        public ProjectRolesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectRolesStub(channel, callOptions);
        }
      };
    return ProjectRolesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ProjectRolesBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectRolesBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectRolesBlockingV2Stub>() {
        @java.lang.Override
        public ProjectRolesBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectRolesBlockingV2Stub(channel, callOptions);
        }
      };
    return ProjectRolesBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectRolesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectRolesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectRolesBlockingStub>() {
        @java.lang.Override
        public ProjectRolesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectRolesBlockingStub(channel, callOptions);
        }
      };
    return ProjectRolesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectRolesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectRolesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectRolesFutureStub>() {
        @java.lang.Override
        public ProjectRolesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectRolesFutureStub(channel, callOptions);
        }
      };
    return ProjectRolesFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Project roles
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates a project role by creating the knowledge base master
     * </pre>
     */
    default void createProjectRole(ondewo.nlu.ProjectRoleOuterClass.CreateProjectRoleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.ProjectRoleOuterClass.ProjectRole> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProjectRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a project role by getting the knowledge base master
     * </pre>
     */
    default void getProjectRole(ondewo.nlu.ProjectRoleOuterClass.GetProjectRoleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.ProjectRoleOuterClass.ProjectRole> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes project role
     * </pre>
     */
    default void deleteProjectRole(ondewo.nlu.ProjectRoleOuterClass.DeleteProjectRoleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProjectRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates project role
     * </pre>
     */
    default void updateProjectRole(ondewo.nlu.ProjectRoleOuterClass.UpdateProjectRoleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.ProjectRoleOuterClass.ProjectRole> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProjectRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * List project roles
     * </pre>
     */
    default void listProjectRoles(ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProjectRolesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProjectRoles.
   * <pre>
   * Project roles
   * </pre>
   */
  public static abstract class ProjectRolesImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProjectRolesGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProjectRoles.
   * <pre>
   * Project roles
   * </pre>
   */
  public static final class ProjectRolesStub
      extends io.grpc.stub.AbstractAsyncStub<ProjectRolesStub> {
    private ProjectRolesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectRolesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectRolesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a project role by creating the knowledge base master
     * </pre>
     */
    public void createProjectRole(ondewo.nlu.ProjectRoleOuterClass.CreateProjectRoleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.ProjectRoleOuterClass.ProjectRole> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProjectRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a project role by getting the knowledge base master
     * </pre>
     */
    public void getProjectRole(ondewo.nlu.ProjectRoleOuterClass.GetProjectRoleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.ProjectRoleOuterClass.ProjectRole> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProjectRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes project role
     * </pre>
     */
    public void deleteProjectRole(ondewo.nlu.ProjectRoleOuterClass.DeleteProjectRoleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProjectRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates project role
     * </pre>
     */
    public void updateProjectRole(ondewo.nlu.ProjectRoleOuterClass.UpdateProjectRoleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.ProjectRoleOuterClass.ProjectRole> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProjectRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List project roles
     * </pre>
     */
    public void listProjectRoles(ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProjectRolesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProjectRoles.
   * <pre>
   * Project roles
   * </pre>
   */
  public static final class ProjectRolesBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ProjectRolesBlockingV2Stub> {
    private ProjectRolesBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectRolesBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectRolesBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a project role by creating the knowledge base master
     * </pre>
     */
    public ondewo.nlu.ProjectRoleOuterClass.ProjectRole createProjectRole(ondewo.nlu.ProjectRoleOuterClass.CreateProjectRoleRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateProjectRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a project role by getting the knowledge base master
     * </pre>
     */
    public ondewo.nlu.ProjectRoleOuterClass.ProjectRole getProjectRole(ondewo.nlu.ProjectRoleOuterClass.GetProjectRoleRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetProjectRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes project role
     * </pre>
     */
    public com.google.protobuf.Empty deleteProjectRole(ondewo.nlu.ProjectRoleOuterClass.DeleteProjectRoleRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteProjectRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates project role
     * </pre>
     */
    public ondewo.nlu.ProjectRoleOuterClass.ProjectRole updateProjectRole(ondewo.nlu.ProjectRoleOuterClass.UpdateProjectRoleRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateProjectRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List project roles
     * </pre>
     */
    public ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesResponse listProjectRoles(ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListProjectRolesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ProjectRoles.
   * <pre>
   * Project roles
   * </pre>
   */
  public static final class ProjectRolesBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProjectRolesBlockingStub> {
    private ProjectRolesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectRolesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectRolesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a project role by creating the knowledge base master
     * </pre>
     */
    public ondewo.nlu.ProjectRoleOuterClass.ProjectRole createProjectRole(ondewo.nlu.ProjectRoleOuterClass.CreateProjectRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProjectRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a project role by getting the knowledge base master
     * </pre>
     */
    public ondewo.nlu.ProjectRoleOuterClass.ProjectRole getProjectRole(ondewo.nlu.ProjectRoleOuterClass.GetProjectRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProjectRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes project role
     * </pre>
     */
    public com.google.protobuf.Empty deleteProjectRole(ondewo.nlu.ProjectRoleOuterClass.DeleteProjectRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProjectRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates project role
     * </pre>
     */
    public ondewo.nlu.ProjectRoleOuterClass.ProjectRole updateProjectRole(ondewo.nlu.ProjectRoleOuterClass.UpdateProjectRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProjectRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List project roles
     * </pre>
     */
    public ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesResponse listProjectRoles(ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProjectRolesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProjectRoles.
   * <pre>
   * Project roles
   * </pre>
   */
  public static final class ProjectRolesFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProjectRolesFutureStub> {
    private ProjectRolesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectRolesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectRolesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a project role by creating the knowledge base master
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.ProjectRoleOuterClass.ProjectRole> createProjectRole(
        ondewo.nlu.ProjectRoleOuterClass.CreateProjectRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProjectRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a project role by getting the knowledge base master
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.ProjectRoleOuterClass.ProjectRole> getProjectRole(
        ondewo.nlu.ProjectRoleOuterClass.GetProjectRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProjectRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes project role
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteProjectRole(
        ondewo.nlu.ProjectRoleOuterClass.DeleteProjectRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProjectRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates project role
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.ProjectRoleOuterClass.ProjectRole> updateProjectRole(
        ondewo.nlu.ProjectRoleOuterClass.UpdateProjectRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProjectRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List project roles
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesResponse> listProjectRoles(
        ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProjectRolesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROJECT_ROLE = 0;
  private static final int METHODID_GET_PROJECT_ROLE = 1;
  private static final int METHODID_DELETE_PROJECT_ROLE = 2;
  private static final int METHODID_UPDATE_PROJECT_ROLE = 3;
  private static final int METHODID_LIST_PROJECT_ROLES = 4;

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
        case METHODID_CREATE_PROJECT_ROLE:
          serviceImpl.createProjectRole((ondewo.nlu.ProjectRoleOuterClass.CreateProjectRoleRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.ProjectRoleOuterClass.ProjectRole>) responseObserver);
          break;
        case METHODID_GET_PROJECT_ROLE:
          serviceImpl.getProjectRole((ondewo.nlu.ProjectRoleOuterClass.GetProjectRoleRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.ProjectRoleOuterClass.ProjectRole>) responseObserver);
          break;
        case METHODID_DELETE_PROJECT_ROLE:
          serviceImpl.deleteProjectRole((ondewo.nlu.ProjectRoleOuterClass.DeleteProjectRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_PROJECT_ROLE:
          serviceImpl.updateProjectRole((ondewo.nlu.ProjectRoleOuterClass.UpdateProjectRoleRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.ProjectRoleOuterClass.ProjectRole>) responseObserver);
          break;
        case METHODID_LIST_PROJECT_ROLES:
          serviceImpl.listProjectRoles((ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesResponse>) responseObserver);
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
          getCreateProjectRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.ProjectRoleOuterClass.CreateProjectRoleRequest,
              ondewo.nlu.ProjectRoleOuterClass.ProjectRole>(
                service, METHODID_CREATE_PROJECT_ROLE)))
        .addMethod(
          getGetProjectRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.ProjectRoleOuterClass.GetProjectRoleRequest,
              ondewo.nlu.ProjectRoleOuterClass.ProjectRole>(
                service, METHODID_GET_PROJECT_ROLE)))
        .addMethod(
          getDeleteProjectRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.ProjectRoleOuterClass.DeleteProjectRoleRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_PROJECT_ROLE)))
        .addMethod(
          getUpdateProjectRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.ProjectRoleOuterClass.UpdateProjectRoleRequest,
              ondewo.nlu.ProjectRoleOuterClass.ProjectRole>(
                service, METHODID_UPDATE_PROJECT_ROLE)))
        .addMethod(
          getListProjectRolesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesRequest,
              ondewo.nlu.ProjectRoleOuterClass.ListProjectRolesResponse>(
                service, METHODID_LIST_PROJECT_ROLES)))
        .build();
  }

  private static abstract class ProjectRolesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectRolesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ondewo.nlu.ProjectRoleOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProjectRoles");
    }
  }

  private static final class ProjectRolesFileDescriptorSupplier
      extends ProjectRolesBaseDescriptorSupplier {
    ProjectRolesFileDescriptorSupplier() {}
  }

  private static final class ProjectRolesMethodDescriptorSupplier
      extends ProjectRolesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProjectRolesMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProjectRolesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectRolesFileDescriptorSupplier())
              .addMethod(getCreateProjectRoleMethod())
              .addMethod(getGetProjectRoleMethod())
              .addMethod(getDeleteProjectRoleMethod())
              .addMethod(getUpdateProjectRoleMethod())
              .addMethod(getListProjectRolesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
