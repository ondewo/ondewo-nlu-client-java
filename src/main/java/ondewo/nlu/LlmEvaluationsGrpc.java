package ondewo.nlu;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * LangSmith-style evaluation surface: datasets, examples, experiments, evaluator
 * runs, feedback (LLM-as-judge / human / heuristic / custom code / pairwise),
 * pairwise comparisons, release gates + persisted gate runs, scorecards,
 * per-project evaluation settings (judge configuration), the evaluator registry,
 * golden-transcript recording from sessions, conversation simulation
 * (standard + adversarial red-teaming), recurring schedules and report artifacts.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class LlmEvaluationsGrpc {

  private LlmEvaluationsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.nlu.LlmEvaluations";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationDatasetRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationDataset> getLlmEvaluationCreateDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationCreateDataset",
      requestType = ondewo.nlu.LlmEvaluation.CreateLlmEvaluationDatasetRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationDataset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationDatasetRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationDataset> getLlmEvaluationCreateDatasetMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationDatasetRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationDataset> getLlmEvaluationCreateDatasetMethod;
    if ((getLlmEvaluationCreateDatasetMethod = LlmEvaluationsGrpc.getLlmEvaluationCreateDatasetMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationCreateDatasetMethod = LlmEvaluationsGrpc.getLlmEvaluationCreateDatasetMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationCreateDatasetMethod = getLlmEvaluationCreateDatasetMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationDatasetRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationDataset>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationCreateDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.CreateLlmEvaluationDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationDataset.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationCreateDataset"))
              .build();
        }
      }
    }
    return getLlmEvaluationCreateDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationDatasetRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationDataset> getLlmEvaluationGetDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationGetDataset",
      requestType = ondewo.nlu.LlmEvaluation.GetLlmEvaluationDatasetRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationDataset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationDatasetRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationDataset> getLlmEvaluationGetDatasetMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationDatasetRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationDataset> getLlmEvaluationGetDatasetMethod;
    if ((getLlmEvaluationGetDatasetMethod = LlmEvaluationsGrpc.getLlmEvaluationGetDatasetMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationGetDatasetMethod = LlmEvaluationsGrpc.getLlmEvaluationGetDatasetMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationGetDatasetMethod = getLlmEvaluationGetDatasetMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.GetLlmEvaluationDatasetRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationDataset>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationGetDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.GetLlmEvaluationDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationDataset.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationGetDataset"))
              .build();
        }
      }
    }
    return getLlmEvaluationGetDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsResponse> getLlmEvaluationListDatasetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationListDatasets",
      requestType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsResponse> getLlmEvaluationListDatasetsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsResponse> getLlmEvaluationListDatasetsMethod;
    if ((getLlmEvaluationListDatasetsMethod = LlmEvaluationsGrpc.getLlmEvaluationListDatasetsMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationListDatasetsMethod = LlmEvaluationsGrpc.getLlmEvaluationListDatasetsMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationListDatasetsMethod = getLlmEvaluationListDatasetsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationListDatasets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationListDatasets"))
              .build();
        }
      }
    }
    return getLlmEvaluationListDatasetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationDatasetRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationDataset> getLlmEvaluationUpdateDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationUpdateDataset",
      requestType = ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationDatasetRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationDataset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationDatasetRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationDataset> getLlmEvaluationUpdateDatasetMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationDatasetRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationDataset> getLlmEvaluationUpdateDatasetMethod;
    if ((getLlmEvaluationUpdateDatasetMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateDatasetMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationUpdateDatasetMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateDatasetMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationUpdateDatasetMethod = getLlmEvaluationUpdateDatasetMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationDatasetRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationDataset>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationUpdateDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationDataset.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationUpdateDataset"))
              .build();
        }
      }
    }
    return getLlmEvaluationUpdateDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationDatasetRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationDeleteDataset",
      requestType = ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationDatasetRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationDatasetRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteDatasetMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationDatasetRequest, com.google.protobuf.Empty> getLlmEvaluationDeleteDatasetMethod;
    if ((getLlmEvaluationDeleteDatasetMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteDatasetMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationDeleteDatasetMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteDatasetMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationDeleteDatasetMethod = getLlmEvaluationDeleteDatasetMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationDatasetRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationDeleteDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationDeleteDataset"))
              .build();
        }
      }
    }
    return getLlmEvaluationDeleteDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.AddLlmEvaluationExampleRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationExample> getLlmEvaluationAddExampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationAddExample",
      requestType = ondewo.nlu.LlmEvaluation.AddLlmEvaluationExampleRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationExample.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.AddLlmEvaluationExampleRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationExample> getLlmEvaluationAddExampleMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.AddLlmEvaluationExampleRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationExample> getLlmEvaluationAddExampleMethod;
    if ((getLlmEvaluationAddExampleMethod = LlmEvaluationsGrpc.getLlmEvaluationAddExampleMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationAddExampleMethod = LlmEvaluationsGrpc.getLlmEvaluationAddExampleMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationAddExampleMethod = getLlmEvaluationAddExampleMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.AddLlmEvaluationExampleRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationExample>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationAddExample"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.AddLlmEvaluationExampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationExample.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationAddExample"))
              .build();
        }
      }
    }
    return getLlmEvaluationAddExampleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesRequest,
      ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesResponse> getLlmEvaluationAddExamplesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationAddExamples",
      requestType = ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesRequest,
      ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesResponse> getLlmEvaluationAddExamplesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesRequest, ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesResponse> getLlmEvaluationAddExamplesMethod;
    if ((getLlmEvaluationAddExamplesMethod = LlmEvaluationsGrpc.getLlmEvaluationAddExamplesMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationAddExamplesMethod = LlmEvaluationsGrpc.getLlmEvaluationAddExamplesMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationAddExamplesMethod = getLlmEvaluationAddExamplesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesRequest, ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationAddExamples"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationAddExamples"))
              .build();
        }
      }
    }
    return getLlmEvaluationAddExamplesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationExampleRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationExample> getLlmEvaluationGetExampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationGetExample",
      requestType = ondewo.nlu.LlmEvaluation.GetLlmEvaluationExampleRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationExample.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationExampleRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationExample> getLlmEvaluationGetExampleMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationExampleRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationExample> getLlmEvaluationGetExampleMethod;
    if ((getLlmEvaluationGetExampleMethod = LlmEvaluationsGrpc.getLlmEvaluationGetExampleMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationGetExampleMethod = LlmEvaluationsGrpc.getLlmEvaluationGetExampleMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationGetExampleMethod = getLlmEvaluationGetExampleMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.GetLlmEvaluationExampleRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationExample>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationGetExample"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.GetLlmEvaluationExampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationExample.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationGetExample"))
              .build();
        }
      }
    }
    return getLlmEvaluationGetExampleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesResponse> getLlmEvaluationListExamplesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationListExamples",
      requestType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesResponse> getLlmEvaluationListExamplesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesResponse> getLlmEvaluationListExamplesMethod;
    if ((getLlmEvaluationListExamplesMethod = LlmEvaluationsGrpc.getLlmEvaluationListExamplesMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationListExamplesMethod = LlmEvaluationsGrpc.getLlmEvaluationListExamplesMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationListExamplesMethod = getLlmEvaluationListExamplesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationListExamples"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationListExamples"))
              .build();
        }
      }
    }
    return getLlmEvaluationListExamplesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExampleRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationExample> getLlmEvaluationUpdateExampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationUpdateExample",
      requestType = ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExampleRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationExample.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExampleRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationExample> getLlmEvaluationUpdateExampleMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExampleRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationExample> getLlmEvaluationUpdateExampleMethod;
    if ((getLlmEvaluationUpdateExampleMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateExampleMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationUpdateExampleMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateExampleMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationUpdateExampleMethod = getLlmEvaluationUpdateExampleMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExampleRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationExample>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationUpdateExample"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationExample.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationUpdateExample"))
              .build();
        }
      }
    }
    return getLlmEvaluationUpdateExampleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExampleRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteExampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationDeleteExample",
      requestType = ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExampleRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExampleRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteExampleMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExampleRequest, com.google.protobuf.Empty> getLlmEvaluationDeleteExampleMethod;
    if ((getLlmEvaluationDeleteExampleMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteExampleMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationDeleteExampleMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteExampleMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationDeleteExampleMethod = getLlmEvaluationDeleteExampleMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExampleRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationDeleteExample"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationDeleteExample"))
              .build();
        }
      }
    }
    return getLlmEvaluationDeleteExampleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.RunLlmEvaluationExperimentRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getLlmEvaluationRunExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationRunExperiment",
      requestType = ondewo.nlu.LlmEvaluation.RunLlmEvaluationExperimentRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.RunLlmEvaluationExperimentRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getLlmEvaluationRunExperimentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.RunLlmEvaluationExperimentRequest, ondewo.nlu.OperationsOuterClass.Operation> getLlmEvaluationRunExperimentMethod;
    if ((getLlmEvaluationRunExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationRunExperimentMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationRunExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationRunExperimentMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationRunExperimentMethod = getLlmEvaluationRunExperimentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.RunLlmEvaluationExperimentRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationRunExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.RunLlmEvaluationExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationRunExperiment"))
              .build();
        }
      }
    }
    return getLlmEvaluationRunExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationExperimentRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment> getLlmEvaluationGetExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationGetExperiment",
      requestType = ondewo.nlu.LlmEvaluation.GetLlmEvaluationExperimentRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationExperimentRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment> getLlmEvaluationGetExperimentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationExperimentRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment> getLlmEvaluationGetExperimentMethod;
    if ((getLlmEvaluationGetExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationGetExperimentMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationGetExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationGetExperimentMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationGetExperimentMethod = getLlmEvaluationGetExperimentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.GetLlmEvaluationExperimentRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationGetExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.GetLlmEvaluationExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationGetExperiment"))
              .build();
        }
      }
    }
    return getLlmEvaluationGetExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsResponse> getLlmEvaluationListExperimentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationListExperiments",
      requestType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsResponse> getLlmEvaluationListExperimentsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsResponse> getLlmEvaluationListExperimentsMethod;
    if ((getLlmEvaluationListExperimentsMethod = LlmEvaluationsGrpc.getLlmEvaluationListExperimentsMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationListExperimentsMethod = LlmEvaluationsGrpc.getLlmEvaluationListExperimentsMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationListExperimentsMethod = getLlmEvaluationListExperimentsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationListExperiments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationListExperiments"))
              .build();
        }
      }
    }
    return getLlmEvaluationListExperimentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExperimentRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment> getLlmEvaluationUpdateExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationUpdateExperiment",
      requestType = ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExperimentRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExperimentRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment> getLlmEvaluationUpdateExperimentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExperimentRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment> getLlmEvaluationUpdateExperimentMethod;
    if ((getLlmEvaluationUpdateExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateExperimentMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationUpdateExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateExperimentMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationUpdateExperimentMethod = getLlmEvaluationUpdateExperimentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExperimentRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationUpdateExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationUpdateExperiment"))
              .build();
        }
      }
    }
    return getLlmEvaluationUpdateExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExperimentRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationDeleteExperiment",
      requestType = ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExperimentRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExperimentRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteExperimentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExperimentRequest, com.google.protobuf.Empty> getLlmEvaluationDeleteExperimentMethod;
    if ((getLlmEvaluationDeleteExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteExperimentMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationDeleteExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteExperimentMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationDeleteExperimentMethod = getLlmEvaluationDeleteExperimentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExperimentRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationDeleteExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationDeleteExperiment"))
              .build();
        }
      }
    }
    return getLlmEvaluationDeleteExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CancelLlmEvaluationExperimentRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment> getLlmEvaluationCancelExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationCancelExperiment",
      requestType = ondewo.nlu.LlmEvaluation.CancelLlmEvaluationExperimentRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CancelLlmEvaluationExperimentRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment> getLlmEvaluationCancelExperimentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CancelLlmEvaluationExperimentRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment> getLlmEvaluationCancelExperimentMethod;
    if ((getLlmEvaluationCancelExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationCancelExperimentMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationCancelExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationCancelExperimentMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationCancelExperimentMethod = getLlmEvaluationCancelExperimentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.CancelLlmEvaluationExperimentRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationCancelExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.CancelLlmEvaluationExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationCancelExperiment"))
              .build();
        }
      }
    }
    return getLlmEvaluationCancelExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CompareLlmEvaluationExperimentsRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationComparison> getLlmEvaluationCompareExperimentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationCompareExperiments",
      requestType = ondewo.nlu.LlmEvaluation.CompareLlmEvaluationExperimentsRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationComparison.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CompareLlmEvaluationExperimentsRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationComparison> getLlmEvaluationCompareExperimentsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CompareLlmEvaluationExperimentsRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationComparison> getLlmEvaluationCompareExperimentsMethod;
    if ((getLlmEvaluationCompareExperimentsMethod = LlmEvaluationsGrpc.getLlmEvaluationCompareExperimentsMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationCompareExperimentsMethod = LlmEvaluationsGrpc.getLlmEvaluationCompareExperimentsMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationCompareExperimentsMethod = getLlmEvaluationCompareExperimentsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.CompareLlmEvaluationExperimentsRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationComparison>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationCompareExperiments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.CompareLlmEvaluationExperimentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationComparison.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationCompareExperiments"))
              .build();
        }
      }
    }
    return getLlmEvaluationCompareExperimentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.SubmitLlmEvaluationFeedbackRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback> getLlmEvaluationSubmitFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationSubmitFeedback",
      requestType = ondewo.nlu.LlmEvaluation.SubmitLlmEvaluationFeedbackRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.SubmitLlmEvaluationFeedbackRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback> getLlmEvaluationSubmitFeedbackMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.SubmitLlmEvaluationFeedbackRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback> getLlmEvaluationSubmitFeedbackMethod;
    if ((getLlmEvaluationSubmitFeedbackMethod = LlmEvaluationsGrpc.getLlmEvaluationSubmitFeedbackMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationSubmitFeedbackMethod = LlmEvaluationsGrpc.getLlmEvaluationSubmitFeedbackMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationSubmitFeedbackMethod = getLlmEvaluationSubmitFeedbackMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.SubmitLlmEvaluationFeedbackRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationSubmitFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.SubmitLlmEvaluationFeedbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationSubmitFeedback"))
              .build();
        }
      }
    }
    return getLlmEvaluationSubmitFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackResponse> getLlmEvaluationListFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationListFeedback",
      requestType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackResponse> getLlmEvaluationListFeedbackMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackResponse> getLlmEvaluationListFeedbackMethod;
    if ((getLlmEvaluationListFeedbackMethod = LlmEvaluationsGrpc.getLlmEvaluationListFeedbackMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationListFeedbackMethod = LlmEvaluationsGrpc.getLlmEvaluationListFeedbackMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationListFeedbackMethod = getLlmEvaluationListFeedbackMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationListFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationListFeedback"))
              .build();
        }
      }
    }
    return getLlmEvaluationListFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationFeedbackRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationDeleteFeedback",
      requestType = ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationFeedbackRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationFeedbackRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteFeedbackMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationFeedbackRequest, com.google.protobuf.Empty> getLlmEvaluationDeleteFeedbackMethod;
    if ((getLlmEvaluationDeleteFeedbackMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteFeedbackMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationDeleteFeedbackMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteFeedbackMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationDeleteFeedbackMethod = getLlmEvaluationDeleteFeedbackMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationFeedbackRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationDeleteFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationFeedbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationDeleteFeedback"))
              .build();
        }
      }
    }
    return getLlmEvaluationDeleteFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationFeedbackRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback> getLlmEvaluationUpdateFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationUpdateFeedback",
      requestType = ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationFeedbackRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationFeedbackRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback> getLlmEvaluationUpdateFeedbackMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationFeedbackRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback> getLlmEvaluationUpdateFeedbackMethod;
    if ((getLlmEvaluationUpdateFeedbackMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateFeedbackMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationUpdateFeedbackMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateFeedbackMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationUpdateFeedbackMethod = getLlmEvaluationUpdateFeedbackMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationFeedbackRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationUpdateFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationFeedbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationUpdateFeedback"))
              .build();
        }
      }
    }
    return getLlmEvaluationUpdateFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReleaseGateRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate> getLlmEvaluationCreateReleaseGateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationCreateReleaseGate",
      requestType = ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReleaseGateRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReleaseGateRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate> getLlmEvaluationCreateReleaseGateMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReleaseGateRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate> getLlmEvaluationCreateReleaseGateMethod;
    if ((getLlmEvaluationCreateReleaseGateMethod = LlmEvaluationsGrpc.getLlmEvaluationCreateReleaseGateMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationCreateReleaseGateMethod = LlmEvaluationsGrpc.getLlmEvaluationCreateReleaseGateMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationCreateReleaseGateMethod = getLlmEvaluationCreateReleaseGateMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReleaseGateRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationCreateReleaseGate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReleaseGateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationCreateReleaseGate"))
              .build();
        }
      }
    }
    return getLlmEvaluationCreateReleaseGateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate> getLlmEvaluationGetReleaseGateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationGetReleaseGate",
      requestType = ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate> getLlmEvaluationGetReleaseGateMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate> getLlmEvaluationGetReleaseGateMethod;
    if ((getLlmEvaluationGetReleaseGateMethod = LlmEvaluationsGrpc.getLlmEvaluationGetReleaseGateMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationGetReleaseGateMethod = LlmEvaluationsGrpc.getLlmEvaluationGetReleaseGateMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationGetReleaseGateMethod = getLlmEvaluationGetReleaseGateMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationGetReleaseGate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationGetReleaseGate"))
              .build();
        }
      }
    }
    return getLlmEvaluationGetReleaseGateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesResponse> getLlmEvaluationListReleaseGatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationListReleaseGates",
      requestType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesResponse> getLlmEvaluationListReleaseGatesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesResponse> getLlmEvaluationListReleaseGatesMethod;
    if ((getLlmEvaluationListReleaseGatesMethod = LlmEvaluationsGrpc.getLlmEvaluationListReleaseGatesMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationListReleaseGatesMethod = LlmEvaluationsGrpc.getLlmEvaluationListReleaseGatesMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationListReleaseGatesMethod = getLlmEvaluationListReleaseGatesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationListReleaseGates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationListReleaseGates"))
              .build();
        }
      }
    }
    return getLlmEvaluationListReleaseGatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationReleaseGateRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate> getLlmEvaluationUpdateReleaseGateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationUpdateReleaseGate",
      requestType = ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationReleaseGateRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationReleaseGateRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate> getLlmEvaluationUpdateReleaseGateMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationReleaseGateRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate> getLlmEvaluationUpdateReleaseGateMethod;
    if ((getLlmEvaluationUpdateReleaseGateMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateReleaseGateMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationUpdateReleaseGateMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateReleaseGateMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationUpdateReleaseGateMethod = getLlmEvaluationUpdateReleaseGateMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationReleaseGateRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationUpdateReleaseGate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationReleaseGateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationUpdateReleaseGate"))
              .build();
        }
      }
    }
    return getLlmEvaluationUpdateReleaseGateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReleaseGateRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteReleaseGateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationDeleteReleaseGate",
      requestType = ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReleaseGateRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReleaseGateRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteReleaseGateMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReleaseGateRequest, com.google.protobuf.Empty> getLlmEvaluationDeleteReleaseGateMethod;
    if ((getLlmEvaluationDeleteReleaseGateMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteReleaseGateMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationDeleteReleaseGateMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteReleaseGateMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationDeleteReleaseGateMethod = getLlmEvaluationDeleteReleaseGateMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReleaseGateRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationDeleteReleaseGate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReleaseGateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationDeleteReleaseGate"))
              .build();
        }
      }
    }
    return getLlmEvaluationDeleteReleaseGateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.RunLlmEvaluationReleaseGateRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getLlmEvaluationRunReleaseGateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationRunReleaseGate",
      requestType = ondewo.nlu.LlmEvaluation.RunLlmEvaluationReleaseGateRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.RunLlmEvaluationReleaseGateRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getLlmEvaluationRunReleaseGateMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.RunLlmEvaluationReleaseGateRequest, ondewo.nlu.OperationsOuterClass.Operation> getLlmEvaluationRunReleaseGateMethod;
    if ((getLlmEvaluationRunReleaseGateMethod = LlmEvaluationsGrpc.getLlmEvaluationRunReleaseGateMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationRunReleaseGateMethod = LlmEvaluationsGrpc.getLlmEvaluationRunReleaseGateMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationRunReleaseGateMethod = getLlmEvaluationRunReleaseGateMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.RunLlmEvaluationReleaseGateRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationRunReleaseGate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.RunLlmEvaluationReleaseGateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationRunReleaseGate"))
              .build();
        }
      }
    }
    return getLlmEvaluationRunReleaseGateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRunRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGateRun> getLlmEvaluationGetReleaseGateRunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationGetReleaseGateRun",
      requestType = ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRunRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGateRun.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRunRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGateRun> getLlmEvaluationGetReleaseGateRunMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRunRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGateRun> getLlmEvaluationGetReleaseGateRunMethod;
    if ((getLlmEvaluationGetReleaseGateRunMethod = LlmEvaluationsGrpc.getLlmEvaluationGetReleaseGateRunMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationGetReleaseGateRunMethod = LlmEvaluationsGrpc.getLlmEvaluationGetReleaseGateRunMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationGetReleaseGateRunMethod = getLlmEvaluationGetReleaseGateRunMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRunRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGateRun>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationGetReleaseGateRun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGateRun.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationGetReleaseGateRun"))
              .build();
        }
      }
    }
    return getLlmEvaluationGetReleaseGateRunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsResponse> getLlmEvaluationListReleaseGateRunsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationListReleaseGateRuns",
      requestType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsResponse> getLlmEvaluationListReleaseGateRunsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsResponse> getLlmEvaluationListReleaseGateRunsMethod;
    if ((getLlmEvaluationListReleaseGateRunsMethod = LlmEvaluationsGrpc.getLlmEvaluationListReleaseGateRunsMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationListReleaseGateRunsMethod = LlmEvaluationsGrpc.getLlmEvaluationListReleaseGateRunsMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationListReleaseGateRunsMethod = getLlmEvaluationListReleaseGateRunsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationListReleaseGateRuns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationListReleaseGateRuns"))
              .build();
        }
      }
    }
    return getLlmEvaluationListReleaseGateRunsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScorecardRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard> getLlmEvaluationCreateScorecardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationCreateScorecard",
      requestType = ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScorecardRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScorecardRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard> getLlmEvaluationCreateScorecardMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScorecardRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard> getLlmEvaluationCreateScorecardMethod;
    if ((getLlmEvaluationCreateScorecardMethod = LlmEvaluationsGrpc.getLlmEvaluationCreateScorecardMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationCreateScorecardMethod = LlmEvaluationsGrpc.getLlmEvaluationCreateScorecardMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationCreateScorecardMethod = getLlmEvaluationCreateScorecardMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScorecardRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationCreateScorecard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScorecardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationCreateScorecard"))
              .build();
        }
      }
    }
    return getLlmEvaluationCreateScorecardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationScorecardRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard> getLlmEvaluationGetScorecardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationGetScorecard",
      requestType = ondewo.nlu.LlmEvaluation.GetLlmEvaluationScorecardRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationScorecardRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard> getLlmEvaluationGetScorecardMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationScorecardRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard> getLlmEvaluationGetScorecardMethod;
    if ((getLlmEvaluationGetScorecardMethod = LlmEvaluationsGrpc.getLlmEvaluationGetScorecardMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationGetScorecardMethod = LlmEvaluationsGrpc.getLlmEvaluationGetScorecardMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationGetScorecardMethod = getLlmEvaluationGetScorecardMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.GetLlmEvaluationScorecardRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationGetScorecard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.GetLlmEvaluationScorecardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationGetScorecard"))
              .build();
        }
      }
    }
    return getLlmEvaluationGetScorecardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsResponse> getLlmEvaluationListScorecardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationListScorecards",
      requestType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsResponse> getLlmEvaluationListScorecardsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsResponse> getLlmEvaluationListScorecardsMethod;
    if ((getLlmEvaluationListScorecardsMethod = LlmEvaluationsGrpc.getLlmEvaluationListScorecardsMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationListScorecardsMethod = LlmEvaluationsGrpc.getLlmEvaluationListScorecardsMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationListScorecardsMethod = getLlmEvaluationListScorecardsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationListScorecards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationListScorecards"))
              .build();
        }
      }
    }
    return getLlmEvaluationListScorecardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScorecardRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard> getLlmEvaluationUpdateScorecardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationUpdateScorecard",
      requestType = ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScorecardRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScorecardRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard> getLlmEvaluationUpdateScorecardMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScorecardRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard> getLlmEvaluationUpdateScorecardMethod;
    if ((getLlmEvaluationUpdateScorecardMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateScorecardMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationUpdateScorecardMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateScorecardMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationUpdateScorecardMethod = getLlmEvaluationUpdateScorecardMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScorecardRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationUpdateScorecard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScorecardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationUpdateScorecard"))
              .build();
        }
      }
    }
    return getLlmEvaluationUpdateScorecardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScorecardRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteScorecardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationDeleteScorecard",
      requestType = ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScorecardRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScorecardRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteScorecardMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScorecardRequest, com.google.protobuf.Empty> getLlmEvaluationDeleteScorecardMethod;
    if ((getLlmEvaluationDeleteScorecardMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteScorecardMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationDeleteScorecardMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteScorecardMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationDeleteScorecardMethod = getLlmEvaluationDeleteScorecardMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScorecardRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationDeleteScorecard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScorecardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationDeleteScorecard"))
              .build();
        }
      }
    }
    return getLlmEvaluationDeleteScorecardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationProjectSettingsRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings> getLlmEvaluationGetProjectSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationGetProjectSettings",
      requestType = ondewo.nlu.LlmEvaluation.GetLlmEvaluationProjectSettingsRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationProjectSettingsRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings> getLlmEvaluationGetProjectSettingsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationProjectSettingsRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings> getLlmEvaluationGetProjectSettingsMethod;
    if ((getLlmEvaluationGetProjectSettingsMethod = LlmEvaluationsGrpc.getLlmEvaluationGetProjectSettingsMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationGetProjectSettingsMethod = LlmEvaluationsGrpc.getLlmEvaluationGetProjectSettingsMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationGetProjectSettingsMethod = getLlmEvaluationGetProjectSettingsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.GetLlmEvaluationProjectSettingsRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationGetProjectSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.GetLlmEvaluationProjectSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationGetProjectSettings"))
              .build();
        }
      }
    }
    return getLlmEvaluationGetProjectSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationProjectSettingsRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings> getLlmEvaluationUpdateProjectSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationUpdateProjectSettings",
      requestType = ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationProjectSettingsRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationProjectSettingsRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings> getLlmEvaluationUpdateProjectSettingsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationProjectSettingsRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings> getLlmEvaluationUpdateProjectSettingsMethod;
    if ((getLlmEvaluationUpdateProjectSettingsMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateProjectSettingsMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationUpdateProjectSettingsMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateProjectSettingsMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationUpdateProjectSettingsMethod = getLlmEvaluationUpdateProjectSettingsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationProjectSettingsRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationUpdateProjectSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationProjectSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationUpdateProjectSettings"))
              .build();
        }
      }
    }
    return getLlmEvaluationUpdateProjectSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsResponse> getLlmEvaluationListEvaluatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationListEvaluators",
      requestType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsResponse> getLlmEvaluationListEvaluatorsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsResponse> getLlmEvaluationListEvaluatorsMethod;
    if ((getLlmEvaluationListEvaluatorsMethod = LlmEvaluationsGrpc.getLlmEvaluationListEvaluatorsMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationListEvaluatorsMethod = LlmEvaluationsGrpc.getLlmEvaluationListEvaluatorsMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationListEvaluatorsMethod = getLlmEvaluationListEvaluatorsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationListEvaluators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationListEvaluators"))
              .build();
        }
      }
    }
    return getLlmEvaluationListEvaluatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionRequest,
      ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionResponse> getLlmEvaluationCreateExamplesFromSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationCreateExamplesFromSession",
      requestType = ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionRequest,
      ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionResponse> getLlmEvaluationCreateExamplesFromSessionMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionRequest, ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionResponse> getLlmEvaluationCreateExamplesFromSessionMethod;
    if ((getLlmEvaluationCreateExamplesFromSessionMethod = LlmEvaluationsGrpc.getLlmEvaluationCreateExamplesFromSessionMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationCreateExamplesFromSessionMethod = LlmEvaluationsGrpc.getLlmEvaluationCreateExamplesFromSessionMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationCreateExamplesFromSessionMethod = getLlmEvaluationCreateExamplesFromSessionMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionRequest, ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationCreateExamplesFromSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationCreateExamplesFromSession"))
              .build();
        }
      }
    }
    return getLlmEvaluationCreateExamplesFromSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.SimulateLlmEvaluationConversationsRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getLlmEvaluationSimulateConversationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationSimulateConversations",
      requestType = ondewo.nlu.LlmEvaluation.SimulateLlmEvaluationConversationsRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.SimulateLlmEvaluationConversationsRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getLlmEvaluationSimulateConversationsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.SimulateLlmEvaluationConversationsRequest, ondewo.nlu.OperationsOuterClass.Operation> getLlmEvaluationSimulateConversationsMethod;
    if ((getLlmEvaluationSimulateConversationsMethod = LlmEvaluationsGrpc.getLlmEvaluationSimulateConversationsMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationSimulateConversationsMethod = LlmEvaluationsGrpc.getLlmEvaluationSimulateConversationsMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationSimulateConversationsMethod = getLlmEvaluationSimulateConversationsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.SimulateLlmEvaluationConversationsRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationSimulateConversations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.SimulateLlmEvaluationConversationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationSimulateConversations"))
              .build();
        }
      }
    }
    return getLlmEvaluationSimulateConversationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScheduleRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule> getLlmEvaluationCreateScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationCreateSchedule",
      requestType = ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScheduleRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScheduleRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule> getLlmEvaluationCreateScheduleMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScheduleRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule> getLlmEvaluationCreateScheduleMethod;
    if ((getLlmEvaluationCreateScheduleMethod = LlmEvaluationsGrpc.getLlmEvaluationCreateScheduleMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationCreateScheduleMethod = LlmEvaluationsGrpc.getLlmEvaluationCreateScheduleMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationCreateScheduleMethod = getLlmEvaluationCreateScheduleMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScheduleRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationCreateSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationCreateSchedule"))
              .build();
        }
      }
    }
    return getLlmEvaluationCreateScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationScheduleRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule> getLlmEvaluationGetScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationGetSchedule",
      requestType = ondewo.nlu.LlmEvaluation.GetLlmEvaluationScheduleRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationScheduleRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule> getLlmEvaluationGetScheduleMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationScheduleRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule> getLlmEvaluationGetScheduleMethod;
    if ((getLlmEvaluationGetScheduleMethod = LlmEvaluationsGrpc.getLlmEvaluationGetScheduleMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationGetScheduleMethod = LlmEvaluationsGrpc.getLlmEvaluationGetScheduleMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationGetScheduleMethod = getLlmEvaluationGetScheduleMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.GetLlmEvaluationScheduleRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationGetSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.GetLlmEvaluationScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationGetSchedule"))
              .build();
        }
      }
    }
    return getLlmEvaluationGetScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesResponse> getLlmEvaluationListSchedulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationListSchedules",
      requestType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesResponse> getLlmEvaluationListSchedulesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesResponse> getLlmEvaluationListSchedulesMethod;
    if ((getLlmEvaluationListSchedulesMethod = LlmEvaluationsGrpc.getLlmEvaluationListSchedulesMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationListSchedulesMethod = LlmEvaluationsGrpc.getLlmEvaluationListSchedulesMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationListSchedulesMethod = getLlmEvaluationListSchedulesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationListSchedules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationListSchedules"))
              .build();
        }
      }
    }
    return getLlmEvaluationListSchedulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScheduleRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule> getLlmEvaluationUpdateScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationUpdateSchedule",
      requestType = ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScheduleRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScheduleRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule> getLlmEvaluationUpdateScheduleMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScheduleRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule> getLlmEvaluationUpdateScheduleMethod;
    if ((getLlmEvaluationUpdateScheduleMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateScheduleMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationUpdateScheduleMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateScheduleMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationUpdateScheduleMethod = getLlmEvaluationUpdateScheduleMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScheduleRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationUpdateSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationUpdateSchedule"))
              .build();
        }
      }
    }
    return getLlmEvaluationUpdateScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScheduleRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationDeleteSchedule",
      requestType = ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScheduleRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScheduleRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteScheduleMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScheduleRequest, com.google.protobuf.Empty> getLlmEvaluationDeleteScheduleMethod;
    if ((getLlmEvaluationDeleteScheduleMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteScheduleMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationDeleteScheduleMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteScheduleMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationDeleteScheduleMethod = getLlmEvaluationDeleteScheduleMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScheduleRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationDeleteSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationDeleteSchedule"))
              .build();
        }
      }
    }
    return getLlmEvaluationDeleteScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReportRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationReport> getLlmEvaluationCreateReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationCreateReport",
      requestType = ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReportRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationReport.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReportRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationReport> getLlmEvaluationCreateReportMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReportRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationReport> getLlmEvaluationCreateReportMethod;
    if ((getLlmEvaluationCreateReportMethod = LlmEvaluationsGrpc.getLlmEvaluationCreateReportMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationCreateReportMethod = LlmEvaluationsGrpc.getLlmEvaluationCreateReportMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationCreateReportMethod = getLlmEvaluationCreateReportMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReportRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationReport>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationCreateReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationReport.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationCreateReport"))
              .build();
        }
      }
    }
    return getLlmEvaluationCreateReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationReportRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationReport> getLlmEvaluationGetReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationGetReport",
      requestType = ondewo.nlu.LlmEvaluation.GetLlmEvaluationReportRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationReport.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationReportRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationReport> getLlmEvaluationGetReportMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationReportRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationReport> getLlmEvaluationGetReportMethod;
    if ((getLlmEvaluationGetReportMethod = LlmEvaluationsGrpc.getLlmEvaluationGetReportMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationGetReportMethod = LlmEvaluationsGrpc.getLlmEvaluationGetReportMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationGetReportMethod = getLlmEvaluationGetReportMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.GetLlmEvaluationReportRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationReport>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationGetReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.GetLlmEvaluationReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationReport.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationGetReport"))
              .build();
        }
      }
    }
    return getLlmEvaluationGetReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsResponse> getLlmEvaluationListReportsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationListReports",
      requestType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsResponse> getLlmEvaluationListReportsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsResponse> getLlmEvaluationListReportsMethod;
    if ((getLlmEvaluationListReportsMethod = LlmEvaluationsGrpc.getLlmEvaluationListReportsMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationListReportsMethod = LlmEvaluationsGrpc.getLlmEvaluationListReportsMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationListReportsMethod = getLlmEvaluationListReportsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationListReports"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationListReports"))
              .build();
        }
      }
    }
    return getLlmEvaluationListReportsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReportRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationDeleteReport",
      requestType = ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReportRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReportRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteReportMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReportRequest, com.google.protobuf.Empty> getLlmEvaluationDeleteReportMethod;
    if ((getLlmEvaluationDeleteReportMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteReportMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationDeleteReportMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteReportMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationDeleteReportMethod = getLlmEvaluationDeleteReportMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReportRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationDeleteReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationDeleteReport"))
              .build();
        }
      }
    }
    return getLlmEvaluationDeleteReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationAbExperimentRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> getLlmEvaluationCreateAbExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationCreateAbExperiment",
      requestType = ondewo.nlu.LlmEvaluation.CreateLlmEvaluationAbExperimentRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationAbExperimentRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> getLlmEvaluationCreateAbExperimentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationAbExperimentRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> getLlmEvaluationCreateAbExperimentMethod;
    if ((getLlmEvaluationCreateAbExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationCreateAbExperimentMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationCreateAbExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationCreateAbExperimentMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationCreateAbExperimentMethod = getLlmEvaluationCreateAbExperimentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationAbExperimentRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationCreateAbExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.CreateLlmEvaluationAbExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationCreateAbExperiment"))
              .build();
        }
      }
    }
    return getLlmEvaluationCreateAbExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> getLlmEvaluationGetAbExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationGetAbExperiment",
      requestType = ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> getLlmEvaluationGetAbExperimentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> getLlmEvaluationGetAbExperimentMethod;
    if ((getLlmEvaluationGetAbExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationGetAbExperimentMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationGetAbExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationGetAbExperimentMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationGetAbExperimentMethod = getLlmEvaluationGetAbExperimentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationGetAbExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationGetAbExperiment"))
              .build();
        }
      }
    }
    return getLlmEvaluationGetAbExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsResponse> getLlmEvaluationListAbExperimentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationListAbExperiments",
      requestType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsResponse> getLlmEvaluationListAbExperimentsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsResponse> getLlmEvaluationListAbExperimentsMethod;
    if ((getLlmEvaluationListAbExperimentsMethod = LlmEvaluationsGrpc.getLlmEvaluationListAbExperimentsMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationListAbExperimentsMethod = LlmEvaluationsGrpc.getLlmEvaluationListAbExperimentsMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationListAbExperimentsMethod = getLlmEvaluationListAbExperimentsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationListAbExperiments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationListAbExperiments"))
              .build();
        }
      }
    }
    return getLlmEvaluationListAbExperimentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAbExperimentRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> getLlmEvaluationUpdateAbExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationUpdateAbExperiment",
      requestType = ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAbExperimentRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAbExperimentRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> getLlmEvaluationUpdateAbExperimentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAbExperimentRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> getLlmEvaluationUpdateAbExperimentMethod;
    if ((getLlmEvaluationUpdateAbExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateAbExperimentMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationUpdateAbExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateAbExperimentMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationUpdateAbExperimentMethod = getLlmEvaluationUpdateAbExperimentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAbExperimentRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationUpdateAbExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAbExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationUpdateAbExperiment"))
              .build();
        }
      }
    }
    return getLlmEvaluationUpdateAbExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationAbExperimentRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteAbExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationDeleteAbExperiment",
      requestType = ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationAbExperimentRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationAbExperimentRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteAbExperimentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationAbExperimentRequest, com.google.protobuf.Empty> getLlmEvaluationDeleteAbExperimentMethod;
    if ((getLlmEvaluationDeleteAbExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteAbExperimentMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationDeleteAbExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteAbExperimentMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationDeleteAbExperimentMethod = getLlmEvaluationDeleteAbExperimentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationAbExperimentRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationDeleteAbExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationAbExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationDeleteAbExperiment"))
              .build();
        }
      }
    }
    return getLlmEvaluationDeleteAbExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.StartLlmEvaluationAbExperimentRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> getLlmEvaluationStartAbExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationStartAbExperiment",
      requestType = ondewo.nlu.LlmEvaluation.StartLlmEvaluationAbExperimentRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.StartLlmEvaluationAbExperimentRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> getLlmEvaluationStartAbExperimentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.StartLlmEvaluationAbExperimentRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> getLlmEvaluationStartAbExperimentMethod;
    if ((getLlmEvaluationStartAbExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationStartAbExperimentMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationStartAbExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationStartAbExperimentMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationStartAbExperimentMethod = getLlmEvaluationStartAbExperimentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.StartLlmEvaluationAbExperimentRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationStartAbExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.StartLlmEvaluationAbExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationStartAbExperiment"))
              .build();
        }
      }
    }
    return getLlmEvaluationStartAbExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.StopLlmEvaluationAbExperimentRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> getLlmEvaluationStopAbExperimentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationStopAbExperiment",
      requestType = ondewo.nlu.LlmEvaluation.StopLlmEvaluationAbExperimentRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.StopLlmEvaluationAbExperimentRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> getLlmEvaluationStopAbExperimentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.StopLlmEvaluationAbExperimentRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> getLlmEvaluationStopAbExperimentMethod;
    if ((getLlmEvaluationStopAbExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationStopAbExperimentMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationStopAbExperimentMethod = LlmEvaluationsGrpc.getLlmEvaluationStopAbExperimentMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationStopAbExperimentMethod = getLlmEvaluationStopAbExperimentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.StopLlmEvaluationAbExperimentRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationStopAbExperiment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.StopLlmEvaluationAbExperimentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationStopAbExperiment"))
              .build();
        }
      }
    }
    return getLlmEvaluationStopAbExperimentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsRequest,
      ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsResponse> getLlmEvaluationGetAbExperimentResultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationGetAbExperimentResults",
      requestType = ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsRequest,
      ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsResponse> getLlmEvaluationGetAbExperimentResultsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsRequest, ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsResponse> getLlmEvaluationGetAbExperimentResultsMethod;
    if ((getLlmEvaluationGetAbExperimentResultsMethod = LlmEvaluationsGrpc.getLlmEvaluationGetAbExperimentResultsMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationGetAbExperimentResultsMethod = LlmEvaluationsGrpc.getLlmEvaluationGetAbExperimentResultsMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationGetAbExperimentResultsMethod = getLlmEvaluationGetAbExperimentResultsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsRequest, ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationGetAbExperimentResults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationGetAbExperimentResults"))
              .build();
        }
      }
    }
    return getLlmEvaluationGetAbExperimentResultsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutRecommendationRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutRecommendation> getLlmEvaluationGetAbRolloutRecommendationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationGetAbRolloutRecommendation",
      requestType = ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutRecommendationRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutRecommendation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutRecommendationRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutRecommendation> getLlmEvaluationGetAbRolloutRecommendationMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutRecommendationRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutRecommendation> getLlmEvaluationGetAbRolloutRecommendationMethod;
    if ((getLlmEvaluationGetAbRolloutRecommendationMethod = LlmEvaluationsGrpc.getLlmEvaluationGetAbRolloutRecommendationMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationGetAbRolloutRecommendationMethod = LlmEvaluationsGrpc.getLlmEvaluationGetAbRolloutRecommendationMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationGetAbRolloutRecommendationMethod = getLlmEvaluationGetAbRolloutRecommendationMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutRecommendationRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutRecommendation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationGetAbRolloutRecommendation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutRecommendationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutRecommendation.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationGetAbRolloutRecommendation"))
              .build();
        }
      }
    }
    return getLlmEvaluationGetAbRolloutRecommendationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ApplyLlmEvaluationAbRolloutRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision> getLlmEvaluationApplyAbRolloutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationApplyAbRollout",
      requestType = ondewo.nlu.LlmEvaluation.ApplyLlmEvaluationAbRolloutRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ApplyLlmEvaluationAbRolloutRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision> getLlmEvaluationApplyAbRolloutMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ApplyLlmEvaluationAbRolloutRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision> getLlmEvaluationApplyAbRolloutMethod;
    if ((getLlmEvaluationApplyAbRolloutMethod = LlmEvaluationsGrpc.getLlmEvaluationApplyAbRolloutMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationApplyAbRolloutMethod = LlmEvaluationsGrpc.getLlmEvaluationApplyAbRolloutMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationApplyAbRolloutMethod = getLlmEvaluationApplyAbRolloutMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.ApplyLlmEvaluationAbRolloutRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationApplyAbRollout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ApplyLlmEvaluationAbRolloutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationApplyAbRollout"))
              .build();
        }
      }
    }
    return getLlmEvaluationApplyAbRolloutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutDecisionRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision> getLlmEvaluationGetAbRolloutDecisionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationGetAbRolloutDecision",
      requestType = ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutDecisionRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutDecisionRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision> getLlmEvaluationGetAbRolloutDecisionMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutDecisionRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision> getLlmEvaluationGetAbRolloutDecisionMethod;
    if ((getLlmEvaluationGetAbRolloutDecisionMethod = LlmEvaluationsGrpc.getLlmEvaluationGetAbRolloutDecisionMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationGetAbRolloutDecisionMethod = LlmEvaluationsGrpc.getLlmEvaluationGetAbRolloutDecisionMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationGetAbRolloutDecisionMethod = getLlmEvaluationGetAbRolloutDecisionMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutDecisionRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationGetAbRolloutDecision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutDecisionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationGetAbRolloutDecision"))
              .build();
        }
      }
    }
    return getLlmEvaluationGetAbRolloutDecisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsResponse> getLlmEvaluationListAbRolloutDecisionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationListAbRolloutDecisions",
      requestType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsResponse> getLlmEvaluationListAbRolloutDecisionsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsResponse> getLlmEvaluationListAbRolloutDecisionsMethod;
    if ((getLlmEvaluationListAbRolloutDecisionsMethod = LlmEvaluationsGrpc.getLlmEvaluationListAbRolloutDecisionsMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationListAbRolloutDecisionsMethod = LlmEvaluationsGrpc.getLlmEvaluationListAbRolloutDecisionsMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationListAbRolloutDecisionsMethod = getLlmEvaluationListAbRolloutDecisionsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationListAbRolloutDecisions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationListAbRolloutDecisions"))
              .build();
        }
      }
    }
    return getLlmEvaluationListAbRolloutDecisionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationOnlineConfigRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig> getLlmEvaluationCreateOnlineConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationCreateOnlineConfig",
      requestType = ondewo.nlu.LlmEvaluation.CreateLlmEvaluationOnlineConfigRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationOnlineConfigRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig> getLlmEvaluationCreateOnlineConfigMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationOnlineConfigRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig> getLlmEvaluationCreateOnlineConfigMethod;
    if ((getLlmEvaluationCreateOnlineConfigMethod = LlmEvaluationsGrpc.getLlmEvaluationCreateOnlineConfigMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationCreateOnlineConfigMethod = LlmEvaluationsGrpc.getLlmEvaluationCreateOnlineConfigMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationCreateOnlineConfigMethod = getLlmEvaluationCreateOnlineConfigMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationOnlineConfigRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationCreateOnlineConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.CreateLlmEvaluationOnlineConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationCreateOnlineConfig"))
              .build();
        }
      }
    }
    return getLlmEvaluationCreateOnlineConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineConfigRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig> getLlmEvaluationGetOnlineConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationGetOnlineConfig",
      requestType = ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineConfigRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineConfigRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig> getLlmEvaluationGetOnlineConfigMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineConfigRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig> getLlmEvaluationGetOnlineConfigMethod;
    if ((getLlmEvaluationGetOnlineConfigMethod = LlmEvaluationsGrpc.getLlmEvaluationGetOnlineConfigMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationGetOnlineConfigMethod = LlmEvaluationsGrpc.getLlmEvaluationGetOnlineConfigMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationGetOnlineConfigMethod = getLlmEvaluationGetOnlineConfigMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineConfigRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationGetOnlineConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationGetOnlineConfig"))
              .build();
        }
      }
    }
    return getLlmEvaluationGetOnlineConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsResponse> getLlmEvaluationListOnlineConfigsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationListOnlineConfigs",
      requestType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsResponse> getLlmEvaluationListOnlineConfigsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsResponse> getLlmEvaluationListOnlineConfigsMethod;
    if ((getLlmEvaluationListOnlineConfigsMethod = LlmEvaluationsGrpc.getLlmEvaluationListOnlineConfigsMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationListOnlineConfigsMethod = LlmEvaluationsGrpc.getLlmEvaluationListOnlineConfigsMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationListOnlineConfigsMethod = getLlmEvaluationListOnlineConfigsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationListOnlineConfigs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationListOnlineConfigs"))
              .build();
        }
      }
    }
    return getLlmEvaluationListOnlineConfigsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationOnlineConfigRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig> getLlmEvaluationUpdateOnlineConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationUpdateOnlineConfig",
      requestType = ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationOnlineConfigRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationOnlineConfigRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig> getLlmEvaluationUpdateOnlineConfigMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationOnlineConfigRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig> getLlmEvaluationUpdateOnlineConfigMethod;
    if ((getLlmEvaluationUpdateOnlineConfigMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateOnlineConfigMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationUpdateOnlineConfigMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateOnlineConfigMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationUpdateOnlineConfigMethod = getLlmEvaluationUpdateOnlineConfigMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationOnlineConfigRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationUpdateOnlineConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationOnlineConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationUpdateOnlineConfig"))
              .build();
        }
      }
    }
    return getLlmEvaluationUpdateOnlineConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationOnlineConfigRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteOnlineConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationDeleteOnlineConfig",
      requestType = ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationOnlineConfigRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationOnlineConfigRequest,
      com.google.protobuf.Empty> getLlmEvaluationDeleteOnlineConfigMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationOnlineConfigRequest, com.google.protobuf.Empty> getLlmEvaluationDeleteOnlineConfigMethod;
    if ((getLlmEvaluationDeleteOnlineConfigMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteOnlineConfigMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationDeleteOnlineConfigMethod = LlmEvaluationsGrpc.getLlmEvaluationDeleteOnlineConfigMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationDeleteOnlineConfigMethod = getLlmEvaluationDeleteOnlineConfigMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationOnlineConfigRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationDeleteOnlineConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationOnlineConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationDeleteOnlineConfig"))
              .build();
        }
      }
    }
    return getLlmEvaluationDeleteOnlineConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineResultRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineResult> getLlmEvaluationGetOnlineResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationGetOnlineResult",
      requestType = ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineResultRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineResultRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineResult> getLlmEvaluationGetOnlineResultMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineResultRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineResult> getLlmEvaluationGetOnlineResultMethod;
    if ((getLlmEvaluationGetOnlineResultMethod = LlmEvaluationsGrpc.getLlmEvaluationGetOnlineResultMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationGetOnlineResultMethod = LlmEvaluationsGrpc.getLlmEvaluationGetOnlineResultMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationGetOnlineResultMethod = getLlmEvaluationGetOnlineResultMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineResultRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationGetOnlineResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineResult.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationGetOnlineResult"))
              .build();
        }
      }
    }
    return getLlmEvaluationGetOnlineResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsResponse> getLlmEvaluationListOnlineResultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationListOnlineResults",
      requestType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsResponse> getLlmEvaluationListOnlineResultsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsResponse> getLlmEvaluationListOnlineResultsMethod;
    if ((getLlmEvaluationListOnlineResultsMethod = LlmEvaluationsGrpc.getLlmEvaluationListOnlineResultsMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationListOnlineResultsMethod = LlmEvaluationsGrpc.getLlmEvaluationListOnlineResultsMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationListOnlineResultsMethod = getLlmEvaluationListOnlineResultsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationListOnlineResults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationListOnlineResults"))
              .build();
        }
      }
    }
    return getLlmEvaluationListOnlineResultsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAnnotationQueueItemRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem> getLlmEvaluationGetAnnotationQueueItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationGetAnnotationQueueItem",
      requestType = ondewo.nlu.LlmEvaluation.GetLlmEvaluationAnnotationQueueItemRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAnnotationQueueItemRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem> getLlmEvaluationGetAnnotationQueueItemMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAnnotationQueueItemRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem> getLlmEvaluationGetAnnotationQueueItemMethod;
    if ((getLlmEvaluationGetAnnotationQueueItemMethod = LlmEvaluationsGrpc.getLlmEvaluationGetAnnotationQueueItemMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationGetAnnotationQueueItemMethod = LlmEvaluationsGrpc.getLlmEvaluationGetAnnotationQueueItemMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationGetAnnotationQueueItemMethod = getLlmEvaluationGetAnnotationQueueItemMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAnnotationQueueItemRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationGetAnnotationQueueItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.GetLlmEvaluationAnnotationQueueItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationGetAnnotationQueueItem"))
              .build();
        }
      }
    }
    return getLlmEvaluationGetAnnotationQueueItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsResponse> getLlmEvaluationListAnnotationQueueItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationListAnnotationQueueItems",
      requestType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsRequest,
      ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsResponse> getLlmEvaluationListAnnotationQueueItemsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsResponse> getLlmEvaluationListAnnotationQueueItemsMethod;
    if ((getLlmEvaluationListAnnotationQueueItemsMethod = LlmEvaluationsGrpc.getLlmEvaluationListAnnotationQueueItemsMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationListAnnotationQueueItemsMethod = LlmEvaluationsGrpc.getLlmEvaluationListAnnotationQueueItemsMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationListAnnotationQueueItemsMethod = getLlmEvaluationListAnnotationQueueItemsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsRequest, ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationListAnnotationQueueItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationListAnnotationQueueItems"))
              .build();
        }
      }
    }
    return getLlmEvaluationListAnnotationQueueItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAnnotationQueueItemRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem> getLlmEvaluationUpdateAnnotationQueueItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationUpdateAnnotationQueueItem",
      requestType = ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAnnotationQueueItemRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAnnotationQueueItemRequest,
      ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem> getLlmEvaluationUpdateAnnotationQueueItemMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAnnotationQueueItemRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem> getLlmEvaluationUpdateAnnotationQueueItemMethod;
    if ((getLlmEvaluationUpdateAnnotationQueueItemMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateAnnotationQueueItemMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationUpdateAnnotationQueueItemMethod = LlmEvaluationsGrpc.getLlmEvaluationUpdateAnnotationQueueItemMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationUpdateAnnotationQueueItemMethod = getLlmEvaluationUpdateAnnotationQueueItemMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAnnotationQueueItemRequest, ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationUpdateAnnotationQueueItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAnnotationQueueItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationUpdateAnnotationQueueItem"))
              .build();
        }
      }
    }
    return getLlmEvaluationUpdateAnnotationQueueItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemRequest,
      ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemResponse> getLlmEvaluationPromoteAnnotationQueueItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LlmEvaluationPromoteAnnotationQueueItem",
      requestType = ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemRequest.class,
      responseType = ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemRequest,
      ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemResponse> getLlmEvaluationPromoteAnnotationQueueItemMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemRequest, ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemResponse> getLlmEvaluationPromoteAnnotationQueueItemMethod;
    if ((getLlmEvaluationPromoteAnnotationQueueItemMethod = LlmEvaluationsGrpc.getLlmEvaluationPromoteAnnotationQueueItemMethod) == null) {
      synchronized (LlmEvaluationsGrpc.class) {
        if ((getLlmEvaluationPromoteAnnotationQueueItemMethod = LlmEvaluationsGrpc.getLlmEvaluationPromoteAnnotationQueueItemMethod) == null) {
          LlmEvaluationsGrpc.getLlmEvaluationPromoteAnnotationQueueItemMethod = getLlmEvaluationPromoteAnnotationQueueItemMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemRequest, ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LlmEvaluationPromoteAnnotationQueueItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmEvaluationsMethodDescriptorSupplier("LlmEvaluationPromoteAnnotationQueueItem"))
              .build();
        }
      }
    }
    return getLlmEvaluationPromoteAnnotationQueueItemMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LlmEvaluationsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LlmEvaluationsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LlmEvaluationsStub>() {
        @java.lang.Override
        public LlmEvaluationsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LlmEvaluationsStub(channel, callOptions);
        }
      };
    return LlmEvaluationsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static LlmEvaluationsBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LlmEvaluationsBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LlmEvaluationsBlockingV2Stub>() {
        @java.lang.Override
        public LlmEvaluationsBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LlmEvaluationsBlockingV2Stub(channel, callOptions);
        }
      };
    return LlmEvaluationsBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LlmEvaluationsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LlmEvaluationsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LlmEvaluationsBlockingStub>() {
        @java.lang.Override
        public LlmEvaluationsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LlmEvaluationsBlockingStub(channel, callOptions);
        }
      };
    return LlmEvaluationsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LlmEvaluationsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LlmEvaluationsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LlmEvaluationsFutureStub>() {
        @java.lang.Override
        public LlmEvaluationsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LlmEvaluationsFutureStub(channel, callOptions);
        }
      };
    return LlmEvaluationsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * LangSmith-style evaluation surface: datasets, examples, experiments, evaluator
   * runs, feedback (LLM-as-judge / human / heuristic / custom code / pairwise),
   * pairwise comparisons, release gates + persisted gate runs, scorecards,
   * per-project evaluation settings (judge configuration), the evaluator registry,
   * golden-transcript recording from sessions, conversation simulation
   * (standard + adversarial red-teaming), recurring schedules and report artifacts.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a new evaluation dataset.
     * </pre>
     */
    default void llmEvaluationCreateDataset(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationDatasetRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationDataset> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationCreateDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an evaluation dataset by resource name.
     * </pre>
     */
    default void llmEvaluationGetDataset(ondewo.nlu.LlmEvaluation.GetLlmEvaluationDatasetRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationDataset> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationGetDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * List evaluation datasets in the project, optionally filtered + paginated.
     * </pre>
     */
    default void llmEvaluationListDatasets(ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationListDatasetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update metadata of an existing evaluation dataset (examples managed via Add/Update/Delete RPCs).
     * </pre>
     */
    default void llmEvaluationUpdateDataset(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationDatasetRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationDataset> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationUpdateDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an evaluation dataset and all owned examples.
     * </pre>
     */
    default void llmEvaluationDeleteDataset(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationDeleteDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a single example to an existing dataset.
     * </pre>
     */
    default void llmEvaluationAddExample(ondewo.nlu.LlmEvaluation.AddLlmEvaluationExampleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationExample> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationAddExampleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add multiple examples to an existing dataset in one call.
     * </pre>
     */
    default void llmEvaluationAddExamples(ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationAddExamplesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a single evaluation example by resource name.
     * </pre>
     */
    default void llmEvaluationGetExample(ondewo.nlu.LlmEvaluation.GetLlmEvaluationExampleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationExample> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationGetExampleMethod(), responseObserver);
    }

    /**
     * <pre>
     * List examples in a dataset, optionally filtered + paginated.
     * </pre>
     */
    default void llmEvaluationListExamples(ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationListExamplesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update fields of an existing evaluation example.
     * </pre>
     */
    default void llmEvaluationUpdateExample(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExampleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationExample> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationUpdateExampleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an evaluation example.
     * </pre>
     */
    default void llmEvaluationDeleteExample(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExampleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationDeleteExampleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Run a fresh experiment over a dataset. Long-running operation: the returned
     * Operation resolves to the completed LlmEvaluationExperiment once all
     * evaluators have produced feedback.
     * </pre>
     */
    default void llmEvaluationRunExperiment(ondewo.nlu.LlmEvaluation.RunLlmEvaluationExperimentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationRunExperimentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a previously-run experiment by resource name.
     * </pre>
     */
    default void llmEvaluationGetExperiment(ondewo.nlu.LlmEvaluation.GetLlmEvaluationExperimentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationGetExperimentMethod(), responseObserver);
    }

    /**
     * <pre>
     * List experiments in a project, optionally filtered + paginated.
     * </pre>
     */
    default void llmEvaluationListExperiments(ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationListExperimentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update metadata of an experiment (e.g. baseline pointer, display_name).
     * Evaluator runs and feedback are immutable; use LlmEvaluationSubmitFeedback /
     * LlmEvaluationDeleteFeedback for downstream annotations.
     * </pre>
     */
    default void llmEvaluationUpdateExperiment(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExperimentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationUpdateExperimentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an experiment and all owned evaluator runs + feedbacks.
     * </pre>
     */
    default void llmEvaluationDeleteExperiment(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationDeleteExperimentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel a still-running experiment. No-op if already finished.
     * </pre>
     */
    default void llmEvaluationCancelExperiment(ondewo.nlu.LlmEvaluation.CancelLlmEvaluationExperimentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationCancelExperimentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Compare two-or-more experiments and emit a pairwise comparison report.
     * </pre>
     */
    default void llmEvaluationCompareExperiments(ondewo.nlu.LlmEvaluation.CompareLlmEvaluationExperimentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationComparison> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationCompareExperimentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Submit a single feedback record (used by human reviewers / external evaluators).
     * </pre>
     */
    default void llmEvaluationSubmitFeedback(ondewo.nlu.LlmEvaluation.SubmitLlmEvaluationFeedbackRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationSubmitFeedbackMethod(), responseObserver);
    }

    /**
     * <pre>
     * List feedback records, optionally filtered + paginated.
     * </pre>
     */
    default void llmEvaluationListFeedback(ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationListFeedbackMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a single feedback record.
     * </pre>
     */
    default void llmEvaluationDeleteFeedback(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationDeleteFeedbackMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a single feedback record (e.g. correct a human review score or comment).
     * </pre>
     */
    default void llmEvaluationUpdateFeedback(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationFeedbackRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationUpdateFeedbackMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new release gate (a named set of thresholds over evaluator scores,
     * regression deltas and telemetry that decides whether a candidate configuration ships).
     * </pre>
     */
    default void llmEvaluationCreateReleaseGate(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReleaseGateRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationCreateReleaseGateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a release gate by resource name.
     * </pre>
     */
    default void llmEvaluationGetReleaseGate(ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationGetReleaseGateMethod(), responseObserver);
    }

    /**
     * <pre>
     * List release gates in the project, optionally filtered + paginated.
     * </pre>
     */
    default void llmEvaluationListReleaseGates(ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationListReleaseGatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an existing release gate. Semantic changes (suite, baseline,
     * evaluators, thresholds, weights, safety) increment the server-managed revision.
     * </pre>
     */
    default void llmEvaluationUpdateReleaseGate(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationReleaseGateRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationUpdateReleaseGateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a release gate and all owned gate runs.
     * </pre>
     */
    default void llmEvaluationDeleteReleaseGate(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReleaseGateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationDeleteReleaseGateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Run a release gate against a candidate target. Long-running operation: the
     * returned Operation resolves to the completed LlmEvaluationReleaseGateRun once
     * the candidate (and optional safety) experiments finished and the verdict has
     * been computed and persisted server-side.
     * </pre>
     */
    default void llmEvaluationRunReleaseGate(ondewo.nlu.LlmEvaluation.RunLlmEvaluationReleaseGateRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationRunReleaseGateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a single release gate run (persisted verdict + checks) by resource name.
     * </pre>
     */
    default void llmEvaluationGetReleaseGateRun(ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRunRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGateRun> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationGetReleaseGateRunMethod(), responseObserver);
    }

    /**
     * <pre>
     * List release gate runs, optionally filtered + paginated.
     * </pre>
     */
    default void llmEvaluationListReleaseGateRuns(ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationListReleaseGateRunsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new scorecard (weighted multi-criteria roll-up definition).
     * </pre>
     */
    default void llmEvaluationCreateScorecard(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScorecardRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationCreateScorecardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a scorecard by resource name.
     * </pre>
     */
    default void llmEvaluationGetScorecard(ondewo.nlu.LlmEvaluation.GetLlmEvaluationScorecardRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationGetScorecardMethod(), responseObserver);
    }

    /**
     * <pre>
     * List scorecards in the project, optionally filtered + paginated.
     * </pre>
     */
    default void llmEvaluationListScorecards(ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationListScorecardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an existing scorecard.
     * </pre>
     */
    default void llmEvaluationUpdateScorecard(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScorecardRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationUpdateScorecardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a scorecard.
     * </pre>
     */
    default void llmEvaluationDeleteScorecard(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScorecardRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationDeleteScorecardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the per-(project, language_code) evaluation settings singleton (judge
     * configuration, default weights, pass cutoffs). The server auto-creates
     * default settings on first access.
     * </pre>
     */
    default void llmEvaluationGetProjectSettings(ondewo.nlu.LlmEvaluation.GetLlmEvaluationProjectSettingsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationGetProjectSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the per-(project, language_code) evaluation settings singleton.
     * </pre>
     */
    default void llmEvaluationUpdateProjectSettings(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationProjectSettingsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationUpdateProjectSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List the evaluators available on this server, with metadata describing the
     * category, required example fields, multi-turn support, default threshold,
     * judge requirement and configurable parameters of each evaluator.
     * </pre>
     */
    default void llmEvaluationListEvaluators(ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationListEvaluatorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Convert a recorded session (or a selection of its session steps) into
     * evaluation examples ("golden transcripts") inside an existing dataset.
     * </pre>
     */
    default void llmEvaluationCreateExamplesFromSession(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationCreateExamplesFromSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generate synthetic multi-turn evaluation conversations by simulating users
     * (persona-driven; STANDARD kind) or attackers (red-teaming; ADVERSARIAL kind)
     * against the live target. Long-running operation: the returned Operation
     * resolves once the generated examples have been persisted into the receiving dataset.
     * </pre>
     */
    default void llmEvaluationSimulateConversations(ondewo.nlu.LlmEvaluation.SimulateLlmEvaluationConversationsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationSimulateConversationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new schedule for recurring experiment / release gate runs.
     * </pre>
     */
    default void llmEvaluationCreateSchedule(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScheduleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationCreateScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a schedule by resource name.
     * </pre>
     */
    default void llmEvaluationGetSchedule(ondewo.nlu.LlmEvaluation.GetLlmEvaluationScheduleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationGetScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * List schedules in the project, optionally filtered + paginated.
     * </pre>
     */
    default void llmEvaluationListSchedules(ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationListSchedulesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an existing schedule (cron / interval, enabled flag, request template).
     * </pre>
     */
    default void llmEvaluationUpdateSchedule(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScheduleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationUpdateScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a schedule. Experiments / gate runs already created by it are kept.
     * </pre>
     */
    default void llmEvaluationDeleteSchedule(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScheduleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationDeleteScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Persist a generated report as an immutable artifact (incl. payload bytes).
     * </pre>
     */
    default void llmEvaluationCreateReport(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReportRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationReport> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationCreateReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a report by resource name (incl. payload bytes).
     * </pre>
     */
    default void llmEvaluationGetReport(ondewo.nlu.LlmEvaluation.GetLlmEvaluationReportRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationReport> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationGetReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * List reports, optionally filtered + paginated. Payload bytes are omitted
     * unless explicitly requested via field_mask.
     * </pre>
     */
    default void llmEvaluationListReports(ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationListReportsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a report.
     * </pre>
     */
    default void llmEvaluationDeleteReport(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReportRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationDeleteReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new A/B experiment (a set of routing variants over live
     * DetectIntent traffic). Created in DRAFT status; traffic is only split once
     * it is started via LlmEvaluationStartAbExperiment.
     * </pre>
     */
    default void llmEvaluationCreateAbExperiment(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationAbExperimentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationCreateAbExperimentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an A/B experiment by resource name.
     * </pre>
     */
    default void llmEvaluationGetAbExperiment(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationGetAbExperimentMethod(), responseObserver);
    }

    /**
     * <pre>
     * List A/B experiments in the project, optionally filtered + paginated.
     * </pre>
     */
    default void llmEvaluationListAbExperiments(ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationListAbExperimentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an existing A/B experiment (variants, traffic config, metadata).
     * Only allowed in DRAFT / STOPPED status; running experiments must be stopped first.
     * </pre>
     */
    default void llmEvaluationUpdateAbExperiment(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAbExperimentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationUpdateAbExperimentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an A/B experiment and all owned sticky-assignment rows.
     * </pre>
     */
    default void llmEvaluationDeleteAbExperiment(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationAbExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationDeleteAbExperimentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start an A/B experiment: validates that the variant traffic weights are
     * well-formed (sum to the configured total), stamps started_at and transitions
     * the experiment to RUNNING so live traffic begins to be split.
     * </pre>
     */
    default void llmEvaluationStartAbExperiment(ondewo.nlu.LlmEvaluation.StartLlmEvaluationAbExperimentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationStartAbExperimentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop a running A/B experiment: stamps stopped_at and transitions to STOPPED.
     * Existing sticky assignments are retained for results computation.
     * </pre>
     */
    default void llmEvaluationStopAbExperiment(ondewo.nlu.LlmEvaluation.StopLlmEvaluationAbExperimentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationStopAbExperimentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Compute per-variant telemetry rollups for an A/B experiment. Stateless /
     * computed on demand: gathers each variant's sessions and aggregates their
     * LlmTelemetry into a per-variant LlmTelemetryReport. There is no auto-rollout.
     * </pre>
     */
    default void llmEvaluationGetAbExperimentResults(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationGetAbExperimentResultsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Compute a rollout recommendation for an A/B experiment: which variant wins
     * against the control on the chosen optimize metric under the supplied
     * statistical guard-rails (confidence level, minimum sessions per variant,
     * minimum effect size). Stateless / read-only — computed on demand from the
     * per-variant results; nothing is persisted and no traffic / config changes.
     * </pre>
     */
    default void llmEvaluationGetAbRolloutRecommendation(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutRecommendationRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutRecommendation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationGetAbRolloutRecommendationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Apply a rollout for an A/B experiment: promotes the chosen variant's config
     * as the project's classifier default, stops the experiment, and writes +
     * returns the LlmEvaluationAbRolloutDecision audit record. The operator picks
     * the variant explicitly (there is no auto-rollout). Idempotent: re-applying
     * an already-rolled-out experiment returns the existing decision.
     * </pre>
     */
    default void llmEvaluationApplyAbRollout(ondewo.nlu.LlmEvaluation.ApplyLlmEvaluationAbRolloutRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationApplyAbRolloutMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the applied rollout decision (audit record) by resource name.
     * </pre>
     */
    default void llmEvaluationGetAbRolloutDecision(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutDecisionRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationGetAbRolloutDecisionMethod(), responseObserver);
    }

    /**
     * <pre>
     * List applied rollout decisions in the project, optionally filtered (e.g. by
     * experiment) + paginated.
     * </pre>
     */
    default void llmEvaluationListAbRolloutDecisions(ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationListAbRolloutDecisionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new online-evaluation config: a per-(project, language_code)
     * definition selecting a reference-free evaluator set + a sample rate. A
     * swarm-safe background worker samples already-persisted live session steps,
     * scores the recorded answer with these evaluators and enqueues failing steps
     * into the annotation queue.
     * </pre>
     */
    default void llmEvaluationCreateOnlineConfig(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationOnlineConfigRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationCreateOnlineConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an online-evaluation config by resource name.
     * </pre>
     */
    default void llmEvaluationGetOnlineConfig(ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineConfigRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationGetOnlineConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * List online-evaluation configs in the project, optionally filtered + paginated.
     * </pre>
     */
    default void llmEvaluationListOnlineConfigs(ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationListOnlineConfigsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an existing online-evaluation config (enabled flag, evaluator set,
     * sample rate, thresholds, session filter).
     * </pre>
     */
    default void llmEvaluationUpdateOnlineConfig(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationOnlineConfigRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationUpdateOnlineConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an online-evaluation config. Already-produced online results and
     * annotation-queue items are kept.
     * </pre>
     */
    default void llmEvaluationDeleteOnlineConfig(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationOnlineConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationDeleteOnlineConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a single online-evaluation result (per scored session step) by resource name.
     * </pre>
     */
    default void llmEvaluationGetOnlineResult(ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineResultRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationGetOnlineResultMethod(), responseObserver);
    }

    /**
     * <pre>
     * List online-evaluation results, optionally filtered by config / pass-state + paginated.
     * Read-only: result rows are produced by the online-evaluation worker (no Create RPC).
     * </pre>
     */
    default void llmEvaluationListOnlineResults(ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationListOnlineResultsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a single annotation-queue item by resource name.
     * </pre>
     */
    default void llmEvaluationGetAnnotationQueueItem(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAnnotationQueueItemRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationGetAnnotationQueueItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * List annotation-queue items, optionally filtered by status / assignee + paginated.
     * Items are enqueued by the online-evaluation worker (no Create RPC).
     * </pre>
     */
    default void llmEvaluationListAnnotationQueueItems(ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationListAnnotationQueueItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an annotation-queue item (status / assignee / reason transitions:
     * PENDING -&gt; REVIEWED / DISMISSED).
     * </pre>
     */
    default void llmEvaluationUpdateAnnotationQueueItem(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAnnotationQueueItemRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationUpdateAnnotationQueueItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Promote an annotation-queue item into a regression dataset. Thin server-side
     * composition: delegates to LlmEvaluationCreateExamplesFromSession with the
     * item's session (+ selected steps), flips the item status to PROMOTED and
     * stamps the promoted dataset name. Returns the created example(s).
     * </pre>
     */
    default void llmEvaluationPromoteAnnotationQueueItem(ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLlmEvaluationPromoteAnnotationQueueItemMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LlmEvaluations.
   * <pre>
   * LangSmith-style evaluation surface: datasets, examples, experiments, evaluator
   * runs, feedback (LLM-as-judge / human / heuristic / custom code / pairwise),
   * pairwise comparisons, release gates + persisted gate runs, scorecards,
   * per-project evaluation settings (judge configuration), the evaluator registry,
   * golden-transcript recording from sessions, conversation simulation
   * (standard + adversarial red-teaming), recurring schedules and report artifacts.
   * </pre>
   */
  public static abstract class LlmEvaluationsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LlmEvaluationsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LlmEvaluations.
   * <pre>
   * LangSmith-style evaluation surface: datasets, examples, experiments, evaluator
   * runs, feedback (LLM-as-judge / human / heuristic / custom code / pairwise),
   * pairwise comparisons, release gates + persisted gate runs, scorecards,
   * per-project evaluation settings (judge configuration), the evaluator registry,
   * golden-transcript recording from sessions, conversation simulation
   * (standard + adversarial red-teaming), recurring schedules and report artifacts.
   * </pre>
   */
  public static final class LlmEvaluationsStub
      extends io.grpc.stub.AbstractAsyncStub<LlmEvaluationsStub> {
    private LlmEvaluationsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LlmEvaluationsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LlmEvaluationsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new evaluation dataset.
     * </pre>
     */
    public void llmEvaluationCreateDataset(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationDatasetRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationDataset> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationCreateDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an evaluation dataset by resource name.
     * </pre>
     */
    public void llmEvaluationGetDataset(ondewo.nlu.LlmEvaluation.GetLlmEvaluationDatasetRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationDataset> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationGetDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List evaluation datasets in the project, optionally filtered + paginated.
     * </pre>
     */
    public void llmEvaluationListDatasets(ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationListDatasetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update metadata of an existing evaluation dataset (examples managed via Add/Update/Delete RPCs).
     * </pre>
     */
    public void llmEvaluationUpdateDataset(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationDatasetRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationDataset> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an evaluation dataset and all owned examples.
     * </pre>
     */
    public void llmEvaluationDeleteDataset(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a single example to an existing dataset.
     * </pre>
     */
    public void llmEvaluationAddExample(ondewo.nlu.LlmEvaluation.AddLlmEvaluationExampleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationExample> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationAddExampleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add multiple examples to an existing dataset in one call.
     * </pre>
     */
    public void llmEvaluationAddExamples(ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationAddExamplesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a single evaluation example by resource name.
     * </pre>
     */
    public void llmEvaluationGetExample(ondewo.nlu.LlmEvaluation.GetLlmEvaluationExampleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationExample> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationGetExampleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List examples in a dataset, optionally filtered + paginated.
     * </pre>
     */
    public void llmEvaluationListExamples(ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationListExamplesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update fields of an existing evaluation example.
     * </pre>
     */
    public void llmEvaluationUpdateExample(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExampleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationExample> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateExampleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an evaluation example.
     * </pre>
     */
    public void llmEvaluationDeleteExample(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExampleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteExampleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Run a fresh experiment over a dataset. Long-running operation: the returned
     * Operation resolves to the completed LlmEvaluationExperiment once all
     * evaluators have produced feedback.
     * </pre>
     */
    public void llmEvaluationRunExperiment(ondewo.nlu.LlmEvaluation.RunLlmEvaluationExperimentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationRunExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a previously-run experiment by resource name.
     * </pre>
     */
    public void llmEvaluationGetExperiment(ondewo.nlu.LlmEvaluation.GetLlmEvaluationExperimentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationGetExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List experiments in a project, optionally filtered + paginated.
     * </pre>
     */
    public void llmEvaluationListExperiments(ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationListExperimentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update metadata of an experiment (e.g. baseline pointer, display_name).
     * Evaluator runs and feedback are immutable; use LlmEvaluationSubmitFeedback /
     * LlmEvaluationDeleteFeedback for downstream annotations.
     * </pre>
     */
    public void llmEvaluationUpdateExperiment(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExperimentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an experiment and all owned evaluator runs + feedbacks.
     * </pre>
     */
    public void llmEvaluationDeleteExperiment(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel a still-running experiment. No-op if already finished.
     * </pre>
     */
    public void llmEvaluationCancelExperiment(ondewo.nlu.LlmEvaluation.CancelLlmEvaluationExperimentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationCancelExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Compare two-or-more experiments and emit a pairwise comparison report.
     * </pre>
     */
    public void llmEvaluationCompareExperiments(ondewo.nlu.LlmEvaluation.CompareLlmEvaluationExperimentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationComparison> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationCompareExperimentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Submit a single feedback record (used by human reviewers / external evaluators).
     * </pre>
     */
    public void llmEvaluationSubmitFeedback(ondewo.nlu.LlmEvaluation.SubmitLlmEvaluationFeedbackRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationSubmitFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List feedback records, optionally filtered + paginated.
     * </pre>
     */
    public void llmEvaluationListFeedback(ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationListFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a single feedback record.
     * </pre>
     */
    public void llmEvaluationDeleteFeedback(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a single feedback record (e.g. correct a human review score or comment).
     * </pre>
     */
    public void llmEvaluationUpdateFeedback(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationFeedbackRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new release gate (a named set of thresholds over evaluator scores,
     * regression deltas and telemetry that decides whether a candidate configuration ships).
     * </pre>
     */
    public void llmEvaluationCreateReleaseGate(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReleaseGateRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationCreateReleaseGateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a release gate by resource name.
     * </pre>
     */
    public void llmEvaluationGetReleaseGate(ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationGetReleaseGateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List release gates in the project, optionally filtered + paginated.
     * </pre>
     */
    public void llmEvaluationListReleaseGates(ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationListReleaseGatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an existing release gate. Semantic changes (suite, baseline,
     * evaluators, thresholds, weights, safety) increment the server-managed revision.
     * </pre>
     */
    public void llmEvaluationUpdateReleaseGate(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationReleaseGateRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateReleaseGateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a release gate and all owned gate runs.
     * </pre>
     */
    public void llmEvaluationDeleteReleaseGate(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReleaseGateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteReleaseGateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Run a release gate against a candidate target. Long-running operation: the
     * returned Operation resolves to the completed LlmEvaluationReleaseGateRun once
     * the candidate (and optional safety) experiments finished and the verdict has
     * been computed and persisted server-side.
     * </pre>
     */
    public void llmEvaluationRunReleaseGate(ondewo.nlu.LlmEvaluation.RunLlmEvaluationReleaseGateRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationRunReleaseGateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a single release gate run (persisted verdict + checks) by resource name.
     * </pre>
     */
    public void llmEvaluationGetReleaseGateRun(ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRunRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGateRun> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationGetReleaseGateRunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List release gate runs, optionally filtered + paginated.
     * </pre>
     */
    public void llmEvaluationListReleaseGateRuns(ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationListReleaseGateRunsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new scorecard (weighted multi-criteria roll-up definition).
     * </pre>
     */
    public void llmEvaluationCreateScorecard(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScorecardRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationCreateScorecardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a scorecard by resource name.
     * </pre>
     */
    public void llmEvaluationGetScorecard(ondewo.nlu.LlmEvaluation.GetLlmEvaluationScorecardRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationGetScorecardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List scorecards in the project, optionally filtered + paginated.
     * </pre>
     */
    public void llmEvaluationListScorecards(ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationListScorecardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an existing scorecard.
     * </pre>
     */
    public void llmEvaluationUpdateScorecard(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScorecardRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateScorecardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a scorecard.
     * </pre>
     */
    public void llmEvaluationDeleteScorecard(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScorecardRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteScorecardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the per-(project, language_code) evaluation settings singleton (judge
     * configuration, default weights, pass cutoffs). The server auto-creates
     * default settings on first access.
     * </pre>
     */
    public void llmEvaluationGetProjectSettings(ondewo.nlu.LlmEvaluation.GetLlmEvaluationProjectSettingsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationGetProjectSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the per-(project, language_code) evaluation settings singleton.
     * </pre>
     */
    public void llmEvaluationUpdateProjectSettings(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationProjectSettingsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateProjectSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List the evaluators available on this server, with metadata describing the
     * category, required example fields, multi-turn support, default threshold,
     * judge requirement and configurable parameters of each evaluator.
     * </pre>
     */
    public void llmEvaluationListEvaluators(ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationListEvaluatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Convert a recorded session (or a selection of its session steps) into
     * evaluation examples ("golden transcripts") inside an existing dataset.
     * </pre>
     */
    public void llmEvaluationCreateExamplesFromSession(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationCreateExamplesFromSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generate synthetic multi-turn evaluation conversations by simulating users
     * (persona-driven; STANDARD kind) or attackers (red-teaming; ADVERSARIAL kind)
     * against the live target. Long-running operation: the returned Operation
     * resolves once the generated examples have been persisted into the receiving dataset.
     * </pre>
     */
    public void llmEvaluationSimulateConversations(ondewo.nlu.LlmEvaluation.SimulateLlmEvaluationConversationsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationSimulateConversationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new schedule for recurring experiment / release gate runs.
     * </pre>
     */
    public void llmEvaluationCreateSchedule(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScheduleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationCreateScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a schedule by resource name.
     * </pre>
     */
    public void llmEvaluationGetSchedule(ondewo.nlu.LlmEvaluation.GetLlmEvaluationScheduleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationGetScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List schedules in the project, optionally filtered + paginated.
     * </pre>
     */
    public void llmEvaluationListSchedules(ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationListSchedulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an existing schedule (cron / interval, enabled flag, request template).
     * </pre>
     */
    public void llmEvaluationUpdateSchedule(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScheduleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a schedule. Experiments / gate runs already created by it are kept.
     * </pre>
     */
    public void llmEvaluationDeleteSchedule(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScheduleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Persist a generated report as an immutable artifact (incl. payload bytes).
     * </pre>
     */
    public void llmEvaluationCreateReport(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReportRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationReport> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationCreateReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a report by resource name (incl. payload bytes).
     * </pre>
     */
    public void llmEvaluationGetReport(ondewo.nlu.LlmEvaluation.GetLlmEvaluationReportRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationReport> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationGetReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List reports, optionally filtered + paginated. Payload bytes are omitted
     * unless explicitly requested via field_mask.
     * </pre>
     */
    public void llmEvaluationListReports(ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationListReportsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a report.
     * </pre>
     */
    public void llmEvaluationDeleteReport(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReportRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new A/B experiment (a set of routing variants over live
     * DetectIntent traffic). Created in DRAFT status; traffic is only split once
     * it is started via LlmEvaluationStartAbExperiment.
     * </pre>
     */
    public void llmEvaluationCreateAbExperiment(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationAbExperimentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationCreateAbExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an A/B experiment by resource name.
     * </pre>
     */
    public void llmEvaluationGetAbExperiment(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationGetAbExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List A/B experiments in the project, optionally filtered + paginated.
     * </pre>
     */
    public void llmEvaluationListAbExperiments(ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationListAbExperimentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an existing A/B experiment (variants, traffic config, metadata).
     * Only allowed in DRAFT / STOPPED status; running experiments must be stopped first.
     * </pre>
     */
    public void llmEvaluationUpdateAbExperiment(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAbExperimentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateAbExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an A/B experiment and all owned sticky-assignment rows.
     * </pre>
     */
    public void llmEvaluationDeleteAbExperiment(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationAbExperimentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteAbExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start an A/B experiment: validates that the variant traffic weights are
     * well-formed (sum to the configured total), stamps started_at and transitions
     * the experiment to RUNNING so live traffic begins to be split.
     * </pre>
     */
    public void llmEvaluationStartAbExperiment(ondewo.nlu.LlmEvaluation.StartLlmEvaluationAbExperimentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationStartAbExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop a running A/B experiment: stamps stopped_at and transitions to STOPPED.
     * Existing sticky assignments are retained for results computation.
     * </pre>
     */
    public void llmEvaluationStopAbExperiment(ondewo.nlu.LlmEvaluation.StopLlmEvaluationAbExperimentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationStopAbExperimentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Compute per-variant telemetry rollups for an A/B experiment. Stateless /
     * computed on demand: gathers each variant's sessions and aggregates their
     * LlmTelemetry into a per-variant LlmTelemetryReport. There is no auto-rollout.
     * </pre>
     */
    public void llmEvaluationGetAbExperimentResults(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationGetAbExperimentResultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Compute a rollout recommendation for an A/B experiment: which variant wins
     * against the control on the chosen optimize metric under the supplied
     * statistical guard-rails (confidence level, minimum sessions per variant,
     * minimum effect size). Stateless / read-only — computed on demand from the
     * per-variant results; nothing is persisted and no traffic / config changes.
     * </pre>
     */
    public void llmEvaluationGetAbRolloutRecommendation(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutRecommendationRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutRecommendation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationGetAbRolloutRecommendationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Apply a rollout for an A/B experiment: promotes the chosen variant's config
     * as the project's classifier default, stops the experiment, and writes +
     * returns the LlmEvaluationAbRolloutDecision audit record. The operator picks
     * the variant explicitly (there is no auto-rollout). Idempotent: re-applying
     * an already-rolled-out experiment returns the existing decision.
     * </pre>
     */
    public void llmEvaluationApplyAbRollout(ondewo.nlu.LlmEvaluation.ApplyLlmEvaluationAbRolloutRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationApplyAbRolloutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the applied rollout decision (audit record) by resource name.
     * </pre>
     */
    public void llmEvaluationGetAbRolloutDecision(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutDecisionRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationGetAbRolloutDecisionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List applied rollout decisions in the project, optionally filtered (e.g. by
     * experiment) + paginated.
     * </pre>
     */
    public void llmEvaluationListAbRolloutDecisions(ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationListAbRolloutDecisionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new online-evaluation config: a per-(project, language_code)
     * definition selecting a reference-free evaluator set + a sample rate. A
     * swarm-safe background worker samples already-persisted live session steps,
     * scores the recorded answer with these evaluators and enqueues failing steps
     * into the annotation queue.
     * </pre>
     */
    public void llmEvaluationCreateOnlineConfig(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationOnlineConfigRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationCreateOnlineConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an online-evaluation config by resource name.
     * </pre>
     */
    public void llmEvaluationGetOnlineConfig(ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineConfigRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationGetOnlineConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List online-evaluation configs in the project, optionally filtered + paginated.
     * </pre>
     */
    public void llmEvaluationListOnlineConfigs(ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationListOnlineConfigsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an existing online-evaluation config (enabled flag, evaluator set,
     * sample rate, thresholds, session filter).
     * </pre>
     */
    public void llmEvaluationUpdateOnlineConfig(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationOnlineConfigRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateOnlineConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an online-evaluation config. Already-produced online results and
     * annotation-queue items are kept.
     * </pre>
     */
    public void llmEvaluationDeleteOnlineConfig(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationOnlineConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteOnlineConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a single online-evaluation result (per scored session step) by resource name.
     * </pre>
     */
    public void llmEvaluationGetOnlineResult(ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineResultRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationGetOnlineResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List online-evaluation results, optionally filtered by config / pass-state + paginated.
     * Read-only: result rows are produced by the online-evaluation worker (no Create RPC).
     * </pre>
     */
    public void llmEvaluationListOnlineResults(ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationListOnlineResultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a single annotation-queue item by resource name.
     * </pre>
     */
    public void llmEvaluationGetAnnotationQueueItem(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAnnotationQueueItemRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationGetAnnotationQueueItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List annotation-queue items, optionally filtered by status / assignee + paginated.
     * Items are enqueued by the online-evaluation worker (no Create RPC).
     * </pre>
     */
    public void llmEvaluationListAnnotationQueueItems(ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationListAnnotationQueueItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an annotation-queue item (status / assignee / reason transitions:
     * PENDING -&gt; REVIEWED / DISMISSED).
     * </pre>
     */
    public void llmEvaluationUpdateAnnotationQueueItem(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAnnotationQueueItemRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateAnnotationQueueItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Promote an annotation-queue item into a regression dataset. Thin server-side
     * composition: delegates to LlmEvaluationCreateExamplesFromSession with the
     * item's session (+ selected steps), flips the item status to PROMOTED and
     * stamps the promoted dataset name. Returns the created example(s).
     * </pre>
     */
    public void llmEvaluationPromoteAnnotationQueueItem(ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLlmEvaluationPromoteAnnotationQueueItemMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LlmEvaluations.
   * <pre>
   * LangSmith-style evaluation surface: datasets, examples, experiments, evaluator
   * runs, feedback (LLM-as-judge / human / heuristic / custom code / pairwise),
   * pairwise comparisons, release gates + persisted gate runs, scorecards,
   * per-project evaluation settings (judge configuration), the evaluator registry,
   * golden-transcript recording from sessions, conversation simulation
   * (standard + adversarial red-teaming), recurring schedules and report artifacts.
   * </pre>
   */
  public static final class LlmEvaluationsBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<LlmEvaluationsBlockingV2Stub> {
    private LlmEvaluationsBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LlmEvaluationsBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LlmEvaluationsBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new evaluation dataset.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationDataset llmEvaluationCreateDataset(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationDatasetRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationCreateDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an evaluation dataset by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationDataset llmEvaluationGetDataset(ondewo.nlu.LlmEvaluation.GetLlmEvaluationDatasetRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationGetDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List evaluation datasets in the project, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsResponse llmEvaluationListDatasets(ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationListDatasetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update metadata of an existing evaluation dataset (examples managed via Add/Update/Delete RPCs).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationDataset llmEvaluationUpdateDataset(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationDatasetRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationUpdateDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an evaluation dataset and all owned examples.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteDataset(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationDatasetRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationDeleteDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a single example to an existing dataset.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationExample llmEvaluationAddExample(ondewo.nlu.LlmEvaluation.AddLlmEvaluationExampleRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationAddExampleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add multiple examples to an existing dataset in one call.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesResponse llmEvaluationAddExamples(ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationAddExamplesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a single evaluation example by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationExample llmEvaluationGetExample(ondewo.nlu.LlmEvaluation.GetLlmEvaluationExampleRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationGetExampleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List examples in a dataset, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesResponse llmEvaluationListExamples(ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationListExamplesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update fields of an existing evaluation example.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationExample llmEvaluationUpdateExample(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExampleRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationUpdateExampleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an evaluation example.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteExample(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExampleRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationDeleteExampleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Run a fresh experiment over a dataset. Long-running operation: the returned
     * Operation resolves to the completed LlmEvaluationExperiment once all
     * evaluators have produced feedback.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation llmEvaluationRunExperiment(ondewo.nlu.LlmEvaluation.RunLlmEvaluationExperimentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationRunExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a previously-run experiment by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment llmEvaluationGetExperiment(ondewo.nlu.LlmEvaluation.GetLlmEvaluationExperimentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationGetExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List experiments in a project, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsResponse llmEvaluationListExperiments(ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationListExperimentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update metadata of an experiment (e.g. baseline pointer, display_name).
     * Evaluator runs and feedback are immutable; use LlmEvaluationSubmitFeedback /
     * LlmEvaluationDeleteFeedback for downstream annotations.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment llmEvaluationUpdateExperiment(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExperimentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationUpdateExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an experiment and all owned evaluator runs + feedbacks.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteExperiment(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExperimentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationDeleteExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel a still-running experiment. No-op if already finished.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment llmEvaluationCancelExperiment(ondewo.nlu.LlmEvaluation.CancelLlmEvaluationExperimentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationCancelExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Compare two-or-more experiments and emit a pairwise comparison report.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationComparison llmEvaluationCompareExperiments(ondewo.nlu.LlmEvaluation.CompareLlmEvaluationExperimentsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationCompareExperimentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Submit a single feedback record (used by human reviewers / external evaluators).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback llmEvaluationSubmitFeedback(ondewo.nlu.LlmEvaluation.SubmitLlmEvaluationFeedbackRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationSubmitFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List feedback records, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackResponse llmEvaluationListFeedback(ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationListFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a single feedback record.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteFeedback(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationFeedbackRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationDeleteFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a single feedback record (e.g. correct a human review score or comment).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback llmEvaluationUpdateFeedback(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationFeedbackRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationUpdateFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new release gate (a named set of thresholds over evaluator scores,
     * regression deltas and telemetry that decides whether a candidate configuration ships).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate llmEvaluationCreateReleaseGate(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReleaseGateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationCreateReleaseGateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a release gate by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate llmEvaluationGetReleaseGate(ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationGetReleaseGateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List release gates in the project, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesResponse llmEvaluationListReleaseGates(ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationListReleaseGatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing release gate. Semantic changes (suite, baseline,
     * evaluators, thresholds, weights, safety) increment the server-managed revision.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate llmEvaluationUpdateReleaseGate(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationReleaseGateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationUpdateReleaseGateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a release gate and all owned gate runs.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteReleaseGate(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReleaseGateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationDeleteReleaseGateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Run a release gate against a candidate target. Long-running operation: the
     * returned Operation resolves to the completed LlmEvaluationReleaseGateRun once
     * the candidate (and optional safety) experiments finished and the verdict has
     * been computed and persisted server-side.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation llmEvaluationRunReleaseGate(ondewo.nlu.LlmEvaluation.RunLlmEvaluationReleaseGateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationRunReleaseGateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a single release gate run (persisted verdict + checks) by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGateRun llmEvaluationGetReleaseGateRun(ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRunRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationGetReleaseGateRunMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List release gate runs, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsResponse llmEvaluationListReleaseGateRuns(ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationListReleaseGateRunsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new scorecard (weighted multi-criteria roll-up definition).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard llmEvaluationCreateScorecard(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScorecardRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationCreateScorecardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a scorecard by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard llmEvaluationGetScorecard(ondewo.nlu.LlmEvaluation.GetLlmEvaluationScorecardRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationGetScorecardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List scorecards in the project, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsResponse llmEvaluationListScorecards(ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationListScorecardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing scorecard.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard llmEvaluationUpdateScorecard(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScorecardRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationUpdateScorecardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a scorecard.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteScorecard(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScorecardRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationDeleteScorecardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the per-(project, language_code) evaluation settings singleton (judge
     * configuration, default weights, pass cutoffs). The server auto-creates
     * default settings on first access.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings llmEvaluationGetProjectSettings(ondewo.nlu.LlmEvaluation.GetLlmEvaluationProjectSettingsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationGetProjectSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the per-(project, language_code) evaluation settings singleton.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings llmEvaluationUpdateProjectSettings(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationProjectSettingsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationUpdateProjectSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List the evaluators available on this server, with metadata describing the
     * category, required example fields, multi-turn support, default threshold,
     * judge requirement and configurable parameters of each evaluator.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsResponse llmEvaluationListEvaluators(ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationListEvaluatorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Convert a recorded session (or a selection of its session steps) into
     * evaluation examples ("golden transcripts") inside an existing dataset.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionResponse llmEvaluationCreateExamplesFromSession(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationCreateExamplesFromSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate synthetic multi-turn evaluation conversations by simulating users
     * (persona-driven; STANDARD kind) or attackers (red-teaming; ADVERSARIAL kind)
     * against the live target. Long-running operation: the returned Operation
     * resolves once the generated examples have been persisted into the receiving dataset.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation llmEvaluationSimulateConversations(ondewo.nlu.LlmEvaluation.SimulateLlmEvaluationConversationsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationSimulateConversationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new schedule for recurring experiment / release gate runs.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule llmEvaluationCreateSchedule(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScheduleRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationCreateScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a schedule by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule llmEvaluationGetSchedule(ondewo.nlu.LlmEvaluation.GetLlmEvaluationScheduleRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationGetScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List schedules in the project, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesResponse llmEvaluationListSchedules(ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationListSchedulesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing schedule (cron / interval, enabled flag, request template).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule llmEvaluationUpdateSchedule(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScheduleRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationUpdateScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a schedule. Experiments / gate runs already created by it are kept.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteSchedule(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScheduleRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationDeleteScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Persist a generated report as an immutable artifact (incl. payload bytes).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationReport llmEvaluationCreateReport(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReportRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationCreateReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a report by resource name (incl. payload bytes).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationReport llmEvaluationGetReport(ondewo.nlu.LlmEvaluation.GetLlmEvaluationReportRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationGetReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List reports, optionally filtered + paginated. Payload bytes are omitted
     * unless explicitly requested via field_mask.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsResponse llmEvaluationListReports(ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationListReportsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a report.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteReport(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReportRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationDeleteReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new A/B experiment (a set of routing variants over live
     * DetectIntent traffic). Created in DRAFT status; traffic is only split once
     * it is started via LlmEvaluationStartAbExperiment.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment llmEvaluationCreateAbExperiment(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationAbExperimentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationCreateAbExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an A/B experiment by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment llmEvaluationGetAbExperiment(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationGetAbExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List A/B experiments in the project, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsResponse llmEvaluationListAbExperiments(ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationListAbExperimentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing A/B experiment (variants, traffic config, metadata).
     * Only allowed in DRAFT / STOPPED status; running experiments must be stopped first.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment llmEvaluationUpdateAbExperiment(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAbExperimentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationUpdateAbExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an A/B experiment and all owned sticky-assignment rows.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteAbExperiment(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationAbExperimentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationDeleteAbExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start an A/B experiment: validates that the variant traffic weights are
     * well-formed (sum to the configured total), stamps started_at and transitions
     * the experiment to RUNNING so live traffic begins to be split.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment llmEvaluationStartAbExperiment(ondewo.nlu.LlmEvaluation.StartLlmEvaluationAbExperimentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationStartAbExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop a running A/B experiment: stamps stopped_at and transitions to STOPPED.
     * Existing sticky assignments are retained for results computation.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment llmEvaluationStopAbExperiment(ondewo.nlu.LlmEvaluation.StopLlmEvaluationAbExperimentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationStopAbExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Compute per-variant telemetry rollups for an A/B experiment. Stateless /
     * computed on demand: gathers each variant's sessions and aggregates their
     * LlmTelemetry into a per-variant LlmTelemetryReport. There is no auto-rollout.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsResponse llmEvaluationGetAbExperimentResults(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationGetAbExperimentResultsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Compute a rollout recommendation for an A/B experiment: which variant wins
     * against the control on the chosen optimize metric under the supplied
     * statistical guard-rails (confidence level, minimum sessions per variant,
     * minimum effect size). Stateless / read-only — computed on demand from the
     * per-variant results; nothing is persisted and no traffic / config changes.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutRecommendation llmEvaluationGetAbRolloutRecommendation(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutRecommendationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationGetAbRolloutRecommendationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Apply a rollout for an A/B experiment: promotes the chosen variant's config
     * as the project's classifier default, stops the experiment, and writes +
     * returns the LlmEvaluationAbRolloutDecision audit record. The operator picks
     * the variant explicitly (there is no auto-rollout). Idempotent: re-applying
     * an already-rolled-out experiment returns the existing decision.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision llmEvaluationApplyAbRollout(ondewo.nlu.LlmEvaluation.ApplyLlmEvaluationAbRolloutRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationApplyAbRolloutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the applied rollout decision (audit record) by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision llmEvaluationGetAbRolloutDecision(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutDecisionRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationGetAbRolloutDecisionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List applied rollout decisions in the project, optionally filtered (e.g. by
     * experiment) + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsResponse llmEvaluationListAbRolloutDecisions(ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationListAbRolloutDecisionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new online-evaluation config: a per-(project, language_code)
     * definition selecting a reference-free evaluator set + a sample rate. A
     * swarm-safe background worker samples already-persisted live session steps,
     * scores the recorded answer with these evaluators and enqueues failing steps
     * into the annotation queue.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig llmEvaluationCreateOnlineConfig(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationOnlineConfigRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationCreateOnlineConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an online-evaluation config by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig llmEvaluationGetOnlineConfig(ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineConfigRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationGetOnlineConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List online-evaluation configs in the project, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsResponse llmEvaluationListOnlineConfigs(ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationListOnlineConfigsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing online-evaluation config (enabled flag, evaluator set,
     * sample rate, thresholds, session filter).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig llmEvaluationUpdateOnlineConfig(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationOnlineConfigRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationUpdateOnlineConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an online-evaluation config. Already-produced online results and
     * annotation-queue items are kept.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteOnlineConfig(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationOnlineConfigRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationDeleteOnlineConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a single online-evaluation result (per scored session step) by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineResult llmEvaluationGetOnlineResult(ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineResultRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationGetOnlineResultMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List online-evaluation results, optionally filtered by config / pass-state + paginated.
     * Read-only: result rows are produced by the online-evaluation worker (no Create RPC).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsResponse llmEvaluationListOnlineResults(ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationListOnlineResultsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a single annotation-queue item by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem llmEvaluationGetAnnotationQueueItem(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAnnotationQueueItemRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationGetAnnotationQueueItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List annotation-queue items, optionally filtered by status / assignee + paginated.
     * Items are enqueued by the online-evaluation worker (no Create RPC).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsResponse llmEvaluationListAnnotationQueueItems(ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationListAnnotationQueueItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an annotation-queue item (status / assignee / reason transitions:
     * PENDING -&gt; REVIEWED / DISMISSED).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem llmEvaluationUpdateAnnotationQueueItem(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAnnotationQueueItemRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationUpdateAnnotationQueueItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Promote an annotation-queue item into a regression dataset. Thin server-side
     * composition: delegates to LlmEvaluationCreateExamplesFromSession with the
     * item's session (+ selected steps), flips the item status to PROMOTED and
     * stamps the promoted dataset name. Returns the created example(s).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemResponse llmEvaluationPromoteAnnotationQueueItem(ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getLlmEvaluationPromoteAnnotationQueueItemMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service LlmEvaluations.
   * <pre>
   * LangSmith-style evaluation surface: datasets, examples, experiments, evaluator
   * runs, feedback (LLM-as-judge / human / heuristic / custom code / pairwise),
   * pairwise comparisons, release gates + persisted gate runs, scorecards,
   * per-project evaluation settings (judge configuration), the evaluator registry,
   * golden-transcript recording from sessions, conversation simulation
   * (standard + adversarial red-teaming), recurring schedules and report artifacts.
   * </pre>
   */
  public static final class LlmEvaluationsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LlmEvaluationsBlockingStub> {
    private LlmEvaluationsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LlmEvaluationsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LlmEvaluationsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new evaluation dataset.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationDataset llmEvaluationCreateDataset(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationCreateDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an evaluation dataset by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationDataset llmEvaluationGetDataset(ondewo.nlu.LlmEvaluation.GetLlmEvaluationDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationGetDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List evaluation datasets in the project, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsResponse llmEvaluationListDatasets(ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationListDatasetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update metadata of an existing evaluation dataset (examples managed via Add/Update/Delete RPCs).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationDataset llmEvaluationUpdateDataset(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationUpdateDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an evaluation dataset and all owned examples.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteDataset(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationDeleteDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a single example to an existing dataset.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationExample llmEvaluationAddExample(ondewo.nlu.LlmEvaluation.AddLlmEvaluationExampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationAddExampleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add multiple examples to an existing dataset in one call.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesResponse llmEvaluationAddExamples(ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationAddExamplesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a single evaluation example by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationExample llmEvaluationGetExample(ondewo.nlu.LlmEvaluation.GetLlmEvaluationExampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationGetExampleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List examples in a dataset, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesResponse llmEvaluationListExamples(ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationListExamplesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update fields of an existing evaluation example.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationExample llmEvaluationUpdateExample(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationUpdateExampleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an evaluation example.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteExample(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationDeleteExampleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Run a fresh experiment over a dataset. Long-running operation: the returned
     * Operation resolves to the completed LlmEvaluationExperiment once all
     * evaluators have produced feedback.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation llmEvaluationRunExperiment(ondewo.nlu.LlmEvaluation.RunLlmEvaluationExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationRunExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a previously-run experiment by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment llmEvaluationGetExperiment(ondewo.nlu.LlmEvaluation.GetLlmEvaluationExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationGetExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List experiments in a project, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsResponse llmEvaluationListExperiments(ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationListExperimentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update metadata of an experiment (e.g. baseline pointer, display_name).
     * Evaluator runs and feedback are immutable; use LlmEvaluationSubmitFeedback /
     * LlmEvaluationDeleteFeedback for downstream annotations.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment llmEvaluationUpdateExperiment(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationUpdateExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an experiment and all owned evaluator runs + feedbacks.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteExperiment(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationDeleteExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel a still-running experiment. No-op if already finished.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment llmEvaluationCancelExperiment(ondewo.nlu.LlmEvaluation.CancelLlmEvaluationExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationCancelExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Compare two-or-more experiments and emit a pairwise comparison report.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationComparison llmEvaluationCompareExperiments(ondewo.nlu.LlmEvaluation.CompareLlmEvaluationExperimentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationCompareExperimentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Submit a single feedback record (used by human reviewers / external evaluators).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback llmEvaluationSubmitFeedback(ondewo.nlu.LlmEvaluation.SubmitLlmEvaluationFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationSubmitFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List feedback records, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackResponse llmEvaluationListFeedback(ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationListFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a single feedback record.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteFeedback(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationDeleteFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a single feedback record (e.g. correct a human review score or comment).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback llmEvaluationUpdateFeedback(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationUpdateFeedbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new release gate (a named set of thresholds over evaluator scores,
     * regression deltas and telemetry that decides whether a candidate configuration ships).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate llmEvaluationCreateReleaseGate(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReleaseGateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationCreateReleaseGateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a release gate by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate llmEvaluationGetReleaseGate(ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationGetReleaseGateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List release gates in the project, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesResponse llmEvaluationListReleaseGates(ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationListReleaseGatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing release gate. Semantic changes (suite, baseline,
     * evaluators, thresholds, weights, safety) increment the server-managed revision.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate llmEvaluationUpdateReleaseGate(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationReleaseGateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationUpdateReleaseGateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a release gate and all owned gate runs.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteReleaseGate(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReleaseGateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationDeleteReleaseGateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Run a release gate against a candidate target. Long-running operation: the
     * returned Operation resolves to the completed LlmEvaluationReleaseGateRun once
     * the candidate (and optional safety) experiments finished and the verdict has
     * been computed and persisted server-side.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation llmEvaluationRunReleaseGate(ondewo.nlu.LlmEvaluation.RunLlmEvaluationReleaseGateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationRunReleaseGateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a single release gate run (persisted verdict + checks) by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGateRun llmEvaluationGetReleaseGateRun(ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationGetReleaseGateRunMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List release gate runs, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsResponse llmEvaluationListReleaseGateRuns(ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationListReleaseGateRunsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new scorecard (weighted multi-criteria roll-up definition).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard llmEvaluationCreateScorecard(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScorecardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationCreateScorecardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a scorecard by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard llmEvaluationGetScorecard(ondewo.nlu.LlmEvaluation.GetLlmEvaluationScorecardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationGetScorecardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List scorecards in the project, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsResponse llmEvaluationListScorecards(ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationListScorecardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing scorecard.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard llmEvaluationUpdateScorecard(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScorecardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationUpdateScorecardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a scorecard.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteScorecard(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScorecardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationDeleteScorecardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the per-(project, language_code) evaluation settings singleton (judge
     * configuration, default weights, pass cutoffs). The server auto-creates
     * default settings on first access.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings llmEvaluationGetProjectSettings(ondewo.nlu.LlmEvaluation.GetLlmEvaluationProjectSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationGetProjectSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the per-(project, language_code) evaluation settings singleton.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings llmEvaluationUpdateProjectSettings(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationProjectSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationUpdateProjectSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List the evaluators available on this server, with metadata describing the
     * category, required example fields, multi-turn support, default threshold,
     * judge requirement and configurable parameters of each evaluator.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsResponse llmEvaluationListEvaluators(ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationListEvaluatorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Convert a recorded session (or a selection of its session steps) into
     * evaluation examples ("golden transcripts") inside an existing dataset.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionResponse llmEvaluationCreateExamplesFromSession(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationCreateExamplesFromSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate synthetic multi-turn evaluation conversations by simulating users
     * (persona-driven; STANDARD kind) or attackers (red-teaming; ADVERSARIAL kind)
     * against the live target. Long-running operation: the returned Operation
     * resolves once the generated examples have been persisted into the receiving dataset.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation llmEvaluationSimulateConversations(ondewo.nlu.LlmEvaluation.SimulateLlmEvaluationConversationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationSimulateConversationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new schedule for recurring experiment / release gate runs.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule llmEvaluationCreateSchedule(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationCreateScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a schedule by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule llmEvaluationGetSchedule(ondewo.nlu.LlmEvaluation.GetLlmEvaluationScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationGetScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List schedules in the project, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesResponse llmEvaluationListSchedules(ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationListSchedulesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing schedule (cron / interval, enabled flag, request template).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule llmEvaluationUpdateSchedule(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationUpdateScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a schedule. Experiments / gate runs already created by it are kept.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteSchedule(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationDeleteScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Persist a generated report as an immutable artifact (incl. payload bytes).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationReport llmEvaluationCreateReport(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationCreateReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a report by resource name (incl. payload bytes).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationReport llmEvaluationGetReport(ondewo.nlu.LlmEvaluation.GetLlmEvaluationReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationGetReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List reports, optionally filtered + paginated. Payload bytes are omitted
     * unless explicitly requested via field_mask.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsResponse llmEvaluationListReports(ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationListReportsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a report.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteReport(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationDeleteReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new A/B experiment (a set of routing variants over live
     * DetectIntent traffic). Created in DRAFT status; traffic is only split once
     * it is started via LlmEvaluationStartAbExperiment.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment llmEvaluationCreateAbExperiment(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationAbExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationCreateAbExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an A/B experiment by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment llmEvaluationGetAbExperiment(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationGetAbExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List A/B experiments in the project, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsResponse llmEvaluationListAbExperiments(ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationListAbExperimentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing A/B experiment (variants, traffic config, metadata).
     * Only allowed in DRAFT / STOPPED status; running experiments must be stopped first.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment llmEvaluationUpdateAbExperiment(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAbExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationUpdateAbExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an A/B experiment and all owned sticky-assignment rows.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteAbExperiment(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationAbExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationDeleteAbExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start an A/B experiment: validates that the variant traffic weights are
     * well-formed (sum to the configured total), stamps started_at and transitions
     * the experiment to RUNNING so live traffic begins to be split.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment llmEvaluationStartAbExperiment(ondewo.nlu.LlmEvaluation.StartLlmEvaluationAbExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationStartAbExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop a running A/B experiment: stamps stopped_at and transitions to STOPPED.
     * Existing sticky assignments are retained for results computation.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment llmEvaluationStopAbExperiment(ondewo.nlu.LlmEvaluation.StopLlmEvaluationAbExperimentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationStopAbExperimentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Compute per-variant telemetry rollups for an A/B experiment. Stateless /
     * computed on demand: gathers each variant's sessions and aggregates their
     * LlmTelemetry into a per-variant LlmTelemetryReport. There is no auto-rollout.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsResponse llmEvaluationGetAbExperimentResults(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationGetAbExperimentResultsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Compute a rollout recommendation for an A/B experiment: which variant wins
     * against the control on the chosen optimize metric under the supplied
     * statistical guard-rails (confidence level, minimum sessions per variant,
     * minimum effect size). Stateless / read-only — computed on demand from the
     * per-variant results; nothing is persisted and no traffic / config changes.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutRecommendation llmEvaluationGetAbRolloutRecommendation(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutRecommendationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationGetAbRolloutRecommendationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Apply a rollout for an A/B experiment: promotes the chosen variant's config
     * as the project's classifier default, stops the experiment, and writes +
     * returns the LlmEvaluationAbRolloutDecision audit record. The operator picks
     * the variant explicitly (there is no auto-rollout). Idempotent: re-applying
     * an already-rolled-out experiment returns the existing decision.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision llmEvaluationApplyAbRollout(ondewo.nlu.LlmEvaluation.ApplyLlmEvaluationAbRolloutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationApplyAbRolloutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the applied rollout decision (audit record) by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision llmEvaluationGetAbRolloutDecision(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutDecisionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationGetAbRolloutDecisionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List applied rollout decisions in the project, optionally filtered (e.g. by
     * experiment) + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsResponse llmEvaluationListAbRolloutDecisions(ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationListAbRolloutDecisionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new online-evaluation config: a per-(project, language_code)
     * definition selecting a reference-free evaluator set + a sample rate. A
     * swarm-safe background worker samples already-persisted live session steps,
     * scores the recorded answer with these evaluators and enqueues failing steps
     * into the annotation queue.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig llmEvaluationCreateOnlineConfig(ondewo.nlu.LlmEvaluation.CreateLlmEvaluationOnlineConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationCreateOnlineConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an online-evaluation config by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig llmEvaluationGetOnlineConfig(ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationGetOnlineConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List online-evaluation configs in the project, optionally filtered + paginated.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsResponse llmEvaluationListOnlineConfigs(ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationListOnlineConfigsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing online-evaluation config (enabled flag, evaluator set,
     * sample rate, thresholds, session filter).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig llmEvaluationUpdateOnlineConfig(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationOnlineConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationUpdateOnlineConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an online-evaluation config. Already-produced online results and
     * annotation-queue items are kept.
     * </pre>
     */
    public com.google.protobuf.Empty llmEvaluationDeleteOnlineConfig(ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationOnlineConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationDeleteOnlineConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a single online-evaluation result (per scored session step) by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineResult llmEvaluationGetOnlineResult(ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineResultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationGetOnlineResultMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List online-evaluation results, optionally filtered by config / pass-state + paginated.
     * Read-only: result rows are produced by the online-evaluation worker (no Create RPC).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsResponse llmEvaluationListOnlineResults(ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationListOnlineResultsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a single annotation-queue item by resource name.
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem llmEvaluationGetAnnotationQueueItem(ondewo.nlu.LlmEvaluation.GetLlmEvaluationAnnotationQueueItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationGetAnnotationQueueItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List annotation-queue items, optionally filtered by status / assignee + paginated.
     * Items are enqueued by the online-evaluation worker (no Create RPC).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsResponse llmEvaluationListAnnotationQueueItems(ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationListAnnotationQueueItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an annotation-queue item (status / assignee / reason transitions:
     * PENDING -&gt; REVIEWED / DISMISSED).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem llmEvaluationUpdateAnnotationQueueItem(ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAnnotationQueueItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationUpdateAnnotationQueueItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Promote an annotation-queue item into a regression dataset. Thin server-side
     * composition: delegates to LlmEvaluationCreateExamplesFromSession with the
     * item's session (+ selected steps), flips the item status to PROMOTED and
     * stamps the promoted dataset name. Returns the created example(s).
     * </pre>
     */
    public ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemResponse llmEvaluationPromoteAnnotationQueueItem(ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLlmEvaluationPromoteAnnotationQueueItemMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LlmEvaluations.
   * <pre>
   * LangSmith-style evaluation surface: datasets, examples, experiments, evaluator
   * runs, feedback (LLM-as-judge / human / heuristic / custom code / pairwise),
   * pairwise comparisons, release gates + persisted gate runs, scorecards,
   * per-project evaluation settings (judge configuration), the evaluator registry,
   * golden-transcript recording from sessions, conversation simulation
   * (standard + adversarial red-teaming), recurring schedules and report artifacts.
   * </pre>
   */
  public static final class LlmEvaluationsFutureStub
      extends io.grpc.stub.AbstractFutureStub<LlmEvaluationsFutureStub> {
    private LlmEvaluationsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LlmEvaluationsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LlmEvaluationsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new evaluation dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationDataset> llmEvaluationCreateDataset(
        ondewo.nlu.LlmEvaluation.CreateLlmEvaluationDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationCreateDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an evaluation dataset by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationDataset> llmEvaluationGetDataset(
        ondewo.nlu.LlmEvaluation.GetLlmEvaluationDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationGetDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List evaluation datasets in the project, optionally filtered + paginated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsResponse> llmEvaluationListDatasets(
        ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationListDatasetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update metadata of an existing evaluation dataset (examples managed via Add/Update/Delete RPCs).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationDataset> llmEvaluationUpdateDataset(
        ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an evaluation dataset and all owned examples.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> llmEvaluationDeleteDataset(
        ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a single example to an existing dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationExample> llmEvaluationAddExample(
        ondewo.nlu.LlmEvaluation.AddLlmEvaluationExampleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationAddExampleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add multiple examples to an existing dataset in one call.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesResponse> llmEvaluationAddExamples(
        ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationAddExamplesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a single evaluation example by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationExample> llmEvaluationGetExample(
        ondewo.nlu.LlmEvaluation.GetLlmEvaluationExampleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationGetExampleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List examples in a dataset, optionally filtered + paginated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesResponse> llmEvaluationListExamples(
        ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationListExamplesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update fields of an existing evaluation example.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationExample> llmEvaluationUpdateExample(
        ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExampleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateExampleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an evaluation example.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> llmEvaluationDeleteExample(
        ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExampleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteExampleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Run a fresh experiment over a dataset. Long-running operation: the returned
     * Operation resolves to the completed LlmEvaluationExperiment once all
     * evaluators have produced feedback.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> llmEvaluationRunExperiment(
        ondewo.nlu.LlmEvaluation.RunLlmEvaluationExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationRunExperimentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a previously-run experiment by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment> llmEvaluationGetExperiment(
        ondewo.nlu.LlmEvaluation.GetLlmEvaluationExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationGetExperimentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List experiments in a project, optionally filtered + paginated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsResponse> llmEvaluationListExperiments(
        ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationListExperimentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update metadata of an experiment (e.g. baseline pointer, display_name).
     * Evaluator runs and feedback are immutable; use LlmEvaluationSubmitFeedback /
     * LlmEvaluationDeleteFeedback for downstream annotations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment> llmEvaluationUpdateExperiment(
        ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateExperimentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an experiment and all owned evaluator runs + feedbacks.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> llmEvaluationDeleteExperiment(
        ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteExperimentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancel a still-running experiment. No-op if already finished.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment> llmEvaluationCancelExperiment(
        ondewo.nlu.LlmEvaluation.CancelLlmEvaluationExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationCancelExperimentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Compare two-or-more experiments and emit a pairwise comparison report.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationComparison> llmEvaluationCompareExperiments(
        ondewo.nlu.LlmEvaluation.CompareLlmEvaluationExperimentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationCompareExperimentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Submit a single feedback record (used by human reviewers / external evaluators).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback> llmEvaluationSubmitFeedback(
        ondewo.nlu.LlmEvaluation.SubmitLlmEvaluationFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationSubmitFeedbackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List feedback records, optionally filtered + paginated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackResponse> llmEvaluationListFeedback(
        ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationListFeedbackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a single feedback record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> llmEvaluationDeleteFeedback(
        ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteFeedbackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a single feedback record (e.g. correct a human review score or comment).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback> llmEvaluationUpdateFeedback(
        ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateFeedbackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new release gate (a named set of thresholds over evaluator scores,
     * regression deltas and telemetry that decides whether a candidate configuration ships).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate> llmEvaluationCreateReleaseGate(
        ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReleaseGateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationCreateReleaseGateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a release gate by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate> llmEvaluationGetReleaseGate(
        ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationGetReleaseGateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List release gates in the project, optionally filtered + paginated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesResponse> llmEvaluationListReleaseGates(
        ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationListReleaseGatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an existing release gate. Semantic changes (suite, baseline,
     * evaluators, thresholds, weights, safety) increment the server-managed revision.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate> llmEvaluationUpdateReleaseGate(
        ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationReleaseGateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateReleaseGateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a release gate and all owned gate runs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> llmEvaluationDeleteReleaseGate(
        ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReleaseGateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteReleaseGateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Run a release gate against a candidate target. Long-running operation: the
     * returned Operation resolves to the completed LlmEvaluationReleaseGateRun once
     * the candidate (and optional safety) experiments finished and the verdict has
     * been computed and persisted server-side.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> llmEvaluationRunReleaseGate(
        ondewo.nlu.LlmEvaluation.RunLlmEvaluationReleaseGateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationRunReleaseGateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a single release gate run (persisted verdict + checks) by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGateRun> llmEvaluationGetReleaseGateRun(
        ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationGetReleaseGateRunMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List release gate runs, optionally filtered + paginated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsResponse> llmEvaluationListReleaseGateRuns(
        ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationListReleaseGateRunsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new scorecard (weighted multi-criteria roll-up definition).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard> llmEvaluationCreateScorecard(
        ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScorecardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationCreateScorecardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a scorecard by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard> llmEvaluationGetScorecard(
        ondewo.nlu.LlmEvaluation.GetLlmEvaluationScorecardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationGetScorecardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List scorecards in the project, optionally filtered + paginated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsResponse> llmEvaluationListScorecards(
        ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationListScorecardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an existing scorecard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard> llmEvaluationUpdateScorecard(
        ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScorecardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateScorecardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a scorecard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> llmEvaluationDeleteScorecard(
        ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScorecardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteScorecardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the per-(project, language_code) evaluation settings singleton (judge
     * configuration, default weights, pass cutoffs). The server auto-creates
     * default settings on first access.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings> llmEvaluationGetProjectSettings(
        ondewo.nlu.LlmEvaluation.GetLlmEvaluationProjectSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationGetProjectSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update the per-(project, language_code) evaluation settings singleton.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings> llmEvaluationUpdateProjectSettings(
        ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationProjectSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateProjectSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List the evaluators available on this server, with metadata describing the
     * category, required example fields, multi-turn support, default threshold,
     * judge requirement and configurable parameters of each evaluator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsResponse> llmEvaluationListEvaluators(
        ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationListEvaluatorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Convert a recorded session (or a selection of its session steps) into
     * evaluation examples ("golden transcripts") inside an existing dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionResponse> llmEvaluationCreateExamplesFromSession(
        ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationCreateExamplesFromSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generate synthetic multi-turn evaluation conversations by simulating users
     * (persona-driven; STANDARD kind) or attackers (red-teaming; ADVERSARIAL kind)
     * against the live target. Long-running operation: the returned Operation
     * resolves once the generated examples have been persisted into the receiving dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> llmEvaluationSimulateConversations(
        ondewo.nlu.LlmEvaluation.SimulateLlmEvaluationConversationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationSimulateConversationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new schedule for recurring experiment / release gate runs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule> llmEvaluationCreateSchedule(
        ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationCreateScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a schedule by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule> llmEvaluationGetSchedule(
        ondewo.nlu.LlmEvaluation.GetLlmEvaluationScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationGetScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List schedules in the project, optionally filtered + paginated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesResponse> llmEvaluationListSchedules(
        ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationListSchedulesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an existing schedule (cron / interval, enabled flag, request template).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule> llmEvaluationUpdateSchedule(
        ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a schedule. Experiments / gate runs already created by it are kept.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> llmEvaluationDeleteSchedule(
        ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Persist a generated report as an immutable artifact (incl. payload bytes).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationReport> llmEvaluationCreateReport(
        ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationCreateReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a report by resource name (incl. payload bytes).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationReport> llmEvaluationGetReport(
        ondewo.nlu.LlmEvaluation.GetLlmEvaluationReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationGetReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List reports, optionally filtered + paginated. Payload bytes are omitted
     * unless explicitly requested via field_mask.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsResponse> llmEvaluationListReports(
        ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationListReportsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a report.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> llmEvaluationDeleteReport(
        ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new A/B experiment (a set of routing variants over live
     * DetectIntent traffic). Created in DRAFT status; traffic is only split once
     * it is started via LlmEvaluationStartAbExperiment.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> llmEvaluationCreateAbExperiment(
        ondewo.nlu.LlmEvaluation.CreateLlmEvaluationAbExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationCreateAbExperimentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an A/B experiment by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> llmEvaluationGetAbExperiment(
        ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationGetAbExperimentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List A/B experiments in the project, optionally filtered + paginated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsResponse> llmEvaluationListAbExperiments(
        ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationListAbExperimentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an existing A/B experiment (variants, traffic config, metadata).
     * Only allowed in DRAFT / STOPPED status; running experiments must be stopped first.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> llmEvaluationUpdateAbExperiment(
        ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAbExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateAbExperimentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an A/B experiment and all owned sticky-assignment rows.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> llmEvaluationDeleteAbExperiment(
        ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationAbExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteAbExperimentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start an A/B experiment: validates that the variant traffic weights are
     * well-formed (sum to the configured total), stamps started_at and transitions
     * the experiment to RUNNING so live traffic begins to be split.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> llmEvaluationStartAbExperiment(
        ondewo.nlu.LlmEvaluation.StartLlmEvaluationAbExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationStartAbExperimentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop a running A/B experiment: stamps stopped_at and transitions to STOPPED.
     * Existing sticky assignments are retained for results computation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment> llmEvaluationStopAbExperiment(
        ondewo.nlu.LlmEvaluation.StopLlmEvaluationAbExperimentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationStopAbExperimentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Compute per-variant telemetry rollups for an A/B experiment. Stateless /
     * computed on demand: gathers each variant's sessions and aggregates their
     * LlmTelemetry into a per-variant LlmTelemetryReport. There is no auto-rollout.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsResponse> llmEvaluationGetAbExperimentResults(
        ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationGetAbExperimentResultsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Compute a rollout recommendation for an A/B experiment: which variant wins
     * against the control on the chosen optimize metric under the supplied
     * statistical guard-rails (confidence level, minimum sessions per variant,
     * minimum effect size). Stateless / read-only — computed on demand from the
     * per-variant results; nothing is persisted and no traffic / config changes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutRecommendation> llmEvaluationGetAbRolloutRecommendation(
        ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutRecommendationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationGetAbRolloutRecommendationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Apply a rollout for an A/B experiment: promotes the chosen variant's config
     * as the project's classifier default, stops the experiment, and writes +
     * returns the LlmEvaluationAbRolloutDecision audit record. The operator picks
     * the variant explicitly (there is no auto-rollout). Idempotent: re-applying
     * an already-rolled-out experiment returns the existing decision.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision> llmEvaluationApplyAbRollout(
        ondewo.nlu.LlmEvaluation.ApplyLlmEvaluationAbRolloutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationApplyAbRolloutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the applied rollout decision (audit record) by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision> llmEvaluationGetAbRolloutDecision(
        ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutDecisionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationGetAbRolloutDecisionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List applied rollout decisions in the project, optionally filtered (e.g. by
     * experiment) + paginated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsResponse> llmEvaluationListAbRolloutDecisions(
        ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationListAbRolloutDecisionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new online-evaluation config: a per-(project, language_code)
     * definition selecting a reference-free evaluator set + a sample rate. A
     * swarm-safe background worker samples already-persisted live session steps,
     * scores the recorded answer with these evaluators and enqueues failing steps
     * into the annotation queue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig> llmEvaluationCreateOnlineConfig(
        ondewo.nlu.LlmEvaluation.CreateLlmEvaluationOnlineConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationCreateOnlineConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an online-evaluation config by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig> llmEvaluationGetOnlineConfig(
        ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationGetOnlineConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List online-evaluation configs in the project, optionally filtered + paginated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsResponse> llmEvaluationListOnlineConfigs(
        ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationListOnlineConfigsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an existing online-evaluation config (enabled flag, evaluator set,
     * sample rate, thresholds, session filter).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig> llmEvaluationUpdateOnlineConfig(
        ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationOnlineConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateOnlineConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an online-evaluation config. Already-produced online results and
     * annotation-queue items are kept.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> llmEvaluationDeleteOnlineConfig(
        ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationOnlineConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationDeleteOnlineConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a single online-evaluation result (per scored session step) by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineResult> llmEvaluationGetOnlineResult(
        ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineResultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationGetOnlineResultMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List online-evaluation results, optionally filtered by config / pass-state + paginated.
     * Read-only: result rows are produced by the online-evaluation worker (no Create RPC).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsResponse> llmEvaluationListOnlineResults(
        ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationListOnlineResultsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a single annotation-queue item by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem> llmEvaluationGetAnnotationQueueItem(
        ondewo.nlu.LlmEvaluation.GetLlmEvaluationAnnotationQueueItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationGetAnnotationQueueItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List annotation-queue items, optionally filtered by status / assignee + paginated.
     * Items are enqueued by the online-evaluation worker (no Create RPC).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsResponse> llmEvaluationListAnnotationQueueItems(
        ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationListAnnotationQueueItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an annotation-queue item (status / assignee / reason transitions:
     * PENDING -&gt; REVIEWED / DISMISSED).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem> llmEvaluationUpdateAnnotationQueueItem(
        ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAnnotationQueueItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationUpdateAnnotationQueueItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Promote an annotation-queue item into a regression dataset. Thin server-side
     * composition: delegates to LlmEvaluationCreateExamplesFromSession with the
     * item's session (+ selected steps), flips the item status to PROMOTED and
     * stamps the promoted dataset name. Returns the created example(s).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemResponse> llmEvaluationPromoteAnnotationQueueItem(
        ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLlmEvaluationPromoteAnnotationQueueItemMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LLM_EVALUATION_CREATE_DATASET = 0;
  private static final int METHODID_LLM_EVALUATION_GET_DATASET = 1;
  private static final int METHODID_LLM_EVALUATION_LIST_DATASETS = 2;
  private static final int METHODID_LLM_EVALUATION_UPDATE_DATASET = 3;
  private static final int METHODID_LLM_EVALUATION_DELETE_DATASET = 4;
  private static final int METHODID_LLM_EVALUATION_ADD_EXAMPLE = 5;
  private static final int METHODID_LLM_EVALUATION_ADD_EXAMPLES = 6;
  private static final int METHODID_LLM_EVALUATION_GET_EXAMPLE = 7;
  private static final int METHODID_LLM_EVALUATION_LIST_EXAMPLES = 8;
  private static final int METHODID_LLM_EVALUATION_UPDATE_EXAMPLE = 9;
  private static final int METHODID_LLM_EVALUATION_DELETE_EXAMPLE = 10;
  private static final int METHODID_LLM_EVALUATION_RUN_EXPERIMENT = 11;
  private static final int METHODID_LLM_EVALUATION_GET_EXPERIMENT = 12;
  private static final int METHODID_LLM_EVALUATION_LIST_EXPERIMENTS = 13;
  private static final int METHODID_LLM_EVALUATION_UPDATE_EXPERIMENT = 14;
  private static final int METHODID_LLM_EVALUATION_DELETE_EXPERIMENT = 15;
  private static final int METHODID_LLM_EVALUATION_CANCEL_EXPERIMENT = 16;
  private static final int METHODID_LLM_EVALUATION_COMPARE_EXPERIMENTS = 17;
  private static final int METHODID_LLM_EVALUATION_SUBMIT_FEEDBACK = 18;
  private static final int METHODID_LLM_EVALUATION_LIST_FEEDBACK = 19;
  private static final int METHODID_LLM_EVALUATION_DELETE_FEEDBACK = 20;
  private static final int METHODID_LLM_EVALUATION_UPDATE_FEEDBACK = 21;
  private static final int METHODID_LLM_EVALUATION_CREATE_RELEASE_GATE = 22;
  private static final int METHODID_LLM_EVALUATION_GET_RELEASE_GATE = 23;
  private static final int METHODID_LLM_EVALUATION_LIST_RELEASE_GATES = 24;
  private static final int METHODID_LLM_EVALUATION_UPDATE_RELEASE_GATE = 25;
  private static final int METHODID_LLM_EVALUATION_DELETE_RELEASE_GATE = 26;
  private static final int METHODID_LLM_EVALUATION_RUN_RELEASE_GATE = 27;
  private static final int METHODID_LLM_EVALUATION_GET_RELEASE_GATE_RUN = 28;
  private static final int METHODID_LLM_EVALUATION_LIST_RELEASE_GATE_RUNS = 29;
  private static final int METHODID_LLM_EVALUATION_CREATE_SCORECARD = 30;
  private static final int METHODID_LLM_EVALUATION_GET_SCORECARD = 31;
  private static final int METHODID_LLM_EVALUATION_LIST_SCORECARDS = 32;
  private static final int METHODID_LLM_EVALUATION_UPDATE_SCORECARD = 33;
  private static final int METHODID_LLM_EVALUATION_DELETE_SCORECARD = 34;
  private static final int METHODID_LLM_EVALUATION_GET_PROJECT_SETTINGS = 35;
  private static final int METHODID_LLM_EVALUATION_UPDATE_PROJECT_SETTINGS = 36;
  private static final int METHODID_LLM_EVALUATION_LIST_EVALUATORS = 37;
  private static final int METHODID_LLM_EVALUATION_CREATE_EXAMPLES_FROM_SESSION = 38;
  private static final int METHODID_LLM_EVALUATION_SIMULATE_CONVERSATIONS = 39;
  private static final int METHODID_LLM_EVALUATION_CREATE_SCHEDULE = 40;
  private static final int METHODID_LLM_EVALUATION_GET_SCHEDULE = 41;
  private static final int METHODID_LLM_EVALUATION_LIST_SCHEDULES = 42;
  private static final int METHODID_LLM_EVALUATION_UPDATE_SCHEDULE = 43;
  private static final int METHODID_LLM_EVALUATION_DELETE_SCHEDULE = 44;
  private static final int METHODID_LLM_EVALUATION_CREATE_REPORT = 45;
  private static final int METHODID_LLM_EVALUATION_GET_REPORT = 46;
  private static final int METHODID_LLM_EVALUATION_LIST_REPORTS = 47;
  private static final int METHODID_LLM_EVALUATION_DELETE_REPORT = 48;
  private static final int METHODID_LLM_EVALUATION_CREATE_AB_EXPERIMENT = 49;
  private static final int METHODID_LLM_EVALUATION_GET_AB_EXPERIMENT = 50;
  private static final int METHODID_LLM_EVALUATION_LIST_AB_EXPERIMENTS = 51;
  private static final int METHODID_LLM_EVALUATION_UPDATE_AB_EXPERIMENT = 52;
  private static final int METHODID_LLM_EVALUATION_DELETE_AB_EXPERIMENT = 53;
  private static final int METHODID_LLM_EVALUATION_START_AB_EXPERIMENT = 54;
  private static final int METHODID_LLM_EVALUATION_STOP_AB_EXPERIMENT = 55;
  private static final int METHODID_LLM_EVALUATION_GET_AB_EXPERIMENT_RESULTS = 56;
  private static final int METHODID_LLM_EVALUATION_GET_AB_ROLLOUT_RECOMMENDATION = 57;
  private static final int METHODID_LLM_EVALUATION_APPLY_AB_ROLLOUT = 58;
  private static final int METHODID_LLM_EVALUATION_GET_AB_ROLLOUT_DECISION = 59;
  private static final int METHODID_LLM_EVALUATION_LIST_AB_ROLLOUT_DECISIONS = 60;
  private static final int METHODID_LLM_EVALUATION_CREATE_ONLINE_CONFIG = 61;
  private static final int METHODID_LLM_EVALUATION_GET_ONLINE_CONFIG = 62;
  private static final int METHODID_LLM_EVALUATION_LIST_ONLINE_CONFIGS = 63;
  private static final int METHODID_LLM_EVALUATION_UPDATE_ONLINE_CONFIG = 64;
  private static final int METHODID_LLM_EVALUATION_DELETE_ONLINE_CONFIG = 65;
  private static final int METHODID_LLM_EVALUATION_GET_ONLINE_RESULT = 66;
  private static final int METHODID_LLM_EVALUATION_LIST_ONLINE_RESULTS = 67;
  private static final int METHODID_LLM_EVALUATION_GET_ANNOTATION_QUEUE_ITEM = 68;
  private static final int METHODID_LLM_EVALUATION_LIST_ANNOTATION_QUEUE_ITEMS = 69;
  private static final int METHODID_LLM_EVALUATION_UPDATE_ANNOTATION_QUEUE_ITEM = 70;
  private static final int METHODID_LLM_EVALUATION_PROMOTE_ANNOTATION_QUEUE_ITEM = 71;

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
        case METHODID_LLM_EVALUATION_CREATE_DATASET:
          serviceImpl.llmEvaluationCreateDataset((ondewo.nlu.LlmEvaluation.CreateLlmEvaluationDatasetRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationDataset>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_GET_DATASET:
          serviceImpl.llmEvaluationGetDataset((ondewo.nlu.LlmEvaluation.GetLlmEvaluationDatasetRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationDataset>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_LIST_DATASETS:
          serviceImpl.llmEvaluationListDatasets((ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsResponse>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_UPDATE_DATASET:
          serviceImpl.llmEvaluationUpdateDataset((ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationDatasetRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationDataset>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_DELETE_DATASET:
          serviceImpl.llmEvaluationDeleteDataset((ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_ADD_EXAMPLE:
          serviceImpl.llmEvaluationAddExample((ondewo.nlu.LlmEvaluation.AddLlmEvaluationExampleRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationExample>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_ADD_EXAMPLES:
          serviceImpl.llmEvaluationAddExamples((ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesResponse>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_GET_EXAMPLE:
          serviceImpl.llmEvaluationGetExample((ondewo.nlu.LlmEvaluation.GetLlmEvaluationExampleRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationExample>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_LIST_EXAMPLES:
          serviceImpl.llmEvaluationListExamples((ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesResponse>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_UPDATE_EXAMPLE:
          serviceImpl.llmEvaluationUpdateExample((ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExampleRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationExample>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_DELETE_EXAMPLE:
          serviceImpl.llmEvaluationDeleteExample((ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExampleRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_RUN_EXPERIMENT:
          serviceImpl.llmEvaluationRunExperiment((ondewo.nlu.LlmEvaluation.RunLlmEvaluationExperimentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_GET_EXPERIMENT:
          serviceImpl.llmEvaluationGetExperiment((ondewo.nlu.LlmEvaluation.GetLlmEvaluationExperimentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_LIST_EXPERIMENTS:
          serviceImpl.llmEvaluationListExperiments((ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsResponse>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_UPDATE_EXPERIMENT:
          serviceImpl.llmEvaluationUpdateExperiment((ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExperimentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_DELETE_EXPERIMENT:
          serviceImpl.llmEvaluationDeleteExperiment((ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExperimentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_CANCEL_EXPERIMENT:
          serviceImpl.llmEvaluationCancelExperiment((ondewo.nlu.LlmEvaluation.CancelLlmEvaluationExperimentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_COMPARE_EXPERIMENTS:
          serviceImpl.llmEvaluationCompareExperiments((ondewo.nlu.LlmEvaluation.CompareLlmEvaluationExperimentsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationComparison>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_SUBMIT_FEEDBACK:
          serviceImpl.llmEvaluationSubmitFeedback((ondewo.nlu.LlmEvaluation.SubmitLlmEvaluationFeedbackRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_LIST_FEEDBACK:
          serviceImpl.llmEvaluationListFeedback((ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackResponse>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_DELETE_FEEDBACK:
          serviceImpl.llmEvaluationDeleteFeedback((ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationFeedbackRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_UPDATE_FEEDBACK:
          serviceImpl.llmEvaluationUpdateFeedback((ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationFeedbackRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_CREATE_RELEASE_GATE:
          serviceImpl.llmEvaluationCreateReleaseGate((ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReleaseGateRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_GET_RELEASE_GATE:
          serviceImpl.llmEvaluationGetReleaseGate((ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_LIST_RELEASE_GATES:
          serviceImpl.llmEvaluationListReleaseGates((ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesResponse>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_UPDATE_RELEASE_GATE:
          serviceImpl.llmEvaluationUpdateReleaseGate((ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationReleaseGateRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_DELETE_RELEASE_GATE:
          serviceImpl.llmEvaluationDeleteReleaseGate((ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReleaseGateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_RUN_RELEASE_GATE:
          serviceImpl.llmEvaluationRunReleaseGate((ondewo.nlu.LlmEvaluation.RunLlmEvaluationReleaseGateRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_GET_RELEASE_GATE_RUN:
          serviceImpl.llmEvaluationGetReleaseGateRun((ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRunRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGateRun>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_LIST_RELEASE_GATE_RUNS:
          serviceImpl.llmEvaluationListReleaseGateRuns((ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsResponse>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_CREATE_SCORECARD:
          serviceImpl.llmEvaluationCreateScorecard((ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScorecardRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_GET_SCORECARD:
          serviceImpl.llmEvaluationGetScorecard((ondewo.nlu.LlmEvaluation.GetLlmEvaluationScorecardRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_LIST_SCORECARDS:
          serviceImpl.llmEvaluationListScorecards((ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsResponse>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_UPDATE_SCORECARD:
          serviceImpl.llmEvaluationUpdateScorecard((ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScorecardRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_DELETE_SCORECARD:
          serviceImpl.llmEvaluationDeleteScorecard((ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScorecardRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_GET_PROJECT_SETTINGS:
          serviceImpl.llmEvaluationGetProjectSettings((ondewo.nlu.LlmEvaluation.GetLlmEvaluationProjectSettingsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_UPDATE_PROJECT_SETTINGS:
          serviceImpl.llmEvaluationUpdateProjectSettings((ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationProjectSettingsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_LIST_EVALUATORS:
          serviceImpl.llmEvaluationListEvaluators((ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsResponse>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_CREATE_EXAMPLES_FROM_SESSION:
          serviceImpl.llmEvaluationCreateExamplesFromSession((ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionResponse>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_SIMULATE_CONVERSATIONS:
          serviceImpl.llmEvaluationSimulateConversations((ondewo.nlu.LlmEvaluation.SimulateLlmEvaluationConversationsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_CREATE_SCHEDULE:
          serviceImpl.llmEvaluationCreateSchedule((ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScheduleRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_GET_SCHEDULE:
          serviceImpl.llmEvaluationGetSchedule((ondewo.nlu.LlmEvaluation.GetLlmEvaluationScheduleRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_LIST_SCHEDULES:
          serviceImpl.llmEvaluationListSchedules((ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesResponse>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_UPDATE_SCHEDULE:
          serviceImpl.llmEvaluationUpdateSchedule((ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScheduleRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_DELETE_SCHEDULE:
          serviceImpl.llmEvaluationDeleteSchedule((ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScheduleRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_CREATE_REPORT:
          serviceImpl.llmEvaluationCreateReport((ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReportRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationReport>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_GET_REPORT:
          serviceImpl.llmEvaluationGetReport((ondewo.nlu.LlmEvaluation.GetLlmEvaluationReportRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationReport>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_LIST_REPORTS:
          serviceImpl.llmEvaluationListReports((ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsResponse>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_DELETE_REPORT:
          serviceImpl.llmEvaluationDeleteReport((ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReportRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_CREATE_AB_EXPERIMENT:
          serviceImpl.llmEvaluationCreateAbExperiment((ondewo.nlu.LlmEvaluation.CreateLlmEvaluationAbExperimentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_GET_AB_EXPERIMENT:
          serviceImpl.llmEvaluationGetAbExperiment((ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_LIST_AB_EXPERIMENTS:
          serviceImpl.llmEvaluationListAbExperiments((ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsResponse>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_UPDATE_AB_EXPERIMENT:
          serviceImpl.llmEvaluationUpdateAbExperiment((ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAbExperimentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_DELETE_AB_EXPERIMENT:
          serviceImpl.llmEvaluationDeleteAbExperiment((ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationAbExperimentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_START_AB_EXPERIMENT:
          serviceImpl.llmEvaluationStartAbExperiment((ondewo.nlu.LlmEvaluation.StartLlmEvaluationAbExperimentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_STOP_AB_EXPERIMENT:
          serviceImpl.llmEvaluationStopAbExperiment((ondewo.nlu.LlmEvaluation.StopLlmEvaluationAbExperimentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_GET_AB_EXPERIMENT_RESULTS:
          serviceImpl.llmEvaluationGetAbExperimentResults((ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsResponse>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_GET_AB_ROLLOUT_RECOMMENDATION:
          serviceImpl.llmEvaluationGetAbRolloutRecommendation((ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutRecommendationRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutRecommendation>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_APPLY_AB_ROLLOUT:
          serviceImpl.llmEvaluationApplyAbRollout((ondewo.nlu.LlmEvaluation.ApplyLlmEvaluationAbRolloutRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_GET_AB_ROLLOUT_DECISION:
          serviceImpl.llmEvaluationGetAbRolloutDecision((ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutDecisionRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_LIST_AB_ROLLOUT_DECISIONS:
          serviceImpl.llmEvaluationListAbRolloutDecisions((ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsResponse>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_CREATE_ONLINE_CONFIG:
          serviceImpl.llmEvaluationCreateOnlineConfig((ondewo.nlu.LlmEvaluation.CreateLlmEvaluationOnlineConfigRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_GET_ONLINE_CONFIG:
          serviceImpl.llmEvaluationGetOnlineConfig((ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineConfigRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_LIST_ONLINE_CONFIGS:
          serviceImpl.llmEvaluationListOnlineConfigs((ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsResponse>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_UPDATE_ONLINE_CONFIG:
          serviceImpl.llmEvaluationUpdateOnlineConfig((ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationOnlineConfigRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_DELETE_ONLINE_CONFIG:
          serviceImpl.llmEvaluationDeleteOnlineConfig((ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationOnlineConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_GET_ONLINE_RESULT:
          serviceImpl.llmEvaluationGetOnlineResult((ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineResultRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineResult>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_LIST_ONLINE_RESULTS:
          serviceImpl.llmEvaluationListOnlineResults((ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsResponse>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_GET_ANNOTATION_QUEUE_ITEM:
          serviceImpl.llmEvaluationGetAnnotationQueueItem((ondewo.nlu.LlmEvaluation.GetLlmEvaluationAnnotationQueueItemRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_LIST_ANNOTATION_QUEUE_ITEMS:
          serviceImpl.llmEvaluationListAnnotationQueueItems((ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsResponse>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_UPDATE_ANNOTATION_QUEUE_ITEM:
          serviceImpl.llmEvaluationUpdateAnnotationQueueItem((ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAnnotationQueueItemRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem>) responseObserver);
          break;
        case METHODID_LLM_EVALUATION_PROMOTE_ANNOTATION_QUEUE_ITEM:
          serviceImpl.llmEvaluationPromoteAnnotationQueueItem((ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemResponse>) responseObserver);
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
          getLlmEvaluationCreateDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.CreateLlmEvaluationDatasetRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationDataset>(
                service, METHODID_LLM_EVALUATION_CREATE_DATASET)))
        .addMethod(
          getLlmEvaluationGetDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.GetLlmEvaluationDatasetRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationDataset>(
                service, METHODID_LLM_EVALUATION_GET_DATASET)))
        .addMethod(
          getLlmEvaluationListDatasetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsRequest,
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationDatasetsResponse>(
                service, METHODID_LLM_EVALUATION_LIST_DATASETS)))
        .addMethod(
          getLlmEvaluationUpdateDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationDatasetRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationDataset>(
                service, METHODID_LLM_EVALUATION_UPDATE_DATASET)))
        .addMethod(
          getLlmEvaluationDeleteDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationDatasetRequest,
              com.google.protobuf.Empty>(
                service, METHODID_LLM_EVALUATION_DELETE_DATASET)))
        .addMethod(
          getLlmEvaluationAddExampleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.AddLlmEvaluationExampleRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationExample>(
                service, METHODID_LLM_EVALUATION_ADD_EXAMPLE)))
        .addMethod(
          getLlmEvaluationAddExamplesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesRequest,
              ondewo.nlu.LlmEvaluation.AddLlmEvaluationExamplesResponse>(
                service, METHODID_LLM_EVALUATION_ADD_EXAMPLES)))
        .addMethod(
          getLlmEvaluationGetExampleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.GetLlmEvaluationExampleRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationExample>(
                service, METHODID_LLM_EVALUATION_GET_EXAMPLE)))
        .addMethod(
          getLlmEvaluationListExamplesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesRequest,
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationExamplesResponse>(
                service, METHODID_LLM_EVALUATION_LIST_EXAMPLES)))
        .addMethod(
          getLlmEvaluationUpdateExampleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExampleRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationExample>(
                service, METHODID_LLM_EVALUATION_UPDATE_EXAMPLE)))
        .addMethod(
          getLlmEvaluationDeleteExampleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExampleRequest,
              com.google.protobuf.Empty>(
                service, METHODID_LLM_EVALUATION_DELETE_EXAMPLE)))
        .addMethod(
          getLlmEvaluationRunExperimentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.RunLlmEvaluationExperimentRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_LLM_EVALUATION_RUN_EXPERIMENT)))
        .addMethod(
          getLlmEvaluationGetExperimentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.GetLlmEvaluationExperimentRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment>(
                service, METHODID_LLM_EVALUATION_GET_EXPERIMENT)))
        .addMethod(
          getLlmEvaluationListExperimentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsRequest,
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationExperimentsResponse>(
                service, METHODID_LLM_EVALUATION_LIST_EXPERIMENTS)))
        .addMethod(
          getLlmEvaluationUpdateExperimentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationExperimentRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment>(
                service, METHODID_LLM_EVALUATION_UPDATE_EXPERIMENT)))
        .addMethod(
          getLlmEvaluationDeleteExperimentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationExperimentRequest,
              com.google.protobuf.Empty>(
                service, METHODID_LLM_EVALUATION_DELETE_EXPERIMENT)))
        .addMethod(
          getLlmEvaluationCancelExperimentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.CancelLlmEvaluationExperimentRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationExperiment>(
                service, METHODID_LLM_EVALUATION_CANCEL_EXPERIMENT)))
        .addMethod(
          getLlmEvaluationCompareExperimentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.CompareLlmEvaluationExperimentsRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationComparison>(
                service, METHODID_LLM_EVALUATION_COMPARE_EXPERIMENTS)))
        .addMethod(
          getLlmEvaluationSubmitFeedbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.SubmitLlmEvaluationFeedbackRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback>(
                service, METHODID_LLM_EVALUATION_SUBMIT_FEEDBACK)))
        .addMethod(
          getLlmEvaluationListFeedbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackRequest,
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationFeedbackResponse>(
                service, METHODID_LLM_EVALUATION_LIST_FEEDBACK)))
        .addMethod(
          getLlmEvaluationDeleteFeedbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationFeedbackRequest,
              com.google.protobuf.Empty>(
                service, METHODID_LLM_EVALUATION_DELETE_FEEDBACK)))
        .addMethod(
          getLlmEvaluationUpdateFeedbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationFeedbackRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationFeedback>(
                service, METHODID_LLM_EVALUATION_UPDATE_FEEDBACK)))
        .addMethod(
          getLlmEvaluationCreateReleaseGateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReleaseGateRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate>(
                service, METHODID_LLM_EVALUATION_CREATE_RELEASE_GATE)))
        .addMethod(
          getLlmEvaluationGetReleaseGateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate>(
                service, METHODID_LLM_EVALUATION_GET_RELEASE_GATE)))
        .addMethod(
          getLlmEvaluationListReleaseGatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesRequest,
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGatesResponse>(
                service, METHODID_LLM_EVALUATION_LIST_RELEASE_GATES)))
        .addMethod(
          getLlmEvaluationUpdateReleaseGateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationReleaseGateRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGate>(
                service, METHODID_LLM_EVALUATION_UPDATE_RELEASE_GATE)))
        .addMethod(
          getLlmEvaluationDeleteReleaseGateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReleaseGateRequest,
              com.google.protobuf.Empty>(
                service, METHODID_LLM_EVALUATION_DELETE_RELEASE_GATE)))
        .addMethod(
          getLlmEvaluationRunReleaseGateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.RunLlmEvaluationReleaseGateRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_LLM_EVALUATION_RUN_RELEASE_GATE)))
        .addMethod(
          getLlmEvaluationGetReleaseGateRunMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.GetLlmEvaluationReleaseGateRunRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationReleaseGateRun>(
                service, METHODID_LLM_EVALUATION_GET_RELEASE_GATE_RUN)))
        .addMethod(
          getLlmEvaluationListReleaseGateRunsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsRequest,
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationReleaseGateRunsResponse>(
                service, METHODID_LLM_EVALUATION_LIST_RELEASE_GATE_RUNS)))
        .addMethod(
          getLlmEvaluationCreateScorecardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScorecardRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard>(
                service, METHODID_LLM_EVALUATION_CREATE_SCORECARD)))
        .addMethod(
          getLlmEvaluationGetScorecardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.GetLlmEvaluationScorecardRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard>(
                service, METHODID_LLM_EVALUATION_GET_SCORECARD)))
        .addMethod(
          getLlmEvaluationListScorecardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsRequest,
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationScorecardsResponse>(
                service, METHODID_LLM_EVALUATION_LIST_SCORECARDS)))
        .addMethod(
          getLlmEvaluationUpdateScorecardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScorecardRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationScorecard>(
                service, METHODID_LLM_EVALUATION_UPDATE_SCORECARD)))
        .addMethod(
          getLlmEvaluationDeleteScorecardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScorecardRequest,
              com.google.protobuf.Empty>(
                service, METHODID_LLM_EVALUATION_DELETE_SCORECARD)))
        .addMethod(
          getLlmEvaluationGetProjectSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.GetLlmEvaluationProjectSettingsRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings>(
                service, METHODID_LLM_EVALUATION_GET_PROJECT_SETTINGS)))
        .addMethod(
          getLlmEvaluationUpdateProjectSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationProjectSettingsRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationProjectSettings>(
                service, METHODID_LLM_EVALUATION_UPDATE_PROJECT_SETTINGS)))
        .addMethod(
          getLlmEvaluationListEvaluatorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsRequest,
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationEvaluatorsResponse>(
                service, METHODID_LLM_EVALUATION_LIST_EVALUATORS)))
        .addMethod(
          getLlmEvaluationCreateExamplesFromSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionRequest,
              ondewo.nlu.LlmEvaluation.CreateLlmEvaluationExamplesFromSessionResponse>(
                service, METHODID_LLM_EVALUATION_CREATE_EXAMPLES_FROM_SESSION)))
        .addMethod(
          getLlmEvaluationSimulateConversationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.SimulateLlmEvaluationConversationsRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_LLM_EVALUATION_SIMULATE_CONVERSATIONS)))
        .addMethod(
          getLlmEvaluationCreateScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.CreateLlmEvaluationScheduleRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule>(
                service, METHODID_LLM_EVALUATION_CREATE_SCHEDULE)))
        .addMethod(
          getLlmEvaluationGetScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.GetLlmEvaluationScheduleRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule>(
                service, METHODID_LLM_EVALUATION_GET_SCHEDULE)))
        .addMethod(
          getLlmEvaluationListSchedulesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesRequest,
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationSchedulesResponse>(
                service, METHODID_LLM_EVALUATION_LIST_SCHEDULES)))
        .addMethod(
          getLlmEvaluationUpdateScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationScheduleRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationSchedule>(
                service, METHODID_LLM_EVALUATION_UPDATE_SCHEDULE)))
        .addMethod(
          getLlmEvaluationDeleteScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationScheduleRequest,
              com.google.protobuf.Empty>(
                service, METHODID_LLM_EVALUATION_DELETE_SCHEDULE)))
        .addMethod(
          getLlmEvaluationCreateReportMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.CreateLlmEvaluationReportRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationReport>(
                service, METHODID_LLM_EVALUATION_CREATE_REPORT)))
        .addMethod(
          getLlmEvaluationGetReportMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.GetLlmEvaluationReportRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationReport>(
                service, METHODID_LLM_EVALUATION_GET_REPORT)))
        .addMethod(
          getLlmEvaluationListReportsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsRequest,
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationReportsResponse>(
                service, METHODID_LLM_EVALUATION_LIST_REPORTS)))
        .addMethod(
          getLlmEvaluationDeleteReportMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationReportRequest,
              com.google.protobuf.Empty>(
                service, METHODID_LLM_EVALUATION_DELETE_REPORT)))
        .addMethod(
          getLlmEvaluationCreateAbExperimentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.CreateLlmEvaluationAbExperimentRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment>(
                service, METHODID_LLM_EVALUATION_CREATE_AB_EXPERIMENT)))
        .addMethod(
          getLlmEvaluationGetAbExperimentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment>(
                service, METHODID_LLM_EVALUATION_GET_AB_EXPERIMENT)))
        .addMethod(
          getLlmEvaluationListAbExperimentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsRequest,
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbExperimentsResponse>(
                service, METHODID_LLM_EVALUATION_LIST_AB_EXPERIMENTS)))
        .addMethod(
          getLlmEvaluationUpdateAbExperimentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAbExperimentRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment>(
                service, METHODID_LLM_EVALUATION_UPDATE_AB_EXPERIMENT)))
        .addMethod(
          getLlmEvaluationDeleteAbExperimentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationAbExperimentRequest,
              com.google.protobuf.Empty>(
                service, METHODID_LLM_EVALUATION_DELETE_AB_EXPERIMENT)))
        .addMethod(
          getLlmEvaluationStartAbExperimentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.StartLlmEvaluationAbExperimentRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment>(
                service, METHODID_LLM_EVALUATION_START_AB_EXPERIMENT)))
        .addMethod(
          getLlmEvaluationStopAbExperimentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.StopLlmEvaluationAbExperimentRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationAbExperiment>(
                service, METHODID_LLM_EVALUATION_STOP_AB_EXPERIMENT)))
        .addMethod(
          getLlmEvaluationGetAbExperimentResultsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsRequest,
              ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbExperimentResultsResponse>(
                service, METHODID_LLM_EVALUATION_GET_AB_EXPERIMENT_RESULTS)))
        .addMethod(
          getLlmEvaluationGetAbRolloutRecommendationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutRecommendationRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutRecommendation>(
                service, METHODID_LLM_EVALUATION_GET_AB_ROLLOUT_RECOMMENDATION)))
        .addMethod(
          getLlmEvaluationApplyAbRolloutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.ApplyLlmEvaluationAbRolloutRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision>(
                service, METHODID_LLM_EVALUATION_APPLY_AB_ROLLOUT)))
        .addMethod(
          getLlmEvaluationGetAbRolloutDecisionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.GetLlmEvaluationAbRolloutDecisionRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationAbRolloutDecision>(
                service, METHODID_LLM_EVALUATION_GET_AB_ROLLOUT_DECISION)))
        .addMethod(
          getLlmEvaluationListAbRolloutDecisionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsRequest,
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationAbRolloutDecisionsResponse>(
                service, METHODID_LLM_EVALUATION_LIST_AB_ROLLOUT_DECISIONS)))
        .addMethod(
          getLlmEvaluationCreateOnlineConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.CreateLlmEvaluationOnlineConfigRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig>(
                service, METHODID_LLM_EVALUATION_CREATE_ONLINE_CONFIG)))
        .addMethod(
          getLlmEvaluationGetOnlineConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineConfigRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig>(
                service, METHODID_LLM_EVALUATION_GET_ONLINE_CONFIG)))
        .addMethod(
          getLlmEvaluationListOnlineConfigsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsRequest,
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineConfigsResponse>(
                service, METHODID_LLM_EVALUATION_LIST_ONLINE_CONFIGS)))
        .addMethod(
          getLlmEvaluationUpdateOnlineConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationOnlineConfigRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineConfig>(
                service, METHODID_LLM_EVALUATION_UPDATE_ONLINE_CONFIG)))
        .addMethod(
          getLlmEvaluationDeleteOnlineConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.DeleteLlmEvaluationOnlineConfigRequest,
              com.google.protobuf.Empty>(
                service, METHODID_LLM_EVALUATION_DELETE_ONLINE_CONFIG)))
        .addMethod(
          getLlmEvaluationGetOnlineResultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.GetLlmEvaluationOnlineResultRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationOnlineResult>(
                service, METHODID_LLM_EVALUATION_GET_ONLINE_RESULT)))
        .addMethod(
          getLlmEvaluationListOnlineResultsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsRequest,
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationOnlineResultsResponse>(
                service, METHODID_LLM_EVALUATION_LIST_ONLINE_RESULTS)))
        .addMethod(
          getLlmEvaluationGetAnnotationQueueItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.GetLlmEvaluationAnnotationQueueItemRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem>(
                service, METHODID_LLM_EVALUATION_GET_ANNOTATION_QUEUE_ITEM)))
        .addMethod(
          getLlmEvaluationListAnnotationQueueItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsRequest,
              ondewo.nlu.LlmEvaluation.ListLlmEvaluationAnnotationQueueItemsResponse>(
                service, METHODID_LLM_EVALUATION_LIST_ANNOTATION_QUEUE_ITEMS)))
        .addMethod(
          getLlmEvaluationUpdateAnnotationQueueItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.UpdateLlmEvaluationAnnotationQueueItemRequest,
              ondewo.nlu.LlmEvaluation.LlmEvaluationAnnotationQueueItem>(
                service, METHODID_LLM_EVALUATION_UPDATE_ANNOTATION_QUEUE_ITEM)))
        .addMethod(
          getLlmEvaluationPromoteAnnotationQueueItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemRequest,
              ondewo.nlu.LlmEvaluation.PromoteLlmEvaluationAnnotationQueueItemResponse>(
                service, METHODID_LLM_EVALUATION_PROMOTE_ANNOTATION_QUEUE_ITEM)))
        .build();
  }

  private static abstract class LlmEvaluationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LlmEvaluationsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ondewo.nlu.LlmEvaluation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LlmEvaluations");
    }
  }

  private static final class LlmEvaluationsFileDescriptorSupplier
      extends LlmEvaluationsBaseDescriptorSupplier {
    LlmEvaluationsFileDescriptorSupplier() {}
  }

  private static final class LlmEvaluationsMethodDescriptorSupplier
      extends LlmEvaluationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LlmEvaluationsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LlmEvaluationsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LlmEvaluationsFileDescriptorSupplier())
              .addMethod(getLlmEvaluationCreateDatasetMethod())
              .addMethod(getLlmEvaluationGetDatasetMethod())
              .addMethod(getLlmEvaluationListDatasetsMethod())
              .addMethod(getLlmEvaluationUpdateDatasetMethod())
              .addMethod(getLlmEvaluationDeleteDatasetMethod())
              .addMethod(getLlmEvaluationAddExampleMethod())
              .addMethod(getLlmEvaluationAddExamplesMethod())
              .addMethod(getLlmEvaluationGetExampleMethod())
              .addMethod(getLlmEvaluationListExamplesMethod())
              .addMethod(getLlmEvaluationUpdateExampleMethod())
              .addMethod(getLlmEvaluationDeleteExampleMethod())
              .addMethod(getLlmEvaluationRunExperimentMethod())
              .addMethod(getLlmEvaluationGetExperimentMethod())
              .addMethod(getLlmEvaluationListExperimentsMethod())
              .addMethod(getLlmEvaluationUpdateExperimentMethod())
              .addMethod(getLlmEvaluationDeleteExperimentMethod())
              .addMethod(getLlmEvaluationCancelExperimentMethod())
              .addMethod(getLlmEvaluationCompareExperimentsMethod())
              .addMethod(getLlmEvaluationSubmitFeedbackMethod())
              .addMethod(getLlmEvaluationListFeedbackMethod())
              .addMethod(getLlmEvaluationDeleteFeedbackMethod())
              .addMethod(getLlmEvaluationUpdateFeedbackMethod())
              .addMethod(getLlmEvaluationCreateReleaseGateMethod())
              .addMethod(getLlmEvaluationGetReleaseGateMethod())
              .addMethod(getLlmEvaluationListReleaseGatesMethod())
              .addMethod(getLlmEvaluationUpdateReleaseGateMethod())
              .addMethod(getLlmEvaluationDeleteReleaseGateMethod())
              .addMethod(getLlmEvaluationRunReleaseGateMethod())
              .addMethod(getLlmEvaluationGetReleaseGateRunMethod())
              .addMethod(getLlmEvaluationListReleaseGateRunsMethod())
              .addMethod(getLlmEvaluationCreateScorecardMethod())
              .addMethod(getLlmEvaluationGetScorecardMethod())
              .addMethod(getLlmEvaluationListScorecardsMethod())
              .addMethod(getLlmEvaluationUpdateScorecardMethod())
              .addMethod(getLlmEvaluationDeleteScorecardMethod())
              .addMethod(getLlmEvaluationGetProjectSettingsMethod())
              .addMethod(getLlmEvaluationUpdateProjectSettingsMethod())
              .addMethod(getLlmEvaluationListEvaluatorsMethod())
              .addMethod(getLlmEvaluationCreateExamplesFromSessionMethod())
              .addMethod(getLlmEvaluationSimulateConversationsMethod())
              .addMethod(getLlmEvaluationCreateScheduleMethod())
              .addMethod(getLlmEvaluationGetScheduleMethod())
              .addMethod(getLlmEvaluationListSchedulesMethod())
              .addMethod(getLlmEvaluationUpdateScheduleMethod())
              .addMethod(getLlmEvaluationDeleteScheduleMethod())
              .addMethod(getLlmEvaluationCreateReportMethod())
              .addMethod(getLlmEvaluationGetReportMethod())
              .addMethod(getLlmEvaluationListReportsMethod())
              .addMethod(getLlmEvaluationDeleteReportMethod())
              .addMethod(getLlmEvaluationCreateAbExperimentMethod())
              .addMethod(getLlmEvaluationGetAbExperimentMethod())
              .addMethod(getLlmEvaluationListAbExperimentsMethod())
              .addMethod(getLlmEvaluationUpdateAbExperimentMethod())
              .addMethod(getLlmEvaluationDeleteAbExperimentMethod())
              .addMethod(getLlmEvaluationStartAbExperimentMethod())
              .addMethod(getLlmEvaluationStopAbExperimentMethod())
              .addMethod(getLlmEvaluationGetAbExperimentResultsMethod())
              .addMethod(getLlmEvaluationGetAbRolloutRecommendationMethod())
              .addMethod(getLlmEvaluationApplyAbRolloutMethod())
              .addMethod(getLlmEvaluationGetAbRolloutDecisionMethod())
              .addMethod(getLlmEvaluationListAbRolloutDecisionsMethod())
              .addMethod(getLlmEvaluationCreateOnlineConfigMethod())
              .addMethod(getLlmEvaluationGetOnlineConfigMethod())
              .addMethod(getLlmEvaluationListOnlineConfigsMethod())
              .addMethod(getLlmEvaluationUpdateOnlineConfigMethod())
              .addMethod(getLlmEvaluationDeleteOnlineConfigMethod())
              .addMethod(getLlmEvaluationGetOnlineResultMethod())
              .addMethod(getLlmEvaluationListOnlineResultsMethod())
              .addMethod(getLlmEvaluationGetAnnotationQueueItemMethod())
              .addMethod(getLlmEvaluationListAnnotationQueueItemsMethod())
              .addMethod(getLlmEvaluationUpdateAnnotationQueueItemMethod())
              .addMethod(getLlmEvaluationPromoteAnnotationQueueItemMethod())
              .build();
        }
      }
    }
    return result;
  }
}
