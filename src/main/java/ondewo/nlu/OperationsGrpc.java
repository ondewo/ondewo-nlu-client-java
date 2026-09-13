package ondewo.nlu;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Manages long-running operations with an API service.
 * When an API method normally takes long time to complete, it can be designed to return &lt;a href="index.html#ondewo.nlu.Operation"&gt;Operation&lt;/a&gt; to the client, and the client can use this interface to receive the real response asynchronously by polling the operation resource, or pass the operation resource to another API (such as Google Cloud Pub/Sub API) to receive the response.  Any API service that returns long-running operations should implement the &lt;code&gt;Operations&lt;/code&gt; interface so developers can have a consistent client experience.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class OperationsGrpc {

  private OperationsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.nlu.Operations";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.ListOperationsRequest,
      ondewo.nlu.OperationsOuterClass.ListOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = ondewo.nlu.OperationsOuterClass.ListOperationsRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.ListOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.ListOperationsRequest,
      ondewo.nlu.OperationsOuterClass.ListOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.ListOperationsRequest, ondewo.nlu.OperationsOuterClass.ListOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = OperationsGrpc.getListOperationsMethod) == null) {
      synchronized (OperationsGrpc.class) {
        if ((getListOperationsMethod = OperationsGrpc.getListOperationsMethod) == null) {
          OperationsGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.OperationsOuterClass.ListOperationsRequest, ondewo.nlu.OperationsOuterClass.ListOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.ListOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.ListOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OperationsMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.GetOperationRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getGetOperationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOperation",
      requestType = ondewo.nlu.OperationsOuterClass.GetOperationRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.GetOperationRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getGetOperationMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.GetOperationRequest, ondewo.nlu.OperationsOuterClass.Operation> getGetOperationMethod;
    if ((getGetOperationMethod = OperationsGrpc.getGetOperationMethod) == null) {
      synchronized (OperationsGrpc.class) {
        if ((getGetOperationMethod = OperationsGrpc.getGetOperationMethod) == null) {
          OperationsGrpc.getGetOperationMethod = getGetOperationMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.OperationsOuterClass.GetOperationRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOperation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.GetOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new OperationsMethodDescriptorSupplier("GetOperation"))
              .build();
        }
      }
    }
    return getGetOperationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.DeleteOperationRequest,
      com.google.protobuf.Empty> getDeleteOperationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOperation",
      requestType = ondewo.nlu.OperationsOuterClass.DeleteOperationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.DeleteOperationRequest,
      com.google.protobuf.Empty> getDeleteOperationMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.DeleteOperationRequest, com.google.protobuf.Empty> getDeleteOperationMethod;
    if ((getDeleteOperationMethod = OperationsGrpc.getDeleteOperationMethod) == null) {
      synchronized (OperationsGrpc.class) {
        if ((getDeleteOperationMethod = OperationsGrpc.getDeleteOperationMethod) == null) {
          OperationsGrpc.getDeleteOperationMethod = getDeleteOperationMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.OperationsOuterClass.DeleteOperationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOperation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.DeleteOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OperationsMethodDescriptorSupplier("DeleteOperation"))
              .build();
        }
      }
    }
    return getDeleteOperationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.CancelOperationRequest,
      com.google.protobuf.Empty> getCancelOperationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelOperation",
      requestType = ondewo.nlu.OperationsOuterClass.CancelOperationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.CancelOperationRequest,
      com.google.protobuf.Empty> getCancelOperationMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.CancelOperationRequest, com.google.protobuf.Empty> getCancelOperationMethod;
    if ((getCancelOperationMethod = OperationsGrpc.getCancelOperationMethod) == null) {
      synchronized (OperationsGrpc.class) {
        if ((getCancelOperationMethod = OperationsGrpc.getCancelOperationMethod) == null) {
          OperationsGrpc.getCancelOperationMethod = getCancelOperationMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.OperationsOuterClass.CancelOperationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelOperation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.CancelOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OperationsMethodDescriptorSupplier("CancelOperation"))
              .build();
        }
      }
    }
    return getCancelOperationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.StreamRemoteOperationContainerLogsRequest,
      ondewo.nlu.OperationsOuterClass.RemoteOperationContainerLogLine> getStreamRemoteOperationContainerLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamRemoteOperationContainerLogs",
      requestType = ondewo.nlu.OperationsOuterClass.StreamRemoteOperationContainerLogsRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.RemoteOperationContainerLogLine.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.StreamRemoteOperationContainerLogsRequest,
      ondewo.nlu.OperationsOuterClass.RemoteOperationContainerLogLine> getStreamRemoteOperationContainerLogsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.StreamRemoteOperationContainerLogsRequest, ondewo.nlu.OperationsOuterClass.RemoteOperationContainerLogLine> getStreamRemoteOperationContainerLogsMethod;
    if ((getStreamRemoteOperationContainerLogsMethod = OperationsGrpc.getStreamRemoteOperationContainerLogsMethod) == null) {
      synchronized (OperationsGrpc.class) {
        if ((getStreamRemoteOperationContainerLogsMethod = OperationsGrpc.getStreamRemoteOperationContainerLogsMethod) == null) {
          OperationsGrpc.getStreamRemoteOperationContainerLogsMethod = getStreamRemoteOperationContainerLogsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.OperationsOuterClass.StreamRemoteOperationContainerLogsRequest, ondewo.nlu.OperationsOuterClass.RemoteOperationContainerLogLine>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamRemoteOperationContainerLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.StreamRemoteOperationContainerLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.RemoteOperationContainerLogLine.getDefaultInstance()))
              .setSchemaDescriptor(new OperationsMethodDescriptorSupplier("StreamRemoteOperationContainerLogs"))
              .build();
        }
      }
    }
    return getStreamRemoteOperationContainerLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsRequest,
      ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsResponse> getGetRemoteOperationContainerLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRemoteOperationContainerLogs",
      requestType = ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsRequest,
      ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsResponse> getGetRemoteOperationContainerLogsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsRequest, ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsResponse> getGetRemoteOperationContainerLogsMethod;
    if ((getGetRemoteOperationContainerLogsMethod = OperationsGrpc.getGetRemoteOperationContainerLogsMethod) == null) {
      synchronized (OperationsGrpc.class) {
        if ((getGetRemoteOperationContainerLogsMethod = OperationsGrpc.getGetRemoteOperationContainerLogsMethod) == null) {
          OperationsGrpc.getGetRemoteOperationContainerLogsMethod = getGetRemoteOperationContainerLogsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsRequest, ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRemoteOperationContainerLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OperationsMethodDescriptorSupplier("GetRemoteOperationContainerLogs"))
              .build();
        }
      }
    }
    return getGetRemoteOperationContainerLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerStatusRequest,
      ondewo.nlu.OperationsOuterClass.RemoteOperationContainerStatus> getGetRemoteOperationContainerStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRemoteOperationContainerStatus",
      requestType = ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerStatusRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.RemoteOperationContainerStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerStatusRequest,
      ondewo.nlu.OperationsOuterClass.RemoteOperationContainerStatus> getGetRemoteOperationContainerStatusMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerStatusRequest, ondewo.nlu.OperationsOuterClass.RemoteOperationContainerStatus> getGetRemoteOperationContainerStatusMethod;
    if ((getGetRemoteOperationContainerStatusMethod = OperationsGrpc.getGetRemoteOperationContainerStatusMethod) == null) {
      synchronized (OperationsGrpc.class) {
        if ((getGetRemoteOperationContainerStatusMethod = OperationsGrpc.getGetRemoteOperationContainerStatusMethod) == null) {
          OperationsGrpc.getGetRemoteOperationContainerStatusMethod = getGetRemoteOperationContainerStatusMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerStatusRequest, ondewo.nlu.OperationsOuterClass.RemoteOperationContainerStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRemoteOperationContainerStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.RemoteOperationContainerStatus.getDefaultInstance()))
              .setSchemaDescriptor(new OperationsMethodDescriptorSupplier("GetRemoteOperationContainerStatus"))
              .build();
        }
      }
    }
    return getGetRemoteOperationContainerStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersRequest,
      ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersResponse> getListRemoteOperationContainersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRemoteOperationContainers",
      requestType = ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersRequest,
      ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersResponse> getListRemoteOperationContainersMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersRequest, ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersResponse> getListRemoteOperationContainersMethod;
    if ((getListRemoteOperationContainersMethod = OperationsGrpc.getListRemoteOperationContainersMethod) == null) {
      synchronized (OperationsGrpc.class) {
        if ((getListRemoteOperationContainersMethod = OperationsGrpc.getListRemoteOperationContainersMethod) == null) {
          OperationsGrpc.getListRemoteOperationContainersMethod = getListRemoteOperationContainersMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersRequest, ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRemoteOperationContainers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OperationsMethodDescriptorSupplier("ListRemoteOperationContainers"))
              .build();
        }
      }
    }
    return getListRemoteOperationContainersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OperationsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperationsStub>() {
        @java.lang.Override
        public OperationsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperationsStub(channel, callOptions);
        }
      };
    return OperationsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static OperationsBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationsBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperationsBlockingV2Stub>() {
        @java.lang.Override
        public OperationsBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperationsBlockingV2Stub(channel, callOptions);
        }
      };
    return OperationsBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OperationsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperationsBlockingStub>() {
        @java.lang.Override
        public OperationsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperationsBlockingStub(channel, callOptions);
        }
      };
    return OperationsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OperationsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperationsFutureStub>() {
        @java.lang.Override
        public OperationsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperationsFutureStub(channel, callOptions);
        }
      };
    return OperationsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Manages long-running operations with an API service.
   * When an API method normally takes long time to complete, it can be designed to return &lt;a href="index.html#ondewo.nlu.Operation"&gt;Operation&lt;/a&gt; to the client, and the client can use this interface to receive the real response asynchronously by polling the operation resource, or pass the operation resource to another API (such as Google Cloud Pub/Sub API) to receive the response.  Any API service that returns long-running operations should implement the &lt;code&gt;Operations&lt;/code&gt; interface so developers can have a consistent client experience.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Lists operations that match the specified filter in the request. If the
     * server doesn&amp;apos;t support this method, it returns &lt;code&gt;UNIMPLEMENTED&lt;/code&gt;.
     *&lt;br&gt;
     * NOTE: the &lt;code&gt;name&lt;/code&gt; binding below allows API services to override the binding
     * to use different resource name schemes, such as &lt;code&gt;users/&#42;&#47;operations&lt;/code&gt;.
     * </pre>
     */
    default void listOperations(ondewo.nlu.OperationsOuterClass.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.ListOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the latest state of a long-running operation.  Clients can use this
     * method to poll the operation result at intervals as recommended by the API
     * service.
     * </pre>
     */
    default void getOperation(ondewo.nlu.OperationsOuterClass.GetOperationRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOperationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a long-running operation. This method indicates that the client is
     * no longer interested in the operation result. It does not cancel the
     * operation. If the server doesn&amp;apos;t support this method, it returns
     * &lt;code&gt;google.rpc.Code.UNIMPLEMENTED&lt;/code&gt;
     * </pre>
     */
    default void deleteOperation(ondewo.nlu.OperationsOuterClass.DeleteOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOperationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts asynchronous cancellation on a long-running operation.  The server
     * makes a best effort to cancel the operation, but success is not
     * guaranteed.  If the server doesn&amp;apos;t support this method, it returns
     * &lt;code&gt;google.rpc.Code.UNIMPLEMENTED&lt;/code&gt;.  Clients can use
     * &lt;a href="index.html#ondewo.nlu.Operations.GetOperation"&gt;Operations.GetOperation&lt;/a&gt; or
     * other methods to verify whether the cancellation succeeded or whether the
     * operation completed despite cancellation. On successful cancellation,
     * the operation is not deleted; instead, it becomes an operation with
     * an &lt;a href="index.html#ondewo.nlu.Operation"&gt;Operation.error&lt;/a&gt; value with a &lt;a href="https://developers.google.com/actions-center/reference/grpc-api/status_codes"&gt;google.rpc.Status.code&lt;/a&gt;
     * of 1, corresponding to &lt;code&gt;Code.CANCELLED&lt;/code&gt;.
     * </pre>
     */
    default void cancelOperation(ondewo.nlu.OperationsOuterClass.CancelOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelOperationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Streams the live container logs of a remote-operation container (LLM evaluation, simulation,
     * crawl, training) as they are produced, in the manner of &lt;code&gt;docker logs --follow&lt;/code&gt;.
     * The stream stays open until the container exits or the client disconnects. Each message is a
     * single parsed log line. Secrets in the log text are redacted server-side before streaming.
     * </pre>
     */
    default void streamRemoteOperationContainerLogs(ondewo.nlu.OperationsOuterClass.StreamRemoteOperationContainerLogsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.RemoteOperationContainerLogLine> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamRemoteOperationContainerLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a bounded, filtered snapshot of a remote-operation container&amp;apos;s logs. Supports a
     * time window (&lt;code&gt;start_time&lt;/code&gt; / &lt;code&gt;end_time&lt;/code&gt;), a minimum loguru log level,
     * a regular-expression match on the message, and a cap on the number of returned lines. Secrets
     * in the log text are redacted server-side before the response is returned.
     * </pre>
     */
    default void getRemoteOperationContainerLogs(ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRemoteOperationContainerLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the health and lifecycle status of a remote-operation container: whether it still
     * exists, whether it is running/exited, its exit code, OOM-kill flag and Docker health status.
     * </pre>
     */
    default void getRemoteOperationContainerStatus(ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerStatusRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.RemoteOperationContainerStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRemoteOperationContainerStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists every docker container that a remote operation started (a single operation may run several
     * containers sequentially, e.g. hardware-check, GPU pre-allocation, build-cache and one training
     * container per algorithm). When &lt;code&gt;include_sub_operations&lt;/code&gt; is set, the containers of the
     * operation&amp;apos;s sub-operations are included as well. Each entry carries the container id + name,
     * its host, lifecycle state and whether logs are still available (live or persisted).
     * </pre>
     */
    default void listRemoteOperationContainers(ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRemoteOperationContainersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Operations.
   * <pre>
   * Manages long-running operations with an API service.
   * When an API method normally takes long time to complete, it can be designed to return &lt;a href="index.html#ondewo.nlu.Operation"&gt;Operation&lt;/a&gt; to the client, and the client can use this interface to receive the real response asynchronously by polling the operation resource, or pass the operation resource to another API (such as Google Cloud Pub/Sub API) to receive the response.  Any API service that returns long-running operations should implement the &lt;code&gt;Operations&lt;/code&gt; interface so developers can have a consistent client experience.
   * </pre>
   */
  public static abstract class OperationsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OperationsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Operations.
   * <pre>
   * Manages long-running operations with an API service.
   * When an API method normally takes long time to complete, it can be designed to return &lt;a href="index.html#ondewo.nlu.Operation"&gt;Operation&lt;/a&gt; to the client, and the client can use this interface to receive the real response asynchronously by polling the operation resource, or pass the operation resource to another API (such as Google Cloud Pub/Sub API) to receive the response.  Any API service that returns long-running operations should implement the &lt;code&gt;Operations&lt;/code&gt; interface so developers can have a consistent client experience.
   * </pre>
   */
  public static final class OperationsStub
      extends io.grpc.stub.AbstractAsyncStub<OperationsStub> {
    private OperationsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists operations that match the specified filter in the request. If the
     * server doesn&amp;apos;t support this method, it returns &lt;code&gt;UNIMPLEMENTED&lt;/code&gt;.
     *&lt;br&gt;
     * NOTE: the &lt;code&gt;name&lt;/code&gt; binding below allows API services to override the binding
     * to use different resource name schemes, such as &lt;code&gt;users/&#42;&#47;operations&lt;/code&gt;.
     * </pre>
     */
    public void listOperations(ondewo.nlu.OperationsOuterClass.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.ListOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the latest state of a long-running operation.  Clients can use this
     * method to poll the operation result at intervals as recommended by the API
     * service.
     * </pre>
     */
    public void getOperation(ondewo.nlu.OperationsOuterClass.GetOperationRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOperationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a long-running operation. This method indicates that the client is
     * no longer interested in the operation result. It does not cancel the
     * operation. If the server doesn&amp;apos;t support this method, it returns
     * &lt;code&gt;google.rpc.Code.UNIMPLEMENTED&lt;/code&gt;
     * </pre>
     */
    public void deleteOperation(ondewo.nlu.OperationsOuterClass.DeleteOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOperationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts asynchronous cancellation on a long-running operation.  The server
     * makes a best effort to cancel the operation, but success is not
     * guaranteed.  If the server doesn&amp;apos;t support this method, it returns
     * &lt;code&gt;google.rpc.Code.UNIMPLEMENTED&lt;/code&gt;.  Clients can use
     * &lt;a href="index.html#ondewo.nlu.Operations.GetOperation"&gt;Operations.GetOperation&lt;/a&gt; or
     * other methods to verify whether the cancellation succeeded or whether the
     * operation completed despite cancellation. On successful cancellation,
     * the operation is not deleted; instead, it becomes an operation with
     * an &lt;a href="index.html#ondewo.nlu.Operation"&gt;Operation.error&lt;/a&gt; value with a &lt;a href="https://developers.google.com/actions-center/reference/grpc-api/status_codes"&gt;google.rpc.Status.code&lt;/a&gt;
     * of 1, corresponding to &lt;code&gt;Code.CANCELLED&lt;/code&gt;.
     * </pre>
     */
    public void cancelOperation(ondewo.nlu.OperationsOuterClass.CancelOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelOperationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Streams the live container logs of a remote-operation container (LLM evaluation, simulation,
     * crawl, training) as they are produced, in the manner of &lt;code&gt;docker logs --follow&lt;/code&gt;.
     * The stream stays open until the container exits or the client disconnects. Each message is a
     * single parsed log line. Secrets in the log text are redacted server-side before streaming.
     * </pre>
     */
    public void streamRemoteOperationContainerLogs(ondewo.nlu.OperationsOuterClass.StreamRemoteOperationContainerLogsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.RemoteOperationContainerLogLine> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamRemoteOperationContainerLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a bounded, filtered snapshot of a remote-operation container&amp;apos;s logs. Supports a
     * time window (&lt;code&gt;start_time&lt;/code&gt; / &lt;code&gt;end_time&lt;/code&gt;), a minimum loguru log level,
     * a regular-expression match on the message, and a cap on the number of returned lines. Secrets
     * in the log text are redacted server-side before the response is returned.
     * </pre>
     */
    public void getRemoteOperationContainerLogs(ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRemoteOperationContainerLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the health and lifecycle status of a remote-operation container: whether it still
     * exists, whether it is running/exited, its exit code, OOM-kill flag and Docker health status.
     * </pre>
     */
    public void getRemoteOperationContainerStatus(ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerStatusRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.RemoteOperationContainerStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRemoteOperationContainerStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists every docker container that a remote operation started (a single operation may run several
     * containers sequentially, e.g. hardware-check, GPU pre-allocation, build-cache and one training
     * container per algorithm). When &lt;code&gt;include_sub_operations&lt;/code&gt; is set, the containers of the
     * operation&amp;apos;s sub-operations are included as well. Each entry carries the container id + name,
     * its host, lifecycle state and whether logs are still available (live or persisted).
     * </pre>
     */
    public void listRemoteOperationContainers(ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRemoteOperationContainersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Operations.
   * <pre>
   * Manages long-running operations with an API service.
   * When an API method normally takes long time to complete, it can be designed to return &lt;a href="index.html#ondewo.nlu.Operation"&gt;Operation&lt;/a&gt; to the client, and the client can use this interface to receive the real response asynchronously by polling the operation resource, or pass the operation resource to another API (such as Google Cloud Pub/Sub API) to receive the response.  Any API service that returns long-running operations should implement the &lt;code&gt;Operations&lt;/code&gt; interface so developers can have a consistent client experience.
   * </pre>
   */
  public static final class OperationsBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<OperationsBlockingV2Stub> {
    private OperationsBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationsBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationsBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists operations that match the specified filter in the request. If the
     * server doesn&amp;apos;t support this method, it returns &lt;code&gt;UNIMPLEMENTED&lt;/code&gt;.
     *&lt;br&gt;
     * NOTE: the &lt;code&gt;name&lt;/code&gt; binding below allows API services to override the binding
     * to use different resource name schemes, such as &lt;code&gt;users/&#42;&#47;operations&lt;/code&gt;.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.ListOperationsResponse listOperations(ondewo.nlu.OperationsOuterClass.ListOperationsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the latest state of a long-running operation.  Clients can use this
     * method to poll the operation result at intervals as recommended by the API
     * service.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation getOperation(ondewo.nlu.OperationsOuterClass.GetOperationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetOperationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a long-running operation. This method indicates that the client is
     * no longer interested in the operation result. It does not cancel the
     * operation. If the server doesn&amp;apos;t support this method, it returns
     * &lt;code&gt;google.rpc.Code.UNIMPLEMENTED&lt;/code&gt;
     * </pre>
     */
    public com.google.protobuf.Empty deleteOperation(ondewo.nlu.OperationsOuterClass.DeleteOperationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteOperationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts asynchronous cancellation on a long-running operation.  The server
     * makes a best effort to cancel the operation, but success is not
     * guaranteed.  If the server doesn&amp;apos;t support this method, it returns
     * &lt;code&gt;google.rpc.Code.UNIMPLEMENTED&lt;/code&gt;.  Clients can use
     * &lt;a href="index.html#ondewo.nlu.Operations.GetOperation"&gt;Operations.GetOperation&lt;/a&gt; or
     * other methods to verify whether the cancellation succeeded or whether the
     * operation completed despite cancellation. On successful cancellation,
     * the operation is not deleted; instead, it becomes an operation with
     * an &lt;a href="index.html#ondewo.nlu.Operation"&gt;Operation.error&lt;/a&gt; value with a &lt;a href="https://developers.google.com/actions-center/reference/grpc-api/status_codes"&gt;google.rpc.Status.code&lt;/a&gt;
     * of 1, corresponding to &lt;code&gt;Code.CANCELLED&lt;/code&gt;.
     * </pre>
     */
    public com.google.protobuf.Empty cancelOperation(ondewo.nlu.OperationsOuterClass.CancelOperationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCancelOperationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Streams the live container logs of a remote-operation container (LLM evaluation, simulation,
     * crawl, training) as they are produced, in the manner of &lt;code&gt;docker logs --follow&lt;/code&gt;.
     * The stream stays open until the container exits or the client disconnects. Each message is a
     * single parsed log line. Secrets in the log text are redacted server-side before streaming.
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, ondewo.nlu.OperationsOuterClass.RemoteOperationContainerLogLine>
        streamRemoteOperationContainerLogs(ondewo.nlu.OperationsOuterClass.StreamRemoteOperationContainerLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getStreamRemoteOperationContainerLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a bounded, filtered snapshot of a remote-operation container&amp;apos;s logs. Supports a
     * time window (&lt;code&gt;start_time&lt;/code&gt; / &lt;code&gt;end_time&lt;/code&gt;), a minimum loguru log level,
     * a regular-expression match on the message, and a cap on the number of returned lines. Secrets
     * in the log text are redacted server-side before the response is returned.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsResponse getRemoteOperationContainerLogs(ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetRemoteOperationContainerLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the health and lifecycle status of a remote-operation container: whether it still
     * exists, whether it is running/exited, its exit code, OOM-kill flag and Docker health status.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.RemoteOperationContainerStatus getRemoteOperationContainerStatus(ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerStatusRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetRemoteOperationContainerStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists every docker container that a remote operation started (a single operation may run several
     * containers sequentially, e.g. hardware-check, GPU pre-allocation, build-cache and one training
     * container per algorithm). When &lt;code&gt;include_sub_operations&lt;/code&gt; is set, the containers of the
     * operation&amp;apos;s sub-operations are included as well. Each entry carries the container id + name,
     * its host, lifecycle state and whether logs are still available (live or persisted).
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersResponse listRemoteOperationContainers(ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListRemoteOperationContainersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Operations.
   * <pre>
   * Manages long-running operations with an API service.
   * When an API method normally takes long time to complete, it can be designed to return &lt;a href="index.html#ondewo.nlu.Operation"&gt;Operation&lt;/a&gt; to the client, and the client can use this interface to receive the real response asynchronously by polling the operation resource, or pass the operation resource to another API (such as Google Cloud Pub/Sub API) to receive the response.  Any API service that returns long-running operations should implement the &lt;code&gt;Operations&lt;/code&gt; interface so developers can have a consistent client experience.
   * </pre>
   */
  public static final class OperationsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OperationsBlockingStub> {
    private OperationsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists operations that match the specified filter in the request. If the
     * server doesn&amp;apos;t support this method, it returns &lt;code&gt;UNIMPLEMENTED&lt;/code&gt;.
     *&lt;br&gt;
     * NOTE: the &lt;code&gt;name&lt;/code&gt; binding below allows API services to override the binding
     * to use different resource name schemes, such as &lt;code&gt;users/&#42;&#47;operations&lt;/code&gt;.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.ListOperationsResponse listOperations(ondewo.nlu.OperationsOuterClass.ListOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the latest state of a long-running operation.  Clients can use this
     * method to poll the operation result at intervals as recommended by the API
     * service.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation getOperation(ondewo.nlu.OperationsOuterClass.GetOperationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOperationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a long-running operation. This method indicates that the client is
     * no longer interested in the operation result. It does not cancel the
     * operation. If the server doesn&amp;apos;t support this method, it returns
     * &lt;code&gt;google.rpc.Code.UNIMPLEMENTED&lt;/code&gt;
     * </pre>
     */
    public com.google.protobuf.Empty deleteOperation(ondewo.nlu.OperationsOuterClass.DeleteOperationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOperationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts asynchronous cancellation on a long-running operation.  The server
     * makes a best effort to cancel the operation, but success is not
     * guaranteed.  If the server doesn&amp;apos;t support this method, it returns
     * &lt;code&gt;google.rpc.Code.UNIMPLEMENTED&lt;/code&gt;.  Clients can use
     * &lt;a href="index.html#ondewo.nlu.Operations.GetOperation"&gt;Operations.GetOperation&lt;/a&gt; or
     * other methods to verify whether the cancellation succeeded or whether the
     * operation completed despite cancellation. On successful cancellation,
     * the operation is not deleted; instead, it becomes an operation with
     * an &lt;a href="index.html#ondewo.nlu.Operation"&gt;Operation.error&lt;/a&gt; value with a &lt;a href="https://developers.google.com/actions-center/reference/grpc-api/status_codes"&gt;google.rpc.Status.code&lt;/a&gt;
     * of 1, corresponding to &lt;code&gt;Code.CANCELLED&lt;/code&gt;.
     * </pre>
     */
    public com.google.protobuf.Empty cancelOperation(ondewo.nlu.OperationsOuterClass.CancelOperationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelOperationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Streams the live container logs of a remote-operation container (LLM evaluation, simulation,
     * crawl, training) as they are produced, in the manner of &lt;code&gt;docker logs --follow&lt;/code&gt;.
     * The stream stays open until the container exits or the client disconnects. Each message is a
     * single parsed log line. Secrets in the log text are redacted server-side before streaming.
     * </pre>
     */
    public java.util.Iterator<ondewo.nlu.OperationsOuterClass.RemoteOperationContainerLogLine> streamRemoteOperationContainerLogs(
        ondewo.nlu.OperationsOuterClass.StreamRemoteOperationContainerLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamRemoteOperationContainerLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a bounded, filtered snapshot of a remote-operation container&amp;apos;s logs. Supports a
     * time window (&lt;code&gt;start_time&lt;/code&gt; / &lt;code&gt;end_time&lt;/code&gt;), a minimum loguru log level,
     * a regular-expression match on the message, and a cap on the number of returned lines. Secrets
     * in the log text are redacted server-side before the response is returned.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsResponse getRemoteOperationContainerLogs(ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRemoteOperationContainerLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the health and lifecycle status of a remote-operation container: whether it still
     * exists, whether it is running/exited, its exit code, OOM-kill flag and Docker health status.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.RemoteOperationContainerStatus getRemoteOperationContainerStatus(ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRemoteOperationContainerStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists every docker container that a remote operation started (a single operation may run several
     * containers sequentially, e.g. hardware-check, GPU pre-allocation, build-cache and one training
     * container per algorithm). When &lt;code&gt;include_sub_operations&lt;/code&gt; is set, the containers of the
     * operation&amp;apos;s sub-operations are included as well. Each entry carries the container id + name,
     * its host, lifecycle state and whether logs are still available (live or persisted).
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersResponse listRemoteOperationContainers(ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRemoteOperationContainersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Operations.
   * <pre>
   * Manages long-running operations with an API service.
   * When an API method normally takes long time to complete, it can be designed to return &lt;a href="index.html#ondewo.nlu.Operation"&gt;Operation&lt;/a&gt; to the client, and the client can use this interface to receive the real response asynchronously by polling the operation resource, or pass the operation resource to another API (such as Google Cloud Pub/Sub API) to receive the response.  Any API service that returns long-running operations should implement the &lt;code&gt;Operations&lt;/code&gt; interface so developers can have a consistent client experience.
   * </pre>
   */
  public static final class OperationsFutureStub
      extends io.grpc.stub.AbstractFutureStub<OperationsFutureStub> {
    private OperationsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists operations that match the specified filter in the request. If the
     * server doesn&amp;apos;t support this method, it returns &lt;code&gt;UNIMPLEMENTED&lt;/code&gt;.
     *&lt;br&gt;
     * NOTE: the &lt;code&gt;name&lt;/code&gt; binding below allows API services to override the binding
     * to use different resource name schemes, such as &lt;code&gt;users/&#42;&#47;operations&lt;/code&gt;.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.ListOperationsResponse> listOperations(
        ondewo.nlu.OperationsOuterClass.ListOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the latest state of a long-running operation.  Clients can use this
     * method to poll the operation result at intervals as recommended by the API
     * service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> getOperation(
        ondewo.nlu.OperationsOuterClass.GetOperationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOperationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a long-running operation. This method indicates that the client is
     * no longer interested in the operation result. It does not cancel the
     * operation. If the server doesn&amp;apos;t support this method, it returns
     * &lt;code&gt;google.rpc.Code.UNIMPLEMENTED&lt;/code&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteOperation(
        ondewo.nlu.OperationsOuterClass.DeleteOperationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOperationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts asynchronous cancellation on a long-running operation.  The server
     * makes a best effort to cancel the operation, but success is not
     * guaranteed.  If the server doesn&amp;apos;t support this method, it returns
     * &lt;code&gt;google.rpc.Code.UNIMPLEMENTED&lt;/code&gt;.  Clients can use
     * &lt;a href="index.html#ondewo.nlu.Operations.GetOperation"&gt;Operations.GetOperation&lt;/a&gt; or
     * other methods to verify whether the cancellation succeeded or whether the
     * operation completed despite cancellation. On successful cancellation,
     * the operation is not deleted; instead, it becomes an operation with
     * an &lt;a href="index.html#ondewo.nlu.Operation"&gt;Operation.error&lt;/a&gt; value with a &lt;a href="https://developers.google.com/actions-center/reference/grpc-api/status_codes"&gt;google.rpc.Status.code&lt;/a&gt;
     * of 1, corresponding to &lt;code&gt;Code.CANCELLED&lt;/code&gt;.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cancelOperation(
        ondewo.nlu.OperationsOuterClass.CancelOperationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelOperationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a bounded, filtered snapshot of a remote-operation container&amp;apos;s logs. Supports a
     * time window (&lt;code&gt;start_time&lt;/code&gt; / &lt;code&gt;end_time&lt;/code&gt;), a minimum loguru log level,
     * a regular-expression match on the message, and a cap on the number of returned lines. Secrets
     * in the log text are redacted server-side before the response is returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsResponse> getRemoteOperationContainerLogs(
        ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRemoteOperationContainerLogsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the health and lifecycle status of a remote-operation container: whether it still
     * exists, whether it is running/exited, its exit code, OOM-kill flag and Docker health status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.RemoteOperationContainerStatus> getRemoteOperationContainerStatus(
        ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRemoteOperationContainerStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists every docker container that a remote operation started (a single operation may run several
     * containers sequentially, e.g. hardware-check, GPU pre-allocation, build-cache and one training
     * container per algorithm). When &lt;code&gt;include_sub_operations&lt;/code&gt; is set, the containers of the
     * operation&amp;apos;s sub-operations are included as well. Each entry carries the container id + name,
     * its host, lifecycle state and whether logs are still available (live or persisted).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersResponse> listRemoteOperationContainers(
        ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRemoteOperationContainersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_OPERATIONS = 0;
  private static final int METHODID_GET_OPERATION = 1;
  private static final int METHODID_DELETE_OPERATION = 2;
  private static final int METHODID_CANCEL_OPERATION = 3;
  private static final int METHODID_STREAM_REMOTE_OPERATION_CONTAINER_LOGS = 4;
  private static final int METHODID_GET_REMOTE_OPERATION_CONTAINER_LOGS = 5;
  private static final int METHODID_GET_REMOTE_OPERATION_CONTAINER_STATUS = 6;
  private static final int METHODID_LIST_REMOTE_OPERATION_CONTAINERS = 7;

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
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((ondewo.nlu.OperationsOuterClass.ListOperationsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.ListOperationsResponse>) responseObserver);
          break;
        case METHODID_GET_OPERATION:
          serviceImpl.getOperation((ondewo.nlu.OperationsOuterClass.GetOperationRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE_OPERATION:
          serviceImpl.deleteOperation((ondewo.nlu.OperationsOuterClass.DeleteOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CANCEL_OPERATION:
          serviceImpl.cancelOperation((ondewo.nlu.OperationsOuterClass.CancelOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_STREAM_REMOTE_OPERATION_CONTAINER_LOGS:
          serviceImpl.streamRemoteOperationContainerLogs((ondewo.nlu.OperationsOuterClass.StreamRemoteOperationContainerLogsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.RemoteOperationContainerLogLine>) responseObserver);
          break;
        case METHODID_GET_REMOTE_OPERATION_CONTAINER_LOGS:
          serviceImpl.getRemoteOperationContainerLogs((ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsResponse>) responseObserver);
          break;
        case METHODID_GET_REMOTE_OPERATION_CONTAINER_STATUS:
          serviceImpl.getRemoteOperationContainerStatus((ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerStatusRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.RemoteOperationContainerStatus>) responseObserver);
          break;
        case METHODID_LIST_REMOTE_OPERATION_CONTAINERS:
          serviceImpl.listRemoteOperationContainers((ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersResponse>) responseObserver);
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
          getListOperationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.OperationsOuterClass.ListOperationsRequest,
              ondewo.nlu.OperationsOuterClass.ListOperationsResponse>(
                service, METHODID_LIST_OPERATIONS)))
        .addMethod(
          getGetOperationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.OperationsOuterClass.GetOperationRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_GET_OPERATION)))
        .addMethod(
          getDeleteOperationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.OperationsOuterClass.DeleteOperationRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_OPERATION)))
        .addMethod(
          getCancelOperationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.OperationsOuterClass.CancelOperationRequest,
              com.google.protobuf.Empty>(
                service, METHODID_CANCEL_OPERATION)))
        .addMethod(
          getStreamRemoteOperationContainerLogsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              ondewo.nlu.OperationsOuterClass.StreamRemoteOperationContainerLogsRequest,
              ondewo.nlu.OperationsOuterClass.RemoteOperationContainerLogLine>(
                service, METHODID_STREAM_REMOTE_OPERATION_CONTAINER_LOGS)))
        .addMethod(
          getGetRemoteOperationContainerLogsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsRequest,
              ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerLogsResponse>(
                service, METHODID_GET_REMOTE_OPERATION_CONTAINER_LOGS)))
        .addMethod(
          getGetRemoteOperationContainerStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.OperationsOuterClass.GetRemoteOperationContainerStatusRequest,
              ondewo.nlu.OperationsOuterClass.RemoteOperationContainerStatus>(
                service, METHODID_GET_REMOTE_OPERATION_CONTAINER_STATUS)))
        .addMethod(
          getListRemoteOperationContainersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersRequest,
              ondewo.nlu.OperationsOuterClass.ListRemoteOperationContainersResponse>(
                service, METHODID_LIST_REMOTE_OPERATION_CONTAINERS)))
        .build();
  }

  private static abstract class OperationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OperationsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ondewo.nlu.OperationsOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Operations");
    }
  }

  private static final class OperationsFileDescriptorSupplier
      extends OperationsBaseDescriptorSupplier {
    OperationsFileDescriptorSupplier() {}
  }

  private static final class OperationsMethodDescriptorSupplier
      extends OperationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OperationsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OperationsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OperationsFileDescriptorSupplier())
              .addMethod(getListOperationsMethod())
              .addMethod(getGetOperationMethod())
              .addMethod(getDeleteOperationMethod())
              .addMethod(getCancelOperationMethod())
              .addMethod(getStreamRemoteOperationContainerLogsMethod())
              .addMethod(getGetRemoteOperationContainerLogsMethod())
              .addMethod(getGetRemoteOperationContainerStatusMethod())
              .addMethod(getListRemoteOperationContainersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
