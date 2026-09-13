package com.ondewo.nlu;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Entities are extracted from user input and represent parameters that are meaningful to your application. For example, a date range, a proper name such as a geographic location or landmark, and so on. Entities represent actionable data for your application.
 * When you define an entity, you can also include synonyms that all map to that entity. For example, &amp;quot;soft drink&amp;quot;, &amp;quot;soda&amp;quot;, &amp;quot;pop&amp;quot;, and so on.
 * There are three types of entities:
 * &lt;ul&gt;
 *   &lt;li&gt;&lt;strong&gt;System&lt;/strong&gt; - entities that are defined by the Dialogflow API for common data types such as date, time, currency, and so on. A system entity is represented by the &lt;code&gt;EntityType&lt;/code&gt; type.&lt;/li&gt;
 *   &lt;li&gt;&lt;strong&gt;Developer&lt;/strong&gt; - entities that are defined by you that represent actionable data that is meaningful to your application. For example, you could define a &lt;code&gt;pizza.sauce&lt;/code&gt; entity for red or white pizza sauce, a &lt;code&gt;pizza.cheese&lt;/code&gt; entity for the different types of cheese on a pizza, a &lt;code&gt;pizza.topping&lt;/code&gt; entity for different toppings, and so on. A developer entity is represented by the &lt;code&gt;EntityType&lt;/code&gt; type.&lt;/li&gt;
 *   &lt;li&gt;&lt;strong&gt;User&lt;/strong&gt; - entities that are built for an individual user such as favorites, preferences, playlists, and so on. A user entity is represented by the &lt;a href="index.html#ondewo.nlu.SessionEntityType"&gt;SessionEntityType&lt;/a&gt; type.&lt;/li&gt;
 * &lt;/ul&gt;
 * For more information about entity types, see the &lt;a href="https://dialogflow.com/docs/entities"&gt;Dialogflow documentation&lt;/a&gt;.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class EntityTypesGrpc {

  private EntityTypesGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.nlu.EntityTypes";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListEntityTypesRequest,
      com.ondewo.nlu.ListEntityTypesResponse> getListEntityTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEntityTypes",
      requestType = com.ondewo.nlu.ListEntityTypesRequest.class,
      responseType = com.ondewo.nlu.ListEntityTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListEntityTypesRequest,
      com.ondewo.nlu.ListEntityTypesResponse> getListEntityTypesMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListEntityTypesRequest, com.ondewo.nlu.ListEntityTypesResponse> getListEntityTypesMethod;
    if ((getListEntityTypesMethod = EntityTypesGrpc.getListEntityTypesMethod) == null) {
      synchronized (EntityTypesGrpc.class) {
        if ((getListEntityTypesMethod = EntityTypesGrpc.getListEntityTypesMethod) == null) {
          EntityTypesGrpc.getListEntityTypesMethod = getListEntityTypesMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListEntityTypesRequest, com.ondewo.nlu.ListEntityTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEntityTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListEntityTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListEntityTypesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EntityTypesMethodDescriptorSupplier("ListEntityTypes"))
              .build();
        }
      }
    }
    return getListEntityTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.GetEntityTypeRequest,
      com.ondewo.nlu.EntityType> getGetEntityTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEntityType",
      requestType = com.ondewo.nlu.GetEntityTypeRequest.class,
      responseType = com.ondewo.nlu.EntityType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.GetEntityTypeRequest,
      com.ondewo.nlu.EntityType> getGetEntityTypeMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.GetEntityTypeRequest, com.ondewo.nlu.EntityType> getGetEntityTypeMethod;
    if ((getGetEntityTypeMethod = EntityTypesGrpc.getGetEntityTypeMethod) == null) {
      synchronized (EntityTypesGrpc.class) {
        if ((getGetEntityTypeMethod = EntityTypesGrpc.getGetEntityTypeMethod) == null) {
          EntityTypesGrpc.getGetEntityTypeMethod = getGetEntityTypeMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.GetEntityTypeRequest, com.ondewo.nlu.EntityType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEntityType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.GetEntityTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.EntityType.getDefaultInstance()))
              .setSchemaDescriptor(new EntityTypesMethodDescriptorSupplier("GetEntityType"))
              .build();
        }
      }
    }
    return getGetEntityTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.CreateEntityTypeRequest,
      com.ondewo.nlu.EntityType> getCreateEntityTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEntityType",
      requestType = com.ondewo.nlu.CreateEntityTypeRequest.class,
      responseType = com.ondewo.nlu.EntityType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.CreateEntityTypeRequest,
      com.ondewo.nlu.EntityType> getCreateEntityTypeMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.CreateEntityTypeRequest, com.ondewo.nlu.EntityType> getCreateEntityTypeMethod;
    if ((getCreateEntityTypeMethod = EntityTypesGrpc.getCreateEntityTypeMethod) == null) {
      synchronized (EntityTypesGrpc.class) {
        if ((getCreateEntityTypeMethod = EntityTypesGrpc.getCreateEntityTypeMethod) == null) {
          EntityTypesGrpc.getCreateEntityTypeMethod = getCreateEntityTypeMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.CreateEntityTypeRequest, com.ondewo.nlu.EntityType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEntityType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.CreateEntityTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.EntityType.getDefaultInstance()))
              .setSchemaDescriptor(new EntityTypesMethodDescriptorSupplier("CreateEntityType"))
              .build();
        }
      }
    }
    return getCreateEntityTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.UpdateEntityTypeRequest,
      com.ondewo.nlu.EntityType> getUpdateEntityTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEntityType",
      requestType = com.ondewo.nlu.UpdateEntityTypeRequest.class,
      responseType = com.ondewo.nlu.EntityType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.UpdateEntityTypeRequest,
      com.ondewo.nlu.EntityType> getUpdateEntityTypeMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.UpdateEntityTypeRequest, com.ondewo.nlu.EntityType> getUpdateEntityTypeMethod;
    if ((getUpdateEntityTypeMethod = EntityTypesGrpc.getUpdateEntityTypeMethod) == null) {
      synchronized (EntityTypesGrpc.class) {
        if ((getUpdateEntityTypeMethod = EntityTypesGrpc.getUpdateEntityTypeMethod) == null) {
          EntityTypesGrpc.getUpdateEntityTypeMethod = getUpdateEntityTypeMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.UpdateEntityTypeRequest, com.ondewo.nlu.EntityType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEntityType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.UpdateEntityTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.EntityType.getDefaultInstance()))
              .setSchemaDescriptor(new EntityTypesMethodDescriptorSupplier("UpdateEntityType"))
              .build();
        }
      }
    }
    return getUpdateEntityTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteEntityTypeRequest,
      com.google.protobuf.Empty> getDeleteEntityTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEntityType",
      requestType = com.ondewo.nlu.DeleteEntityTypeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteEntityTypeRequest,
      com.google.protobuf.Empty> getDeleteEntityTypeMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteEntityTypeRequest, com.google.protobuf.Empty> getDeleteEntityTypeMethod;
    if ((getDeleteEntityTypeMethod = EntityTypesGrpc.getDeleteEntityTypeMethod) == null) {
      synchronized (EntityTypesGrpc.class) {
        if ((getDeleteEntityTypeMethod = EntityTypesGrpc.getDeleteEntityTypeMethod) == null) {
          EntityTypesGrpc.getDeleteEntityTypeMethod = getDeleteEntityTypeMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.DeleteEntityTypeRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEntityType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.DeleteEntityTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EntityTypesMethodDescriptorSupplier("DeleteEntityType"))
              .build();
        }
      }
    }
    return getDeleteEntityTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.BatchUpdateEntityTypesRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getBatchUpdateEntityTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchUpdateEntityTypes",
      requestType = com.ondewo.nlu.BatchUpdateEntityTypesRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.BatchUpdateEntityTypesRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getBatchUpdateEntityTypesMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.BatchUpdateEntityTypesRequest, ondewo.nlu.OperationsOuterClass.Operation> getBatchUpdateEntityTypesMethod;
    if ((getBatchUpdateEntityTypesMethod = EntityTypesGrpc.getBatchUpdateEntityTypesMethod) == null) {
      synchronized (EntityTypesGrpc.class) {
        if ((getBatchUpdateEntityTypesMethod = EntityTypesGrpc.getBatchUpdateEntityTypesMethod) == null) {
          EntityTypesGrpc.getBatchUpdateEntityTypesMethod = getBatchUpdateEntityTypesMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.BatchUpdateEntityTypesRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchUpdateEntityTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.BatchUpdateEntityTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new EntityTypesMethodDescriptorSupplier("BatchUpdateEntityTypes"))
              .build();
        }
      }
    }
    return getBatchUpdateEntityTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.BatchDeleteEntityTypesRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getBatchDeleteEntityTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchDeleteEntityTypes",
      requestType = com.ondewo.nlu.BatchDeleteEntityTypesRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.BatchDeleteEntityTypesRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getBatchDeleteEntityTypesMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.BatchDeleteEntityTypesRequest, ondewo.nlu.OperationsOuterClass.Operation> getBatchDeleteEntityTypesMethod;
    if ((getBatchDeleteEntityTypesMethod = EntityTypesGrpc.getBatchDeleteEntityTypesMethod) == null) {
      synchronized (EntityTypesGrpc.class) {
        if ((getBatchDeleteEntityTypesMethod = EntityTypesGrpc.getBatchDeleteEntityTypesMethod) == null) {
          EntityTypesGrpc.getBatchDeleteEntityTypesMethod = getBatchDeleteEntityTypesMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.BatchDeleteEntityTypesRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchDeleteEntityTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.BatchDeleteEntityTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new EntityTypesMethodDescriptorSupplier("BatchDeleteEntityTypes"))
              .build();
        }
      }
    }
    return getBatchDeleteEntityTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.GetEntityRequest,
      com.ondewo.nlu.EntityType.Entity> getGetEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEntity",
      requestType = com.ondewo.nlu.GetEntityRequest.class,
      responseType = com.ondewo.nlu.EntityType.Entity.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.GetEntityRequest,
      com.ondewo.nlu.EntityType.Entity> getGetEntityMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.GetEntityRequest, com.ondewo.nlu.EntityType.Entity> getGetEntityMethod;
    if ((getGetEntityMethod = EntityTypesGrpc.getGetEntityMethod) == null) {
      synchronized (EntityTypesGrpc.class) {
        if ((getGetEntityMethod = EntityTypesGrpc.getGetEntityMethod) == null) {
          EntityTypesGrpc.getGetEntityMethod = getGetEntityMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.GetEntityRequest, com.ondewo.nlu.EntityType.Entity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.GetEntityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.EntityType.Entity.getDefaultInstance()))
              .setSchemaDescriptor(new EntityTypesMethodDescriptorSupplier("GetEntity"))
              .build();
        }
      }
    }
    return getGetEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.CreateEntityRequest,
      com.ondewo.nlu.EntityType.Entity> getCreateEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEntity",
      requestType = com.ondewo.nlu.CreateEntityRequest.class,
      responseType = com.ondewo.nlu.EntityType.Entity.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.CreateEntityRequest,
      com.ondewo.nlu.EntityType.Entity> getCreateEntityMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.CreateEntityRequest, com.ondewo.nlu.EntityType.Entity> getCreateEntityMethod;
    if ((getCreateEntityMethod = EntityTypesGrpc.getCreateEntityMethod) == null) {
      synchronized (EntityTypesGrpc.class) {
        if ((getCreateEntityMethod = EntityTypesGrpc.getCreateEntityMethod) == null) {
          EntityTypesGrpc.getCreateEntityMethod = getCreateEntityMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.CreateEntityRequest, com.ondewo.nlu.EntityType.Entity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.CreateEntityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.EntityType.Entity.getDefaultInstance()))
              .setSchemaDescriptor(new EntityTypesMethodDescriptorSupplier("CreateEntity"))
              .build();
        }
      }
    }
    return getCreateEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.UpdateEntityRequest,
      com.ondewo.nlu.EntityType.Entity> getUpdateEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEntity",
      requestType = com.ondewo.nlu.UpdateEntityRequest.class,
      responseType = com.ondewo.nlu.EntityType.Entity.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.UpdateEntityRequest,
      com.ondewo.nlu.EntityType.Entity> getUpdateEntityMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.UpdateEntityRequest, com.ondewo.nlu.EntityType.Entity> getUpdateEntityMethod;
    if ((getUpdateEntityMethod = EntityTypesGrpc.getUpdateEntityMethod) == null) {
      synchronized (EntityTypesGrpc.class) {
        if ((getUpdateEntityMethod = EntityTypesGrpc.getUpdateEntityMethod) == null) {
          EntityTypesGrpc.getUpdateEntityMethod = getUpdateEntityMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.UpdateEntityRequest, com.ondewo.nlu.EntityType.Entity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.UpdateEntityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.EntityType.Entity.getDefaultInstance()))
              .setSchemaDescriptor(new EntityTypesMethodDescriptorSupplier("UpdateEntity"))
              .build();
        }
      }
    }
    return getUpdateEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteEntityRequest,
      com.ondewo.nlu.DeleteEntityStatus> getDeleteEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEntity",
      requestType = com.ondewo.nlu.DeleteEntityRequest.class,
      responseType = com.ondewo.nlu.DeleteEntityStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteEntityRequest,
      com.ondewo.nlu.DeleteEntityStatus> getDeleteEntityMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteEntityRequest, com.ondewo.nlu.DeleteEntityStatus> getDeleteEntityMethod;
    if ((getDeleteEntityMethod = EntityTypesGrpc.getDeleteEntityMethod) == null) {
      synchronized (EntityTypesGrpc.class) {
        if ((getDeleteEntityMethod = EntityTypesGrpc.getDeleteEntityMethod) == null) {
          EntityTypesGrpc.getDeleteEntityMethod = getDeleteEntityMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.DeleteEntityRequest, com.ondewo.nlu.DeleteEntityStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.DeleteEntityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.DeleteEntityStatus.getDefaultInstance()))
              .setSchemaDescriptor(new EntityTypesMethodDescriptorSupplier("DeleteEntity"))
              .build();
        }
      }
    }
    return getDeleteEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.BatchCreateEntitiesRequest,
      com.ondewo.nlu.BatchEntitiesResponse> getBatchCreateEntitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchCreateEntities",
      requestType = com.ondewo.nlu.BatchCreateEntitiesRequest.class,
      responseType = com.ondewo.nlu.BatchEntitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.BatchCreateEntitiesRequest,
      com.ondewo.nlu.BatchEntitiesResponse> getBatchCreateEntitiesMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.BatchCreateEntitiesRequest, com.ondewo.nlu.BatchEntitiesResponse> getBatchCreateEntitiesMethod;
    if ((getBatchCreateEntitiesMethod = EntityTypesGrpc.getBatchCreateEntitiesMethod) == null) {
      synchronized (EntityTypesGrpc.class) {
        if ((getBatchCreateEntitiesMethod = EntityTypesGrpc.getBatchCreateEntitiesMethod) == null) {
          EntityTypesGrpc.getBatchCreateEntitiesMethod = getBatchCreateEntitiesMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.BatchCreateEntitiesRequest, com.ondewo.nlu.BatchEntitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchCreateEntities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.BatchCreateEntitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.BatchEntitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EntityTypesMethodDescriptorSupplier("BatchCreateEntities"))
              .build();
        }
      }
    }
    return getBatchCreateEntitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.BatchUpdateEntitiesRequest,
      com.ondewo.nlu.BatchEntitiesResponse> getBatchUpdateEntitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchUpdateEntities",
      requestType = com.ondewo.nlu.BatchUpdateEntitiesRequest.class,
      responseType = com.ondewo.nlu.BatchEntitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.BatchUpdateEntitiesRequest,
      com.ondewo.nlu.BatchEntitiesResponse> getBatchUpdateEntitiesMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.BatchUpdateEntitiesRequest, com.ondewo.nlu.BatchEntitiesResponse> getBatchUpdateEntitiesMethod;
    if ((getBatchUpdateEntitiesMethod = EntityTypesGrpc.getBatchUpdateEntitiesMethod) == null) {
      synchronized (EntityTypesGrpc.class) {
        if ((getBatchUpdateEntitiesMethod = EntityTypesGrpc.getBatchUpdateEntitiesMethod) == null) {
          EntityTypesGrpc.getBatchUpdateEntitiesMethod = getBatchUpdateEntitiesMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.BatchUpdateEntitiesRequest, com.ondewo.nlu.BatchEntitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchUpdateEntities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.BatchUpdateEntitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.BatchEntitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EntityTypesMethodDescriptorSupplier("BatchUpdateEntities"))
              .build();
        }
      }
    }
    return getBatchUpdateEntitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.BatchGetEntitiesRequest,
      com.ondewo.nlu.BatchEntitiesResponse> getBatchGetEntitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchGetEntities",
      requestType = com.ondewo.nlu.BatchGetEntitiesRequest.class,
      responseType = com.ondewo.nlu.BatchEntitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.BatchGetEntitiesRequest,
      com.ondewo.nlu.BatchEntitiesResponse> getBatchGetEntitiesMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.BatchGetEntitiesRequest, com.ondewo.nlu.BatchEntitiesResponse> getBatchGetEntitiesMethod;
    if ((getBatchGetEntitiesMethod = EntityTypesGrpc.getBatchGetEntitiesMethod) == null) {
      synchronized (EntityTypesGrpc.class) {
        if ((getBatchGetEntitiesMethod = EntityTypesGrpc.getBatchGetEntitiesMethod) == null) {
          EntityTypesGrpc.getBatchGetEntitiesMethod = getBatchGetEntitiesMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.BatchGetEntitiesRequest, com.ondewo.nlu.BatchEntitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchGetEntities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.BatchGetEntitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.BatchEntitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EntityTypesMethodDescriptorSupplier("BatchGetEntities"))
              .build();
        }
      }
    }
    return getBatchGetEntitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.BatchDeleteEntitiesRequest,
      com.ondewo.nlu.BatchDeleteEntitiesResponse> getBatchDeleteEntitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchDeleteEntities",
      requestType = com.ondewo.nlu.BatchDeleteEntitiesRequest.class,
      responseType = com.ondewo.nlu.BatchDeleteEntitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.BatchDeleteEntitiesRequest,
      com.ondewo.nlu.BatchDeleteEntitiesResponse> getBatchDeleteEntitiesMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.BatchDeleteEntitiesRequest, com.ondewo.nlu.BatchDeleteEntitiesResponse> getBatchDeleteEntitiesMethod;
    if ((getBatchDeleteEntitiesMethod = EntityTypesGrpc.getBatchDeleteEntitiesMethod) == null) {
      synchronized (EntityTypesGrpc.class) {
        if ((getBatchDeleteEntitiesMethod = EntityTypesGrpc.getBatchDeleteEntitiesMethod) == null) {
          EntityTypesGrpc.getBatchDeleteEntitiesMethod = getBatchDeleteEntitiesMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.BatchDeleteEntitiesRequest, com.ondewo.nlu.BatchDeleteEntitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchDeleteEntities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.BatchDeleteEntitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.BatchDeleteEntitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EntityTypesMethodDescriptorSupplier("BatchDeleteEntities"))
              .build();
        }
      }
    }
    return getBatchDeleteEntitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListEntitiesRequest,
      com.ondewo.nlu.ListEntitiesResponse> getListEntitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEntities",
      requestType = com.ondewo.nlu.ListEntitiesRequest.class,
      responseType = com.ondewo.nlu.ListEntitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListEntitiesRequest,
      com.ondewo.nlu.ListEntitiesResponse> getListEntitiesMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListEntitiesRequest, com.ondewo.nlu.ListEntitiesResponse> getListEntitiesMethod;
    if ((getListEntitiesMethod = EntityTypesGrpc.getListEntitiesMethod) == null) {
      synchronized (EntityTypesGrpc.class) {
        if ((getListEntitiesMethod = EntityTypesGrpc.getListEntitiesMethod) == null) {
          EntityTypesGrpc.getListEntitiesMethod = getListEntitiesMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListEntitiesRequest, com.ondewo.nlu.ListEntitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEntities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListEntitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListEntitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EntityTypesMethodDescriptorSupplier("ListEntities"))
              .build();
        }
      }
    }
    return getListEntitiesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EntityTypesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EntityTypesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EntityTypesStub>() {
        @java.lang.Override
        public EntityTypesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EntityTypesStub(channel, callOptions);
        }
      };
    return EntityTypesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static EntityTypesBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EntityTypesBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EntityTypesBlockingV2Stub>() {
        @java.lang.Override
        public EntityTypesBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EntityTypesBlockingV2Stub(channel, callOptions);
        }
      };
    return EntityTypesBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EntityTypesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EntityTypesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EntityTypesBlockingStub>() {
        @java.lang.Override
        public EntityTypesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EntityTypesBlockingStub(channel, callOptions);
        }
      };
    return EntityTypesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EntityTypesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EntityTypesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EntityTypesFutureStub>() {
        @java.lang.Override
        public EntityTypesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EntityTypesFutureStub(channel, callOptions);
        }
      };
    return EntityTypesFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Entities are extracted from user input and represent parameters that are meaningful to your application. For example, a date range, a proper name such as a geographic location or landmark, and so on. Entities represent actionable data for your application.
   * When you define an entity, you can also include synonyms that all map to that entity. For example, &amp;quot;soft drink&amp;quot;, &amp;quot;soda&amp;quot;, &amp;quot;pop&amp;quot;, and so on.
   * There are three types of entities:
   * &lt;ul&gt;
   *   &lt;li&gt;&lt;strong&gt;System&lt;/strong&gt; - entities that are defined by the Dialogflow API for common data types such as date, time, currency, and so on. A system entity is represented by the &lt;code&gt;EntityType&lt;/code&gt; type.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;Developer&lt;/strong&gt; - entities that are defined by you that represent actionable data that is meaningful to your application. For example, you could define a &lt;code&gt;pizza.sauce&lt;/code&gt; entity for red or white pizza sauce, a &lt;code&gt;pizza.cheese&lt;/code&gt; entity for the different types of cheese on a pizza, a &lt;code&gt;pizza.topping&lt;/code&gt; entity for different toppings, and so on. A developer entity is represented by the &lt;code&gt;EntityType&lt;/code&gt; type.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;User&lt;/strong&gt; - entities that are built for an individual user such as favorites, preferences, playlists, and so on. A user entity is represented by the &lt;a href="index.html#ondewo.nlu.SessionEntityType"&gt;SessionEntityType&lt;/a&gt; type.&lt;/li&gt;
   * &lt;/ul&gt;
   * For more information about entity types, see the &lt;a href="https://dialogflow.com/docs/entities"&gt;Dialogflow documentation&lt;/a&gt;.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns the list of all entity types in the specified agent.
     * </pre>
     */
    default void listEntityTypes(com.ondewo.nlu.ListEntityTypesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListEntityTypesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEntityTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specified entity type.
     * </pre>
     */
    default void getEntityType(com.ondewo.nlu.GetEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.EntityType> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEntityTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an entity type in the specified agent.
     * </pre>
     */
    default void createEntityType(com.ondewo.nlu.CreateEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.EntityType> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEntityTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified entity type.
     * </pre>
     */
    default void updateEntityType(com.ondewo.nlu.UpdateEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.EntityType> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEntityTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified entity type.
     * </pre>
     */
    default void deleteEntityType(com.ondewo.nlu.DeleteEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEntityTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates/Creates multiple entity types in the specified agent.
     * Operation &amp;lt;response: &lt;a href="index.html#ondewo.nlu.BatchUpdateEntityTypesResponse"&gt;BatchUpdateEntityTypesResponse&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    default void batchUpdateEntityTypes(com.ondewo.nlu.BatchUpdateEntityTypesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchUpdateEntityTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes entity types in the specified agent.
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    default void batchDeleteEntityTypes(com.ondewo.nlu.BatchDeleteEntityTypesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchDeleteEntityTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specified entity .
     * </pre>
     */
    default void getEntity(com.ondewo.nlu.GetEntityRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.EntityType.Entity> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEntityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an entity  in the specified agent.
     * </pre>
     */
    default void createEntity(com.ondewo.nlu.CreateEntityRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.EntityType.Entity> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEntityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified entity .
     * </pre>
     */
    default void updateEntity(com.ondewo.nlu.UpdateEntityRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.EntityType.Entity> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEntityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified entity .
     * </pre>
     */
    default void deleteEntity(com.ondewo.nlu.DeleteEntityRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.DeleteEntityStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEntityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an entity value in an entity type.
     * </pre>
     */
    default void batchCreateEntities(com.ondewo.nlu.BatchCreateEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.BatchEntitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchCreateEntitiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a specific entity value.
     * </pre>
     */
    default void batchUpdateEntities(com.ondewo.nlu.BatchUpdateEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.BatchEntitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchUpdateEntitiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a specific entity value.
     * </pre>
     */
    default void batchGetEntities(com.ondewo.nlu.BatchGetEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.BatchEntitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchGetEntitiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified entity value.
     * </pre>
     */
    default void batchDeleteEntities(com.ondewo.nlu.BatchDeleteEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.BatchDeleteEntitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchDeleteEntitiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * List entities of an entity type
     * </pre>
     */
    default void listEntities(com.ondewo.nlu.ListEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListEntitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEntitiesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EntityTypes.
   * <pre>
   * Entities are extracted from user input and represent parameters that are meaningful to your application. For example, a date range, a proper name such as a geographic location or landmark, and so on. Entities represent actionable data for your application.
   * When you define an entity, you can also include synonyms that all map to that entity. For example, &amp;quot;soft drink&amp;quot;, &amp;quot;soda&amp;quot;, &amp;quot;pop&amp;quot;, and so on.
   * There are three types of entities:
   * &lt;ul&gt;
   *   &lt;li&gt;&lt;strong&gt;System&lt;/strong&gt; - entities that are defined by the Dialogflow API for common data types such as date, time, currency, and so on. A system entity is represented by the &lt;code&gt;EntityType&lt;/code&gt; type.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;Developer&lt;/strong&gt; - entities that are defined by you that represent actionable data that is meaningful to your application. For example, you could define a &lt;code&gt;pizza.sauce&lt;/code&gt; entity for red or white pizza sauce, a &lt;code&gt;pizza.cheese&lt;/code&gt; entity for the different types of cheese on a pizza, a &lt;code&gt;pizza.topping&lt;/code&gt; entity for different toppings, and so on. A developer entity is represented by the &lt;code&gt;EntityType&lt;/code&gt; type.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;User&lt;/strong&gt; - entities that are built for an individual user such as favorites, preferences, playlists, and so on. A user entity is represented by the &lt;a href="index.html#ondewo.nlu.SessionEntityType"&gt;SessionEntityType&lt;/a&gt; type.&lt;/li&gt;
   * &lt;/ul&gt;
   * For more information about entity types, see the &lt;a href="https://dialogflow.com/docs/entities"&gt;Dialogflow documentation&lt;/a&gt;.
   * </pre>
   */
  public static abstract class EntityTypesImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EntityTypesGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EntityTypes.
   * <pre>
   * Entities are extracted from user input and represent parameters that are meaningful to your application. For example, a date range, a proper name such as a geographic location or landmark, and so on. Entities represent actionable data for your application.
   * When you define an entity, you can also include synonyms that all map to that entity. For example, &amp;quot;soft drink&amp;quot;, &amp;quot;soda&amp;quot;, &amp;quot;pop&amp;quot;, and so on.
   * There are three types of entities:
   * &lt;ul&gt;
   *   &lt;li&gt;&lt;strong&gt;System&lt;/strong&gt; - entities that are defined by the Dialogflow API for common data types such as date, time, currency, and so on. A system entity is represented by the &lt;code&gt;EntityType&lt;/code&gt; type.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;Developer&lt;/strong&gt; - entities that are defined by you that represent actionable data that is meaningful to your application. For example, you could define a &lt;code&gt;pizza.sauce&lt;/code&gt; entity for red or white pizza sauce, a &lt;code&gt;pizza.cheese&lt;/code&gt; entity for the different types of cheese on a pizza, a &lt;code&gt;pizza.topping&lt;/code&gt; entity for different toppings, and so on. A developer entity is represented by the &lt;code&gt;EntityType&lt;/code&gt; type.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;User&lt;/strong&gt; - entities that are built for an individual user such as favorites, preferences, playlists, and so on. A user entity is represented by the &lt;a href="index.html#ondewo.nlu.SessionEntityType"&gt;SessionEntityType&lt;/a&gt; type.&lt;/li&gt;
   * &lt;/ul&gt;
   * For more information about entity types, see the &lt;a href="https://dialogflow.com/docs/entities"&gt;Dialogflow documentation&lt;/a&gt;.
   * </pre>
   */
  public static final class EntityTypesStub
      extends io.grpc.stub.AbstractAsyncStub<EntityTypesStub> {
    private EntityTypesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EntityTypesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EntityTypesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all entity types in the specified agent.
     * </pre>
     */
    public void listEntityTypes(com.ondewo.nlu.ListEntityTypesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListEntityTypesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEntityTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specified entity type.
     * </pre>
     */
    public void getEntityType(com.ondewo.nlu.GetEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.EntityType> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEntityTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an entity type in the specified agent.
     * </pre>
     */
    public void createEntityType(com.ondewo.nlu.CreateEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.EntityType> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEntityTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified entity type.
     * </pre>
     */
    public void updateEntityType(com.ondewo.nlu.UpdateEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.EntityType> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEntityTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified entity type.
     * </pre>
     */
    public void deleteEntityType(com.ondewo.nlu.DeleteEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEntityTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates/Creates multiple entity types in the specified agent.
     * Operation &amp;lt;response: &lt;a href="index.html#ondewo.nlu.BatchUpdateEntityTypesResponse"&gt;BatchUpdateEntityTypesResponse&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public void batchUpdateEntityTypes(com.ondewo.nlu.BatchUpdateEntityTypesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchUpdateEntityTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes entity types in the specified agent.
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public void batchDeleteEntityTypes(com.ondewo.nlu.BatchDeleteEntityTypesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchDeleteEntityTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specified entity .
     * </pre>
     */
    public void getEntity(com.ondewo.nlu.GetEntityRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.EntityType.Entity> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an entity  in the specified agent.
     * </pre>
     */
    public void createEntity(com.ondewo.nlu.CreateEntityRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.EntityType.Entity> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified entity .
     * </pre>
     */
    public void updateEntity(com.ondewo.nlu.UpdateEntityRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.EntityType.Entity> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified entity .
     * </pre>
     */
    public void deleteEntity(com.ondewo.nlu.DeleteEntityRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.DeleteEntityStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an entity value in an entity type.
     * </pre>
     */
    public void batchCreateEntities(com.ondewo.nlu.BatchCreateEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.BatchEntitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchCreateEntitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a specific entity value.
     * </pre>
     */
    public void batchUpdateEntities(com.ondewo.nlu.BatchUpdateEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.BatchEntitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchUpdateEntitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a specific entity value.
     * </pre>
     */
    public void batchGetEntities(com.ondewo.nlu.BatchGetEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.BatchEntitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchGetEntitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified entity value.
     * </pre>
     */
    public void batchDeleteEntities(com.ondewo.nlu.BatchDeleteEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.BatchDeleteEntitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchDeleteEntitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List entities of an entity type
     * </pre>
     */
    public void listEntities(com.ondewo.nlu.ListEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListEntitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEntitiesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EntityTypes.
   * <pre>
   * Entities are extracted from user input and represent parameters that are meaningful to your application. For example, a date range, a proper name such as a geographic location or landmark, and so on. Entities represent actionable data for your application.
   * When you define an entity, you can also include synonyms that all map to that entity. For example, &amp;quot;soft drink&amp;quot;, &amp;quot;soda&amp;quot;, &amp;quot;pop&amp;quot;, and so on.
   * There are three types of entities:
   * &lt;ul&gt;
   *   &lt;li&gt;&lt;strong&gt;System&lt;/strong&gt; - entities that are defined by the Dialogflow API for common data types such as date, time, currency, and so on. A system entity is represented by the &lt;code&gt;EntityType&lt;/code&gt; type.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;Developer&lt;/strong&gt; - entities that are defined by you that represent actionable data that is meaningful to your application. For example, you could define a &lt;code&gt;pizza.sauce&lt;/code&gt; entity for red or white pizza sauce, a &lt;code&gt;pizza.cheese&lt;/code&gt; entity for the different types of cheese on a pizza, a &lt;code&gt;pizza.topping&lt;/code&gt; entity for different toppings, and so on. A developer entity is represented by the &lt;code&gt;EntityType&lt;/code&gt; type.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;User&lt;/strong&gt; - entities that are built for an individual user such as favorites, preferences, playlists, and so on. A user entity is represented by the &lt;a href="index.html#ondewo.nlu.SessionEntityType"&gt;SessionEntityType&lt;/a&gt; type.&lt;/li&gt;
   * &lt;/ul&gt;
   * For more information about entity types, see the &lt;a href="https://dialogflow.com/docs/entities"&gt;Dialogflow documentation&lt;/a&gt;.
   * </pre>
   */
  public static final class EntityTypesBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<EntityTypesBlockingV2Stub> {
    private EntityTypesBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EntityTypesBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EntityTypesBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all entity types in the specified agent.
     * </pre>
     */
    public com.ondewo.nlu.ListEntityTypesResponse listEntityTypes(com.ondewo.nlu.ListEntityTypesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListEntityTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the specified entity type.
     * </pre>
     */
    public com.ondewo.nlu.EntityType getEntityType(com.ondewo.nlu.GetEntityTypeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetEntityTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an entity type in the specified agent.
     * </pre>
     */
    public com.ondewo.nlu.EntityType createEntityType(com.ondewo.nlu.CreateEntityTypeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateEntityTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified entity type.
     * </pre>
     */
    public com.ondewo.nlu.EntityType updateEntityType(com.ondewo.nlu.UpdateEntityTypeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateEntityTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified entity type.
     * </pre>
     */
    public com.google.protobuf.Empty deleteEntityType(com.ondewo.nlu.DeleteEntityTypeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteEntityTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates/Creates multiple entity types in the specified agent.
     * Operation &amp;lt;response: &lt;a href="index.html#ondewo.nlu.BatchUpdateEntityTypesResponse"&gt;BatchUpdateEntityTypesResponse&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation batchUpdateEntityTypes(com.ondewo.nlu.BatchUpdateEntityTypesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchUpdateEntityTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes entity types in the specified agent.
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation batchDeleteEntityTypes(com.ondewo.nlu.BatchDeleteEntityTypesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchDeleteEntityTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the specified entity .
     * </pre>
     */
    public com.ondewo.nlu.EntityType.Entity getEntity(com.ondewo.nlu.GetEntityRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an entity  in the specified agent.
     * </pre>
     */
    public com.ondewo.nlu.EntityType.Entity createEntity(com.ondewo.nlu.CreateEntityRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified entity .
     * </pre>
     */
    public com.ondewo.nlu.EntityType.Entity updateEntity(com.ondewo.nlu.UpdateEntityRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified entity .
     * </pre>
     */
    public com.ondewo.nlu.DeleteEntityStatus deleteEntity(com.ondewo.nlu.DeleteEntityRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an entity value in an entity type.
     * </pre>
     */
    public com.ondewo.nlu.BatchEntitiesResponse batchCreateEntities(com.ondewo.nlu.BatchCreateEntitiesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchCreateEntitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a specific entity value.
     * </pre>
     */
    public com.ondewo.nlu.BatchEntitiesResponse batchUpdateEntities(com.ondewo.nlu.BatchUpdateEntitiesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchUpdateEntitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a specific entity value.
     * </pre>
     */
    public com.ondewo.nlu.BatchEntitiesResponse batchGetEntities(com.ondewo.nlu.BatchGetEntitiesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchGetEntitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified entity value.
     * </pre>
     */
    public com.ondewo.nlu.BatchDeleteEntitiesResponse batchDeleteEntities(com.ondewo.nlu.BatchDeleteEntitiesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchDeleteEntitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List entities of an entity type
     * </pre>
     */
    public com.ondewo.nlu.ListEntitiesResponse listEntities(com.ondewo.nlu.ListEntitiesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListEntitiesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service EntityTypes.
   * <pre>
   * Entities are extracted from user input and represent parameters that are meaningful to your application. For example, a date range, a proper name such as a geographic location or landmark, and so on. Entities represent actionable data for your application.
   * When you define an entity, you can also include synonyms that all map to that entity. For example, &amp;quot;soft drink&amp;quot;, &amp;quot;soda&amp;quot;, &amp;quot;pop&amp;quot;, and so on.
   * There are three types of entities:
   * &lt;ul&gt;
   *   &lt;li&gt;&lt;strong&gt;System&lt;/strong&gt; - entities that are defined by the Dialogflow API for common data types such as date, time, currency, and so on. A system entity is represented by the &lt;code&gt;EntityType&lt;/code&gt; type.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;Developer&lt;/strong&gt; - entities that are defined by you that represent actionable data that is meaningful to your application. For example, you could define a &lt;code&gt;pizza.sauce&lt;/code&gt; entity for red or white pizza sauce, a &lt;code&gt;pizza.cheese&lt;/code&gt; entity for the different types of cheese on a pizza, a &lt;code&gt;pizza.topping&lt;/code&gt; entity for different toppings, and so on. A developer entity is represented by the &lt;code&gt;EntityType&lt;/code&gt; type.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;User&lt;/strong&gt; - entities that are built for an individual user such as favorites, preferences, playlists, and so on. A user entity is represented by the &lt;a href="index.html#ondewo.nlu.SessionEntityType"&gt;SessionEntityType&lt;/a&gt; type.&lt;/li&gt;
   * &lt;/ul&gt;
   * For more information about entity types, see the &lt;a href="https://dialogflow.com/docs/entities"&gt;Dialogflow documentation&lt;/a&gt;.
   * </pre>
   */
  public static final class EntityTypesBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EntityTypesBlockingStub> {
    private EntityTypesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EntityTypesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EntityTypesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all entity types in the specified agent.
     * </pre>
     */
    public com.ondewo.nlu.ListEntityTypesResponse listEntityTypes(com.ondewo.nlu.ListEntityTypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEntityTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the specified entity type.
     * </pre>
     */
    public com.ondewo.nlu.EntityType getEntityType(com.ondewo.nlu.GetEntityTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEntityTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an entity type in the specified agent.
     * </pre>
     */
    public com.ondewo.nlu.EntityType createEntityType(com.ondewo.nlu.CreateEntityTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEntityTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified entity type.
     * </pre>
     */
    public com.ondewo.nlu.EntityType updateEntityType(com.ondewo.nlu.UpdateEntityTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEntityTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified entity type.
     * </pre>
     */
    public com.google.protobuf.Empty deleteEntityType(com.ondewo.nlu.DeleteEntityTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEntityTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates/Creates multiple entity types in the specified agent.
     * Operation &amp;lt;response: &lt;a href="index.html#ondewo.nlu.BatchUpdateEntityTypesResponse"&gt;BatchUpdateEntityTypesResponse&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation batchUpdateEntityTypes(com.ondewo.nlu.BatchUpdateEntityTypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchUpdateEntityTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes entity types in the specified agent.
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation batchDeleteEntityTypes(com.ondewo.nlu.BatchDeleteEntityTypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchDeleteEntityTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the specified entity .
     * </pre>
     */
    public com.ondewo.nlu.EntityType.Entity getEntity(com.ondewo.nlu.GetEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an entity  in the specified agent.
     * </pre>
     */
    public com.ondewo.nlu.EntityType.Entity createEntity(com.ondewo.nlu.CreateEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified entity .
     * </pre>
     */
    public com.ondewo.nlu.EntityType.Entity updateEntity(com.ondewo.nlu.UpdateEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified entity .
     * </pre>
     */
    public com.ondewo.nlu.DeleteEntityStatus deleteEntity(com.ondewo.nlu.DeleteEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an entity value in an entity type.
     * </pre>
     */
    public com.ondewo.nlu.BatchEntitiesResponse batchCreateEntities(com.ondewo.nlu.BatchCreateEntitiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchCreateEntitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a specific entity value.
     * </pre>
     */
    public com.ondewo.nlu.BatchEntitiesResponse batchUpdateEntities(com.ondewo.nlu.BatchUpdateEntitiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchUpdateEntitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a specific entity value.
     * </pre>
     */
    public com.ondewo.nlu.BatchEntitiesResponse batchGetEntities(com.ondewo.nlu.BatchGetEntitiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchGetEntitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified entity value.
     * </pre>
     */
    public com.ondewo.nlu.BatchDeleteEntitiesResponse batchDeleteEntities(com.ondewo.nlu.BatchDeleteEntitiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchDeleteEntitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List entities of an entity type
     * </pre>
     */
    public com.ondewo.nlu.ListEntitiesResponse listEntities(com.ondewo.nlu.ListEntitiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEntitiesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EntityTypes.
   * <pre>
   * Entities are extracted from user input and represent parameters that are meaningful to your application. For example, a date range, a proper name such as a geographic location or landmark, and so on. Entities represent actionable data for your application.
   * When you define an entity, you can also include synonyms that all map to that entity. For example, &amp;quot;soft drink&amp;quot;, &amp;quot;soda&amp;quot;, &amp;quot;pop&amp;quot;, and so on.
   * There are three types of entities:
   * &lt;ul&gt;
   *   &lt;li&gt;&lt;strong&gt;System&lt;/strong&gt; - entities that are defined by the Dialogflow API for common data types such as date, time, currency, and so on. A system entity is represented by the &lt;code&gt;EntityType&lt;/code&gt; type.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;Developer&lt;/strong&gt; - entities that are defined by you that represent actionable data that is meaningful to your application. For example, you could define a &lt;code&gt;pizza.sauce&lt;/code&gt; entity for red or white pizza sauce, a &lt;code&gt;pizza.cheese&lt;/code&gt; entity for the different types of cheese on a pizza, a &lt;code&gt;pizza.topping&lt;/code&gt; entity for different toppings, and so on. A developer entity is represented by the &lt;code&gt;EntityType&lt;/code&gt; type.&lt;/li&gt;
   *   &lt;li&gt;&lt;strong&gt;User&lt;/strong&gt; - entities that are built for an individual user such as favorites, preferences, playlists, and so on. A user entity is represented by the &lt;a href="index.html#ondewo.nlu.SessionEntityType"&gt;SessionEntityType&lt;/a&gt; type.&lt;/li&gt;
   * &lt;/ul&gt;
   * For more information about entity types, see the &lt;a href="https://dialogflow.com/docs/entities"&gt;Dialogflow documentation&lt;/a&gt;.
   * </pre>
   */
  public static final class EntityTypesFutureStub
      extends io.grpc.stub.AbstractFutureStub<EntityTypesFutureStub> {
    private EntityTypesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EntityTypesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EntityTypesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all entity types in the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListEntityTypesResponse> listEntityTypes(
        com.ondewo.nlu.ListEntityTypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEntityTypesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the specified entity type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.EntityType> getEntityType(
        com.ondewo.nlu.GetEntityTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEntityTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an entity type in the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.EntityType> createEntityType(
        com.ondewo.nlu.CreateEntityTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEntityTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified entity type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.EntityType> updateEntityType(
        com.ondewo.nlu.UpdateEntityTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEntityTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified entity type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteEntityType(
        com.ondewo.nlu.DeleteEntityTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEntityTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates/Creates multiple entity types in the specified agent.
     * Operation &amp;lt;response: &lt;a href="index.html#ondewo.nlu.BatchUpdateEntityTypesResponse"&gt;BatchUpdateEntityTypesResponse&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> batchUpdateEntityTypes(
        com.ondewo.nlu.BatchUpdateEntityTypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchUpdateEntityTypesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes entity types in the specified agent.
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> batchDeleteEntityTypes(
        com.ondewo.nlu.BatchDeleteEntityTypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchDeleteEntityTypesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the specified entity .
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.EntityType.Entity> getEntity(
        com.ondewo.nlu.GetEntityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEntityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an entity  in the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.EntityType.Entity> createEntity(
        com.ondewo.nlu.CreateEntityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEntityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified entity .
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.EntityType.Entity> updateEntity(
        com.ondewo.nlu.UpdateEntityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEntityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified entity .
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.DeleteEntityStatus> deleteEntity(
        com.ondewo.nlu.DeleteEntityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEntityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an entity value in an entity type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.BatchEntitiesResponse> batchCreateEntities(
        com.ondewo.nlu.BatchCreateEntitiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchCreateEntitiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a specific entity value.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.BatchEntitiesResponse> batchUpdateEntities(
        com.ondewo.nlu.BatchUpdateEntitiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchUpdateEntitiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a specific entity value.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.BatchEntitiesResponse> batchGetEntities(
        com.ondewo.nlu.BatchGetEntitiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchGetEntitiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified entity value.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.BatchDeleteEntitiesResponse> batchDeleteEntities(
        com.ondewo.nlu.BatchDeleteEntitiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchDeleteEntitiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List entities of an entity type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListEntitiesResponse> listEntities(
        com.ondewo.nlu.ListEntitiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEntitiesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_ENTITY_TYPES = 0;
  private static final int METHODID_GET_ENTITY_TYPE = 1;
  private static final int METHODID_CREATE_ENTITY_TYPE = 2;
  private static final int METHODID_UPDATE_ENTITY_TYPE = 3;
  private static final int METHODID_DELETE_ENTITY_TYPE = 4;
  private static final int METHODID_BATCH_UPDATE_ENTITY_TYPES = 5;
  private static final int METHODID_BATCH_DELETE_ENTITY_TYPES = 6;
  private static final int METHODID_GET_ENTITY = 7;
  private static final int METHODID_CREATE_ENTITY = 8;
  private static final int METHODID_UPDATE_ENTITY = 9;
  private static final int METHODID_DELETE_ENTITY = 10;
  private static final int METHODID_BATCH_CREATE_ENTITIES = 11;
  private static final int METHODID_BATCH_UPDATE_ENTITIES = 12;
  private static final int METHODID_BATCH_GET_ENTITIES = 13;
  private static final int METHODID_BATCH_DELETE_ENTITIES = 14;
  private static final int METHODID_LIST_ENTITIES = 15;

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
        case METHODID_LIST_ENTITY_TYPES:
          serviceImpl.listEntityTypes((com.ondewo.nlu.ListEntityTypesRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListEntityTypesResponse>) responseObserver);
          break;
        case METHODID_GET_ENTITY_TYPE:
          serviceImpl.getEntityType((com.ondewo.nlu.GetEntityTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.EntityType>) responseObserver);
          break;
        case METHODID_CREATE_ENTITY_TYPE:
          serviceImpl.createEntityType((com.ondewo.nlu.CreateEntityTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.EntityType>) responseObserver);
          break;
        case METHODID_UPDATE_ENTITY_TYPE:
          serviceImpl.updateEntityType((com.ondewo.nlu.UpdateEntityTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.EntityType>) responseObserver);
          break;
        case METHODID_DELETE_ENTITY_TYPE:
          serviceImpl.deleteEntityType((com.ondewo.nlu.DeleteEntityTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BATCH_UPDATE_ENTITY_TYPES:
          serviceImpl.batchUpdateEntityTypes((com.ondewo.nlu.BatchUpdateEntityTypesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_BATCH_DELETE_ENTITY_TYPES:
          serviceImpl.batchDeleteEntityTypes((com.ondewo.nlu.BatchDeleteEntityTypesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_ENTITY:
          serviceImpl.getEntity((com.ondewo.nlu.GetEntityRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.EntityType.Entity>) responseObserver);
          break;
        case METHODID_CREATE_ENTITY:
          serviceImpl.createEntity((com.ondewo.nlu.CreateEntityRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.EntityType.Entity>) responseObserver);
          break;
        case METHODID_UPDATE_ENTITY:
          serviceImpl.updateEntity((com.ondewo.nlu.UpdateEntityRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.EntityType.Entity>) responseObserver);
          break;
        case METHODID_DELETE_ENTITY:
          serviceImpl.deleteEntity((com.ondewo.nlu.DeleteEntityRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.DeleteEntityStatus>) responseObserver);
          break;
        case METHODID_BATCH_CREATE_ENTITIES:
          serviceImpl.batchCreateEntities((com.ondewo.nlu.BatchCreateEntitiesRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.BatchEntitiesResponse>) responseObserver);
          break;
        case METHODID_BATCH_UPDATE_ENTITIES:
          serviceImpl.batchUpdateEntities((com.ondewo.nlu.BatchUpdateEntitiesRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.BatchEntitiesResponse>) responseObserver);
          break;
        case METHODID_BATCH_GET_ENTITIES:
          serviceImpl.batchGetEntities((com.ondewo.nlu.BatchGetEntitiesRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.BatchEntitiesResponse>) responseObserver);
          break;
        case METHODID_BATCH_DELETE_ENTITIES:
          serviceImpl.batchDeleteEntities((com.ondewo.nlu.BatchDeleteEntitiesRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.BatchDeleteEntitiesResponse>) responseObserver);
          break;
        case METHODID_LIST_ENTITIES:
          serviceImpl.listEntities((com.ondewo.nlu.ListEntitiesRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListEntitiesResponse>) responseObserver);
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
          getListEntityTypesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListEntityTypesRequest,
              com.ondewo.nlu.ListEntityTypesResponse>(
                service, METHODID_LIST_ENTITY_TYPES)))
        .addMethod(
          getGetEntityTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.GetEntityTypeRequest,
              com.ondewo.nlu.EntityType>(
                service, METHODID_GET_ENTITY_TYPE)))
        .addMethod(
          getCreateEntityTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.CreateEntityTypeRequest,
              com.ondewo.nlu.EntityType>(
                service, METHODID_CREATE_ENTITY_TYPE)))
        .addMethod(
          getUpdateEntityTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.UpdateEntityTypeRequest,
              com.ondewo.nlu.EntityType>(
                service, METHODID_UPDATE_ENTITY_TYPE)))
        .addMethod(
          getDeleteEntityTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.DeleteEntityTypeRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ENTITY_TYPE)))
        .addMethod(
          getBatchUpdateEntityTypesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.BatchUpdateEntityTypesRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_BATCH_UPDATE_ENTITY_TYPES)))
        .addMethod(
          getBatchDeleteEntityTypesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.BatchDeleteEntityTypesRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_BATCH_DELETE_ENTITY_TYPES)))
        .addMethod(
          getGetEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.GetEntityRequest,
              com.ondewo.nlu.EntityType.Entity>(
                service, METHODID_GET_ENTITY)))
        .addMethod(
          getCreateEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.CreateEntityRequest,
              com.ondewo.nlu.EntityType.Entity>(
                service, METHODID_CREATE_ENTITY)))
        .addMethod(
          getUpdateEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.UpdateEntityRequest,
              com.ondewo.nlu.EntityType.Entity>(
                service, METHODID_UPDATE_ENTITY)))
        .addMethod(
          getDeleteEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.DeleteEntityRequest,
              com.ondewo.nlu.DeleteEntityStatus>(
                service, METHODID_DELETE_ENTITY)))
        .addMethod(
          getBatchCreateEntitiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.BatchCreateEntitiesRequest,
              com.ondewo.nlu.BatchEntitiesResponse>(
                service, METHODID_BATCH_CREATE_ENTITIES)))
        .addMethod(
          getBatchUpdateEntitiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.BatchUpdateEntitiesRequest,
              com.ondewo.nlu.BatchEntitiesResponse>(
                service, METHODID_BATCH_UPDATE_ENTITIES)))
        .addMethod(
          getBatchGetEntitiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.BatchGetEntitiesRequest,
              com.ondewo.nlu.BatchEntitiesResponse>(
                service, METHODID_BATCH_GET_ENTITIES)))
        .addMethod(
          getBatchDeleteEntitiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.BatchDeleteEntitiesRequest,
              com.ondewo.nlu.BatchDeleteEntitiesResponse>(
                service, METHODID_BATCH_DELETE_ENTITIES)))
        .addMethod(
          getListEntitiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListEntitiesRequest,
              com.ondewo.nlu.ListEntitiesResponse>(
                service, METHODID_LIST_ENTITIES)))
        .build();
  }

  private static abstract class EntityTypesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EntityTypesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ondewo.nlu.EntityTypeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EntityTypes");
    }
  }

  private static final class EntityTypesFileDescriptorSupplier
      extends EntityTypesBaseDescriptorSupplier {
    EntityTypesFileDescriptorSupplier() {}
  }

  private static final class EntityTypesMethodDescriptorSupplier
      extends EntityTypesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EntityTypesMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EntityTypesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EntityTypesFileDescriptorSupplier())
              .addMethod(getListEntityTypesMethod())
              .addMethod(getGetEntityTypeMethod())
              .addMethod(getCreateEntityTypeMethod())
              .addMethod(getUpdateEntityTypeMethod())
              .addMethod(getDeleteEntityTypeMethod())
              .addMethod(getBatchUpdateEntityTypesMethod())
              .addMethod(getBatchDeleteEntityTypesMethod())
              .addMethod(getGetEntityMethod())
              .addMethod(getCreateEntityMethod())
              .addMethod(getUpdateEntityMethod())
              .addMethod(getDeleteEntityMethod())
              .addMethod(getBatchCreateEntitiesMethod())
              .addMethod(getBatchUpdateEntitiesMethod())
              .addMethod(getBatchGetEntitiesMethod())
              .addMethod(getBatchDeleteEntitiesMethod())
              .addMethod(getListEntitiesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
