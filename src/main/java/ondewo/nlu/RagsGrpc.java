package ondewo.nlu;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Provides RAG and web crawler endpoints.
 * Most of the RAG related endpoints largely mirror &lt;a href="https://github.com/ondewo/ragflow"&gt;RAGFlow's&lt;/a&gt; HTTP API endpoints. For more information on RAGFlow refer to the &lt;a href="https://ragflow.io/docs/dev/"&gt;official documentation&lt;/a&gt;
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class RagsGrpc {

  private RagsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.nlu.Rags";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagCreateDatasetRequest,
      ondewo.nlu.Rag.RagDataset> getRagCreateDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagCreateDataset",
      requestType = ondewo.nlu.Rag.RagCreateDatasetRequest.class,
      responseType = ondewo.nlu.Rag.RagDataset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagCreateDatasetRequest,
      ondewo.nlu.Rag.RagDataset> getRagCreateDatasetMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagCreateDatasetRequest, ondewo.nlu.Rag.RagDataset> getRagCreateDatasetMethod;
    if ((getRagCreateDatasetMethod = RagsGrpc.getRagCreateDatasetMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagCreateDatasetMethod = RagsGrpc.getRagCreateDatasetMethod) == null) {
          RagsGrpc.getRagCreateDatasetMethod = getRagCreateDatasetMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagCreateDatasetRequest, ondewo.nlu.Rag.RagDataset>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagCreateDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagCreateDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagDataset.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagCreateDataset"))
              .build();
        }
      }
    }
    return getRagCreateDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagUpdateDatasetRequest,
      ondewo.nlu.Rag.RagDataset> getRagUpdateDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagUpdateDataset",
      requestType = ondewo.nlu.Rag.RagUpdateDatasetRequest.class,
      responseType = ondewo.nlu.Rag.RagDataset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagUpdateDatasetRequest,
      ondewo.nlu.Rag.RagDataset> getRagUpdateDatasetMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagUpdateDatasetRequest, ondewo.nlu.Rag.RagDataset> getRagUpdateDatasetMethod;
    if ((getRagUpdateDatasetMethod = RagsGrpc.getRagUpdateDatasetMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagUpdateDatasetMethod = RagsGrpc.getRagUpdateDatasetMethod) == null) {
          RagsGrpc.getRagUpdateDatasetMethod = getRagUpdateDatasetMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagUpdateDatasetRequest, ondewo.nlu.Rag.RagDataset>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagUpdateDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagUpdateDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagDataset.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagUpdateDataset"))
              .build();
        }
      }
    }
    return getRagUpdateDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDeleteRequest,
      ondewo.nlu.Rag.RagPartialSuccess> getRagDeleteDatasetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagDeleteDatasets",
      requestType = ondewo.nlu.Rag.RagDeleteRequest.class,
      responseType = ondewo.nlu.Rag.RagPartialSuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDeleteRequest,
      ondewo.nlu.Rag.RagPartialSuccess> getRagDeleteDatasetsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDeleteRequest, ondewo.nlu.Rag.RagPartialSuccess> getRagDeleteDatasetsMethod;
    if ((getRagDeleteDatasetsMethod = RagsGrpc.getRagDeleteDatasetsMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagDeleteDatasetsMethod = RagsGrpc.getRagDeleteDatasetsMethod) == null) {
          RagsGrpc.getRagDeleteDatasetsMethod = getRagDeleteDatasetsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagDeleteRequest, ondewo.nlu.Rag.RagPartialSuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagDeleteDatasets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagPartialSuccess.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagDeleteDatasets"))
              .build();
        }
      }
    }
    return getRagDeleteDatasetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagListDatasetsRequest,
      ondewo.nlu.Rag.RagDatasetList> getRagListDatasetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagListDatasets",
      requestType = ondewo.nlu.Rag.RagListDatasetsRequest.class,
      responseType = ondewo.nlu.Rag.RagDatasetList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagListDatasetsRequest,
      ondewo.nlu.Rag.RagDatasetList> getRagListDatasetsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagListDatasetsRequest, ondewo.nlu.Rag.RagDatasetList> getRagListDatasetsMethod;
    if ((getRagListDatasetsMethod = RagsGrpc.getRagListDatasetsMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagListDatasetsMethod = RagsGrpc.getRagListDatasetsMethod) == null) {
          RagsGrpc.getRagListDatasetsMethod = getRagListDatasetsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagListDatasetsRequest, ondewo.nlu.Rag.RagDatasetList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagListDatasets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagListDatasetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagDatasetList.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagListDatasets"))
              .build();
        }
      }
    }
    return getRagListDatasetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagUploadDocumentRequest,
      ondewo.nlu.Rag.RagDocument> getRagUploadDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagUploadDocument",
      requestType = ondewo.nlu.Rag.RagUploadDocumentRequest.class,
      responseType = ondewo.nlu.Rag.RagDocument.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagUploadDocumentRequest,
      ondewo.nlu.Rag.RagDocument> getRagUploadDocumentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagUploadDocumentRequest, ondewo.nlu.Rag.RagDocument> getRagUploadDocumentMethod;
    if ((getRagUploadDocumentMethod = RagsGrpc.getRagUploadDocumentMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagUploadDocumentMethod = RagsGrpc.getRagUploadDocumentMethod) == null) {
          RagsGrpc.getRagUploadDocumentMethod = getRagUploadDocumentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagUploadDocumentRequest, ondewo.nlu.Rag.RagDocument>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagUploadDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagUploadDocumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagDocument.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagUploadDocument"))
              .build();
        }
      }
    }
    return getRagUploadDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagUpdateDocumentRequest,
      ondewo.nlu.Rag.RagDocument> getRagUpdateDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagUpdateDocument",
      requestType = ondewo.nlu.Rag.RagUpdateDocumentRequest.class,
      responseType = ondewo.nlu.Rag.RagDocument.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagUpdateDocumentRequest,
      ondewo.nlu.Rag.RagDocument> getRagUpdateDocumentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagUpdateDocumentRequest, ondewo.nlu.Rag.RagDocument> getRagUpdateDocumentMethod;
    if ((getRagUpdateDocumentMethod = RagsGrpc.getRagUpdateDocumentMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagUpdateDocumentMethod = RagsGrpc.getRagUpdateDocumentMethod) == null) {
          RagsGrpc.getRagUpdateDocumentMethod = getRagUpdateDocumentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagUpdateDocumentRequest, ondewo.nlu.Rag.RagDocument>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagUpdateDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagUpdateDocumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagDocument.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagUpdateDocument"))
              .build();
        }
      }
    }
    return getRagUpdateDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDownloadDocumentRequest,
      ondewo.nlu.Rag.RagFileChunk> getRagDownloadDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagDownloadDocument",
      requestType = ondewo.nlu.Rag.RagDownloadDocumentRequest.class,
      responseType = ondewo.nlu.Rag.RagFileChunk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDownloadDocumentRequest,
      ondewo.nlu.Rag.RagFileChunk> getRagDownloadDocumentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDownloadDocumentRequest, ondewo.nlu.Rag.RagFileChunk> getRagDownloadDocumentMethod;
    if ((getRagDownloadDocumentMethod = RagsGrpc.getRagDownloadDocumentMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagDownloadDocumentMethod = RagsGrpc.getRagDownloadDocumentMethod) == null) {
          RagsGrpc.getRagDownloadDocumentMethod = getRagDownloadDocumentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagDownloadDocumentRequest, ondewo.nlu.Rag.RagFileChunk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagDownloadDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagDownloadDocumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagFileChunk.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagDownloadDocument"))
              .build();
        }
      }
    }
    return getRagDownloadDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagListDocumentsRequest,
      ondewo.nlu.Rag.RagDocumentList> getRagListDocumentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagListDocuments",
      requestType = ondewo.nlu.Rag.RagListDocumentsRequest.class,
      responseType = ondewo.nlu.Rag.RagDocumentList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagListDocumentsRequest,
      ondewo.nlu.Rag.RagDocumentList> getRagListDocumentsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagListDocumentsRequest, ondewo.nlu.Rag.RagDocumentList> getRagListDocumentsMethod;
    if ((getRagListDocumentsMethod = RagsGrpc.getRagListDocumentsMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagListDocumentsMethod = RagsGrpc.getRagListDocumentsMethod) == null) {
          RagsGrpc.getRagListDocumentsMethod = getRagListDocumentsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagListDocumentsRequest, ondewo.nlu.Rag.RagDocumentList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagListDocuments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagListDocumentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagDocumentList.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagListDocuments"))
              .build();
        }
      }
    }
    return getRagListDocumentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDeleteDocumentsRequest,
      ondewo.nlu.Rag.RagPartialSuccess> getRagDeleteDocumentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagDeleteDocuments",
      requestType = ondewo.nlu.Rag.RagDeleteDocumentsRequest.class,
      responseType = ondewo.nlu.Rag.RagPartialSuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDeleteDocumentsRequest,
      ondewo.nlu.Rag.RagPartialSuccess> getRagDeleteDocumentsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDeleteDocumentsRequest, ondewo.nlu.Rag.RagPartialSuccess> getRagDeleteDocumentsMethod;
    if ((getRagDeleteDocumentsMethod = RagsGrpc.getRagDeleteDocumentsMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagDeleteDocumentsMethod = RagsGrpc.getRagDeleteDocumentsMethod) == null) {
          RagsGrpc.getRagDeleteDocumentsMethod = getRagDeleteDocumentsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagDeleteDocumentsRequest, ondewo.nlu.Rag.RagPartialSuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagDeleteDocuments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagDeleteDocumentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagPartialSuccess.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagDeleteDocuments"))
              .build();
        }
      }
    }
    return getRagDeleteDocumentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagRetrievalRequest,
      ondewo.nlu.Rag.RagRetrievalResponse> getRagRetrievalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagRetrieval",
      requestType = ondewo.nlu.Rag.RagRetrievalRequest.class,
      responseType = ondewo.nlu.Rag.RagRetrievalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagRetrievalRequest,
      ondewo.nlu.Rag.RagRetrievalResponse> getRagRetrievalMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagRetrievalRequest, ondewo.nlu.Rag.RagRetrievalResponse> getRagRetrievalMethod;
    if ((getRagRetrievalMethod = RagsGrpc.getRagRetrievalMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagRetrievalMethod = RagsGrpc.getRagRetrievalMethod) == null) {
          RagsGrpc.getRagRetrievalMethod = getRagRetrievalMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagRetrievalRequest, ondewo.nlu.Rag.RagRetrievalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagRetrieval"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagRetrievalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagRetrievalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagRetrieval"))
              .build();
        }
      }
    }
    return getRagRetrievalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDocumentIdsRequest,
      ondewo.nlu.Rag.RagPartialSuccess> getRagParseDocumentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagParseDocuments",
      requestType = ondewo.nlu.Rag.RagDocumentIdsRequest.class,
      responseType = ondewo.nlu.Rag.RagPartialSuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDocumentIdsRequest,
      ondewo.nlu.Rag.RagPartialSuccess> getRagParseDocumentsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDocumentIdsRequest, ondewo.nlu.Rag.RagPartialSuccess> getRagParseDocumentsMethod;
    if ((getRagParseDocumentsMethod = RagsGrpc.getRagParseDocumentsMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagParseDocumentsMethod = RagsGrpc.getRagParseDocumentsMethod) == null) {
          RagsGrpc.getRagParseDocumentsMethod = getRagParseDocumentsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagDocumentIdsRequest, ondewo.nlu.Rag.RagPartialSuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagParseDocuments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagDocumentIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagPartialSuccess.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagParseDocuments"))
              .build();
        }
      }
    }
    return getRagParseDocumentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDocumentIdsRequest,
      ondewo.nlu.Rag.RagPartialSuccess> getRagStopParsingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagStopParsing",
      requestType = ondewo.nlu.Rag.RagDocumentIdsRequest.class,
      responseType = ondewo.nlu.Rag.RagPartialSuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDocumentIdsRequest,
      ondewo.nlu.Rag.RagPartialSuccess> getRagStopParsingMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDocumentIdsRequest, ondewo.nlu.Rag.RagPartialSuccess> getRagStopParsingMethod;
    if ((getRagStopParsingMethod = RagsGrpc.getRagStopParsingMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagStopParsingMethod = RagsGrpc.getRagStopParsingMethod) == null) {
          RagsGrpc.getRagStopParsingMethod = getRagStopParsingMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagDocumentIdsRequest, ondewo.nlu.Rag.RagPartialSuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagStopParsing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagDocumentIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagPartialSuccess.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagStopParsing"))
              .build();
        }
      }
    }
    return getRagStopParsingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagCreateCrawlerRequest,
      ondewo.nlu.Rag.RagCrawler> getRagCreateCrawlerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagCreateCrawler",
      requestType = ondewo.nlu.Rag.RagCreateCrawlerRequest.class,
      responseType = ondewo.nlu.Rag.RagCrawler.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagCreateCrawlerRequest,
      ondewo.nlu.Rag.RagCrawler> getRagCreateCrawlerMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagCreateCrawlerRequest, ondewo.nlu.Rag.RagCrawler> getRagCreateCrawlerMethod;
    if ((getRagCreateCrawlerMethod = RagsGrpc.getRagCreateCrawlerMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagCreateCrawlerMethod = RagsGrpc.getRagCreateCrawlerMethod) == null) {
          RagsGrpc.getRagCreateCrawlerMethod = getRagCreateCrawlerMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagCreateCrawlerRequest, ondewo.nlu.Rag.RagCrawler>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagCreateCrawler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagCreateCrawlerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagCrawler.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagCreateCrawler"))
              .build();
        }
      }
    }
    return getRagCreateCrawlerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagGetCrawlerRequest,
      ondewo.nlu.Rag.RagCrawler> getRagGetCrawlerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagGetCrawler",
      requestType = ondewo.nlu.Rag.RagGetCrawlerRequest.class,
      responseType = ondewo.nlu.Rag.RagCrawler.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagGetCrawlerRequest,
      ondewo.nlu.Rag.RagCrawler> getRagGetCrawlerMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagGetCrawlerRequest, ondewo.nlu.Rag.RagCrawler> getRagGetCrawlerMethod;
    if ((getRagGetCrawlerMethod = RagsGrpc.getRagGetCrawlerMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagGetCrawlerMethod = RagsGrpc.getRagGetCrawlerMethod) == null) {
          RagsGrpc.getRagGetCrawlerMethod = getRagGetCrawlerMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagGetCrawlerRequest, ondewo.nlu.Rag.RagCrawler>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagGetCrawler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagGetCrawlerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagCrawler.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagGetCrawler"))
              .build();
        }
      }
    }
    return getRagGetCrawlerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagListCrawlersRequest,
      ondewo.nlu.Rag.RagListCrawlersResponse> getRagListCrawlersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagListCrawlers",
      requestType = ondewo.nlu.Rag.RagListCrawlersRequest.class,
      responseType = ondewo.nlu.Rag.RagListCrawlersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagListCrawlersRequest,
      ondewo.nlu.Rag.RagListCrawlersResponse> getRagListCrawlersMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagListCrawlersRequest, ondewo.nlu.Rag.RagListCrawlersResponse> getRagListCrawlersMethod;
    if ((getRagListCrawlersMethod = RagsGrpc.getRagListCrawlersMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagListCrawlersMethod = RagsGrpc.getRagListCrawlersMethod) == null) {
          RagsGrpc.getRagListCrawlersMethod = getRagListCrawlersMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagListCrawlersRequest, ondewo.nlu.Rag.RagListCrawlersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagListCrawlers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagListCrawlersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagListCrawlersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagListCrawlers"))
              .build();
        }
      }
    }
    return getRagListCrawlersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagUpdateCrawlerRequest,
      ondewo.nlu.Rag.RagCrawler> getRagUpdateCrawlerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagUpdateCrawler",
      requestType = ondewo.nlu.Rag.RagUpdateCrawlerRequest.class,
      responseType = ondewo.nlu.Rag.RagCrawler.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagUpdateCrawlerRequest,
      ondewo.nlu.Rag.RagCrawler> getRagUpdateCrawlerMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagUpdateCrawlerRequest, ondewo.nlu.Rag.RagCrawler> getRagUpdateCrawlerMethod;
    if ((getRagUpdateCrawlerMethod = RagsGrpc.getRagUpdateCrawlerMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagUpdateCrawlerMethod = RagsGrpc.getRagUpdateCrawlerMethod) == null) {
          RagsGrpc.getRagUpdateCrawlerMethod = getRagUpdateCrawlerMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagUpdateCrawlerRequest, ondewo.nlu.Rag.RagCrawler>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagUpdateCrawler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagUpdateCrawlerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagCrawler.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagUpdateCrawler"))
              .build();
        }
      }
    }
    return getRagUpdateCrawlerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDeleteCrawlerRequest,
      ondewo.nlu.Rag.RagDeleteCrawlerResponse> getRagDeleteCrawlerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagDeleteCrawler",
      requestType = ondewo.nlu.Rag.RagDeleteCrawlerRequest.class,
      responseType = ondewo.nlu.Rag.RagDeleteCrawlerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDeleteCrawlerRequest,
      ondewo.nlu.Rag.RagDeleteCrawlerResponse> getRagDeleteCrawlerMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDeleteCrawlerRequest, ondewo.nlu.Rag.RagDeleteCrawlerResponse> getRagDeleteCrawlerMethod;
    if ((getRagDeleteCrawlerMethod = RagsGrpc.getRagDeleteCrawlerMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagDeleteCrawlerMethod = RagsGrpc.getRagDeleteCrawlerMethod) == null) {
          RagsGrpc.getRagDeleteCrawlerMethod = getRagDeleteCrawlerMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagDeleteCrawlerRequest, ondewo.nlu.Rag.RagDeleteCrawlerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagDeleteCrawler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagDeleteCrawlerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagDeleteCrawlerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagDeleteCrawler"))
              .build();
        }
      }
    }
    return getRagDeleteCrawlerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagStartCrawlerRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getRagStartCrawlerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagStartCrawler",
      requestType = ondewo.nlu.Rag.RagStartCrawlerRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagStartCrawlerRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getRagStartCrawlerMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagStartCrawlerRequest, ondewo.nlu.OperationsOuterClass.Operation> getRagStartCrawlerMethod;
    if ((getRagStartCrawlerMethod = RagsGrpc.getRagStartCrawlerMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagStartCrawlerMethod = RagsGrpc.getRagStartCrawlerMethod) == null) {
          RagsGrpc.getRagStartCrawlerMethod = getRagStartCrawlerMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagStartCrawlerRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagStartCrawler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagStartCrawlerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagStartCrawler"))
              .build();
        }
      }
    }
    return getRagStartCrawlerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagStopCrawlerRequest,
      ondewo.nlu.Rag.RagStopCrawlerResponse> getRagStopCrawlerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagStopCrawler",
      requestType = ondewo.nlu.Rag.RagStopCrawlerRequest.class,
      responseType = ondewo.nlu.Rag.RagStopCrawlerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagStopCrawlerRequest,
      ondewo.nlu.Rag.RagStopCrawlerResponse> getRagStopCrawlerMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagStopCrawlerRequest, ondewo.nlu.Rag.RagStopCrawlerResponse> getRagStopCrawlerMethod;
    if ((getRagStopCrawlerMethod = RagsGrpc.getRagStopCrawlerMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagStopCrawlerMethod = RagsGrpc.getRagStopCrawlerMethod) == null) {
          RagsGrpc.getRagStopCrawlerMethod = getRagStopCrawlerMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagStopCrawlerRequest, ondewo.nlu.Rag.RagStopCrawlerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagStopCrawler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagStopCrawlerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagStopCrawlerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagStopCrawler"))
              .build();
        }
      }
    }
    return getRagStopCrawlerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagGetCrawlerRunRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getRagGetCrawlerRunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagGetCrawlerRun",
      requestType = ondewo.nlu.Rag.RagGetCrawlerRunRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagGetCrawlerRunRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getRagGetCrawlerRunMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagGetCrawlerRunRequest, ondewo.nlu.OperationsOuterClass.Operation> getRagGetCrawlerRunMethod;
    if ((getRagGetCrawlerRunMethod = RagsGrpc.getRagGetCrawlerRunMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagGetCrawlerRunMethod = RagsGrpc.getRagGetCrawlerRunMethod) == null) {
          RagsGrpc.getRagGetCrawlerRunMethod = getRagGetCrawlerRunMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagGetCrawlerRunRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagGetCrawlerRun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagGetCrawlerRunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagGetCrawlerRun"))
              .build();
        }
      }
    }
    return getRagGetCrawlerRunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagListCrawlerRunsRequest,
      ondewo.nlu.Rag.RagListCrawlerRunsResponse> getRagListCrawlerRunsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagListCrawlerRuns",
      requestType = ondewo.nlu.Rag.RagListCrawlerRunsRequest.class,
      responseType = ondewo.nlu.Rag.RagListCrawlerRunsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagListCrawlerRunsRequest,
      ondewo.nlu.Rag.RagListCrawlerRunsResponse> getRagListCrawlerRunsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagListCrawlerRunsRequest, ondewo.nlu.Rag.RagListCrawlerRunsResponse> getRagListCrawlerRunsMethod;
    if ((getRagListCrawlerRunsMethod = RagsGrpc.getRagListCrawlerRunsMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagListCrawlerRunsMethod = RagsGrpc.getRagListCrawlerRunsMethod) == null) {
          RagsGrpc.getRagListCrawlerRunsMethod = getRagListCrawlerRunsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagListCrawlerRunsRequest, ondewo.nlu.Rag.RagListCrawlerRunsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagListCrawlerRuns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagListCrawlerRunsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagListCrawlerRunsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagListCrawlerRuns"))
              .build();
        }
      }
    }
    return getRagListCrawlerRunsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDeleteCrawlerRunsRequest,
      ondewo.nlu.Rag.RagDeleteCrawlerRunsResponse> getRagDeleteCrawlerRunsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagDeleteCrawlerRuns",
      requestType = ondewo.nlu.Rag.RagDeleteCrawlerRunsRequest.class,
      responseType = ondewo.nlu.Rag.RagDeleteCrawlerRunsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDeleteCrawlerRunsRequest,
      ondewo.nlu.Rag.RagDeleteCrawlerRunsResponse> getRagDeleteCrawlerRunsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDeleteCrawlerRunsRequest, ondewo.nlu.Rag.RagDeleteCrawlerRunsResponse> getRagDeleteCrawlerRunsMethod;
    if ((getRagDeleteCrawlerRunsMethod = RagsGrpc.getRagDeleteCrawlerRunsMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagDeleteCrawlerRunsMethod = RagsGrpc.getRagDeleteCrawlerRunsMethod) == null) {
          RagsGrpc.getRagDeleteCrawlerRunsMethod = getRagDeleteCrawlerRunsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagDeleteCrawlerRunsRequest, ondewo.nlu.Rag.RagDeleteCrawlerRunsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagDeleteCrawlerRuns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagDeleteCrawlerRunsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagDeleteCrawlerRunsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagDeleteCrawlerRuns"))
              .build();
        }
      }
    }
    return getRagDeleteCrawlerRunsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagGetCrawlerResultRequest,
      ondewo.nlu.Rag.RagCrawlerResult> getRagGetCrawlerResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagGetCrawlerResult",
      requestType = ondewo.nlu.Rag.RagGetCrawlerResultRequest.class,
      responseType = ondewo.nlu.Rag.RagCrawlerResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagGetCrawlerResultRequest,
      ondewo.nlu.Rag.RagCrawlerResult> getRagGetCrawlerResultMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagGetCrawlerResultRequest, ondewo.nlu.Rag.RagCrawlerResult> getRagGetCrawlerResultMethod;
    if ((getRagGetCrawlerResultMethod = RagsGrpc.getRagGetCrawlerResultMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagGetCrawlerResultMethod = RagsGrpc.getRagGetCrawlerResultMethod) == null) {
          RagsGrpc.getRagGetCrawlerResultMethod = getRagGetCrawlerResultMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagGetCrawlerResultRequest, ondewo.nlu.Rag.RagCrawlerResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagGetCrawlerResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagGetCrawlerResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagCrawlerResult.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagGetCrawlerResult"))
              .build();
        }
      }
    }
    return getRagGetCrawlerResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagGetCrawlerResultsRequest,
      ondewo.nlu.Rag.RagGetCrawlerResultsResponse> getRagGetCrawlerResultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagGetCrawlerResults",
      requestType = ondewo.nlu.Rag.RagGetCrawlerResultsRequest.class,
      responseType = ondewo.nlu.Rag.RagGetCrawlerResultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagGetCrawlerResultsRequest,
      ondewo.nlu.Rag.RagGetCrawlerResultsResponse> getRagGetCrawlerResultsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagGetCrawlerResultsRequest, ondewo.nlu.Rag.RagGetCrawlerResultsResponse> getRagGetCrawlerResultsMethod;
    if ((getRagGetCrawlerResultsMethod = RagsGrpc.getRagGetCrawlerResultsMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagGetCrawlerResultsMethod = RagsGrpc.getRagGetCrawlerResultsMethod) == null) {
          RagsGrpc.getRagGetCrawlerResultsMethod = getRagGetCrawlerResultsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagGetCrawlerResultsRequest, ondewo.nlu.Rag.RagGetCrawlerResultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagGetCrawlerResults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagGetCrawlerResultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagGetCrawlerResultsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagGetCrawlerResults"))
              .build();
        }
      }
    }
    return getRagGetCrawlerResultsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagAddCrawlerResultsToDatasetsRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getRagAddCrawlerResultsToDatasetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagAddCrawlerResultsToDatasets",
      requestType = ondewo.nlu.Rag.RagAddCrawlerResultsToDatasetsRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagAddCrawlerResultsToDatasetsRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getRagAddCrawlerResultsToDatasetsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagAddCrawlerResultsToDatasetsRequest, ondewo.nlu.OperationsOuterClass.Operation> getRagAddCrawlerResultsToDatasetsMethod;
    if ((getRagAddCrawlerResultsToDatasetsMethod = RagsGrpc.getRagAddCrawlerResultsToDatasetsMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagAddCrawlerResultsToDatasetsMethod = RagsGrpc.getRagAddCrawlerResultsToDatasetsMethod) == null) {
          RagsGrpc.getRagAddCrawlerResultsToDatasetsMethod = getRagAddCrawlerResultsToDatasetsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagAddCrawlerResultsToDatasetsRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagAddCrawlerResultsToDatasets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagAddCrawlerResultsToDatasetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagAddCrawlerResultsToDatasets"))
              .build();
        }
      }
    }
    return getRagAddCrawlerResultsToDatasetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagRemoveCrawlerResultsFromDatasetsRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getRagRemoveCrawlerResultsFromDatasetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagRemoveCrawlerResultsFromDatasets",
      requestType = ondewo.nlu.Rag.RagRemoveCrawlerResultsFromDatasetsRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagRemoveCrawlerResultsFromDatasetsRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getRagRemoveCrawlerResultsFromDatasetsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagRemoveCrawlerResultsFromDatasetsRequest, ondewo.nlu.OperationsOuterClass.Operation> getRagRemoveCrawlerResultsFromDatasetsMethod;
    if ((getRagRemoveCrawlerResultsFromDatasetsMethod = RagsGrpc.getRagRemoveCrawlerResultsFromDatasetsMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagRemoveCrawlerResultsFromDatasetsMethod = RagsGrpc.getRagRemoveCrawlerResultsFromDatasetsMethod) == null) {
          RagsGrpc.getRagRemoveCrawlerResultsFromDatasetsMethod = getRagRemoveCrawlerResultsFromDatasetsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagRemoveCrawlerResultsFromDatasetsRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagRemoveCrawlerResultsFromDatasets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagRemoveCrawlerResultsFromDatasetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagRemoveCrawlerResultsFromDatasets"))
              .build();
        }
      }
    }
    return getRagRemoveCrawlerResultsFromDatasetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsRequest,
      ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsResponse> getRagGetCrawlerAttachedDatasetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagGetCrawlerAttachedDatasets",
      requestType = ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsRequest.class,
      responseType = ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsRequest,
      ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsResponse> getRagGetCrawlerAttachedDatasetsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsRequest, ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsResponse> getRagGetCrawlerAttachedDatasetsMethod;
    if ((getRagGetCrawlerAttachedDatasetsMethod = RagsGrpc.getRagGetCrawlerAttachedDatasetsMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagGetCrawlerAttachedDatasetsMethod = RagsGrpc.getRagGetCrawlerAttachedDatasetsMethod) == null) {
          RagsGrpc.getRagGetCrawlerAttachedDatasetsMethod = getRagGetCrawlerAttachedDatasetsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsRequest, ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagGetCrawlerAttachedDatasets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagGetCrawlerAttachedDatasets"))
              .build();
        }
      }
    }
    return getRagGetCrawlerAttachedDatasetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDeleteCrawlersRequest,
      ondewo.nlu.Rag.RagDeleteCrawlersResponse> getRagDeleteCrawlersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagDeleteCrawlers",
      requestType = ondewo.nlu.Rag.RagDeleteCrawlersRequest.class,
      responseType = ondewo.nlu.Rag.RagDeleteCrawlersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDeleteCrawlersRequest,
      ondewo.nlu.Rag.RagDeleteCrawlersResponse> getRagDeleteCrawlersMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagDeleteCrawlersRequest, ondewo.nlu.Rag.RagDeleteCrawlersResponse> getRagDeleteCrawlersMethod;
    if ((getRagDeleteCrawlersMethod = RagsGrpc.getRagDeleteCrawlersMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagDeleteCrawlersMethod = RagsGrpc.getRagDeleteCrawlersMethod) == null) {
          RagsGrpc.getRagDeleteCrawlersMethod = getRagDeleteCrawlersMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagDeleteCrawlersRequest, ondewo.nlu.Rag.RagDeleteCrawlersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagDeleteCrawlers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagDeleteCrawlersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagDeleteCrawlersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagDeleteCrawlers"))
              .build();
        }
      }
    }
    return getRagDeleteCrawlersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagGetCrawlerRunLogsRequest,
      ondewo.nlu.Rag.RagGetCrawlerRunLogsResponse> getRagGetCrawlerRunLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RagGetCrawlerRunLogs",
      requestType = ondewo.nlu.Rag.RagGetCrawlerRunLogsRequest.class,
      responseType = ondewo.nlu.Rag.RagGetCrawlerRunLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagGetCrawlerRunLogsRequest,
      ondewo.nlu.Rag.RagGetCrawlerRunLogsResponse> getRagGetCrawlerRunLogsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.Rag.RagGetCrawlerRunLogsRequest, ondewo.nlu.Rag.RagGetCrawlerRunLogsResponse> getRagGetCrawlerRunLogsMethod;
    if ((getRagGetCrawlerRunLogsMethod = RagsGrpc.getRagGetCrawlerRunLogsMethod) == null) {
      synchronized (RagsGrpc.class) {
        if ((getRagGetCrawlerRunLogsMethod = RagsGrpc.getRagGetCrawlerRunLogsMethod) == null) {
          RagsGrpc.getRagGetCrawlerRunLogsMethod = getRagGetCrawlerRunLogsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.Rag.RagGetCrawlerRunLogsRequest, ondewo.nlu.Rag.RagGetCrawlerRunLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RagGetCrawlerRunLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagGetCrawlerRunLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.Rag.RagGetCrawlerRunLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RagsMethodDescriptorSupplier("RagGetCrawlerRunLogs"))
              .build();
        }
      }
    }
    return getRagGetCrawlerRunLogsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RagsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RagsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RagsStub>() {
        @java.lang.Override
        public RagsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RagsStub(channel, callOptions);
        }
      };
    return RagsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static RagsBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RagsBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RagsBlockingV2Stub>() {
        @java.lang.Override
        public RagsBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RagsBlockingV2Stub(channel, callOptions);
        }
      };
    return RagsBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RagsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RagsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RagsBlockingStub>() {
        @java.lang.Override
        public RagsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RagsBlockingStub(channel, callOptions);
        }
      };
    return RagsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RagsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RagsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RagsFutureStub>() {
        @java.lang.Override
        public RagsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RagsFutureStub(channel, callOptions);
        }
      };
    return RagsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Provides RAG and web crawler endpoints.
   * Most of the RAG related endpoints largely mirror &lt;a href="https://github.com/ondewo/ragflow"&gt;RAGFlow's&lt;/a&gt; HTTP API endpoints. For more information on RAGFlow refer to the &lt;a href="https://ragflow.io/docs/dev/"&gt;official documentation&lt;/a&gt;
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a new dataset (knowledge base).&lt;br&gt;
     * </pre>
     */
    default void ragCreateDataset(ondewo.nlu.Rag.RagCreateDatasetRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDataset> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagCreateDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an existing dataset's configuration.&lt;br&gt;
     * </pre>
     */
    default void ragUpdateDataset(ondewo.nlu.Rag.RagUpdateDatasetRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDataset> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagUpdateDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete one or more datasets (batch operation).&lt;br&gt;
     * If ids is null or empty, deletes all user's datasets.&lt;br&gt;
     * Deletes all associated documents, files, and chunks.
     * </pre>
     */
    default void ragDeleteDatasets(ondewo.nlu.Rag.RagDeleteRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagPartialSuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagDeleteDatasetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List datasets with pagination and filtering.&lt;br&gt;
     * Returns datasets from all tenants the user has access to.
     * </pre>
     */
    default void ragListDatasets(ondewo.nlu.Rag.RagListDatasetsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDatasetList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagListDatasetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Uploads a document to a dataset and starts parsing it.&lt;br&gt;
     * If the &lt;code&gt;run&lt;/code&gt; field of the returned document is not &lt;code&gt;RAG_DOCUMENT_STATUS_RUNNING&lt;/code&gt; this indicates a failure to start parsing the document.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagUploadDocumentRequest> ragUploadDocument(
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDocument> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRagUploadDocumentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update document metadata and configuration.&lt;br&gt;
     * If the chunk method is changed, the document is automatically re-parsed.&lt;br&gt;
     * If the &lt;code&gt;run&lt;/code&gt; field of the returned document is not &lt;code&gt;RAG_DOCUMENT_STATUS_RUNNING&lt;/code&gt; this indicates a failure to start parsing the document.
     * </pre>
     */
    default void ragUpdateDocument(ondewo.nlu.Rag.RagUpdateDocumentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDocument> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagUpdateDocumentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download the original document file.&lt;br&gt;
     * Returns binary file stream from storage.&lt;br&gt;
     * First chunk contains metadata, subsequent chunks only contain data.
     * </pre>
     */
    default void ragDownloadDocument(ondewo.nlu.Rag.RagDownloadDocumentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagFileChunk> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagDownloadDocumentMethod(), responseObserver);
    }

    /**
     * <pre>
     * List documents in a dataset with pagination and filtering.&lt;br&gt;
     * Supports time range filtering and keyword search.
     * </pre>
     */
    default void ragListDocuments(ondewo.nlu.Rag.RagListDocumentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDocumentList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagListDocumentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete one or more documents from a dataset (batch operation).&lt;br&gt;
     * If ids empty, deletes all documents. Removes chunks and storage files.
     * </pre>
     */
    default void ragDeleteDocuments(ondewo.nlu.Rag.RagDeleteDocumentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagPartialSuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagDeleteDocumentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve chunks using vector similarity search.&lt;br&gt;
     * Supports reranking, metadata filtering, and knowledge graph retrieval.
     * </pre>
     */
    default void ragRetrieval(ondewo.nlu.Rag.RagRetrievalRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagRetrievalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagRetrievalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start parsing documents into chunks.&lt;br&gt;
     * Queues documents for background processing.
     * </pre>
     */
    default void ragParseDocuments(ondewo.nlu.Rag.RagDocumentIdsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagPartialSuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagParseDocumentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop parsing documents.
     * </pre>
     */
    default void ragStopParsing(ondewo.nlu.Rag.RagDocumentIdsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagPartialSuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagStopParsingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a rag crawler for a dataset of an agent.
     * </pre>
     */
    default void ragCreateCrawler(ondewo.nlu.Rag.RagCreateCrawlerRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagCrawler> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagCreateCrawlerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a rag crawler by resource name.
     * </pre>
     */
    default void ragGetCrawler(ondewo.nlu.Rag.RagGetCrawlerRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagCrawler> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagGetCrawlerMethod(), responseObserver);
    }

    /**
     * <pre>
     * List rag crawlers of a dataset for the specified agent.
     * </pre>
     */
    default void ragListCrawlers(ondewo.nlu.Rag.RagListCrawlersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagListCrawlersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagListCrawlersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a rag crawler (partial update of configuration fields).
     * </pre>
     */
    default void ragUpdateCrawler(ondewo.nlu.Rag.RagUpdateCrawlerRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagCrawler> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagUpdateCrawlerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a rag crawler of a dataset for the specified agent.
     * </pre>
     */
    default void ragDeleteCrawler(ondewo.nlu.Rag.RagDeleteCrawlerRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDeleteCrawlerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagDeleteCrawlerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Run a crawler.
     * </pre>
     */
    default void ragStartCrawler(ondewo.nlu.Rag.RagStartCrawlerRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagStartCrawlerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop a pending or running crawler run.
     * </pre>
     */
    default void ragStopCrawler(ondewo.nlu.Rag.RagStopCrawlerRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagStopCrawlerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagStopCrawlerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a crawler run by resource name.
     * </pre>
     */
    default void ragGetCrawlerRun(ondewo.nlu.Rag.RagGetCrawlerRunRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagGetCrawlerRunMethod(), responseObserver);
    }

    /**
     * <pre>
     * List crawler runs for a crawler.
     * </pre>
     */
    default void ragListCrawlerRuns(ondewo.nlu.Rag.RagListCrawlerRunsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagListCrawlerRunsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagListCrawlerRunsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete crawler runs by explicit run names and/or crawler names.
     * </pre>
     */
    default void ragDeleteCrawlerRuns(ondewo.nlu.Rag.RagDeleteCrawlerRunsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDeleteCrawlerRunsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagDeleteCrawlerRunsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a single crawler result by crawler run resource name and URL.
     * </pre>
     */
    default void ragGetCrawlerResult(ondewo.nlu.Rag.RagGetCrawlerResultRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagCrawlerResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagGetCrawlerResultMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get crawler results by crawler run resource name.
     * </pre>
     */
    default void ragGetCrawlerResults(ondewo.nlu.Rag.RagGetCrawlerResultsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagGetCrawlerResultsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagGetCrawlerResultsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add rag crawler output to one or more datasets.
     * </pre>
     */
    default void ragAddCrawlerResultsToDatasets(ondewo.nlu.Rag.RagAddCrawlerResultsToDatasetsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagAddCrawlerResultsToDatasetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove previously imported crawler output from one or more datasets.
     * </pre>
     */
    default void ragRemoveCrawlerResultsFromDatasets(ondewo.nlu.Rag.RagRemoveCrawlerResultsFromDatasetsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagRemoveCrawlerResultsFromDatasetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get datasets currently attached to a crawler.
     * </pre>
     */
    default void ragGetCrawlerAttachedDatasets(ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagGetCrawlerAttachedDatasetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete multiple crawlers.
     * </pre>
     */
    default void ragDeleteCrawlers(ondewo.nlu.Rag.RagDeleteCrawlersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDeleteCrawlersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagDeleteCrawlersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get crawler run logs.
     * </pre>
     */
    default void ragGetCrawlerRunLogs(ondewo.nlu.Rag.RagGetCrawlerRunLogsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagGetCrawlerRunLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRagGetCrawlerRunLogsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Rags.
   * <pre>
   * Provides RAG and web crawler endpoints.
   * Most of the RAG related endpoints largely mirror &lt;a href="https://github.com/ondewo/ragflow"&gt;RAGFlow's&lt;/a&gt; HTTP API endpoints. For more information on RAGFlow refer to the &lt;a href="https://ragflow.io/docs/dev/"&gt;official documentation&lt;/a&gt;
   * </pre>
   */
  public static abstract class RagsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RagsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Rags.
   * <pre>
   * Provides RAG and web crawler endpoints.
   * Most of the RAG related endpoints largely mirror &lt;a href="https://github.com/ondewo/ragflow"&gt;RAGFlow's&lt;/a&gt; HTTP API endpoints. For more information on RAGFlow refer to the &lt;a href="https://ragflow.io/docs/dev/"&gt;official documentation&lt;/a&gt;
   * </pre>
   */
  public static final class RagsStub
      extends io.grpc.stub.AbstractAsyncStub<RagsStub> {
    private RagsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RagsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RagsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new dataset (knowledge base).&lt;br&gt;
     * </pre>
     */
    public void ragCreateDataset(ondewo.nlu.Rag.RagCreateDatasetRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDataset> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagCreateDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an existing dataset's configuration.&lt;br&gt;
     * </pre>
     */
    public void ragUpdateDataset(ondewo.nlu.Rag.RagUpdateDatasetRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDataset> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagUpdateDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete one or more datasets (batch operation).&lt;br&gt;
     * If ids is null or empty, deletes all user's datasets.&lt;br&gt;
     * Deletes all associated documents, files, and chunks.
     * </pre>
     */
    public void ragDeleteDatasets(ondewo.nlu.Rag.RagDeleteRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagPartialSuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagDeleteDatasetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List datasets with pagination and filtering.&lt;br&gt;
     * Returns datasets from all tenants the user has access to.
     * </pre>
     */
    public void ragListDatasets(ondewo.nlu.Rag.RagListDatasetsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDatasetList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagListDatasetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Uploads a document to a dataset and starts parsing it.&lt;br&gt;
     * If the &lt;code&gt;run&lt;/code&gt; field of the returned document is not &lt;code&gt;RAG_DOCUMENT_STATUS_RUNNING&lt;/code&gt; this indicates a failure to start parsing the document.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagUploadDocumentRequest> ragUploadDocument(
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDocument> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getRagUploadDocumentMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Update document metadata and configuration.&lt;br&gt;
     * If the chunk method is changed, the document is automatically re-parsed.&lt;br&gt;
     * If the &lt;code&gt;run&lt;/code&gt; field of the returned document is not &lt;code&gt;RAG_DOCUMENT_STATUS_RUNNING&lt;/code&gt; this indicates a failure to start parsing the document.
     * </pre>
     */
    public void ragUpdateDocument(ondewo.nlu.Rag.RagUpdateDocumentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDocument> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagUpdateDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download the original document file.&lt;br&gt;
     * Returns binary file stream from storage.&lt;br&gt;
     * First chunk contains metadata, subsequent chunks only contain data.
     * </pre>
     */
    public void ragDownloadDocument(ondewo.nlu.Rag.RagDownloadDocumentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagFileChunk> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getRagDownloadDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List documents in a dataset with pagination and filtering.&lt;br&gt;
     * Supports time range filtering and keyword search.
     * </pre>
     */
    public void ragListDocuments(ondewo.nlu.Rag.RagListDocumentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDocumentList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagListDocumentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete one or more documents from a dataset (batch operation).&lt;br&gt;
     * If ids empty, deletes all documents. Removes chunks and storage files.
     * </pre>
     */
    public void ragDeleteDocuments(ondewo.nlu.Rag.RagDeleteDocumentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagPartialSuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagDeleteDocumentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve chunks using vector similarity search.&lt;br&gt;
     * Supports reranking, metadata filtering, and knowledge graph retrieval.
     * </pre>
     */
    public void ragRetrieval(ondewo.nlu.Rag.RagRetrievalRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagRetrievalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagRetrievalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start parsing documents into chunks.&lt;br&gt;
     * Queues documents for background processing.
     * </pre>
     */
    public void ragParseDocuments(ondewo.nlu.Rag.RagDocumentIdsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagPartialSuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagParseDocumentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop parsing documents.
     * </pre>
     */
    public void ragStopParsing(ondewo.nlu.Rag.RagDocumentIdsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagPartialSuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagStopParsingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a rag crawler for a dataset of an agent.
     * </pre>
     */
    public void ragCreateCrawler(ondewo.nlu.Rag.RagCreateCrawlerRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagCrawler> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagCreateCrawlerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a rag crawler by resource name.
     * </pre>
     */
    public void ragGetCrawler(ondewo.nlu.Rag.RagGetCrawlerRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagCrawler> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagGetCrawlerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List rag crawlers of a dataset for the specified agent.
     * </pre>
     */
    public void ragListCrawlers(ondewo.nlu.Rag.RagListCrawlersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagListCrawlersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagListCrawlersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a rag crawler (partial update of configuration fields).
     * </pre>
     */
    public void ragUpdateCrawler(ondewo.nlu.Rag.RagUpdateCrawlerRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagCrawler> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagUpdateCrawlerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a rag crawler of a dataset for the specified agent.
     * </pre>
     */
    public void ragDeleteCrawler(ondewo.nlu.Rag.RagDeleteCrawlerRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDeleteCrawlerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagDeleteCrawlerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Run a crawler.
     * </pre>
     */
    public void ragStartCrawler(ondewo.nlu.Rag.RagStartCrawlerRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagStartCrawlerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop a pending or running crawler run.
     * </pre>
     */
    public void ragStopCrawler(ondewo.nlu.Rag.RagStopCrawlerRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagStopCrawlerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagStopCrawlerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a crawler run by resource name.
     * </pre>
     */
    public void ragGetCrawlerRun(ondewo.nlu.Rag.RagGetCrawlerRunRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagGetCrawlerRunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List crawler runs for a crawler.
     * </pre>
     */
    public void ragListCrawlerRuns(ondewo.nlu.Rag.RagListCrawlerRunsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagListCrawlerRunsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagListCrawlerRunsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete crawler runs by explicit run names and/or crawler names.
     * </pre>
     */
    public void ragDeleteCrawlerRuns(ondewo.nlu.Rag.RagDeleteCrawlerRunsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDeleteCrawlerRunsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagDeleteCrawlerRunsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a single crawler result by crawler run resource name and URL.
     * </pre>
     */
    public void ragGetCrawlerResult(ondewo.nlu.Rag.RagGetCrawlerResultRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagCrawlerResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagGetCrawlerResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get crawler results by crawler run resource name.
     * </pre>
     */
    public void ragGetCrawlerResults(ondewo.nlu.Rag.RagGetCrawlerResultsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagGetCrawlerResultsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagGetCrawlerResultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add rag crawler output to one or more datasets.
     * </pre>
     */
    public void ragAddCrawlerResultsToDatasets(ondewo.nlu.Rag.RagAddCrawlerResultsToDatasetsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagAddCrawlerResultsToDatasetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove previously imported crawler output from one or more datasets.
     * </pre>
     */
    public void ragRemoveCrawlerResultsFromDatasets(ondewo.nlu.Rag.RagRemoveCrawlerResultsFromDatasetsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagRemoveCrawlerResultsFromDatasetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get datasets currently attached to a crawler.
     * </pre>
     */
    public void ragGetCrawlerAttachedDatasets(ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagGetCrawlerAttachedDatasetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete multiple crawlers.
     * </pre>
     */
    public void ragDeleteCrawlers(ondewo.nlu.Rag.RagDeleteCrawlersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDeleteCrawlersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagDeleteCrawlersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get crawler run logs.
     * </pre>
     */
    public void ragGetCrawlerRunLogs(ondewo.nlu.Rag.RagGetCrawlerRunLogsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagGetCrawlerRunLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRagGetCrawlerRunLogsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Rags.
   * <pre>
   * Provides RAG and web crawler endpoints.
   * Most of the RAG related endpoints largely mirror &lt;a href="https://github.com/ondewo/ragflow"&gt;RAGFlow's&lt;/a&gt; HTTP API endpoints. For more information on RAGFlow refer to the &lt;a href="https://ragflow.io/docs/dev/"&gt;official documentation&lt;/a&gt;
   * </pre>
   */
  public static final class RagsBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<RagsBlockingV2Stub> {
    private RagsBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RagsBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RagsBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new dataset (knowledge base).&lt;br&gt;
     * </pre>
     */
    public ondewo.nlu.Rag.RagDataset ragCreateDataset(ondewo.nlu.Rag.RagCreateDatasetRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagCreateDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing dataset's configuration.&lt;br&gt;
     * </pre>
     */
    public ondewo.nlu.Rag.RagDataset ragUpdateDataset(ondewo.nlu.Rag.RagUpdateDatasetRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagUpdateDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete one or more datasets (batch operation).&lt;br&gt;
     * If ids is null or empty, deletes all user's datasets.&lt;br&gt;
     * Deletes all associated documents, files, and chunks.
     * </pre>
     */
    public ondewo.nlu.Rag.RagPartialSuccess ragDeleteDatasets(ondewo.nlu.Rag.RagDeleteRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagDeleteDatasetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List datasets with pagination and filtering.&lt;br&gt;
     * Returns datasets from all tenants the user has access to.
     * </pre>
     */
    public ondewo.nlu.Rag.RagDatasetList ragListDatasets(ondewo.nlu.Rag.RagListDatasetsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagListDatasetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Uploads a document to a dataset and starts parsing it.&lt;br&gt;
     * If the &lt;code&gt;run&lt;/code&gt; field of the returned document is not &lt;code&gt;RAG_DOCUMENT_STATUS_RUNNING&lt;/code&gt; this indicates a failure to start parsing the document.
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<ondewo.nlu.Rag.RagUploadDocumentRequest, ondewo.nlu.Rag.RagDocument>
        ragUploadDocument() {
      return io.grpc.stub.ClientCalls.blockingClientStreamingCall(
          getChannel(), getRagUploadDocumentMethod(), getCallOptions());
    }

    /**
     * <pre>
     * Update document metadata and configuration.&lt;br&gt;
     * If the chunk method is changed, the document is automatically re-parsed.&lt;br&gt;
     * If the &lt;code&gt;run&lt;/code&gt; field of the returned document is not &lt;code&gt;RAG_DOCUMENT_STATUS_RUNNING&lt;/code&gt; this indicates a failure to start parsing the document.
     * </pre>
     */
    public ondewo.nlu.Rag.RagDocument ragUpdateDocument(ondewo.nlu.Rag.RagUpdateDocumentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagUpdateDocumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download the original document file.&lt;br&gt;
     * Returns binary file stream from storage.&lt;br&gt;
     * First chunk contains metadata, subsequent chunks only contain data.
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, ondewo.nlu.Rag.RagFileChunk>
        ragDownloadDocument(ondewo.nlu.Rag.RagDownloadDocumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getRagDownloadDocumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List documents in a dataset with pagination and filtering.&lt;br&gt;
     * Supports time range filtering and keyword search.
     * </pre>
     */
    public ondewo.nlu.Rag.RagDocumentList ragListDocuments(ondewo.nlu.Rag.RagListDocumentsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagListDocumentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete one or more documents from a dataset (batch operation).&lt;br&gt;
     * If ids empty, deletes all documents. Removes chunks and storage files.
     * </pre>
     */
    public ondewo.nlu.Rag.RagPartialSuccess ragDeleteDocuments(ondewo.nlu.Rag.RagDeleteDocumentsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagDeleteDocumentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve chunks using vector similarity search.&lt;br&gt;
     * Supports reranking, metadata filtering, and knowledge graph retrieval.
     * </pre>
     */
    public ondewo.nlu.Rag.RagRetrievalResponse ragRetrieval(ondewo.nlu.Rag.RagRetrievalRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagRetrievalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start parsing documents into chunks.&lt;br&gt;
     * Queues documents for background processing.
     * </pre>
     */
    public ondewo.nlu.Rag.RagPartialSuccess ragParseDocuments(ondewo.nlu.Rag.RagDocumentIdsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagParseDocumentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop parsing documents.
     * </pre>
     */
    public ondewo.nlu.Rag.RagPartialSuccess ragStopParsing(ondewo.nlu.Rag.RagDocumentIdsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagStopParsingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a rag crawler for a dataset of an agent.
     * </pre>
     */
    public ondewo.nlu.Rag.RagCrawler ragCreateCrawler(ondewo.nlu.Rag.RagCreateCrawlerRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagCreateCrawlerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a rag crawler by resource name.
     * </pre>
     */
    public ondewo.nlu.Rag.RagCrawler ragGetCrawler(ondewo.nlu.Rag.RagGetCrawlerRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagGetCrawlerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List rag crawlers of a dataset for the specified agent.
     * </pre>
     */
    public ondewo.nlu.Rag.RagListCrawlersResponse ragListCrawlers(ondewo.nlu.Rag.RagListCrawlersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagListCrawlersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a rag crawler (partial update of configuration fields).
     * </pre>
     */
    public ondewo.nlu.Rag.RagCrawler ragUpdateCrawler(ondewo.nlu.Rag.RagUpdateCrawlerRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagUpdateCrawlerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a rag crawler of a dataset for the specified agent.
     * </pre>
     */
    public ondewo.nlu.Rag.RagDeleteCrawlerResponse ragDeleteCrawler(ondewo.nlu.Rag.RagDeleteCrawlerRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagDeleteCrawlerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Run a crawler.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation ragStartCrawler(ondewo.nlu.Rag.RagStartCrawlerRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagStartCrawlerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop a pending or running crawler run.
     * </pre>
     */
    public ondewo.nlu.Rag.RagStopCrawlerResponse ragStopCrawler(ondewo.nlu.Rag.RagStopCrawlerRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagStopCrawlerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a crawler run by resource name.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation ragGetCrawlerRun(ondewo.nlu.Rag.RagGetCrawlerRunRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagGetCrawlerRunMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List crawler runs for a crawler.
     * </pre>
     */
    public ondewo.nlu.Rag.RagListCrawlerRunsResponse ragListCrawlerRuns(ondewo.nlu.Rag.RagListCrawlerRunsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagListCrawlerRunsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete crawler runs by explicit run names and/or crawler names.
     * </pre>
     */
    public ondewo.nlu.Rag.RagDeleteCrawlerRunsResponse ragDeleteCrawlerRuns(ondewo.nlu.Rag.RagDeleteCrawlerRunsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagDeleteCrawlerRunsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a single crawler result by crawler run resource name and URL.
     * </pre>
     */
    public ondewo.nlu.Rag.RagCrawlerResult ragGetCrawlerResult(ondewo.nlu.Rag.RagGetCrawlerResultRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagGetCrawlerResultMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get crawler results by crawler run resource name.
     * </pre>
     */
    public ondewo.nlu.Rag.RagGetCrawlerResultsResponse ragGetCrawlerResults(ondewo.nlu.Rag.RagGetCrawlerResultsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagGetCrawlerResultsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add rag crawler output to one or more datasets.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation ragAddCrawlerResultsToDatasets(ondewo.nlu.Rag.RagAddCrawlerResultsToDatasetsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagAddCrawlerResultsToDatasetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove previously imported crawler output from one or more datasets.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation ragRemoveCrawlerResultsFromDatasets(ondewo.nlu.Rag.RagRemoveCrawlerResultsFromDatasetsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagRemoveCrawlerResultsFromDatasetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get datasets currently attached to a crawler.
     * </pre>
     */
    public ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsResponse ragGetCrawlerAttachedDatasets(ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagGetCrawlerAttachedDatasetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete multiple crawlers.
     * </pre>
     */
    public ondewo.nlu.Rag.RagDeleteCrawlersResponse ragDeleteCrawlers(ondewo.nlu.Rag.RagDeleteCrawlersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagDeleteCrawlersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get crawler run logs.
     * </pre>
     */
    public ondewo.nlu.Rag.RagGetCrawlerRunLogsResponse ragGetCrawlerRunLogs(ondewo.nlu.Rag.RagGetCrawlerRunLogsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRagGetCrawlerRunLogsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Rags.
   * <pre>
   * Provides RAG and web crawler endpoints.
   * Most of the RAG related endpoints largely mirror &lt;a href="https://github.com/ondewo/ragflow"&gt;RAGFlow's&lt;/a&gt; HTTP API endpoints. For more information on RAGFlow refer to the &lt;a href="https://ragflow.io/docs/dev/"&gt;official documentation&lt;/a&gt;
   * </pre>
   */
  public static final class RagsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RagsBlockingStub> {
    private RagsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RagsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RagsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new dataset (knowledge base).&lt;br&gt;
     * </pre>
     */
    public ondewo.nlu.Rag.RagDataset ragCreateDataset(ondewo.nlu.Rag.RagCreateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagCreateDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing dataset's configuration.&lt;br&gt;
     * </pre>
     */
    public ondewo.nlu.Rag.RagDataset ragUpdateDataset(ondewo.nlu.Rag.RagUpdateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagUpdateDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete one or more datasets (batch operation).&lt;br&gt;
     * If ids is null or empty, deletes all user's datasets.&lt;br&gt;
     * Deletes all associated documents, files, and chunks.
     * </pre>
     */
    public ondewo.nlu.Rag.RagPartialSuccess ragDeleteDatasets(ondewo.nlu.Rag.RagDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagDeleteDatasetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List datasets with pagination and filtering.&lt;br&gt;
     * Returns datasets from all tenants the user has access to.
     * </pre>
     */
    public ondewo.nlu.Rag.RagDatasetList ragListDatasets(ondewo.nlu.Rag.RagListDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagListDatasetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update document metadata and configuration.&lt;br&gt;
     * If the chunk method is changed, the document is automatically re-parsed.&lt;br&gt;
     * If the &lt;code&gt;run&lt;/code&gt; field of the returned document is not &lt;code&gt;RAG_DOCUMENT_STATUS_RUNNING&lt;/code&gt; this indicates a failure to start parsing the document.
     * </pre>
     */
    public ondewo.nlu.Rag.RagDocument ragUpdateDocument(ondewo.nlu.Rag.RagUpdateDocumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagUpdateDocumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download the original document file.&lt;br&gt;
     * Returns binary file stream from storage.&lt;br&gt;
     * First chunk contains metadata, subsequent chunks only contain data.
     * </pre>
     */
    public java.util.Iterator<ondewo.nlu.Rag.RagFileChunk> ragDownloadDocument(
        ondewo.nlu.Rag.RagDownloadDocumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getRagDownloadDocumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List documents in a dataset with pagination and filtering.&lt;br&gt;
     * Supports time range filtering and keyword search.
     * </pre>
     */
    public ondewo.nlu.Rag.RagDocumentList ragListDocuments(ondewo.nlu.Rag.RagListDocumentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagListDocumentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete one or more documents from a dataset (batch operation).&lt;br&gt;
     * If ids empty, deletes all documents. Removes chunks and storage files.
     * </pre>
     */
    public ondewo.nlu.Rag.RagPartialSuccess ragDeleteDocuments(ondewo.nlu.Rag.RagDeleteDocumentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagDeleteDocumentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve chunks using vector similarity search.&lt;br&gt;
     * Supports reranking, metadata filtering, and knowledge graph retrieval.
     * </pre>
     */
    public ondewo.nlu.Rag.RagRetrievalResponse ragRetrieval(ondewo.nlu.Rag.RagRetrievalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagRetrievalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start parsing documents into chunks.&lt;br&gt;
     * Queues documents for background processing.
     * </pre>
     */
    public ondewo.nlu.Rag.RagPartialSuccess ragParseDocuments(ondewo.nlu.Rag.RagDocumentIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagParseDocumentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop parsing documents.
     * </pre>
     */
    public ondewo.nlu.Rag.RagPartialSuccess ragStopParsing(ondewo.nlu.Rag.RagDocumentIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagStopParsingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a rag crawler for a dataset of an agent.
     * </pre>
     */
    public ondewo.nlu.Rag.RagCrawler ragCreateCrawler(ondewo.nlu.Rag.RagCreateCrawlerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagCreateCrawlerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a rag crawler by resource name.
     * </pre>
     */
    public ondewo.nlu.Rag.RagCrawler ragGetCrawler(ondewo.nlu.Rag.RagGetCrawlerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagGetCrawlerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List rag crawlers of a dataset for the specified agent.
     * </pre>
     */
    public ondewo.nlu.Rag.RagListCrawlersResponse ragListCrawlers(ondewo.nlu.Rag.RagListCrawlersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagListCrawlersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a rag crawler (partial update of configuration fields).
     * </pre>
     */
    public ondewo.nlu.Rag.RagCrawler ragUpdateCrawler(ondewo.nlu.Rag.RagUpdateCrawlerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagUpdateCrawlerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a rag crawler of a dataset for the specified agent.
     * </pre>
     */
    public ondewo.nlu.Rag.RagDeleteCrawlerResponse ragDeleteCrawler(ondewo.nlu.Rag.RagDeleteCrawlerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagDeleteCrawlerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Run a crawler.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation ragStartCrawler(ondewo.nlu.Rag.RagStartCrawlerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagStartCrawlerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop a pending or running crawler run.
     * </pre>
     */
    public ondewo.nlu.Rag.RagStopCrawlerResponse ragStopCrawler(ondewo.nlu.Rag.RagStopCrawlerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagStopCrawlerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a crawler run by resource name.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation ragGetCrawlerRun(ondewo.nlu.Rag.RagGetCrawlerRunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagGetCrawlerRunMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List crawler runs for a crawler.
     * </pre>
     */
    public ondewo.nlu.Rag.RagListCrawlerRunsResponse ragListCrawlerRuns(ondewo.nlu.Rag.RagListCrawlerRunsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagListCrawlerRunsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete crawler runs by explicit run names and/or crawler names.
     * </pre>
     */
    public ondewo.nlu.Rag.RagDeleteCrawlerRunsResponse ragDeleteCrawlerRuns(ondewo.nlu.Rag.RagDeleteCrawlerRunsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagDeleteCrawlerRunsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a single crawler result by crawler run resource name and URL.
     * </pre>
     */
    public ondewo.nlu.Rag.RagCrawlerResult ragGetCrawlerResult(ondewo.nlu.Rag.RagGetCrawlerResultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagGetCrawlerResultMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get crawler results by crawler run resource name.
     * </pre>
     */
    public ondewo.nlu.Rag.RagGetCrawlerResultsResponse ragGetCrawlerResults(ondewo.nlu.Rag.RagGetCrawlerResultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagGetCrawlerResultsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add rag crawler output to one or more datasets.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation ragAddCrawlerResultsToDatasets(ondewo.nlu.Rag.RagAddCrawlerResultsToDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagAddCrawlerResultsToDatasetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove previously imported crawler output from one or more datasets.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation ragRemoveCrawlerResultsFromDatasets(ondewo.nlu.Rag.RagRemoveCrawlerResultsFromDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagRemoveCrawlerResultsFromDatasetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get datasets currently attached to a crawler.
     * </pre>
     */
    public ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsResponse ragGetCrawlerAttachedDatasets(ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagGetCrawlerAttachedDatasetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete multiple crawlers.
     * </pre>
     */
    public ondewo.nlu.Rag.RagDeleteCrawlersResponse ragDeleteCrawlers(ondewo.nlu.Rag.RagDeleteCrawlersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagDeleteCrawlersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get crawler run logs.
     * </pre>
     */
    public ondewo.nlu.Rag.RagGetCrawlerRunLogsResponse ragGetCrawlerRunLogs(ondewo.nlu.Rag.RagGetCrawlerRunLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRagGetCrawlerRunLogsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Rags.
   * <pre>
   * Provides RAG and web crawler endpoints.
   * Most of the RAG related endpoints largely mirror &lt;a href="https://github.com/ondewo/ragflow"&gt;RAGFlow's&lt;/a&gt; HTTP API endpoints. For more information on RAGFlow refer to the &lt;a href="https://ragflow.io/docs/dev/"&gt;official documentation&lt;/a&gt;
   * </pre>
   */
  public static final class RagsFutureStub
      extends io.grpc.stub.AbstractFutureStub<RagsFutureStub> {
    private RagsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RagsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RagsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new dataset (knowledge base).&lt;br&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagDataset> ragCreateDataset(
        ondewo.nlu.Rag.RagCreateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagCreateDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an existing dataset's configuration.&lt;br&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagDataset> ragUpdateDataset(
        ondewo.nlu.Rag.RagUpdateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagUpdateDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete one or more datasets (batch operation).&lt;br&gt;
     * If ids is null or empty, deletes all user's datasets.&lt;br&gt;
     * Deletes all associated documents, files, and chunks.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagPartialSuccess> ragDeleteDatasets(
        ondewo.nlu.Rag.RagDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagDeleteDatasetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List datasets with pagination and filtering.&lt;br&gt;
     * Returns datasets from all tenants the user has access to.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagDatasetList> ragListDatasets(
        ondewo.nlu.Rag.RagListDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagListDatasetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update document metadata and configuration.&lt;br&gt;
     * If the chunk method is changed, the document is automatically re-parsed.&lt;br&gt;
     * If the &lt;code&gt;run&lt;/code&gt; field of the returned document is not &lt;code&gt;RAG_DOCUMENT_STATUS_RUNNING&lt;/code&gt; this indicates a failure to start parsing the document.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagDocument> ragUpdateDocument(
        ondewo.nlu.Rag.RagUpdateDocumentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagUpdateDocumentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List documents in a dataset with pagination and filtering.&lt;br&gt;
     * Supports time range filtering and keyword search.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagDocumentList> ragListDocuments(
        ondewo.nlu.Rag.RagListDocumentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagListDocumentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete one or more documents from a dataset (batch operation).&lt;br&gt;
     * If ids empty, deletes all documents. Removes chunks and storage files.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagPartialSuccess> ragDeleteDocuments(
        ondewo.nlu.Rag.RagDeleteDocumentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagDeleteDocumentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve chunks using vector similarity search.&lt;br&gt;
     * Supports reranking, metadata filtering, and knowledge graph retrieval.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagRetrievalResponse> ragRetrieval(
        ondewo.nlu.Rag.RagRetrievalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagRetrievalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start parsing documents into chunks.&lt;br&gt;
     * Queues documents for background processing.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagPartialSuccess> ragParseDocuments(
        ondewo.nlu.Rag.RagDocumentIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagParseDocumentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop parsing documents.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagPartialSuccess> ragStopParsing(
        ondewo.nlu.Rag.RagDocumentIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagStopParsingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a rag crawler for a dataset of an agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagCrawler> ragCreateCrawler(
        ondewo.nlu.Rag.RagCreateCrawlerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagCreateCrawlerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a rag crawler by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagCrawler> ragGetCrawler(
        ondewo.nlu.Rag.RagGetCrawlerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagGetCrawlerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List rag crawlers of a dataset for the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagListCrawlersResponse> ragListCrawlers(
        ondewo.nlu.Rag.RagListCrawlersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagListCrawlersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a rag crawler (partial update of configuration fields).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagCrawler> ragUpdateCrawler(
        ondewo.nlu.Rag.RagUpdateCrawlerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagUpdateCrawlerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a rag crawler of a dataset for the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagDeleteCrawlerResponse> ragDeleteCrawler(
        ondewo.nlu.Rag.RagDeleteCrawlerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagDeleteCrawlerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Run a crawler.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> ragStartCrawler(
        ondewo.nlu.Rag.RagStartCrawlerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagStartCrawlerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop a pending or running crawler run.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagStopCrawlerResponse> ragStopCrawler(
        ondewo.nlu.Rag.RagStopCrawlerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagStopCrawlerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a crawler run by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> ragGetCrawlerRun(
        ondewo.nlu.Rag.RagGetCrawlerRunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagGetCrawlerRunMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List crawler runs for a crawler.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagListCrawlerRunsResponse> ragListCrawlerRuns(
        ondewo.nlu.Rag.RagListCrawlerRunsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagListCrawlerRunsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete crawler runs by explicit run names and/or crawler names.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagDeleteCrawlerRunsResponse> ragDeleteCrawlerRuns(
        ondewo.nlu.Rag.RagDeleteCrawlerRunsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagDeleteCrawlerRunsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a single crawler result by crawler run resource name and URL.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagCrawlerResult> ragGetCrawlerResult(
        ondewo.nlu.Rag.RagGetCrawlerResultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagGetCrawlerResultMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get crawler results by crawler run resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagGetCrawlerResultsResponse> ragGetCrawlerResults(
        ondewo.nlu.Rag.RagGetCrawlerResultsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagGetCrawlerResultsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add rag crawler output to one or more datasets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> ragAddCrawlerResultsToDatasets(
        ondewo.nlu.Rag.RagAddCrawlerResultsToDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagAddCrawlerResultsToDatasetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove previously imported crawler output from one or more datasets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> ragRemoveCrawlerResultsFromDatasets(
        ondewo.nlu.Rag.RagRemoveCrawlerResultsFromDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagRemoveCrawlerResultsFromDatasetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get datasets currently attached to a crawler.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsResponse> ragGetCrawlerAttachedDatasets(
        ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagGetCrawlerAttachedDatasetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete multiple crawlers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagDeleteCrawlersResponse> ragDeleteCrawlers(
        ondewo.nlu.Rag.RagDeleteCrawlersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagDeleteCrawlersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get crawler run logs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.Rag.RagGetCrawlerRunLogsResponse> ragGetCrawlerRunLogs(
        ondewo.nlu.Rag.RagGetCrawlerRunLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRagGetCrawlerRunLogsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RAG_CREATE_DATASET = 0;
  private static final int METHODID_RAG_UPDATE_DATASET = 1;
  private static final int METHODID_RAG_DELETE_DATASETS = 2;
  private static final int METHODID_RAG_LIST_DATASETS = 3;
  private static final int METHODID_RAG_UPDATE_DOCUMENT = 4;
  private static final int METHODID_RAG_DOWNLOAD_DOCUMENT = 5;
  private static final int METHODID_RAG_LIST_DOCUMENTS = 6;
  private static final int METHODID_RAG_DELETE_DOCUMENTS = 7;
  private static final int METHODID_RAG_RETRIEVAL = 8;
  private static final int METHODID_RAG_PARSE_DOCUMENTS = 9;
  private static final int METHODID_RAG_STOP_PARSING = 10;
  private static final int METHODID_RAG_CREATE_CRAWLER = 11;
  private static final int METHODID_RAG_GET_CRAWLER = 12;
  private static final int METHODID_RAG_LIST_CRAWLERS = 13;
  private static final int METHODID_RAG_UPDATE_CRAWLER = 14;
  private static final int METHODID_RAG_DELETE_CRAWLER = 15;
  private static final int METHODID_RAG_START_CRAWLER = 16;
  private static final int METHODID_RAG_STOP_CRAWLER = 17;
  private static final int METHODID_RAG_GET_CRAWLER_RUN = 18;
  private static final int METHODID_RAG_LIST_CRAWLER_RUNS = 19;
  private static final int METHODID_RAG_DELETE_CRAWLER_RUNS = 20;
  private static final int METHODID_RAG_GET_CRAWLER_RESULT = 21;
  private static final int METHODID_RAG_GET_CRAWLER_RESULTS = 22;
  private static final int METHODID_RAG_ADD_CRAWLER_RESULTS_TO_DATASETS = 23;
  private static final int METHODID_RAG_REMOVE_CRAWLER_RESULTS_FROM_DATASETS = 24;
  private static final int METHODID_RAG_GET_CRAWLER_ATTACHED_DATASETS = 25;
  private static final int METHODID_RAG_DELETE_CRAWLERS = 26;
  private static final int METHODID_RAG_GET_CRAWLER_RUN_LOGS = 27;
  private static final int METHODID_RAG_UPLOAD_DOCUMENT = 28;

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
        case METHODID_RAG_CREATE_DATASET:
          serviceImpl.ragCreateDataset((ondewo.nlu.Rag.RagCreateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDataset>) responseObserver);
          break;
        case METHODID_RAG_UPDATE_DATASET:
          serviceImpl.ragUpdateDataset((ondewo.nlu.Rag.RagUpdateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDataset>) responseObserver);
          break;
        case METHODID_RAG_DELETE_DATASETS:
          serviceImpl.ragDeleteDatasets((ondewo.nlu.Rag.RagDeleteRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagPartialSuccess>) responseObserver);
          break;
        case METHODID_RAG_LIST_DATASETS:
          serviceImpl.ragListDatasets((ondewo.nlu.Rag.RagListDatasetsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDatasetList>) responseObserver);
          break;
        case METHODID_RAG_UPDATE_DOCUMENT:
          serviceImpl.ragUpdateDocument((ondewo.nlu.Rag.RagUpdateDocumentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDocument>) responseObserver);
          break;
        case METHODID_RAG_DOWNLOAD_DOCUMENT:
          serviceImpl.ragDownloadDocument((ondewo.nlu.Rag.RagDownloadDocumentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagFileChunk>) responseObserver);
          break;
        case METHODID_RAG_LIST_DOCUMENTS:
          serviceImpl.ragListDocuments((ondewo.nlu.Rag.RagListDocumentsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDocumentList>) responseObserver);
          break;
        case METHODID_RAG_DELETE_DOCUMENTS:
          serviceImpl.ragDeleteDocuments((ondewo.nlu.Rag.RagDeleteDocumentsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagPartialSuccess>) responseObserver);
          break;
        case METHODID_RAG_RETRIEVAL:
          serviceImpl.ragRetrieval((ondewo.nlu.Rag.RagRetrievalRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagRetrievalResponse>) responseObserver);
          break;
        case METHODID_RAG_PARSE_DOCUMENTS:
          serviceImpl.ragParseDocuments((ondewo.nlu.Rag.RagDocumentIdsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagPartialSuccess>) responseObserver);
          break;
        case METHODID_RAG_STOP_PARSING:
          serviceImpl.ragStopParsing((ondewo.nlu.Rag.RagDocumentIdsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagPartialSuccess>) responseObserver);
          break;
        case METHODID_RAG_CREATE_CRAWLER:
          serviceImpl.ragCreateCrawler((ondewo.nlu.Rag.RagCreateCrawlerRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagCrawler>) responseObserver);
          break;
        case METHODID_RAG_GET_CRAWLER:
          serviceImpl.ragGetCrawler((ondewo.nlu.Rag.RagGetCrawlerRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagCrawler>) responseObserver);
          break;
        case METHODID_RAG_LIST_CRAWLERS:
          serviceImpl.ragListCrawlers((ondewo.nlu.Rag.RagListCrawlersRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagListCrawlersResponse>) responseObserver);
          break;
        case METHODID_RAG_UPDATE_CRAWLER:
          serviceImpl.ragUpdateCrawler((ondewo.nlu.Rag.RagUpdateCrawlerRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagCrawler>) responseObserver);
          break;
        case METHODID_RAG_DELETE_CRAWLER:
          serviceImpl.ragDeleteCrawler((ondewo.nlu.Rag.RagDeleteCrawlerRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDeleteCrawlerResponse>) responseObserver);
          break;
        case METHODID_RAG_START_CRAWLER:
          serviceImpl.ragStartCrawler((ondewo.nlu.Rag.RagStartCrawlerRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RAG_STOP_CRAWLER:
          serviceImpl.ragStopCrawler((ondewo.nlu.Rag.RagStopCrawlerRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagStopCrawlerResponse>) responseObserver);
          break;
        case METHODID_RAG_GET_CRAWLER_RUN:
          serviceImpl.ragGetCrawlerRun((ondewo.nlu.Rag.RagGetCrawlerRunRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RAG_LIST_CRAWLER_RUNS:
          serviceImpl.ragListCrawlerRuns((ondewo.nlu.Rag.RagListCrawlerRunsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagListCrawlerRunsResponse>) responseObserver);
          break;
        case METHODID_RAG_DELETE_CRAWLER_RUNS:
          serviceImpl.ragDeleteCrawlerRuns((ondewo.nlu.Rag.RagDeleteCrawlerRunsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDeleteCrawlerRunsResponse>) responseObserver);
          break;
        case METHODID_RAG_GET_CRAWLER_RESULT:
          serviceImpl.ragGetCrawlerResult((ondewo.nlu.Rag.RagGetCrawlerResultRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagCrawlerResult>) responseObserver);
          break;
        case METHODID_RAG_GET_CRAWLER_RESULTS:
          serviceImpl.ragGetCrawlerResults((ondewo.nlu.Rag.RagGetCrawlerResultsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagGetCrawlerResultsResponse>) responseObserver);
          break;
        case METHODID_RAG_ADD_CRAWLER_RESULTS_TO_DATASETS:
          serviceImpl.ragAddCrawlerResultsToDatasets((ondewo.nlu.Rag.RagAddCrawlerResultsToDatasetsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RAG_REMOVE_CRAWLER_RESULTS_FROM_DATASETS:
          serviceImpl.ragRemoveCrawlerResultsFromDatasets((ondewo.nlu.Rag.RagRemoveCrawlerResultsFromDatasetsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RAG_GET_CRAWLER_ATTACHED_DATASETS:
          serviceImpl.ragGetCrawlerAttachedDatasets((ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsResponse>) responseObserver);
          break;
        case METHODID_RAG_DELETE_CRAWLERS:
          serviceImpl.ragDeleteCrawlers((ondewo.nlu.Rag.RagDeleteCrawlersRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDeleteCrawlersResponse>) responseObserver);
          break;
        case METHODID_RAG_GET_CRAWLER_RUN_LOGS:
          serviceImpl.ragGetCrawlerRunLogs((ondewo.nlu.Rag.RagGetCrawlerRunLogsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagGetCrawlerRunLogsResponse>) responseObserver);
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
        case METHODID_RAG_UPLOAD_DOCUMENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.ragUploadDocument(
              (io.grpc.stub.StreamObserver<ondewo.nlu.Rag.RagDocument>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRagCreateDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagCreateDatasetRequest,
              ondewo.nlu.Rag.RagDataset>(
                service, METHODID_RAG_CREATE_DATASET)))
        .addMethod(
          getRagUpdateDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagUpdateDatasetRequest,
              ondewo.nlu.Rag.RagDataset>(
                service, METHODID_RAG_UPDATE_DATASET)))
        .addMethod(
          getRagDeleteDatasetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagDeleteRequest,
              ondewo.nlu.Rag.RagPartialSuccess>(
                service, METHODID_RAG_DELETE_DATASETS)))
        .addMethod(
          getRagListDatasetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagListDatasetsRequest,
              ondewo.nlu.Rag.RagDatasetList>(
                service, METHODID_RAG_LIST_DATASETS)))
        .addMethod(
          getRagUploadDocumentMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagUploadDocumentRequest,
              ondewo.nlu.Rag.RagDocument>(
                service, METHODID_RAG_UPLOAD_DOCUMENT)))
        .addMethod(
          getRagUpdateDocumentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagUpdateDocumentRequest,
              ondewo.nlu.Rag.RagDocument>(
                service, METHODID_RAG_UPDATE_DOCUMENT)))
        .addMethod(
          getRagDownloadDocumentMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagDownloadDocumentRequest,
              ondewo.nlu.Rag.RagFileChunk>(
                service, METHODID_RAG_DOWNLOAD_DOCUMENT)))
        .addMethod(
          getRagListDocumentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagListDocumentsRequest,
              ondewo.nlu.Rag.RagDocumentList>(
                service, METHODID_RAG_LIST_DOCUMENTS)))
        .addMethod(
          getRagDeleteDocumentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagDeleteDocumentsRequest,
              ondewo.nlu.Rag.RagPartialSuccess>(
                service, METHODID_RAG_DELETE_DOCUMENTS)))
        .addMethod(
          getRagRetrievalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagRetrievalRequest,
              ondewo.nlu.Rag.RagRetrievalResponse>(
                service, METHODID_RAG_RETRIEVAL)))
        .addMethod(
          getRagParseDocumentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagDocumentIdsRequest,
              ondewo.nlu.Rag.RagPartialSuccess>(
                service, METHODID_RAG_PARSE_DOCUMENTS)))
        .addMethod(
          getRagStopParsingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagDocumentIdsRequest,
              ondewo.nlu.Rag.RagPartialSuccess>(
                service, METHODID_RAG_STOP_PARSING)))
        .addMethod(
          getRagCreateCrawlerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagCreateCrawlerRequest,
              ondewo.nlu.Rag.RagCrawler>(
                service, METHODID_RAG_CREATE_CRAWLER)))
        .addMethod(
          getRagGetCrawlerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagGetCrawlerRequest,
              ondewo.nlu.Rag.RagCrawler>(
                service, METHODID_RAG_GET_CRAWLER)))
        .addMethod(
          getRagListCrawlersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagListCrawlersRequest,
              ondewo.nlu.Rag.RagListCrawlersResponse>(
                service, METHODID_RAG_LIST_CRAWLERS)))
        .addMethod(
          getRagUpdateCrawlerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagUpdateCrawlerRequest,
              ondewo.nlu.Rag.RagCrawler>(
                service, METHODID_RAG_UPDATE_CRAWLER)))
        .addMethod(
          getRagDeleteCrawlerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagDeleteCrawlerRequest,
              ondewo.nlu.Rag.RagDeleteCrawlerResponse>(
                service, METHODID_RAG_DELETE_CRAWLER)))
        .addMethod(
          getRagStartCrawlerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagStartCrawlerRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_RAG_START_CRAWLER)))
        .addMethod(
          getRagStopCrawlerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagStopCrawlerRequest,
              ondewo.nlu.Rag.RagStopCrawlerResponse>(
                service, METHODID_RAG_STOP_CRAWLER)))
        .addMethod(
          getRagGetCrawlerRunMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagGetCrawlerRunRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_RAG_GET_CRAWLER_RUN)))
        .addMethod(
          getRagListCrawlerRunsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagListCrawlerRunsRequest,
              ondewo.nlu.Rag.RagListCrawlerRunsResponse>(
                service, METHODID_RAG_LIST_CRAWLER_RUNS)))
        .addMethod(
          getRagDeleteCrawlerRunsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagDeleteCrawlerRunsRequest,
              ondewo.nlu.Rag.RagDeleteCrawlerRunsResponse>(
                service, METHODID_RAG_DELETE_CRAWLER_RUNS)))
        .addMethod(
          getRagGetCrawlerResultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagGetCrawlerResultRequest,
              ondewo.nlu.Rag.RagCrawlerResult>(
                service, METHODID_RAG_GET_CRAWLER_RESULT)))
        .addMethod(
          getRagGetCrawlerResultsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagGetCrawlerResultsRequest,
              ondewo.nlu.Rag.RagGetCrawlerResultsResponse>(
                service, METHODID_RAG_GET_CRAWLER_RESULTS)))
        .addMethod(
          getRagAddCrawlerResultsToDatasetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagAddCrawlerResultsToDatasetsRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_RAG_ADD_CRAWLER_RESULTS_TO_DATASETS)))
        .addMethod(
          getRagRemoveCrawlerResultsFromDatasetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagRemoveCrawlerResultsFromDatasetsRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_RAG_REMOVE_CRAWLER_RESULTS_FROM_DATASETS)))
        .addMethod(
          getRagGetCrawlerAttachedDatasetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsRequest,
              ondewo.nlu.Rag.RagGetCrawlerAttachedDatasetsResponse>(
                service, METHODID_RAG_GET_CRAWLER_ATTACHED_DATASETS)))
        .addMethod(
          getRagDeleteCrawlersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagDeleteCrawlersRequest,
              ondewo.nlu.Rag.RagDeleteCrawlersResponse>(
                service, METHODID_RAG_DELETE_CRAWLERS)))
        .addMethod(
          getRagGetCrawlerRunLogsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.Rag.RagGetCrawlerRunLogsRequest,
              ondewo.nlu.Rag.RagGetCrawlerRunLogsResponse>(
                service, METHODID_RAG_GET_CRAWLER_RUN_LOGS)))
        .build();
  }

  private static abstract class RagsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RagsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ondewo.nlu.Rag.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Rags");
    }
  }

  private static final class RagsFileDescriptorSupplier
      extends RagsBaseDescriptorSupplier {
    RagsFileDescriptorSupplier() {}
  }

  private static final class RagsMethodDescriptorSupplier
      extends RagsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RagsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RagsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RagsFileDescriptorSupplier())
              .addMethod(getRagCreateDatasetMethod())
              .addMethod(getRagUpdateDatasetMethod())
              .addMethod(getRagDeleteDatasetsMethod())
              .addMethod(getRagListDatasetsMethod())
              .addMethod(getRagUploadDocumentMethod())
              .addMethod(getRagUpdateDocumentMethod())
              .addMethod(getRagDownloadDocumentMethod())
              .addMethod(getRagListDocumentsMethod())
              .addMethod(getRagDeleteDocumentsMethod())
              .addMethod(getRagRetrievalMethod())
              .addMethod(getRagParseDocumentsMethod())
              .addMethod(getRagStopParsingMethod())
              .addMethod(getRagCreateCrawlerMethod())
              .addMethod(getRagGetCrawlerMethod())
              .addMethod(getRagListCrawlersMethod())
              .addMethod(getRagUpdateCrawlerMethod())
              .addMethod(getRagDeleteCrawlerMethod())
              .addMethod(getRagStartCrawlerMethod())
              .addMethod(getRagStopCrawlerMethod())
              .addMethod(getRagGetCrawlerRunMethod())
              .addMethod(getRagListCrawlerRunsMethod())
              .addMethod(getRagDeleteCrawlerRunsMethod())
              .addMethod(getRagGetCrawlerResultMethod())
              .addMethod(getRagGetCrawlerResultsMethod())
              .addMethod(getRagAddCrawlerResultsToDatasetsMethod())
              .addMethod(getRagRemoveCrawlerResultsFromDatasetsMethod())
              .addMethod(getRagGetCrawlerAttachedDatasetsMethod())
              .addMethod(getRagDeleteCrawlersMethod())
              .addMethod(getRagGetCrawlerRunLogsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
