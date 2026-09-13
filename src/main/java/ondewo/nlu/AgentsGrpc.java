package ondewo.nlu;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Agents are best described as Natural Language Understanding (NLU) modules that transform user requests into actionable data. You can include agents in your app, product, or service to determine user intent and respond to the user in a natural way.
 * After you create an agent, you can add &lt;a href="index.html#ondewo.nlu.Intent"&gt;Intents&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.Context"&gt;Contexts&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.EntityType"&gt;Entity Types&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.WebhookRequest"&gt;Webhooks&lt;/a&gt;, and so on to manage the flow of a conversation and match user input to predefined intents and actions.
 * You can create an agent using both Dialogflow Standard Edition and Dialogflow Enterprise Edition. For details, see &lt;a href="https://docs.cloud.google.com/dialogflow/docs/editions"&gt;Dialogflow Editions&lt;/a&gt;.
 * You can save your agent for backup or versioning by exporting the agent by using the &lt;a href="index.html#ondewo.nlu.Agents.ExportAgent"&gt;ExportAgent&lt;/a&gt; method. You can import a saved agent by using the &lt;a href="index.html#ondewo.nlu.Agents.ImportAgent"&gt;ImportAgent&lt;/a&gt; method.
 * Dialogflow provides several &lt;a href="https://dialogflow.com/docs/prebuilt-agents"&gt;prebuilt agents&lt;/a&gt; for common conversation scenarios such as determining a date and time, converting currency, and so on.
 * For more information about agents, see the &lt;a href="https://dialogflow.com/docs/agents"&gt;Dialogflow documentation&lt;/a&gt;.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class AgentsGrpc {

  private AgentsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.nlu.Agents";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.CreateAgentRequest,
      ondewo.nlu.AgentOuterClass.Agent> getCreateAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAgent",
      requestType = ondewo.nlu.AgentOuterClass.CreateAgentRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.Agent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.CreateAgentRequest,
      ondewo.nlu.AgentOuterClass.Agent> getCreateAgentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.CreateAgentRequest, ondewo.nlu.AgentOuterClass.Agent> getCreateAgentMethod;
    if ((getCreateAgentMethod = AgentsGrpc.getCreateAgentMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getCreateAgentMethod = AgentsGrpc.getCreateAgentMethod) == null) {
          AgentsGrpc.getCreateAgentMethod = getCreateAgentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.CreateAgentRequest, ondewo.nlu.AgentOuterClass.Agent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.CreateAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.Agent.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("CreateAgent"))
              .build();
        }
      }
    }
    return getCreateAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.UpdateAgentRequest,
      ondewo.nlu.AgentOuterClass.Agent> getUpdateAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgent",
      requestType = ondewo.nlu.AgentOuterClass.UpdateAgentRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.Agent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.UpdateAgentRequest,
      ondewo.nlu.AgentOuterClass.Agent> getUpdateAgentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.UpdateAgentRequest, ondewo.nlu.AgentOuterClass.Agent> getUpdateAgentMethod;
    if ((getUpdateAgentMethod = AgentsGrpc.getUpdateAgentMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getUpdateAgentMethod = AgentsGrpc.getUpdateAgentMethod) == null) {
          AgentsGrpc.getUpdateAgentMethod = getUpdateAgentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.UpdateAgentRequest, ondewo.nlu.AgentOuterClass.Agent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.UpdateAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.Agent.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("UpdateAgent"))
              .build();
        }
      }
    }
    return getUpdateAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.GetAgentRequest,
      ondewo.nlu.AgentOuterClass.Agent> getGetAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgent",
      requestType = ondewo.nlu.AgentOuterClass.GetAgentRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.Agent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.GetAgentRequest,
      ondewo.nlu.AgentOuterClass.Agent> getGetAgentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.GetAgentRequest, ondewo.nlu.AgentOuterClass.Agent> getGetAgentMethod;
    if ((getGetAgentMethod = AgentsGrpc.getGetAgentMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getGetAgentMethod = AgentsGrpc.getGetAgentMethod) == null) {
          AgentsGrpc.getGetAgentMethod = getGetAgentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.GetAgentRequest, ondewo.nlu.AgentOuterClass.Agent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.GetAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.Agent.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("GetAgent"))
              .build();
        }
      }
    }
    return getGetAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.DeleteAgentRequest,
      com.google.protobuf.Empty> getDeleteAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAgent",
      requestType = ondewo.nlu.AgentOuterClass.DeleteAgentRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.DeleteAgentRequest,
      com.google.protobuf.Empty> getDeleteAgentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.DeleteAgentRequest, com.google.protobuf.Empty> getDeleteAgentMethod;
    if ((getDeleteAgentMethod = AgentsGrpc.getDeleteAgentMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getDeleteAgentMethod = AgentsGrpc.getDeleteAgentMethod) == null) {
          AgentsGrpc.getDeleteAgentMethod = getDeleteAgentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.DeleteAgentRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.DeleteAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("DeleteAgent"))
              .build();
        }
      }
    }
    return getDeleteAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getDeleteAllAgentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAllAgents",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getDeleteAllAgentsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getDeleteAllAgentsMethod;
    if ((getDeleteAllAgentsMethod = AgentsGrpc.getDeleteAllAgentsMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getDeleteAllAgentsMethod = AgentsGrpc.getDeleteAllAgentsMethod) == null) {
          AgentsGrpc.getDeleteAllAgentsMethod = getDeleteAllAgentsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAllAgents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("DeleteAllAgents"))
              .build();
        }
      }
    }
    return getDeleteAllAgentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ListAgentsRequest,
      ondewo.nlu.AgentOuterClass.ListAgentsResponse> getListAgentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgents",
      requestType = ondewo.nlu.AgentOuterClass.ListAgentsRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.ListAgentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ListAgentsRequest,
      ondewo.nlu.AgentOuterClass.ListAgentsResponse> getListAgentsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ListAgentsRequest, ondewo.nlu.AgentOuterClass.ListAgentsResponse> getListAgentsMethod;
    if ((getListAgentsMethod = AgentsGrpc.getListAgentsMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getListAgentsMethod = AgentsGrpc.getListAgentsMethod) == null) {
          AgentsGrpc.getListAgentsMethod = getListAgentsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.ListAgentsRequest, ondewo.nlu.AgentOuterClass.ListAgentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.ListAgentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.ListAgentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("ListAgents"))
              .build();
        }
      }
    }
    return getListAgentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ListAgentsRequest,
      ondewo.nlu.AgentOuterClass.ListAgentsOfUserResponse> getListAgentsOfUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentsOfUser",
      requestType = ondewo.nlu.AgentOuterClass.ListAgentsRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.ListAgentsOfUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ListAgentsRequest,
      ondewo.nlu.AgentOuterClass.ListAgentsOfUserResponse> getListAgentsOfUserMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ListAgentsRequest, ondewo.nlu.AgentOuterClass.ListAgentsOfUserResponse> getListAgentsOfUserMethod;
    if ((getListAgentsOfUserMethod = AgentsGrpc.getListAgentsOfUserMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getListAgentsOfUserMethod = AgentsGrpc.getListAgentsOfUserMethod) == null) {
          AgentsGrpc.getListAgentsOfUserMethod = getListAgentsOfUserMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.ListAgentsRequest, ondewo.nlu.AgentOuterClass.ListAgentsOfUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgentsOfUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.ListAgentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.ListAgentsOfUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("ListAgentsOfUser"))
              .build();
        }
      }
    }
    return getListAgentsOfUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ListAgentsRequest,
      ondewo.nlu.AgentOuterClass.ListAgentsResponse> getListAllAgentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAllAgents",
      requestType = ondewo.nlu.AgentOuterClass.ListAgentsRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.ListAgentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ListAgentsRequest,
      ondewo.nlu.AgentOuterClass.ListAgentsResponse> getListAllAgentsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ListAgentsRequest, ondewo.nlu.AgentOuterClass.ListAgentsResponse> getListAllAgentsMethod;
    if ((getListAllAgentsMethod = AgentsGrpc.getListAllAgentsMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getListAllAgentsMethod = AgentsGrpc.getListAllAgentsMethod) == null) {
          AgentsGrpc.getListAllAgentsMethod = getListAllAgentsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.ListAgentsRequest, ondewo.nlu.AgentOuterClass.ListAgentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAllAgents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.ListAgentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.ListAgentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("ListAllAgents"))
              .build();
        }
      }
    }
    return getListAllAgentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.AddUserToProjectRequest,
      com.google.protobuf.Empty> getAddUserToProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserToProject",
      requestType = ondewo.nlu.AgentOuterClass.AddUserToProjectRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.AddUserToProjectRequest,
      com.google.protobuf.Empty> getAddUserToProjectMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.AddUserToProjectRequest, com.google.protobuf.Empty> getAddUserToProjectMethod;
    if ((getAddUserToProjectMethod = AgentsGrpc.getAddUserToProjectMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getAddUserToProjectMethod = AgentsGrpc.getAddUserToProjectMethod) == null) {
          AgentsGrpc.getAddUserToProjectMethod = getAddUserToProjectMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.AddUserToProjectRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserToProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.AddUserToProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("AddUserToProject"))
              .build();
        }
      }
    }
    return getAddUserToProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.RemoveUserFromProjectRequest,
      com.google.protobuf.Empty> getRemoveUserFromProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserFromProject",
      requestType = ondewo.nlu.AgentOuterClass.RemoveUserFromProjectRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.RemoveUserFromProjectRequest,
      com.google.protobuf.Empty> getRemoveUserFromProjectMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.RemoveUserFromProjectRequest, com.google.protobuf.Empty> getRemoveUserFromProjectMethod;
    if ((getRemoveUserFromProjectMethod = AgentsGrpc.getRemoveUserFromProjectMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getRemoveUserFromProjectMethod = AgentsGrpc.getRemoveUserFromProjectMethod) == null) {
          AgentsGrpc.getRemoveUserFromProjectMethod = getRemoveUserFromProjectMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.RemoveUserFromProjectRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserFromProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.RemoveUserFromProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("RemoveUserFromProject"))
              .build();
        }
      }
    }
    return getRemoveUserFromProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ListUsersInProjectRequest,
      ondewo.nlu.AgentOuterClass.ListUsersInProjectResponse> getListUsersInProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsersInProject",
      requestType = ondewo.nlu.AgentOuterClass.ListUsersInProjectRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.ListUsersInProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ListUsersInProjectRequest,
      ondewo.nlu.AgentOuterClass.ListUsersInProjectResponse> getListUsersInProjectMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ListUsersInProjectRequest, ondewo.nlu.AgentOuterClass.ListUsersInProjectResponse> getListUsersInProjectMethod;
    if ((getListUsersInProjectMethod = AgentsGrpc.getListUsersInProjectMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getListUsersInProjectMethod = AgentsGrpc.getListUsersInProjectMethod) == null) {
          AgentsGrpc.getListUsersInProjectMethod = getListUsersInProjectMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.ListUsersInProjectRequest, ondewo.nlu.AgentOuterClass.ListUsersInProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUsersInProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.ListUsersInProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.ListUsersInProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("ListUsersInProject"))
              .build();
        }
      }
    }
    return getListUsersInProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ondewo.nlu.AgentOuterClass.GetPlatformInfoResponse> getGetPlatformInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlatformInfo",
      requestType = com.google.protobuf.Empty.class,
      responseType = ondewo.nlu.AgentOuterClass.GetPlatformInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ondewo.nlu.AgentOuterClass.GetPlatformInfoResponse> getGetPlatformInfoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, ondewo.nlu.AgentOuterClass.GetPlatformInfoResponse> getGetPlatformInfoMethod;
    if ((getGetPlatformInfoMethod = AgentsGrpc.getGetPlatformInfoMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getGetPlatformInfoMethod = AgentsGrpc.getGetPlatformInfoMethod) == null) {
          AgentsGrpc.getGetPlatformInfoMethod = getGetPlatformInfoMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, ondewo.nlu.AgentOuterClass.GetPlatformInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlatformInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.GetPlatformInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("GetPlatformInfo"))
              .build();
        }
      }
    }
    return getGetPlatformInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ListProjectPermissionsRequest,
      ondewo.nlu.AgentOuterClass.ListProjectPermissionsResponse> getListProjectPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProjectPermissions",
      requestType = ondewo.nlu.AgentOuterClass.ListProjectPermissionsRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.ListProjectPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ListProjectPermissionsRequest,
      ondewo.nlu.AgentOuterClass.ListProjectPermissionsResponse> getListProjectPermissionsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ListProjectPermissionsRequest, ondewo.nlu.AgentOuterClass.ListProjectPermissionsResponse> getListProjectPermissionsMethod;
    if ((getListProjectPermissionsMethod = AgentsGrpc.getListProjectPermissionsMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getListProjectPermissionsMethod = AgentsGrpc.getListProjectPermissionsMethod) == null) {
          AgentsGrpc.getListProjectPermissionsMethod = getListProjectPermissionsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.ListProjectPermissionsRequest, ondewo.nlu.AgentOuterClass.ListProjectPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProjectPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.ListProjectPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.ListProjectPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("ListProjectPermissions"))
              .build();
        }
      }
    }
    return getListProjectPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.TrainAgentRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getTrainAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrainAgent",
      requestType = ondewo.nlu.AgentOuterClass.TrainAgentRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.TrainAgentRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getTrainAgentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.TrainAgentRequest, ondewo.nlu.OperationsOuterClass.Operation> getTrainAgentMethod;
    if ((getTrainAgentMethod = AgentsGrpc.getTrainAgentMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getTrainAgentMethod = AgentsGrpc.getTrainAgentMethod) == null) {
          AgentsGrpc.getTrainAgentMethod = getTrainAgentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.TrainAgentRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrainAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.TrainAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("TrainAgent"))
              .build();
        }
      }
    }
    return getTrainAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.BuildCacheRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getBuildCacheMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuildCache",
      requestType = ondewo.nlu.AgentOuterClass.BuildCacheRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.BuildCacheRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getBuildCacheMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.BuildCacheRequest, ondewo.nlu.OperationsOuterClass.Operation> getBuildCacheMethod;
    if ((getBuildCacheMethod = AgentsGrpc.getBuildCacheMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getBuildCacheMethod = AgentsGrpc.getBuildCacheMethod) == null) {
          AgentsGrpc.getBuildCacheMethod = getBuildCacheMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.BuildCacheRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuildCache"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.BuildCacheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("BuildCache"))
              .build();
        }
      }
    }
    return getBuildCacheMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ExportAgentRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getExportAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportAgent",
      requestType = ondewo.nlu.AgentOuterClass.ExportAgentRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ExportAgentRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getExportAgentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ExportAgentRequest, ondewo.nlu.OperationsOuterClass.Operation> getExportAgentMethod;
    if ((getExportAgentMethod = AgentsGrpc.getExportAgentMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getExportAgentMethod = AgentsGrpc.getExportAgentMethod) == null) {
          AgentsGrpc.getExportAgentMethod = getExportAgentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.ExportAgentRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.ExportAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("ExportAgent"))
              .build();
        }
      }
    }
    return getExportAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ExportBenchmarkAgentRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getExportBenchmarkAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportBenchmarkAgent",
      requestType = ondewo.nlu.AgentOuterClass.ExportBenchmarkAgentRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ExportBenchmarkAgentRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getExportBenchmarkAgentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ExportBenchmarkAgentRequest, ondewo.nlu.OperationsOuterClass.Operation> getExportBenchmarkAgentMethod;
    if ((getExportBenchmarkAgentMethod = AgentsGrpc.getExportBenchmarkAgentMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getExportBenchmarkAgentMethod = AgentsGrpc.getExportBenchmarkAgentMethod) == null) {
          AgentsGrpc.getExportBenchmarkAgentMethod = getExportBenchmarkAgentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.ExportBenchmarkAgentRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportBenchmarkAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.ExportBenchmarkAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("ExportBenchmarkAgent"))
              .build();
        }
      }
    }
    return getExportBenchmarkAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ImportAgentRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getImportAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportAgent",
      requestType = ondewo.nlu.AgentOuterClass.ImportAgentRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ImportAgentRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getImportAgentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ImportAgentRequest, ondewo.nlu.OperationsOuterClass.Operation> getImportAgentMethod;
    if ((getImportAgentMethod = AgentsGrpc.getImportAgentMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getImportAgentMethod = AgentsGrpc.getImportAgentMethod) == null) {
          AgentsGrpc.getImportAgentMethod = getImportAgentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.ImportAgentRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.ImportAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("ImportAgent"))
              .build();
        }
      }
    }
    return getImportAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.MigrateAgentRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getMigrateAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MigrateAgent",
      requestType = ondewo.nlu.AgentOuterClass.MigrateAgentRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.MigrateAgentRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getMigrateAgentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.MigrateAgentRequest, ondewo.nlu.OperationsOuterClass.Operation> getMigrateAgentMethod;
    if ((getMigrateAgentMethod = AgentsGrpc.getMigrateAgentMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getMigrateAgentMethod = AgentsGrpc.getMigrateAgentMethod) == null) {
          AgentsGrpc.getMigrateAgentMethod = getMigrateAgentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.MigrateAgentRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MigrateAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.MigrateAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("MigrateAgent"))
              .build();
        }
      }
    }
    return getMigrateAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.OptimizeRankingMatchRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getOptimizeRankingMatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OptimizeRankingMatch",
      requestType = ondewo.nlu.AgentOuterClass.OptimizeRankingMatchRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.OptimizeRankingMatchRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getOptimizeRankingMatchMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.OptimizeRankingMatchRequest, ondewo.nlu.OperationsOuterClass.Operation> getOptimizeRankingMatchMethod;
    if ((getOptimizeRankingMatchMethod = AgentsGrpc.getOptimizeRankingMatchMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getOptimizeRankingMatchMethod = AgentsGrpc.getOptimizeRankingMatchMethod) == null) {
          AgentsGrpc.getOptimizeRankingMatchMethod = getOptimizeRankingMatchMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.OptimizeRankingMatchRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OptimizeRankingMatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.OptimizeRankingMatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("OptimizeRankingMatch"))
              .build();
        }
      }
    }
    return getOptimizeRankingMatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.RestoreAgentRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getRestoreAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RestoreAgent",
      requestType = ondewo.nlu.AgentOuterClass.RestoreAgentRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.RestoreAgentRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getRestoreAgentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.RestoreAgentRequest, ondewo.nlu.OperationsOuterClass.Operation> getRestoreAgentMethod;
    if ((getRestoreAgentMethod = AgentsGrpc.getRestoreAgentMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getRestoreAgentMethod = AgentsGrpc.getRestoreAgentMethod) == null) {
          AgentsGrpc.getRestoreAgentMethod = getRestoreAgentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.RestoreAgentRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RestoreAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.RestoreAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("RestoreAgent"))
              .build();
        }
      }
    }
    return getRestoreAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.GetAgentStatisticsRequest,
      ondewo.nlu.AgentOuterClass.GetAgentStatisticsResponse> getGetAgentStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentStatistics",
      requestType = ondewo.nlu.AgentOuterClass.GetAgentStatisticsRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.GetAgentStatisticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.GetAgentStatisticsRequest,
      ondewo.nlu.AgentOuterClass.GetAgentStatisticsResponse> getGetAgentStatisticsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.GetAgentStatisticsRequest, ondewo.nlu.AgentOuterClass.GetAgentStatisticsResponse> getGetAgentStatisticsMethod;
    if ((getGetAgentStatisticsMethod = AgentsGrpc.getGetAgentStatisticsMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getGetAgentStatisticsMethod = AgentsGrpc.getGetAgentStatisticsMethod) == null) {
          AgentsGrpc.getGetAgentStatisticsMethod = getGetAgentStatisticsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.GetAgentStatisticsRequest, ondewo.nlu.AgentOuterClass.GetAgentStatisticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgentStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.GetAgentStatisticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.GetAgentStatisticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("GetAgentStatistics"))
              .build();
        }
      }
    }
    return getGetAgentStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.GetSessionsStatisticsRequest,
      ondewo.nlu.AgentOuterClass.GetSessionsStatisticsResponse> getGetSessionsStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSessionsStatistics",
      requestType = ondewo.nlu.AgentOuterClass.GetSessionsStatisticsRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.GetSessionsStatisticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.GetSessionsStatisticsRequest,
      ondewo.nlu.AgentOuterClass.GetSessionsStatisticsResponse> getGetSessionsStatisticsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.GetSessionsStatisticsRequest, ondewo.nlu.AgentOuterClass.GetSessionsStatisticsResponse> getGetSessionsStatisticsMethod;
    if ((getGetSessionsStatisticsMethod = AgentsGrpc.getGetSessionsStatisticsMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getGetSessionsStatisticsMethod = AgentsGrpc.getGetSessionsStatisticsMethod) == null) {
          AgentsGrpc.getGetSessionsStatisticsMethod = getGetSessionsStatisticsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.GetSessionsStatisticsRequest, ondewo.nlu.AgentOuterClass.GetSessionsStatisticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSessionsStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.GetSessionsStatisticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.GetSessionsStatisticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("GetSessionsStatistics"))
              .build();
        }
      }
    }
    return getGetSessionsStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesRequest,
      ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesResponse> getGetSessionsStatisticsTimeSeriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSessionsStatisticsTimeSeries",
      requestType = ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesRequest,
      ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesResponse> getGetSessionsStatisticsTimeSeriesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesRequest, ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesResponse> getGetSessionsStatisticsTimeSeriesMethod;
    if ((getGetSessionsStatisticsTimeSeriesMethod = AgentsGrpc.getGetSessionsStatisticsTimeSeriesMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getGetSessionsStatisticsTimeSeriesMethod = AgentsGrpc.getGetSessionsStatisticsTimeSeriesMethod) == null) {
          AgentsGrpc.getGetSessionsStatisticsTimeSeriesMethod = getGetSessionsStatisticsTimeSeriesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesRequest, ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSessionsStatisticsTimeSeries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("GetSessionsStatisticsTimeSeries"))
              .build();
        }
      }
    }
    return getGetSessionsStatisticsTimeSeriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.SetAgentStatusRequest,
      ondewo.nlu.AgentOuterClass.Agent> getSetAgentStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAgentStatus",
      requestType = ondewo.nlu.AgentOuterClass.SetAgentStatusRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.Agent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.SetAgentStatusRequest,
      ondewo.nlu.AgentOuterClass.Agent> getSetAgentStatusMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.SetAgentStatusRequest, ondewo.nlu.AgentOuterClass.Agent> getSetAgentStatusMethod;
    if ((getSetAgentStatusMethod = AgentsGrpc.getSetAgentStatusMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getSetAgentStatusMethod = AgentsGrpc.getSetAgentStatusMethod) == null) {
          AgentsGrpc.getSetAgentStatusMethod = getSetAgentStatusMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.SetAgentStatusRequest, ondewo.nlu.AgentOuterClass.Agent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAgentStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.SetAgentStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.Agent.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("SetAgentStatus"))
              .build();
        }
      }
    }
    return getSetAgentStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.SetResourcesRequest,
      com.google.protobuf.Empty> getSetResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetResources",
      requestType = ondewo.nlu.AgentOuterClass.SetResourcesRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.SetResourcesRequest,
      com.google.protobuf.Empty> getSetResourcesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.SetResourcesRequest, com.google.protobuf.Empty> getSetResourcesMethod;
    if ((getSetResourcesMethod = AgentsGrpc.getSetResourcesMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getSetResourcesMethod = AgentsGrpc.getSetResourcesMethod) == null) {
          AgentsGrpc.getSetResourcesMethod = getSetResourcesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.SetResourcesRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.SetResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("SetResources"))
              .build();
        }
      }
    }
    return getSetResourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.DeleteResourcesRequest,
      com.google.protobuf.Empty> getDeleteResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteResources",
      requestType = ondewo.nlu.AgentOuterClass.DeleteResourcesRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.DeleteResourcesRequest,
      com.google.protobuf.Empty> getDeleteResourcesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.DeleteResourcesRequest, com.google.protobuf.Empty> getDeleteResourcesMethod;
    if ((getDeleteResourcesMethod = AgentsGrpc.getDeleteResourcesMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getDeleteResourcesMethod = AgentsGrpc.getDeleteResourcesMethod) == null) {
          AgentsGrpc.getDeleteResourcesMethod = getDeleteResourcesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.DeleteResourcesRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.DeleteResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("DeleteResources"))
              .build();
        }
      }
    }
    return getDeleteResourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ExportResourcesRequest,
      ondewo.nlu.AgentOuterClass.ExportResourcesResponse> getExportResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportResources",
      requestType = ondewo.nlu.AgentOuterClass.ExportResourcesRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.ExportResourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ExportResourcesRequest,
      ondewo.nlu.AgentOuterClass.ExportResourcesResponse> getExportResourcesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ExportResourcesRequest, ondewo.nlu.AgentOuterClass.ExportResourcesResponse> getExportResourcesMethod;
    if ((getExportResourcesMethod = AgentsGrpc.getExportResourcesMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getExportResourcesMethod = AgentsGrpc.getExportResourcesMethod) == null) {
          AgentsGrpc.getExportResourcesMethod = getExportResourcesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.ExportResourcesRequest, ondewo.nlu.AgentOuterClass.ExportResourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.ExportResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.ExportResourcesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("ExportResources"))
              .build();
        }
      }
    }
    return getExportResourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.GetModelStatusesRequest,
      ondewo.nlu.AgentOuterClass.GetModelStatusesResponse> getGetModelStatusesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModelStatuses",
      requestType = ondewo.nlu.AgentOuterClass.GetModelStatusesRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.GetModelStatusesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.GetModelStatusesRequest,
      ondewo.nlu.AgentOuterClass.GetModelStatusesResponse> getGetModelStatusesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.GetModelStatusesRequest, ondewo.nlu.AgentOuterClass.GetModelStatusesResponse> getGetModelStatusesMethod;
    if ((getGetModelStatusesMethod = AgentsGrpc.getGetModelStatusesMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getGetModelStatusesMethod = AgentsGrpc.getGetModelStatusesMethod) == null) {
          AgentsGrpc.getGetModelStatusesMethod = getGetModelStatusesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.GetModelStatusesRequest, ondewo.nlu.AgentOuterClass.GetModelStatusesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModelStatuses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.GetModelStatusesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.GetModelStatusesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("GetModelStatuses"))
              .build();
        }
      }
    }
    return getGetModelStatusesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.GetPlatformMappingRequest,
      ondewo.nlu.AgentOuterClass.PlatformMapping> getGetPlatformMappingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlatformMapping",
      requestType = ondewo.nlu.AgentOuterClass.GetPlatformMappingRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.PlatformMapping.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.GetPlatformMappingRequest,
      ondewo.nlu.AgentOuterClass.PlatformMapping> getGetPlatformMappingMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.GetPlatformMappingRequest, ondewo.nlu.AgentOuterClass.PlatformMapping> getGetPlatformMappingMethod;
    if ((getGetPlatformMappingMethod = AgentsGrpc.getGetPlatformMappingMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getGetPlatformMappingMethod = AgentsGrpc.getGetPlatformMappingMethod) == null) {
          AgentsGrpc.getGetPlatformMappingMethod = getGetPlatformMappingMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.GetPlatformMappingRequest, ondewo.nlu.AgentOuterClass.PlatformMapping>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlatformMapping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.GetPlatformMappingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.PlatformMapping.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("GetPlatformMapping"))
              .build();
        }
      }
    }
    return getGetPlatformMappingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.PlatformMapping,
      ondewo.nlu.AgentOuterClass.PlatformMapping> getSetPlatformMappingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPlatformMapping",
      requestType = ondewo.nlu.AgentOuterClass.PlatformMapping.class,
      responseType = ondewo.nlu.AgentOuterClass.PlatformMapping.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.PlatformMapping,
      ondewo.nlu.AgentOuterClass.PlatformMapping> getSetPlatformMappingMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.PlatformMapping, ondewo.nlu.AgentOuterClass.PlatformMapping> getSetPlatformMappingMethod;
    if ((getSetPlatformMappingMethod = AgentsGrpc.getSetPlatformMappingMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getSetPlatformMappingMethod = AgentsGrpc.getSetPlatformMappingMethod) == null) {
          AgentsGrpc.getSetPlatformMappingMethod = getSetPlatformMappingMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.PlatformMapping, ondewo.nlu.AgentOuterClass.PlatformMapping>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPlatformMapping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.PlatformMapping.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.PlatformMapping.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("SetPlatformMapping"))
              .build();
        }
      }
    }
    return getSetPlatformMappingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntityType> getGetFullTextSearchEntityTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFullTextSearchEntityType",
      requestType = ondewo.nlu.AgentOuterClass.FullTextSearchRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntityType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntityType> getGetFullTextSearchEntityTypeMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntityType> getGetFullTextSearchEntityTypeMethod;
    if ((getGetFullTextSearchEntityTypeMethod = AgentsGrpc.getGetFullTextSearchEntityTypeMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getGetFullTextSearchEntityTypeMethod = AgentsGrpc.getGetFullTextSearchEntityTypeMethod) == null) {
          AgentsGrpc.getGetFullTextSearchEntityTypeMethod = getGetFullTextSearchEntityTypeMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntityType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFullTextSearchEntityType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntityType.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("GetFullTextSearchEntityType"))
              .build();
        }
      }
    }
    return getGetFullTextSearchEntityTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntity> getGetFullTextSearchEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFullTextSearchEntity",
      requestType = ondewo.nlu.AgentOuterClass.FullTextSearchRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntity.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntity> getGetFullTextSearchEntityMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntity> getGetFullTextSearchEntityMethod;
    if ((getGetFullTextSearchEntityMethod = AgentsGrpc.getGetFullTextSearchEntityMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getGetFullTextSearchEntityMethod = AgentsGrpc.getGetFullTextSearchEntityMethod) == null) {
          AgentsGrpc.getGetFullTextSearchEntityMethod = getGetFullTextSearchEntityMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFullTextSearchEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntity.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("GetFullTextSearchEntity"))
              .build();
        }
      }
    }
    return getGetFullTextSearchEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntitySynonym> getGetFullTextSearchEntitySynonymMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFullTextSearchEntitySynonym",
      requestType = ondewo.nlu.AgentOuterClass.FullTextSearchRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntitySynonym.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntitySynonym> getGetFullTextSearchEntitySynonymMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntitySynonym> getGetFullTextSearchEntitySynonymMethod;
    if ((getGetFullTextSearchEntitySynonymMethod = AgentsGrpc.getGetFullTextSearchEntitySynonymMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getGetFullTextSearchEntitySynonymMethod = AgentsGrpc.getGetFullTextSearchEntitySynonymMethod) == null) {
          AgentsGrpc.getGetFullTextSearchEntitySynonymMethod = getGetFullTextSearchEntitySynonymMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntitySynonym>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFullTextSearchEntitySynonym"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntitySynonym.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("GetFullTextSearchEntitySynonym"))
              .build();
        }
      }
    }
    return getGetFullTextSearchEntitySynonymMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntent> getGetFullTextSearchIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFullTextSearchIntent",
      requestType = ondewo.nlu.AgentOuterClass.FullTextSearchRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntent> getGetFullTextSearchIntentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntent> getGetFullTextSearchIntentMethod;
    if ((getGetFullTextSearchIntentMethod = AgentsGrpc.getGetFullTextSearchIntentMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getGetFullTextSearchIntentMethod = AgentsGrpc.getGetFullTextSearchIntentMethod) == null) {
          AgentsGrpc.getGetFullTextSearchIntentMethod = getGetFullTextSearchIntentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFullTextSearchIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntent.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("GetFullTextSearchIntent"))
              .build();
        }
      }
    }
    return getGetFullTextSearchIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextIn> getGetFullTextSearchIntentContextInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFullTextSearchIntentContextIn",
      requestType = ondewo.nlu.AgentOuterClass.FullTextSearchRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextIn.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextIn> getGetFullTextSearchIntentContextInMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextIn> getGetFullTextSearchIntentContextInMethod;
    if ((getGetFullTextSearchIntentContextInMethod = AgentsGrpc.getGetFullTextSearchIntentContextInMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getGetFullTextSearchIntentContextInMethod = AgentsGrpc.getGetFullTextSearchIntentContextInMethod) == null) {
          AgentsGrpc.getGetFullTextSearchIntentContextInMethod = getGetFullTextSearchIntentContextInMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextIn>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFullTextSearchIntentContextIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextIn.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("GetFullTextSearchIntentContextIn"))
              .build();
        }
      }
    }
    return getGetFullTextSearchIntentContextInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextOut> getGetFullTextSearchIntentContextOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFullTextSearchIntentContextOut",
      requestType = ondewo.nlu.AgentOuterClass.FullTextSearchRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextOut.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextOut> getGetFullTextSearchIntentContextOutMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextOut> getGetFullTextSearchIntentContextOutMethod;
    if ((getGetFullTextSearchIntentContextOutMethod = AgentsGrpc.getGetFullTextSearchIntentContextOutMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getGetFullTextSearchIntentContextOutMethod = AgentsGrpc.getGetFullTextSearchIntentContextOutMethod) == null) {
          AgentsGrpc.getGetFullTextSearchIntentContextOutMethod = getGetFullTextSearchIntentContextOutMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextOut>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFullTextSearchIntentContextOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextOut.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("GetFullTextSearchIntentContextOut"))
              .build();
        }
      }
    }
    return getGetFullTextSearchIntentContextOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentUsersays> getGetFullTextSearchIntentUsersaysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFullTextSearchIntentUsersays",
      requestType = ondewo.nlu.AgentOuterClass.FullTextSearchRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentUsersays.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentUsersays> getGetFullTextSearchIntentUsersaysMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentUsersays> getGetFullTextSearchIntentUsersaysMethod;
    if ((getGetFullTextSearchIntentUsersaysMethod = AgentsGrpc.getGetFullTextSearchIntentUsersaysMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getGetFullTextSearchIntentUsersaysMethod = AgentsGrpc.getGetFullTextSearchIntentUsersaysMethod) == null) {
          AgentsGrpc.getGetFullTextSearchIntentUsersaysMethod = getGetFullTextSearchIntentUsersaysMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentUsersays>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFullTextSearchIntentUsersays"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentUsersays.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("GetFullTextSearchIntentUsersays"))
              .build();
        }
      }
    }
    return getGetFullTextSearchIntentUsersaysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentTags> getGetFullTextSearchIntentTagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFullTextSearchIntentTags",
      requestType = ondewo.nlu.AgentOuterClass.FullTextSearchRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentTags.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentTags> getGetFullTextSearchIntentTagsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentTags> getGetFullTextSearchIntentTagsMethod;
    if ((getGetFullTextSearchIntentTagsMethod = AgentsGrpc.getGetFullTextSearchIntentTagsMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getGetFullTextSearchIntentTagsMethod = AgentsGrpc.getGetFullTextSearchIntentTagsMethod) == null) {
          AgentsGrpc.getGetFullTextSearchIntentTagsMethod = getGetFullTextSearchIntentTagsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentTags>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFullTextSearchIntentTags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentTags.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("GetFullTextSearchIntentTags"))
              .build();
        }
      }
    }
    return getGetFullTextSearchIntentTagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentResponse> getGetFullTextSearchIntentResponseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFullTextSearchIntentResponse",
      requestType = ondewo.nlu.AgentOuterClass.FullTextSearchRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentResponse> getGetFullTextSearchIntentResponseMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentResponse> getGetFullTextSearchIntentResponseMethod;
    if ((getGetFullTextSearchIntentResponseMethod = AgentsGrpc.getGetFullTextSearchIntentResponseMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getGetFullTextSearchIntentResponseMethod = AgentsGrpc.getGetFullTextSearchIntentResponseMethod) == null) {
          AgentsGrpc.getGetFullTextSearchIntentResponseMethod = getGetFullTextSearchIntentResponseMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFullTextSearchIntentResponse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("GetFullTextSearchIntentResponse"))
              .build();
        }
      }
    }
    return getGetFullTextSearchIntentResponseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentParameters> getGetFullTextSearchIntentParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFullTextSearchIntentParameters",
      requestType = ondewo.nlu.AgentOuterClass.FullTextSearchRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentParameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
      ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentParameters> getGetFullTextSearchIntentParametersMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentParameters> getGetFullTextSearchIntentParametersMethod;
    if ((getGetFullTextSearchIntentParametersMethod = AgentsGrpc.getGetFullTextSearchIntentParametersMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getGetFullTextSearchIntentParametersMethod = AgentsGrpc.getGetFullTextSearchIntentParametersMethod) == null) {
          AgentsGrpc.getGetFullTextSearchIntentParametersMethod = getGetFullTextSearchIntentParametersMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.FullTextSearchRequest, ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentParameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFullTextSearchIntentParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentParameters.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("GetFullTextSearchIntentParameters"))
              .build();
        }
      }
    }
    return getGetFullTextSearchIntentParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ReindexAgentRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getReindexAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReindexAgent",
      requestType = ondewo.nlu.AgentOuterClass.ReindexAgentRequest.class,
      responseType = ondewo.nlu.OperationsOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ReindexAgentRequest,
      ondewo.nlu.OperationsOuterClass.Operation> getReindexAgentMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ReindexAgentRequest, ondewo.nlu.OperationsOuterClass.Operation> getReindexAgentMethod;
    if ((getReindexAgentMethod = AgentsGrpc.getReindexAgentMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getReindexAgentMethod = AgentsGrpc.getReindexAgentMethod) == null) {
          AgentsGrpc.getReindexAgentMethod = getReindexAgentMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.ReindexAgentRequest, ondewo.nlu.OperationsOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReindexAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.ReindexAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.OperationsOuterClass.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("ReindexAgent"))
              .build();
        }
      }
    }
    return getReindexAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserRequest,
      ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserResponse> getCreateProjectTechnicalUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProjectTechnicalUser",
      requestType = ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserRequest,
      ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserResponse> getCreateProjectTechnicalUserMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserRequest, ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserResponse> getCreateProjectTechnicalUserMethod;
    if ((getCreateProjectTechnicalUserMethod = AgentsGrpc.getCreateProjectTechnicalUserMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getCreateProjectTechnicalUserMethod = AgentsGrpc.getCreateProjectTechnicalUserMethod) == null) {
          AgentsGrpc.getCreateProjectTechnicalUserMethod = getCreateProjectTechnicalUserMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserRequest, ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProjectTechnicalUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("CreateProjectTechnicalUser"))
              .build();
        }
      }
    }
    return getCreateProjectTechnicalUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersRequest,
      ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersResponse> getListProjectTechnicalUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProjectTechnicalUsers",
      requestType = ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersRequest,
      ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersResponse> getListProjectTechnicalUsersMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersRequest, ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersResponse> getListProjectTechnicalUsersMethod;
    if ((getListProjectTechnicalUsersMethod = AgentsGrpc.getListProjectTechnicalUsersMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getListProjectTechnicalUsersMethod = AgentsGrpc.getListProjectTechnicalUsersMethod) == null) {
          AgentsGrpc.getListProjectTechnicalUsersMethod = getListProjectTechnicalUsersMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersRequest, ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProjectTechnicalUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("ListProjectTechnicalUsers"))
              .build();
        }
      }
    }
    return getListProjectTechnicalUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.DeleteProjectTechnicalUserRequest,
      com.google.protobuf.Empty> getDeleteProjectTechnicalUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProjectTechnicalUser",
      requestType = ondewo.nlu.AgentOuterClass.DeleteProjectTechnicalUserRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.DeleteProjectTechnicalUserRequest,
      com.google.protobuf.Empty> getDeleteProjectTechnicalUserMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.DeleteProjectTechnicalUserRequest, com.google.protobuf.Empty> getDeleteProjectTechnicalUserMethod;
    if ((getDeleteProjectTechnicalUserMethod = AgentsGrpc.getDeleteProjectTechnicalUserMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getDeleteProjectTechnicalUserMethod = AgentsGrpc.getDeleteProjectTechnicalUserMethod) == null) {
          AgentsGrpc.getDeleteProjectTechnicalUserMethod = getDeleteProjectTechnicalUserMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.DeleteProjectTechnicalUserRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProjectTechnicalUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.DeleteProjectTechnicalUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("DeleteProjectTechnicalUser"))
              .build();
        }
      }
    }
    return getDeleteProjectTechnicalUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordRequest,
      ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordResponse> getRotateProjectTechnicalUserPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RotateProjectTechnicalUserPassword",
      requestType = ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordRequest.class,
      responseType = ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordRequest,
      ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordResponse> getRotateProjectTechnicalUserPasswordMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordRequest, ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordResponse> getRotateProjectTechnicalUserPasswordMethod;
    if ((getRotateProjectTechnicalUserPasswordMethod = AgentsGrpc.getRotateProjectTechnicalUserPasswordMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getRotateProjectTechnicalUserPasswordMethod = AgentsGrpc.getRotateProjectTechnicalUserPasswordMethod) == null) {
          AgentsGrpc.getRotateProjectTechnicalUserPasswordMethod = getRotateProjectTechnicalUserPasswordMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordRequest, ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RotateProjectTechnicalUserPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("RotateProjectTechnicalUserPassword"))
              .build();
        }
      }
    }
    return getRotateProjectTechnicalUserPasswordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AgentsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentsStub>() {
        @java.lang.Override
        public AgentsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentsStub(channel, callOptions);
        }
      };
    return AgentsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AgentsBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentsBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentsBlockingV2Stub>() {
        @java.lang.Override
        public AgentsBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentsBlockingV2Stub(channel, callOptions);
        }
      };
    return AgentsBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentsBlockingStub>() {
        @java.lang.Override
        public AgentsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentsBlockingStub(channel, callOptions);
        }
      };
    return AgentsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgentsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentsFutureStub>() {
        @java.lang.Override
        public AgentsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentsFutureStub(channel, callOptions);
        }
      };
    return AgentsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Agents are best described as Natural Language Understanding (NLU) modules that transform user requests into actionable data. You can include agents in your app, product, or service to determine user intent and respond to the user in a natural way.
   * After you create an agent, you can add &lt;a href="index.html#ondewo.nlu.Intent"&gt;Intents&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.Context"&gt;Contexts&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.EntityType"&gt;Entity Types&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.WebhookRequest"&gt;Webhooks&lt;/a&gt;, and so on to manage the flow of a conversation and match user input to predefined intents and actions.
   * You can create an agent using both Dialogflow Standard Edition and Dialogflow Enterprise Edition. For details, see &lt;a href="https://docs.cloud.google.com/dialogflow/docs/editions"&gt;Dialogflow Editions&lt;/a&gt;.
   * You can save your agent for backup or versioning by exporting the agent by using the &lt;a href="index.html#ondewo.nlu.Agents.ExportAgent"&gt;ExportAgent&lt;/a&gt; method. You can import a saved agent by using the &lt;a href="index.html#ondewo.nlu.Agents.ImportAgent"&gt;ImportAgent&lt;/a&gt; method.
   * Dialogflow provides several &lt;a href="https://dialogflow.com/docs/prebuilt-agents"&gt;prebuilt agents&lt;/a&gt; for common conversation scenarios such as determining a date and time, converting currency, and so on.
   * For more information about agents, see the &lt;a href="https://dialogflow.com/docs/agents"&gt;Dialogflow documentation&lt;/a&gt;.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "agent": {
     *     "display_name": "My Pizza Bot",
     *     "default_language_code": "en",
     *     "supported_language_codes": ["en"],
     *     "time_zone": "Europe/Vienna",
     *     "nlu_platform": "ONDEWO"
     *   }
     * }' localhost:50055 ondewo.nlu.Agents.CreateAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *   "display_name": "Pizza Bot",
     *   "default_language_code": "en",
     *   "supported_language_codes": [
     *     "en"
     *   ],
     *   "time_zone": "Europe/Vienna",
     *   "nlu_platform": "ONDEWO",
     *   "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    default void createAgent(ondewo.nlu.AgentOuterClass.CreateAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.Agent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAgentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "agent": {
     *     "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *     "display_name": "Pizza Bot 2",
     *     "supported_language_codes": ["en", "de"]
     *   },
     *   "update_mask": {
     *     "paths": [
     *       "agent.display_name",
     *       "agent.supported_language_codes"
     *     ]
     *   }
     * }' localhost:50055 ondewo.nlu.Agents.UpdateAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *   "display_name": "Pizza Bot 2",
     *   "default_language_code": "en",
     *   "supported_language_codes": [
     *     "en",
     *     "de"
     *   ],
     *   "time_zone": "Europe/Vienna",
     *   "nlu_platform": "ONDEWO",
     *   "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    default void updateAgent(ondewo.nlu.AgentOuterClass.UpdateAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.Agent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAgentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent"
     * }' localhost:50055 ondewo.nlu.Agents.GetAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *   "display_name": "Pizza Bot 2",
     *   "default_language_code": "en",
     *   "supported_language_codes": [
     *     "en",
     *     "de"
     *   ],
     *   "time_zone": "Europe/Vienna",
     *   "nlu_platform": "ONDEWO",
     *   "configs": {...},
     *   "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    default void getAgent(ondewo.nlu.AgentOuterClass.GetAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.Agent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent"
     * }' localhost:50055 ondewo.nlu.Agents.DeleteAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{}&lt;/samp&gt;
     * </pre>
     */
    default void deleteAgent(ondewo.nlu.AgentOuterClass.DeleteAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAgentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes all agents in the server (for development purposes only).
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.DeleteAllAgents
     * &lt;/pre&gt;
     * &lt;samp&gt;{}&lt;/samp&gt;
     * </pre>
     */
    default void deleteAllAgents(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAllAgentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists agents in the server associated to the current user
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.ListAgents
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "agents_with_owners": [
     *     {
     *       "agent": {
     *         "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *         "display_name": "Pizza Bot 2",
     *         "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     *       },
     *       "owner": {
     *         "user_id": "5aac51b8-668f-49dd-913f-cc683e56af34",
     *         "display_name": "admin",
     *         "server_role_id": 3,
     *         "user_email": "admin&#64;ondewo.com"
     *       }
     *     }
     *   ],
     *   "next_page_token": "current_index-1"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    default void listAgents(ondewo.nlu.AgentOuterClass.ListAgentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ListAgentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists agents in the server associated to the given user
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.ListAgentsOfUser
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "agents_of_user_with_owners": [
     *     {
     *       "agent_with_owner": {
     *         "agent": {
     *           "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *           "display_name": "Pizza Bot 2",
     *           "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     *         },
     *         "owner": {
     *           "user_id": "5aac51b8-668f-49dd-913f-cc683e56af34",
     *           "display_name": "admin",
     *           "server_role_id": 3,
     *           "user_email": "admin&#64;ondewo.com"
     *         }
     *       },
     *       "project_role": {
     *         "role_id": 4,
     *         "name": "ADMIN"
     *       }
     *     }
     *   ],
     *   "next_page_token": "current_index-1"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    default void listAgentsOfUser(ondewo.nlu.AgentOuterClass.ListAgentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ListAgentsOfUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgentsOfUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all agents in the server
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.ListAllAgents
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "agents_with_owners": [
     *     {
     *       "agent": {
     *         "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *         "display_name": "Pizza Bot 2",
     *         "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     *       },
     *       "owner": {
     *         "user_id": "5aac51b8-668f-49dd-913f-cc683e56af34",
     *         "display_name": "admin",
     *         "server_role_id": 3,
     *         "user_email": "admin&#64;ondewo.com"
     *       }
     *     }
     *   ],
     *   "next_page_token": "current_index-1"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    default void listAllAgents(ondewo.nlu.AgentOuterClass.ListAgentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ListAgentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAllAgentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a user with specified id to the project (agent)
     * </pre>
     */
    default void addUserToProject(ondewo.nlu.AgentOuterClass.AddUserToProjectRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserToProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes a user with specified id from the project (agent)
     * </pre>
     */
    default void removeUserFromProject(ondewo.nlu.AgentOuterClass.RemoveUserFromProjectRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUserFromProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists users in the project (agent)
     * </pre>
     */
    default void listUsersInProject(ondewo.nlu.AgentOuterClass.ListUsersInProjectRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ListUsersInProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsersInProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets information from the platform
     * &lt;br&gt;
     * Request parameter:
     * &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;
     * </pre>
     */
    default void getPlatformInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.GetPlatformInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlatformInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * List permissions from the project (agent)
     * </pre>
     */
    default void listProjectPermissions(ondewo.nlu.AgentOuterClass.ListProjectPermissionsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ListProjectPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProjectPermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Trains the specified agent.
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    default void trainAgent(ondewo.nlu.AgentOuterClass.TrainAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrainAgentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Builds cache for the specified agent.
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    default void buildCache(ondewo.nlu.AgentOuterClass.BuildCacheRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuildCacheMethod(), responseObserver);
    }

    /**
     * <pre>
     * Exports the specified agent to a ZIP file.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="index.html#ondewo.nlu.ExportAgentResponse"&gt;ExportAgentResponse&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    default void exportAgent(ondewo.nlu.AgentOuterClass.ExportAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExportAgentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Exports the specified train agent to a ZIP file after train-test split, returns the test TrainingPhrase list.
     * </pre>
     */
    default void exportBenchmarkAgent(ondewo.nlu.AgentOuterClass.ExportBenchmarkAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExportBenchmarkAgentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Imports the specified agent from a ZIP file.
     *&lt;br&gt;
     * Uploads new intents and entity types without deleting the existing ones.
     * Intents and entity types with the same name are replaced with the new
     * versions from ImportAgentRequest.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    default void importAgent(ondewo.nlu.AgentOuterClass.ImportAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportAgentMethod(), responseObserver);
    }

    /**
     */
    default void migrateAgent(ondewo.nlu.AgentOuterClass.MigrateAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMigrateAgentMethod(), responseObserver);
    }

    /**
     */
    default void optimizeRankingMatch(ondewo.nlu.AgentOuterClass.OptimizeRankingMatchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOptimizeRankingMatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Restores the specified agent from a ZIP file.
     *&lt;br&gt;
     * Replaces the current agent version with a new one. All the intents and
     * entity types in the older version are deleted.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    default void restoreAgent(ondewo.nlu.AgentOuterClass.RestoreAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRestoreAgentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets statistics for the agent
     * </pre>
     */
    default void getAgentStatistics(ondewo.nlu.AgentOuterClass.GetAgentStatisticsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.GetAgentStatisticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgentStatisticsMethod(), responseObserver);
    }

    /**
     */
    default void getSessionsStatistics(ondewo.nlu.AgentOuterClass.GetSessionsStatisticsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.GetSessionsStatisticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSessionsStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets LLM telemetry statistics for sessions bucketed over time (time series).
     * Supports LLM-typed report types (SESSION_LLM_*) only.
     * </pre>
     */
    default void getSessionsStatisticsTimeSeries(ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSessionsStatisticsTimeSeriesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets status for the agent
     * </pre>
     */
    default void setAgentStatus(ondewo.nlu.AgentOuterClass.SetAgentStatusRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.Agent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAgentStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets resources
     * </pre>
     */
    default void setResources(ondewo.nlu.AgentOuterClass.SetResourcesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetResourcesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes resources
     * </pre>
     */
    default void deleteResources(ondewo.nlu.AgentOuterClass.DeleteResourcesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteResourcesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Exports resources
     * </pre>
     */
    default void exportResources(ondewo.nlu.AgentOuterClass.ExportResourcesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ExportResourcesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExportResourcesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get statuses of models related to project
     * </pre>
     */
    default void getModelStatuses(ondewo.nlu.AgentOuterClass.GetModelStatusesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.GetModelStatusesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModelStatusesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all set platform name mappings for an Agent
     * </pre>
     */
    default void getPlatformMapping(ondewo.nlu.AgentOuterClass.GetPlatformMappingRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.PlatformMapping> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlatformMappingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set platform name mappings for an Agent
     * </pre>
     */
    default void setPlatformMapping(ondewo.nlu.AgentOuterClass.PlatformMapping request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.PlatformMapping> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPlatformMappingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in entity types
     * </pre>
     */
    default void getFullTextSearchEntityType(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntityType> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFullTextSearchEntityTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in entities
     * </pre>
     */
    default void getFullTextSearchEntity(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntity> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFullTextSearchEntityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in entity synonyms
     * </pre>
     */
    default void getFullTextSearchEntitySynonym(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntitySynonym> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFullTextSearchEntitySynonymMethod(), responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in intents
     * </pre>
     */
    default void getFullTextSearchIntent(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFullTextSearchIntentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in context ins of intents
     * </pre>
     */
    default void getFullTextSearchIntentContextIn(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextIn> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFullTextSearchIntentContextInMethod(), responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in context outs of intents
     * </pre>
     */
    default void getFullTextSearchIntentContextOut(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextOut> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFullTextSearchIntentContextOutMethod(), responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in user says of intents
     * </pre>
     */
    default void getFullTextSearchIntentUsersays(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentUsersays> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFullTextSearchIntentUsersaysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in tags of intents
     * </pre>
     */
    default void getFullTextSearchIntentTags(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentTags> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFullTextSearchIntentTagsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in responses of intents
     * </pre>
     */
    default void getFullTextSearchIntentResponse(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFullTextSearchIntentResponseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in parameters of intents
     * </pre>
     */
    default void getFullTextSearchIntentParameters(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentParameters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFullTextSearchIntentParametersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Force reindexing Intent and Entity data of Agent
     * </pre>
     */
    default void reindexAgent(ondewo.nlu.AgentOuterClass.ReindexAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReindexAgentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a project-scoped technical user (a normal, 2FA-exempt account holding
     * PROJECT_EXECUTOR on this one project) for headless/machine access (e.g.
     * ondewo-sip/csi/vtsi) via the ROPC login bridge. The generated password is
     * returned ONCE in the response and is not retrievable afterwards.
     * </pre>
     */
    default void createProjectTechnicalUser(ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProjectTechnicalUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the project-scoped technical users of the project (agent).
     * </pre>
     */
    default void listProjectTechnicalUsers(ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProjectTechnicalUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a project-scoped technical user (removes the Keycloak user and the
     * project membership/projection rows).
     * </pre>
     */
    default void deleteProjectTechnicalUser(ondewo.nlu.AgentOuterClass.DeleteProjectTechnicalUserRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProjectTechnicalUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Rotates the password of a project-scoped technical user. Invalidates the old
     * password and returns the new generated password ONCE in the response.
     * </pre>
     */
    default void rotateProjectTechnicalUserPassword(ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRotateProjectTechnicalUserPasswordMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Agents.
   * <pre>
   * Agents are best described as Natural Language Understanding (NLU) modules that transform user requests into actionable data. You can include agents in your app, product, or service to determine user intent and respond to the user in a natural way.
   * After you create an agent, you can add &lt;a href="index.html#ondewo.nlu.Intent"&gt;Intents&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.Context"&gt;Contexts&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.EntityType"&gt;Entity Types&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.WebhookRequest"&gt;Webhooks&lt;/a&gt;, and so on to manage the flow of a conversation and match user input to predefined intents and actions.
   * You can create an agent using both Dialogflow Standard Edition and Dialogflow Enterprise Edition. For details, see &lt;a href="https://docs.cloud.google.com/dialogflow/docs/editions"&gt;Dialogflow Editions&lt;/a&gt;.
   * You can save your agent for backup or versioning by exporting the agent by using the &lt;a href="index.html#ondewo.nlu.Agents.ExportAgent"&gt;ExportAgent&lt;/a&gt; method. You can import a saved agent by using the &lt;a href="index.html#ondewo.nlu.Agents.ImportAgent"&gt;ImportAgent&lt;/a&gt; method.
   * Dialogflow provides several &lt;a href="https://dialogflow.com/docs/prebuilt-agents"&gt;prebuilt agents&lt;/a&gt; for common conversation scenarios such as determining a date and time, converting currency, and so on.
   * For more information about agents, see the &lt;a href="https://dialogflow.com/docs/agents"&gt;Dialogflow documentation&lt;/a&gt;.
   * </pre>
   */
  public static abstract class AgentsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AgentsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Agents.
   * <pre>
   * Agents are best described as Natural Language Understanding (NLU) modules that transform user requests into actionable data. You can include agents in your app, product, or service to determine user intent and respond to the user in a natural way.
   * After you create an agent, you can add &lt;a href="index.html#ondewo.nlu.Intent"&gt;Intents&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.Context"&gt;Contexts&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.EntityType"&gt;Entity Types&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.WebhookRequest"&gt;Webhooks&lt;/a&gt;, and so on to manage the flow of a conversation and match user input to predefined intents and actions.
   * You can create an agent using both Dialogflow Standard Edition and Dialogflow Enterprise Edition. For details, see &lt;a href="https://docs.cloud.google.com/dialogflow/docs/editions"&gt;Dialogflow Editions&lt;/a&gt;.
   * You can save your agent for backup or versioning by exporting the agent by using the &lt;a href="index.html#ondewo.nlu.Agents.ExportAgent"&gt;ExportAgent&lt;/a&gt; method. You can import a saved agent by using the &lt;a href="index.html#ondewo.nlu.Agents.ImportAgent"&gt;ImportAgent&lt;/a&gt; method.
   * Dialogflow provides several &lt;a href="https://dialogflow.com/docs/prebuilt-agents"&gt;prebuilt agents&lt;/a&gt; for common conversation scenarios such as determining a date and time, converting currency, and so on.
   * For more information about agents, see the &lt;a href="https://dialogflow.com/docs/agents"&gt;Dialogflow documentation&lt;/a&gt;.
   * </pre>
   */
  public static final class AgentsStub
      extends io.grpc.stub.AbstractAsyncStub<AgentsStub> {
    private AgentsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "agent": {
     *     "display_name": "My Pizza Bot",
     *     "default_language_code": "en",
     *     "supported_language_codes": ["en"],
     *     "time_zone": "Europe/Vienna",
     *     "nlu_platform": "ONDEWO"
     *   }
     * }' localhost:50055 ondewo.nlu.Agents.CreateAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *   "display_name": "Pizza Bot",
     *   "default_language_code": "en",
     *   "supported_language_codes": [
     *     "en"
     *   ],
     *   "time_zone": "Europe/Vienna",
     *   "nlu_platform": "ONDEWO",
     *   "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public void createAgent(ondewo.nlu.AgentOuterClass.CreateAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.Agent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "agent": {
     *     "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *     "display_name": "Pizza Bot 2",
     *     "supported_language_codes": ["en", "de"]
     *   },
     *   "update_mask": {
     *     "paths": [
     *       "agent.display_name",
     *       "agent.supported_language_codes"
     *     ]
     *   }
     * }' localhost:50055 ondewo.nlu.Agents.UpdateAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *   "display_name": "Pizza Bot 2",
     *   "default_language_code": "en",
     *   "supported_language_codes": [
     *     "en",
     *     "de"
     *   ],
     *   "time_zone": "Europe/Vienna",
     *   "nlu_platform": "ONDEWO",
     *   "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public void updateAgent(ondewo.nlu.AgentOuterClass.UpdateAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.Agent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent"
     * }' localhost:50055 ondewo.nlu.Agents.GetAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *   "display_name": "Pizza Bot 2",
     *   "default_language_code": "en",
     *   "supported_language_codes": [
     *     "en",
     *     "de"
     *   ],
     *   "time_zone": "Europe/Vienna",
     *   "nlu_platform": "ONDEWO",
     *   "configs": {...},
     *   "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public void getAgent(ondewo.nlu.AgentOuterClass.GetAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.Agent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent"
     * }' localhost:50055 ondewo.nlu.Agents.DeleteAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{}&lt;/samp&gt;
     * </pre>
     */
    public void deleteAgent(ondewo.nlu.AgentOuterClass.DeleteAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes all agents in the server (for development purposes only).
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.DeleteAllAgents
     * &lt;/pre&gt;
     * &lt;samp&gt;{}&lt;/samp&gt;
     * </pre>
     */
    public void deleteAllAgents(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAllAgentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists agents in the server associated to the current user
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.ListAgents
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "agents_with_owners": [
     *     {
     *       "agent": {
     *         "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *         "display_name": "Pizza Bot 2",
     *         "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     *       },
     *       "owner": {
     *         "user_id": "5aac51b8-668f-49dd-913f-cc683e56af34",
     *         "display_name": "admin",
     *         "server_role_id": 3,
     *         "user_email": "admin&#64;ondewo.com"
     *       }
     *     }
     *   ],
     *   "next_page_token": "current_index-1"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public void listAgents(ondewo.nlu.AgentOuterClass.ListAgentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ListAgentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAgentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists agents in the server associated to the given user
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.ListAgentsOfUser
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "agents_of_user_with_owners": [
     *     {
     *       "agent_with_owner": {
     *         "agent": {
     *           "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *           "display_name": "Pizza Bot 2",
     *           "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     *         },
     *         "owner": {
     *           "user_id": "5aac51b8-668f-49dd-913f-cc683e56af34",
     *           "display_name": "admin",
     *           "server_role_id": 3,
     *           "user_email": "admin&#64;ondewo.com"
     *         }
     *       },
     *       "project_role": {
     *         "role_id": 4,
     *         "name": "ADMIN"
     *       }
     *     }
     *   ],
     *   "next_page_token": "current_index-1"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public void listAgentsOfUser(ondewo.nlu.AgentOuterClass.ListAgentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ListAgentsOfUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAgentsOfUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all agents in the server
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.ListAllAgents
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "agents_with_owners": [
     *     {
     *       "agent": {
     *         "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *         "display_name": "Pizza Bot 2",
     *         "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     *       },
     *       "owner": {
     *         "user_id": "5aac51b8-668f-49dd-913f-cc683e56af34",
     *         "display_name": "admin",
     *         "server_role_id": 3,
     *         "user_email": "admin&#64;ondewo.com"
     *       }
     *     }
     *   ],
     *   "next_page_token": "current_index-1"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public void listAllAgents(ondewo.nlu.AgentOuterClass.ListAgentsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ListAgentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAllAgentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a user with specified id to the project (agent)
     * </pre>
     */
    public void addUserToProject(ondewo.nlu.AgentOuterClass.AddUserToProjectRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserToProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes a user with specified id from the project (agent)
     * </pre>
     */
    public void removeUserFromProject(ondewo.nlu.AgentOuterClass.RemoveUserFromProjectRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUserFromProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists users in the project (agent)
     * </pre>
     */
    public void listUsersInProject(ondewo.nlu.AgentOuterClass.ListUsersInProjectRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ListUsersInProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUsersInProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets information from the platform
     * &lt;br&gt;
     * Request parameter:
     * &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;
     * </pre>
     */
    public void getPlatformInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.GetPlatformInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlatformInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List permissions from the project (agent)
     * </pre>
     */
    public void listProjectPermissions(ondewo.nlu.AgentOuterClass.ListProjectPermissionsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ListProjectPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProjectPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Trains the specified agent.
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public void trainAgent(ondewo.nlu.AgentOuterClass.TrainAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTrainAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Builds cache for the specified agent.
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public void buildCache(ondewo.nlu.AgentOuterClass.BuildCacheRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuildCacheMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Exports the specified agent to a ZIP file.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="index.html#ondewo.nlu.ExportAgentResponse"&gt;ExportAgentResponse&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public void exportAgent(ondewo.nlu.AgentOuterClass.ExportAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExportAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Exports the specified train agent to a ZIP file after train-test split, returns the test TrainingPhrase list.
     * </pre>
     */
    public void exportBenchmarkAgent(ondewo.nlu.AgentOuterClass.ExportBenchmarkAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExportBenchmarkAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Imports the specified agent from a ZIP file.
     *&lt;br&gt;
     * Uploads new intents and entity types without deleting the existing ones.
     * Intents and entity types with the same name are replaced with the new
     * versions from ImportAgentRequest.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public void importAgent(ondewo.nlu.AgentOuterClass.ImportAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void migrateAgent(ondewo.nlu.AgentOuterClass.MigrateAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMigrateAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void optimizeRankingMatch(ondewo.nlu.AgentOuterClass.OptimizeRankingMatchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOptimizeRankingMatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Restores the specified agent from a ZIP file.
     *&lt;br&gt;
     * Replaces the current agent version with a new one. All the intents and
     * entity types in the older version are deleted.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public void restoreAgent(ondewo.nlu.AgentOuterClass.RestoreAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRestoreAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets statistics for the agent
     * </pre>
     */
    public void getAgentStatistics(ondewo.nlu.AgentOuterClass.GetAgentStatisticsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.GetAgentStatisticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgentStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSessionsStatistics(ondewo.nlu.AgentOuterClass.GetSessionsStatisticsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.GetSessionsStatisticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSessionsStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets LLM telemetry statistics for sessions bucketed over time (time series).
     * Supports LLM-typed report types (SESSION_LLM_*) only.
     * </pre>
     */
    public void getSessionsStatisticsTimeSeries(ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSessionsStatisticsTimeSeriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets status for the agent
     * </pre>
     */
    public void setAgentStatus(ondewo.nlu.AgentOuterClass.SetAgentStatusRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.Agent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAgentStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets resources
     * </pre>
     */
    public void setResources(ondewo.nlu.AgentOuterClass.SetResourcesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetResourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes resources
     * </pre>
     */
    public void deleteResources(ondewo.nlu.AgentOuterClass.DeleteResourcesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteResourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Exports resources
     * </pre>
     */
    public void exportResources(ondewo.nlu.AgentOuterClass.ExportResourcesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ExportResourcesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExportResourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get statuses of models related to project
     * </pre>
     */
    public void getModelStatuses(ondewo.nlu.AgentOuterClass.GetModelStatusesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.GetModelStatusesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetModelStatusesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all set platform name mappings for an Agent
     * </pre>
     */
    public void getPlatformMapping(ondewo.nlu.AgentOuterClass.GetPlatformMappingRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.PlatformMapping> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlatformMappingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set platform name mappings for an Agent
     * </pre>
     */
    public void setPlatformMapping(ondewo.nlu.AgentOuterClass.PlatformMapping request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.PlatformMapping> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPlatformMappingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in entity types
     * </pre>
     */
    public void getFullTextSearchEntityType(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntityType> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFullTextSearchEntityTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in entities
     * </pre>
     */
    public void getFullTextSearchEntity(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntity> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFullTextSearchEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in entity synonyms
     * </pre>
     */
    public void getFullTextSearchEntitySynonym(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntitySynonym> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFullTextSearchEntitySynonymMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in intents
     * </pre>
     */
    public void getFullTextSearchIntent(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFullTextSearchIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in context ins of intents
     * </pre>
     */
    public void getFullTextSearchIntentContextIn(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextIn> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFullTextSearchIntentContextInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in context outs of intents
     * </pre>
     */
    public void getFullTextSearchIntentContextOut(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextOut> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFullTextSearchIntentContextOutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in user says of intents
     * </pre>
     */
    public void getFullTextSearchIntentUsersays(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentUsersays> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFullTextSearchIntentUsersaysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in tags of intents
     * </pre>
     */
    public void getFullTextSearchIntentTags(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentTags> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFullTextSearchIntentTagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in responses of intents
     * </pre>
     */
    public void getFullTextSearchIntentResponse(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFullTextSearchIntentResponseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Full text search endpoint in parameters of intents
     * </pre>
     */
    public void getFullTextSearchIntentParameters(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentParameters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFullTextSearchIntentParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Force reindexing Intent and Entity data of Agent
     * </pre>
     */
    public void reindexAgent(ondewo.nlu.AgentOuterClass.ReindexAgentRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReindexAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a project-scoped technical user (a normal, 2FA-exempt account holding
     * PROJECT_EXECUTOR on this one project) for headless/machine access (e.g.
     * ondewo-sip/csi/vtsi) via the ROPC login bridge. The generated password is
     * returned ONCE in the response and is not retrievable afterwards.
     * </pre>
     */
    public void createProjectTechnicalUser(ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProjectTechnicalUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the project-scoped technical users of the project (agent).
     * </pre>
     */
    public void listProjectTechnicalUsers(ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProjectTechnicalUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a project-scoped technical user (removes the Keycloak user and the
     * project membership/projection rows).
     * </pre>
     */
    public void deleteProjectTechnicalUser(ondewo.nlu.AgentOuterClass.DeleteProjectTechnicalUserRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProjectTechnicalUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rotates the password of a project-scoped technical user. Invalidates the old
     * password and returns the new generated password ONCE in the response.
     * </pre>
     */
    public void rotateProjectTechnicalUserPassword(ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRotateProjectTechnicalUserPasswordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Agents.
   * <pre>
   * Agents are best described as Natural Language Understanding (NLU) modules that transform user requests into actionable data. You can include agents in your app, product, or service to determine user intent and respond to the user in a natural way.
   * After you create an agent, you can add &lt;a href="index.html#ondewo.nlu.Intent"&gt;Intents&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.Context"&gt;Contexts&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.EntityType"&gt;Entity Types&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.WebhookRequest"&gt;Webhooks&lt;/a&gt;, and so on to manage the flow of a conversation and match user input to predefined intents and actions.
   * You can create an agent using both Dialogflow Standard Edition and Dialogflow Enterprise Edition. For details, see &lt;a href="https://docs.cloud.google.com/dialogflow/docs/editions"&gt;Dialogflow Editions&lt;/a&gt;.
   * You can save your agent for backup or versioning by exporting the agent by using the &lt;a href="index.html#ondewo.nlu.Agents.ExportAgent"&gt;ExportAgent&lt;/a&gt; method. You can import a saved agent by using the &lt;a href="index.html#ondewo.nlu.Agents.ImportAgent"&gt;ImportAgent&lt;/a&gt; method.
   * Dialogflow provides several &lt;a href="https://dialogflow.com/docs/prebuilt-agents"&gt;prebuilt agents&lt;/a&gt; for common conversation scenarios such as determining a date and time, converting currency, and so on.
   * For more information about agents, see the &lt;a href="https://dialogflow.com/docs/agents"&gt;Dialogflow documentation&lt;/a&gt;.
   * </pre>
   */
  public static final class AgentsBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AgentsBlockingV2Stub> {
    private AgentsBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentsBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentsBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "agent": {
     *     "display_name": "My Pizza Bot",
     *     "default_language_code": "en",
     *     "supported_language_codes": ["en"],
     *     "time_zone": "Europe/Vienna",
     *     "nlu_platform": "ONDEWO"
     *   }
     * }' localhost:50055 ondewo.nlu.Agents.CreateAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *   "display_name": "Pizza Bot",
     *   "default_language_code": "en",
     *   "supported_language_codes": [
     *     "en"
     *   ],
     *   "time_zone": "Europe/Vienna",
     *   "nlu_platform": "ONDEWO",
     *   "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.Agent createAgent(ondewo.nlu.AgentOuterClass.CreateAgentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "agent": {
     *     "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *     "display_name": "Pizza Bot 2",
     *     "supported_language_codes": ["en", "de"]
     *   },
     *   "update_mask": {
     *     "paths": [
     *       "agent.display_name",
     *       "agent.supported_language_codes"
     *     ]
     *   }
     * }' localhost:50055 ondewo.nlu.Agents.UpdateAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *   "display_name": "Pizza Bot 2",
     *   "default_language_code": "en",
     *   "supported_language_codes": [
     *     "en",
     *     "de"
     *   ],
     *   "time_zone": "Europe/Vienna",
     *   "nlu_platform": "ONDEWO",
     *   "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.Agent updateAgent(ondewo.nlu.AgentOuterClass.UpdateAgentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent"
     * }' localhost:50055 ondewo.nlu.Agents.GetAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *   "display_name": "Pizza Bot 2",
     *   "default_language_code": "en",
     *   "supported_language_codes": [
     *     "en",
     *     "de"
     *   ],
     *   "time_zone": "Europe/Vienna",
     *   "nlu_platform": "ONDEWO",
     *   "configs": {...},
     *   "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.Agent getAgent(ondewo.nlu.AgentOuterClass.GetAgentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent"
     * }' localhost:50055 ondewo.nlu.Agents.DeleteAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{}&lt;/samp&gt;
     * </pre>
     */
    public com.google.protobuf.Empty deleteAgent(ondewo.nlu.AgentOuterClass.DeleteAgentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes all agents in the server (for development purposes only).
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.DeleteAllAgents
     * &lt;/pre&gt;
     * &lt;samp&gt;{}&lt;/samp&gt;
     * </pre>
     */
    public com.google.protobuf.Empty deleteAllAgents(com.google.protobuf.Empty request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteAllAgentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists agents in the server associated to the current user
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.ListAgents
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "agents_with_owners": [
     *     {
     *       "agent": {
     *         "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *         "display_name": "Pizza Bot 2",
     *         "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     *       },
     *       "owner": {
     *         "user_id": "5aac51b8-668f-49dd-913f-cc683e56af34",
     *         "display_name": "admin",
     *         "server_role_id": 3,
     *         "user_email": "admin&#64;ondewo.com"
     *       }
     *     }
     *   ],
     *   "next_page_token": "current_index-1"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.ListAgentsResponse listAgents(ondewo.nlu.AgentOuterClass.ListAgentsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListAgentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists agents in the server associated to the given user
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.ListAgentsOfUser
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "agents_of_user_with_owners": [
     *     {
     *       "agent_with_owner": {
     *         "agent": {
     *           "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *           "display_name": "Pizza Bot 2",
     *           "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     *         },
     *         "owner": {
     *           "user_id": "5aac51b8-668f-49dd-913f-cc683e56af34",
     *           "display_name": "admin",
     *           "server_role_id": 3,
     *           "user_email": "admin&#64;ondewo.com"
     *         }
     *       },
     *       "project_role": {
     *         "role_id": 4,
     *         "name": "ADMIN"
     *       }
     *     }
     *   ],
     *   "next_page_token": "current_index-1"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.ListAgentsOfUserResponse listAgentsOfUser(ondewo.nlu.AgentOuterClass.ListAgentsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListAgentsOfUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all agents in the server
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.ListAllAgents
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "agents_with_owners": [
     *     {
     *       "agent": {
     *         "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *         "display_name": "Pizza Bot 2",
     *         "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     *       },
     *       "owner": {
     *         "user_id": "5aac51b8-668f-49dd-913f-cc683e56af34",
     *         "display_name": "admin",
     *         "server_role_id": 3,
     *         "user_email": "admin&#64;ondewo.com"
     *       }
     *     }
     *   ],
     *   "next_page_token": "current_index-1"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.ListAgentsResponse listAllAgents(ondewo.nlu.AgentOuterClass.ListAgentsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListAllAgentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a user with specified id to the project (agent)
     * </pre>
     */
    public com.google.protobuf.Empty addUserToProject(ondewo.nlu.AgentOuterClass.AddUserToProjectRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getAddUserToProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a user with specified id from the project (agent)
     * </pre>
     */
    public com.google.protobuf.Empty removeUserFromProject(ondewo.nlu.AgentOuterClass.RemoveUserFromProjectRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRemoveUserFromProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists users in the project (agent)
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.ListUsersInProjectResponse listUsersInProject(ondewo.nlu.AgentOuterClass.ListUsersInProjectRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListUsersInProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets information from the platform
     * &lt;br&gt;
     * Request parameter:
     * &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.GetPlatformInfoResponse getPlatformInfo(com.google.protobuf.Empty request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetPlatformInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List permissions from the project (agent)
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.ListProjectPermissionsResponse listProjectPermissions(ondewo.nlu.AgentOuterClass.ListProjectPermissionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListProjectPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Trains the specified agent.
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation trainAgent(ondewo.nlu.AgentOuterClass.TrainAgentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getTrainAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Builds cache for the specified agent.
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation buildCache(ondewo.nlu.AgentOuterClass.BuildCacheRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBuildCacheMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Exports the specified agent to a ZIP file.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="index.html#ondewo.nlu.ExportAgentResponse"&gt;ExportAgentResponse&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation exportAgent(ondewo.nlu.AgentOuterClass.ExportAgentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getExportAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Exports the specified train agent to a ZIP file after train-test split, returns the test TrainingPhrase list.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation exportBenchmarkAgent(ondewo.nlu.AgentOuterClass.ExportBenchmarkAgentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getExportBenchmarkAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Imports the specified agent from a ZIP file.
     *&lt;br&gt;
     * Uploads new intents and entity types without deleting the existing ones.
     * Intents and entity types with the same name are replaced with the new
     * versions from ImportAgentRequest.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation importAgent(ondewo.nlu.AgentOuterClass.ImportAgentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getImportAgentMethod(), getCallOptions(), request);
    }

    /**
     */
    public ondewo.nlu.OperationsOuterClass.Operation migrateAgent(ondewo.nlu.AgentOuterClass.MigrateAgentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getMigrateAgentMethod(), getCallOptions(), request);
    }

    /**
     */
    public ondewo.nlu.OperationsOuterClass.Operation optimizeRankingMatch(ondewo.nlu.AgentOuterClass.OptimizeRankingMatchRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getOptimizeRankingMatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Restores the specified agent from a ZIP file.
     *&lt;br&gt;
     * Replaces the current agent version with a new one. All the intents and
     * entity types in the older version are deleted.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation restoreAgent(ondewo.nlu.AgentOuterClass.RestoreAgentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRestoreAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets statistics for the agent
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.GetAgentStatisticsResponse getAgentStatistics(ondewo.nlu.AgentOuterClass.GetAgentStatisticsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetAgentStatisticsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ondewo.nlu.AgentOuterClass.GetSessionsStatisticsResponse getSessionsStatistics(ondewo.nlu.AgentOuterClass.GetSessionsStatisticsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetSessionsStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets LLM telemetry statistics for sessions bucketed over time (time series).
     * Supports LLM-typed report types (SESSION_LLM_*) only.
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesResponse getSessionsStatisticsTimeSeries(ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetSessionsStatisticsTimeSeriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets status for the agent
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.Agent setAgentStatus(ondewo.nlu.AgentOuterClass.SetAgentStatusRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSetAgentStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets resources
     * </pre>
     */
    public com.google.protobuf.Empty setResources(ondewo.nlu.AgentOuterClass.SetResourcesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSetResourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes resources
     * </pre>
     */
    public com.google.protobuf.Empty deleteResources(ondewo.nlu.AgentOuterClass.DeleteResourcesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteResourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Exports resources
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.ExportResourcesResponse exportResources(ondewo.nlu.AgentOuterClass.ExportResourcesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getExportResourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get statuses of models related to project
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.GetModelStatusesResponse getModelStatuses(ondewo.nlu.AgentOuterClass.GetModelStatusesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetModelStatusesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all set platform name mappings for an Agent
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.PlatformMapping getPlatformMapping(ondewo.nlu.AgentOuterClass.GetPlatformMappingRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetPlatformMappingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set platform name mappings for an Agent
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.PlatformMapping setPlatformMapping(ondewo.nlu.AgentOuterClass.PlatformMapping request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSetPlatformMappingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in entity types
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntityType getFullTextSearchEntityType(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetFullTextSearchEntityTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in entities
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntity getFullTextSearchEntity(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetFullTextSearchEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in entity synonyms
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntitySynonym getFullTextSearchEntitySynonym(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetFullTextSearchEntitySynonymMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in intents
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntent getFullTextSearchIntent(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetFullTextSearchIntentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in context ins of intents
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextIn getFullTextSearchIntentContextIn(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetFullTextSearchIntentContextInMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in context outs of intents
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextOut getFullTextSearchIntentContextOut(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetFullTextSearchIntentContextOutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in user says of intents
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentUsersays getFullTextSearchIntentUsersays(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetFullTextSearchIntentUsersaysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in tags of intents
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentTags getFullTextSearchIntentTags(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetFullTextSearchIntentTagsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in responses of intents
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentResponse getFullTextSearchIntentResponse(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetFullTextSearchIntentResponseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in parameters of intents
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentParameters getFullTextSearchIntentParameters(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetFullTextSearchIntentParametersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Force reindexing Intent and Entity data of Agent
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation reindexAgent(ondewo.nlu.AgentOuterClass.ReindexAgentRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getReindexAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a project-scoped technical user (a normal, 2FA-exempt account holding
     * PROJECT_EXECUTOR on this one project) for headless/machine access (e.g.
     * ondewo-sip/csi/vtsi) via the ROPC login bridge. The generated password is
     * returned ONCE in the response and is not retrievable afterwards.
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserResponse createProjectTechnicalUser(ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateProjectTechnicalUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the project-scoped technical users of the project (agent).
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersResponse listProjectTechnicalUsers(ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListProjectTechnicalUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a project-scoped technical user (removes the Keycloak user and the
     * project membership/projection rows).
     * </pre>
     */
    public com.google.protobuf.Empty deleteProjectTechnicalUser(ondewo.nlu.AgentOuterClass.DeleteProjectTechnicalUserRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteProjectTechnicalUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Rotates the password of a project-scoped technical user. Invalidates the old
     * password and returns the new generated password ONCE in the response.
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordResponse rotateProjectTechnicalUserPassword(ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRotateProjectTechnicalUserPasswordMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Agents.
   * <pre>
   * Agents are best described as Natural Language Understanding (NLU) modules that transform user requests into actionable data. You can include agents in your app, product, or service to determine user intent and respond to the user in a natural way.
   * After you create an agent, you can add &lt;a href="index.html#ondewo.nlu.Intent"&gt;Intents&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.Context"&gt;Contexts&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.EntityType"&gt;Entity Types&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.WebhookRequest"&gt;Webhooks&lt;/a&gt;, and so on to manage the flow of a conversation and match user input to predefined intents and actions.
   * You can create an agent using both Dialogflow Standard Edition and Dialogflow Enterprise Edition. For details, see &lt;a href="https://docs.cloud.google.com/dialogflow/docs/editions"&gt;Dialogflow Editions&lt;/a&gt;.
   * You can save your agent for backup or versioning by exporting the agent by using the &lt;a href="index.html#ondewo.nlu.Agents.ExportAgent"&gt;ExportAgent&lt;/a&gt; method. You can import a saved agent by using the &lt;a href="index.html#ondewo.nlu.Agents.ImportAgent"&gt;ImportAgent&lt;/a&gt; method.
   * Dialogflow provides several &lt;a href="https://dialogflow.com/docs/prebuilt-agents"&gt;prebuilt agents&lt;/a&gt; for common conversation scenarios such as determining a date and time, converting currency, and so on.
   * For more information about agents, see the &lt;a href="https://dialogflow.com/docs/agents"&gt;Dialogflow documentation&lt;/a&gt;.
   * </pre>
   */
  public static final class AgentsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AgentsBlockingStub> {
    private AgentsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "agent": {
     *     "display_name": "My Pizza Bot",
     *     "default_language_code": "en",
     *     "supported_language_codes": ["en"],
     *     "time_zone": "Europe/Vienna",
     *     "nlu_platform": "ONDEWO"
     *   }
     * }' localhost:50055 ondewo.nlu.Agents.CreateAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *   "display_name": "Pizza Bot",
     *   "default_language_code": "en",
     *   "supported_language_codes": [
     *     "en"
     *   ],
     *   "time_zone": "Europe/Vienna",
     *   "nlu_platform": "ONDEWO",
     *   "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.Agent createAgent(ondewo.nlu.AgentOuterClass.CreateAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "agent": {
     *     "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *     "display_name": "Pizza Bot 2",
     *     "supported_language_codes": ["en", "de"]
     *   },
     *   "update_mask": {
     *     "paths": [
     *       "agent.display_name",
     *       "agent.supported_language_codes"
     *     ]
     *   }
     * }' localhost:50055 ondewo.nlu.Agents.UpdateAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *   "display_name": "Pizza Bot 2",
     *   "default_language_code": "en",
     *   "supported_language_codes": [
     *     "en",
     *     "de"
     *   ],
     *   "time_zone": "Europe/Vienna",
     *   "nlu_platform": "ONDEWO",
     *   "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.Agent updateAgent(ondewo.nlu.AgentOuterClass.UpdateAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent"
     * }' localhost:50055 ondewo.nlu.Agents.GetAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *   "display_name": "Pizza Bot 2",
     *   "default_language_code": "en",
     *   "supported_language_codes": [
     *     "en",
     *     "de"
     *   ],
     *   "time_zone": "Europe/Vienna",
     *   "nlu_platform": "ONDEWO",
     *   "configs": {...},
     *   "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.Agent getAgent(ondewo.nlu.AgentOuterClass.GetAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent"
     * }' localhost:50055 ondewo.nlu.Agents.DeleteAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{}&lt;/samp&gt;
     * </pre>
     */
    public com.google.protobuf.Empty deleteAgent(ondewo.nlu.AgentOuterClass.DeleteAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes all agents in the server (for development purposes only).
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.DeleteAllAgents
     * &lt;/pre&gt;
     * &lt;samp&gt;{}&lt;/samp&gt;
     * </pre>
     */
    public com.google.protobuf.Empty deleteAllAgents(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAllAgentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists agents in the server associated to the current user
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.ListAgents
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "agents_with_owners": [
     *     {
     *       "agent": {
     *         "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *         "display_name": "Pizza Bot 2",
     *         "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     *       },
     *       "owner": {
     *         "user_id": "5aac51b8-668f-49dd-913f-cc683e56af34",
     *         "display_name": "admin",
     *         "server_role_id": 3,
     *         "user_email": "admin&#64;ondewo.com"
     *       }
     *     }
     *   ],
     *   "next_page_token": "current_index-1"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.ListAgentsResponse listAgents(ondewo.nlu.AgentOuterClass.ListAgentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAgentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists agents in the server associated to the given user
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.ListAgentsOfUser
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "agents_of_user_with_owners": [
     *     {
     *       "agent_with_owner": {
     *         "agent": {
     *           "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *           "display_name": "Pizza Bot 2",
     *           "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     *         },
     *         "owner": {
     *           "user_id": "5aac51b8-668f-49dd-913f-cc683e56af34",
     *           "display_name": "admin",
     *           "server_role_id": 3,
     *           "user_email": "admin&#64;ondewo.com"
     *         }
     *       },
     *       "project_role": {
     *         "role_id": 4,
     *         "name": "ADMIN"
     *       }
     *     }
     *   ],
     *   "next_page_token": "current_index-1"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.ListAgentsOfUserResponse listAgentsOfUser(ondewo.nlu.AgentOuterClass.ListAgentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAgentsOfUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all agents in the server
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.ListAllAgents
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "agents_with_owners": [
     *     {
     *       "agent": {
     *         "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *         "display_name": "Pizza Bot 2",
     *         "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     *       },
     *       "owner": {
     *         "user_id": "5aac51b8-668f-49dd-913f-cc683e56af34",
     *         "display_name": "admin",
     *         "server_role_id": 3,
     *         "user_email": "admin&#64;ondewo.com"
     *       }
     *     }
     *   ],
     *   "next_page_token": "current_index-1"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.ListAgentsResponse listAllAgents(ondewo.nlu.AgentOuterClass.ListAgentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAllAgentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a user with specified id to the project (agent)
     * </pre>
     */
    public com.google.protobuf.Empty addUserToProject(ondewo.nlu.AgentOuterClass.AddUserToProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserToProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a user with specified id from the project (agent)
     * </pre>
     */
    public com.google.protobuf.Empty removeUserFromProject(ondewo.nlu.AgentOuterClass.RemoveUserFromProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUserFromProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists users in the project (agent)
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.ListUsersInProjectResponse listUsersInProject(ondewo.nlu.AgentOuterClass.ListUsersInProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUsersInProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets information from the platform
     * &lt;br&gt;
     * Request parameter:
     * &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.GetPlatformInfoResponse getPlatformInfo(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlatformInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List permissions from the project (agent)
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.ListProjectPermissionsResponse listProjectPermissions(ondewo.nlu.AgentOuterClass.ListProjectPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProjectPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Trains the specified agent.
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation trainAgent(ondewo.nlu.AgentOuterClass.TrainAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTrainAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Builds cache for the specified agent.
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation buildCache(ondewo.nlu.AgentOuterClass.BuildCacheRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuildCacheMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Exports the specified agent to a ZIP file.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="index.html#ondewo.nlu.ExportAgentResponse"&gt;ExportAgentResponse&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation exportAgent(ondewo.nlu.AgentOuterClass.ExportAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExportAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Exports the specified train agent to a ZIP file after train-test split, returns the test TrainingPhrase list.
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation exportBenchmarkAgent(ondewo.nlu.AgentOuterClass.ExportBenchmarkAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExportBenchmarkAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Imports the specified agent from a ZIP file.
     *&lt;br&gt;
     * Uploads new intents and entity types without deleting the existing ones.
     * Intents and entity types with the same name are replaced with the new
     * versions from ImportAgentRequest.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation importAgent(ondewo.nlu.AgentOuterClass.ImportAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportAgentMethod(), getCallOptions(), request);
    }

    /**
     */
    public ondewo.nlu.OperationsOuterClass.Operation migrateAgent(ondewo.nlu.AgentOuterClass.MigrateAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMigrateAgentMethod(), getCallOptions(), request);
    }

    /**
     */
    public ondewo.nlu.OperationsOuterClass.Operation optimizeRankingMatch(ondewo.nlu.AgentOuterClass.OptimizeRankingMatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOptimizeRankingMatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Restores the specified agent from a ZIP file.
     *&lt;br&gt;
     * Replaces the current agent version with a new one. All the intents and
     * entity types in the older version are deleted.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation restoreAgent(ondewo.nlu.AgentOuterClass.RestoreAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRestoreAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets statistics for the agent
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.GetAgentStatisticsResponse getAgentStatistics(ondewo.nlu.AgentOuterClass.GetAgentStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgentStatisticsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ondewo.nlu.AgentOuterClass.GetSessionsStatisticsResponse getSessionsStatistics(ondewo.nlu.AgentOuterClass.GetSessionsStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSessionsStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets LLM telemetry statistics for sessions bucketed over time (time series).
     * Supports LLM-typed report types (SESSION_LLM_*) only.
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesResponse getSessionsStatisticsTimeSeries(ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSessionsStatisticsTimeSeriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets status for the agent
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.Agent setAgentStatus(ondewo.nlu.AgentOuterClass.SetAgentStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAgentStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets resources
     * </pre>
     */
    public com.google.protobuf.Empty setResources(ondewo.nlu.AgentOuterClass.SetResourcesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetResourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes resources
     * </pre>
     */
    public com.google.protobuf.Empty deleteResources(ondewo.nlu.AgentOuterClass.DeleteResourcesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteResourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Exports resources
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.ExportResourcesResponse exportResources(ondewo.nlu.AgentOuterClass.ExportResourcesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExportResourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get statuses of models related to project
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.GetModelStatusesResponse getModelStatuses(ondewo.nlu.AgentOuterClass.GetModelStatusesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModelStatusesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all set platform name mappings for an Agent
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.PlatformMapping getPlatformMapping(ondewo.nlu.AgentOuterClass.GetPlatformMappingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlatformMappingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set platform name mappings for an Agent
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.PlatformMapping setPlatformMapping(ondewo.nlu.AgentOuterClass.PlatformMapping request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPlatformMappingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in entity types
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntityType getFullTextSearchEntityType(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFullTextSearchEntityTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in entities
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntity getFullTextSearchEntity(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFullTextSearchEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in entity synonyms
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntitySynonym getFullTextSearchEntitySynonym(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFullTextSearchEntitySynonymMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in intents
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntent getFullTextSearchIntent(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFullTextSearchIntentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in context ins of intents
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextIn getFullTextSearchIntentContextIn(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFullTextSearchIntentContextInMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in context outs of intents
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextOut getFullTextSearchIntentContextOut(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFullTextSearchIntentContextOutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in user says of intents
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentUsersays getFullTextSearchIntentUsersays(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFullTextSearchIntentUsersaysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in tags of intents
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentTags getFullTextSearchIntentTags(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFullTextSearchIntentTagsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in responses of intents
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentResponse getFullTextSearchIntentResponse(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFullTextSearchIntentResponseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Full text search endpoint in parameters of intents
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentParameters getFullTextSearchIntentParameters(ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFullTextSearchIntentParametersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Force reindexing Intent and Entity data of Agent
     * </pre>
     */
    public ondewo.nlu.OperationsOuterClass.Operation reindexAgent(ondewo.nlu.AgentOuterClass.ReindexAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReindexAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a project-scoped technical user (a normal, 2FA-exempt account holding
     * PROJECT_EXECUTOR on this one project) for headless/machine access (e.g.
     * ondewo-sip/csi/vtsi) via the ROPC login bridge. The generated password is
     * returned ONCE in the response and is not retrievable afterwards.
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserResponse createProjectTechnicalUser(ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProjectTechnicalUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the project-scoped technical users of the project (agent).
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersResponse listProjectTechnicalUsers(ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProjectTechnicalUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a project-scoped technical user (removes the Keycloak user and the
     * project membership/projection rows).
     * </pre>
     */
    public com.google.protobuf.Empty deleteProjectTechnicalUser(ondewo.nlu.AgentOuterClass.DeleteProjectTechnicalUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProjectTechnicalUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Rotates the password of a project-scoped technical user. Invalidates the old
     * password and returns the new generated password ONCE in the response.
     * </pre>
     */
    public ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordResponse rotateProjectTechnicalUserPassword(ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRotateProjectTechnicalUserPasswordMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Agents.
   * <pre>
   * Agents are best described as Natural Language Understanding (NLU) modules that transform user requests into actionable data. You can include agents in your app, product, or service to determine user intent and respond to the user in a natural way.
   * After you create an agent, you can add &lt;a href="index.html#ondewo.nlu.Intent"&gt;Intents&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.Context"&gt;Contexts&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.EntityType"&gt;Entity Types&lt;/a&gt;, &lt;a href="index.html#ondewo.nlu.WebhookRequest"&gt;Webhooks&lt;/a&gt;, and so on to manage the flow of a conversation and match user input to predefined intents and actions.
   * You can create an agent using both Dialogflow Standard Edition and Dialogflow Enterprise Edition. For details, see &lt;a href="https://docs.cloud.google.com/dialogflow/docs/editions"&gt;Dialogflow Editions&lt;/a&gt;.
   * You can save your agent for backup or versioning by exporting the agent by using the &lt;a href="index.html#ondewo.nlu.Agents.ExportAgent"&gt;ExportAgent&lt;/a&gt; method. You can import a saved agent by using the &lt;a href="index.html#ondewo.nlu.Agents.ImportAgent"&gt;ImportAgent&lt;/a&gt; method.
   * Dialogflow provides several &lt;a href="https://dialogflow.com/docs/prebuilt-agents"&gt;prebuilt agents&lt;/a&gt; for common conversation scenarios such as determining a date and time, converting currency, and so on.
   * For more information about agents, see the &lt;a href="https://dialogflow.com/docs/agents"&gt;Dialogflow documentation&lt;/a&gt;.
   * </pre>
   */
  public static final class AgentsFutureStub
      extends io.grpc.stub.AbstractFutureStub<AgentsFutureStub> {
    private AgentsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "agent": {
     *     "display_name": "My Pizza Bot",
     *     "default_language_code": "en",
     *     "supported_language_codes": ["en"],
     *     "time_zone": "Europe/Vienna",
     *     "nlu_platform": "ONDEWO"
     *   }
     * }' localhost:50055 ondewo.nlu.Agents.CreateAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *   "display_name": "Pizza Bot",
     *   "default_language_code": "en",
     *   "supported_language_codes": [
     *     "en"
     *   ],
     *   "time_zone": "Europe/Vienna",
     *   "nlu_platform": "ONDEWO",
     *   "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.Agent> createAgent(
        ondewo.nlu.AgentOuterClass.CreateAgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAgentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "agent": {
     *     "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *     "display_name": "Pizza Bot 2",
     *     "supported_language_codes": ["en", "de"]
     *   },
     *   "update_mask": {
     *     "paths": [
     *       "agent.display_name",
     *       "agent.supported_language_codes"
     *     ]
     *   }
     * }' localhost:50055 ondewo.nlu.Agents.UpdateAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *   "display_name": "Pizza Bot 2",
     *   "default_language_code": "en",
     *   "supported_language_codes": [
     *     "en",
     *     "de"
     *   ],
     *   "time_zone": "Europe/Vienna",
     *   "nlu_platform": "ONDEWO",
     *   "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.Agent> updateAgent(
        ondewo.nlu.AgentOuterClass.UpdateAgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAgentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent"
     * }' localhost:50055 ondewo.nlu.Agents.GetAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *   "display_name": "Pizza Bot 2",
     *   "default_language_code": "en",
     *   "supported_language_codes": [
     *     "en",
     *     "de"
     *   ],
     *   "time_zone": "Europe/Vienna",
     *   "nlu_platform": "ONDEWO",
     *   "configs": {...},
     *   "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.Agent> getAgent(
        ondewo.nlu.AgentOuterClass.GetAgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified agent.
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' -d '{
     *   "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent"
     * }' localhost:50055 ondewo.nlu.Agents.DeleteAgent
     * &lt;/pre&gt;
     * &lt;samp&gt;{}&lt;/samp&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAgent(
        ondewo.nlu.AgentOuterClass.DeleteAgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAgentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes all agents in the server (for development purposes only).
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.DeleteAllAgents
     * &lt;/pre&gt;
     * &lt;samp&gt;{}&lt;/samp&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAllAgents(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAllAgentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists agents in the server associated to the current user
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.ListAgents
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "agents_with_owners": [
     *     {
     *       "agent": {
     *         "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *         "display_name": "Pizza Bot 2",
     *         "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     *       },
     *       "owner": {
     *         "user_id": "5aac51b8-668f-49dd-913f-cc683e56af34",
     *         "display_name": "admin",
     *         "server_role_id": 3,
     *         "user_email": "admin&#64;ondewo.com"
     *       }
     *     }
     *   ],
     *   "next_page_token": "current_index-1"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.ListAgentsResponse> listAgents(
        ondewo.nlu.AgentOuterClass.ListAgentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAgentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists agents in the server associated to the given user
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.ListAgentsOfUser
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "agents_of_user_with_owners": [
     *     {
     *       "agent_with_owner": {
     *         "agent": {
     *           "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *           "display_name": "Pizza Bot 2",
     *           "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     *         },
     *         "owner": {
     *           "user_id": "5aac51b8-668f-49dd-913f-cc683e56af34",
     *           "display_name": "admin",
     *           "server_role_id": 3,
     *           "user_email": "admin&#64;ondewo.com"
     *         }
     *       },
     *       "project_role": {
     *         "role_id": 4,
     *         "name": "ADMIN"
     *       }
     *     }
     *   ],
     *   "next_page_token": "current_index-1"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.ListAgentsOfUserResponse> listAgentsOfUser(
        ondewo.nlu.AgentOuterClass.ListAgentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAgentsOfUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all agents in the server
     * Examples:
     * &lt;pre&gt;
     * grpcurl -plaintext -H 'Authorization: Bearer &lt;jwt&gt;' localhost:50055 ondewo.nlu.Agents.ListAllAgents
     * &lt;/pre&gt;
     * &lt;samp&gt;{
     *   "agents_with_owners": [
     *     {
     *       "agent": {
     *         "parent": "projects/76aaf4f3-a1f6-4fda-b4b3-351c64e65bc4/agent",
     *         "display_name": "Pizza Bot 2",
     *         "owner_id": "5aac51b8-668f-49dd-913f-cc683e56af34"
     *       },
     *       "owner": {
     *         "user_id": "5aac51b8-668f-49dd-913f-cc683e56af34",
     *         "display_name": "admin",
     *         "server_role_id": 3,
     *         "user_email": "admin&#64;ondewo.com"
     *       }
     *     }
     *   ],
     *   "next_page_token": "current_index-1"
     * }
     * &lt;/samp&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.ListAgentsResponse> listAllAgents(
        ondewo.nlu.AgentOuterClass.ListAgentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAllAgentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a user with specified id to the project (agent)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addUserToProject(
        ondewo.nlu.AgentOuterClass.AddUserToProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserToProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes a user with specified id from the project (agent)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> removeUserFromProject(
        ondewo.nlu.AgentOuterClass.RemoveUserFromProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUserFromProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists users in the project (agent)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.ListUsersInProjectResponse> listUsersInProject(
        ondewo.nlu.AgentOuterClass.ListUsersInProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUsersInProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets information from the platform
     * &lt;br&gt;
     * Request parameter:
     * &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.GetPlatformInfoResponse> getPlatformInfo(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlatformInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List permissions from the project (agent)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.ListProjectPermissionsResponse> listProjectPermissions(
        ondewo.nlu.AgentOuterClass.ListProjectPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProjectPermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Trains the specified agent.
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> trainAgent(
        ondewo.nlu.AgentOuterClass.TrainAgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTrainAgentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Builds cache for the specified agent.
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> buildCache(
        ondewo.nlu.AgentOuterClass.BuildCacheRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuildCacheMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Exports the specified agent to a ZIP file.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="index.html#ondewo.nlu.ExportAgentResponse"&gt;ExportAgentResponse&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> exportAgent(
        ondewo.nlu.AgentOuterClass.ExportAgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExportAgentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Exports the specified train agent to a ZIP file after train-test split, returns the test TrainingPhrase list.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> exportBenchmarkAgent(
        ondewo.nlu.AgentOuterClass.ExportBenchmarkAgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExportBenchmarkAgentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Imports the specified agent from a ZIP file.
     *&lt;br&gt;
     * Uploads new intents and entity types without deleting the existing ones.
     * Intents and entity types with the same name are replaced with the new
     * versions from ImportAgentRequest.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> importAgent(
        ondewo.nlu.AgentOuterClass.ImportAgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportAgentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> migrateAgent(
        ondewo.nlu.AgentOuterClass.MigrateAgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMigrateAgentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> optimizeRankingMatch(
        ondewo.nlu.AgentOuterClass.OptimizeRankingMatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOptimizeRankingMatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Restores the specified agent from a ZIP file.
     *&lt;br&gt;
     * Replaces the current agent version with a new one. All the intents and
     * entity types in the older version are deleted.
     *&lt;br&gt;
     * Operation &amp;lt;response: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#empty"&gt;google.protobuf.Empty&lt;/a&gt;,
     *            metadata: &lt;a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct"&gt;google.protobuf.Struct&lt;/a&gt;&amp;gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> restoreAgent(
        ondewo.nlu.AgentOuterClass.RestoreAgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRestoreAgentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets statistics for the agent
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.GetAgentStatisticsResponse> getAgentStatistics(
        ondewo.nlu.AgentOuterClass.GetAgentStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgentStatisticsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.GetSessionsStatisticsResponse> getSessionsStatistics(
        ondewo.nlu.AgentOuterClass.GetSessionsStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSessionsStatisticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets LLM telemetry statistics for sessions bucketed over time (time series).
     * Supports LLM-typed report types (SESSION_LLM_*) only.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesResponse> getSessionsStatisticsTimeSeries(
        ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSessionsStatisticsTimeSeriesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets status for the agent
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.Agent> setAgentStatus(
        ondewo.nlu.AgentOuterClass.SetAgentStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAgentStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets resources
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setResources(
        ondewo.nlu.AgentOuterClass.SetResourcesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetResourcesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes resources
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteResources(
        ondewo.nlu.AgentOuterClass.DeleteResourcesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteResourcesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Exports resources
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.ExportResourcesResponse> exportResources(
        ondewo.nlu.AgentOuterClass.ExportResourcesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExportResourcesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get statuses of models related to project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.GetModelStatusesResponse> getModelStatuses(
        ondewo.nlu.AgentOuterClass.GetModelStatusesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetModelStatusesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all set platform name mappings for an Agent
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.PlatformMapping> getPlatformMapping(
        ondewo.nlu.AgentOuterClass.GetPlatformMappingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlatformMappingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set platform name mappings for an Agent
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.PlatformMapping> setPlatformMapping(
        ondewo.nlu.AgentOuterClass.PlatformMapping request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPlatformMappingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Full text search endpoint in entity types
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntityType> getFullTextSearchEntityType(
        ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFullTextSearchEntityTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Full text search endpoint in entities
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntity> getFullTextSearchEntity(
        ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFullTextSearchEntityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Full text search endpoint in entity synonyms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntitySynonym> getFullTextSearchEntitySynonym(
        ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFullTextSearchEntitySynonymMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Full text search endpoint in intents
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntent> getFullTextSearchIntent(
        ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFullTextSearchIntentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Full text search endpoint in context ins of intents
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextIn> getFullTextSearchIntentContextIn(
        ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFullTextSearchIntentContextInMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Full text search endpoint in context outs of intents
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextOut> getFullTextSearchIntentContextOut(
        ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFullTextSearchIntentContextOutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Full text search endpoint in user says of intents
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentUsersays> getFullTextSearchIntentUsersays(
        ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFullTextSearchIntentUsersaysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Full text search endpoint in tags of intents
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentTags> getFullTextSearchIntentTags(
        ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFullTextSearchIntentTagsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Full text search endpoint in responses of intents
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentResponse> getFullTextSearchIntentResponse(
        ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFullTextSearchIntentResponseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Full text search endpoint in parameters of intents
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentParameters> getFullTextSearchIntentParameters(
        ondewo.nlu.AgentOuterClass.FullTextSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFullTextSearchIntentParametersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Force reindexing Intent and Entity data of Agent
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.OperationsOuterClass.Operation> reindexAgent(
        ondewo.nlu.AgentOuterClass.ReindexAgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReindexAgentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a project-scoped technical user (a normal, 2FA-exempt account holding
     * PROJECT_EXECUTOR on this one project) for headless/machine access (e.g.
     * ondewo-sip/csi/vtsi) via the ROPC login bridge. The generated password is
     * returned ONCE in the response and is not retrievable afterwards.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserResponse> createProjectTechnicalUser(
        ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProjectTechnicalUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the project-scoped technical users of the project (agent).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersResponse> listProjectTechnicalUsers(
        ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProjectTechnicalUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a project-scoped technical user (removes the Keycloak user and the
     * project membership/projection rows).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteProjectTechnicalUser(
        ondewo.nlu.AgentOuterClass.DeleteProjectTechnicalUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProjectTechnicalUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Rotates the password of a project-scoped technical user. Invalidates the old
     * password and returns the new generated password ONCE in the response.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordResponse> rotateProjectTechnicalUserPassword(
        ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRotateProjectTechnicalUserPasswordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_AGENT = 0;
  private static final int METHODID_UPDATE_AGENT = 1;
  private static final int METHODID_GET_AGENT = 2;
  private static final int METHODID_DELETE_AGENT = 3;
  private static final int METHODID_DELETE_ALL_AGENTS = 4;
  private static final int METHODID_LIST_AGENTS = 5;
  private static final int METHODID_LIST_AGENTS_OF_USER = 6;
  private static final int METHODID_LIST_ALL_AGENTS = 7;
  private static final int METHODID_ADD_USER_TO_PROJECT = 8;
  private static final int METHODID_REMOVE_USER_FROM_PROJECT = 9;
  private static final int METHODID_LIST_USERS_IN_PROJECT = 10;
  private static final int METHODID_GET_PLATFORM_INFO = 11;
  private static final int METHODID_LIST_PROJECT_PERMISSIONS = 12;
  private static final int METHODID_TRAIN_AGENT = 13;
  private static final int METHODID_BUILD_CACHE = 14;
  private static final int METHODID_EXPORT_AGENT = 15;
  private static final int METHODID_EXPORT_BENCHMARK_AGENT = 16;
  private static final int METHODID_IMPORT_AGENT = 17;
  private static final int METHODID_MIGRATE_AGENT = 18;
  private static final int METHODID_OPTIMIZE_RANKING_MATCH = 19;
  private static final int METHODID_RESTORE_AGENT = 20;
  private static final int METHODID_GET_AGENT_STATISTICS = 21;
  private static final int METHODID_GET_SESSIONS_STATISTICS = 22;
  private static final int METHODID_GET_SESSIONS_STATISTICS_TIME_SERIES = 23;
  private static final int METHODID_SET_AGENT_STATUS = 24;
  private static final int METHODID_SET_RESOURCES = 25;
  private static final int METHODID_DELETE_RESOURCES = 26;
  private static final int METHODID_EXPORT_RESOURCES = 27;
  private static final int METHODID_GET_MODEL_STATUSES = 28;
  private static final int METHODID_GET_PLATFORM_MAPPING = 29;
  private static final int METHODID_SET_PLATFORM_MAPPING = 30;
  private static final int METHODID_GET_FULL_TEXT_SEARCH_ENTITY_TYPE = 31;
  private static final int METHODID_GET_FULL_TEXT_SEARCH_ENTITY = 32;
  private static final int METHODID_GET_FULL_TEXT_SEARCH_ENTITY_SYNONYM = 33;
  private static final int METHODID_GET_FULL_TEXT_SEARCH_INTENT = 34;
  private static final int METHODID_GET_FULL_TEXT_SEARCH_INTENT_CONTEXT_IN = 35;
  private static final int METHODID_GET_FULL_TEXT_SEARCH_INTENT_CONTEXT_OUT = 36;
  private static final int METHODID_GET_FULL_TEXT_SEARCH_INTENT_USERSAYS = 37;
  private static final int METHODID_GET_FULL_TEXT_SEARCH_INTENT_TAGS = 38;
  private static final int METHODID_GET_FULL_TEXT_SEARCH_INTENT_RESPONSE = 39;
  private static final int METHODID_GET_FULL_TEXT_SEARCH_INTENT_PARAMETERS = 40;
  private static final int METHODID_REINDEX_AGENT = 41;
  private static final int METHODID_CREATE_PROJECT_TECHNICAL_USER = 42;
  private static final int METHODID_LIST_PROJECT_TECHNICAL_USERS = 43;
  private static final int METHODID_DELETE_PROJECT_TECHNICAL_USER = 44;
  private static final int METHODID_ROTATE_PROJECT_TECHNICAL_USER_PASSWORD = 45;

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
        case METHODID_CREATE_AGENT:
          serviceImpl.createAgent((ondewo.nlu.AgentOuterClass.CreateAgentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.Agent>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT:
          serviceImpl.updateAgent((ondewo.nlu.AgentOuterClass.UpdateAgentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.Agent>) responseObserver);
          break;
        case METHODID_GET_AGENT:
          serviceImpl.getAgent((ondewo.nlu.AgentOuterClass.GetAgentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.Agent>) responseObserver);
          break;
        case METHODID_DELETE_AGENT:
          serviceImpl.deleteAgent((ondewo.nlu.AgentOuterClass.DeleteAgentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_ALL_AGENTS:
          serviceImpl.deleteAllAgents((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_AGENTS:
          serviceImpl.listAgents((ondewo.nlu.AgentOuterClass.ListAgentsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ListAgentsResponse>) responseObserver);
          break;
        case METHODID_LIST_AGENTS_OF_USER:
          serviceImpl.listAgentsOfUser((ondewo.nlu.AgentOuterClass.ListAgentsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ListAgentsOfUserResponse>) responseObserver);
          break;
        case METHODID_LIST_ALL_AGENTS:
          serviceImpl.listAllAgents((ondewo.nlu.AgentOuterClass.ListAgentsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ListAgentsResponse>) responseObserver);
          break;
        case METHODID_ADD_USER_TO_PROJECT:
          serviceImpl.addUserToProject((ondewo.nlu.AgentOuterClass.AddUserToProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REMOVE_USER_FROM_PROJECT:
          serviceImpl.removeUserFromProject((ondewo.nlu.AgentOuterClass.RemoveUserFromProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_USERS_IN_PROJECT:
          serviceImpl.listUsersInProject((ondewo.nlu.AgentOuterClass.ListUsersInProjectRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ListUsersInProjectResponse>) responseObserver);
          break;
        case METHODID_GET_PLATFORM_INFO:
          serviceImpl.getPlatformInfo((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.GetPlatformInfoResponse>) responseObserver);
          break;
        case METHODID_LIST_PROJECT_PERMISSIONS:
          serviceImpl.listProjectPermissions((ondewo.nlu.AgentOuterClass.ListProjectPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ListProjectPermissionsResponse>) responseObserver);
          break;
        case METHODID_TRAIN_AGENT:
          serviceImpl.trainAgent((ondewo.nlu.AgentOuterClass.TrainAgentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_BUILD_CACHE:
          serviceImpl.buildCache((ondewo.nlu.AgentOuterClass.BuildCacheRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_EXPORT_AGENT:
          serviceImpl.exportAgent((ondewo.nlu.AgentOuterClass.ExportAgentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_EXPORT_BENCHMARK_AGENT:
          serviceImpl.exportBenchmarkAgent((ondewo.nlu.AgentOuterClass.ExportBenchmarkAgentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_IMPORT_AGENT:
          serviceImpl.importAgent((ondewo.nlu.AgentOuterClass.ImportAgentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_MIGRATE_AGENT:
          serviceImpl.migrateAgent((ondewo.nlu.AgentOuterClass.MigrateAgentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_OPTIMIZE_RANKING_MATCH:
          serviceImpl.optimizeRankingMatch((ondewo.nlu.AgentOuterClass.OptimizeRankingMatchRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_RESTORE_AGENT:
          serviceImpl.restoreAgent((ondewo.nlu.AgentOuterClass.RestoreAgentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_GET_AGENT_STATISTICS:
          serviceImpl.getAgentStatistics((ondewo.nlu.AgentOuterClass.GetAgentStatisticsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.GetAgentStatisticsResponse>) responseObserver);
          break;
        case METHODID_GET_SESSIONS_STATISTICS:
          serviceImpl.getSessionsStatistics((ondewo.nlu.AgentOuterClass.GetSessionsStatisticsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.GetSessionsStatisticsResponse>) responseObserver);
          break;
        case METHODID_GET_SESSIONS_STATISTICS_TIME_SERIES:
          serviceImpl.getSessionsStatisticsTimeSeries((ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesResponse>) responseObserver);
          break;
        case METHODID_SET_AGENT_STATUS:
          serviceImpl.setAgentStatus((ondewo.nlu.AgentOuterClass.SetAgentStatusRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.Agent>) responseObserver);
          break;
        case METHODID_SET_RESOURCES:
          serviceImpl.setResources((ondewo.nlu.AgentOuterClass.SetResourcesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_RESOURCES:
          serviceImpl.deleteResources((ondewo.nlu.AgentOuterClass.DeleteResourcesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_EXPORT_RESOURCES:
          serviceImpl.exportResources((ondewo.nlu.AgentOuterClass.ExportResourcesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ExportResourcesResponse>) responseObserver);
          break;
        case METHODID_GET_MODEL_STATUSES:
          serviceImpl.getModelStatuses((ondewo.nlu.AgentOuterClass.GetModelStatusesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.GetModelStatusesResponse>) responseObserver);
          break;
        case METHODID_GET_PLATFORM_MAPPING:
          serviceImpl.getPlatformMapping((ondewo.nlu.AgentOuterClass.GetPlatformMappingRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.PlatformMapping>) responseObserver);
          break;
        case METHODID_SET_PLATFORM_MAPPING:
          serviceImpl.setPlatformMapping((ondewo.nlu.AgentOuterClass.PlatformMapping) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.PlatformMapping>) responseObserver);
          break;
        case METHODID_GET_FULL_TEXT_SEARCH_ENTITY_TYPE:
          serviceImpl.getFullTextSearchEntityType((ondewo.nlu.AgentOuterClass.FullTextSearchRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntityType>) responseObserver);
          break;
        case METHODID_GET_FULL_TEXT_SEARCH_ENTITY:
          serviceImpl.getFullTextSearchEntity((ondewo.nlu.AgentOuterClass.FullTextSearchRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntity>) responseObserver);
          break;
        case METHODID_GET_FULL_TEXT_SEARCH_ENTITY_SYNONYM:
          serviceImpl.getFullTextSearchEntitySynonym((ondewo.nlu.AgentOuterClass.FullTextSearchRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntitySynonym>) responseObserver);
          break;
        case METHODID_GET_FULL_TEXT_SEARCH_INTENT:
          serviceImpl.getFullTextSearchIntent((ondewo.nlu.AgentOuterClass.FullTextSearchRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntent>) responseObserver);
          break;
        case METHODID_GET_FULL_TEXT_SEARCH_INTENT_CONTEXT_IN:
          serviceImpl.getFullTextSearchIntentContextIn((ondewo.nlu.AgentOuterClass.FullTextSearchRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextIn>) responseObserver);
          break;
        case METHODID_GET_FULL_TEXT_SEARCH_INTENT_CONTEXT_OUT:
          serviceImpl.getFullTextSearchIntentContextOut((ondewo.nlu.AgentOuterClass.FullTextSearchRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextOut>) responseObserver);
          break;
        case METHODID_GET_FULL_TEXT_SEARCH_INTENT_USERSAYS:
          serviceImpl.getFullTextSearchIntentUsersays((ondewo.nlu.AgentOuterClass.FullTextSearchRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentUsersays>) responseObserver);
          break;
        case METHODID_GET_FULL_TEXT_SEARCH_INTENT_TAGS:
          serviceImpl.getFullTextSearchIntentTags((ondewo.nlu.AgentOuterClass.FullTextSearchRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentTags>) responseObserver);
          break;
        case METHODID_GET_FULL_TEXT_SEARCH_INTENT_RESPONSE:
          serviceImpl.getFullTextSearchIntentResponse((ondewo.nlu.AgentOuterClass.FullTextSearchRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentResponse>) responseObserver);
          break;
        case METHODID_GET_FULL_TEXT_SEARCH_INTENT_PARAMETERS:
          serviceImpl.getFullTextSearchIntentParameters((ondewo.nlu.AgentOuterClass.FullTextSearchRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentParameters>) responseObserver);
          break;
        case METHODID_REINDEX_AGENT:
          serviceImpl.reindexAgent((ondewo.nlu.AgentOuterClass.ReindexAgentRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.OperationsOuterClass.Operation>) responseObserver);
          break;
        case METHODID_CREATE_PROJECT_TECHNICAL_USER:
          serviceImpl.createProjectTechnicalUser((ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserResponse>) responseObserver);
          break;
        case METHODID_LIST_PROJECT_TECHNICAL_USERS:
          serviceImpl.listProjectTechnicalUsers((ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersResponse>) responseObserver);
          break;
        case METHODID_DELETE_PROJECT_TECHNICAL_USER:
          serviceImpl.deleteProjectTechnicalUser((ondewo.nlu.AgentOuterClass.DeleteProjectTechnicalUserRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ROTATE_PROJECT_TECHNICAL_USER_PASSWORD:
          serviceImpl.rotateProjectTechnicalUserPassword((ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordResponse>) responseObserver);
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
          getCreateAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.CreateAgentRequest,
              ondewo.nlu.AgentOuterClass.Agent>(
                service, METHODID_CREATE_AGENT)))
        .addMethod(
          getUpdateAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.UpdateAgentRequest,
              ondewo.nlu.AgentOuterClass.Agent>(
                service, METHODID_UPDATE_AGENT)))
        .addMethod(
          getGetAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.GetAgentRequest,
              ondewo.nlu.AgentOuterClass.Agent>(
                service, METHODID_GET_AGENT)))
        .addMethod(
          getDeleteAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.DeleteAgentRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_AGENT)))
        .addMethod(
          getDeleteAllAgentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ALL_AGENTS)))
        .addMethod(
          getListAgentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.ListAgentsRequest,
              ondewo.nlu.AgentOuterClass.ListAgentsResponse>(
                service, METHODID_LIST_AGENTS)))
        .addMethod(
          getListAgentsOfUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.ListAgentsRequest,
              ondewo.nlu.AgentOuterClass.ListAgentsOfUserResponse>(
                service, METHODID_LIST_AGENTS_OF_USER)))
        .addMethod(
          getListAllAgentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.ListAgentsRequest,
              ondewo.nlu.AgentOuterClass.ListAgentsResponse>(
                service, METHODID_LIST_ALL_AGENTS)))
        .addMethod(
          getAddUserToProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.AddUserToProjectRequest,
              com.google.protobuf.Empty>(
                service, METHODID_ADD_USER_TO_PROJECT)))
        .addMethod(
          getRemoveUserFromProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.RemoveUserFromProjectRequest,
              com.google.protobuf.Empty>(
                service, METHODID_REMOVE_USER_FROM_PROJECT)))
        .addMethod(
          getListUsersInProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.ListUsersInProjectRequest,
              ondewo.nlu.AgentOuterClass.ListUsersInProjectResponse>(
                service, METHODID_LIST_USERS_IN_PROJECT)))
        .addMethod(
          getGetPlatformInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              ondewo.nlu.AgentOuterClass.GetPlatformInfoResponse>(
                service, METHODID_GET_PLATFORM_INFO)))
        .addMethod(
          getListProjectPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.ListProjectPermissionsRequest,
              ondewo.nlu.AgentOuterClass.ListProjectPermissionsResponse>(
                service, METHODID_LIST_PROJECT_PERMISSIONS)))
        .addMethod(
          getTrainAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.TrainAgentRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_TRAIN_AGENT)))
        .addMethod(
          getBuildCacheMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.BuildCacheRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_BUILD_CACHE)))
        .addMethod(
          getExportAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.ExportAgentRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_EXPORT_AGENT)))
        .addMethod(
          getExportBenchmarkAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.ExportBenchmarkAgentRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_EXPORT_BENCHMARK_AGENT)))
        .addMethod(
          getImportAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.ImportAgentRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_IMPORT_AGENT)))
        .addMethod(
          getMigrateAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.MigrateAgentRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_MIGRATE_AGENT)))
        .addMethod(
          getOptimizeRankingMatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.OptimizeRankingMatchRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_OPTIMIZE_RANKING_MATCH)))
        .addMethod(
          getRestoreAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.RestoreAgentRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_RESTORE_AGENT)))
        .addMethod(
          getGetAgentStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.GetAgentStatisticsRequest,
              ondewo.nlu.AgentOuterClass.GetAgentStatisticsResponse>(
                service, METHODID_GET_AGENT_STATISTICS)))
        .addMethod(
          getGetSessionsStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.GetSessionsStatisticsRequest,
              ondewo.nlu.AgentOuterClass.GetSessionsStatisticsResponse>(
                service, METHODID_GET_SESSIONS_STATISTICS)))
        .addMethod(
          getGetSessionsStatisticsTimeSeriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesRequest,
              ondewo.nlu.AgentOuterClass.GetSessionsStatisticsTimeSeriesResponse>(
                service, METHODID_GET_SESSIONS_STATISTICS_TIME_SERIES)))
        .addMethod(
          getSetAgentStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.SetAgentStatusRequest,
              ondewo.nlu.AgentOuterClass.Agent>(
                service, METHODID_SET_AGENT_STATUS)))
        .addMethod(
          getSetResourcesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.SetResourcesRequest,
              com.google.protobuf.Empty>(
                service, METHODID_SET_RESOURCES)))
        .addMethod(
          getDeleteResourcesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.DeleteResourcesRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_RESOURCES)))
        .addMethod(
          getExportResourcesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.ExportResourcesRequest,
              ondewo.nlu.AgentOuterClass.ExportResourcesResponse>(
                service, METHODID_EXPORT_RESOURCES)))
        .addMethod(
          getGetModelStatusesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.GetModelStatusesRequest,
              ondewo.nlu.AgentOuterClass.GetModelStatusesResponse>(
                service, METHODID_GET_MODEL_STATUSES)))
        .addMethod(
          getGetPlatformMappingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.GetPlatformMappingRequest,
              ondewo.nlu.AgentOuterClass.PlatformMapping>(
                service, METHODID_GET_PLATFORM_MAPPING)))
        .addMethod(
          getSetPlatformMappingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.PlatformMapping,
              ondewo.nlu.AgentOuterClass.PlatformMapping>(
                service, METHODID_SET_PLATFORM_MAPPING)))
        .addMethod(
          getGetFullTextSearchEntityTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
              ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntityType>(
                service, METHODID_GET_FULL_TEXT_SEARCH_ENTITY_TYPE)))
        .addMethod(
          getGetFullTextSearchEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
              ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntity>(
                service, METHODID_GET_FULL_TEXT_SEARCH_ENTITY)))
        .addMethod(
          getGetFullTextSearchEntitySynonymMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
              ondewo.nlu.AgentOuterClass.FullTextSearchResponseEntitySynonym>(
                service, METHODID_GET_FULL_TEXT_SEARCH_ENTITY_SYNONYM)))
        .addMethod(
          getGetFullTextSearchIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
              ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntent>(
                service, METHODID_GET_FULL_TEXT_SEARCH_INTENT)))
        .addMethod(
          getGetFullTextSearchIntentContextInMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
              ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextIn>(
                service, METHODID_GET_FULL_TEXT_SEARCH_INTENT_CONTEXT_IN)))
        .addMethod(
          getGetFullTextSearchIntentContextOutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
              ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentContextOut>(
                service, METHODID_GET_FULL_TEXT_SEARCH_INTENT_CONTEXT_OUT)))
        .addMethod(
          getGetFullTextSearchIntentUsersaysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
              ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentUsersays>(
                service, METHODID_GET_FULL_TEXT_SEARCH_INTENT_USERSAYS)))
        .addMethod(
          getGetFullTextSearchIntentTagsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
              ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentTags>(
                service, METHODID_GET_FULL_TEXT_SEARCH_INTENT_TAGS)))
        .addMethod(
          getGetFullTextSearchIntentResponseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
              ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentResponse>(
                service, METHODID_GET_FULL_TEXT_SEARCH_INTENT_RESPONSE)))
        .addMethod(
          getGetFullTextSearchIntentParametersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.FullTextSearchRequest,
              ondewo.nlu.AgentOuterClass.FullTextSearchResponseIntentParameters>(
                service, METHODID_GET_FULL_TEXT_SEARCH_INTENT_PARAMETERS)))
        .addMethod(
          getReindexAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.ReindexAgentRequest,
              ondewo.nlu.OperationsOuterClass.Operation>(
                service, METHODID_REINDEX_AGENT)))
        .addMethod(
          getCreateProjectTechnicalUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserRequest,
              ondewo.nlu.AgentOuterClass.CreateProjectTechnicalUserResponse>(
                service, METHODID_CREATE_PROJECT_TECHNICAL_USER)))
        .addMethod(
          getListProjectTechnicalUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersRequest,
              ondewo.nlu.AgentOuterClass.ListProjectTechnicalUsersResponse>(
                service, METHODID_LIST_PROJECT_TECHNICAL_USERS)))
        .addMethod(
          getDeleteProjectTechnicalUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.DeleteProjectTechnicalUserRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_PROJECT_TECHNICAL_USER)))
        .addMethod(
          getRotateProjectTechnicalUserPasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordRequest,
              ondewo.nlu.AgentOuterClass.RotateProjectTechnicalUserPasswordResponse>(
                service, METHODID_ROTATE_PROJECT_TECHNICAL_USER_PASSWORD)))
        .build();
  }

  private static abstract class AgentsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AgentsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ondewo.nlu.AgentOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Agents");
    }
  }

  private static final class AgentsFileDescriptorSupplier
      extends AgentsBaseDescriptorSupplier {
    AgentsFileDescriptorSupplier() {}
  }

  private static final class AgentsMethodDescriptorSupplier
      extends AgentsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AgentsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AgentsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AgentsFileDescriptorSupplier())
              .addMethod(getCreateAgentMethod())
              .addMethod(getUpdateAgentMethod())
              .addMethod(getGetAgentMethod())
              .addMethod(getDeleteAgentMethod())
              .addMethod(getDeleteAllAgentsMethod())
              .addMethod(getListAgentsMethod())
              .addMethod(getListAgentsOfUserMethod())
              .addMethod(getListAllAgentsMethod())
              .addMethod(getAddUserToProjectMethod())
              .addMethod(getRemoveUserFromProjectMethod())
              .addMethod(getListUsersInProjectMethod())
              .addMethod(getGetPlatformInfoMethod())
              .addMethod(getListProjectPermissionsMethod())
              .addMethod(getTrainAgentMethod())
              .addMethod(getBuildCacheMethod())
              .addMethod(getExportAgentMethod())
              .addMethod(getExportBenchmarkAgentMethod())
              .addMethod(getImportAgentMethod())
              .addMethod(getMigrateAgentMethod())
              .addMethod(getOptimizeRankingMatchMethod())
              .addMethod(getRestoreAgentMethod())
              .addMethod(getGetAgentStatisticsMethod())
              .addMethod(getGetSessionsStatisticsMethod())
              .addMethod(getGetSessionsStatisticsTimeSeriesMethod())
              .addMethod(getSetAgentStatusMethod())
              .addMethod(getSetResourcesMethod())
              .addMethod(getDeleteResourcesMethod())
              .addMethod(getExportResourcesMethod())
              .addMethod(getGetModelStatusesMethod())
              .addMethod(getGetPlatformMappingMethod())
              .addMethod(getSetPlatformMappingMethod())
              .addMethod(getGetFullTextSearchEntityTypeMethod())
              .addMethod(getGetFullTextSearchEntityMethod())
              .addMethod(getGetFullTextSearchEntitySynonymMethod())
              .addMethod(getGetFullTextSearchIntentMethod())
              .addMethod(getGetFullTextSearchIntentContextInMethod())
              .addMethod(getGetFullTextSearchIntentContextOutMethod())
              .addMethod(getGetFullTextSearchIntentUsersaysMethod())
              .addMethod(getGetFullTextSearchIntentTagsMethod())
              .addMethod(getGetFullTextSearchIntentResponseMethod())
              .addMethod(getGetFullTextSearchIntentParametersMethod())
              .addMethod(getReindexAgentMethod())
              .addMethod(getCreateProjectTechnicalUserMethod())
              .addMethod(getListProjectTechnicalUsersMethod())
              .addMethod(getDeleteProjectTechnicalUserMethod())
              .addMethod(getRotateProjectTechnicalUserPasswordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
