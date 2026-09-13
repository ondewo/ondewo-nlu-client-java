package com.ondewo.nlu;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A session represents an interaction with a user. You retrieve user input and pass it to the &lt;a href="index.html#ondewo.nlu.Sessions.DetectIntent"&gt;DetectIntent&lt;/a&gt; (or &lt;a href="index.html#ondewo.nlu.Sessions.StreamingDetectIntent"&gt;StreamingDetectIntent&lt;/a&gt;) method to determine user intent and respond.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class SessionsGrpc {

  private SessionsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.nlu.Sessions";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.DetectIntentRequest,
      com.ondewo.nlu.DetectIntentResponse> getDetectIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetectIntent",
      requestType = com.ondewo.nlu.DetectIntentRequest.class,
      responseType = com.ondewo.nlu.DetectIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.DetectIntentRequest,
      com.ondewo.nlu.DetectIntentResponse> getDetectIntentMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.DetectIntentRequest, com.ondewo.nlu.DetectIntentResponse> getDetectIntentMethod;
    if ((getDetectIntentMethod = SessionsGrpc.getDetectIntentMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getDetectIntentMethod = SessionsGrpc.getDetectIntentMethod) == null) {
          SessionsGrpc.getDetectIntentMethod = getDetectIntentMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.DetectIntentRequest, com.ondewo.nlu.DetectIntentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DetectIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.DetectIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.DetectIntentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("DetectIntent"))
              .build();
        }
      }
    }
    return getDetectIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.StreamingDetectIntentRequest,
      com.ondewo.nlu.StreamingDetectIntentResponse> getStreamingDetectIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamingDetectIntent",
      requestType = com.ondewo.nlu.StreamingDetectIntentRequest.class,
      responseType = com.ondewo.nlu.StreamingDetectIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.StreamingDetectIntentRequest,
      com.ondewo.nlu.StreamingDetectIntentResponse> getStreamingDetectIntentMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.StreamingDetectIntentRequest, com.ondewo.nlu.StreamingDetectIntentResponse> getStreamingDetectIntentMethod;
    if ((getStreamingDetectIntentMethod = SessionsGrpc.getStreamingDetectIntentMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getStreamingDetectIntentMethod = SessionsGrpc.getStreamingDetectIntentMethod) == null) {
          SessionsGrpc.getStreamingDetectIntentMethod = getStreamingDetectIntentMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.StreamingDetectIntentRequest, com.ondewo.nlu.StreamingDetectIntentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamingDetectIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.StreamingDetectIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.StreamingDetectIntentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("StreamingDetectIntent"))
              .build();
        }
      }
    }
    return getStreamingDetectIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionsRequest,
      com.ondewo.nlu.ListSessionsResponse> getListSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSessions",
      requestType = com.ondewo.nlu.ListSessionsRequest.class,
      responseType = com.ondewo.nlu.ListSessionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionsRequest,
      com.ondewo.nlu.ListSessionsResponse> getListSessionsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionsRequest, com.ondewo.nlu.ListSessionsResponse> getListSessionsMethod;
    if ((getListSessionsMethod = SessionsGrpc.getListSessionsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListSessionsMethod = SessionsGrpc.getListSessionsMethod) == null) {
          SessionsGrpc.getListSessionsMethod = getListSessionsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListSessionsRequest, com.ondewo.nlu.ListSessionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListSessionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListSessions"))
              .build();
        }
      }
    }
    return getListSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.GetSessionRequest,
      com.ondewo.nlu.Session> getGetSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSession",
      requestType = com.ondewo.nlu.GetSessionRequest.class,
      responseType = com.ondewo.nlu.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.GetSessionRequest,
      com.ondewo.nlu.Session> getGetSessionMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.GetSessionRequest, com.ondewo.nlu.Session> getGetSessionMethod;
    if ((getGetSessionMethod = SessionsGrpc.getGetSessionMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getGetSessionMethod = SessionsGrpc.getGetSessionMethod) == null) {
          SessionsGrpc.getGetSessionMethod = getGetSessionMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.GetSessionRequest, com.ondewo.nlu.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.GetSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.Session.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("GetSession"))
              .build();
        }
      }
    }
    return getGetSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.CreateSessionRequest,
      com.ondewo.nlu.Session> getCreateSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSession",
      requestType = com.ondewo.nlu.CreateSessionRequest.class,
      responseType = com.ondewo.nlu.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.CreateSessionRequest,
      com.ondewo.nlu.Session> getCreateSessionMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.CreateSessionRequest, com.ondewo.nlu.Session> getCreateSessionMethod;
    if ((getCreateSessionMethod = SessionsGrpc.getCreateSessionMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getCreateSessionMethod = SessionsGrpc.getCreateSessionMethod) == null) {
          SessionsGrpc.getCreateSessionMethod = getCreateSessionMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.CreateSessionRequest, com.ondewo.nlu.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.CreateSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.Session.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("CreateSession"))
              .build();
        }
      }
    }
    return getCreateSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.CreateSessionStepRequest,
      com.ondewo.nlu.SessionStep> getCreateSessionStepMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSessionStep",
      requestType = com.ondewo.nlu.CreateSessionStepRequest.class,
      responseType = com.ondewo.nlu.SessionStep.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.CreateSessionStepRequest,
      com.ondewo.nlu.SessionStep> getCreateSessionStepMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.CreateSessionStepRequest, com.ondewo.nlu.SessionStep> getCreateSessionStepMethod;
    if ((getCreateSessionStepMethod = SessionsGrpc.getCreateSessionStepMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getCreateSessionStepMethod = SessionsGrpc.getCreateSessionStepMethod) == null) {
          SessionsGrpc.getCreateSessionStepMethod = getCreateSessionStepMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.CreateSessionStepRequest, com.ondewo.nlu.SessionStep>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSessionStep"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.CreateSessionStepRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.SessionStep.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("CreateSessionStep"))
              .build();
        }
      }
    }
    return getCreateSessionStepMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.GetSessionStepRequest,
      com.ondewo.nlu.SessionStep> getGetSessionStepMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSessionStep",
      requestType = com.ondewo.nlu.GetSessionStepRequest.class,
      responseType = com.ondewo.nlu.SessionStep.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.GetSessionStepRequest,
      com.ondewo.nlu.SessionStep> getGetSessionStepMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.GetSessionStepRequest, com.ondewo.nlu.SessionStep> getGetSessionStepMethod;
    if ((getGetSessionStepMethod = SessionsGrpc.getGetSessionStepMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getGetSessionStepMethod = SessionsGrpc.getGetSessionStepMethod) == null) {
          SessionsGrpc.getGetSessionStepMethod = getGetSessionStepMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.GetSessionStepRequest, com.ondewo.nlu.SessionStep>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSessionStep"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.GetSessionStepRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.SessionStep.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("GetSessionStep"))
              .build();
        }
      }
    }
    return getGetSessionStepMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.UpdateSessionStepRequest,
      com.ondewo.nlu.SessionStep> getUpdateSessionStepMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSessionStep",
      requestType = com.ondewo.nlu.UpdateSessionStepRequest.class,
      responseType = com.ondewo.nlu.SessionStep.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.UpdateSessionStepRequest,
      com.ondewo.nlu.SessionStep> getUpdateSessionStepMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.UpdateSessionStepRequest, com.ondewo.nlu.SessionStep> getUpdateSessionStepMethod;
    if ((getUpdateSessionStepMethod = SessionsGrpc.getUpdateSessionStepMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getUpdateSessionStepMethod = SessionsGrpc.getUpdateSessionStepMethod) == null) {
          SessionsGrpc.getUpdateSessionStepMethod = getUpdateSessionStepMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.UpdateSessionStepRequest, com.ondewo.nlu.SessionStep>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSessionStep"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.UpdateSessionStepRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.SessionStep.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("UpdateSessionStep"))
              .build();
        }
      }
    }
    return getUpdateSessionStepMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteSessionStepRequest,
      com.google.protobuf.Empty> getDeleteSessionStepMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSessionStep",
      requestType = com.ondewo.nlu.DeleteSessionStepRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteSessionStepRequest,
      com.google.protobuf.Empty> getDeleteSessionStepMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteSessionStepRequest, com.google.protobuf.Empty> getDeleteSessionStepMethod;
    if ((getDeleteSessionStepMethod = SessionsGrpc.getDeleteSessionStepMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getDeleteSessionStepMethod = SessionsGrpc.getDeleteSessionStepMethod) == null) {
          SessionsGrpc.getDeleteSessionStepMethod = getDeleteSessionStepMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.DeleteSessionStepRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSessionStep"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.DeleteSessionStepRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("DeleteSessionStep"))
              .build();
        }
      }
    }
    return getDeleteSessionStepMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteSessionRequest,
      com.google.protobuf.Empty> getDeleteSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSession",
      requestType = com.ondewo.nlu.DeleteSessionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteSessionRequest,
      com.google.protobuf.Empty> getDeleteSessionMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteSessionRequest, com.google.protobuf.Empty> getDeleteSessionMethod;
    if ((getDeleteSessionMethod = SessionsGrpc.getDeleteSessionMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getDeleteSessionMethod = SessionsGrpc.getDeleteSessionMethod) == null) {
          SessionsGrpc.getDeleteSessionMethod = getDeleteSessionMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.DeleteSessionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.DeleteSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("DeleteSession"))
              .build();
        }
      }
    }
    return getDeleteSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionLabelsRequest,
      com.ondewo.nlu.ListSessionLabelsResponse> getListSessionLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSessionLabels",
      requestType = com.ondewo.nlu.ListSessionLabelsRequest.class,
      responseType = com.ondewo.nlu.ListSessionLabelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionLabelsRequest,
      com.ondewo.nlu.ListSessionLabelsResponse> getListSessionLabelsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionLabelsRequest, com.ondewo.nlu.ListSessionLabelsResponse> getListSessionLabelsMethod;
    if ((getListSessionLabelsMethod = SessionsGrpc.getListSessionLabelsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListSessionLabelsMethod = SessionsGrpc.getListSessionLabelsMethod) == null) {
          SessionsGrpc.getListSessionLabelsMethod = getListSessionLabelsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListSessionLabelsRequest, com.ondewo.nlu.ListSessionLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSessionLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListSessionLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListSessionLabelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListSessionLabels"))
              .build();
        }
      }
    }
    return getListSessionLabelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionLabelsOfAllSessionsRequest,
      com.ondewo.nlu.ListSessionLabelsResponse> getListSessionLabelsOfAllSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSessionLabelsOfAllSessions",
      requestType = com.ondewo.nlu.ListSessionLabelsOfAllSessionsRequest.class,
      responseType = com.ondewo.nlu.ListSessionLabelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionLabelsOfAllSessionsRequest,
      com.ondewo.nlu.ListSessionLabelsResponse> getListSessionLabelsOfAllSessionsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionLabelsOfAllSessionsRequest, com.ondewo.nlu.ListSessionLabelsResponse> getListSessionLabelsOfAllSessionsMethod;
    if ((getListSessionLabelsOfAllSessionsMethod = SessionsGrpc.getListSessionLabelsOfAllSessionsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListSessionLabelsOfAllSessionsMethod = SessionsGrpc.getListSessionLabelsOfAllSessionsMethod) == null) {
          SessionsGrpc.getListSessionLabelsOfAllSessionsMethod = getListSessionLabelsOfAllSessionsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListSessionLabelsOfAllSessionsRequest, com.ondewo.nlu.ListSessionLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSessionLabelsOfAllSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListSessionLabelsOfAllSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListSessionLabelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListSessionLabelsOfAllSessions"))
              .build();
        }
      }
    }
    return getListSessionLabelsOfAllSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListLanguageCodesOfAllSessionsRequest,
      com.ondewo.nlu.ListLanguageCodesResponse> getListLanguageCodesOfAllSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLanguageCodesOfAllSessions",
      requestType = com.ondewo.nlu.ListLanguageCodesOfAllSessionsRequest.class,
      responseType = com.ondewo.nlu.ListLanguageCodesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListLanguageCodesOfAllSessionsRequest,
      com.ondewo.nlu.ListLanguageCodesResponse> getListLanguageCodesOfAllSessionsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListLanguageCodesOfAllSessionsRequest, com.ondewo.nlu.ListLanguageCodesResponse> getListLanguageCodesOfAllSessionsMethod;
    if ((getListLanguageCodesOfAllSessionsMethod = SessionsGrpc.getListLanguageCodesOfAllSessionsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListLanguageCodesOfAllSessionsMethod = SessionsGrpc.getListLanguageCodesOfAllSessionsMethod) == null) {
          SessionsGrpc.getListLanguageCodesOfAllSessionsMethod = getListLanguageCodesOfAllSessionsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListLanguageCodesOfAllSessionsRequest, com.ondewo.nlu.ListLanguageCodesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLanguageCodesOfAllSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListLanguageCodesOfAllSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListLanguageCodesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListLanguageCodesOfAllSessions"))
              .build();
        }
      }
    }
    return getListLanguageCodesOfAllSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListMatchedIntentsOfAllSessionsRequest,
      com.ondewo.nlu.ListMatchedIntentsResponse> getListMatchedIntentsOfAllSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMatchedIntentsOfAllSessions",
      requestType = com.ondewo.nlu.ListMatchedIntentsOfAllSessionsRequest.class,
      responseType = com.ondewo.nlu.ListMatchedIntentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListMatchedIntentsOfAllSessionsRequest,
      com.ondewo.nlu.ListMatchedIntentsResponse> getListMatchedIntentsOfAllSessionsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListMatchedIntentsOfAllSessionsRequest, com.ondewo.nlu.ListMatchedIntentsResponse> getListMatchedIntentsOfAllSessionsMethod;
    if ((getListMatchedIntentsOfAllSessionsMethod = SessionsGrpc.getListMatchedIntentsOfAllSessionsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListMatchedIntentsOfAllSessionsMethod = SessionsGrpc.getListMatchedIntentsOfAllSessionsMethod) == null) {
          SessionsGrpc.getListMatchedIntentsOfAllSessionsMethod = getListMatchedIntentsOfAllSessionsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListMatchedIntentsOfAllSessionsRequest, com.ondewo.nlu.ListMatchedIntentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMatchedIntentsOfAllSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListMatchedIntentsOfAllSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListMatchedIntentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListMatchedIntentsOfAllSessions"))
              .build();
        }
      }
    }
    return getListMatchedIntentsOfAllSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListMatchedEntityTypesOfAllSessionsRequest,
      com.ondewo.nlu.ListMatchedEntityTypesResponse> getListMatchedEntityTypesOfAllSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMatchedEntityTypesOfAllSessions",
      requestType = com.ondewo.nlu.ListMatchedEntityTypesOfAllSessionsRequest.class,
      responseType = com.ondewo.nlu.ListMatchedEntityTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListMatchedEntityTypesOfAllSessionsRequest,
      com.ondewo.nlu.ListMatchedEntityTypesResponse> getListMatchedEntityTypesOfAllSessionsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListMatchedEntityTypesOfAllSessionsRequest, com.ondewo.nlu.ListMatchedEntityTypesResponse> getListMatchedEntityTypesOfAllSessionsMethod;
    if ((getListMatchedEntityTypesOfAllSessionsMethod = SessionsGrpc.getListMatchedEntityTypesOfAllSessionsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListMatchedEntityTypesOfAllSessionsMethod = SessionsGrpc.getListMatchedEntityTypesOfAllSessionsMethod) == null) {
          SessionsGrpc.getListMatchedEntityTypesOfAllSessionsMethod = getListMatchedEntityTypesOfAllSessionsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListMatchedEntityTypesOfAllSessionsRequest, com.ondewo.nlu.ListMatchedEntityTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMatchedEntityTypesOfAllSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListMatchedEntityTypesOfAllSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListMatchedEntityTypesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListMatchedEntityTypesOfAllSessions"))
              .build();
        }
      }
    }
    return getListMatchedEntityTypesOfAllSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListUserIdsOfAllSessionsRequest,
      com.ondewo.nlu.ListUserIdsResponse> getListUserIdsOfAllSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserIdsOfAllSessions",
      requestType = com.ondewo.nlu.ListUserIdsOfAllSessionsRequest.class,
      responseType = com.ondewo.nlu.ListUserIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListUserIdsOfAllSessionsRequest,
      com.ondewo.nlu.ListUserIdsResponse> getListUserIdsOfAllSessionsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListUserIdsOfAllSessionsRequest, com.ondewo.nlu.ListUserIdsResponse> getListUserIdsOfAllSessionsMethod;
    if ((getListUserIdsOfAllSessionsMethod = SessionsGrpc.getListUserIdsOfAllSessionsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListUserIdsOfAllSessionsMethod = SessionsGrpc.getListUserIdsOfAllSessionsMethod) == null) {
          SessionsGrpc.getListUserIdsOfAllSessionsMethod = getListUserIdsOfAllSessionsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListUserIdsOfAllSessionsRequest, com.ondewo.nlu.ListUserIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserIdsOfAllSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListUserIdsOfAllSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListUserIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListUserIdsOfAllSessions"))
              .build();
        }
      }
    }
    return getListUserIdsOfAllSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListIdentifiedUserIdsOfAllSessionsRequest,
      com.ondewo.nlu.ListIdentifiedUserIdsResponse> getListIdentifiedUserIdsOfAllSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIdentifiedUserIdsOfAllSessions",
      requestType = com.ondewo.nlu.ListIdentifiedUserIdsOfAllSessionsRequest.class,
      responseType = com.ondewo.nlu.ListIdentifiedUserIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListIdentifiedUserIdsOfAllSessionsRequest,
      com.ondewo.nlu.ListIdentifiedUserIdsResponse> getListIdentifiedUserIdsOfAllSessionsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListIdentifiedUserIdsOfAllSessionsRequest, com.ondewo.nlu.ListIdentifiedUserIdsResponse> getListIdentifiedUserIdsOfAllSessionsMethod;
    if ((getListIdentifiedUserIdsOfAllSessionsMethod = SessionsGrpc.getListIdentifiedUserIdsOfAllSessionsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListIdentifiedUserIdsOfAllSessionsMethod = SessionsGrpc.getListIdentifiedUserIdsOfAllSessionsMethod) == null) {
          SessionsGrpc.getListIdentifiedUserIdsOfAllSessionsMethod = getListIdentifiedUserIdsOfAllSessionsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListIdentifiedUserIdsOfAllSessionsRequest, com.ondewo.nlu.ListIdentifiedUserIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListIdentifiedUserIdsOfAllSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListIdentifiedUserIdsOfAllSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListIdentifiedUserIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListIdentifiedUserIdsOfAllSessions"))
              .build();
        }
      }
    }
    return getListIdentifiedUserIdsOfAllSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListTagsOfAllSessionsRequest,
      com.ondewo.nlu.ListTagsResponse> getListTagsOfAllSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTagsOfAllSessions",
      requestType = com.ondewo.nlu.ListTagsOfAllSessionsRequest.class,
      responseType = com.ondewo.nlu.ListTagsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListTagsOfAllSessionsRequest,
      com.ondewo.nlu.ListTagsResponse> getListTagsOfAllSessionsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListTagsOfAllSessionsRequest, com.ondewo.nlu.ListTagsResponse> getListTagsOfAllSessionsMethod;
    if ((getListTagsOfAllSessionsMethod = SessionsGrpc.getListTagsOfAllSessionsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListTagsOfAllSessionsMethod = SessionsGrpc.getListTagsOfAllSessionsMethod) == null) {
          SessionsGrpc.getListTagsOfAllSessionsMethod = getListTagsOfAllSessionsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListTagsOfAllSessionsRequest, com.ondewo.nlu.ListTagsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTagsOfAllSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListTagsOfAllSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListTagsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListTagsOfAllSessions"))
              .build();
        }
      }
    }
    return getListTagsOfAllSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListInputContextsOfAllSessionsRequest,
      com.ondewo.nlu.ListInputContextsResponse> getListInputContextsOfAllSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInputContextsOfAllSessions",
      requestType = com.ondewo.nlu.ListInputContextsOfAllSessionsRequest.class,
      responseType = com.ondewo.nlu.ListInputContextsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListInputContextsOfAllSessionsRequest,
      com.ondewo.nlu.ListInputContextsResponse> getListInputContextsOfAllSessionsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListInputContextsOfAllSessionsRequest, com.ondewo.nlu.ListInputContextsResponse> getListInputContextsOfAllSessionsMethod;
    if ((getListInputContextsOfAllSessionsMethod = SessionsGrpc.getListInputContextsOfAllSessionsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListInputContextsOfAllSessionsMethod = SessionsGrpc.getListInputContextsOfAllSessionsMethod) == null) {
          SessionsGrpc.getListInputContextsOfAllSessionsMethod = getListInputContextsOfAllSessionsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListInputContextsOfAllSessionsRequest, com.ondewo.nlu.ListInputContextsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInputContextsOfAllSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListInputContextsOfAllSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListInputContextsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListInputContextsOfAllSessions"))
              .build();
        }
      }
    }
    return getListInputContextsOfAllSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListOutputContextsOfAllSessionsRequest,
      com.ondewo.nlu.ListOutputContextsResponse> getListOutputContextsOfAllSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOutputContextsOfAllSessions",
      requestType = com.ondewo.nlu.ListOutputContextsOfAllSessionsRequest.class,
      responseType = com.ondewo.nlu.ListOutputContextsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListOutputContextsOfAllSessionsRequest,
      com.ondewo.nlu.ListOutputContextsResponse> getListOutputContextsOfAllSessionsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListOutputContextsOfAllSessionsRequest, com.ondewo.nlu.ListOutputContextsResponse> getListOutputContextsOfAllSessionsMethod;
    if ((getListOutputContextsOfAllSessionsMethod = SessionsGrpc.getListOutputContextsOfAllSessionsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListOutputContextsOfAllSessionsMethod = SessionsGrpc.getListOutputContextsOfAllSessionsMethod) == null) {
          SessionsGrpc.getListOutputContextsOfAllSessionsMethod = getListOutputContextsOfAllSessionsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListOutputContextsOfAllSessionsRequest, com.ondewo.nlu.ListOutputContextsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOutputContextsOfAllSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListOutputContextsOfAllSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListOutputContextsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListOutputContextsOfAllSessions"))
              .build();
        }
      }
    }
    return getListOutputContextsOfAllSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListPlatformsOfAllSessionsRequest,
      com.ondewo.nlu.ListPlatformsResponse> getListPlatformsOfAllSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPlatformsOfAllSessions",
      requestType = com.ondewo.nlu.ListPlatformsOfAllSessionsRequest.class,
      responseType = com.ondewo.nlu.ListPlatformsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListPlatformsOfAllSessionsRequest,
      com.ondewo.nlu.ListPlatformsResponse> getListPlatformsOfAllSessionsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListPlatformsOfAllSessionsRequest, com.ondewo.nlu.ListPlatformsResponse> getListPlatformsOfAllSessionsMethod;
    if ((getListPlatformsOfAllSessionsMethod = SessionsGrpc.getListPlatformsOfAllSessionsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListPlatformsOfAllSessionsMethod = SessionsGrpc.getListPlatformsOfAllSessionsMethod) == null) {
          SessionsGrpc.getListPlatformsOfAllSessionsMethod = getListPlatformsOfAllSessionsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListPlatformsOfAllSessionsRequest, com.ondewo.nlu.ListPlatformsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPlatformsOfAllSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListPlatformsOfAllSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListPlatformsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListPlatformsOfAllSessions"))
              .build();
        }
      }
    }
    return getListPlatformsOfAllSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListAccountIdsOfAllSessionsRequest,
      com.ondewo.nlu.ListAccountIdsResponse> getListAccountIdsOfAllSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAccountIdsOfAllSessions",
      requestType = com.ondewo.nlu.ListAccountIdsOfAllSessionsRequest.class,
      responseType = com.ondewo.nlu.ListAccountIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListAccountIdsOfAllSessionsRequest,
      com.ondewo.nlu.ListAccountIdsResponse> getListAccountIdsOfAllSessionsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListAccountIdsOfAllSessionsRequest, com.ondewo.nlu.ListAccountIdsResponse> getListAccountIdsOfAllSessionsMethod;
    if ((getListAccountIdsOfAllSessionsMethod = SessionsGrpc.getListAccountIdsOfAllSessionsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListAccountIdsOfAllSessionsMethod = SessionsGrpc.getListAccountIdsOfAllSessionsMethod) == null) {
          SessionsGrpc.getListAccountIdsOfAllSessionsMethod = getListAccountIdsOfAllSessionsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListAccountIdsOfAllSessionsRequest, com.ondewo.nlu.ListAccountIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccountIdsOfAllSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListAccountIdsOfAllSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListAccountIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListAccountIdsOfAllSessions"))
              .build();
        }
      }
    }
    return getListAccountIdsOfAllSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListPropertyIdsOfAllSessionsRequest,
      com.ondewo.nlu.ListPropertyIdsResponse> getListPropertyIdsOfAllSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPropertyIdsOfAllSessions",
      requestType = com.ondewo.nlu.ListPropertyIdsOfAllSessionsRequest.class,
      responseType = com.ondewo.nlu.ListPropertyIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListPropertyIdsOfAllSessionsRequest,
      com.ondewo.nlu.ListPropertyIdsResponse> getListPropertyIdsOfAllSessionsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListPropertyIdsOfAllSessionsRequest, com.ondewo.nlu.ListPropertyIdsResponse> getListPropertyIdsOfAllSessionsMethod;
    if ((getListPropertyIdsOfAllSessionsMethod = SessionsGrpc.getListPropertyIdsOfAllSessionsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListPropertyIdsOfAllSessionsMethod = SessionsGrpc.getListPropertyIdsOfAllSessionsMethod) == null) {
          SessionsGrpc.getListPropertyIdsOfAllSessionsMethod = getListPropertyIdsOfAllSessionsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListPropertyIdsOfAllSessionsRequest, com.ondewo.nlu.ListPropertyIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPropertyIdsOfAllSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListPropertyIdsOfAllSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListPropertyIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListPropertyIdsOfAllSessions"))
              .build();
        }
      }
    }
    return getListPropertyIdsOfAllSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListDatastreamIdsOfAllSessionsRequest,
      com.ondewo.nlu.ListDatastreamIdsResponse> getListDatastreamIdsOfAllSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDatastreamIdsOfAllSessions",
      requestType = com.ondewo.nlu.ListDatastreamIdsOfAllSessionsRequest.class,
      responseType = com.ondewo.nlu.ListDatastreamIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListDatastreamIdsOfAllSessionsRequest,
      com.ondewo.nlu.ListDatastreamIdsResponse> getListDatastreamIdsOfAllSessionsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListDatastreamIdsOfAllSessionsRequest, com.ondewo.nlu.ListDatastreamIdsResponse> getListDatastreamIdsOfAllSessionsMethod;
    if ((getListDatastreamIdsOfAllSessionsMethod = SessionsGrpc.getListDatastreamIdsOfAllSessionsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListDatastreamIdsOfAllSessionsMethod = SessionsGrpc.getListDatastreamIdsOfAllSessionsMethod) == null) {
          SessionsGrpc.getListDatastreamIdsOfAllSessionsMethod = getListDatastreamIdsOfAllSessionsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListDatastreamIdsOfAllSessionsRequest, com.ondewo.nlu.ListDatastreamIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDatastreamIdsOfAllSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListDatastreamIdsOfAllSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListDatastreamIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListDatastreamIdsOfAllSessions"))
              .build();
        }
      }
    }
    return getListDatastreamIdsOfAllSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListOriginIdsOfAllSessionsRequest,
      com.ondewo.nlu.ListOriginIdsResponse> getListOriginIdsOfAllSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOriginIdsOfAllSessions",
      requestType = com.ondewo.nlu.ListOriginIdsOfAllSessionsRequest.class,
      responseType = com.ondewo.nlu.ListOriginIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListOriginIdsOfAllSessionsRequest,
      com.ondewo.nlu.ListOriginIdsResponse> getListOriginIdsOfAllSessionsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListOriginIdsOfAllSessionsRequest, com.ondewo.nlu.ListOriginIdsResponse> getListOriginIdsOfAllSessionsMethod;
    if ((getListOriginIdsOfAllSessionsMethod = SessionsGrpc.getListOriginIdsOfAllSessionsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListOriginIdsOfAllSessionsMethod = SessionsGrpc.getListOriginIdsOfAllSessionsMethod) == null) {
          SessionsGrpc.getListOriginIdsOfAllSessionsMethod = getListOriginIdsOfAllSessionsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListOriginIdsOfAllSessionsRequest, com.ondewo.nlu.ListOriginIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOriginIdsOfAllSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListOriginIdsOfAllSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListOriginIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListOriginIdsOfAllSessions"))
              .build();
        }
      }
    }
    return getListOriginIdsOfAllSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.AddSessionLabelsRequest,
      com.ondewo.nlu.Session> getAddSessionLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSessionLabels",
      requestType = com.ondewo.nlu.AddSessionLabelsRequest.class,
      responseType = com.ondewo.nlu.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.AddSessionLabelsRequest,
      com.ondewo.nlu.Session> getAddSessionLabelsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.AddSessionLabelsRequest, com.ondewo.nlu.Session> getAddSessionLabelsMethod;
    if ((getAddSessionLabelsMethod = SessionsGrpc.getAddSessionLabelsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getAddSessionLabelsMethod = SessionsGrpc.getAddSessionLabelsMethod) == null) {
          SessionsGrpc.getAddSessionLabelsMethod = getAddSessionLabelsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.AddSessionLabelsRequest, com.ondewo.nlu.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSessionLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.AddSessionLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.Session.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("AddSessionLabels"))
              .build();
        }
      }
    }
    return getAddSessionLabelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteSessionLabelsRequest,
      com.ondewo.nlu.Session> getDeleteSessionLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSessionLabels",
      requestType = com.ondewo.nlu.DeleteSessionLabelsRequest.class,
      responseType = com.ondewo.nlu.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteSessionLabelsRequest,
      com.ondewo.nlu.Session> getDeleteSessionLabelsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteSessionLabelsRequest, com.ondewo.nlu.Session> getDeleteSessionLabelsMethod;
    if ((getDeleteSessionLabelsMethod = SessionsGrpc.getDeleteSessionLabelsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getDeleteSessionLabelsMethod = SessionsGrpc.getDeleteSessionLabelsMethod) == null) {
          SessionsGrpc.getDeleteSessionLabelsMethod = getDeleteSessionLabelsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.DeleteSessionLabelsRequest, com.ondewo.nlu.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSessionLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.DeleteSessionLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.Session.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("DeleteSessionLabels"))
              .build();
        }
      }
    }
    return getDeleteSessionLabelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.AddSessionCommentRequest,
      com.ondewo.nlu.Comment> getAddSessionCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSessionComment",
      requestType = com.ondewo.nlu.AddSessionCommentRequest.class,
      responseType = com.ondewo.nlu.Comment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.AddSessionCommentRequest,
      com.ondewo.nlu.Comment> getAddSessionCommentMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.AddSessionCommentRequest, com.ondewo.nlu.Comment> getAddSessionCommentMethod;
    if ((getAddSessionCommentMethod = SessionsGrpc.getAddSessionCommentMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getAddSessionCommentMethod = SessionsGrpc.getAddSessionCommentMethod) == null) {
          SessionsGrpc.getAddSessionCommentMethod = getAddSessionCommentMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.AddSessionCommentRequest, com.ondewo.nlu.Comment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSessionComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.AddSessionCommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.Comment.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("AddSessionComment"))
              .build();
        }
      }
    }
    return getAddSessionCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteSessionCommentsRequest,
      com.ondewo.nlu.Session> getDeleteSessionCommentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSessionComments",
      requestType = com.ondewo.nlu.DeleteSessionCommentsRequest.class,
      responseType = com.ondewo.nlu.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteSessionCommentsRequest,
      com.ondewo.nlu.Session> getDeleteSessionCommentsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteSessionCommentsRequest, com.ondewo.nlu.Session> getDeleteSessionCommentsMethod;
    if ((getDeleteSessionCommentsMethod = SessionsGrpc.getDeleteSessionCommentsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getDeleteSessionCommentsMethod = SessionsGrpc.getDeleteSessionCommentsMethod) == null) {
          SessionsGrpc.getDeleteSessionCommentsMethod = getDeleteSessionCommentsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.DeleteSessionCommentsRequest, com.ondewo.nlu.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSessionComments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.DeleteSessionCommentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.Session.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("DeleteSessionComments"))
              .build();
        }
      }
    }
    return getDeleteSessionCommentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.UpdateSessionCommentsRequest,
      com.ondewo.nlu.Session> getUpdateSessionCommentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSessionComments",
      requestType = com.ondewo.nlu.UpdateSessionCommentsRequest.class,
      responseType = com.ondewo.nlu.Session.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.UpdateSessionCommentsRequest,
      com.ondewo.nlu.Session> getUpdateSessionCommentsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.UpdateSessionCommentsRequest, com.ondewo.nlu.Session> getUpdateSessionCommentsMethod;
    if ((getUpdateSessionCommentsMethod = SessionsGrpc.getUpdateSessionCommentsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getUpdateSessionCommentsMethod = SessionsGrpc.getUpdateSessionCommentsMethod) == null) {
          SessionsGrpc.getUpdateSessionCommentsMethod = getUpdateSessionCommentsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.UpdateSessionCommentsRequest, com.ondewo.nlu.Session>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSessionComments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.UpdateSessionCommentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.Session.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("UpdateSessionComments"))
              .build();
        }
      }
    }
    return getUpdateSessionCommentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionCommentsRequest,
      com.ondewo.nlu.ListSessionCommentsResponse> getListSessionCommentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSessionComments",
      requestType = com.ondewo.nlu.ListSessionCommentsRequest.class,
      responseType = com.ondewo.nlu.ListSessionCommentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionCommentsRequest,
      com.ondewo.nlu.ListSessionCommentsResponse> getListSessionCommentsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionCommentsRequest, com.ondewo.nlu.ListSessionCommentsResponse> getListSessionCommentsMethod;
    if ((getListSessionCommentsMethod = SessionsGrpc.getListSessionCommentsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListSessionCommentsMethod = SessionsGrpc.getListSessionCommentsMethod) == null) {
          SessionsGrpc.getListSessionCommentsMethod = getListSessionCommentsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListSessionCommentsRequest, com.ondewo.nlu.ListSessionCommentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSessionComments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListSessionCommentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListSessionCommentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListSessionComments"))
              .build();
        }
      }
    }
    return getListSessionCommentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionCommentsOfAllSessionsRequest,
      com.ondewo.nlu.ListSessionCommentsResponse> getListSessionCommentsOfAllSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSessionCommentsOfAllSessions",
      requestType = com.ondewo.nlu.ListSessionCommentsOfAllSessionsRequest.class,
      responseType = com.ondewo.nlu.ListSessionCommentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionCommentsOfAllSessionsRequest,
      com.ondewo.nlu.ListSessionCommentsResponse> getListSessionCommentsOfAllSessionsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionCommentsOfAllSessionsRequest, com.ondewo.nlu.ListSessionCommentsResponse> getListSessionCommentsOfAllSessionsMethod;
    if ((getListSessionCommentsOfAllSessionsMethod = SessionsGrpc.getListSessionCommentsOfAllSessionsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListSessionCommentsOfAllSessionsMethod = SessionsGrpc.getListSessionCommentsOfAllSessionsMethod) == null) {
          SessionsGrpc.getListSessionCommentsOfAllSessionsMethod = getListSessionCommentsOfAllSessionsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListSessionCommentsOfAllSessionsRequest, com.ondewo.nlu.ListSessionCommentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSessionCommentsOfAllSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListSessionCommentsOfAllSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListSessionCommentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListSessionCommentsOfAllSessions"))
              .build();
        }
      }
    }
    return getListSessionCommentsOfAllSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.AddSessionFeedbackRequest,
      com.ondewo.nlu.SessionFeedback> getAddSessionFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSessionFeedback",
      requestType = com.ondewo.nlu.AddSessionFeedbackRequest.class,
      responseType = com.ondewo.nlu.SessionFeedback.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.AddSessionFeedbackRequest,
      com.ondewo.nlu.SessionFeedback> getAddSessionFeedbackMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.AddSessionFeedbackRequest, com.ondewo.nlu.SessionFeedback> getAddSessionFeedbackMethod;
    if ((getAddSessionFeedbackMethod = SessionsGrpc.getAddSessionFeedbackMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getAddSessionFeedbackMethod = SessionsGrpc.getAddSessionFeedbackMethod) == null) {
          SessionsGrpc.getAddSessionFeedbackMethod = getAddSessionFeedbackMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.AddSessionFeedbackRequest, com.ondewo.nlu.SessionFeedback>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSessionFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.AddSessionFeedbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.SessionFeedback.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("AddSessionFeedback"))
              .build();
        }
      }
    }
    return getAddSessionFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.AddSessionStepFeedbackRequest,
      com.ondewo.nlu.SessionFeedback> getAddSessionStepFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSessionStepFeedback",
      requestType = com.ondewo.nlu.AddSessionStepFeedbackRequest.class,
      responseType = com.ondewo.nlu.SessionFeedback.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.AddSessionStepFeedbackRequest,
      com.ondewo.nlu.SessionFeedback> getAddSessionStepFeedbackMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.AddSessionStepFeedbackRequest, com.ondewo.nlu.SessionFeedback> getAddSessionStepFeedbackMethod;
    if ((getAddSessionStepFeedbackMethod = SessionsGrpc.getAddSessionStepFeedbackMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getAddSessionStepFeedbackMethod = SessionsGrpc.getAddSessionStepFeedbackMethod) == null) {
          SessionsGrpc.getAddSessionStepFeedbackMethod = getAddSessionStepFeedbackMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.AddSessionStepFeedbackRequest, com.ondewo.nlu.SessionFeedback>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSessionStepFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.AddSessionStepFeedbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.SessionFeedback.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("AddSessionStepFeedback"))
              .build();
        }
      }
    }
    return getAddSessionStepFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.GetSessionFeedbackRequest,
      com.ondewo.nlu.SessionFeedback> getGetSessionFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSessionFeedback",
      requestType = com.ondewo.nlu.GetSessionFeedbackRequest.class,
      responseType = com.ondewo.nlu.SessionFeedback.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.GetSessionFeedbackRequest,
      com.ondewo.nlu.SessionFeedback> getGetSessionFeedbackMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.GetSessionFeedbackRequest, com.ondewo.nlu.SessionFeedback> getGetSessionFeedbackMethod;
    if ((getGetSessionFeedbackMethod = SessionsGrpc.getGetSessionFeedbackMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getGetSessionFeedbackMethod = SessionsGrpc.getGetSessionFeedbackMethod) == null) {
          SessionsGrpc.getGetSessionFeedbackMethod = getGetSessionFeedbackMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.GetSessionFeedbackRequest, com.ondewo.nlu.SessionFeedback>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSessionFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.GetSessionFeedbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.SessionFeedback.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("GetSessionFeedback"))
              .build();
        }
      }
    }
    return getGetSessionFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.UpdateSessionFeedbackRequest,
      com.ondewo.nlu.SessionFeedback> getUpdateSessionFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSessionFeedback",
      requestType = com.ondewo.nlu.UpdateSessionFeedbackRequest.class,
      responseType = com.ondewo.nlu.SessionFeedback.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.UpdateSessionFeedbackRequest,
      com.ondewo.nlu.SessionFeedback> getUpdateSessionFeedbackMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.UpdateSessionFeedbackRequest, com.ondewo.nlu.SessionFeedback> getUpdateSessionFeedbackMethod;
    if ((getUpdateSessionFeedbackMethod = SessionsGrpc.getUpdateSessionFeedbackMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getUpdateSessionFeedbackMethod = SessionsGrpc.getUpdateSessionFeedbackMethod) == null) {
          SessionsGrpc.getUpdateSessionFeedbackMethod = getUpdateSessionFeedbackMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.UpdateSessionFeedbackRequest, com.ondewo.nlu.SessionFeedback>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSessionFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.UpdateSessionFeedbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.SessionFeedback.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("UpdateSessionFeedback"))
              .build();
        }
      }
    }
    return getUpdateSessionFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteSessionFeedbackRequest,
      com.google.protobuf.Empty> getDeleteSessionFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSessionFeedback",
      requestType = com.ondewo.nlu.DeleteSessionFeedbackRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteSessionFeedbackRequest,
      com.google.protobuf.Empty> getDeleteSessionFeedbackMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteSessionFeedbackRequest, com.google.protobuf.Empty> getDeleteSessionFeedbackMethod;
    if ((getDeleteSessionFeedbackMethod = SessionsGrpc.getDeleteSessionFeedbackMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getDeleteSessionFeedbackMethod = SessionsGrpc.getDeleteSessionFeedbackMethod) == null) {
          SessionsGrpc.getDeleteSessionFeedbackMethod = getDeleteSessionFeedbackMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.DeleteSessionFeedbackRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSessionFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.DeleteSessionFeedbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("DeleteSessionFeedback"))
              .build();
        }
      }
    }
    return getDeleteSessionFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionFeedbackRequest,
      com.ondewo.nlu.ListSessionFeedbackResponse> getListSessionFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSessionFeedback",
      requestType = com.ondewo.nlu.ListSessionFeedbackRequest.class,
      responseType = com.ondewo.nlu.ListSessionFeedbackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionFeedbackRequest,
      com.ondewo.nlu.ListSessionFeedbackResponse> getListSessionFeedbackMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionFeedbackRequest, com.ondewo.nlu.ListSessionFeedbackResponse> getListSessionFeedbackMethod;
    if ((getListSessionFeedbackMethod = SessionsGrpc.getListSessionFeedbackMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListSessionFeedbackMethod = SessionsGrpc.getListSessionFeedbackMethod) == null) {
          SessionsGrpc.getListSessionFeedbackMethod = getListSessionFeedbackMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListSessionFeedbackRequest, com.ondewo.nlu.ListSessionFeedbackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSessionFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListSessionFeedbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListSessionFeedbackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListSessionFeedback"))
              .build();
        }
      }
    }
    return getListSessionFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionFeedbackOfAllSessionsRequest,
      com.ondewo.nlu.ListSessionFeedbackResponse> getListSessionFeedbackOfAllSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSessionFeedbackOfAllSessions",
      requestType = com.ondewo.nlu.ListSessionFeedbackOfAllSessionsRequest.class,
      responseType = com.ondewo.nlu.ListSessionFeedbackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionFeedbackOfAllSessionsRequest,
      com.ondewo.nlu.ListSessionFeedbackResponse> getListSessionFeedbackOfAllSessionsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionFeedbackOfAllSessionsRequest, com.ondewo.nlu.ListSessionFeedbackResponse> getListSessionFeedbackOfAllSessionsMethod;
    if ((getListSessionFeedbackOfAllSessionsMethod = SessionsGrpc.getListSessionFeedbackOfAllSessionsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListSessionFeedbackOfAllSessionsMethod = SessionsGrpc.getListSessionFeedbackOfAllSessionsMethod) == null) {
          SessionsGrpc.getListSessionFeedbackOfAllSessionsMethod = getListSessionFeedbackOfAllSessionsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListSessionFeedbackOfAllSessionsRequest, com.ondewo.nlu.ListSessionFeedbackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSessionFeedbackOfAllSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListSessionFeedbackOfAllSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListSessionFeedbackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListSessionFeedbackOfAllSessions"))
              .build();
        }
      }
    }
    return getListSessionFeedbackOfAllSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.GetFeedbackStatisticsRequest,
      com.ondewo.nlu.GetFeedbackStatisticsResponse> getGetFeedbackStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeedbackStatistics",
      requestType = com.ondewo.nlu.GetFeedbackStatisticsRequest.class,
      responseType = com.ondewo.nlu.GetFeedbackStatisticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.GetFeedbackStatisticsRequest,
      com.ondewo.nlu.GetFeedbackStatisticsResponse> getGetFeedbackStatisticsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.GetFeedbackStatisticsRequest, com.ondewo.nlu.GetFeedbackStatisticsResponse> getGetFeedbackStatisticsMethod;
    if ((getGetFeedbackStatisticsMethod = SessionsGrpc.getGetFeedbackStatisticsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getGetFeedbackStatisticsMethod = SessionsGrpc.getGetFeedbackStatisticsMethod) == null) {
          SessionsGrpc.getGetFeedbackStatisticsMethod = getGetFeedbackStatisticsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.GetFeedbackStatisticsRequest, com.ondewo.nlu.GetFeedbackStatisticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeedbackStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.GetFeedbackStatisticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.GetFeedbackStatisticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("GetFeedbackStatistics"))
              .build();
        }
      }
    }
    return getGetFeedbackStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesRequest,
      com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesResponse> getGetFeedbackStatisticsTimeSeriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeedbackStatisticsTimeSeries",
      requestType = com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesRequest.class,
      responseType = com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesRequest,
      com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesResponse> getGetFeedbackStatisticsTimeSeriesMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesRequest, com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesResponse> getGetFeedbackStatisticsTimeSeriesMethod;
    if ((getGetFeedbackStatisticsTimeSeriesMethod = SessionsGrpc.getGetFeedbackStatisticsTimeSeriesMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getGetFeedbackStatisticsTimeSeriesMethod = SessionsGrpc.getGetFeedbackStatisticsTimeSeriesMethod) == null) {
          SessionsGrpc.getGetFeedbackStatisticsTimeSeriesMethod = getGetFeedbackStatisticsTimeSeriesMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesRequest, com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeedbackStatisticsTimeSeries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("GetFeedbackStatisticsTimeSeries"))
              .build();
        }
      }
    }
    return getGetFeedbackStatisticsTimeSeriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionReviewsRequest,
      com.ondewo.nlu.ListSessionReviewsResponse> getListSessionReviewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSessionReviews",
      requestType = com.ondewo.nlu.ListSessionReviewsRequest.class,
      responseType = com.ondewo.nlu.ListSessionReviewsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionReviewsRequest,
      com.ondewo.nlu.ListSessionReviewsResponse> getListSessionReviewsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListSessionReviewsRequest, com.ondewo.nlu.ListSessionReviewsResponse> getListSessionReviewsMethod;
    if ((getListSessionReviewsMethod = SessionsGrpc.getListSessionReviewsMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListSessionReviewsMethod = SessionsGrpc.getListSessionReviewsMethod) == null) {
          SessionsGrpc.getListSessionReviewsMethod = getListSessionReviewsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListSessionReviewsRequest, com.ondewo.nlu.ListSessionReviewsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSessionReviews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListSessionReviewsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListSessionReviewsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListSessionReviews"))
              .build();
        }
      }
    }
    return getListSessionReviewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.GetSessionReviewRequest,
      com.ondewo.nlu.SessionReview> getGetSessionReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSessionReview",
      requestType = com.ondewo.nlu.GetSessionReviewRequest.class,
      responseType = com.ondewo.nlu.SessionReview.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.GetSessionReviewRequest,
      com.ondewo.nlu.SessionReview> getGetSessionReviewMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.GetSessionReviewRequest, com.ondewo.nlu.SessionReview> getGetSessionReviewMethod;
    if ((getGetSessionReviewMethod = SessionsGrpc.getGetSessionReviewMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getGetSessionReviewMethod = SessionsGrpc.getGetSessionReviewMethod) == null) {
          SessionsGrpc.getGetSessionReviewMethod = getGetSessionReviewMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.GetSessionReviewRequest, com.ondewo.nlu.SessionReview>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSessionReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.GetSessionReviewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.SessionReview.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("GetSessionReview"))
              .build();
        }
      }
    }
    return getGetSessionReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.GetLatestSessionReviewRequest,
      com.ondewo.nlu.SessionReview> getGetLatestSessionReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLatestSessionReview",
      requestType = com.ondewo.nlu.GetLatestSessionReviewRequest.class,
      responseType = com.ondewo.nlu.SessionReview.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.GetLatestSessionReviewRequest,
      com.ondewo.nlu.SessionReview> getGetLatestSessionReviewMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.GetLatestSessionReviewRequest, com.ondewo.nlu.SessionReview> getGetLatestSessionReviewMethod;
    if ((getGetLatestSessionReviewMethod = SessionsGrpc.getGetLatestSessionReviewMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getGetLatestSessionReviewMethod = SessionsGrpc.getGetLatestSessionReviewMethod) == null) {
          SessionsGrpc.getGetLatestSessionReviewMethod = getGetLatestSessionReviewMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.GetLatestSessionReviewRequest, com.ondewo.nlu.SessionReview>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLatestSessionReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.GetLatestSessionReviewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.SessionReview.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("GetLatestSessionReview"))
              .build();
        }
      }
    }
    return getGetLatestSessionReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.CreateSessionReviewRequest,
      com.ondewo.nlu.SessionReview> getCreateSessionReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSessionReview",
      requestType = com.ondewo.nlu.CreateSessionReviewRequest.class,
      responseType = com.ondewo.nlu.SessionReview.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.CreateSessionReviewRequest,
      com.ondewo.nlu.SessionReview> getCreateSessionReviewMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.CreateSessionReviewRequest, com.ondewo.nlu.SessionReview> getCreateSessionReviewMethod;
    if ((getCreateSessionReviewMethod = SessionsGrpc.getCreateSessionReviewMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getCreateSessionReviewMethod = SessionsGrpc.getCreateSessionReviewMethod) == null) {
          SessionsGrpc.getCreateSessionReviewMethod = getCreateSessionReviewMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.CreateSessionReviewRequest, com.ondewo.nlu.SessionReview>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSessionReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.CreateSessionReviewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.SessionReview.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("CreateSessionReview"))
              .build();
        }
      }
    }
    return getCreateSessionReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.GetAudioFilesRequest,
      com.ondewo.nlu.GetAudioFilesResponse> getGetAudioFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAudioFiles",
      requestType = com.ondewo.nlu.GetAudioFilesRequest.class,
      responseType = com.ondewo.nlu.GetAudioFilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.GetAudioFilesRequest,
      com.ondewo.nlu.GetAudioFilesResponse> getGetAudioFilesMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.GetAudioFilesRequest, com.ondewo.nlu.GetAudioFilesResponse> getGetAudioFilesMethod;
    if ((getGetAudioFilesMethod = SessionsGrpc.getGetAudioFilesMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getGetAudioFilesMethod = SessionsGrpc.getGetAudioFilesMethod) == null) {
          SessionsGrpc.getGetAudioFilesMethod = getGetAudioFilesMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.GetAudioFilesRequest, com.ondewo.nlu.GetAudioFilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAudioFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.GetAudioFilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.GetAudioFilesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("GetAudioFiles"))
              .build();
        }
      }
    }
    return getGetAudioFilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.AddAudioFilesRequest,
      com.ondewo.nlu.AddAudioFilesResponse> getAddAudioFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAudioFiles",
      requestType = com.ondewo.nlu.AddAudioFilesRequest.class,
      responseType = com.ondewo.nlu.AddAudioFilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.AddAudioFilesRequest,
      com.ondewo.nlu.AddAudioFilesResponse> getAddAudioFilesMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.AddAudioFilesRequest, com.ondewo.nlu.AddAudioFilesResponse> getAddAudioFilesMethod;
    if ((getAddAudioFilesMethod = SessionsGrpc.getAddAudioFilesMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getAddAudioFilesMethod = SessionsGrpc.getAddAudioFilesMethod) == null) {
          SessionsGrpc.getAddAudioFilesMethod = getAddAudioFilesMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.AddAudioFilesRequest, com.ondewo.nlu.AddAudioFilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAudioFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.AddAudioFilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.AddAudioFilesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("AddAudioFiles"))
              .build();
        }
      }
    }
    return getAddAudioFilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteAudioFilesRequest,
      com.ondewo.nlu.DeleteAudioFilesResponse> getDeleteAudioFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAudioFiles",
      requestType = com.ondewo.nlu.DeleteAudioFilesRequest.class,
      responseType = com.ondewo.nlu.DeleteAudioFilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteAudioFilesRequest,
      com.ondewo.nlu.DeleteAudioFilesResponse> getDeleteAudioFilesMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteAudioFilesRequest, com.ondewo.nlu.DeleteAudioFilesResponse> getDeleteAudioFilesMethod;
    if ((getDeleteAudioFilesMethod = SessionsGrpc.getDeleteAudioFilesMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getDeleteAudioFilesMethod = SessionsGrpc.getDeleteAudioFilesMethod) == null) {
          SessionsGrpc.getDeleteAudioFilesMethod = getDeleteAudioFilesMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.DeleteAudioFilesRequest, com.ondewo.nlu.DeleteAudioFilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAudioFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.DeleteAudioFilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.DeleteAudioFilesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("DeleteAudioFiles"))
              .build();
        }
      }
    }
    return getDeleteAudioFilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.GetAudioFileOfSessionRequest,
      com.ondewo.nlu.AudioFileResource> getGetAudioFileOfSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAudioFileOfSession",
      requestType = com.ondewo.nlu.GetAudioFileOfSessionRequest.class,
      responseType = com.ondewo.nlu.AudioFileResource.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.GetAudioFileOfSessionRequest,
      com.ondewo.nlu.AudioFileResource> getGetAudioFileOfSessionMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.GetAudioFileOfSessionRequest, com.ondewo.nlu.AudioFileResource> getGetAudioFileOfSessionMethod;
    if ((getGetAudioFileOfSessionMethod = SessionsGrpc.getGetAudioFileOfSessionMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getGetAudioFileOfSessionMethod = SessionsGrpc.getGetAudioFileOfSessionMethod) == null) {
          SessionsGrpc.getGetAudioFileOfSessionMethod = getGetAudioFileOfSessionMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.GetAudioFileOfSessionRequest, com.ondewo.nlu.AudioFileResource>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAudioFileOfSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.GetAudioFileOfSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.AudioFileResource.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("GetAudioFileOfSession"))
              .build();
        }
      }
    }
    return getGetAudioFileOfSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListAudioFilesRequest,
      com.ondewo.nlu.ListAudioFilesResponse> getListAudioFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAudioFiles",
      requestType = com.ondewo.nlu.ListAudioFilesRequest.class,
      responseType = com.ondewo.nlu.ListAudioFilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListAudioFilesRequest,
      com.ondewo.nlu.ListAudioFilesResponse> getListAudioFilesMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListAudioFilesRequest, com.ondewo.nlu.ListAudioFilesResponse> getListAudioFilesMethod;
    if ((getListAudioFilesMethod = SessionsGrpc.getListAudioFilesMethod) == null) {
      synchronized (SessionsGrpc.class) {
        if ((getListAudioFilesMethod = SessionsGrpc.getListAudioFilesMethod) == null) {
          SessionsGrpc.getListAudioFilesMethod = getListAudioFilesMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListAudioFilesRequest, com.ondewo.nlu.ListAudioFilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAudioFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListAudioFilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListAudioFilesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionsMethodDescriptorSupplier("ListAudioFiles"))
              .build();
        }
      }
    }
    return getListAudioFilesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SessionsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionsStub>() {
        @java.lang.Override
        public SessionsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionsStub(channel, callOptions);
        }
      };
    return SessionsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static SessionsBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionsBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionsBlockingV2Stub>() {
        @java.lang.Override
        public SessionsBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionsBlockingV2Stub(channel, callOptions);
        }
      };
    return SessionsBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SessionsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionsBlockingStub>() {
        @java.lang.Override
        public SessionsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionsBlockingStub(channel, callOptions);
        }
      };
    return SessionsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SessionsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionsFutureStub>() {
        @java.lang.Override
        public SessionsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionsFutureStub(channel, callOptions);
        }
      };
    return SessionsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A session represents an interaction with a user. You retrieve user input and pass it to the &lt;a href="index.html#ondewo.nlu.Sessions.DetectIntent"&gt;DetectIntent&lt;/a&gt; (or &lt;a href="index.html#ondewo.nlu.Sessions.StreamingDetectIntent"&gt;StreamingDetectIntent&lt;/a&gt;) method to determine user intent and respond.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Processes a natural language query and returns structured, actionable data
     * as a result. This method is not idempotent, because it may cause contexts
     * and session entity types to be updated, which in turn might affect
     * results of future queries.
     * </pre>
     */
    default void detectIntent(com.ondewo.nlu.DetectIntentRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.DetectIntentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetectIntentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Processes a natural language query in audio format in a streaming fashion
     * and returns structured, actionable data as a result. This method is only
     * available via the gRPC API (not REST).
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.ondewo.nlu.StreamingDetectIntentRequest> streamingDetectIntent(
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StreamingDetectIntentResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamingDetectIntentMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListSessions: returns list of sessions from ondewo-kb; by default returns only session IDs
     * </pre>
     */
    default void listSessions(com.ondewo.nlu.ListSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSession: returns a session(=conversation) from ondewo-kb
     * </pre>
     */
    default void getSession(com.ondewo.nlu.GetSessionRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateSession: creates and returns a session(=conversation) from ondewo-kb
     * </pre>
     */
    default void createSession(com.ondewo.nlu.CreateSessionRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateSessionStep: creates a new session step for a session
     * </pre>
     */
    default void createSessionStep(com.ondewo.nlu.CreateSessionStepRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionStep> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSessionStepMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSessionStep: gets an existing session step of a session
     * </pre>
     */
    default void getSessionStep(com.ondewo.nlu.GetSessionStepRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionStep> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSessionStepMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateSessionStep: updates an existing session step in a session
     * </pre>
     */
    default void updateSessionStep(com.ondewo.nlu.UpdateSessionStepRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionStep> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSessionStepMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteSessionStep: deletes an existing session step from the session
     * </pre>
     */
    default void deleteSessionStep(com.ondewo.nlu.DeleteSessionStepRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSessionStepMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteSession: delete a session(=conversation) from ondewo-kb (for testing only)
     * </pre>
     */
    default void deleteSession(com.ondewo.nlu.DeleteSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the list of labels attached to a single session.
     * </pre>
     */
    default void listSessionLabels(com.ondewo.nlu.ListSessionLabelsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionLabelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSessionLabelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of labels observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    default void listSessionLabelsOfAllSessions(com.ondewo.nlu.ListSessionLabelsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionLabelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSessionLabelsOfAllSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of language codes observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    default void listLanguageCodesOfAllSessions(com.ondewo.nlu.ListLanguageCodesOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListLanguageCodesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLanguageCodesOfAllSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of intents matched across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    default void listMatchedIntentsOfAllSessions(com.ondewo.nlu.ListMatchedIntentsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListMatchedIntentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMatchedIntentsOfAllSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of entity types recognised across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    default void listMatchedEntityTypesOfAllSessions(com.ondewo.nlu.ListMatchedEntityTypesOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListMatchedEntityTypesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMatchedEntityTypesOfAllSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;user_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    default void listUserIdsOfAllSessions(com.ondewo.nlu.ListUserIdsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListUserIdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUserIdsOfAllSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;identified_user_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    default void listIdentifiedUserIdsOfAllSessions(com.ondewo.nlu.ListIdentifiedUserIdsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListIdentifiedUserIdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListIdentifiedUserIdsOfAllSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of intent tags observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    default void listTagsOfAllSessions(com.ondewo.nlu.ListTagsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListTagsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTagsOfAllSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of input contexts observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    default void listInputContextsOfAllSessions(com.ondewo.nlu.ListInputContextsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListInputContextsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInputContextsOfAllSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of output contexts observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    default void listOutputContextsOfAllSessions(com.ondewo.nlu.ListOutputContextsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListOutputContextsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOutputContextsOfAllSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;Intent.Message.Platform&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    default void listPlatformsOfAllSessions(com.ondewo.nlu.ListPlatformsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListPlatformsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPlatformsOfAllSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;account_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    default void listAccountIdsOfAllSessions(com.ondewo.nlu.ListAccountIdsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListAccountIdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccountIdsOfAllSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;property_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    default void listPropertyIdsOfAllSessions(com.ondewo.nlu.ListPropertyIdsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListPropertyIdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPropertyIdsOfAllSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;datastream_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    default void listDatastreamIdsOfAllSessions(com.ondewo.nlu.ListDatastreamIdsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListDatastreamIdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDatastreamIdsOfAllSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;origin_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    default void listOriginIdsOfAllSessions(com.ondewo.nlu.ListOriginIdsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListOriginIdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOriginIdsOfAllSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Attaches the supplied labels to a session and returns the updated session.
     * </pre>
     */
    default void addSessionLabels(com.ondewo.nlu.AddSessionLabelsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSessionLabelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes the supplied labels from a session and returns the updated session.
     * </pre>
     */
    default void deleteSessionLabels(com.ondewo.nlu.DeleteSessionLabelsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSessionLabelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Appends a comment to a session and returns the persisted comment.
     * </pre>
     */
    default void addSessionComment(com.ondewo.nlu.AddSessionCommentRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Comment> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSessionCommentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes the comments named in the request from a session and returns the updated session.
     * </pre>
     */
    default void deleteSessionComments(com.ondewo.nlu.DeleteSessionCommentsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSessionCommentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an existing comment on a session and returns the updated session.
     * </pre>
     */
    default void updateSessionComments(com.ondewo.nlu.UpdateSessionCommentsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Session> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSessionCommentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the comments attached to a session with pagination support, optionally narrowed by resolved status.
     * </pre>
     */
    default void listSessionComments(com.ondewo.nlu.ListSessionCommentsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionCommentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSessionCommentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the comments attached to all sessions of the agent with pagination support,
     * optionally narrowed by a SessionFilter and by resolved status.
     * </pre>
     */
    default void listSessionCommentsOfAllSessions(com.ondewo.nlu.ListSessionCommentsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionCommentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSessionCommentsOfAllSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Records user feedback (thumbs up/down + optional comment + optional score/categorical value) about a
     * whole session and returns the persisted feedback. Works for authenticated reviewers/test users and,
     * where enabled, anonymous production end-users (webchat/webphone).
     * </pre>
     */
    default void addSessionFeedback(com.ondewo.nlu.AddSessionFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionFeedback> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSessionFeedbackMethod(), responseObserver);
    }

    /**
     * <pre>
     * Records user feedback about a single session step (turn), pinned to the exact response, and returns
     * the persisted feedback.
     * </pre>
     */
    default void addSessionStepFeedback(com.ondewo.nlu.AddSessionStepFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionFeedback> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSessionStepFeedbackMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a single session/step feedback by its resource name.
     * </pre>
     */
    default void getSessionFeedback(com.ondewo.nlu.GetSessionFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionFeedback> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSessionFeedbackMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an existing feedback (a user revising their thumbs / comment) and returns it.
     * </pre>
     */
    default void updateSessionFeedback(com.ondewo.nlu.UpdateSessionFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionFeedback> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSessionFeedbackMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a feedback (a user withdrawing their feedback).
     * </pre>
     */
    default void deleteSessionFeedback(com.ondewo.nlu.DeleteSessionFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSessionFeedbackMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all feedback (session-level and step-level) attached to a session with pagination support.
     * </pre>
     */
    default void listSessionFeedback(com.ondewo.nlu.ListSessionFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionFeedbackResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSessionFeedbackMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists feedback across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    default void listSessionFeedbackOfAllSessions(com.ondewo.nlu.ListSessionFeedbackOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionFeedbackResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSessionFeedbackOfAllSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns aggregated feedback statistics for an agent (thumbs up/down counts + breakdowns), optionally
     * rolling up existing session reviews and comments as additional quality signals.
     * </pre>
     */
    default void getFeedbackStatistics(com.ondewo.nlu.GetFeedbackStatisticsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.GetFeedbackStatisticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFeedbackStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns feedback statistics bucketed over time for trend charts.
     * </pre>
     */
    default void getFeedbackStatisticsTimeSeries(com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFeedbackStatisticsTimeSeriesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListSessionReviews:
     * returns list of session reviews from ondewo-kb; by default only returns session review IDs
     * </pre>
     */
    default void listSessionReviews(com.ondewo.nlu.ListSessionReviewsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionReviewsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSessionReviewsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSessionReview:
     * returns a session-review from ondewo-kb or computes the first review if none exists
     * </pre>
     */
    default void getSessionReview(com.ondewo.nlu.GetSessionReviewRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionReview> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSessionReviewMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLatestSessionReview:
     * returns a session-review from ondewo-kb or computes the first review if none exists
     * </pre>
     */
    default void getLatestSessionReview(com.ondewo.nlu.GetLatestSessionReviewRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionReview> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLatestSessionReviewMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateSessionReview:
     * persist a session review in ondewo-kb
     * as a side effect: also update training data in ondewo-cai
     * </pre>
     */
    default void createSessionReview(com.ondewo.nlu.CreateSessionReviewRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionReview> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSessionReviewMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC to get audio files based on specified criteria.
     * Retrieves information about audio files associated with specific sessions.
     * Returns a response containing details of the requested audio files.
     * </pre>
     */
    default void getAudioFiles(com.ondewo.nlu.GetAudioFilesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.GetAudioFilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAudioFilesMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC to add audio files to a session.
     * Adds new audio files to the specified session, providing details about each file.
     * Returns a response containing information about the added audio files.
     * </pre>
     */
    default void addAudioFiles(com.ondewo.nlu.AddAudioFilesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.AddAudioFilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAudioFilesMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC to delete specified audio files.
     * Deletes audio files associated with specific sessions based on unique identifiers.
     * Returns an empty response indicating the successful deletion of the specified audio files.
     * </pre>
     */
    default void deleteAudioFiles(com.ondewo.nlu.DeleteAudioFilesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.DeleteAudioFilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAudioFilesMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC to get a consolidated audio file for a specific session.
     * Retrieves a single audio file that combines all audio files associated with the specified session.
     * Returns details of the consolidated audio file.
     * </pre>
     */
    default void getAudioFileOfSession(com.ondewo.nlu.GetAudioFileOfSessionRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.AudioFileResource> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAudioFileOfSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC to get a list audio files for a specific session.
     * Retrieves a single audio file that combines all audio files associated with the specified session.
     * </pre>
     */
    default void listAudioFiles(com.ondewo.nlu.ListAudioFilesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListAudioFilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAudioFilesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Sessions.
   * <pre>
   * A session represents an interaction with a user. You retrieve user input and pass it to the &lt;a href="index.html#ondewo.nlu.Sessions.DetectIntent"&gt;DetectIntent&lt;/a&gt; (or &lt;a href="index.html#ondewo.nlu.Sessions.StreamingDetectIntent"&gt;StreamingDetectIntent&lt;/a&gt;) method to determine user intent and respond.
   * </pre>
   */
  public static abstract class SessionsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SessionsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Sessions.
   * <pre>
   * A session represents an interaction with a user. You retrieve user input and pass it to the &lt;a href="index.html#ondewo.nlu.Sessions.DetectIntent"&gt;DetectIntent&lt;/a&gt; (or &lt;a href="index.html#ondewo.nlu.Sessions.StreamingDetectIntent"&gt;StreamingDetectIntent&lt;/a&gt;) method to determine user intent and respond.
   * </pre>
   */
  public static final class SessionsStub
      extends io.grpc.stub.AbstractAsyncStub<SessionsStub> {
    private SessionsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes a natural language query and returns structured, actionable data
     * as a result. This method is not idempotent, because it may cause contexts
     * and session entity types to be updated, which in turn might affect
     * results of future queries.
     * </pre>
     */
    public void detectIntent(com.ondewo.nlu.DetectIntentRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.DetectIntentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetectIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Processes a natural language query in audio format in a streaming fashion
     * and returns structured, actionable data as a result. This method is only
     * available via the gRPC API (not REST).
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.ondewo.nlu.StreamingDetectIntentRequest> streamingDetectIntent(
        io.grpc.stub.StreamObserver<com.ondewo.nlu.StreamingDetectIntentResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamingDetectIntentMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * ListSessions: returns list of sessions from ondewo-kb; by default returns only session IDs
     * </pre>
     */
    public void listSessions(com.ondewo.nlu.ListSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSession: returns a session(=conversation) from ondewo-kb
     * </pre>
     */
    public void getSession(com.ondewo.nlu.GetSessionRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateSession: creates and returns a session(=conversation) from ondewo-kb
     * </pre>
     */
    public void createSession(com.ondewo.nlu.CreateSessionRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateSessionStep: creates a new session step for a session
     * </pre>
     */
    public void createSessionStep(com.ondewo.nlu.CreateSessionStepRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionStep> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSessionStepMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSessionStep: gets an existing session step of a session
     * </pre>
     */
    public void getSessionStep(com.ondewo.nlu.GetSessionStepRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionStep> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSessionStepMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateSessionStep: updates an existing session step in a session
     * </pre>
     */
    public void updateSessionStep(com.ondewo.nlu.UpdateSessionStepRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionStep> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSessionStepMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteSessionStep: deletes an existing session step from the session
     * </pre>
     */
    public void deleteSessionStep(com.ondewo.nlu.DeleteSessionStepRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSessionStepMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteSession: delete a session(=conversation) from ondewo-kb (for testing only)
     * </pre>
     */
    public void deleteSession(com.ondewo.nlu.DeleteSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of labels attached to a single session.
     * </pre>
     */
    public void listSessionLabels(com.ondewo.nlu.ListSessionLabelsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionLabelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSessionLabelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of labels observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public void listSessionLabelsOfAllSessions(com.ondewo.nlu.ListSessionLabelsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionLabelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSessionLabelsOfAllSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of language codes observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public void listLanguageCodesOfAllSessions(com.ondewo.nlu.ListLanguageCodesOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListLanguageCodesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLanguageCodesOfAllSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of intents matched across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public void listMatchedIntentsOfAllSessions(com.ondewo.nlu.ListMatchedIntentsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListMatchedIntentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMatchedIntentsOfAllSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of entity types recognised across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public void listMatchedEntityTypesOfAllSessions(com.ondewo.nlu.ListMatchedEntityTypesOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListMatchedEntityTypesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMatchedEntityTypesOfAllSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;user_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public void listUserIdsOfAllSessions(com.ondewo.nlu.ListUserIdsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListUserIdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUserIdsOfAllSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;identified_user_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public void listIdentifiedUserIdsOfAllSessions(com.ondewo.nlu.ListIdentifiedUserIdsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListIdentifiedUserIdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListIdentifiedUserIdsOfAllSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of intent tags observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public void listTagsOfAllSessions(com.ondewo.nlu.ListTagsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListTagsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTagsOfAllSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of input contexts observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public void listInputContextsOfAllSessions(com.ondewo.nlu.ListInputContextsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListInputContextsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInputContextsOfAllSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of output contexts observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public void listOutputContextsOfAllSessions(com.ondewo.nlu.ListOutputContextsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListOutputContextsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOutputContextsOfAllSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;Intent.Message.Platform&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public void listPlatformsOfAllSessions(com.ondewo.nlu.ListPlatformsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListPlatformsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPlatformsOfAllSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;account_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public void listAccountIdsOfAllSessions(com.ondewo.nlu.ListAccountIdsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListAccountIdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccountIdsOfAllSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;property_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public void listPropertyIdsOfAllSessions(com.ondewo.nlu.ListPropertyIdsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListPropertyIdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPropertyIdsOfAllSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;datastream_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public void listDatastreamIdsOfAllSessions(com.ondewo.nlu.ListDatastreamIdsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListDatastreamIdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDatastreamIdsOfAllSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;origin_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public void listOriginIdsOfAllSessions(com.ondewo.nlu.ListOriginIdsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListOriginIdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOriginIdsOfAllSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Attaches the supplied labels to a session and returns the updated session.
     * </pre>
     */
    public void addSessionLabels(com.ondewo.nlu.AddSessionLabelsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSessionLabelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes the supplied labels from a session and returns the updated session.
     * </pre>
     */
    public void deleteSessionLabels(com.ondewo.nlu.DeleteSessionLabelsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSessionLabelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Appends a comment to a session and returns the persisted comment.
     * </pre>
     */
    public void addSessionComment(com.ondewo.nlu.AddSessionCommentRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Comment> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSessionCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes the comments named in the request from a session and returns the updated session.
     * </pre>
     */
    public void deleteSessionComments(com.ondewo.nlu.DeleteSessionCommentsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSessionCommentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing comment on a session and returns the updated session.
     * </pre>
     */
    public void updateSessionComments(com.ondewo.nlu.UpdateSessionCommentsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Session> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSessionCommentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the comments attached to a session with pagination support, optionally narrowed by resolved status.
     * </pre>
     */
    public void listSessionComments(com.ondewo.nlu.ListSessionCommentsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionCommentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSessionCommentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the comments attached to all sessions of the agent with pagination support,
     * optionally narrowed by a SessionFilter and by resolved status.
     * </pre>
     */
    public void listSessionCommentsOfAllSessions(com.ondewo.nlu.ListSessionCommentsOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionCommentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSessionCommentsOfAllSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Records user feedback (thumbs up/down + optional comment + optional score/categorical value) about a
     * whole session and returns the persisted feedback. Works for authenticated reviewers/test users and,
     * where enabled, anonymous production end-users (webchat/webphone).
     * </pre>
     */
    public void addSessionFeedback(com.ondewo.nlu.AddSessionFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionFeedback> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSessionFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Records user feedback about a single session step (turn), pinned to the exact response, and returns
     * the persisted feedback.
     * </pre>
     */
    public void addSessionStepFeedback(com.ondewo.nlu.AddSessionStepFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionFeedback> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSessionStepFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a single session/step feedback by its resource name.
     * </pre>
     */
    public void getSessionFeedback(com.ondewo.nlu.GetSessionFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionFeedback> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSessionFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing feedback (a user revising their thumbs / comment) and returns it.
     * </pre>
     */
    public void updateSessionFeedback(com.ondewo.nlu.UpdateSessionFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionFeedback> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSessionFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a feedback (a user withdrawing their feedback).
     * </pre>
     */
    public void deleteSessionFeedback(com.ondewo.nlu.DeleteSessionFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSessionFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all feedback (session-level and step-level) attached to a session with pagination support.
     * </pre>
     */
    public void listSessionFeedback(com.ondewo.nlu.ListSessionFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionFeedbackResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSessionFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists feedback across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public void listSessionFeedbackOfAllSessions(com.ondewo.nlu.ListSessionFeedbackOfAllSessionsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionFeedbackResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSessionFeedbackOfAllSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns aggregated feedback statistics for an agent (thumbs up/down counts + breakdowns), optionally
     * rolling up existing session reviews and comments as additional quality signals.
     * </pre>
     */
    public void getFeedbackStatistics(com.ondewo.nlu.GetFeedbackStatisticsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.GetFeedbackStatisticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFeedbackStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns feedback statistics bucketed over time for trend charts.
     * </pre>
     */
    public void getFeedbackStatisticsTimeSeries(com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFeedbackStatisticsTimeSeriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListSessionReviews:
     * returns list of session reviews from ondewo-kb; by default only returns session review IDs
     * </pre>
     */
    public void listSessionReviews(com.ondewo.nlu.ListSessionReviewsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionReviewsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSessionReviewsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSessionReview:
     * returns a session-review from ondewo-kb or computes the first review if none exists
     * </pre>
     */
    public void getSessionReview(com.ondewo.nlu.GetSessionReviewRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionReview> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSessionReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLatestSessionReview:
     * returns a session-review from ondewo-kb or computes the first review if none exists
     * </pre>
     */
    public void getLatestSessionReview(com.ondewo.nlu.GetLatestSessionReviewRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionReview> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLatestSessionReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateSessionReview:
     * persist a session review in ondewo-kb
     * as a side effect: also update training data in ondewo-cai
     * </pre>
     */
    public void createSessionReview(com.ondewo.nlu.CreateSessionReviewRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionReview> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSessionReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC to get audio files based on specified criteria.
     * Retrieves information about audio files associated with specific sessions.
     * Returns a response containing details of the requested audio files.
     * </pre>
     */
    public void getAudioFiles(com.ondewo.nlu.GetAudioFilesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.GetAudioFilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAudioFilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC to add audio files to a session.
     * Adds new audio files to the specified session, providing details about each file.
     * Returns a response containing information about the added audio files.
     * </pre>
     */
    public void addAudioFiles(com.ondewo.nlu.AddAudioFilesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.AddAudioFilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAudioFilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC to delete specified audio files.
     * Deletes audio files associated with specific sessions based on unique identifiers.
     * Returns an empty response indicating the successful deletion of the specified audio files.
     * </pre>
     */
    public void deleteAudioFiles(com.ondewo.nlu.DeleteAudioFilesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.DeleteAudioFilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAudioFilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC to get a consolidated audio file for a specific session.
     * Retrieves a single audio file that combines all audio files associated with the specified session.
     * Returns details of the consolidated audio file.
     * </pre>
     */
    public void getAudioFileOfSession(com.ondewo.nlu.GetAudioFileOfSessionRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.AudioFileResource> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAudioFileOfSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC to get a list audio files for a specific session.
     * Retrieves a single audio file that combines all audio files associated with the specified session.
     * </pre>
     */
    public void listAudioFiles(com.ondewo.nlu.ListAudioFilesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListAudioFilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAudioFilesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Sessions.
   * <pre>
   * A session represents an interaction with a user. You retrieve user input and pass it to the &lt;a href="index.html#ondewo.nlu.Sessions.DetectIntent"&gt;DetectIntent&lt;/a&gt; (or &lt;a href="index.html#ondewo.nlu.Sessions.StreamingDetectIntent"&gt;StreamingDetectIntent&lt;/a&gt;) method to determine user intent and respond.
   * </pre>
   */
  public static final class SessionsBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<SessionsBlockingV2Stub> {
    private SessionsBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionsBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionsBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes a natural language query and returns structured, actionable data
     * as a result. This method is not idempotent, because it may cause contexts
     * and session entity types to be updated, which in turn might affect
     * results of future queries.
     * </pre>
     */
    public com.ondewo.nlu.DetectIntentResponse detectIntent(com.ondewo.nlu.DetectIntentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDetectIntentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Processes a natural language query in audio format in a streaming fashion
     * and returns structured, actionable data as a result. This method is only
     * available via the gRPC API (not REST).
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<com.ondewo.nlu.StreamingDetectIntentRequest, com.ondewo.nlu.StreamingDetectIntentResponse>
        streamingDetectIntent() {
      return io.grpc.stub.ClientCalls.blockingBidiStreamingCall(
          getChannel(), getStreamingDetectIntentMethod(), getCallOptions());
    }

    /**
     * <pre>
     * ListSessions: returns list of sessions from ondewo-kb; by default returns only session IDs
     * </pre>
     */
    public com.ondewo.nlu.ListSessionsResponse listSessions(com.ondewo.nlu.ListSessionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSession: returns a session(=conversation) from ondewo-kb
     * </pre>
     */
    public com.ondewo.nlu.Session getSession(com.ondewo.nlu.GetSessionRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateSession: creates and returns a session(=conversation) from ondewo-kb
     * </pre>
     */
    public com.ondewo.nlu.Session createSession(com.ondewo.nlu.CreateSessionRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateSessionStep: creates a new session step for a session
     * </pre>
     */
    public com.ondewo.nlu.SessionStep createSessionStep(com.ondewo.nlu.CreateSessionStepRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateSessionStepMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSessionStep: gets an existing session step of a session
     * </pre>
     */
    public com.ondewo.nlu.SessionStep getSessionStep(com.ondewo.nlu.GetSessionStepRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetSessionStepMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateSessionStep: updates an existing session step in a session
     * </pre>
     */
    public com.ondewo.nlu.SessionStep updateSessionStep(com.ondewo.nlu.UpdateSessionStepRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateSessionStepMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteSessionStep: deletes an existing session step from the session
     * </pre>
     */
    public com.google.protobuf.Empty deleteSessionStep(com.ondewo.nlu.DeleteSessionStepRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteSessionStepMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteSession: delete a session(=conversation) from ondewo-kb (for testing only)
     * </pre>
     */
    public com.google.protobuf.Empty deleteSession(com.ondewo.nlu.DeleteSessionRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of labels attached to a single session.
     * </pre>
     */
    public com.ondewo.nlu.ListSessionLabelsResponse listSessionLabels(com.ondewo.nlu.ListSessionLabelsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListSessionLabelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of labels observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListSessionLabelsResponse listSessionLabelsOfAllSessions(com.ondewo.nlu.ListSessionLabelsOfAllSessionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListSessionLabelsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of language codes observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListLanguageCodesResponse listLanguageCodesOfAllSessions(com.ondewo.nlu.ListLanguageCodesOfAllSessionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListLanguageCodesOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of intents matched across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListMatchedIntentsResponse listMatchedIntentsOfAllSessions(com.ondewo.nlu.ListMatchedIntentsOfAllSessionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListMatchedIntentsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of entity types recognised across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListMatchedEntityTypesResponse listMatchedEntityTypesOfAllSessions(com.ondewo.nlu.ListMatchedEntityTypesOfAllSessionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListMatchedEntityTypesOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;user_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListUserIdsResponse listUserIdsOfAllSessions(com.ondewo.nlu.ListUserIdsOfAllSessionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListUserIdsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;identified_user_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListIdentifiedUserIdsResponse listIdentifiedUserIdsOfAllSessions(com.ondewo.nlu.ListIdentifiedUserIdsOfAllSessionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListIdentifiedUserIdsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of intent tags observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListTagsResponse listTagsOfAllSessions(com.ondewo.nlu.ListTagsOfAllSessionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListTagsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of input contexts observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListInputContextsResponse listInputContextsOfAllSessions(com.ondewo.nlu.ListInputContextsOfAllSessionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListInputContextsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of output contexts observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListOutputContextsResponse listOutputContextsOfAllSessions(com.ondewo.nlu.ListOutputContextsOfAllSessionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListOutputContextsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;Intent.Message.Platform&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListPlatformsResponse listPlatformsOfAllSessions(com.ondewo.nlu.ListPlatformsOfAllSessionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListPlatformsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;account_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListAccountIdsResponse listAccountIdsOfAllSessions(com.ondewo.nlu.ListAccountIdsOfAllSessionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListAccountIdsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;property_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListPropertyIdsResponse listPropertyIdsOfAllSessions(com.ondewo.nlu.ListPropertyIdsOfAllSessionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListPropertyIdsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;datastream_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListDatastreamIdsResponse listDatastreamIdsOfAllSessions(com.ondewo.nlu.ListDatastreamIdsOfAllSessionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListDatastreamIdsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;origin_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListOriginIdsResponse listOriginIdsOfAllSessions(com.ondewo.nlu.ListOriginIdsOfAllSessionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListOriginIdsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Attaches the supplied labels to a session and returns the updated session.
     * </pre>
     */
    public com.ondewo.nlu.Session addSessionLabels(com.ondewo.nlu.AddSessionLabelsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getAddSessionLabelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes the supplied labels from a session and returns the updated session.
     * </pre>
     */
    public com.ondewo.nlu.Session deleteSessionLabels(com.ondewo.nlu.DeleteSessionLabelsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteSessionLabelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Appends a comment to a session and returns the persisted comment.
     * </pre>
     */
    public com.ondewo.nlu.Comment addSessionComment(com.ondewo.nlu.AddSessionCommentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getAddSessionCommentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes the comments named in the request from a session and returns the updated session.
     * </pre>
     */
    public com.ondewo.nlu.Session deleteSessionComments(com.ondewo.nlu.DeleteSessionCommentsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteSessionCommentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing comment on a session and returns the updated session.
     * </pre>
     */
    public com.ondewo.nlu.Session updateSessionComments(com.ondewo.nlu.UpdateSessionCommentsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateSessionCommentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the comments attached to a session with pagination support, optionally narrowed by resolved status.
     * </pre>
     */
    public com.ondewo.nlu.ListSessionCommentsResponse listSessionComments(com.ondewo.nlu.ListSessionCommentsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListSessionCommentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the comments attached to all sessions of the agent with pagination support,
     * optionally narrowed by a SessionFilter and by resolved status.
     * </pre>
     */
    public com.ondewo.nlu.ListSessionCommentsResponse listSessionCommentsOfAllSessions(com.ondewo.nlu.ListSessionCommentsOfAllSessionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListSessionCommentsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Records user feedback (thumbs up/down + optional comment + optional score/categorical value) about a
     * whole session and returns the persisted feedback. Works for authenticated reviewers/test users and,
     * where enabled, anonymous production end-users (webchat/webphone).
     * </pre>
     */
    public com.ondewo.nlu.SessionFeedback addSessionFeedback(com.ondewo.nlu.AddSessionFeedbackRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getAddSessionFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Records user feedback about a single session step (turn), pinned to the exact response, and returns
     * the persisted feedback.
     * </pre>
     */
    public com.ondewo.nlu.SessionFeedback addSessionStepFeedback(com.ondewo.nlu.AddSessionStepFeedbackRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getAddSessionStepFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a single session/step feedback by its resource name.
     * </pre>
     */
    public com.ondewo.nlu.SessionFeedback getSessionFeedback(com.ondewo.nlu.GetSessionFeedbackRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetSessionFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing feedback (a user revising their thumbs / comment) and returns it.
     * </pre>
     */
    public com.ondewo.nlu.SessionFeedback updateSessionFeedback(com.ondewo.nlu.UpdateSessionFeedbackRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateSessionFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a feedback (a user withdrawing their feedback).
     * </pre>
     */
    public com.google.protobuf.Empty deleteSessionFeedback(com.ondewo.nlu.DeleteSessionFeedbackRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteSessionFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all feedback (session-level and step-level) attached to a session with pagination support.
     * </pre>
     */
    public com.ondewo.nlu.ListSessionFeedbackResponse listSessionFeedback(com.ondewo.nlu.ListSessionFeedbackRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListSessionFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists feedback across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListSessionFeedbackResponse listSessionFeedbackOfAllSessions(com.ondewo.nlu.ListSessionFeedbackOfAllSessionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListSessionFeedbackOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns aggregated feedback statistics for an agent (thumbs up/down counts + breakdowns), optionally
     * rolling up existing session reviews and comments as additional quality signals.
     * </pre>
     */
    public com.ondewo.nlu.GetFeedbackStatisticsResponse getFeedbackStatistics(com.ondewo.nlu.GetFeedbackStatisticsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetFeedbackStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns feedback statistics bucketed over time for trend charts.
     * </pre>
     */
    public com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesResponse getFeedbackStatisticsTimeSeries(com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetFeedbackStatisticsTimeSeriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListSessionReviews:
     * returns list of session reviews from ondewo-kb; by default only returns session review IDs
     * </pre>
     */
    public com.ondewo.nlu.ListSessionReviewsResponse listSessionReviews(com.ondewo.nlu.ListSessionReviewsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListSessionReviewsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSessionReview:
     * returns a session-review from ondewo-kb or computes the first review if none exists
     * </pre>
     */
    public com.ondewo.nlu.SessionReview getSessionReview(com.ondewo.nlu.GetSessionReviewRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetSessionReviewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLatestSessionReview:
     * returns a session-review from ondewo-kb or computes the first review if none exists
     * </pre>
     */
    public com.ondewo.nlu.SessionReview getLatestSessionReview(com.ondewo.nlu.GetLatestSessionReviewRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetLatestSessionReviewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateSessionReview:
     * persist a session review in ondewo-kb
     * as a side effect: also update training data in ondewo-cai
     * </pre>
     */
    public com.ondewo.nlu.SessionReview createSessionReview(com.ondewo.nlu.CreateSessionReviewRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateSessionReviewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC to get audio files based on specified criteria.
     * Retrieves information about audio files associated with specific sessions.
     * Returns a response containing details of the requested audio files.
     * </pre>
     */
    public com.ondewo.nlu.GetAudioFilesResponse getAudioFiles(com.ondewo.nlu.GetAudioFilesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetAudioFilesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC to add audio files to a session.
     * Adds new audio files to the specified session, providing details about each file.
     * Returns a response containing information about the added audio files.
     * </pre>
     */
    public com.ondewo.nlu.AddAudioFilesResponse addAudioFiles(com.ondewo.nlu.AddAudioFilesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getAddAudioFilesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC to delete specified audio files.
     * Deletes audio files associated with specific sessions based on unique identifiers.
     * Returns an empty response indicating the successful deletion of the specified audio files.
     * </pre>
     */
    public com.ondewo.nlu.DeleteAudioFilesResponse deleteAudioFiles(com.ondewo.nlu.DeleteAudioFilesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteAudioFilesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC to get a consolidated audio file for a specific session.
     * Retrieves a single audio file that combines all audio files associated with the specified session.
     * Returns details of the consolidated audio file.
     * </pre>
     */
    public com.ondewo.nlu.AudioFileResource getAudioFileOfSession(com.ondewo.nlu.GetAudioFileOfSessionRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetAudioFileOfSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC to get a list audio files for a specific session.
     * Retrieves a single audio file that combines all audio files associated with the specified session.
     * </pre>
     */
    public com.ondewo.nlu.ListAudioFilesResponse listAudioFiles(com.ondewo.nlu.ListAudioFilesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListAudioFilesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Sessions.
   * <pre>
   * A session represents an interaction with a user. You retrieve user input and pass it to the &lt;a href="index.html#ondewo.nlu.Sessions.DetectIntent"&gt;DetectIntent&lt;/a&gt; (or &lt;a href="index.html#ondewo.nlu.Sessions.StreamingDetectIntent"&gt;StreamingDetectIntent&lt;/a&gt;) method to determine user intent and respond.
   * </pre>
   */
  public static final class SessionsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SessionsBlockingStub> {
    private SessionsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes a natural language query and returns structured, actionable data
     * as a result. This method is not idempotent, because it may cause contexts
     * and session entity types to be updated, which in turn might affect
     * results of future queries.
     * </pre>
     */
    public com.ondewo.nlu.DetectIntentResponse detectIntent(com.ondewo.nlu.DetectIntentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetectIntentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListSessions: returns list of sessions from ondewo-kb; by default returns only session IDs
     * </pre>
     */
    public com.ondewo.nlu.ListSessionsResponse listSessions(com.ondewo.nlu.ListSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSession: returns a session(=conversation) from ondewo-kb
     * </pre>
     */
    public com.ondewo.nlu.Session getSession(com.ondewo.nlu.GetSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateSession: creates and returns a session(=conversation) from ondewo-kb
     * </pre>
     */
    public com.ondewo.nlu.Session createSession(com.ondewo.nlu.CreateSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateSessionStep: creates a new session step for a session
     * </pre>
     */
    public com.ondewo.nlu.SessionStep createSessionStep(com.ondewo.nlu.CreateSessionStepRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSessionStepMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSessionStep: gets an existing session step of a session
     * </pre>
     */
    public com.ondewo.nlu.SessionStep getSessionStep(com.ondewo.nlu.GetSessionStepRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSessionStepMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateSessionStep: updates an existing session step in a session
     * </pre>
     */
    public com.ondewo.nlu.SessionStep updateSessionStep(com.ondewo.nlu.UpdateSessionStepRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSessionStepMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteSessionStep: deletes an existing session step from the session
     * </pre>
     */
    public com.google.protobuf.Empty deleteSessionStep(com.ondewo.nlu.DeleteSessionStepRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSessionStepMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteSession: delete a session(=conversation) from ondewo-kb (for testing only)
     * </pre>
     */
    public com.google.protobuf.Empty deleteSession(com.ondewo.nlu.DeleteSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of labels attached to a single session.
     * </pre>
     */
    public com.ondewo.nlu.ListSessionLabelsResponse listSessionLabels(com.ondewo.nlu.ListSessionLabelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSessionLabelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of labels observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListSessionLabelsResponse listSessionLabelsOfAllSessions(com.ondewo.nlu.ListSessionLabelsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSessionLabelsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of language codes observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListLanguageCodesResponse listLanguageCodesOfAllSessions(com.ondewo.nlu.ListLanguageCodesOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLanguageCodesOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of intents matched across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListMatchedIntentsResponse listMatchedIntentsOfAllSessions(com.ondewo.nlu.ListMatchedIntentsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMatchedIntentsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of entity types recognised across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListMatchedEntityTypesResponse listMatchedEntityTypesOfAllSessions(com.ondewo.nlu.ListMatchedEntityTypesOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMatchedEntityTypesOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;user_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListUserIdsResponse listUserIdsOfAllSessions(com.ondewo.nlu.ListUserIdsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUserIdsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;identified_user_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListIdentifiedUserIdsResponse listIdentifiedUserIdsOfAllSessions(com.ondewo.nlu.ListIdentifiedUserIdsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListIdentifiedUserIdsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of intent tags observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListTagsResponse listTagsOfAllSessions(com.ondewo.nlu.ListTagsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTagsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of input contexts observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListInputContextsResponse listInputContextsOfAllSessions(com.ondewo.nlu.ListInputContextsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInputContextsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of output contexts observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListOutputContextsResponse listOutputContextsOfAllSessions(com.ondewo.nlu.ListOutputContextsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOutputContextsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;Intent.Message.Platform&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListPlatformsResponse listPlatformsOfAllSessions(com.ondewo.nlu.ListPlatformsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPlatformsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;account_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListAccountIdsResponse listAccountIdsOfAllSessions(com.ondewo.nlu.ListAccountIdsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccountIdsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;property_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListPropertyIdsResponse listPropertyIdsOfAllSessions(com.ondewo.nlu.ListPropertyIdsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPropertyIdsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;datastream_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListDatastreamIdsResponse listDatastreamIdsOfAllSessions(com.ondewo.nlu.ListDatastreamIdsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDatastreamIdsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;origin_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListOriginIdsResponse listOriginIdsOfAllSessions(com.ondewo.nlu.ListOriginIdsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOriginIdsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Attaches the supplied labels to a session and returns the updated session.
     * </pre>
     */
    public com.ondewo.nlu.Session addSessionLabels(com.ondewo.nlu.AddSessionLabelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSessionLabelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes the supplied labels from a session and returns the updated session.
     * </pre>
     */
    public com.ondewo.nlu.Session deleteSessionLabels(com.ondewo.nlu.DeleteSessionLabelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSessionLabelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Appends a comment to a session and returns the persisted comment.
     * </pre>
     */
    public com.ondewo.nlu.Comment addSessionComment(com.ondewo.nlu.AddSessionCommentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSessionCommentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes the comments named in the request from a session and returns the updated session.
     * </pre>
     */
    public com.ondewo.nlu.Session deleteSessionComments(com.ondewo.nlu.DeleteSessionCommentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSessionCommentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing comment on a session and returns the updated session.
     * </pre>
     */
    public com.ondewo.nlu.Session updateSessionComments(com.ondewo.nlu.UpdateSessionCommentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSessionCommentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the comments attached to a session with pagination support, optionally narrowed by resolved status.
     * </pre>
     */
    public com.ondewo.nlu.ListSessionCommentsResponse listSessionComments(com.ondewo.nlu.ListSessionCommentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSessionCommentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the comments attached to all sessions of the agent with pagination support,
     * optionally narrowed by a SessionFilter and by resolved status.
     * </pre>
     */
    public com.ondewo.nlu.ListSessionCommentsResponse listSessionCommentsOfAllSessions(com.ondewo.nlu.ListSessionCommentsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSessionCommentsOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Records user feedback (thumbs up/down + optional comment + optional score/categorical value) about a
     * whole session and returns the persisted feedback. Works for authenticated reviewers/test users and,
     * where enabled, anonymous production end-users (webchat/webphone).
     * </pre>
     */
    public com.ondewo.nlu.SessionFeedback addSessionFeedback(com.ondewo.nlu.AddSessionFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSessionFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Records user feedback about a single session step (turn), pinned to the exact response, and returns
     * the persisted feedback.
     * </pre>
     */
    public com.ondewo.nlu.SessionFeedback addSessionStepFeedback(com.ondewo.nlu.AddSessionStepFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSessionStepFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a single session/step feedback by its resource name.
     * </pre>
     */
    public com.ondewo.nlu.SessionFeedback getSessionFeedback(com.ondewo.nlu.GetSessionFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSessionFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing feedback (a user revising their thumbs / comment) and returns it.
     * </pre>
     */
    public com.ondewo.nlu.SessionFeedback updateSessionFeedback(com.ondewo.nlu.UpdateSessionFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSessionFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a feedback (a user withdrawing their feedback).
     * </pre>
     */
    public com.google.protobuf.Empty deleteSessionFeedback(com.ondewo.nlu.DeleteSessionFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSessionFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all feedback (session-level and step-level) attached to a session with pagination support.
     * </pre>
     */
    public com.ondewo.nlu.ListSessionFeedbackResponse listSessionFeedback(com.ondewo.nlu.ListSessionFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSessionFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists feedback across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.ondewo.nlu.ListSessionFeedbackResponse listSessionFeedbackOfAllSessions(com.ondewo.nlu.ListSessionFeedbackOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSessionFeedbackOfAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns aggregated feedback statistics for an agent (thumbs up/down counts + breakdowns), optionally
     * rolling up existing session reviews and comments as additional quality signals.
     * </pre>
     */
    public com.ondewo.nlu.GetFeedbackStatisticsResponse getFeedbackStatistics(com.ondewo.nlu.GetFeedbackStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFeedbackStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns feedback statistics bucketed over time for trend charts.
     * </pre>
     */
    public com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesResponse getFeedbackStatisticsTimeSeries(com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFeedbackStatisticsTimeSeriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListSessionReviews:
     * returns list of session reviews from ondewo-kb; by default only returns session review IDs
     * </pre>
     */
    public com.ondewo.nlu.ListSessionReviewsResponse listSessionReviews(com.ondewo.nlu.ListSessionReviewsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSessionReviewsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSessionReview:
     * returns a session-review from ondewo-kb or computes the first review if none exists
     * </pre>
     */
    public com.ondewo.nlu.SessionReview getSessionReview(com.ondewo.nlu.GetSessionReviewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSessionReviewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLatestSessionReview:
     * returns a session-review from ondewo-kb or computes the first review if none exists
     * </pre>
     */
    public com.ondewo.nlu.SessionReview getLatestSessionReview(com.ondewo.nlu.GetLatestSessionReviewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLatestSessionReviewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateSessionReview:
     * persist a session review in ondewo-kb
     * as a side effect: also update training data in ondewo-cai
     * </pre>
     */
    public com.ondewo.nlu.SessionReview createSessionReview(com.ondewo.nlu.CreateSessionReviewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSessionReviewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC to get audio files based on specified criteria.
     * Retrieves information about audio files associated with specific sessions.
     * Returns a response containing details of the requested audio files.
     * </pre>
     */
    public com.ondewo.nlu.GetAudioFilesResponse getAudioFiles(com.ondewo.nlu.GetAudioFilesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAudioFilesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC to add audio files to a session.
     * Adds new audio files to the specified session, providing details about each file.
     * Returns a response containing information about the added audio files.
     * </pre>
     */
    public com.ondewo.nlu.AddAudioFilesResponse addAudioFiles(com.ondewo.nlu.AddAudioFilesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAudioFilesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC to delete specified audio files.
     * Deletes audio files associated with specific sessions based on unique identifiers.
     * Returns an empty response indicating the successful deletion of the specified audio files.
     * </pre>
     */
    public com.ondewo.nlu.DeleteAudioFilesResponse deleteAudioFiles(com.ondewo.nlu.DeleteAudioFilesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAudioFilesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC to get a consolidated audio file for a specific session.
     * Retrieves a single audio file that combines all audio files associated with the specified session.
     * Returns details of the consolidated audio file.
     * </pre>
     */
    public com.ondewo.nlu.AudioFileResource getAudioFileOfSession(com.ondewo.nlu.GetAudioFileOfSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAudioFileOfSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC to get a list audio files for a specific session.
     * Retrieves a single audio file that combines all audio files associated with the specified session.
     * </pre>
     */
    public com.ondewo.nlu.ListAudioFilesResponse listAudioFiles(com.ondewo.nlu.ListAudioFilesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAudioFilesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Sessions.
   * <pre>
   * A session represents an interaction with a user. You retrieve user input and pass it to the &lt;a href="index.html#ondewo.nlu.Sessions.DetectIntent"&gt;DetectIntent&lt;/a&gt; (or &lt;a href="index.html#ondewo.nlu.Sessions.StreamingDetectIntent"&gt;StreamingDetectIntent&lt;/a&gt;) method to determine user intent and respond.
   * </pre>
   */
  public static final class SessionsFutureStub
      extends io.grpc.stub.AbstractFutureStub<SessionsFutureStub> {
    private SessionsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes a natural language query and returns structured, actionable data
     * as a result. This method is not idempotent, because it may cause contexts
     * and session entity types to be updated, which in turn might affect
     * results of future queries.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.DetectIntentResponse> detectIntent(
        com.ondewo.nlu.DetectIntentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetectIntentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListSessions: returns list of sessions from ondewo-kb; by default returns only session IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListSessionsResponse> listSessions(
        com.ondewo.nlu.ListSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSession: returns a session(=conversation) from ondewo-kb
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.Session> getSession(
        com.ondewo.nlu.GetSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateSession: creates and returns a session(=conversation) from ondewo-kb
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.Session> createSession(
        com.ondewo.nlu.CreateSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateSessionStep: creates a new session step for a session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.SessionStep> createSessionStep(
        com.ondewo.nlu.CreateSessionStepRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSessionStepMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSessionStep: gets an existing session step of a session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.SessionStep> getSessionStep(
        com.ondewo.nlu.GetSessionStepRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSessionStepMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateSessionStep: updates an existing session step in a session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.SessionStep> updateSessionStep(
        com.ondewo.nlu.UpdateSessionStepRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSessionStepMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteSessionStep: deletes an existing session step from the session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSessionStep(
        com.ondewo.nlu.DeleteSessionStepRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSessionStepMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteSession: delete a session(=conversation) from ondewo-kb (for testing only)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSession(
        com.ondewo.nlu.DeleteSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of labels attached to a single session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListSessionLabelsResponse> listSessionLabels(
        com.ondewo.nlu.ListSessionLabelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSessionLabelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the distinct set of labels observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListSessionLabelsResponse> listSessionLabelsOfAllSessions(
        com.ondewo.nlu.ListSessionLabelsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSessionLabelsOfAllSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the distinct set of language codes observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListLanguageCodesResponse> listLanguageCodesOfAllSessions(
        com.ondewo.nlu.ListLanguageCodesOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLanguageCodesOfAllSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the distinct set of intents matched across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListMatchedIntentsResponse> listMatchedIntentsOfAllSessions(
        com.ondewo.nlu.ListMatchedIntentsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMatchedIntentsOfAllSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the distinct set of entity types recognised across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListMatchedEntityTypesResponse> listMatchedEntityTypesOfAllSessions(
        com.ondewo.nlu.ListMatchedEntityTypesOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMatchedEntityTypesOfAllSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;user_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListUserIdsResponse> listUserIdsOfAllSessions(
        com.ondewo.nlu.ListUserIdsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUserIdsOfAllSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;identified_user_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListIdentifiedUserIdsResponse> listIdentifiedUserIdsOfAllSessions(
        com.ondewo.nlu.ListIdentifiedUserIdsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListIdentifiedUserIdsOfAllSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the distinct set of intent tags observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListTagsResponse> listTagsOfAllSessions(
        com.ondewo.nlu.ListTagsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTagsOfAllSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the distinct set of input contexts observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListInputContextsResponse> listInputContextsOfAllSessions(
        com.ondewo.nlu.ListInputContextsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInputContextsOfAllSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the distinct set of output contexts observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListOutputContextsResponse> listOutputContextsOfAllSessions(
        com.ondewo.nlu.ListOutputContextsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOutputContextsOfAllSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;Intent.Message.Platform&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListPlatformsResponse> listPlatformsOfAllSessions(
        com.ondewo.nlu.ListPlatformsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPlatformsOfAllSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;account_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListAccountIdsResponse> listAccountIdsOfAllSessions(
        com.ondewo.nlu.ListAccountIdsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccountIdsOfAllSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;property_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListPropertyIdsResponse> listPropertyIdsOfAllSessions(
        com.ondewo.nlu.ListPropertyIdsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPropertyIdsOfAllSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;datastream_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListDatastreamIdsResponse> listDatastreamIdsOfAllSessions(
        com.ondewo.nlu.ListDatastreamIdsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDatastreamIdsOfAllSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the distinct set of &lt;code&gt;origin_id&lt;/code&gt; values observed across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListOriginIdsResponse> listOriginIdsOfAllSessions(
        com.ondewo.nlu.ListOriginIdsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOriginIdsOfAllSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Attaches the supplied labels to a session and returns the updated session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.Session> addSessionLabels(
        com.ondewo.nlu.AddSessionLabelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSessionLabelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes the supplied labels from a session and returns the updated session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.Session> deleteSessionLabels(
        com.ondewo.nlu.DeleteSessionLabelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSessionLabelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Appends a comment to a session and returns the persisted comment.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.Comment> addSessionComment(
        com.ondewo.nlu.AddSessionCommentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSessionCommentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes the comments named in the request from a session and returns the updated session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.Session> deleteSessionComments(
        com.ondewo.nlu.DeleteSessionCommentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSessionCommentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an existing comment on a session and returns the updated session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.Session> updateSessionComments(
        com.ondewo.nlu.UpdateSessionCommentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSessionCommentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the comments attached to a session with pagination support, optionally narrowed by resolved status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListSessionCommentsResponse> listSessionComments(
        com.ondewo.nlu.ListSessionCommentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSessionCommentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the comments attached to all sessions of the agent with pagination support,
     * optionally narrowed by a SessionFilter and by resolved status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListSessionCommentsResponse> listSessionCommentsOfAllSessions(
        com.ondewo.nlu.ListSessionCommentsOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSessionCommentsOfAllSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Records user feedback (thumbs up/down + optional comment + optional score/categorical value) about a
     * whole session and returns the persisted feedback. Works for authenticated reviewers/test users and,
     * where enabled, anonymous production end-users (webchat/webphone).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.SessionFeedback> addSessionFeedback(
        com.ondewo.nlu.AddSessionFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSessionFeedbackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Records user feedback about a single session step (turn), pinned to the exact response, and returns
     * the persisted feedback.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.SessionFeedback> addSessionStepFeedback(
        com.ondewo.nlu.AddSessionStepFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSessionStepFeedbackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a single session/step feedback by its resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.SessionFeedback> getSessionFeedback(
        com.ondewo.nlu.GetSessionFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSessionFeedbackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an existing feedback (a user revising their thumbs / comment) and returns it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.SessionFeedback> updateSessionFeedback(
        com.ondewo.nlu.UpdateSessionFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSessionFeedbackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a feedback (a user withdrawing their feedback).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSessionFeedback(
        com.ondewo.nlu.DeleteSessionFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSessionFeedbackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all feedback (session-level and step-level) attached to a session with pagination support.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListSessionFeedbackResponse> listSessionFeedback(
        com.ondewo.nlu.ListSessionFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSessionFeedbackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists feedback across all sessions of the agent, optionally narrowed by a SessionFilter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListSessionFeedbackResponse> listSessionFeedbackOfAllSessions(
        com.ondewo.nlu.ListSessionFeedbackOfAllSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSessionFeedbackOfAllSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns aggregated feedback statistics for an agent (thumbs up/down counts + breakdowns), optionally
     * rolling up existing session reviews and comments as additional quality signals.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.GetFeedbackStatisticsResponse> getFeedbackStatistics(
        com.ondewo.nlu.GetFeedbackStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFeedbackStatisticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns feedback statistics bucketed over time for trend charts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesResponse> getFeedbackStatisticsTimeSeries(
        com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFeedbackStatisticsTimeSeriesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListSessionReviews:
     * returns list of session reviews from ondewo-kb; by default only returns session review IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListSessionReviewsResponse> listSessionReviews(
        com.ondewo.nlu.ListSessionReviewsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSessionReviewsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSessionReview:
     * returns a session-review from ondewo-kb or computes the first review if none exists
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.SessionReview> getSessionReview(
        com.ondewo.nlu.GetSessionReviewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSessionReviewMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLatestSessionReview:
     * returns a session-review from ondewo-kb or computes the first review if none exists
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.SessionReview> getLatestSessionReview(
        com.ondewo.nlu.GetLatestSessionReviewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLatestSessionReviewMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateSessionReview:
     * persist a session review in ondewo-kb
     * as a side effect: also update training data in ondewo-cai
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.SessionReview> createSessionReview(
        com.ondewo.nlu.CreateSessionReviewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSessionReviewMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC to get audio files based on specified criteria.
     * Retrieves information about audio files associated with specific sessions.
     * Returns a response containing details of the requested audio files.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.GetAudioFilesResponse> getAudioFiles(
        com.ondewo.nlu.GetAudioFilesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAudioFilesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC to add audio files to a session.
     * Adds new audio files to the specified session, providing details about each file.
     * Returns a response containing information about the added audio files.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.AddAudioFilesResponse> addAudioFiles(
        com.ondewo.nlu.AddAudioFilesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAudioFilesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC to delete specified audio files.
     * Deletes audio files associated with specific sessions based on unique identifiers.
     * Returns an empty response indicating the successful deletion of the specified audio files.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.DeleteAudioFilesResponse> deleteAudioFiles(
        com.ondewo.nlu.DeleteAudioFilesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAudioFilesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC to get a consolidated audio file for a specific session.
     * Retrieves a single audio file that combines all audio files associated with the specified session.
     * Returns details of the consolidated audio file.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.AudioFileResource> getAudioFileOfSession(
        com.ondewo.nlu.GetAudioFileOfSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAudioFileOfSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC to get a list audio files for a specific session.
     * Retrieves a single audio file that combines all audio files associated with the specified session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListAudioFilesResponse> listAudioFiles(
        com.ondewo.nlu.ListAudioFilesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAudioFilesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DETECT_INTENT = 0;
  private static final int METHODID_LIST_SESSIONS = 1;
  private static final int METHODID_GET_SESSION = 2;
  private static final int METHODID_CREATE_SESSION = 3;
  private static final int METHODID_CREATE_SESSION_STEP = 4;
  private static final int METHODID_GET_SESSION_STEP = 5;
  private static final int METHODID_UPDATE_SESSION_STEP = 6;
  private static final int METHODID_DELETE_SESSION_STEP = 7;
  private static final int METHODID_DELETE_SESSION = 8;
  private static final int METHODID_LIST_SESSION_LABELS = 9;
  private static final int METHODID_LIST_SESSION_LABELS_OF_ALL_SESSIONS = 10;
  private static final int METHODID_LIST_LANGUAGE_CODES_OF_ALL_SESSIONS = 11;
  private static final int METHODID_LIST_MATCHED_INTENTS_OF_ALL_SESSIONS = 12;
  private static final int METHODID_LIST_MATCHED_ENTITY_TYPES_OF_ALL_SESSIONS = 13;
  private static final int METHODID_LIST_USER_IDS_OF_ALL_SESSIONS = 14;
  private static final int METHODID_LIST_IDENTIFIED_USER_IDS_OF_ALL_SESSIONS = 15;
  private static final int METHODID_LIST_TAGS_OF_ALL_SESSIONS = 16;
  private static final int METHODID_LIST_INPUT_CONTEXTS_OF_ALL_SESSIONS = 17;
  private static final int METHODID_LIST_OUTPUT_CONTEXTS_OF_ALL_SESSIONS = 18;
  private static final int METHODID_LIST_PLATFORMS_OF_ALL_SESSIONS = 19;
  private static final int METHODID_LIST_ACCOUNT_IDS_OF_ALL_SESSIONS = 20;
  private static final int METHODID_LIST_PROPERTY_IDS_OF_ALL_SESSIONS = 21;
  private static final int METHODID_LIST_DATASTREAM_IDS_OF_ALL_SESSIONS = 22;
  private static final int METHODID_LIST_ORIGIN_IDS_OF_ALL_SESSIONS = 23;
  private static final int METHODID_ADD_SESSION_LABELS = 24;
  private static final int METHODID_DELETE_SESSION_LABELS = 25;
  private static final int METHODID_ADD_SESSION_COMMENT = 26;
  private static final int METHODID_DELETE_SESSION_COMMENTS = 27;
  private static final int METHODID_UPDATE_SESSION_COMMENTS = 28;
  private static final int METHODID_LIST_SESSION_COMMENTS = 29;
  private static final int METHODID_LIST_SESSION_COMMENTS_OF_ALL_SESSIONS = 30;
  private static final int METHODID_ADD_SESSION_FEEDBACK = 31;
  private static final int METHODID_ADD_SESSION_STEP_FEEDBACK = 32;
  private static final int METHODID_GET_SESSION_FEEDBACK = 33;
  private static final int METHODID_UPDATE_SESSION_FEEDBACK = 34;
  private static final int METHODID_DELETE_SESSION_FEEDBACK = 35;
  private static final int METHODID_LIST_SESSION_FEEDBACK = 36;
  private static final int METHODID_LIST_SESSION_FEEDBACK_OF_ALL_SESSIONS = 37;
  private static final int METHODID_GET_FEEDBACK_STATISTICS = 38;
  private static final int METHODID_GET_FEEDBACK_STATISTICS_TIME_SERIES = 39;
  private static final int METHODID_LIST_SESSION_REVIEWS = 40;
  private static final int METHODID_GET_SESSION_REVIEW = 41;
  private static final int METHODID_GET_LATEST_SESSION_REVIEW = 42;
  private static final int METHODID_CREATE_SESSION_REVIEW = 43;
  private static final int METHODID_GET_AUDIO_FILES = 44;
  private static final int METHODID_ADD_AUDIO_FILES = 45;
  private static final int METHODID_DELETE_AUDIO_FILES = 46;
  private static final int METHODID_GET_AUDIO_FILE_OF_SESSION = 47;
  private static final int METHODID_LIST_AUDIO_FILES = 48;
  private static final int METHODID_STREAMING_DETECT_INTENT = 49;

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
        case METHODID_DETECT_INTENT:
          serviceImpl.detectIntent((com.ondewo.nlu.DetectIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.DetectIntentResponse>) responseObserver);
          break;
        case METHODID_LIST_SESSIONS:
          serviceImpl.listSessions((com.ondewo.nlu.ListSessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionsResponse>) responseObserver);
          break;
        case METHODID_GET_SESSION:
          serviceImpl.getSession((com.ondewo.nlu.GetSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.Session>) responseObserver);
          break;
        case METHODID_CREATE_SESSION:
          serviceImpl.createSession((com.ondewo.nlu.CreateSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.Session>) responseObserver);
          break;
        case METHODID_CREATE_SESSION_STEP:
          serviceImpl.createSessionStep((com.ondewo.nlu.CreateSessionStepRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionStep>) responseObserver);
          break;
        case METHODID_GET_SESSION_STEP:
          serviceImpl.getSessionStep((com.ondewo.nlu.GetSessionStepRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionStep>) responseObserver);
          break;
        case METHODID_UPDATE_SESSION_STEP:
          serviceImpl.updateSessionStep((com.ondewo.nlu.UpdateSessionStepRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionStep>) responseObserver);
          break;
        case METHODID_DELETE_SESSION_STEP:
          serviceImpl.deleteSessionStep((com.ondewo.nlu.DeleteSessionStepRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_SESSION:
          serviceImpl.deleteSession((com.ondewo.nlu.DeleteSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_SESSION_LABELS:
          serviceImpl.listSessionLabels((com.ondewo.nlu.ListSessionLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionLabelsResponse>) responseObserver);
          break;
        case METHODID_LIST_SESSION_LABELS_OF_ALL_SESSIONS:
          serviceImpl.listSessionLabelsOfAllSessions((com.ondewo.nlu.ListSessionLabelsOfAllSessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionLabelsResponse>) responseObserver);
          break;
        case METHODID_LIST_LANGUAGE_CODES_OF_ALL_SESSIONS:
          serviceImpl.listLanguageCodesOfAllSessions((com.ondewo.nlu.ListLanguageCodesOfAllSessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListLanguageCodesResponse>) responseObserver);
          break;
        case METHODID_LIST_MATCHED_INTENTS_OF_ALL_SESSIONS:
          serviceImpl.listMatchedIntentsOfAllSessions((com.ondewo.nlu.ListMatchedIntentsOfAllSessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListMatchedIntentsResponse>) responseObserver);
          break;
        case METHODID_LIST_MATCHED_ENTITY_TYPES_OF_ALL_SESSIONS:
          serviceImpl.listMatchedEntityTypesOfAllSessions((com.ondewo.nlu.ListMatchedEntityTypesOfAllSessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListMatchedEntityTypesResponse>) responseObserver);
          break;
        case METHODID_LIST_USER_IDS_OF_ALL_SESSIONS:
          serviceImpl.listUserIdsOfAllSessions((com.ondewo.nlu.ListUserIdsOfAllSessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListUserIdsResponse>) responseObserver);
          break;
        case METHODID_LIST_IDENTIFIED_USER_IDS_OF_ALL_SESSIONS:
          serviceImpl.listIdentifiedUserIdsOfAllSessions((com.ondewo.nlu.ListIdentifiedUserIdsOfAllSessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListIdentifiedUserIdsResponse>) responseObserver);
          break;
        case METHODID_LIST_TAGS_OF_ALL_SESSIONS:
          serviceImpl.listTagsOfAllSessions((com.ondewo.nlu.ListTagsOfAllSessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListTagsResponse>) responseObserver);
          break;
        case METHODID_LIST_INPUT_CONTEXTS_OF_ALL_SESSIONS:
          serviceImpl.listInputContextsOfAllSessions((com.ondewo.nlu.ListInputContextsOfAllSessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListInputContextsResponse>) responseObserver);
          break;
        case METHODID_LIST_OUTPUT_CONTEXTS_OF_ALL_SESSIONS:
          serviceImpl.listOutputContextsOfAllSessions((com.ondewo.nlu.ListOutputContextsOfAllSessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListOutputContextsResponse>) responseObserver);
          break;
        case METHODID_LIST_PLATFORMS_OF_ALL_SESSIONS:
          serviceImpl.listPlatformsOfAllSessions((com.ondewo.nlu.ListPlatformsOfAllSessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListPlatformsResponse>) responseObserver);
          break;
        case METHODID_LIST_ACCOUNT_IDS_OF_ALL_SESSIONS:
          serviceImpl.listAccountIdsOfAllSessions((com.ondewo.nlu.ListAccountIdsOfAllSessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListAccountIdsResponse>) responseObserver);
          break;
        case METHODID_LIST_PROPERTY_IDS_OF_ALL_SESSIONS:
          serviceImpl.listPropertyIdsOfAllSessions((com.ondewo.nlu.ListPropertyIdsOfAllSessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListPropertyIdsResponse>) responseObserver);
          break;
        case METHODID_LIST_DATASTREAM_IDS_OF_ALL_SESSIONS:
          serviceImpl.listDatastreamIdsOfAllSessions((com.ondewo.nlu.ListDatastreamIdsOfAllSessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListDatastreamIdsResponse>) responseObserver);
          break;
        case METHODID_LIST_ORIGIN_IDS_OF_ALL_SESSIONS:
          serviceImpl.listOriginIdsOfAllSessions((com.ondewo.nlu.ListOriginIdsOfAllSessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListOriginIdsResponse>) responseObserver);
          break;
        case METHODID_ADD_SESSION_LABELS:
          serviceImpl.addSessionLabels((com.ondewo.nlu.AddSessionLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.Session>) responseObserver);
          break;
        case METHODID_DELETE_SESSION_LABELS:
          serviceImpl.deleteSessionLabels((com.ondewo.nlu.DeleteSessionLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.Session>) responseObserver);
          break;
        case METHODID_ADD_SESSION_COMMENT:
          serviceImpl.addSessionComment((com.ondewo.nlu.AddSessionCommentRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.Comment>) responseObserver);
          break;
        case METHODID_DELETE_SESSION_COMMENTS:
          serviceImpl.deleteSessionComments((com.ondewo.nlu.DeleteSessionCommentsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.Session>) responseObserver);
          break;
        case METHODID_UPDATE_SESSION_COMMENTS:
          serviceImpl.updateSessionComments((com.ondewo.nlu.UpdateSessionCommentsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.Session>) responseObserver);
          break;
        case METHODID_LIST_SESSION_COMMENTS:
          serviceImpl.listSessionComments((com.ondewo.nlu.ListSessionCommentsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionCommentsResponse>) responseObserver);
          break;
        case METHODID_LIST_SESSION_COMMENTS_OF_ALL_SESSIONS:
          serviceImpl.listSessionCommentsOfAllSessions((com.ondewo.nlu.ListSessionCommentsOfAllSessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionCommentsResponse>) responseObserver);
          break;
        case METHODID_ADD_SESSION_FEEDBACK:
          serviceImpl.addSessionFeedback((com.ondewo.nlu.AddSessionFeedbackRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionFeedback>) responseObserver);
          break;
        case METHODID_ADD_SESSION_STEP_FEEDBACK:
          serviceImpl.addSessionStepFeedback((com.ondewo.nlu.AddSessionStepFeedbackRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionFeedback>) responseObserver);
          break;
        case METHODID_GET_SESSION_FEEDBACK:
          serviceImpl.getSessionFeedback((com.ondewo.nlu.GetSessionFeedbackRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionFeedback>) responseObserver);
          break;
        case METHODID_UPDATE_SESSION_FEEDBACK:
          serviceImpl.updateSessionFeedback((com.ondewo.nlu.UpdateSessionFeedbackRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionFeedback>) responseObserver);
          break;
        case METHODID_DELETE_SESSION_FEEDBACK:
          serviceImpl.deleteSessionFeedback((com.ondewo.nlu.DeleteSessionFeedbackRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_SESSION_FEEDBACK:
          serviceImpl.listSessionFeedback((com.ondewo.nlu.ListSessionFeedbackRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionFeedbackResponse>) responseObserver);
          break;
        case METHODID_LIST_SESSION_FEEDBACK_OF_ALL_SESSIONS:
          serviceImpl.listSessionFeedbackOfAllSessions((com.ondewo.nlu.ListSessionFeedbackOfAllSessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionFeedbackResponse>) responseObserver);
          break;
        case METHODID_GET_FEEDBACK_STATISTICS:
          serviceImpl.getFeedbackStatistics((com.ondewo.nlu.GetFeedbackStatisticsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.GetFeedbackStatisticsResponse>) responseObserver);
          break;
        case METHODID_GET_FEEDBACK_STATISTICS_TIME_SERIES:
          serviceImpl.getFeedbackStatisticsTimeSeries((com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesResponse>) responseObserver);
          break;
        case METHODID_LIST_SESSION_REVIEWS:
          serviceImpl.listSessionReviews((com.ondewo.nlu.ListSessionReviewsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListSessionReviewsResponse>) responseObserver);
          break;
        case METHODID_GET_SESSION_REVIEW:
          serviceImpl.getSessionReview((com.ondewo.nlu.GetSessionReviewRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionReview>) responseObserver);
          break;
        case METHODID_GET_LATEST_SESSION_REVIEW:
          serviceImpl.getLatestSessionReview((com.ondewo.nlu.GetLatestSessionReviewRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionReview>) responseObserver);
          break;
        case METHODID_CREATE_SESSION_REVIEW:
          serviceImpl.createSessionReview((com.ondewo.nlu.CreateSessionReviewRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.SessionReview>) responseObserver);
          break;
        case METHODID_GET_AUDIO_FILES:
          serviceImpl.getAudioFiles((com.ondewo.nlu.GetAudioFilesRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.GetAudioFilesResponse>) responseObserver);
          break;
        case METHODID_ADD_AUDIO_FILES:
          serviceImpl.addAudioFiles((com.ondewo.nlu.AddAudioFilesRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.AddAudioFilesResponse>) responseObserver);
          break;
        case METHODID_DELETE_AUDIO_FILES:
          serviceImpl.deleteAudioFiles((com.ondewo.nlu.DeleteAudioFilesRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.DeleteAudioFilesResponse>) responseObserver);
          break;
        case METHODID_GET_AUDIO_FILE_OF_SESSION:
          serviceImpl.getAudioFileOfSession((com.ondewo.nlu.GetAudioFileOfSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.AudioFileResource>) responseObserver);
          break;
        case METHODID_LIST_AUDIO_FILES:
          serviceImpl.listAudioFiles((com.ondewo.nlu.ListAudioFilesRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListAudioFilesResponse>) responseObserver);
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
        case METHODID_STREAMING_DETECT_INTENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamingDetectIntent(
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.StreamingDetectIntentResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getDetectIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.DetectIntentRequest,
              com.ondewo.nlu.DetectIntentResponse>(
                service, METHODID_DETECT_INTENT)))
        .addMethod(
          getStreamingDetectIntentMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.ondewo.nlu.StreamingDetectIntentRequest,
              com.ondewo.nlu.StreamingDetectIntentResponse>(
                service, METHODID_STREAMING_DETECT_INTENT)))
        .addMethod(
          getListSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListSessionsRequest,
              com.ondewo.nlu.ListSessionsResponse>(
                service, METHODID_LIST_SESSIONS)))
        .addMethod(
          getGetSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.GetSessionRequest,
              com.ondewo.nlu.Session>(
                service, METHODID_GET_SESSION)))
        .addMethod(
          getCreateSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.CreateSessionRequest,
              com.ondewo.nlu.Session>(
                service, METHODID_CREATE_SESSION)))
        .addMethod(
          getCreateSessionStepMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.CreateSessionStepRequest,
              com.ondewo.nlu.SessionStep>(
                service, METHODID_CREATE_SESSION_STEP)))
        .addMethod(
          getGetSessionStepMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.GetSessionStepRequest,
              com.ondewo.nlu.SessionStep>(
                service, METHODID_GET_SESSION_STEP)))
        .addMethod(
          getUpdateSessionStepMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.UpdateSessionStepRequest,
              com.ondewo.nlu.SessionStep>(
                service, METHODID_UPDATE_SESSION_STEP)))
        .addMethod(
          getDeleteSessionStepMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.DeleteSessionStepRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_SESSION_STEP)))
        .addMethod(
          getDeleteSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.DeleteSessionRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_SESSION)))
        .addMethod(
          getListSessionLabelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListSessionLabelsRequest,
              com.ondewo.nlu.ListSessionLabelsResponse>(
                service, METHODID_LIST_SESSION_LABELS)))
        .addMethod(
          getListSessionLabelsOfAllSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListSessionLabelsOfAllSessionsRequest,
              com.ondewo.nlu.ListSessionLabelsResponse>(
                service, METHODID_LIST_SESSION_LABELS_OF_ALL_SESSIONS)))
        .addMethod(
          getListLanguageCodesOfAllSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListLanguageCodesOfAllSessionsRequest,
              com.ondewo.nlu.ListLanguageCodesResponse>(
                service, METHODID_LIST_LANGUAGE_CODES_OF_ALL_SESSIONS)))
        .addMethod(
          getListMatchedIntentsOfAllSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListMatchedIntentsOfAllSessionsRequest,
              com.ondewo.nlu.ListMatchedIntentsResponse>(
                service, METHODID_LIST_MATCHED_INTENTS_OF_ALL_SESSIONS)))
        .addMethod(
          getListMatchedEntityTypesOfAllSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListMatchedEntityTypesOfAllSessionsRequest,
              com.ondewo.nlu.ListMatchedEntityTypesResponse>(
                service, METHODID_LIST_MATCHED_ENTITY_TYPES_OF_ALL_SESSIONS)))
        .addMethod(
          getListUserIdsOfAllSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListUserIdsOfAllSessionsRequest,
              com.ondewo.nlu.ListUserIdsResponse>(
                service, METHODID_LIST_USER_IDS_OF_ALL_SESSIONS)))
        .addMethod(
          getListIdentifiedUserIdsOfAllSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListIdentifiedUserIdsOfAllSessionsRequest,
              com.ondewo.nlu.ListIdentifiedUserIdsResponse>(
                service, METHODID_LIST_IDENTIFIED_USER_IDS_OF_ALL_SESSIONS)))
        .addMethod(
          getListTagsOfAllSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListTagsOfAllSessionsRequest,
              com.ondewo.nlu.ListTagsResponse>(
                service, METHODID_LIST_TAGS_OF_ALL_SESSIONS)))
        .addMethod(
          getListInputContextsOfAllSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListInputContextsOfAllSessionsRequest,
              com.ondewo.nlu.ListInputContextsResponse>(
                service, METHODID_LIST_INPUT_CONTEXTS_OF_ALL_SESSIONS)))
        .addMethod(
          getListOutputContextsOfAllSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListOutputContextsOfAllSessionsRequest,
              com.ondewo.nlu.ListOutputContextsResponse>(
                service, METHODID_LIST_OUTPUT_CONTEXTS_OF_ALL_SESSIONS)))
        .addMethod(
          getListPlatformsOfAllSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListPlatformsOfAllSessionsRequest,
              com.ondewo.nlu.ListPlatformsResponse>(
                service, METHODID_LIST_PLATFORMS_OF_ALL_SESSIONS)))
        .addMethod(
          getListAccountIdsOfAllSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListAccountIdsOfAllSessionsRequest,
              com.ondewo.nlu.ListAccountIdsResponse>(
                service, METHODID_LIST_ACCOUNT_IDS_OF_ALL_SESSIONS)))
        .addMethod(
          getListPropertyIdsOfAllSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListPropertyIdsOfAllSessionsRequest,
              com.ondewo.nlu.ListPropertyIdsResponse>(
                service, METHODID_LIST_PROPERTY_IDS_OF_ALL_SESSIONS)))
        .addMethod(
          getListDatastreamIdsOfAllSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListDatastreamIdsOfAllSessionsRequest,
              com.ondewo.nlu.ListDatastreamIdsResponse>(
                service, METHODID_LIST_DATASTREAM_IDS_OF_ALL_SESSIONS)))
        .addMethod(
          getListOriginIdsOfAllSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListOriginIdsOfAllSessionsRequest,
              com.ondewo.nlu.ListOriginIdsResponse>(
                service, METHODID_LIST_ORIGIN_IDS_OF_ALL_SESSIONS)))
        .addMethod(
          getAddSessionLabelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.AddSessionLabelsRequest,
              com.ondewo.nlu.Session>(
                service, METHODID_ADD_SESSION_LABELS)))
        .addMethod(
          getDeleteSessionLabelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.DeleteSessionLabelsRequest,
              com.ondewo.nlu.Session>(
                service, METHODID_DELETE_SESSION_LABELS)))
        .addMethod(
          getAddSessionCommentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.AddSessionCommentRequest,
              com.ondewo.nlu.Comment>(
                service, METHODID_ADD_SESSION_COMMENT)))
        .addMethod(
          getDeleteSessionCommentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.DeleteSessionCommentsRequest,
              com.ondewo.nlu.Session>(
                service, METHODID_DELETE_SESSION_COMMENTS)))
        .addMethod(
          getUpdateSessionCommentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.UpdateSessionCommentsRequest,
              com.ondewo.nlu.Session>(
                service, METHODID_UPDATE_SESSION_COMMENTS)))
        .addMethod(
          getListSessionCommentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListSessionCommentsRequest,
              com.ondewo.nlu.ListSessionCommentsResponse>(
                service, METHODID_LIST_SESSION_COMMENTS)))
        .addMethod(
          getListSessionCommentsOfAllSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListSessionCommentsOfAllSessionsRequest,
              com.ondewo.nlu.ListSessionCommentsResponse>(
                service, METHODID_LIST_SESSION_COMMENTS_OF_ALL_SESSIONS)))
        .addMethod(
          getAddSessionFeedbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.AddSessionFeedbackRequest,
              com.ondewo.nlu.SessionFeedback>(
                service, METHODID_ADD_SESSION_FEEDBACK)))
        .addMethod(
          getAddSessionStepFeedbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.AddSessionStepFeedbackRequest,
              com.ondewo.nlu.SessionFeedback>(
                service, METHODID_ADD_SESSION_STEP_FEEDBACK)))
        .addMethod(
          getGetSessionFeedbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.GetSessionFeedbackRequest,
              com.ondewo.nlu.SessionFeedback>(
                service, METHODID_GET_SESSION_FEEDBACK)))
        .addMethod(
          getUpdateSessionFeedbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.UpdateSessionFeedbackRequest,
              com.ondewo.nlu.SessionFeedback>(
                service, METHODID_UPDATE_SESSION_FEEDBACK)))
        .addMethod(
          getDeleteSessionFeedbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.DeleteSessionFeedbackRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_SESSION_FEEDBACK)))
        .addMethod(
          getListSessionFeedbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListSessionFeedbackRequest,
              com.ondewo.nlu.ListSessionFeedbackResponse>(
                service, METHODID_LIST_SESSION_FEEDBACK)))
        .addMethod(
          getListSessionFeedbackOfAllSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListSessionFeedbackOfAllSessionsRequest,
              com.ondewo.nlu.ListSessionFeedbackResponse>(
                service, METHODID_LIST_SESSION_FEEDBACK_OF_ALL_SESSIONS)))
        .addMethod(
          getGetFeedbackStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.GetFeedbackStatisticsRequest,
              com.ondewo.nlu.GetFeedbackStatisticsResponse>(
                service, METHODID_GET_FEEDBACK_STATISTICS)))
        .addMethod(
          getGetFeedbackStatisticsTimeSeriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesRequest,
              com.ondewo.nlu.GetFeedbackStatisticsTimeSeriesResponse>(
                service, METHODID_GET_FEEDBACK_STATISTICS_TIME_SERIES)))
        .addMethod(
          getListSessionReviewsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListSessionReviewsRequest,
              com.ondewo.nlu.ListSessionReviewsResponse>(
                service, METHODID_LIST_SESSION_REVIEWS)))
        .addMethod(
          getGetSessionReviewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.GetSessionReviewRequest,
              com.ondewo.nlu.SessionReview>(
                service, METHODID_GET_SESSION_REVIEW)))
        .addMethod(
          getGetLatestSessionReviewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.GetLatestSessionReviewRequest,
              com.ondewo.nlu.SessionReview>(
                service, METHODID_GET_LATEST_SESSION_REVIEW)))
        .addMethod(
          getCreateSessionReviewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.CreateSessionReviewRequest,
              com.ondewo.nlu.SessionReview>(
                service, METHODID_CREATE_SESSION_REVIEW)))
        .addMethod(
          getGetAudioFilesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.GetAudioFilesRequest,
              com.ondewo.nlu.GetAudioFilesResponse>(
                service, METHODID_GET_AUDIO_FILES)))
        .addMethod(
          getAddAudioFilesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.AddAudioFilesRequest,
              com.ondewo.nlu.AddAudioFilesResponse>(
                service, METHODID_ADD_AUDIO_FILES)))
        .addMethod(
          getDeleteAudioFilesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.DeleteAudioFilesRequest,
              com.ondewo.nlu.DeleteAudioFilesResponse>(
                service, METHODID_DELETE_AUDIO_FILES)))
        .addMethod(
          getGetAudioFileOfSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.GetAudioFileOfSessionRequest,
              com.ondewo.nlu.AudioFileResource>(
                service, METHODID_GET_AUDIO_FILE_OF_SESSION)))
        .addMethod(
          getListAudioFilesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListAudioFilesRequest,
              com.ondewo.nlu.ListAudioFilesResponse>(
                service, METHODID_LIST_AUDIO_FILES)))
        .build();
  }

  private static abstract class SessionsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SessionsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ondewo.nlu.SessionProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Sessions");
    }
  }

  private static final class SessionsFileDescriptorSupplier
      extends SessionsBaseDescriptorSupplier {
    SessionsFileDescriptorSupplier() {}
  }

  private static final class SessionsMethodDescriptorSupplier
      extends SessionsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SessionsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SessionsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SessionsFileDescriptorSupplier())
              .addMethod(getDetectIntentMethod())
              .addMethod(getStreamingDetectIntentMethod())
              .addMethod(getListSessionsMethod())
              .addMethod(getGetSessionMethod())
              .addMethod(getCreateSessionMethod())
              .addMethod(getCreateSessionStepMethod())
              .addMethod(getGetSessionStepMethod())
              .addMethod(getUpdateSessionStepMethod())
              .addMethod(getDeleteSessionStepMethod())
              .addMethod(getDeleteSessionMethod())
              .addMethod(getListSessionLabelsMethod())
              .addMethod(getListSessionLabelsOfAllSessionsMethod())
              .addMethod(getListLanguageCodesOfAllSessionsMethod())
              .addMethod(getListMatchedIntentsOfAllSessionsMethod())
              .addMethod(getListMatchedEntityTypesOfAllSessionsMethod())
              .addMethod(getListUserIdsOfAllSessionsMethod())
              .addMethod(getListIdentifiedUserIdsOfAllSessionsMethod())
              .addMethod(getListTagsOfAllSessionsMethod())
              .addMethod(getListInputContextsOfAllSessionsMethod())
              .addMethod(getListOutputContextsOfAllSessionsMethod())
              .addMethod(getListPlatformsOfAllSessionsMethod())
              .addMethod(getListAccountIdsOfAllSessionsMethod())
              .addMethod(getListPropertyIdsOfAllSessionsMethod())
              .addMethod(getListDatastreamIdsOfAllSessionsMethod())
              .addMethod(getListOriginIdsOfAllSessionsMethod())
              .addMethod(getAddSessionLabelsMethod())
              .addMethod(getDeleteSessionLabelsMethod())
              .addMethod(getAddSessionCommentMethod())
              .addMethod(getDeleteSessionCommentsMethod())
              .addMethod(getUpdateSessionCommentsMethod())
              .addMethod(getListSessionCommentsMethod())
              .addMethod(getListSessionCommentsOfAllSessionsMethod())
              .addMethod(getAddSessionFeedbackMethod())
              .addMethod(getAddSessionStepFeedbackMethod())
              .addMethod(getGetSessionFeedbackMethod())
              .addMethod(getUpdateSessionFeedbackMethod())
              .addMethod(getDeleteSessionFeedbackMethod())
              .addMethod(getListSessionFeedbackMethod())
              .addMethod(getListSessionFeedbackOfAllSessionsMethod())
              .addMethod(getGetFeedbackStatisticsMethod())
              .addMethod(getGetFeedbackStatisticsTimeSeriesMethod())
              .addMethod(getListSessionReviewsMethod())
              .addMethod(getGetSessionReviewMethod())
              .addMethod(getGetLatestSessionReviewMethod())
              .addMethod(getCreateSessionReviewMethod())
              .addMethod(getGetAudioFilesMethod())
              .addMethod(getAddAudioFilesMethod())
              .addMethod(getDeleteAudioFilesMethod())
              .addMethod(getGetAudioFileOfSessionMethod())
              .addMethod(getListAudioFilesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
