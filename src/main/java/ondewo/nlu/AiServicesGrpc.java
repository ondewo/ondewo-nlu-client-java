package ondewo.nlu;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The Central class defining the ondewo ai services
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class AiServicesGrpc {

  private AiServicesGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.nlu.AiServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.ExtractEntitiesRequest,
      ondewo.nlu.Aiservices.ExtractEntitiesResponse> getExtractEntitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExtractEntities",
      requestType = ondewo.nlu.Aiservices.ExtractEntitiesRequest.class,
      responseType = ondewo.nlu.Aiservices.ExtractEntitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.ExtractEntitiesRequest,
      ondewo.nlu.Aiservices.ExtractEntitiesResponse> getExtractEntitiesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.ExtractEntitiesRequest, ondewo.nlu.Aiservices.ExtractEntitiesResponse> getExtractEntitiesMethod;
    if ((getExtractEntitiesMethod = AiServicesGrpc.getExtractEntitiesMethod) == null) {
      synchronized (AiServicesGrpc.class) {
        if ((getExtractEntitiesMethod = AiServicesGrpc.getExtractEntitiesMethod) == null) {
          AiServicesGrpc.getExtractEntitiesMethod = getExtractEntitiesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Aiservices.ExtractEntitiesRequest, ondewo.nlu.Aiservices.ExtractEntitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExtractEntities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.ExtractEntitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.ExtractEntitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AiServicesMethodDescriptorSupplier("ExtractEntities"))
              .build();
        }
      }
    }
    return getExtractEntitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.GenerateUserSaysRequest,
      ondewo.nlu.Aiservices.GenerateUserSaysResponse> getGenerateUserSaysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateUserSays",
      requestType = ondewo.nlu.Aiservices.GenerateUserSaysRequest.class,
      responseType = ondewo.nlu.Aiservices.GenerateUserSaysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.GenerateUserSaysRequest,
      ondewo.nlu.Aiservices.GenerateUserSaysResponse> getGenerateUserSaysMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.GenerateUserSaysRequest, ondewo.nlu.Aiservices.GenerateUserSaysResponse> getGenerateUserSaysMethod;
    if ((getGenerateUserSaysMethod = AiServicesGrpc.getGenerateUserSaysMethod) == null) {
      synchronized (AiServicesGrpc.class) {
        if ((getGenerateUserSaysMethod = AiServicesGrpc.getGenerateUserSaysMethod) == null) {
          AiServicesGrpc.getGenerateUserSaysMethod = getGenerateUserSaysMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Aiservices.GenerateUserSaysRequest, ondewo.nlu.Aiservices.GenerateUserSaysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateUserSays"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.GenerateUserSaysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.GenerateUserSaysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AiServicesMethodDescriptorSupplier("GenerateUserSays"))
              .build();
        }
      }
    }
    return getGenerateUserSaysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.GenerateResponsesRequest,
      ondewo.nlu.Aiservices.GenerateResponsesResponse> getGenerateResponsesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateResponses",
      requestType = ondewo.nlu.Aiservices.GenerateResponsesRequest.class,
      responseType = ondewo.nlu.Aiservices.GenerateResponsesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.GenerateResponsesRequest,
      ondewo.nlu.Aiservices.GenerateResponsesResponse> getGenerateResponsesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.GenerateResponsesRequest, ondewo.nlu.Aiservices.GenerateResponsesResponse> getGenerateResponsesMethod;
    if ((getGenerateResponsesMethod = AiServicesGrpc.getGenerateResponsesMethod) == null) {
      synchronized (AiServicesGrpc.class) {
        if ((getGenerateResponsesMethod = AiServicesGrpc.getGenerateResponsesMethod) == null) {
          AiServicesGrpc.getGenerateResponsesMethod = getGenerateResponsesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Aiservices.GenerateResponsesRequest, ondewo.nlu.Aiservices.GenerateResponsesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateResponses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.GenerateResponsesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.GenerateResponsesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AiServicesMethodDescriptorSupplier("GenerateResponses"))
              .build();
        }
      }
    }
    return getGenerateResponsesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.GetAlternativeSentencesRequest,
      ondewo.nlu.Aiservices.GetAlternativeSentencesResponse> getGetAlternativeSentencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAlternativeSentences",
      requestType = ondewo.nlu.Aiservices.GetAlternativeSentencesRequest.class,
      responseType = ondewo.nlu.Aiservices.GetAlternativeSentencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.GetAlternativeSentencesRequest,
      ondewo.nlu.Aiservices.GetAlternativeSentencesResponse> getGetAlternativeSentencesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.GetAlternativeSentencesRequest, ondewo.nlu.Aiservices.GetAlternativeSentencesResponse> getGetAlternativeSentencesMethod;
    if ((getGetAlternativeSentencesMethod = AiServicesGrpc.getGetAlternativeSentencesMethod) == null) {
      synchronized (AiServicesGrpc.class) {
        if ((getGetAlternativeSentencesMethod = AiServicesGrpc.getGetAlternativeSentencesMethod) == null) {
          AiServicesGrpc.getGetAlternativeSentencesMethod = getGetAlternativeSentencesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Aiservices.GetAlternativeSentencesRequest, ondewo.nlu.Aiservices.GetAlternativeSentencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAlternativeSentences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.GetAlternativeSentencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.GetAlternativeSentencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AiServicesMethodDescriptorSupplier("GetAlternativeSentences"))
              .build();
        }
      }
    }
    return getGetAlternativeSentencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesRequest,
      ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesResponse> getGetAlternativeTrainingPhrasesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAlternativeTrainingPhrases",
      requestType = ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesRequest.class,
      responseType = ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesRequest,
      ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesResponse> getGetAlternativeTrainingPhrasesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesRequest, ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesResponse> getGetAlternativeTrainingPhrasesMethod;
    if ((getGetAlternativeTrainingPhrasesMethod = AiServicesGrpc.getGetAlternativeTrainingPhrasesMethod) == null) {
      synchronized (AiServicesGrpc.class) {
        if ((getGetAlternativeTrainingPhrasesMethod = AiServicesGrpc.getGetAlternativeTrainingPhrasesMethod) == null) {
          AiServicesGrpc.getGetAlternativeTrainingPhrasesMethod = getGetAlternativeTrainingPhrasesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesRequest, ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAlternativeTrainingPhrases"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AiServicesMethodDescriptorSupplier("GetAlternativeTrainingPhrases"))
              .build();
        }
      }
    }
    return getGetAlternativeTrainingPhrasesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.GetSynonymsRequest,
      ondewo.nlu.Aiservices.GetSynonymsResponse> getGetSynonymsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSynonyms",
      requestType = ondewo.nlu.Aiservices.GetSynonymsRequest.class,
      responseType = ondewo.nlu.Aiservices.GetSynonymsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.GetSynonymsRequest,
      ondewo.nlu.Aiservices.GetSynonymsResponse> getGetSynonymsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.GetSynonymsRequest, ondewo.nlu.Aiservices.GetSynonymsResponse> getGetSynonymsMethod;
    if ((getGetSynonymsMethod = AiServicesGrpc.getGetSynonymsMethod) == null) {
      synchronized (AiServicesGrpc.class) {
        if ((getGetSynonymsMethod = AiServicesGrpc.getGetSynonymsMethod) == null) {
          AiServicesGrpc.getGetSynonymsMethod = getGetSynonymsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Aiservices.GetSynonymsRequest, ondewo.nlu.Aiservices.GetSynonymsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSynonyms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.GetSynonymsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.GetSynonymsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AiServicesMethodDescriptorSupplier("GetSynonyms"))
              .build();
        }
      }
    }
    return getGetSynonymsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.ClassifyIntentsRequest,
      ondewo.nlu.Aiservices.ClassifyIntentsResponse> getClassifyIntentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClassifyIntents",
      requestType = ondewo.nlu.Aiservices.ClassifyIntentsRequest.class,
      responseType = ondewo.nlu.Aiservices.ClassifyIntentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.ClassifyIntentsRequest,
      ondewo.nlu.Aiservices.ClassifyIntentsResponse> getClassifyIntentsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.ClassifyIntentsRequest, ondewo.nlu.Aiservices.ClassifyIntentsResponse> getClassifyIntentsMethod;
    if ((getClassifyIntentsMethod = AiServicesGrpc.getClassifyIntentsMethod) == null) {
      synchronized (AiServicesGrpc.class) {
        if ((getClassifyIntentsMethod = AiServicesGrpc.getClassifyIntentsMethod) == null) {
          AiServicesGrpc.getClassifyIntentsMethod = getClassifyIntentsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Aiservices.ClassifyIntentsRequest, ondewo.nlu.Aiservices.ClassifyIntentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClassifyIntents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.ClassifyIntentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.ClassifyIntentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AiServicesMethodDescriptorSupplier("ClassifyIntents"))
              .build();
        }
      }
    }
    return getClassifyIntentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.ExtractEntitiesFuzzyRequest,
      ondewo.nlu.Aiservices.ExtractEntitiesResponse> getExtractEntitiesFuzzyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExtractEntitiesFuzzy",
      requestType = ondewo.nlu.Aiservices.ExtractEntitiesFuzzyRequest.class,
      responseType = ondewo.nlu.Aiservices.ExtractEntitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.ExtractEntitiesFuzzyRequest,
      ondewo.nlu.Aiservices.ExtractEntitiesResponse> getExtractEntitiesFuzzyMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.ExtractEntitiesFuzzyRequest, ondewo.nlu.Aiservices.ExtractEntitiesResponse> getExtractEntitiesFuzzyMethod;
    if ((getExtractEntitiesFuzzyMethod = AiServicesGrpc.getExtractEntitiesFuzzyMethod) == null) {
      synchronized (AiServicesGrpc.class) {
        if ((getExtractEntitiesFuzzyMethod = AiServicesGrpc.getExtractEntitiesFuzzyMethod) == null) {
          AiServicesGrpc.getExtractEntitiesFuzzyMethod = getExtractEntitiesFuzzyMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Aiservices.ExtractEntitiesFuzzyRequest, ondewo.nlu.Aiservices.ExtractEntitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExtractEntitiesFuzzy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.ExtractEntitiesFuzzyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.ExtractEntitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AiServicesMethodDescriptorSupplier("ExtractEntitiesFuzzy"))
              .build();
        }
      }
    }
    return getExtractEntitiesFuzzyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.LlmGenerateRequest,
      ondewo.nlu.Aiservices.LlmGenerateResponse> getLlmGenerateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmGenerate",
      requestType = ondewo.nlu.Aiservices.LlmGenerateRequest.class,
      responseType = ondewo.nlu.Aiservices.LlmGenerateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.LlmGenerateRequest,
      ondewo.nlu.Aiservices.LlmGenerateResponse> getLlmGenerateMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.LlmGenerateRequest, ondewo.nlu.Aiservices.LlmGenerateResponse> getLlmGenerateMethod;
    if ((getLlmGenerateMethod = AiServicesGrpc.getLlmGenerateMethod) == null) {
      synchronized (AiServicesGrpc.class) {
        if ((getLlmGenerateMethod = AiServicesGrpc.getLlmGenerateMethod) == null) {
          AiServicesGrpc.getLlmGenerateMethod = getLlmGenerateMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Aiservices.LlmGenerateRequest, ondewo.nlu.Aiservices.LlmGenerateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmGenerate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.LlmGenerateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.LlmGenerateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AiServicesMethodDescriptorSupplier("LlmGenerate"))
              .build();
        }
      }
    }
    return getLlmGenerateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.LlmGenerateRequest,
      ondewo.nlu.Aiservices.StreamingLlmGenerateResponse> getStreamingLlmGenerateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamingLlmGenerate",
      requestType = ondewo.nlu.Aiservices.LlmGenerateRequest.class,
      responseType = ondewo.nlu.Aiservices.StreamingLlmGenerateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.LlmGenerateRequest,
      ondewo.nlu.Aiservices.StreamingLlmGenerateResponse> getStreamingLlmGenerateMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.LlmGenerateRequest, ondewo.nlu.Aiservices.StreamingLlmGenerateResponse> getStreamingLlmGenerateMethod;
    if ((getStreamingLlmGenerateMethod = AiServicesGrpc.getStreamingLlmGenerateMethod) == null) {
      synchronized (AiServicesGrpc.class) {
        if ((getStreamingLlmGenerateMethod = AiServicesGrpc.getStreamingLlmGenerateMethod) == null) {
          AiServicesGrpc.getStreamingLlmGenerateMethod = getStreamingLlmGenerateMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Aiservices.LlmGenerateRequest, ondewo.nlu.Aiservices.StreamingLlmGenerateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamingLlmGenerate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.LlmGenerateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.StreamingLlmGenerateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AiServicesMethodDescriptorSupplier("StreamingLlmGenerate"))
              .build();
        }
      }
    }
    return getStreamingLlmGenerateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.ListLlmModelsRequest,
      ondewo.nlu.Aiservices.ListLlmModelsResponse> getListLlmModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLlmModels",
      requestType = ondewo.nlu.Aiservices.ListLlmModelsRequest.class,
      responseType = ondewo.nlu.Aiservices.ListLlmModelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.ListLlmModelsRequest,
      ondewo.nlu.Aiservices.ListLlmModelsResponse> getListLlmModelsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Aiservices.ListLlmModelsRequest, ondewo.nlu.Aiservices.ListLlmModelsResponse> getListLlmModelsMethod;
    if ((getListLlmModelsMethod = AiServicesGrpc.getListLlmModelsMethod) == null) {
      synchronized (AiServicesGrpc.class) {
        if ((getListLlmModelsMethod = AiServicesGrpc.getListLlmModelsMethod) == null) {
          AiServicesGrpc.getListLlmModelsMethod = getListLlmModelsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Aiservices.ListLlmModelsRequest, ondewo.nlu.Aiservices.ListLlmModelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLlmModels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.ListLlmModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Aiservices.ListLlmModelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AiServicesMethodDescriptorSupplier("ListLlmModels"))
              .build();
        }
      }
    }
    return getListLlmModelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AiServicesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AiServicesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AiServicesStub>() {
        @java.lang.Override
        public AiServicesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AiServicesStub(channel, callOptions);
        }
      };
    return AiServicesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AiServicesBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AiServicesBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AiServicesBlockingV2Stub>() {
        @java.lang.Override
        public AiServicesBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AiServicesBlockingV2Stub(channel, callOptions);
        }
      };
    return AiServicesBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AiServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AiServicesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AiServicesBlockingStub>() {
        @java.lang.Override
        public AiServicesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AiServicesBlockingStub(channel, callOptions);
        }
      };
    return AiServicesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AiServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AiServicesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AiServicesFutureStub>() {
        @java.lang.Override
        public AiServicesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AiServicesFutureStub(channel, callOptions);
        }
      };
    return AiServicesFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The Central class defining the ondewo ai services
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Processes a natural language query and returns detected entities
     * </pre>
     */
    default void extractEntities(ondewo.nlu.Aiservices.ExtractEntitiesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.ExtractEntitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExtractEntitiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates a list of training phrases
     * </pre>
     */
    default void generateUserSays(ondewo.nlu.Aiservices.GenerateUserSaysRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.GenerateUserSaysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateUserSaysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generate responses from all intents using synonyms
     * </pre>
     */
    default void generateResponses(ondewo.nlu.Aiservices.GenerateResponsesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.GenerateResponsesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateResponsesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates alternative phrase based on original phrase
     * </pre>
     */
    default void getAlternativeSentences(ondewo.nlu.Aiservices.GetAlternativeSentencesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.GetAlternativeSentencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAlternativeSentencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates alternative training phrase based on original training phrase
     * </pre>
     */
    default void getAlternativeTrainingPhrases(ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAlternativeTrainingPhrasesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates synonyms for a certain word
     * </pre>
     */
    default void getSynonyms(ondewo.nlu.Aiservices.GetSynonymsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.GetSynonymsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSynonymsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Preprocess text and detects intents in a sentence
     * </pre>
     */
    default void classifyIntents(ondewo.nlu.Aiservices.ClassifyIntentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.ClassifyIntentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClassifyIntentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Processes a natural language query and returns detected entities
     * </pre>
     */
    default void extractEntitiesFuzzy(ondewo.nlu.Aiservices.ExtractEntitiesFuzzyRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.ExtractEntitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExtractEntitiesFuzzyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates a single response from a Large Language Model (LLM).
     * This RPC method allows a client to make a request to the LLM and receive
     * a single complete response based on the input parameters provided.
     * </pre>
     */
    default void llmGenerate(ondewo.nlu.Aiservices.LlmGenerateRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.LlmGenerateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmGenerateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates a response from the LLM in a streaming format.
     * This RPC allows continuous streaming of responses from the model,
     * which is useful for real-time applications or large outputs.
     * </pre>
     */
    default void streamingLlmGenerate(ondewo.nlu.Aiservices.LlmGenerateRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.StreamingLlmGenerateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamingLlmGenerateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists available Large Language Models (LLMs) for a specified CCAI service.
     * This RPC method allows clients to retrieve metadata about all LLM models associated
     * with a particular service within a project, including model names, descriptions, and providers.
     * </pre>
     */
    default void listLlmModels(ondewo.nlu.Aiservices.ListLlmModelsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.ListLlmModelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLlmModelsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AiServices.
   * <pre>
   * The Central class defining the ondewo ai services
   * </pre>
   */
  public static abstract class AiServicesImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AiServicesGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AiServices.
   * <pre>
   * The Central class defining the ondewo ai services
   * </pre>
   */
  public static final class AiServicesStub
      extends io.grpc.stub.AbstractAsyncStub<AiServicesStub> {
    private AiServicesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AiServicesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AiServicesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes a natural language query and returns detected entities
     * </pre>
     */
    public void extractEntities(ondewo.nlu.Aiservices.ExtractEntitiesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.ExtractEntitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExtractEntitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates a list of training phrases
     * </pre>
     */
    public void generateUserSays(ondewo.nlu.Aiservices.GenerateUserSaysRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.GenerateUserSaysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateUserSaysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generate responses from all intents using synonyms
     * </pre>
     */
    public void generateResponses(ondewo.nlu.Aiservices.GenerateResponsesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.GenerateResponsesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateResponsesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates alternative phrase based on original phrase
     * </pre>
     */
    public void getAlternativeSentences(ondewo.nlu.Aiservices.GetAlternativeSentencesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.GetAlternativeSentencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAlternativeSentencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates alternative training phrase based on original training phrase
     * </pre>
     */
    public void getAlternativeTrainingPhrases(ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAlternativeTrainingPhrasesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates synonyms for a certain word
     * </pre>
     */
    public void getSynonyms(ondewo.nlu.Aiservices.GetSynonymsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.GetSynonymsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSynonymsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Preprocess text and detects intents in a sentence
     * </pre>
     */
    public void classifyIntents(ondewo.nlu.Aiservices.ClassifyIntentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.ClassifyIntentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClassifyIntentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Processes a natural language query and returns detected entities
     * </pre>
     */
    public void extractEntitiesFuzzy(ondewo.nlu.Aiservices.ExtractEntitiesFuzzyRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.ExtractEntitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExtractEntitiesFuzzyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates a single response from a Large Language Model (LLM).
     * This RPC method allows a client to make a request to the LLM and receive
     * a single complete response based on the input parameters provided.
     * </pre>
     */
    public void llmGenerate(ondewo.nlu.Aiservices.LlmGenerateRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.LlmGenerateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmGenerateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates a response from the LLM in a streaming format.
     * This RPC allows continuous streaming of responses from the model,
     * which is useful for real-time applications or large outputs.
     * </pre>
     */
    public void streamingLlmGenerate(ondewo.nlu.Aiservices.LlmGenerateRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.StreamingLlmGenerateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamingLlmGenerateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists available Large Language Models (LLMs) for a specified CCAI service.
     * This RPC method allows clients to retrieve metadata about all LLM models associated
     * with a particular service within a project, including model names, descriptions, and providers.
     * </pre>
     */
    public void listLlmModels(ondewo.nlu.Aiservices.ListLlmModelsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.ListLlmModelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLlmModelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AiServices.
   * <pre>
   * The Central class defining the ondewo ai services
   * </pre>
   */
  public static final class AiServicesBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AiServicesBlockingV2Stub> {
    private AiServicesBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AiServicesBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AiServicesBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes a natural language query and returns detected entities
     * </pre>
     */
    public ondewo.nlu.Aiservices.ExtractEntitiesResponse extractEntities(ondewo.nlu.Aiservices.ExtractEntitiesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getExtractEntitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates a list of training phrases
     * </pre>
     */
    public ondewo.nlu.Aiservices.GenerateUserSaysResponse generateUserSays(ondewo.nlu.Aiservices.GenerateUserSaysRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGenerateUserSaysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate responses from all intents using synonyms
     * </pre>
     */
    public ondewo.nlu.Aiservices.GenerateResponsesResponse generateResponses(ondewo.nlu.Aiservices.GenerateResponsesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGenerateResponsesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates alternative phrase based on original phrase
     * </pre>
     */
    public ondewo.nlu.Aiservices.GetAlternativeSentencesResponse getAlternativeSentences(ondewo.nlu.Aiservices.GetAlternativeSentencesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetAlternativeSentencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates alternative training phrase based on original training phrase
     * </pre>
     */
    public ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesResponse getAlternativeTrainingPhrases(ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetAlternativeTrainingPhrasesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates synonyms for a certain word
     * </pre>
     */
    public ondewo.nlu.Aiservices.GetSynonymsResponse getSynonyms(ondewo.nlu.Aiservices.GetSynonymsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetSynonymsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Preprocess text and detects intents in a sentence
     * </pre>
     */
    public ondewo.nlu.Aiservices.ClassifyIntentsResponse classifyIntents(ondewo.nlu.Aiservices.ClassifyIntentsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getClassifyIntentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Processes a natural language query and returns detected entities
     * </pre>
     */
    public ondewo.nlu.Aiservices.ExtractEntitiesResponse extractEntitiesFuzzy(ondewo.nlu.Aiservices.ExtractEntitiesFuzzyRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getExtractEntitiesFuzzyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates a single response from a Large Language Model (LLM).
     * This RPC method allows a client to make a request to the LLM and receive
     * a single complete response based on the input parameters provided.
     * </pre>
     */
    public ondewo.nlu.Aiservices.LlmGenerateResponse llmGenerate(ondewo.nlu.Aiservices.LlmGenerateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmGenerateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates a response from the LLM in a streaming format.
     * This RPC allows continuous streaming of responses from the model,
     * which is useful for real-time applications or large outputs.
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, ondewo.nlu.Aiservices.StreamingLlmGenerateResponse>
        streamingLlmGenerate(ondewo.nlu.Aiservices.LlmGenerateRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getStreamingLlmGenerateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists available Large Language Models (LLMs) for a specified CCAI service.
     * This RPC method allows clients to retrieve metadata about all LLM models associated
     * with a particular service within a project, including model names, descriptions, and providers.
     * </pre>
     */
    public ondewo.nlu.Aiservices.ListLlmModelsResponse listLlmModels(ondewo.nlu.Aiservices.ListLlmModelsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListLlmModelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service AiServices.
   * <pre>
   * The Central class defining the ondewo ai services
   * </pre>
   */
  public static final class AiServicesBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AiServicesBlockingStub> {
    private AiServicesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AiServicesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AiServicesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes a natural language query and returns detected entities
     * </pre>
     */
    public ondewo.nlu.Aiservices.ExtractEntitiesResponse extractEntities(ondewo.nlu.Aiservices.ExtractEntitiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExtractEntitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates a list of training phrases
     * </pre>
     */
    public ondewo.nlu.Aiservices.GenerateUserSaysResponse generateUserSays(ondewo.nlu.Aiservices.GenerateUserSaysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateUserSaysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate responses from all intents using synonyms
     * </pre>
     */
    public ondewo.nlu.Aiservices.GenerateResponsesResponse generateResponses(ondewo.nlu.Aiservices.GenerateResponsesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateResponsesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates alternative phrase based on original phrase
     * </pre>
     */
    public ondewo.nlu.Aiservices.GetAlternativeSentencesResponse getAlternativeSentences(ondewo.nlu.Aiservices.GetAlternativeSentencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAlternativeSentencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates alternative training phrase based on original training phrase
     * </pre>
     */
    public ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesResponse getAlternativeTrainingPhrases(ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAlternativeTrainingPhrasesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates synonyms for a certain word
     * </pre>
     */
    public ondewo.nlu.Aiservices.GetSynonymsResponse getSynonyms(ondewo.nlu.Aiservices.GetSynonymsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSynonymsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Preprocess text and detects intents in a sentence
     * </pre>
     */
    public ondewo.nlu.Aiservices.ClassifyIntentsResponse classifyIntents(ondewo.nlu.Aiservices.ClassifyIntentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClassifyIntentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Processes a natural language query and returns detected entities
     * </pre>
     */
    public ondewo.nlu.Aiservices.ExtractEntitiesResponse extractEntitiesFuzzy(ondewo.nlu.Aiservices.ExtractEntitiesFuzzyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExtractEntitiesFuzzyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates a single response from a Large Language Model (LLM).
     * This RPC method allows a client to make a request to the LLM and receive
     * a single complete response based on the input parameters provided.
     * </pre>
     */
    public ondewo.nlu.Aiservices.LlmGenerateResponse llmGenerate(ondewo.nlu.Aiservices.LlmGenerateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmGenerateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates a response from the LLM in a streaming format.
     * This RPC allows continuous streaming of responses from the model,
     * which is useful for real-time applications or large outputs.
     * </pre>
     */
    public java.util.Iterator<ondewo.nlu.Aiservices.StreamingLlmGenerateResponse> streamingLlmGenerate(
        ondewo.nlu.Aiservices.LlmGenerateRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamingLlmGenerateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists available Large Language Models (LLMs) for a specified CCAI service.
     * This RPC method allows clients to retrieve metadata about all LLM models associated
     * with a particular service within a project, including model names, descriptions, and providers.
     * </pre>
     */
    public ondewo.nlu.Aiservices.ListLlmModelsResponse listLlmModels(ondewo.nlu.Aiservices.ListLlmModelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLlmModelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AiServices.
   * <pre>
   * The Central class defining the ondewo ai services
   * </pre>
   */
  public static final class AiServicesFutureStub
      extends io.grpc.stub.AbstractFutureStub<AiServicesFutureStub> {
    private AiServicesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AiServicesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AiServicesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes a natural language query and returns detected entities
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Aiservices.ExtractEntitiesResponse> extractEntities(
        ondewo.nlu.Aiservices.ExtractEntitiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExtractEntitiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates a list of training phrases
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Aiservices.GenerateUserSaysResponse> generateUserSays(
        ondewo.nlu.Aiservices.GenerateUserSaysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateUserSaysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generate responses from all intents using synonyms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Aiservices.GenerateResponsesResponse> generateResponses(
        ondewo.nlu.Aiservices.GenerateResponsesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateResponsesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates alternative phrase based on original phrase
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Aiservices.GetAlternativeSentencesResponse> getAlternativeSentences(
        ondewo.nlu.Aiservices.GetAlternativeSentencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAlternativeSentencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates alternative training phrase based on original training phrase
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesResponse> getAlternativeTrainingPhrases(
        ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAlternativeTrainingPhrasesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates synonyms for a certain word
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Aiservices.GetSynonymsResponse> getSynonyms(
        ondewo.nlu.Aiservices.GetSynonymsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSynonymsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Preprocess text and detects intents in a sentence
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Aiservices.ClassifyIntentsResponse> classifyIntents(
        ondewo.nlu.Aiservices.ClassifyIntentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClassifyIntentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Processes a natural language query and returns detected entities
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Aiservices.ExtractEntitiesResponse> extractEntitiesFuzzy(
        ondewo.nlu.Aiservices.ExtractEntitiesFuzzyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExtractEntitiesFuzzyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates a single response from a Large Language Model (LLM).
     * This RPC method allows a client to make a request to the LLM and receive
     * a single complete response based on the input parameters provided.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Aiservices.LlmGenerateResponse> llmGenerate(
        ondewo.nlu.Aiservices.LlmGenerateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmGenerateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists available Large Language Models (LLMs) for a specified CCAI service.
     * This RPC method allows clients to retrieve metadata about all LLM models associated
     * with a particular service within a project, including model names, descriptions, and providers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Aiservices.ListLlmModelsResponse> listLlmModels(
        ondewo.nlu.Aiservices.ListLlmModelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLlmModelsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXTRACT_ENTITIES = 0;
  private static final int METHODID_GENERATE_USER_SAYS = 1;
  private static final int METHODID_GENERATE_RESPONSES = 2;
  private static final int METHODID_GET_ALTERNATIVE_SENTENCES = 3;
  private static final int METHODID_GET_ALTERNATIVE_TRAINING_PHRASES = 4;
  private static final int METHODID_GET_SYNONYMS = 5;
  private static final int METHODID_CLASSIFY_INTENTS = 6;
  private static final int METHODID_EXTRACT_ENTITIES_FUZZY = 7;
  private static final int METHODID_LLM_GENERATE = 8;
  private static final int METHODID_STREAMING_LLM_GENERATE = 9;
  private static final int METHODID_LIST_LLM_MODELS = 10;

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
        case METHODID_EXTRACT_ENTITIES:
          serviceImpl.extractEntities((ondewo.nlu.Aiservices.ExtractEntitiesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.ExtractEntitiesResponse>) responseObserver);
          break;
        case METHODID_GENERATE_USER_SAYS:
          serviceImpl.generateUserSays((ondewo.nlu.Aiservices.GenerateUserSaysRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.GenerateUserSaysResponse>) responseObserver);
          break;
        case METHODID_GENERATE_RESPONSES:
          serviceImpl.generateResponses((ondewo.nlu.Aiservices.GenerateResponsesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.GenerateResponsesResponse>) responseObserver);
          break;
        case METHODID_GET_ALTERNATIVE_SENTENCES:
          serviceImpl.getAlternativeSentences((ondewo.nlu.Aiservices.GetAlternativeSentencesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.GetAlternativeSentencesResponse>) responseObserver);
          break;
        case METHODID_GET_ALTERNATIVE_TRAINING_PHRASES:
          serviceImpl.getAlternativeTrainingPhrases((ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesResponse>) responseObserver);
          break;
        case METHODID_GET_SYNONYMS:
          serviceImpl.getSynonyms((ondewo.nlu.Aiservices.GetSynonymsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.GetSynonymsResponse>) responseObserver);
          break;
        case METHODID_CLASSIFY_INTENTS:
          serviceImpl.classifyIntents((ondewo.nlu.Aiservices.ClassifyIntentsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.ClassifyIntentsResponse>) responseObserver);
          break;
        case METHODID_EXTRACT_ENTITIES_FUZZY:
          serviceImpl.extractEntitiesFuzzy((ondewo.nlu.Aiservices.ExtractEntitiesFuzzyRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.ExtractEntitiesResponse>) responseObserver);
          break;
        case METHODID_LLM_GENERATE:
          serviceImpl.llmGenerate((ondewo.nlu.Aiservices.LlmGenerateRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.LlmGenerateResponse>) responseObserver);
          break;
        case METHODID_STREAMING_LLM_GENERATE:
          serviceImpl.streamingLlmGenerate((ondewo.nlu.Aiservices.LlmGenerateRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.StreamingLlmGenerateResponse>) responseObserver);
          break;
        case METHODID_LIST_LLM_MODELS:
          serviceImpl.listLlmModels((ondewo.nlu.Aiservices.ListLlmModelsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Aiservices.ListLlmModelsResponse>) responseObserver);
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
          getExtractEntitiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Aiservices.ExtractEntitiesRequest,
              ondewo.nlu.Aiservices.ExtractEntitiesResponse>(
                service, METHODID_EXTRACT_ENTITIES)))
        .addMethod(
          getGenerateUserSaysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Aiservices.GenerateUserSaysRequest,
              ondewo.nlu.Aiservices.GenerateUserSaysResponse>(
                service, METHODID_GENERATE_USER_SAYS)))
        .addMethod(
          getGenerateResponsesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Aiservices.GenerateResponsesRequest,
              ondewo.nlu.Aiservices.GenerateResponsesResponse>(
                service, METHODID_GENERATE_RESPONSES)))
        .addMethod(
          getGetAlternativeSentencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Aiservices.GetAlternativeSentencesRequest,
              ondewo.nlu.Aiservices.GetAlternativeSentencesResponse>(
                service, METHODID_GET_ALTERNATIVE_SENTENCES)))
        .addMethod(
          getGetAlternativeTrainingPhrasesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesRequest,
              ondewo.nlu.Aiservices.GetAlternativeTrainingPhrasesResponse>(
                service, METHODID_GET_ALTERNATIVE_TRAINING_PHRASES)))
        .addMethod(
          getGetSynonymsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Aiservices.GetSynonymsRequest,
              ondewo.nlu.Aiservices.GetSynonymsResponse>(
                service, METHODID_GET_SYNONYMS)))
        .addMethod(
          getClassifyIntentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Aiservices.ClassifyIntentsRequest,
              ondewo.nlu.Aiservices.ClassifyIntentsResponse>(
                service, METHODID_CLASSIFY_INTENTS)))
        .addMethod(
          getExtractEntitiesFuzzyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Aiservices.ExtractEntitiesFuzzyRequest,
              ondewo.nlu.Aiservices.ExtractEntitiesResponse>(
                service, METHODID_EXTRACT_ENTITIES_FUZZY)))
        .addMethod(
          getLlmGenerateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Aiservices.LlmGenerateRequest,
              ondewo.nlu.Aiservices.LlmGenerateResponse>(
                service, METHODID_LLM_GENERATE)))
        .addMethod(
          getStreamingLlmGenerateMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              ondewo.nlu.Aiservices.LlmGenerateRequest,
              ondewo.nlu.Aiservices.StreamingLlmGenerateResponse>(
                service, METHODID_STREAMING_LLM_GENERATE)))
        .addMethod(
          getListLlmModelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Aiservices.ListLlmModelsRequest,
              ondewo.nlu.Aiservices.ListLlmModelsResponse>(
                service, METHODID_LIST_LLM_MODELS)))
        .build();
  }

  private static abstract class AiServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AiServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ondewo.nlu.Aiservices.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AiServices");
    }
  }

  private static final class AiServicesFileDescriptorSupplier
      extends AiServicesBaseDescriptorSupplier {
    AiServicesFileDescriptorSupplier() {}
  }

  private static final class AiServicesMethodDescriptorSupplier
      extends AiServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AiServicesMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AiServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AiServicesFileDescriptorSupplier())
              .addMethod(getExtractEntitiesMethod())
              .addMethod(getGenerateUserSaysMethod())
              .addMethod(getGenerateResponsesMethod())
              .addMethod(getGetAlternativeSentencesMethod())
              .addMethod(getGetAlternativeTrainingPhrasesMethod())
              .addMethod(getGetSynonymsMethod())
              .addMethod(getClassifyIntentsMethod())
              .addMethod(getExtractEntitiesFuzzyMethod())
              .addMethod(getLlmGenerateMethod())
              .addMethod(getStreamingLlmGenerateMethod())
              .addMethod(getListLlmModelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
