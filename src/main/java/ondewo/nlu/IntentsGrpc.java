package ondewo.nlu;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An intent represents a mapping between input from a user and an action to be taken by your application. When you pass user input to the &lt;a href="index.html#ondewo.nlu.Sessions.DetectIntent"&gt;DetectIntent&lt;/a&gt; (or &lt;a href="index.html#ondewo.nlu.Sessions.StreamingDetectIntent"&gt;StreamingDetectIntent&lt;/a&gt;) method, the Dialogflow API analyzes the input and searches for a matching intent. If no match is found, the Dialogflow API returns a fallback intent (&lt;code&gt;is_fallback&lt;/code&gt; = true).
 * You can provide additional information for the Dialogflow API to use to match user input to an intent by adding the following to your intent.
 * &lt;ul&gt;
 *   &lt;li&gt;&lt;strong&gt;Contexts&lt;/strong&gt; - provide additional context for intent analysis. For example, if an intent is related to an object in your application that plays music, you can provide a context to determine when to match the intent if the user input is &amp;quot;turn it off&amp;quot;.  You can include a context that matches the intent when there is previous user input of &amp;quot;play music&amp;quot;, and not when there is previous user input of &amp;quot;turn on the light&amp;quot;.&lt;/li&gt;
 *   &lt;li&gt;&lt;strong&gt;Events&lt;/strong&gt; - allow for matching an intent by using an event name instead of user input. Your application can provide an event name and related parameters to the Dialogflow API to match an intent. For example, when your application starts, you can send a welcome event with a user name parameter to the Dialogflow API to match an intent with a personalized welcome message for the user.&lt;/li&gt;
 *   &lt;li&gt;&lt;strong&gt;Training phrases&lt;/strong&gt; - provide examples of user input to train the Dialogflow API agent to better match intents.&lt;/li&gt;
 * &lt;/ul&gt;
 * For more information about intents, see the &lt;a href="https://dialogflow.com/docs/intents"&gt;Dialogflow documentation&lt;/a&gt;.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class IntentsGrpc {

  private IntentsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.nlu.Intents";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.ListIntentsRequest,
      ondewo.nlu.IntentOuterClass.ListIntentsResponse> getListIntentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIntents",
      requestType = ondewo.nlu.IntentOuterClass.ListIntentsRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.ListIntentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.ListIntentsRequest,
      ondewo.nlu.IntentOuterClass.ListIntentsResponse> getListIntentsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.ListIntentsRequest, ondewo.nlu.IntentOuterClass.ListIntentsResponse> getListIntentsMethod;
    if ((getListIntentsMethod = IntentsGrpc.getListIntentsMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getListIntentsMethod = IntentsGrpc.getListIntentsMethod) == null) {
          IntentsGrpc.getListIntentsMethod = getListIntentsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.ListIntentsRequest, ondewo.nlu.IntentOuterClass.ListIntentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListIntents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.ListIntentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.ListIntentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("ListIntents"))
              .build();
        }
      }
    }
    return getListIntentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.GetIntentRequest,
      ondewo.nlu.IntentOuterClass.Intent> getGetIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIntent",
      requestType = ondewo.nlu.IntentOuterClass.GetIntentRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.Intent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.GetIntentRequest,
      ondewo.nlu.IntentOuterClass.Intent> getGetIntentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.GetIntentRequest, ondewo.nlu.IntentOuterClass.Intent> getGetIntentMethod;
    if ((getGetIntentMethod = IntentsGrpc.getGetIntentMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getGetIntentMethod = IntentsGrpc.getGetIntentMethod) == null) {
          IntentsGrpc.getGetIntentMethod = getGetIntentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.GetIntentRequest, ondewo.nlu.IntentOuterClass.Intent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.GetIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.Intent.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("GetIntent"))
              .build();
        }
      }
    }
    return getGetIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.CreateIntentRequest,
      ondewo.nlu.IntentOuterClass.Intent> getCreateIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateIntent",
      requestType = ondewo.nlu.IntentOuterClass.CreateIntentRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.Intent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.CreateIntentRequest,
      ondewo.nlu.IntentOuterClass.Intent> getCreateIntentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.CreateIntentRequest, ondewo.nlu.IntentOuterClass.Intent> getCreateIntentMethod;
    if ((getCreateIntentMethod = IntentsGrpc.getCreateIntentMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getCreateIntentMethod = IntentsGrpc.getCreateIntentMethod) == null) {
          IntentsGrpc.getCreateIntentMethod = getCreateIntentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.CreateIntentRequest, ondewo.nlu.IntentOuterClass.Intent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.CreateIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.Intent.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("CreateIntent"))
              .build();
        }
      }
    }
    return getCreateIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.UpdateIntentRequest,
      ondewo.nlu.IntentOuterClass.Intent> getUpdateIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateIntent",
      requestType = ondewo.nlu.IntentOuterClass.UpdateIntentRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.Intent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.UpdateIntentRequest,
      ondewo.nlu.IntentOuterClass.Intent> getUpdateIntentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.UpdateIntentRequest, ondewo.nlu.IntentOuterClass.Intent> getUpdateIntentMethod;
    if ((getUpdateIntentMethod = IntentsGrpc.getUpdateIntentMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getUpdateIntentMethod = IntentsGrpc.getUpdateIntentMethod) == null) {
          IntentsGrpc.getUpdateIntentMethod = getUpdateIntentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.UpdateIntentRequest, ondewo.nlu.IntentOuterClass.Intent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.UpdateIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.Intent.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("UpdateIntent"))
              .build();
        }
      }
    }
    return getUpdateIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.DeleteIntentRequest,
      com.google.protobuf.Empty> getDeleteIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteIntent",
      requestType = ondewo.nlu.IntentOuterClass.DeleteIntentRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.DeleteIntentRequest,
      com.google.protobuf.Empty> getDeleteIntentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.DeleteIntentRequest, com.google.protobuf.Empty> getDeleteIntentMethod;
    if ((getDeleteIntentMethod = IntentsGrpc.getDeleteIntentMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getDeleteIntentMethod = IntentsGrpc.getDeleteIntentMethod) == null) {
          IntentsGrpc.getDeleteIntentMethod = getDeleteIntentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.DeleteIntentRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.DeleteIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("DeleteIntent"))
              .build();
        }
      }
    }
    return getDeleteIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchUpdateIntentsRequest,
      ondewo.nlu.IntentOuterClass.BatchUpdateIntentsResponse> getBatchUpdateIntentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchUpdateIntents",
      requestType = ondewo.nlu.IntentOuterClass.BatchUpdateIntentsRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.BatchUpdateIntentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchUpdateIntentsRequest,
      ondewo.nlu.IntentOuterClass.BatchUpdateIntentsResponse> getBatchUpdateIntentsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchUpdateIntentsRequest, ondewo.nlu.IntentOuterClass.BatchUpdateIntentsResponse> getBatchUpdateIntentsMethod;
    if ((getBatchUpdateIntentsMethod = IntentsGrpc.getBatchUpdateIntentsMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getBatchUpdateIntentsMethod = IntentsGrpc.getBatchUpdateIntentsMethod) == null) {
          IntentsGrpc.getBatchUpdateIntentsMethod = getBatchUpdateIntentsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.BatchUpdateIntentsRequest, ondewo.nlu.IntentOuterClass.BatchUpdateIntentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchUpdateIntents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchUpdateIntentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchUpdateIntentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("BatchUpdateIntents"))
              .build();
        }
      }
    }
    return getBatchUpdateIntentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchDeleteIntentsRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getBatchDeleteIntentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchDeleteIntents",
      requestType = ondewo.nlu.IntentOuterClass.BatchDeleteIntentsRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchDeleteIntentsRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getBatchDeleteIntentsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchDeleteIntentsRequest, ondewo.nlu.OperationsOuterClass.Operation> getBatchDeleteIntentsMethod;
    if ((getBatchDeleteIntentsMethod = IntentsGrpc.getBatchDeleteIntentsMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getBatchDeleteIntentsMethod = IntentsGrpc.getBatchDeleteIntentsMethod) == null) {
          IntentsGrpc.getBatchDeleteIntentsMethod = getBatchDeleteIntentsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.BatchDeleteIntentsRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchDeleteIntents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchDeleteIntentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("BatchDeleteIntents"))
              .build();
        }
      }
    }
    return getBatchDeleteIntentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.IntentTagRequest,
      com.google.protobuf.Empty> getTagIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TagIntent",
      requestType = ondewo.nlu.IntentOuterClass.IntentTagRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.IntentTagRequest,
      com.google.protobuf.Empty> getTagIntentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.IntentTagRequest, com.google.protobuf.Empty> getTagIntentMethod;
    if ((getTagIntentMethod = IntentsGrpc.getTagIntentMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getTagIntentMethod = IntentsGrpc.getTagIntentMethod) == null) {
          IntentsGrpc.getTagIntentMethod = getTagIntentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.IntentTagRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TagIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.IntentTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("TagIntent"))
              .build();
        }
      }
    }
    return getTagIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.IntentTagRequest,
      com.google.protobuf.Empty> getDeleteIntentTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteIntentTag",
      requestType = ondewo.nlu.IntentOuterClass.IntentTagRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.IntentTagRequest,
      com.google.protobuf.Empty> getDeleteIntentTagMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.IntentTagRequest, com.google.protobuf.Empty> getDeleteIntentTagMethod;
    if ((getDeleteIntentTagMethod = IntentsGrpc.getDeleteIntentTagMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getDeleteIntentTagMethod = IntentsGrpc.getDeleteIntentTagMethod) == null) {
          IntentsGrpc.getDeleteIntentTagMethod = getDeleteIntentTagMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.IntentTagRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteIntentTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.IntentTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("DeleteIntentTag"))
              .build();
        }
      }
    }
    return getDeleteIntentTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.GetIntentTagsRequest,
      ondewo.nlu.IntentOuterClass.GetIntentTagsResponse> getGetIntentTagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIntentTags",
      requestType = ondewo.nlu.IntentOuterClass.GetIntentTagsRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.GetIntentTagsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.GetIntentTagsRequest,
      ondewo.nlu.IntentOuterClass.GetIntentTagsResponse> getGetIntentTagsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.GetIntentTagsRequest, ondewo.nlu.IntentOuterClass.GetIntentTagsResponse> getGetIntentTagsMethod;
    if ((getGetIntentTagsMethod = IntentsGrpc.getGetIntentTagsMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getGetIntentTagsMethod = IntentsGrpc.getGetIntentTagsMethod) == null) {
          IntentsGrpc.getGetIntentTagsMethod = getGetIntentTagsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.GetIntentTagsRequest, ondewo.nlu.IntentOuterClass.GetIntentTagsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIntentTags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.GetIntentTagsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.GetIntentTagsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("GetIntentTags"))
              .build();
        }
      }
    }
    return getGetIntentTagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.GetAllIntentTagsRequest,
      ondewo.nlu.IntentOuterClass.GetIntentTagsResponse> getGetAllIntentTagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllIntentTags",
      requestType = ondewo.nlu.IntentOuterClass.GetAllIntentTagsRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.GetIntentTagsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.GetAllIntentTagsRequest,
      ondewo.nlu.IntentOuterClass.GetIntentTagsResponse> getGetAllIntentTagsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.GetAllIntentTagsRequest, ondewo.nlu.IntentOuterClass.GetIntentTagsResponse> getGetAllIntentTagsMethod;
    if ((getGetAllIntentTagsMethod = IntentsGrpc.getGetAllIntentTagsMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getGetAllIntentTagsMethod = IntentsGrpc.getGetAllIntentTagsMethod) == null) {
          IntentsGrpc.getGetAllIntentTagsMethod = getGetAllIntentTagsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.GetAllIntentTagsRequest, ondewo.nlu.IntentOuterClass.GetIntentTagsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllIntentTags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.GetAllIntentTagsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.GetIntentTagsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("GetAllIntentTags"))
              .build();
        }
      }
    }
    return getGetAllIntentTagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchCreateTrainingPhrasesRequest,
      ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse> getBatchCreateTrainingPhrasesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchCreateTrainingPhrases",
      requestType = ondewo.nlu.IntentOuterClass.BatchCreateTrainingPhrasesRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchCreateTrainingPhrasesRequest,
      ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse> getBatchCreateTrainingPhrasesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchCreateTrainingPhrasesRequest, ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse> getBatchCreateTrainingPhrasesMethod;
    if ((getBatchCreateTrainingPhrasesMethod = IntentsGrpc.getBatchCreateTrainingPhrasesMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getBatchCreateTrainingPhrasesMethod = IntentsGrpc.getBatchCreateTrainingPhrasesMethod) == null) {
          IntentsGrpc.getBatchCreateTrainingPhrasesMethod = getBatchCreateTrainingPhrasesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.BatchCreateTrainingPhrasesRequest, ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchCreateTrainingPhrases"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchCreateTrainingPhrasesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("BatchCreateTrainingPhrases"))
              .build();
        }
      }
    }
    return getBatchCreateTrainingPhrasesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchGetTrainingPhrasesRequest,
      ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse> getBatchGetTrainingPhrasesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchGetTrainingPhrases",
      requestType = ondewo.nlu.IntentOuterClass.BatchGetTrainingPhrasesRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchGetTrainingPhrasesRequest,
      ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse> getBatchGetTrainingPhrasesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchGetTrainingPhrasesRequest, ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse> getBatchGetTrainingPhrasesMethod;
    if ((getBatchGetTrainingPhrasesMethod = IntentsGrpc.getBatchGetTrainingPhrasesMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getBatchGetTrainingPhrasesMethod = IntentsGrpc.getBatchGetTrainingPhrasesMethod) == null) {
          IntentsGrpc.getBatchGetTrainingPhrasesMethod = getBatchGetTrainingPhrasesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.BatchGetTrainingPhrasesRequest, ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchGetTrainingPhrases"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchGetTrainingPhrasesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("BatchGetTrainingPhrases"))
              .build();
        }
      }
    }
    return getBatchGetTrainingPhrasesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchUpdateTrainingPhrasesRequest,
      ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse> getBatchUpdateTrainingPhrasesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchUpdateTrainingPhrases",
      requestType = ondewo.nlu.IntentOuterClass.BatchUpdateTrainingPhrasesRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchUpdateTrainingPhrasesRequest,
      ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse> getBatchUpdateTrainingPhrasesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchUpdateTrainingPhrasesRequest, ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse> getBatchUpdateTrainingPhrasesMethod;
    if ((getBatchUpdateTrainingPhrasesMethod = IntentsGrpc.getBatchUpdateTrainingPhrasesMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getBatchUpdateTrainingPhrasesMethod = IntentsGrpc.getBatchUpdateTrainingPhrasesMethod) == null) {
          IntentsGrpc.getBatchUpdateTrainingPhrasesMethod = getBatchUpdateTrainingPhrasesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.BatchUpdateTrainingPhrasesRequest, ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchUpdateTrainingPhrases"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchUpdateTrainingPhrasesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("BatchUpdateTrainingPhrases"))
              .build();
        }
      }
    }
    return getBatchUpdateTrainingPhrasesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesRequest,
      ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesResponse> getBatchDeleteTrainingPhrasesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchDeleteTrainingPhrases",
      requestType = ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesRequest,
      ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesResponse> getBatchDeleteTrainingPhrasesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesRequest, ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesResponse> getBatchDeleteTrainingPhrasesMethod;
    if ((getBatchDeleteTrainingPhrasesMethod = IntentsGrpc.getBatchDeleteTrainingPhrasesMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getBatchDeleteTrainingPhrasesMethod = IntentsGrpc.getBatchDeleteTrainingPhrasesMethod) == null) {
          IntentsGrpc.getBatchDeleteTrainingPhrasesMethod = getBatchDeleteTrainingPhrasesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesRequest, ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchDeleteTrainingPhrases"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("BatchDeleteTrainingPhrases"))
              .build();
        }
      }
    }
    return getBatchDeleteTrainingPhrasesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.ListTrainingPhrasesRequest,
      ondewo.nlu.IntentOuterClass.ListTrainingPhrasesResponse> getListTrainingPhrasesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTrainingPhrases",
      requestType = ondewo.nlu.IntentOuterClass.ListTrainingPhrasesRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.ListTrainingPhrasesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.ListTrainingPhrasesRequest,
      ondewo.nlu.IntentOuterClass.ListTrainingPhrasesResponse> getListTrainingPhrasesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.ListTrainingPhrasesRequest, ondewo.nlu.IntentOuterClass.ListTrainingPhrasesResponse> getListTrainingPhrasesMethod;
    if ((getListTrainingPhrasesMethod = IntentsGrpc.getListTrainingPhrasesMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getListTrainingPhrasesMethod = IntentsGrpc.getListTrainingPhrasesMethod) == null) {
          IntentsGrpc.getListTrainingPhrasesMethod = getListTrainingPhrasesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.ListTrainingPhrasesRequest, ondewo.nlu.IntentOuterClass.ListTrainingPhrasesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTrainingPhrases"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.ListTrainingPhrasesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.ListTrainingPhrasesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("ListTrainingPhrases"))
              .build();
        }
      }
    }
    return getListTrainingPhrasesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchCreateResponseMessagesRequest,
      ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse> getBatchCreateResponseMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchCreateResponseMessages",
      requestType = ondewo.nlu.IntentOuterClass.BatchCreateResponseMessagesRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchCreateResponseMessagesRequest,
      ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse> getBatchCreateResponseMessagesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchCreateResponseMessagesRequest, ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse> getBatchCreateResponseMessagesMethod;
    if ((getBatchCreateResponseMessagesMethod = IntentsGrpc.getBatchCreateResponseMessagesMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getBatchCreateResponseMessagesMethod = IntentsGrpc.getBatchCreateResponseMessagesMethod) == null) {
          IntentsGrpc.getBatchCreateResponseMessagesMethod = getBatchCreateResponseMessagesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.BatchCreateResponseMessagesRequest, ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchCreateResponseMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchCreateResponseMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("BatchCreateResponseMessages"))
              .build();
        }
      }
    }
    return getBatchCreateResponseMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchGetResponseMessagesRequest,
      ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse> getBatchGetResponseMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchGetResponseMessages",
      requestType = ondewo.nlu.IntentOuterClass.BatchGetResponseMessagesRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchGetResponseMessagesRequest,
      ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse> getBatchGetResponseMessagesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchGetResponseMessagesRequest, ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse> getBatchGetResponseMessagesMethod;
    if ((getBatchGetResponseMessagesMethod = IntentsGrpc.getBatchGetResponseMessagesMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getBatchGetResponseMessagesMethod = IntentsGrpc.getBatchGetResponseMessagesMethod) == null) {
          IntentsGrpc.getBatchGetResponseMessagesMethod = getBatchGetResponseMessagesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.BatchGetResponseMessagesRequest, ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchGetResponseMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchGetResponseMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("BatchGetResponseMessages"))
              .build();
        }
      }
    }
    return getBatchGetResponseMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchUpdateResponseMessagesRequest,
      ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse> getBatchUpdateResponseMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchUpdateResponseMessages",
      requestType = ondewo.nlu.IntentOuterClass.BatchUpdateResponseMessagesRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchUpdateResponseMessagesRequest,
      ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse> getBatchUpdateResponseMessagesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchUpdateResponseMessagesRequest, ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse> getBatchUpdateResponseMessagesMethod;
    if ((getBatchUpdateResponseMessagesMethod = IntentsGrpc.getBatchUpdateResponseMessagesMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getBatchUpdateResponseMessagesMethod = IntentsGrpc.getBatchUpdateResponseMessagesMethod) == null) {
          IntentsGrpc.getBatchUpdateResponseMessagesMethod = getBatchUpdateResponseMessagesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.BatchUpdateResponseMessagesRequest, ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchUpdateResponseMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchUpdateResponseMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("BatchUpdateResponseMessages"))
              .build();
        }
      }
    }
    return getBatchUpdateResponseMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesRequest,
      ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesResponse> getBatchDeleteResponseMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchDeleteResponseMessages",
      requestType = ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesRequest,
      ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesResponse> getBatchDeleteResponseMessagesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesRequest, ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesResponse> getBatchDeleteResponseMessagesMethod;
    if ((getBatchDeleteResponseMessagesMethod = IntentsGrpc.getBatchDeleteResponseMessagesMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getBatchDeleteResponseMessagesMethod = IntentsGrpc.getBatchDeleteResponseMessagesMethod) == null) {
          IntentsGrpc.getBatchDeleteResponseMessagesMethod = getBatchDeleteResponseMessagesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesRequest, ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchDeleteResponseMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("BatchDeleteResponseMessages"))
              .build();
        }
      }
    }
    return getBatchDeleteResponseMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.ListResponseMessagesRequest,
      ondewo.nlu.IntentOuterClass.ListResponseMessagesResponse> getListResponseMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListResponseMessages",
      requestType = ondewo.nlu.IntentOuterClass.ListResponseMessagesRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.ListResponseMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.ListResponseMessagesRequest,
      ondewo.nlu.IntentOuterClass.ListResponseMessagesResponse> getListResponseMessagesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.ListResponseMessagesRequest, ondewo.nlu.IntentOuterClass.ListResponseMessagesResponse> getListResponseMessagesMethod;
    if ((getListResponseMessagesMethod = IntentsGrpc.getListResponseMessagesMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getListResponseMessagesMethod = IntentsGrpc.getListResponseMessagesMethod) == null) {
          IntentsGrpc.getListResponseMessagesMethod = getListResponseMessagesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.ListResponseMessagesRequest, ondewo.nlu.IntentOuterClass.ListResponseMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListResponseMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.ListResponseMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.ListResponseMessagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("ListResponseMessages"))
              .build();
        }
      }
    }
    return getListResponseMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchCreateParametersRequest,
      ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse> getBatchCreateParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchCreateParameters",
      requestType = ondewo.nlu.IntentOuterClass.BatchCreateParametersRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchCreateParametersRequest,
      ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse> getBatchCreateParametersMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchCreateParametersRequest, ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse> getBatchCreateParametersMethod;
    if ((getBatchCreateParametersMethod = IntentsGrpc.getBatchCreateParametersMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getBatchCreateParametersMethod = IntentsGrpc.getBatchCreateParametersMethod) == null) {
          IntentsGrpc.getBatchCreateParametersMethod = getBatchCreateParametersMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.BatchCreateParametersRequest, ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchCreateParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchCreateParametersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("BatchCreateParameters"))
              .build();
        }
      }
    }
    return getBatchCreateParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchGetParametersRequest,
      ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse> getBatchGetParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchGetParameters",
      requestType = ondewo.nlu.IntentOuterClass.BatchGetParametersRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchGetParametersRequest,
      ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse> getBatchGetParametersMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchGetParametersRequest, ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse> getBatchGetParametersMethod;
    if ((getBatchGetParametersMethod = IntentsGrpc.getBatchGetParametersMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getBatchGetParametersMethod = IntentsGrpc.getBatchGetParametersMethod) == null) {
          IntentsGrpc.getBatchGetParametersMethod = getBatchGetParametersMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.BatchGetParametersRequest, ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchGetParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchGetParametersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("BatchGetParameters"))
              .build();
        }
      }
    }
    return getBatchGetParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchUpdateParametersRequest,
      ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse> getBatchUpdateParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchUpdateParameters",
      requestType = ondewo.nlu.IntentOuterClass.BatchUpdateParametersRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchUpdateParametersRequest,
      ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse> getBatchUpdateParametersMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchUpdateParametersRequest, ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse> getBatchUpdateParametersMethod;
    if ((getBatchUpdateParametersMethod = IntentsGrpc.getBatchUpdateParametersMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getBatchUpdateParametersMethod = IntentsGrpc.getBatchUpdateParametersMethod) == null) {
          IntentsGrpc.getBatchUpdateParametersMethod = getBatchUpdateParametersMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.BatchUpdateParametersRequest, ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchUpdateParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchUpdateParametersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("BatchUpdateParameters"))
              .build();
        }
      }
    }
    return getBatchUpdateParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchDeleteParametersRequest,
      ondewo.nlu.IntentOuterClass.BatchDeleteParametersResponse> getBatchDeleteParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchDeleteParameters",
      requestType = ondewo.nlu.IntentOuterClass.BatchDeleteParametersRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.BatchDeleteParametersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchDeleteParametersRequest,
      ondewo.nlu.IntentOuterClass.BatchDeleteParametersResponse> getBatchDeleteParametersMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.BatchDeleteParametersRequest, ondewo.nlu.IntentOuterClass.BatchDeleteParametersResponse> getBatchDeleteParametersMethod;
    if ((getBatchDeleteParametersMethod = IntentsGrpc.getBatchDeleteParametersMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getBatchDeleteParametersMethod = IntentsGrpc.getBatchDeleteParametersMethod) == null) {
          IntentsGrpc.getBatchDeleteParametersMethod = getBatchDeleteParametersMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.BatchDeleteParametersRequest, ondewo.nlu.IntentOuterClass.BatchDeleteParametersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchDeleteParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchDeleteParametersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.BatchDeleteParametersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("BatchDeleteParameters"))
              .build();
        }
      }
    }
    return getBatchDeleteParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.ListParametersRequest,
      ondewo.nlu.IntentOuterClass.ListParametersResponse> getListParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListParameters",
      requestType = ondewo.nlu.IntentOuterClass.ListParametersRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.ListParametersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.ListParametersRequest,
      ondewo.nlu.IntentOuterClass.ListParametersResponse> getListParametersMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.ListParametersRequest, ondewo.nlu.IntentOuterClass.ListParametersResponse> getListParametersMethod;
    if ((getListParametersMethod = IntentsGrpc.getListParametersMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getListParametersMethod = IntentsGrpc.getListParametersMethod) == null) {
          IntentsGrpc.getListParametersMethod = getListParametersMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.ListParametersRequest, ondewo.nlu.IntentOuterClass.ListParametersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.ListParametersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.ListParametersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("ListParameters"))
              .build();
        }
      }
    }
    return getListParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentRequest,
      ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentResponse> getListTrainingPhrasesofIntentsWithEnrichmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTrainingPhrasesofIntentsWithEnrichment",
      requestType = ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentRequest.class,
      responseType = ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentRequest,
      ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentResponse> getListTrainingPhrasesofIntentsWithEnrichmentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentRequest, ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentResponse> getListTrainingPhrasesofIntentsWithEnrichmentMethod;
    if ((getListTrainingPhrasesofIntentsWithEnrichmentMethod = IntentsGrpc.getListTrainingPhrasesofIntentsWithEnrichmentMethod) == null) {
      synchronized (IntentsGrpc.class) {
        if ((getListTrainingPhrasesofIntentsWithEnrichmentMethod = IntentsGrpc.getListTrainingPhrasesofIntentsWithEnrichmentMethod) == null) {
          IntentsGrpc.getListTrainingPhrasesofIntentsWithEnrichmentMethod = getListTrainingPhrasesofIntentsWithEnrichmentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentRequest, ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTrainingPhrasesofIntentsWithEnrichment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntentsMethodDescriptorSupplier("ListTrainingPhrasesofIntentsWithEnrichment"))
              .build();
        }
      }
    }
    return getListTrainingPhrasesofIntentsWithEnrichmentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IntentsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntentsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntentsStub>() {
        @java.lang.Override
        public IntentsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntentsStub(channel, callOptions);
        }
      };
    return IntentsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static IntentsBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntentsBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntentsBlockingV2Stub>() {
        @java.lang.Override
        public IntentsBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntentsBlockingV2Stub(channel, callOptions);
        }
      };
    return IntentsBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IntentsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntentsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntentsBlockingStub>() {
        @java.lang.Override
        public IntentsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntentsBlockingStub(channel, callOptions);
        }
      };
    return IntentsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IntentsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntentsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntentsFutureStub>() {
        @java.lang.Override
        public IntentsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntentsFutureStub(channel, callOptions);
        }
      };
    return IntentsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * An intent represents a mapping between input from a user and an action to be taken by your application. When you pass user input to the &lt;a href="index.html#ondewo.nlu.Sessions.DetectIntent"&gt;DetectIntent&lt;/a&gt; (or &lt;a href="index.html#ondewo.nlu.Sessions.StreamingDetectIntent"&gt;StreamingDetectIntent&lt;/a&gt;) method, the Dialogflow API analyzes the input and searches for a matching intent. If no match is found, the Dialogflow API returns a fallback intent (&lt;code&gt;is_fallback&lt;/code&gt; = true).
   * You can provide additional information for the Dialogflow API to use to match user input to an intent by adding the following to your intent.
   * &lt;ul&gt;
   *   &lt;li&gt;&lt;strong&gt;Contexts&lt;/strong&gt; - provide additional context for intent analysis. For example, if an intent is related to an object in your application that plays music, you can provide a context to determine when to match the intent if the user input is &amp;quot;turn it off&amp;quot;.  You can include a context that matches the intent when there is previous user input of &amp;quot;play music&amp;quot;, and not when there is previous user input of &amp;quot;turn on the light&amp;quot;.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;Events&lt;/strong&gt; - allow for matching an intent by using an event name instead of user input. Your application can provide an event name and related parameters to the Dialogflow API to match an intent. For example, when your application starts, you can send a welcome event with a user name parameter to the Dialogflow API to match an intent with a personalized welcome message for the user.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;Training phrases&lt;/strong&gt; - provide examples of user input to train the Dialogflow API agent to better match intents.&lt;/li&gt;
   * &lt;/ul&gt;
   * For more information about intents, see the &lt;a href="https://dialogflow.com/docs/intents"&gt;Dialogflow documentation&lt;/a&gt;.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns the list of all intents in the specified agent.
     * </pre>
     */
    default void listIntents(ondewo.nlu.IntentOuterClass.ListIntentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.ListIntentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListIntentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specified intent.
     * </pre>
     */
    default void getIntent(ondewo.nlu.IntentOuterClass.GetIntentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.Intent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIntentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an intent in the specified agent.
     * </pre>
     */
    default void createIntent(ondewo.nlu.IntentOuterClass.CreateIntentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.Intent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateIntentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified intent.
     * </pre>
     */
    default void updateIntent(ondewo.nlu.IntentOuterClass.UpdateIntentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.Intent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateIntentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified intent.
     * </pre>
     */
    default void deleteIntent(ondewo.nlu.IntentOuterClass.DeleteIntentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteIntentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates/Creates multiple intents in the specified agent.
     * Operation &amp;lt;response: &lt;a href="index.html#ondewo.nlu.BatchUpdateIntentsResponse"&gt;BatchUpdateIntentsResponse&lt;/a&gt;&amp;gt;
     * </pre>
     */
    default void batchUpdateIntents(ondewo.nlu.IntentOuterClass.BatchUpdateIntentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchUpdateIntentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchUpdateIntentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes intents in the specified agent.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;&amp;gt;
     * </pre>
     */
    default void batchDeleteIntents(ondewo.nlu.IntentOuterClass.BatchDeleteIntentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchDeleteIntentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Tags a specific intent with tag(s)
     * </pre>
     */
    default void tagIntent(ondewo.nlu.IntentOuterClass.IntentTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTagIntentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes tag(s) for a specific intent
     * </pre>
     */
    default void deleteIntentTag(ondewo.nlu.IntentOuterClass.IntentTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteIntentTagMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets all the tags for a specific intent
     * </pre>
     */
    default void getIntentTags(ondewo.nlu.IntentOuterClass.GetIntentTagsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.GetIntentTagsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIntentTagsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets all the tags for all the intents
     * </pre>
     */
    default void getAllIntentTags(ondewo.nlu.IntentOuterClass.GetAllIntentTagsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.GetIntentTagsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllIntentTagsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates batch of training phrases
     * </pre>
     */
    default void batchCreateTrainingPhrases(ondewo.nlu.IntentOuterClass.BatchCreateTrainingPhrasesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchCreateTrainingPhrasesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a training phrases batch of the specified names.
     * </pre>
     */
    default void batchGetTrainingPhrases(ondewo.nlu.IntentOuterClass.BatchGetTrainingPhrasesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchGetTrainingPhrasesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates batch of training phrases
     * </pre>
     */
    default void batchUpdateTrainingPhrases(ondewo.nlu.IntentOuterClass.BatchUpdateTrainingPhrasesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchUpdateTrainingPhrasesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a training phrases batch of the specified names.
     * </pre>
     */
    default void batchDeleteTrainingPhrases(ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchDeleteTrainingPhrasesMethod(), responseObserver);
    }

    /**
     * <pre>
     * List training phrases (of a specific intent).
     * </pre>
     */
    default void listTrainingPhrases(ondewo.nlu.IntentOuterClass.ListTrainingPhrasesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.ListTrainingPhrasesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTrainingPhrasesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates batch of intent messages
     * </pre>
     */
    default void batchCreateResponseMessages(ondewo.nlu.IntentOuterClass.BatchCreateResponseMessagesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchCreateResponseMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a intent messages batch of the specified names.
     * </pre>
     */
    default void batchGetResponseMessages(ondewo.nlu.IntentOuterClass.BatchGetResponseMessagesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchGetResponseMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates batch of intent messages
     * </pre>
     */
    default void batchUpdateResponseMessages(ondewo.nlu.IntentOuterClass.BatchUpdateResponseMessagesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchUpdateResponseMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a intent messages batch of the specified names.
     * </pre>
     */
    default void batchDeleteResponseMessages(ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchDeleteResponseMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * List messages (of a specific intent).
     * </pre>
     */
    default void listResponseMessages(ondewo.nlu.IntentOuterClass.ListResponseMessagesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.ListResponseMessagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListResponseMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates batch of intent messages
     * </pre>
     */
    default void batchCreateParameters(ondewo.nlu.IntentOuterClass.BatchCreateParametersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchCreateParametersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a intent messages batch of the specified names.
     * </pre>
     */
    default void batchGetParameters(ondewo.nlu.IntentOuterClass.BatchGetParametersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchGetParametersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates batch of intent messages
     * </pre>
     */
    default void batchUpdateParameters(ondewo.nlu.IntentOuterClass.BatchUpdateParametersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchUpdateParametersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a intent messages batch of the specified names.
     * </pre>
     */
    default void batchDeleteParameters(ondewo.nlu.IntentOuterClass.BatchDeleteParametersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchDeleteParametersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchDeleteParametersMethod(), responseObserver);
    }

    /**
     * <pre>
     * List messages (of a specific intent).
     * </pre>
     */
    default void listParameters(ondewo.nlu.IntentOuterClass.ListParametersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.ListParametersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListParametersMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Training phrases (of a specific intent).
     * </pre>
     */
    default void listTrainingPhrasesofIntentsWithEnrichment(ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTrainingPhrasesofIntentsWithEnrichmentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Intents.
   * <pre>
   * An intent represents a mapping between input from a user and an action to be taken by your application. When you pass user input to the &lt;a href="index.html#ondewo.nlu.Sessions.DetectIntent"&gt;DetectIntent&lt;/a&gt; (or &lt;a href="index.html#ondewo.nlu.Sessions.StreamingDetectIntent"&gt;StreamingDetectIntent&lt;/a&gt;) method, the Dialogflow API analyzes the input and searches for a matching intent. If no match is found, the Dialogflow API returns a fallback intent (&lt;code&gt;is_fallback&lt;/code&gt; = true).
   * You can provide additional information for the Dialogflow API to use to match user input to an intent by adding the following to your intent.
   * &lt;ul&gt;
   *   &lt;li&gt;&lt;strong&gt;Contexts&lt;/strong&gt; - provide additional context for intent analysis. For example, if an intent is related to an object in your application that plays music, you can provide a context to determine when to match the intent if the user input is &amp;quot;turn it off&amp;quot;.  You can include a context that matches the intent when there is previous user input of &amp;quot;play music&amp;quot;, and not when there is previous user input of &amp;quot;turn on the light&amp;quot;.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;Events&lt;/strong&gt; - allow for matching an intent by using an event name instead of user input. Your application can provide an event name and related parameters to the Dialogflow API to match an intent. For example, when your application starts, you can send a welcome event with a user name parameter to the Dialogflow API to match an intent with a personalized welcome message for the user.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;Training phrases&lt;/strong&gt; - provide examples of user input to train the Dialogflow API agent to better match intents.&lt;/li&gt;
   * &lt;/ul&gt;
   * For more information about intents, see the &lt;a href="https://dialogflow.com/docs/intents"&gt;Dialogflow documentation&lt;/a&gt;.
   * </pre>
   */
  public static abstract class IntentsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IntentsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Intents.
   * <pre>
   * An intent represents a mapping between input from a user and an action to be taken by your application. When you pass user input to the &lt;a href="index.html#ondewo.nlu.Sessions.DetectIntent"&gt;DetectIntent&lt;/a&gt; (or &lt;a href="index.html#ondewo.nlu.Sessions.StreamingDetectIntent"&gt;StreamingDetectIntent&lt;/a&gt;) method, the Dialogflow API analyzes the input and searches for a matching intent. If no match is found, the Dialogflow API returns a fallback intent (&lt;code&gt;is_fallback&lt;/code&gt; = true).
   * You can provide additional information for the Dialogflow API to use to match user input to an intent by adding the following to your intent.
   * &lt;ul&gt;
   *   &lt;li&gt;&lt;strong&gt;Contexts&lt;/strong&gt; - provide additional context for intent analysis. For example, if an intent is related to an object in your application that plays music, you can provide a context to determine when to match the intent if the user input is &amp;quot;turn it off&amp;quot;.  You can include a context that matches the intent when there is previous user input of &amp;quot;play music&amp;quot;, and not when there is previous user input of &amp;quot;turn on the light&amp;quot;.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;Events&lt;/strong&gt; - allow for matching an intent by using an event name instead of user input. Your application can provide an event name and related parameters to the Dialogflow API to match an intent. For example, when your application starts, you can send a welcome event with a user name parameter to the Dialogflow API to match an intent with a personalized welcome message for the user.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;Training phrases&lt;/strong&gt; - provide examples of user input to train the Dialogflow API agent to better match intents.&lt;/li&gt;
   * &lt;/ul&gt;
   * For more information about intents, see the &lt;a href="https://dialogflow.com/docs/intents"&gt;Dialogflow documentation&lt;/a&gt;.
   * </pre>
   */
  public static final class IntentsStub
      extends io.grpc.stub.AbstractAsyncStub<IntentsStub> {
    private IntentsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntentsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntentsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all intents in the specified agent.
     * </pre>
     */
    public void listIntents(ondewo.nlu.IntentOuterClass.ListIntentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.ListIntentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListIntentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specified intent.
     * </pre>
     */
    public void getIntent(ondewo.nlu.IntentOuterClass.GetIntentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.Intent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an intent in the specified agent.
     * </pre>
     */
    public void createIntent(ondewo.nlu.IntentOuterClass.CreateIntentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.Intent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified intent.
     * </pre>
     */
    public void updateIntent(ondewo.nlu.IntentOuterClass.UpdateIntentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.Intent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified intent.
     * </pre>
     */
    public void deleteIntent(ondewo.nlu.IntentOuterClass.DeleteIntentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates/Creates multiple intents in the specified agent.
     * Operation &amp;lt;response: &lt;a href="index.html#ondewo.nlu.BatchUpdateIntentsResponse"&gt;BatchUpdateIntentsResponse&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public void batchUpdateIntents(ondewo.nlu.IntentOuterClass.BatchUpdateIntentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchUpdateIntentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchUpdateIntentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes intents in the specified agent.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public void batchDeleteIntents(ondewo.nlu.IntentOuterClass.BatchDeleteIntentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchDeleteIntentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Tags a specific intent with tag(s)
     * </pre>
     */
    public void tagIntent(ondewo.nlu.IntentOuterClass.IntentTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTagIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes tag(s) for a specific intent
     * </pre>
     */
    public void deleteIntentTag(ondewo.nlu.IntentOuterClass.IntentTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteIntentTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets all the tags for a specific intent
     * </pre>
     */
    public void getIntentTags(ondewo.nlu.IntentOuterClass.GetIntentTagsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.GetIntentTagsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIntentTagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets all the tags for all the intents
     * </pre>
     */
    public void getAllIntentTags(ondewo.nlu.IntentOuterClass.GetAllIntentTagsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.GetIntentTagsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllIntentTagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates batch of training phrases
     * </pre>
     */
    public void batchCreateTrainingPhrases(ondewo.nlu.IntentOuterClass.BatchCreateTrainingPhrasesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchCreateTrainingPhrasesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a training phrases batch of the specified names.
     * </pre>
     */
    public void batchGetTrainingPhrases(ondewo.nlu.IntentOuterClass.BatchGetTrainingPhrasesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchGetTrainingPhrasesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates batch of training phrases
     * </pre>
     */
    public void batchUpdateTrainingPhrases(ondewo.nlu.IntentOuterClass.BatchUpdateTrainingPhrasesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchUpdateTrainingPhrasesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a training phrases batch of the specified names.
     * </pre>
     */
    public void batchDeleteTrainingPhrases(ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchDeleteTrainingPhrasesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List training phrases (of a specific intent).
     * </pre>
     */
    public void listTrainingPhrases(ondewo.nlu.IntentOuterClass.ListTrainingPhrasesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.ListTrainingPhrasesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTrainingPhrasesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates batch of intent messages
     * </pre>
     */
    public void batchCreateResponseMessages(ondewo.nlu.IntentOuterClass.BatchCreateResponseMessagesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchCreateResponseMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a intent messages batch of the specified names.
     * </pre>
     */
    public void batchGetResponseMessages(ondewo.nlu.IntentOuterClass.BatchGetResponseMessagesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchGetResponseMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates batch of intent messages
     * </pre>
     */
    public void batchUpdateResponseMessages(ondewo.nlu.IntentOuterClass.BatchUpdateResponseMessagesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchUpdateResponseMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a intent messages batch of the specified names.
     * </pre>
     */
    public void batchDeleteResponseMessages(ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchDeleteResponseMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List messages (of a specific intent).
     * </pre>
     */
    public void listResponseMessages(ondewo.nlu.IntentOuterClass.ListResponseMessagesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.ListResponseMessagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListResponseMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates batch of intent messages
     * </pre>
     */
    public void batchCreateParameters(ondewo.nlu.IntentOuterClass.BatchCreateParametersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchCreateParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a intent messages batch of the specified names.
     * </pre>
     */
    public void batchGetParameters(ondewo.nlu.IntentOuterClass.BatchGetParametersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchGetParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates batch of intent messages
     * </pre>
     */
    public void batchUpdateParameters(ondewo.nlu.IntentOuterClass.BatchUpdateParametersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchUpdateParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a intent messages batch of the specified names.
     * </pre>
     */
    public void batchDeleteParameters(ondewo.nlu.IntentOuterClass.BatchDeleteParametersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchDeleteParametersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchDeleteParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List messages (of a specific intent).
     * </pre>
     */
    public void listParameters(ondewo.nlu.IntentOuterClass.ListParametersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.ListParametersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Training phrases (of a specific intent).
     * </pre>
     */
    public void listTrainingPhrasesofIntentsWithEnrichment(ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTrainingPhrasesofIntentsWithEnrichmentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Intents.
   * <pre>
   * An intent represents a mapping between input from a user and an action to be taken by your application. When you pass user input to the &lt;a href="index.html#ondewo.nlu.Sessions.DetectIntent"&gt;DetectIntent&lt;/a&gt; (or &lt;a href="index.html#ondewo.nlu.Sessions.StreamingDetectIntent"&gt;StreamingDetectIntent&lt;/a&gt;) method, the Dialogflow API analyzes the input and searches for a matching intent. If no match is found, the Dialogflow API returns a fallback intent (&lt;code&gt;is_fallback&lt;/code&gt; = true).
   * You can provide additional information for the Dialogflow API to use to match user input to an intent by adding the following to your intent.
   * &lt;ul&gt;
   *   &lt;li&gt;&lt;strong&gt;Contexts&lt;/strong&gt; - provide additional context for intent analysis. For example, if an intent is related to an object in your application that plays music, you can provide a context to determine when to match the intent if the user input is &amp;quot;turn it off&amp;quot;.  You can include a context that matches the intent when there is previous user input of &amp;quot;play music&amp;quot;, and not when there is previous user input of &amp;quot;turn on the light&amp;quot;.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;Events&lt;/strong&gt; - allow for matching an intent by using an event name instead of user input. Your application can provide an event name and related parameters to the Dialogflow API to match an intent. For example, when your application starts, you can send a welcome event with a user name parameter to the Dialogflow API to match an intent with a personalized welcome message for the user.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;Training phrases&lt;/strong&gt; - provide examples of user input to train the Dialogflow API agent to better match intents.&lt;/li&gt;
   * &lt;/ul&gt;
   * For more information about intents, see the &lt;a href="https://dialogflow.com/docs/intents"&gt;Dialogflow documentation&lt;/a&gt;.
   * </pre>
   */
  public static final class IntentsBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<IntentsBlockingV2Stub> {
    private IntentsBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntentsBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntentsBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all intents in the specified agent.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.ListIntentsResponse listIntents(ondewo.nlu.IntentOuterClass.ListIntentsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListIntentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the specified intent.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.Intent getIntent(ondewo.nlu.IntentOuterClass.GetIntentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetIntentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an intent in the specified agent.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.Intent createIntent(ondewo.nlu.IntentOuterClass.CreateIntentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateIntentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified intent.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.Intent updateIntent(ondewo.nlu.IntentOuterClass.UpdateIntentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateIntentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified intent.
     * </pre>
     */
    public com.google.protobuf.Empty deleteIntent(ondewo.nlu.IntentOuterClass.DeleteIntentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteIntentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates/Creates multiple intents in the specified agent.
     * Operation &amp;lt;response: &lt;a href="index.html#ondewo.nlu.BatchUpdateIntentsResponse"&gt;BatchUpdateIntentsResponse&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchUpdateIntentsResponse batchUpdateIntents(ondewo.nlu.IntentOuterClass.BatchUpdateIntentsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchUpdateIntentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes intents in the specified agent.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation batchDeleteIntents(ondewo.nlu.IntentOuterClass.BatchDeleteIntentsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchDeleteIntentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Tags a specific intent with tag(s)
     * </pre>
     */
    public com.google.protobuf.Empty tagIntent(ondewo.nlu.IntentOuterClass.IntentTagRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getTagIntentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes tag(s) for a specific intent
     * </pre>
     */
    public com.google.protobuf.Empty deleteIntentTag(ondewo.nlu.IntentOuterClass.IntentTagRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteIntentTagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets all the tags for a specific intent
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.GetIntentTagsResponse getIntentTags(ondewo.nlu.IntentOuterClass.GetIntentTagsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetIntentTagsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets all the tags for all the intents
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.GetIntentTagsResponse getAllIntentTags(ondewo.nlu.IntentOuterClass.GetAllIntentTagsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetAllIntentTagsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates batch of training phrases
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse batchCreateTrainingPhrases(ondewo.nlu.IntentOuterClass.BatchCreateTrainingPhrasesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchCreateTrainingPhrasesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a training phrases batch of the specified names.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse batchGetTrainingPhrases(ondewo.nlu.IntentOuterClass.BatchGetTrainingPhrasesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchGetTrainingPhrasesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates batch of training phrases
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse batchUpdateTrainingPhrases(ondewo.nlu.IntentOuterClass.BatchUpdateTrainingPhrasesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchUpdateTrainingPhrasesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a training phrases batch of the specified names.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesResponse batchDeleteTrainingPhrases(ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchDeleteTrainingPhrasesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List training phrases (of a specific intent).
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.ListTrainingPhrasesResponse listTrainingPhrases(ondewo.nlu.IntentOuterClass.ListTrainingPhrasesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListTrainingPhrasesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates batch of intent messages
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse batchCreateResponseMessages(ondewo.nlu.IntentOuterClass.BatchCreateResponseMessagesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchCreateResponseMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a intent messages batch of the specified names.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse batchGetResponseMessages(ondewo.nlu.IntentOuterClass.BatchGetResponseMessagesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchGetResponseMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates batch of intent messages
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse batchUpdateResponseMessages(ondewo.nlu.IntentOuterClass.BatchUpdateResponseMessagesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchUpdateResponseMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a intent messages batch of the specified names.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesResponse batchDeleteResponseMessages(ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchDeleteResponseMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List messages (of a specific intent).
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.ListResponseMessagesResponse listResponseMessages(ondewo.nlu.IntentOuterClass.ListResponseMessagesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListResponseMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates batch of intent messages
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse batchCreateParameters(ondewo.nlu.IntentOuterClass.BatchCreateParametersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchCreateParametersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a intent messages batch of the specified names.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse batchGetParameters(ondewo.nlu.IntentOuterClass.BatchGetParametersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchGetParametersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates batch of intent messages
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse batchUpdateParameters(ondewo.nlu.IntentOuterClass.BatchUpdateParametersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchUpdateParametersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a intent messages batch of the specified names.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchDeleteParametersResponse batchDeleteParameters(ondewo.nlu.IntentOuterClass.BatchDeleteParametersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchDeleteParametersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List messages (of a specific intent).
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.ListParametersResponse listParameters(ondewo.nlu.IntentOuterClass.ListParametersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListParametersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Training phrases (of a specific intent).
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentResponse listTrainingPhrasesofIntentsWithEnrichment(ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListTrainingPhrasesofIntentsWithEnrichmentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Intents.
   * <pre>
   * An intent represents a mapping between input from a user and an action to be taken by your application. When you pass user input to the &lt;a href="index.html#ondewo.nlu.Sessions.DetectIntent"&gt;DetectIntent&lt;/a&gt; (or &lt;a href="index.html#ondewo.nlu.Sessions.StreamingDetectIntent"&gt;StreamingDetectIntent&lt;/a&gt;) method, the Dialogflow API analyzes the input and searches for a matching intent. If no match is found, the Dialogflow API returns a fallback intent (&lt;code&gt;is_fallback&lt;/code&gt; = true).
   * You can provide additional information for the Dialogflow API to use to match user input to an intent by adding the following to your intent.
   * &lt;ul&gt;
   *   &lt;li&gt;&lt;strong&gt;Contexts&lt;/strong&gt; - provide additional context for intent analysis. For example, if an intent is related to an object in your application that plays music, you can provide a context to determine when to match the intent if the user input is &amp;quot;turn it off&amp;quot;.  You can include a context that matches the intent when there is previous user input of &amp;quot;play music&amp;quot;, and not when there is previous user input of &amp;quot;turn on the light&amp;quot;.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;Events&lt;/strong&gt; - allow for matching an intent by using an event name instead of user input. Your application can provide an event name and related parameters to the Dialogflow API to match an intent. For example, when your application starts, you can send a welcome event with a user name parameter to the Dialogflow API to match an intent with a personalized welcome message for the user.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;Training phrases&lt;/strong&gt; - provide examples of user input to train the Dialogflow API agent to better match intents.&lt;/li&gt;
   * &lt;/ul&gt;
   * For more information about intents, see the &lt;a href="https://dialogflow.com/docs/intents"&gt;Dialogflow documentation&lt;/a&gt;.
   * </pre>
   */
  public static final class IntentsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IntentsBlockingStub> {
    private IntentsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntentsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntentsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all intents in the specified agent.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.ListIntentsResponse listIntents(ondewo.nlu.IntentOuterClass.ListIntentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListIntentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the specified intent.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.Intent getIntent(ondewo.nlu.IntentOuterClass.GetIntentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIntentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an intent in the specified agent.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.Intent createIntent(ondewo.nlu.IntentOuterClass.CreateIntentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateIntentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified intent.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.Intent updateIntent(ondewo.nlu.IntentOuterClass.UpdateIntentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateIntentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified intent.
     * </pre>
     */
    public com.google.protobuf.Empty deleteIntent(ondewo.nlu.IntentOuterClass.DeleteIntentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteIntentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates/Creates multiple intents in the specified agent.
     * Operation &amp;lt;response: &lt;a href="index.html#ondewo.nlu.BatchUpdateIntentsResponse"&gt;BatchUpdateIntentsResponse&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchUpdateIntentsResponse batchUpdateIntents(ondewo.nlu.IntentOuterClass.BatchUpdateIntentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchUpdateIntentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes intents in the specified agent.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation batchDeleteIntents(ondewo.nlu.IntentOuterClass.BatchDeleteIntentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchDeleteIntentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Tags a specific intent with tag(s)
     * </pre>
     */
    public com.google.protobuf.Empty tagIntent(ondewo.nlu.IntentOuterClass.IntentTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTagIntentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes tag(s) for a specific intent
     * </pre>
     */
    public com.google.protobuf.Empty deleteIntentTag(ondewo.nlu.IntentOuterClass.IntentTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteIntentTagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets all the tags for a specific intent
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.GetIntentTagsResponse getIntentTags(ondewo.nlu.IntentOuterClass.GetIntentTagsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIntentTagsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets all the tags for all the intents
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.GetIntentTagsResponse getAllIntentTags(ondewo.nlu.IntentOuterClass.GetAllIntentTagsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllIntentTagsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates batch of training phrases
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse batchCreateTrainingPhrases(ondewo.nlu.IntentOuterClass.BatchCreateTrainingPhrasesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchCreateTrainingPhrasesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a training phrases batch of the specified names.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse batchGetTrainingPhrases(ondewo.nlu.IntentOuterClass.BatchGetTrainingPhrasesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchGetTrainingPhrasesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates batch of training phrases
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse batchUpdateTrainingPhrases(ondewo.nlu.IntentOuterClass.BatchUpdateTrainingPhrasesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchUpdateTrainingPhrasesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a training phrases batch of the specified names.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesResponse batchDeleteTrainingPhrases(ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchDeleteTrainingPhrasesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List training phrases (of a specific intent).
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.ListTrainingPhrasesResponse listTrainingPhrases(ondewo.nlu.IntentOuterClass.ListTrainingPhrasesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTrainingPhrasesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates batch of intent messages
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse batchCreateResponseMessages(ondewo.nlu.IntentOuterClass.BatchCreateResponseMessagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchCreateResponseMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a intent messages batch of the specified names.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse batchGetResponseMessages(ondewo.nlu.IntentOuterClass.BatchGetResponseMessagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchGetResponseMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates batch of intent messages
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse batchUpdateResponseMessages(ondewo.nlu.IntentOuterClass.BatchUpdateResponseMessagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchUpdateResponseMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a intent messages batch of the specified names.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesResponse batchDeleteResponseMessages(ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchDeleteResponseMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List messages (of a specific intent).
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.ListResponseMessagesResponse listResponseMessages(ondewo.nlu.IntentOuterClass.ListResponseMessagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListResponseMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates batch of intent messages
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse batchCreateParameters(ondewo.nlu.IntentOuterClass.BatchCreateParametersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchCreateParametersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a intent messages batch of the specified names.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse batchGetParameters(ondewo.nlu.IntentOuterClass.BatchGetParametersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchGetParametersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates batch of intent messages
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse batchUpdateParameters(ondewo.nlu.IntentOuterClass.BatchUpdateParametersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchUpdateParametersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a intent messages batch of the specified names.
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.BatchDeleteParametersResponse batchDeleteParameters(ondewo.nlu.IntentOuterClass.BatchDeleteParametersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchDeleteParametersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List messages (of a specific intent).
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.ListParametersResponse listParameters(ondewo.nlu.IntentOuterClass.ListParametersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListParametersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Training phrases (of a specific intent).
     * </pre>
     */
    public ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentResponse listTrainingPhrasesofIntentsWithEnrichment(ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTrainingPhrasesofIntentsWithEnrichmentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Intents.
   * <pre>
   * An intent represents a mapping between input from a user and an action to be taken by your application. When you pass user input to the &lt;a href="index.html#ondewo.nlu.Sessions.DetectIntent"&gt;DetectIntent&lt;/a&gt; (or &lt;a href="index.html#ondewo.nlu.Sessions.StreamingDetectIntent"&gt;StreamingDetectIntent&lt;/a&gt;) method, the Dialogflow API analyzes the input and searches for a matching intent. If no match is found, the Dialogflow API returns a fallback intent (&lt;code&gt;is_fallback&lt;/code&gt; = true).
   * You can provide additional information for the Dialogflow API to use to match user input to an intent by adding the following to your intent.
   * &lt;ul&gt;
   *   &lt;li&gt;&lt;strong&gt;Contexts&lt;/strong&gt; - provide additional context for intent analysis. For example, if an intent is related to an object in your application that plays music, you can provide a context to determine when to match the intent if the user input is &amp;quot;turn it off&amp;quot;.  You can include a context that matches the intent when there is previous user input of &amp;quot;play music&amp;quot;, and not when there is previous user input of &amp;quot;turn on the light&amp;quot;.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;Events&lt;/strong&gt; - allow for matching an intent by using an event name instead of user input. Your application can provide an event name and related parameters to the Dialogflow API to match an intent. For example, when your application starts, you can send a welcome event with a user name parameter to the Dialogflow API to match an intent with a personalized welcome message for the user.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;Training phrases&lt;/strong&gt; - provide examples of user input to train the Dialogflow API agent to better match intents.&lt;/li&gt;
   * &lt;/ul&gt;
   * For more information about intents, see the &lt;a href="https://dialogflow.com/docs/intents"&gt;Dialogflow documentation&lt;/a&gt;.
   * </pre>
   */
  public static final class IntentsFutureStub
      extends io.grpc.stub.AbstractFutureStub<IntentsFutureStub> {
    private IntentsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntentsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntentsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all intents in the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.ListIntentsResponse> listIntents(
        ondewo.nlu.IntentOuterClass.ListIntentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListIntentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the specified intent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.Intent> getIntent(
        ondewo.nlu.IntentOuterClass.GetIntentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIntentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an intent in the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.Intent> createIntent(
        ondewo.nlu.IntentOuterClass.CreateIntentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateIntentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified intent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.Intent> updateIntent(
        ondewo.nlu.IntentOuterClass.UpdateIntentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateIntentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified intent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteIntent(
        ondewo.nlu.IntentOuterClass.DeleteIntentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteIntentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates/Creates multiple intents in the specified agent.
     * Operation &amp;lt;response: &lt;a href="index.html#ondewo.nlu.BatchUpdateIntentsResponse"&gt;BatchUpdateIntentsResponse&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.BatchUpdateIntentsResponse> batchUpdateIntents(
        ondewo.nlu.IntentOuterClass.BatchUpdateIntentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchUpdateIntentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes intents in the specified agent.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> batchDeleteIntents(
        ondewo.nlu.IntentOuterClass.BatchDeleteIntentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchDeleteIntentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Tags a specific intent with tag(s)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> tagIntent(
        ondewo.nlu.IntentOuterClass.IntentTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTagIntentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes tag(s) for a specific intent
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteIntentTag(
        ondewo.nlu.IntentOuterClass.IntentTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteIntentTagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets all the tags for a specific intent
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.GetIntentTagsResponse> getIntentTags(
        ondewo.nlu.IntentOuterClass.GetIntentTagsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIntentTagsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets all the tags for all the intents
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.GetIntentTagsResponse> getAllIntentTags(
        ondewo.nlu.IntentOuterClass.GetAllIntentTagsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllIntentTagsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates batch of training phrases
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse> batchCreateTrainingPhrases(
        ondewo.nlu.IntentOuterClass.BatchCreateTrainingPhrasesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchCreateTrainingPhrasesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a training phrases batch of the specified names.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse> batchGetTrainingPhrases(
        ondewo.nlu.IntentOuterClass.BatchGetTrainingPhrasesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchGetTrainingPhrasesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates batch of training phrases
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse> batchUpdateTrainingPhrases(
        ondewo.nlu.IntentOuterClass.BatchUpdateTrainingPhrasesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchUpdateTrainingPhrasesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a training phrases batch of the specified names.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesResponse> batchDeleteTrainingPhrases(
        ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchDeleteTrainingPhrasesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List training phrases (of a specific intent).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.ListTrainingPhrasesResponse> listTrainingPhrases(
        ondewo.nlu.IntentOuterClass.ListTrainingPhrasesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTrainingPhrasesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates batch of intent messages
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse> batchCreateResponseMessages(
        ondewo.nlu.IntentOuterClass.BatchCreateResponseMessagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchCreateResponseMessagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a intent messages batch of the specified names.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse> batchGetResponseMessages(
        ondewo.nlu.IntentOuterClass.BatchGetResponseMessagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchGetResponseMessagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates batch of intent messages
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse> batchUpdateResponseMessages(
        ondewo.nlu.IntentOuterClass.BatchUpdateResponseMessagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchUpdateResponseMessagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a intent messages batch of the specified names.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesResponse> batchDeleteResponseMessages(
        ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchDeleteResponseMessagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List messages (of a specific intent).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.ListResponseMessagesResponse> listResponseMessages(
        ondewo.nlu.IntentOuterClass.ListResponseMessagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListResponseMessagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates batch of intent messages
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse> batchCreateParameters(
        ondewo.nlu.IntentOuterClass.BatchCreateParametersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchCreateParametersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a intent messages batch of the specified names.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse> batchGetParameters(
        ondewo.nlu.IntentOuterClass.BatchGetParametersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchGetParametersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates batch of intent messages
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse> batchUpdateParameters(
        ondewo.nlu.IntentOuterClass.BatchUpdateParametersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchUpdateParametersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a intent messages batch of the specified names.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.BatchDeleteParametersResponse> batchDeleteParameters(
        ondewo.nlu.IntentOuterClass.BatchDeleteParametersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchDeleteParametersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List messages (of a specific intent).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.ListParametersResponse> listParameters(
        ondewo.nlu.IntentOuterClass.ListParametersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListParametersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Training phrases (of a specific intent).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentResponse> listTrainingPhrasesofIntentsWithEnrichment(
        ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTrainingPhrasesofIntentsWithEnrichmentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_INTENTS = 0;
  private static final int METHODID_GET_INTENT = 1;
  private static final int METHODID_CREATE_INTENT = 2;
  private static final int METHODID_UPDATE_INTENT = 3;
  private static final int METHODID_DELETE_INTENT = 4;
  private static final int METHODID_BATCH_UPDATE_INTENTS = 5;
  private static final int METHODID_BATCH_DELETE_INTENTS = 6;
  private static final int METHODID_TAG_INTENT = 7;
  private static final int METHODID_DELETE_INTENT_TAG = 8;
  private static final int METHODID_GET_INTENT_TAGS = 9;
  private static final int METHODID_GET_ALL_INTENT_TAGS = 10;
  private static final int METHODID_BATCH_CREATE_TRAINING_PHRASES = 11;
  private static final int METHODID_BATCH_GET_TRAINING_PHRASES = 12;
  private static final int METHODID_BATCH_UPDATE_TRAINING_PHRASES = 13;
  private static final int METHODID_BATCH_DELETE_TRAINING_PHRASES = 14;
  private static final int METHODID_LIST_TRAINING_PHRASES = 15;
  private static final int METHODID_BATCH_CREATE_RESPONSE_MESSAGES = 16;
  private static final int METHODID_BATCH_GET_RESPONSE_MESSAGES = 17;
  private static final int METHODID_BATCH_UPDATE_RESPONSE_MESSAGES = 18;
  private static final int METHODID_BATCH_DELETE_RESPONSE_MESSAGES = 19;
  private static final int METHODID_LIST_RESPONSE_MESSAGES = 20;
  private static final int METHODID_BATCH_CREATE_PARAMETERS = 21;
  private static final int METHODID_BATCH_GET_PARAMETERS = 22;
  private static final int METHODID_BATCH_UPDATE_PARAMETERS = 23;
  private static final int METHODID_BATCH_DELETE_PARAMETERS = 24;
  private static final int METHODID_LIST_PARAMETERS = 25;
  private static final int METHODID_LIST_TRAINING_PHRASESOF_INTENTS_WITH_ENRICHMENT = 26;

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
        case METHODID_LIST_INTENTS:
          serviceImpl.listIntents((ondewo.nlu.IntentOuterClass.ListIntentsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.ListIntentsResponse>) responseObserver);
          break;
        case METHODID_GET_INTENT:
          serviceImpl.getIntent((ondewo.nlu.IntentOuterClass.GetIntentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.Intent>) responseObserver);
          break;
        case METHODID_CREATE_INTENT:
          serviceImpl.createIntent((ondewo.nlu.IntentOuterClass.CreateIntentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.Intent>) responseObserver);
          break;
        case METHODID_UPDATE_INTENT:
          serviceImpl.updateIntent((ondewo.nlu.IntentOuterClass.UpdateIntentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.Intent>) responseObserver);
          break;
        case METHODID_DELETE_INTENT:
          serviceImpl.deleteIntent((ondewo.nlu.IntentOuterClass.DeleteIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BATCH_UPDATE_INTENTS:
          serviceImpl.batchUpdateIntents((ondewo.nlu.IntentOuterClass.BatchUpdateIntentsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchUpdateIntentsResponse>) responseObserver);
          break;
        case METHODID_BATCH_DELETE_INTENTS:
          serviceImpl.batchDeleteIntents((ondewo.nlu.IntentOuterClass.BatchDeleteIntentsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_TAG_INTENT:
          serviceImpl.tagIntent((ondewo.nlu.IntentOuterClass.IntentTagRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_INTENT_TAG:
          serviceImpl.deleteIntentTag((ondewo.nlu.IntentOuterClass.IntentTagRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_INTENT_TAGS:
          serviceImpl.getIntentTags((ondewo.nlu.IntentOuterClass.GetIntentTagsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.GetIntentTagsResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_INTENT_TAGS:
          serviceImpl.getAllIntentTags((ondewo.nlu.IntentOuterClass.GetAllIntentTagsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.GetIntentTagsResponse>) responseObserver);
          break;
        case METHODID_BATCH_CREATE_TRAINING_PHRASES:
          serviceImpl.batchCreateTrainingPhrases((ondewo.nlu.IntentOuterClass.BatchCreateTrainingPhrasesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse>) responseObserver);
          break;
        case METHODID_BATCH_GET_TRAINING_PHRASES:
          serviceImpl.batchGetTrainingPhrases((ondewo.nlu.IntentOuterClass.BatchGetTrainingPhrasesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse>) responseObserver);
          break;
        case METHODID_BATCH_UPDATE_TRAINING_PHRASES:
          serviceImpl.batchUpdateTrainingPhrases((ondewo.nlu.IntentOuterClass.BatchUpdateTrainingPhrasesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse>) responseObserver);
          break;
        case METHODID_BATCH_DELETE_TRAINING_PHRASES:
          serviceImpl.batchDeleteTrainingPhrases((ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesResponse>) responseObserver);
          break;
        case METHODID_LIST_TRAINING_PHRASES:
          serviceImpl.listTrainingPhrases((ondewo.nlu.IntentOuterClass.ListTrainingPhrasesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.ListTrainingPhrasesResponse>) responseObserver);
          break;
        case METHODID_BATCH_CREATE_RESPONSE_MESSAGES:
          serviceImpl.batchCreateResponseMessages((ondewo.nlu.IntentOuterClass.BatchCreateResponseMessagesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse>) responseObserver);
          break;
        case METHODID_BATCH_GET_RESPONSE_MESSAGES:
          serviceImpl.batchGetResponseMessages((ondewo.nlu.IntentOuterClass.BatchGetResponseMessagesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse>) responseObserver);
          break;
        case METHODID_BATCH_UPDATE_RESPONSE_MESSAGES:
          serviceImpl.batchUpdateResponseMessages((ondewo.nlu.IntentOuterClass.BatchUpdateResponseMessagesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse>) responseObserver);
          break;
        case METHODID_BATCH_DELETE_RESPONSE_MESSAGES:
          serviceImpl.batchDeleteResponseMessages((ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesResponse>) responseObserver);
          break;
        case METHODID_LIST_RESPONSE_MESSAGES:
          serviceImpl.listResponseMessages((ondewo.nlu.IntentOuterClass.ListResponseMessagesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.ListResponseMessagesResponse>) responseObserver);
          break;
        case METHODID_BATCH_CREATE_PARAMETERS:
          serviceImpl.batchCreateParameters((ondewo.nlu.IntentOuterClass.BatchCreateParametersRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse>) responseObserver);
          break;
        case METHODID_BATCH_GET_PARAMETERS:
          serviceImpl.batchGetParameters((ondewo.nlu.IntentOuterClass.BatchGetParametersRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse>) responseObserver);
          break;
        case METHODID_BATCH_UPDATE_PARAMETERS:
          serviceImpl.batchUpdateParameters((ondewo.nlu.IntentOuterClass.BatchUpdateParametersRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse>) responseObserver);
          break;
        case METHODID_BATCH_DELETE_PARAMETERS:
          serviceImpl.batchDeleteParameters((ondewo.nlu.IntentOuterClass.BatchDeleteParametersRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.BatchDeleteParametersResponse>) responseObserver);
          break;
        case METHODID_LIST_PARAMETERS:
          serviceImpl.listParameters((ondewo.nlu.IntentOuterClass.ListParametersRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.ListParametersResponse>) responseObserver);
          break;
        case METHODID_LIST_TRAINING_PHRASESOF_INTENTS_WITH_ENRICHMENT:
          serviceImpl.listTrainingPhrasesofIntentsWithEnrichment((ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentResponse>) responseObserver);
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
          getListIntentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.ListIntentsRequest,
              ondewo.nlu.IntentOuterClass.ListIntentsResponse>(
                service, METHODID_LIST_INTENTS)))
        .addMethod(
          getGetIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.GetIntentRequest,
              ondewo.nlu.IntentOuterClass.Intent>(
                service, METHODID_GET_INTENT)))
        .addMethod(
          getCreateIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.CreateIntentRequest,
              ondewo.nlu.IntentOuterClass.Intent>(
                service, METHODID_CREATE_INTENT)))
        .addMethod(
          getUpdateIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.UpdateIntentRequest,
              ondewo.nlu.IntentOuterClass.Intent>(
                service, METHODID_UPDATE_INTENT)))
        .addMethod(
          getDeleteIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.DeleteIntentRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_INTENT)))
        .addMethod(
          getBatchUpdateIntentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.BatchUpdateIntentsRequest,
              ondewo.nlu.IntentOuterClass.BatchUpdateIntentsResponse>(
                service, METHODID_BATCH_UPDATE_INTENTS)))
        .addMethod(
          getBatchDeleteIntentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.BatchDeleteIntentsRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_BATCH_DELETE_INTENTS)))
        .addMethod(
          getTagIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.IntentTagRequest,
              com.google.protobuf.Empty>(
                service, METHODID_TAG_INTENT)))
        .addMethod(
          getDeleteIntentTagMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.IntentTagRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_INTENT_TAG)))
        .addMethod(
          getGetIntentTagsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.GetIntentTagsRequest,
              ondewo.nlu.IntentOuterClass.GetIntentTagsResponse>(
                service, METHODID_GET_INTENT_TAGS)))
        .addMethod(
          getGetAllIntentTagsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.GetAllIntentTagsRequest,
              ondewo.nlu.IntentOuterClass.GetIntentTagsResponse>(
                service, METHODID_GET_ALL_INTENT_TAGS)))
        .addMethod(
          getBatchCreateTrainingPhrasesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.BatchCreateTrainingPhrasesRequest,
              ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse>(
                service, METHODID_BATCH_CREATE_TRAINING_PHRASES)))
        .addMethod(
          getBatchGetTrainingPhrasesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.BatchGetTrainingPhrasesRequest,
              ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse>(
                service, METHODID_BATCH_GET_TRAINING_PHRASES)))
        .addMethod(
          getBatchUpdateTrainingPhrasesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.BatchUpdateTrainingPhrasesRequest,
              ondewo.nlu.IntentOuterClass.BatchTrainingPhrasesStatusResponse>(
                service, METHODID_BATCH_UPDATE_TRAINING_PHRASES)))
        .addMethod(
          getBatchDeleteTrainingPhrasesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesRequest,
              ondewo.nlu.IntentOuterClass.BatchDeleteTrainingPhrasesResponse>(
                service, METHODID_BATCH_DELETE_TRAINING_PHRASES)))
        .addMethod(
          getListTrainingPhrasesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.ListTrainingPhrasesRequest,
              ondewo.nlu.IntentOuterClass.ListTrainingPhrasesResponse>(
                service, METHODID_LIST_TRAINING_PHRASES)))
        .addMethod(
          getBatchCreateResponseMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.BatchCreateResponseMessagesRequest,
              ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse>(
                service, METHODID_BATCH_CREATE_RESPONSE_MESSAGES)))
        .addMethod(
          getBatchGetResponseMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.BatchGetResponseMessagesRequest,
              ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse>(
                service, METHODID_BATCH_GET_RESPONSE_MESSAGES)))
        .addMethod(
          getBatchUpdateResponseMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.BatchUpdateResponseMessagesRequest,
              ondewo.nlu.IntentOuterClass.BatchResponseMessagesStatusResponse>(
                service, METHODID_BATCH_UPDATE_RESPONSE_MESSAGES)))
        .addMethod(
          getBatchDeleteResponseMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesRequest,
              ondewo.nlu.IntentOuterClass.BatchDeleteResponseMessagesResponse>(
                service, METHODID_BATCH_DELETE_RESPONSE_MESSAGES)))
        .addMethod(
          getListResponseMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.ListResponseMessagesRequest,
              ondewo.nlu.IntentOuterClass.ListResponseMessagesResponse>(
                service, METHODID_LIST_RESPONSE_MESSAGES)))
        .addMethod(
          getBatchCreateParametersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.BatchCreateParametersRequest,
              ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse>(
                service, METHODID_BATCH_CREATE_PARAMETERS)))
        .addMethod(
          getBatchGetParametersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.BatchGetParametersRequest,
              ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse>(
                service, METHODID_BATCH_GET_PARAMETERS)))
        .addMethod(
          getBatchUpdateParametersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.BatchUpdateParametersRequest,
              ondewo.nlu.IntentOuterClass.BatchParametersStatusResponse>(
                service, METHODID_BATCH_UPDATE_PARAMETERS)))
        .addMethod(
          getBatchDeleteParametersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.BatchDeleteParametersRequest,
              ondewo.nlu.IntentOuterClass.BatchDeleteParametersResponse>(
                service, METHODID_BATCH_DELETE_PARAMETERS)))
        .addMethod(
          getListParametersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.ListParametersRequest,
              ondewo.nlu.IntentOuterClass.ListParametersResponse>(
                service, METHODID_LIST_PARAMETERS)))
        .addMethod(
          getListTrainingPhrasesofIntentsWithEnrichmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentRequest,
              ondewo.nlu.IntentOuterClass.ListTrainingPhrasesofIntentsWithEnrichmentResponse>(
                service, METHODID_LIST_TRAINING_PHRASESOF_INTENTS_WITH_ENRICHMENT)))
        .build();
  }

  private static abstract class IntentsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IntentsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ondewo.nlu.IntentOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Intents");
    }
  }

  private static final class IntentsFileDescriptorSupplier
      extends IntentsBaseDescriptorSupplier {
    IntentsFileDescriptorSupplier() {}
  }

  private static final class IntentsMethodDescriptorSupplier
      extends IntentsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    IntentsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (IntentsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IntentsFileDescriptorSupplier())
              .addMethod(getListIntentsMethod())
              .addMethod(getGetIntentMethod())
              .addMethod(getCreateIntentMethod())
              .addMethod(getUpdateIntentMethod())
              .addMethod(getDeleteIntentMethod())
              .addMethod(getBatchUpdateIntentsMethod())
              .addMethod(getBatchDeleteIntentsMethod())
              .addMethod(getTagIntentMethod())
              .addMethod(getDeleteIntentTagMethod())
              .addMethod(getGetIntentTagsMethod())
              .addMethod(getGetAllIntentTagsMethod())
              .addMethod(getBatchCreateTrainingPhrasesMethod())
              .addMethod(getBatchGetTrainingPhrasesMethod())
              .addMethod(getBatchUpdateTrainingPhrasesMethod())
              .addMethod(getBatchDeleteTrainingPhrasesMethod())
              .addMethod(getListTrainingPhrasesMethod())
              .addMethod(getBatchCreateResponseMessagesMethod())
              .addMethod(getBatchGetResponseMessagesMethod())
              .addMethod(getBatchUpdateResponseMessagesMethod())
              .addMethod(getBatchDeleteResponseMessagesMethod())
              .addMethod(getListResponseMessagesMethod())
              .addMethod(getBatchCreateParametersMethod())
              .addMethod(getBatchGetParametersMethod())
              .addMethod(getBatchUpdateParametersMethod())
              .addMethod(getBatchDeleteParametersMethod())
              .addMethod(getListParametersMethod())
              .addMethod(getListTrainingPhrasesofIntentsWithEnrichmentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
