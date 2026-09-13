package ondewo.nlu;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * gRPC service for managing users and server roles.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class UsersGrpc {

  private UsersGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.nlu.Users";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.CreateUserRequest,
      ondewo.nlu.UserOuterClass.User> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = ondewo.nlu.UserOuterClass.CreateUserRequest.class,
      responseType = ondewo.nlu.UserOuterClass.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.CreateUserRequest,
      ondewo.nlu.UserOuterClass.User> getCreateUserMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.CreateUserRequest, ondewo.nlu.UserOuterClass.User> getCreateUserMethod;
    if ((getCreateUserMethod = UsersGrpc.getCreateUserMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getCreateUserMethod = UsersGrpc.getCreateUserMethod) == null) {
          UsersGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.UserOuterClass.CreateUserRequest, ondewo.nlu.UserOuterClass.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.GetUserRequest,
      ondewo.nlu.UserOuterClass.User> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = ondewo.nlu.UserOuterClass.GetUserRequest.class,
      responseType = ondewo.nlu.UserOuterClass.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.GetUserRequest,
      ondewo.nlu.UserOuterClass.User> getGetUserMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.GetUserRequest, ondewo.nlu.UserOuterClass.User> getGetUserMethod;
    if ((getGetUserMethod = UsersGrpc.getGetUserMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetUserMethod = UsersGrpc.getGetUserMethod) == null) {
          UsersGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.UserOuterClass.GetUserRequest, ondewo.nlu.UserOuterClass.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.GetUserRequest,
      ondewo.nlu.UserOuterClass.UserInfo> getGetUserInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserInfo",
      requestType = ondewo.nlu.UserOuterClass.GetUserRequest.class,
      responseType = ondewo.nlu.UserOuterClass.UserInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.GetUserRequest,
      ondewo.nlu.UserOuterClass.UserInfo> getGetUserInfoMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.GetUserRequest, ondewo.nlu.UserOuterClass.UserInfo> getGetUserInfoMethod;
    if ((getGetUserInfoMethod = UsersGrpc.getGetUserInfoMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetUserInfoMethod = UsersGrpc.getGetUserInfoMethod) == null) {
          UsersGrpc.getGetUserInfoMethod = getGetUserInfoMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.UserOuterClass.GetUserRequest, ondewo.nlu.UserOuterClass.UserInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.UserInfo.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("GetUserInfo"))
              .build();
        }
      }
    }
    return getGetUserInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.GetUserRequest,
      com.google.protobuf.Empty> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = ondewo.nlu.UserOuterClass.GetUserRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.GetUserRequest,
      com.google.protobuf.Empty> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.GetUserRequest, com.google.protobuf.Empty> getDeleteUserMethod;
    if ((getDeleteUserMethod = UsersGrpc.getDeleteUserMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getDeleteUserMethod = UsersGrpc.getDeleteUserMethod) == null) {
          UsersGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.UserOuterClass.GetUserRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("DeleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.UpdateUserRequest,
      ondewo.nlu.UserOuterClass.User> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = ondewo.nlu.UserOuterClass.UpdateUserRequest.class,
      responseType = ondewo.nlu.UserOuterClass.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.UpdateUserRequest,
      ondewo.nlu.UserOuterClass.User> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.UpdateUserRequest, ondewo.nlu.UserOuterClass.User> getUpdateUserMethod;
    if ((getUpdateUserMethod = UsersGrpc.getUpdateUserMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getUpdateUserMethod = UsersGrpc.getUpdateUserMethod) == null) {
          UsersGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.UserOuterClass.UpdateUserRequest, ondewo.nlu.UserOuterClass.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.ListUsersRequest,
      ondewo.nlu.UserOuterClass.ListUsersResponse> getListUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsers",
      requestType = ondewo.nlu.UserOuterClass.ListUsersRequest.class,
      responseType = ondewo.nlu.UserOuterClass.ListUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.ListUsersRequest,
      ondewo.nlu.UserOuterClass.ListUsersResponse> getListUsersMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.ListUsersRequest, ondewo.nlu.UserOuterClass.ListUsersResponse> getListUsersMethod;
    if ((getListUsersMethod = UsersGrpc.getListUsersMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getListUsersMethod = UsersGrpc.getListUsersMethod) == null) {
          UsersGrpc.getListUsersMethod = getListUsersMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.UserOuterClass.ListUsersRequest, ondewo.nlu.UserOuterClass.ListUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.ListUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.ListUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("ListUsers"))
              .build();
        }
      }
    }
    return getListUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.ListUsersRequest,
      ondewo.nlu.UserOuterClass.ListUserInfosResponse> getListUserInfosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserInfos",
      requestType = ondewo.nlu.UserOuterClass.ListUsersRequest.class,
      responseType = ondewo.nlu.UserOuterClass.ListUserInfosResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.ListUsersRequest,
      ondewo.nlu.UserOuterClass.ListUserInfosResponse> getListUserInfosMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.ListUsersRequest, ondewo.nlu.UserOuterClass.ListUserInfosResponse> getListUserInfosMethod;
    if ((getListUserInfosMethod = UsersGrpc.getListUserInfosMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getListUserInfosMethod = UsersGrpc.getListUserInfosMethod) == null) {
          UsersGrpc.getListUserInfosMethod = getListUserInfosMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.UserOuterClass.ListUsersRequest, ondewo.nlu.UserOuterClass.ListUserInfosResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserInfos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.ListUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.ListUserInfosResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("ListUserInfos"))
              .build();
        }
      }
    }
    return getListUserInfosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.CreateServerRoleRequest,
      ondewo.nlu.UserOuterClass.ServerRole> getCreateServerRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateServerRole",
      requestType = ondewo.nlu.UserOuterClass.CreateServerRoleRequest.class,
      responseType = ondewo.nlu.UserOuterClass.ServerRole.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.CreateServerRoleRequest,
      ondewo.nlu.UserOuterClass.ServerRole> getCreateServerRoleMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.CreateServerRoleRequest, ondewo.nlu.UserOuterClass.ServerRole> getCreateServerRoleMethod;
    if ((getCreateServerRoleMethod = UsersGrpc.getCreateServerRoleMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getCreateServerRoleMethod = UsersGrpc.getCreateServerRoleMethod) == null) {
          UsersGrpc.getCreateServerRoleMethod = getCreateServerRoleMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.UserOuterClass.CreateServerRoleRequest, ondewo.nlu.UserOuterClass.ServerRole>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateServerRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.CreateServerRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.ServerRole.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("CreateServerRole"))
              .build();
        }
      }
    }
    return getCreateServerRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.GetServerRoleRequest,
      ondewo.nlu.UserOuterClass.ServerRole> getGetServerRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServerRole",
      requestType = ondewo.nlu.UserOuterClass.GetServerRoleRequest.class,
      responseType = ondewo.nlu.UserOuterClass.ServerRole.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.GetServerRoleRequest,
      ondewo.nlu.UserOuterClass.ServerRole> getGetServerRoleMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.GetServerRoleRequest, ondewo.nlu.UserOuterClass.ServerRole> getGetServerRoleMethod;
    if ((getGetServerRoleMethod = UsersGrpc.getGetServerRoleMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetServerRoleMethod = UsersGrpc.getGetServerRoleMethod) == null) {
          UsersGrpc.getGetServerRoleMethod = getGetServerRoleMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.UserOuterClass.GetServerRoleRequest, ondewo.nlu.UserOuterClass.ServerRole>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServerRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.GetServerRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.ServerRole.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("GetServerRole"))
              .build();
        }
      }
    }
    return getGetServerRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.DeleteServerRoleRequest,
      com.google.protobuf.Empty> getDeleteServerRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteServerRole",
      requestType = ondewo.nlu.UserOuterClass.DeleteServerRoleRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.DeleteServerRoleRequest,
      com.google.protobuf.Empty> getDeleteServerRoleMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.DeleteServerRoleRequest, com.google.protobuf.Empty> getDeleteServerRoleMethod;
    if ((getDeleteServerRoleMethod = UsersGrpc.getDeleteServerRoleMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getDeleteServerRoleMethod = UsersGrpc.getDeleteServerRoleMethod) == null) {
          UsersGrpc.getDeleteServerRoleMethod = getDeleteServerRoleMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.UserOuterClass.DeleteServerRoleRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteServerRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.DeleteServerRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("DeleteServerRole"))
              .build();
        }
      }
    }
    return getDeleteServerRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.UpdateServerRoleRequest,
      ondewo.nlu.UserOuterClass.ServerRole> getUpdateServerRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateServerRole",
      requestType = ondewo.nlu.UserOuterClass.UpdateServerRoleRequest.class,
      responseType = ondewo.nlu.UserOuterClass.ServerRole.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.UpdateServerRoleRequest,
      ondewo.nlu.UserOuterClass.ServerRole> getUpdateServerRoleMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.UpdateServerRoleRequest, ondewo.nlu.UserOuterClass.ServerRole> getUpdateServerRoleMethod;
    if ((getUpdateServerRoleMethod = UsersGrpc.getUpdateServerRoleMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getUpdateServerRoleMethod = UsersGrpc.getUpdateServerRoleMethod) == null) {
          UsersGrpc.getUpdateServerRoleMethod = getUpdateServerRoleMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.UserOuterClass.UpdateServerRoleRequest, ondewo.nlu.UserOuterClass.ServerRole>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateServerRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.UpdateServerRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.ServerRole.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("UpdateServerRole"))
              .build();
        }
      }
    }
    return getUpdateServerRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.ListServerRolesRequest,
      ondewo.nlu.UserOuterClass.ListServerRolesResponse> getListServerRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListServerRoles",
      requestType = ondewo.nlu.UserOuterClass.ListServerRolesRequest.class,
      responseType = ondewo.nlu.UserOuterClass.ListServerRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.ListServerRolesRequest,
      ondewo.nlu.UserOuterClass.ListServerRolesResponse> getListServerRolesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.ListServerRolesRequest, ondewo.nlu.UserOuterClass.ListServerRolesResponse> getListServerRolesMethod;
    if ((getListServerRolesMethod = UsersGrpc.getListServerRolesMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getListServerRolesMethod = UsersGrpc.getListServerRolesMethod) == null) {
          UsersGrpc.getListServerRolesMethod = getListServerRolesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.UserOuterClass.ListServerRolesRequest, ondewo.nlu.UserOuterClass.ListServerRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListServerRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.ListServerRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.ListServerRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("ListServerRoles"))
              .build();
        }
      }
    }
    return getListServerRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.ListServerPermissionsRequest,
      ondewo.nlu.UserOuterClass.ListServerPermissionsResponse> getListServerPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListServerPermissions",
      requestType = ondewo.nlu.UserOuterClass.ListServerPermissionsRequest.class,
      responseType = ondewo.nlu.UserOuterClass.ListServerPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.ListServerPermissionsRequest,
      ondewo.nlu.UserOuterClass.ListServerPermissionsResponse> getListServerPermissionsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.ListServerPermissionsRequest, ondewo.nlu.UserOuterClass.ListServerPermissionsResponse> getListServerPermissionsMethod;
    if ((getListServerPermissionsMethod = UsersGrpc.getListServerPermissionsMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getListServerPermissionsMethod = UsersGrpc.getListServerPermissionsMethod) == null) {
          UsersGrpc.getListServerPermissionsMethod = getListServerPermissionsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.UserOuterClass.ListServerPermissionsRequest, ondewo.nlu.UserOuterClass.ListServerPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListServerPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.ListServerPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.ListServerPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("ListServerPermissions"))
              .build();
        }
      }
    }
    return getListServerPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getCheckLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckLogin",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getCheckLoginMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getCheckLoginMethod;
    if ((getCheckLoginMethod = UsersGrpc.getCheckLoginMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getCheckLoginMethod = UsersGrpc.getCheckLoginMethod) == null) {
          UsersGrpc.getCheckLoginMethod = getCheckLoginMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("CheckLogin"))
              .build();
        }
      }
    }
    return getCheckLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.ListNotificationsRequest,
      com.ondewo.nlu.ListNotificationsResponse> getListNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNotifications",
      requestType = com.ondewo.nlu.ListNotificationsRequest.class,
      responseType = com.ondewo.nlu.ListNotificationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.ListNotificationsRequest,
      com.ondewo.nlu.ListNotificationsResponse> getListNotificationsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.ListNotificationsRequest, com.ondewo.nlu.ListNotificationsResponse> getListNotificationsMethod;
    if ((getListNotificationsMethod = UsersGrpc.getListNotificationsMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getListNotificationsMethod = UsersGrpc.getListNotificationsMethod) == null) {
          UsersGrpc.getListNotificationsMethod = getListNotificationsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.ListNotificationsRequest, com.ondewo.nlu.ListNotificationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListNotificationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListNotificationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("ListNotifications"))
              .build();
        }
      }
    }
    return getListNotificationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.SetNotificationsFlaggedStatusRequest,
      com.ondewo.nlu.ListNotificationsResponse> getSetNotificationsFlaggedStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetNotificationsFlaggedStatus",
      requestType = com.ondewo.nlu.SetNotificationsFlaggedStatusRequest.class,
      responseType = com.ondewo.nlu.ListNotificationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.SetNotificationsFlaggedStatusRequest,
      com.ondewo.nlu.ListNotificationsResponse> getSetNotificationsFlaggedStatusMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.SetNotificationsFlaggedStatusRequest, com.ondewo.nlu.ListNotificationsResponse> getSetNotificationsFlaggedStatusMethod;
    if ((getSetNotificationsFlaggedStatusMethod = UsersGrpc.getSetNotificationsFlaggedStatusMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getSetNotificationsFlaggedStatusMethod = UsersGrpc.getSetNotificationsFlaggedStatusMethod) == null) {
          UsersGrpc.getSetNotificationsFlaggedStatusMethod = getSetNotificationsFlaggedStatusMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.SetNotificationsFlaggedStatusRequest, com.ondewo.nlu.ListNotificationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetNotificationsFlaggedStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.SetNotificationsFlaggedStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListNotificationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("SetNotificationsFlaggedStatus"))
              .build();
        }
      }
    }
    return getSetNotificationsFlaggedStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.SetNotificationsReadStatusRequest,
      com.ondewo.nlu.ListNotificationsResponse> getSetNotificationsReadStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetNotificationsReadStatus",
      requestType = com.ondewo.nlu.SetNotificationsReadStatusRequest.class,
      responseType = com.ondewo.nlu.ListNotificationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.SetNotificationsReadStatusRequest,
      com.ondewo.nlu.ListNotificationsResponse> getSetNotificationsReadStatusMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.SetNotificationsReadStatusRequest, com.ondewo.nlu.ListNotificationsResponse> getSetNotificationsReadStatusMethod;
    if ((getSetNotificationsReadStatusMethod = UsersGrpc.getSetNotificationsReadStatusMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getSetNotificationsReadStatusMethod = UsersGrpc.getSetNotificationsReadStatusMethod) == null) {
          UsersGrpc.getSetNotificationsReadStatusMethod = getSetNotificationsReadStatusMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.SetNotificationsReadStatusRequest, com.ondewo.nlu.ListNotificationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetNotificationsReadStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.SetNotificationsReadStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.ListNotificationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("SetNotificationsReadStatus"))
              .build();
        }
      }
    }
    return getSetNotificationsReadStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.AddNotificationsRequest,
      com.ondewo.nlu.AddNotificationsResponse> getAddNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddNotifications",
      requestType = com.ondewo.nlu.AddNotificationsRequest.class,
      responseType = com.ondewo.nlu.AddNotificationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.AddNotificationsRequest,
      com.ondewo.nlu.AddNotificationsResponse> getAddNotificationsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.AddNotificationsRequest, com.ondewo.nlu.AddNotificationsResponse> getAddNotificationsMethod;
    if ((getAddNotificationsMethod = UsersGrpc.getAddNotificationsMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getAddNotificationsMethod = UsersGrpc.getAddNotificationsMethod) == null) {
          UsersGrpc.getAddNotificationsMethod = getAddNotificationsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.AddNotificationsRequest, com.ondewo.nlu.AddNotificationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.AddNotificationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.AddNotificationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("AddNotifications"))
              .build();
        }
      }
    }
    return getAddNotificationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.GetNotificationRequest,
      com.ondewo.nlu.Notification> getGetNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNotification",
      requestType = com.ondewo.nlu.GetNotificationRequest.class,
      responseType = com.ondewo.nlu.Notification.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.GetNotificationRequest,
      com.ondewo.nlu.Notification> getGetNotificationMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.GetNotificationRequest, com.ondewo.nlu.Notification> getGetNotificationMethod;
    if ((getGetNotificationMethod = UsersGrpc.getGetNotificationMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetNotificationMethod = UsersGrpc.getGetNotificationMethod) == null) {
          UsersGrpc.getGetNotificationMethod = getGetNotificationMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.GetNotificationRequest, com.ondewo.nlu.Notification>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.GetNotificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.Notification.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("GetNotification"))
              .build();
        }
      }
    }
    return getGetNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.UpdateNotificationRequest,
      com.ondewo.nlu.Notification> getUpdateNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNotification",
      requestType = com.ondewo.nlu.UpdateNotificationRequest.class,
      responseType = com.ondewo.nlu.Notification.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.UpdateNotificationRequest,
      com.ondewo.nlu.Notification> getUpdateNotificationMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.UpdateNotificationRequest, com.ondewo.nlu.Notification> getUpdateNotificationMethod;
    if ((getUpdateNotificationMethod = UsersGrpc.getUpdateNotificationMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getUpdateNotificationMethod = UsersGrpc.getUpdateNotificationMethod) == null) {
          UsersGrpc.getUpdateNotificationMethod = getUpdateNotificationMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.UpdateNotificationRequest, com.ondewo.nlu.Notification>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.UpdateNotificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.Notification.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("UpdateNotification"))
              .build();
        }
      }
    }
    return getUpdateNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteNotificationsRequest,
      com.google.protobuf.Empty> getDeleteNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNotifications",
      requestType = com.ondewo.nlu.DeleteNotificationsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteNotificationsRequest,
      com.google.protobuf.Empty> getDeleteNotificationsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.DeleteNotificationsRequest, com.google.protobuf.Empty> getDeleteNotificationsMethod;
    if ((getDeleteNotificationsMethod = UsersGrpc.getDeleteNotificationsMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getDeleteNotificationsMethod = UsersGrpc.getDeleteNotificationsMethod) == null) {
          UsersGrpc.getDeleteNotificationsMethod = getDeleteNotificationsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.DeleteNotificationsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.DeleteNotificationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("DeleteNotifications"))
              .build();
        }
      }
    }
    return getDeleteNotificationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ondewo.nlu.StreamNotificationsRequest,
      com.ondewo.nlu.Notification> getStreamNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamNotifications",
      requestType = com.ondewo.nlu.StreamNotificationsRequest.class,
      responseType = com.ondewo.nlu.Notification.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.ondewo.nlu.StreamNotificationsRequest,
      com.ondewo.nlu.Notification> getStreamNotificationsMethod() {
    io.grpc.MethodDescriptor<com.ondewo.nlu.StreamNotificationsRequest, com.ondewo.nlu.Notification> getStreamNotificationsMethod;
    if ((getStreamNotificationsMethod = UsersGrpc.getStreamNotificationsMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getStreamNotificationsMethod = UsersGrpc.getStreamNotificationsMethod) == null) {
          UsersGrpc.getStreamNotificationsMethod = getStreamNotificationsMethod =
              io.grpc.MethodDescriptor.<com.ondewo.nlu.StreamNotificationsRequest, com.ondewo.nlu.Notification>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.StreamNotificationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ondewo.nlu.Notification.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("StreamNotifications"))
              .build();
        }
      }
    }
    return getStreamNotificationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.GetUserPreferencesRequest,
      ondewo.nlu.UserOuterClass.GetUserPreferencesResponse> getGetUserPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserPreferences",
      requestType = ondewo.nlu.UserOuterClass.GetUserPreferencesRequest.class,
      responseType = ondewo.nlu.UserOuterClass.GetUserPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.GetUserPreferencesRequest,
      ondewo.nlu.UserOuterClass.GetUserPreferencesResponse> getGetUserPreferencesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.GetUserPreferencesRequest, ondewo.nlu.UserOuterClass.GetUserPreferencesResponse> getGetUserPreferencesMethod;
    if ((getGetUserPreferencesMethod = UsersGrpc.getGetUserPreferencesMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetUserPreferencesMethod = UsersGrpc.getGetUserPreferencesMethod) == null) {
          UsersGrpc.getGetUserPreferencesMethod = getGetUserPreferencesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.UserOuterClass.GetUserPreferencesRequest, ondewo.nlu.UserOuterClass.GetUserPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.GetUserPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.GetUserPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("GetUserPreferences"))
              .build();
        }
      }
    }
    return getGetUserPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.SetUserPreferencesRequest,
      ondewo.nlu.UserOuterClass.SetUserPreferencesResponse> getSetUserPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUserPreferences",
      requestType = ondewo.nlu.UserOuterClass.SetUserPreferencesRequest.class,
      responseType = ondewo.nlu.UserOuterClass.SetUserPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.SetUserPreferencesRequest,
      ondewo.nlu.UserOuterClass.SetUserPreferencesResponse> getSetUserPreferencesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.SetUserPreferencesRequest, ondewo.nlu.UserOuterClass.SetUserPreferencesResponse> getSetUserPreferencesMethod;
    if ((getSetUserPreferencesMethod = UsersGrpc.getSetUserPreferencesMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getSetUserPreferencesMethod = UsersGrpc.getSetUserPreferencesMethod) == null) {
          UsersGrpc.getSetUserPreferencesMethod = getSetUserPreferencesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.UserOuterClass.SetUserPreferencesRequest, ondewo.nlu.UserOuterClass.SetUserPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetUserPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.SetUserPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.SetUserPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("SetUserPreferences"))
              .build();
        }
      }
    }
    return getSetUserPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.DeleteUserPreferencesRequest,
      ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse> getDeleteUserPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUserPreferences",
      requestType = ondewo.nlu.UserOuterClass.DeleteUserPreferencesRequest.class,
      responseType = ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.DeleteUserPreferencesRequest,
      ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse> getDeleteUserPreferencesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.DeleteUserPreferencesRequest, ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse> getDeleteUserPreferencesMethod;
    if ((getDeleteUserPreferencesMethod = UsersGrpc.getDeleteUserPreferencesMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getDeleteUserPreferencesMethod = UsersGrpc.getDeleteUserPreferencesMethod) == null) {
          UsersGrpc.getDeleteUserPreferencesMethod = getDeleteUserPreferencesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.UserOuterClass.DeleteUserPreferencesRequest, ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUserPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.DeleteUserPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("DeleteUserPreferences"))
              .build();
        }
      }
    }
    return getDeleteUserPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.DeleteAllUserPreferencesRequest,
      ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse> getDeleteAllUserPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAllUserPreferences",
      requestType = ondewo.nlu.UserOuterClass.DeleteAllUserPreferencesRequest.class,
      responseType = ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.DeleteAllUserPreferencesRequest,
      ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse> getDeleteAllUserPreferencesMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.UserOuterClass.DeleteAllUserPreferencesRequest, ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse> getDeleteAllUserPreferencesMethod;
    if ((getDeleteAllUserPreferencesMethod = UsersGrpc.getDeleteAllUserPreferencesMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getDeleteAllUserPreferencesMethod = UsersGrpc.getDeleteAllUserPreferencesMethod) == null) {
          UsersGrpc.getDeleteAllUserPreferencesMethod = getDeleteAllUserPreferencesMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.UserOuterClass.DeleteAllUserPreferencesRequest, ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAllUserPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.DeleteAllUserPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("DeleteAllUserPreferences"))
              .build();
        }
      }
    }
    return getDeleteAllUserPreferencesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UsersStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersStub>() {
        @java.lang.Override
        public UsersStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersStub(channel, callOptions);
        }
      };
    return UsersStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static UsersBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersBlockingV2Stub>() {
        @java.lang.Override
        public UsersBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersBlockingV2Stub(channel, callOptions);
        }
      };
    return UsersBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UsersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersBlockingStub>() {
        @java.lang.Override
        public UsersBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersBlockingStub(channel, callOptions);
        }
      };
    return UsersBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UsersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersFutureStub>() {
        @java.lang.Override
        public UsersFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersFutureStub(channel, callOptions);
        }
      };
    return UsersFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * gRPC service for managing users and server roles.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates a user.
     * </pre>
     */
    default void createUser(ondewo.nlu.UserOuterClass.CreateUserRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a user by identifier.
     * </pre>
     */
    default void getUser(ondewo.nlu.UserOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves user information by identifier.
     * </pre>
     */
    default void getUserInfo(ondewo.nlu.UserOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.UserInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a user by identifier.
     * </pre>
     */
    default void deleteUser(ondewo.nlu.UserOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a user.
     * </pre>
     */
    default void updateUser(ondewo.nlu.UserOuterClass.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists users.
     * </pre>
     */
    default void listUsers(ondewo.nlu.UserOuterClass.ListUsersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ListUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists user information.
     * </pre>
     */
    default void listUserInfos(ondewo.nlu.UserOuterClass.ListUsersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ListUserInfosResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUserInfosMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a server role.
     * </pre>
     */
    default void createServerRole(ondewo.nlu.UserOuterClass.CreateServerRoleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ServerRole> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateServerRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a server role by ID.
     * </pre>
     */
    default void getServerRole(ondewo.nlu.UserOuterClass.GetServerRoleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ServerRole> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServerRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a server role by ID.
     * </pre>
     */
    default void deleteServerRole(ondewo.nlu.UserOuterClass.DeleteServerRoleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteServerRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a server role.
     * </pre>
     */
    default void updateServerRole(ondewo.nlu.UserOuterClass.UpdateServerRoleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ServerRole> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateServerRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists server roles.
     * </pre>
     */
    default void listServerRoles(ondewo.nlu.UserOuterClass.ListServerRolesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ListServerRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListServerRolesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists server permissions.
     * </pre>
     */
    default void listServerPermissions(ondewo.nlu.UserOuterClass.ListServerPermissionsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ListServerPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListServerPermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Checks login.
     * </pre>
     */
    default void checkLogin(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckLoginMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists notifications based on specified filters.
     * </pre>
     */
    default void listNotifications(com.ondewo.nlu.ListNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListNotificationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNotificationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets the flagged status for multiple notifications.
     * </pre>
     */
    default void setNotificationsFlaggedStatus(com.ondewo.nlu.SetNotificationsFlaggedStatusRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListNotificationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetNotificationsFlaggedStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets the read status for multiple notifications.
     * </pre>
     */
    default void setNotificationsReadStatus(com.ondewo.nlu.SetNotificationsReadStatusRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListNotificationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetNotificationsReadStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds one or more notifications.
     * </pre>
     */
    default void addNotifications(com.ondewo.nlu.AddNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.AddNotificationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddNotificationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a single notification by its resource name.
     * </pre>
     */
    default void getNotification(com.ondewo.nlu.GetNotificationRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Notification> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNotificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a single notification, applying only the fields named in the update mask.
     * </pre>
     */
    default void updateNotification(com.ondewo.nlu.UpdateNotificationRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Notification> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNotificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes one or more notifications by their resource names.
     * </pre>
     */
    default void deleteNotifications(com.ondewo.nlu.DeleteNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNotificationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Streams notifications for the authenticated caller in real time: each newly-added notification that
     * matches the request filter is pushed to the client as it is created (backed server-side by a
     * Postgres LISTEN/NOTIFY channel). The stream stays open until the client disconnects. When
     * &lt;code&gt;include_existing&lt;/code&gt; is set the currently-stored matching notifications are replayed first
     * (newest last) before switching to the live tail.
     * </pre>
     */
    default void streamNotifications(com.ondewo.nlu.StreamNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Notification> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamNotificationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves user preferences based on the provided request.
     * </pre>
     */
    default void getUserPreferences(ondewo.nlu.UserOuterClass.GetUserPreferencesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.GetUserPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets or updates user preferences based on the provided request.
     * </pre>
     */
    default void setUserPreferences(ondewo.nlu.UserOuterClass.SetUserPreferencesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.SetUserPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetUserPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes specific user preferences based on the provided request.
     * </pre>
     */
    default void deleteUserPreferences(ondewo.nlu.UserOuterClass.DeleteUserPreferencesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes all user preferences for a specific user, optionally filtered by a substring.
     * </pre>
     */
    default void deleteAllUserPreferences(ondewo.nlu.UserOuterClass.DeleteAllUserPreferencesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAllUserPreferencesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Users.
   * <pre>
   * gRPC service for managing users and server roles.
   * </pre>
   */
  public static abstract class UsersImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UsersGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Users.
   * <pre>
   * gRPC service for managing users and server roles.
   * </pre>
   */
  public static final class UsersStub
      extends io.grpc.stub.AbstractAsyncStub<UsersStub> {
    private UsersStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a user.
     * </pre>
     */
    public void createUser(ondewo.nlu.UserOuterClass.CreateUserRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a user by identifier.
     * </pre>
     */
    public void getUser(ondewo.nlu.UserOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves user information by identifier.
     * </pre>
     */
    public void getUserInfo(ondewo.nlu.UserOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.UserInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a user by identifier.
     * </pre>
     */
    public void deleteUser(ondewo.nlu.UserOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a user.
     * </pre>
     */
    public void updateUser(ondewo.nlu.UserOuterClass.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists users.
     * </pre>
     */
    public void listUsers(ondewo.nlu.UserOuterClass.ListUsersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ListUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists user information.
     * </pre>
     */
    public void listUserInfos(ondewo.nlu.UserOuterClass.ListUsersRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ListUserInfosResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUserInfosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a server role.
     * </pre>
     */
    public void createServerRole(ondewo.nlu.UserOuterClass.CreateServerRoleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ServerRole> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateServerRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a server role by ID.
     * </pre>
     */
    public void getServerRole(ondewo.nlu.UserOuterClass.GetServerRoleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ServerRole> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServerRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a server role by ID.
     * </pre>
     */
    public void deleteServerRole(ondewo.nlu.UserOuterClass.DeleteServerRoleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteServerRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a server role.
     * </pre>
     */
    public void updateServerRole(ondewo.nlu.UserOuterClass.UpdateServerRoleRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ServerRole> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateServerRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists server roles.
     * </pre>
     */
    public void listServerRoles(ondewo.nlu.UserOuterClass.ListServerRolesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ListServerRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListServerRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists server permissions.
     * </pre>
     */
    public void listServerPermissions(ondewo.nlu.UserOuterClass.ListServerPermissionsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ListServerPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListServerPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Checks login.
     * </pre>
     */
    public void checkLogin(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists notifications based on specified filters.
     * </pre>
     */
    public void listNotifications(com.ondewo.nlu.ListNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListNotificationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNotificationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the flagged status for multiple notifications.
     * </pre>
     */
    public void setNotificationsFlaggedStatus(com.ondewo.nlu.SetNotificationsFlaggedStatusRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListNotificationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetNotificationsFlaggedStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the read status for multiple notifications.
     * </pre>
     */
    public void setNotificationsReadStatus(com.ondewo.nlu.SetNotificationsReadStatusRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.ListNotificationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetNotificationsReadStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds one or more notifications.
     * </pre>
     */
    public void addNotifications(com.ondewo.nlu.AddNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.AddNotificationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddNotificationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a single notification by its resource name.
     * </pre>
     */
    public void getNotification(com.ondewo.nlu.GetNotificationRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Notification> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a single notification, applying only the fields named in the update mask.
     * </pre>
     */
    public void updateNotification(com.ondewo.nlu.UpdateNotificationRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Notification> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes one or more notifications by their resource names.
     * </pre>
     */
    public void deleteNotifications(com.ondewo.nlu.DeleteNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNotificationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Streams notifications for the authenticated caller in real time: each newly-added notification that
     * matches the request filter is pushed to the client as it is created (backed server-side by a
     * Postgres LISTEN/NOTIFY channel). The stream stays open until the client disconnects. When
     * &lt;code&gt;include_existing&lt;/code&gt; is set the currently-stored matching notifications are replayed first
     * (newest last) before switching to the live tail.
     * </pre>
     */
    public void streamNotifications(com.ondewo.nlu.StreamNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.ondewo.nlu.Notification> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamNotificationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves user preferences based on the provided request.
     * </pre>
     */
    public void getUserPreferences(ondewo.nlu.UserOuterClass.GetUserPreferencesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.GetUserPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets or updates user preferences based on the provided request.
     * </pre>
     */
    public void setUserPreferences(ondewo.nlu.UserOuterClass.SetUserPreferencesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.SetUserPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetUserPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes specific user preferences based on the provided request.
     * </pre>
     */
    public void deleteUserPreferences(ondewo.nlu.UserOuterClass.DeleteUserPreferencesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes all user preferences for a specific user, optionally filtered by a substring.
     * </pre>
     */
    public void deleteAllUserPreferences(ondewo.nlu.UserOuterClass.DeleteAllUserPreferencesRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAllUserPreferencesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Users.
   * <pre>
   * gRPC service for managing users and server roles.
   * </pre>
   */
  public static final class UsersBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<UsersBlockingV2Stub> {
    private UsersBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a user.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.User createUser(ondewo.nlu.UserOuterClass.CreateUserRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a user by identifier.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.User getUser(ondewo.nlu.UserOuterClass.GetUserRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves user information by identifier.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.UserInfo getUserInfo(ondewo.nlu.UserOuterClass.GetUserRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetUserInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a user by identifier.
     * </pre>
     */
    public com.google.protobuf.Empty deleteUser(ondewo.nlu.UserOuterClass.GetUserRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a user.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.User updateUser(ondewo.nlu.UserOuterClass.UpdateUserRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists users.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.ListUsersResponse listUsers(ondewo.nlu.UserOuterClass.ListUsersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists user information.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.ListUserInfosResponse listUserInfos(ondewo.nlu.UserOuterClass.ListUsersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListUserInfosMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a server role.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.ServerRole createServerRole(ondewo.nlu.UserOuterClass.CreateServerRoleRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateServerRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a server role by ID.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.ServerRole getServerRole(ondewo.nlu.UserOuterClass.GetServerRoleRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetServerRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a server role by ID.
     * </pre>
     */
    public com.google.protobuf.Empty deleteServerRole(ondewo.nlu.UserOuterClass.DeleteServerRoleRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteServerRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a server role.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.ServerRole updateServerRole(ondewo.nlu.UserOuterClass.UpdateServerRoleRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateServerRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists server roles.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.ListServerRolesResponse listServerRoles(ondewo.nlu.UserOuterClass.ListServerRolesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListServerRolesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists server permissions.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.ListServerPermissionsResponse listServerPermissions(ondewo.nlu.UserOuterClass.ListServerPermissionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListServerPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Checks login.
     * </pre>
     */
    public com.google.protobuf.Empty checkLogin(com.google.protobuf.Empty request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCheckLoginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists notifications based on specified filters.
     * </pre>
     */
    public com.ondewo.nlu.ListNotificationsResponse listNotifications(com.ondewo.nlu.ListNotificationsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListNotificationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the flagged status for multiple notifications.
     * </pre>
     */
    public com.ondewo.nlu.ListNotificationsResponse setNotificationsFlaggedStatus(com.ondewo.nlu.SetNotificationsFlaggedStatusRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSetNotificationsFlaggedStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the read status for multiple notifications.
     * </pre>
     */
    public com.ondewo.nlu.ListNotificationsResponse setNotificationsReadStatus(com.ondewo.nlu.SetNotificationsReadStatusRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSetNotificationsReadStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds one or more notifications.
     * </pre>
     */
    public com.ondewo.nlu.AddNotificationsResponse addNotifications(com.ondewo.nlu.AddNotificationsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getAddNotificationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a single notification by its resource name.
     * </pre>
     */
    public com.ondewo.nlu.Notification getNotification(com.ondewo.nlu.GetNotificationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetNotificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a single notification, applying only the fields named in the update mask.
     * </pre>
     */
    public com.ondewo.nlu.Notification updateNotification(com.ondewo.nlu.UpdateNotificationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateNotificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes one or more notifications by their resource names.
     * </pre>
     */
    public com.google.protobuf.Empty deleteNotifications(com.ondewo.nlu.DeleteNotificationsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteNotificationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Streams notifications for the authenticated caller in real time: each newly-added notification that
     * matches the request filter is pushed to the client as it is created (backed server-side by a
     * Postgres LISTEN/NOTIFY channel). The stream stays open until the client disconnects. When
     * &lt;code&gt;include_existing&lt;/code&gt; is set the currently-stored matching notifications are replayed first
     * (newest last) before switching to the live tail.
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, com.ondewo.nlu.Notification>
        streamNotifications(com.ondewo.nlu.StreamNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getStreamNotificationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves user preferences based on the provided request.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.GetUserPreferencesResponse getUserPreferences(ondewo.nlu.UserOuterClass.GetUserPreferencesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetUserPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets or updates user preferences based on the provided request.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.SetUserPreferencesResponse setUserPreferences(ondewo.nlu.UserOuterClass.SetUserPreferencesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSetUserPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes specific user preferences based on the provided request.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse deleteUserPreferences(ondewo.nlu.UserOuterClass.DeleteUserPreferencesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteUserPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes all user preferences for a specific user, optionally filtered by a substring.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse deleteAllUserPreferences(ondewo.nlu.UserOuterClass.DeleteAllUserPreferencesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteAllUserPreferencesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Users.
   * <pre>
   * gRPC service for managing users and server roles.
   * </pre>
   */
  public static final class UsersBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UsersBlockingStub> {
    private UsersBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a user.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.User createUser(ondewo.nlu.UserOuterClass.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a user by identifier.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.User getUser(ondewo.nlu.UserOuterClass.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves user information by identifier.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.UserInfo getUserInfo(ondewo.nlu.UserOuterClass.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a user by identifier.
     * </pre>
     */
    public com.google.protobuf.Empty deleteUser(ondewo.nlu.UserOuterClass.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a user.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.User updateUser(ondewo.nlu.UserOuterClass.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists users.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.ListUsersResponse listUsers(ondewo.nlu.UserOuterClass.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists user information.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.ListUserInfosResponse listUserInfos(ondewo.nlu.UserOuterClass.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUserInfosMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a server role.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.ServerRole createServerRole(ondewo.nlu.UserOuterClass.CreateServerRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateServerRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a server role by ID.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.ServerRole getServerRole(ondewo.nlu.UserOuterClass.GetServerRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServerRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a server role by ID.
     * </pre>
     */
    public com.google.protobuf.Empty deleteServerRole(ondewo.nlu.UserOuterClass.DeleteServerRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteServerRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a server role.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.ServerRole updateServerRole(ondewo.nlu.UserOuterClass.UpdateServerRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateServerRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists server roles.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.ListServerRolesResponse listServerRoles(ondewo.nlu.UserOuterClass.ListServerRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListServerRolesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists server permissions.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.ListServerPermissionsResponse listServerPermissions(ondewo.nlu.UserOuterClass.ListServerPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListServerPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Checks login.
     * </pre>
     */
    public com.google.protobuf.Empty checkLogin(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckLoginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists notifications based on specified filters.
     * </pre>
     */
    public com.ondewo.nlu.ListNotificationsResponse listNotifications(com.ondewo.nlu.ListNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNotificationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the flagged status for multiple notifications.
     * </pre>
     */
    public com.ondewo.nlu.ListNotificationsResponse setNotificationsFlaggedStatus(com.ondewo.nlu.SetNotificationsFlaggedStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetNotificationsFlaggedStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the read status for multiple notifications.
     * </pre>
     */
    public com.ondewo.nlu.ListNotificationsResponse setNotificationsReadStatus(com.ondewo.nlu.SetNotificationsReadStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetNotificationsReadStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds one or more notifications.
     * </pre>
     */
    public com.ondewo.nlu.AddNotificationsResponse addNotifications(com.ondewo.nlu.AddNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddNotificationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a single notification by its resource name.
     * </pre>
     */
    public com.ondewo.nlu.Notification getNotification(com.ondewo.nlu.GetNotificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNotificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a single notification, applying only the fields named in the update mask.
     * </pre>
     */
    public com.ondewo.nlu.Notification updateNotification(com.ondewo.nlu.UpdateNotificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNotificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes one or more notifications by their resource names.
     * </pre>
     */
    public com.google.protobuf.Empty deleteNotifications(com.ondewo.nlu.DeleteNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNotificationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Streams notifications for the authenticated caller in real time: each newly-added notification that
     * matches the request filter is pushed to the client as it is created (backed server-side by a
     * Postgres LISTEN/NOTIFY channel). The stream stays open until the client disconnects. When
     * &lt;code&gt;include_existing&lt;/code&gt; is set the currently-stored matching notifications are replayed first
     * (newest last) before switching to the live tail.
     * </pre>
     */
    public java.util.Iterator<com.ondewo.nlu.Notification> streamNotifications(
        com.ondewo.nlu.StreamNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamNotificationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves user preferences based on the provided request.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.GetUserPreferencesResponse getUserPreferences(ondewo.nlu.UserOuterClass.GetUserPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets or updates user preferences based on the provided request.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.SetUserPreferencesResponse setUserPreferences(ondewo.nlu.UserOuterClass.SetUserPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetUserPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes specific user preferences based on the provided request.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse deleteUserPreferences(ondewo.nlu.UserOuterClass.DeleteUserPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes all user preferences for a specific user, optionally filtered by a substring.
     * </pre>
     */
    public ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse deleteAllUserPreferences(ondewo.nlu.UserOuterClass.DeleteAllUserPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAllUserPreferencesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Users.
   * <pre>
   * gRPC service for managing users and server roles.
   * </pre>
   */
  public static final class UsersFutureStub
      extends io.grpc.stub.AbstractFutureStub<UsersFutureStub> {
    private UsersFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.UserOuterClass.User> createUser(
        ondewo.nlu.UserOuterClass.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a user by identifier.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.UserOuterClass.User> getUser(
        ondewo.nlu.UserOuterClass.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves user information by identifier.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.UserOuterClass.UserInfo> getUserInfo(
        ondewo.nlu.UserOuterClass.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a user by identifier.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteUser(
        ondewo.nlu.UserOuterClass.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.UserOuterClass.User> updateUser(
        ondewo.nlu.UserOuterClass.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists users.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.UserOuterClass.ListUsersResponse> listUsers(
        ondewo.nlu.UserOuterClass.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists user information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.UserOuterClass.ListUserInfosResponse> listUserInfos(
        ondewo.nlu.UserOuterClass.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUserInfosMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a server role.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.UserOuterClass.ServerRole> createServerRole(
        ondewo.nlu.UserOuterClass.CreateServerRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateServerRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a server role by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.UserOuterClass.ServerRole> getServerRole(
        ondewo.nlu.UserOuterClass.GetServerRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServerRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a server role by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteServerRole(
        ondewo.nlu.UserOuterClass.DeleteServerRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteServerRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a server role.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.UserOuterClass.ServerRole> updateServerRole(
        ondewo.nlu.UserOuterClass.UpdateServerRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateServerRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists server roles.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.UserOuterClass.ListServerRolesResponse> listServerRoles(
        ondewo.nlu.UserOuterClass.ListServerRolesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListServerRolesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists server permissions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.UserOuterClass.ListServerPermissionsResponse> listServerPermissions(
        ondewo.nlu.UserOuterClass.ListServerPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListServerPermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Checks login.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> checkLogin(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckLoginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists notifications based on specified filters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListNotificationsResponse> listNotifications(
        com.ondewo.nlu.ListNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNotificationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the flagged status for multiple notifications.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListNotificationsResponse> setNotificationsFlaggedStatus(
        com.ondewo.nlu.SetNotificationsFlaggedStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetNotificationsFlaggedStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the read status for multiple notifications.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.ListNotificationsResponse> setNotificationsReadStatus(
        com.ondewo.nlu.SetNotificationsReadStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetNotificationsReadStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds one or more notifications.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.AddNotificationsResponse> addNotifications(
        com.ondewo.nlu.AddNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddNotificationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a single notification by its resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.Notification> getNotification(
        com.ondewo.nlu.GetNotificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNotificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a single notification, applying only the fields named in the update mask.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ondewo.nlu.Notification> updateNotification(
        com.ondewo.nlu.UpdateNotificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNotificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes one or more notifications by their resource names.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteNotifications(
        com.ondewo.nlu.DeleteNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNotificationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves user preferences based on the provided request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.UserOuterClass.GetUserPreferencesResponse> getUserPreferences(
        ondewo.nlu.UserOuterClass.GetUserPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets or updates user preferences based on the provided request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.UserOuterClass.SetUserPreferencesResponse> setUserPreferences(
        ondewo.nlu.UserOuterClass.SetUserPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetUserPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes specific user preferences based on the provided request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse> deleteUserPreferences(
        ondewo.nlu.UserOuterClass.DeleteUserPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes all user preferences for a specific user, optionally filtered by a substring.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse> deleteAllUserPreferences(
        ondewo.nlu.UserOuterClass.DeleteAllUserPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAllUserPreferencesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_GET_USER = 1;
  private static final int METHODID_GET_USER_INFO = 2;
  private static final int METHODID_DELETE_USER = 3;
  private static final int METHODID_UPDATE_USER = 4;
  private static final int METHODID_LIST_USERS = 5;
  private static final int METHODID_LIST_USER_INFOS = 6;
  private static final int METHODID_CREATE_SERVER_ROLE = 7;
  private static final int METHODID_GET_SERVER_ROLE = 8;
  private static final int METHODID_DELETE_SERVER_ROLE = 9;
  private static final int METHODID_UPDATE_SERVER_ROLE = 10;
  private static final int METHODID_LIST_SERVER_ROLES = 11;
  private static final int METHODID_LIST_SERVER_PERMISSIONS = 12;
  private static final int METHODID_CHECK_LOGIN = 13;
  private static final int METHODID_LIST_NOTIFICATIONS = 14;
  private static final int METHODID_SET_NOTIFICATIONS_FLAGGED_STATUS = 15;
  private static final int METHODID_SET_NOTIFICATIONS_READ_STATUS = 16;
  private static final int METHODID_ADD_NOTIFICATIONS = 17;
  private static final int METHODID_GET_NOTIFICATION = 18;
  private static final int METHODID_UPDATE_NOTIFICATION = 19;
  private static final int METHODID_DELETE_NOTIFICATIONS = 20;
  private static final int METHODID_STREAM_NOTIFICATIONS = 21;
  private static final int METHODID_GET_USER_PREFERENCES = 22;
  private static final int METHODID_SET_USER_PREFERENCES = 23;
  private static final int METHODID_DELETE_USER_PREFERENCES = 24;
  private static final int METHODID_DELETE_ALL_USER_PREFERENCES = 25;

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
        case METHODID_CREATE_USER:
          serviceImpl.createUser((ondewo.nlu.UserOuterClass.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.User>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((ondewo.nlu.UserOuterClass.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.User>) responseObserver);
          break;
        case METHODID_GET_USER_INFO:
          serviceImpl.getUserInfo((ondewo.nlu.UserOuterClass.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.UserInfo>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((ondewo.nlu.UserOuterClass.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((ondewo.nlu.UserOuterClass.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.User>) responseObserver);
          break;
        case METHODID_LIST_USERS:
          serviceImpl.listUsers((ondewo.nlu.UserOuterClass.ListUsersRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ListUsersResponse>) responseObserver);
          break;
        case METHODID_LIST_USER_INFOS:
          serviceImpl.listUserInfos((ondewo.nlu.UserOuterClass.ListUsersRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ListUserInfosResponse>) responseObserver);
          break;
        case METHODID_CREATE_SERVER_ROLE:
          serviceImpl.createServerRole((ondewo.nlu.UserOuterClass.CreateServerRoleRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ServerRole>) responseObserver);
          break;
        case METHODID_GET_SERVER_ROLE:
          serviceImpl.getServerRole((ondewo.nlu.UserOuterClass.GetServerRoleRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ServerRole>) responseObserver);
          break;
        case METHODID_DELETE_SERVER_ROLE:
          serviceImpl.deleteServerRole((ondewo.nlu.UserOuterClass.DeleteServerRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_SERVER_ROLE:
          serviceImpl.updateServerRole((ondewo.nlu.UserOuterClass.UpdateServerRoleRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ServerRole>) responseObserver);
          break;
        case METHODID_LIST_SERVER_ROLES:
          serviceImpl.listServerRoles((ondewo.nlu.UserOuterClass.ListServerRolesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ListServerRolesResponse>) responseObserver);
          break;
        case METHODID_LIST_SERVER_PERMISSIONS:
          serviceImpl.listServerPermissions((ondewo.nlu.UserOuterClass.ListServerPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.ListServerPermissionsResponse>) responseObserver);
          break;
        case METHODID_CHECK_LOGIN:
          serviceImpl.checkLogin((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_NOTIFICATIONS:
          serviceImpl.listNotifications((com.ondewo.nlu.ListNotificationsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListNotificationsResponse>) responseObserver);
          break;
        case METHODID_SET_NOTIFICATIONS_FLAGGED_STATUS:
          serviceImpl.setNotificationsFlaggedStatus((com.ondewo.nlu.SetNotificationsFlaggedStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListNotificationsResponse>) responseObserver);
          break;
        case METHODID_SET_NOTIFICATIONS_READ_STATUS:
          serviceImpl.setNotificationsReadStatus((com.ondewo.nlu.SetNotificationsReadStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.ListNotificationsResponse>) responseObserver);
          break;
        case METHODID_ADD_NOTIFICATIONS:
          serviceImpl.addNotifications((com.ondewo.nlu.AddNotificationsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.AddNotificationsResponse>) responseObserver);
          break;
        case METHODID_GET_NOTIFICATION:
          serviceImpl.getNotification((com.ondewo.nlu.GetNotificationRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.Notification>) responseObserver);
          break;
        case METHODID_UPDATE_NOTIFICATION:
          serviceImpl.updateNotification((com.ondewo.nlu.UpdateNotificationRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.Notification>) responseObserver);
          break;
        case METHODID_DELETE_NOTIFICATIONS:
          serviceImpl.deleteNotifications((com.ondewo.nlu.DeleteNotificationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_STREAM_NOTIFICATIONS:
          serviceImpl.streamNotifications((com.ondewo.nlu.StreamNotificationsRequest) request,
              (io.grpc.stub.StreamObserver<com.ondewo.nlu.Notification>) responseObserver);
          break;
        case METHODID_GET_USER_PREFERENCES:
          serviceImpl.getUserPreferences((ondewo.nlu.UserOuterClass.GetUserPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.GetUserPreferencesResponse>) responseObserver);
          break;
        case METHODID_SET_USER_PREFERENCES:
          serviceImpl.setUserPreferences((ondewo.nlu.UserOuterClass.SetUserPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.SetUserPreferencesResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER_PREFERENCES:
          serviceImpl.deleteUserPreferences((ondewo.nlu.UserOuterClass.DeleteUserPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse>) responseObserver);
          break;
        case METHODID_DELETE_ALL_USER_PREFERENCES:
          serviceImpl.deleteAllUserPreferences((ondewo.nlu.UserOuterClass.DeleteAllUserPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse>) responseObserver);
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
          getCreateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.UserOuterClass.CreateUserRequest,
              ondewo.nlu.UserOuterClass.User>(
                service, METHODID_CREATE_USER)))
        .addMethod(
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.UserOuterClass.GetUserRequest,
              ondewo.nlu.UserOuterClass.User>(
                service, METHODID_GET_USER)))
        .addMethod(
          getGetUserInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.UserOuterClass.GetUserRequest,
              ondewo.nlu.UserOuterClass.UserInfo>(
                service, METHODID_GET_USER_INFO)))
        .addMethod(
          getDeleteUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.UserOuterClass.GetUserRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_USER)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.UserOuterClass.UpdateUserRequest,
              ondewo.nlu.UserOuterClass.User>(
                service, METHODID_UPDATE_USER)))
        .addMethod(
          getListUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.UserOuterClass.ListUsersRequest,
              ondewo.nlu.UserOuterClass.ListUsersResponse>(
                service, METHODID_LIST_USERS)))
        .addMethod(
          getListUserInfosMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.UserOuterClass.ListUsersRequest,
              ondewo.nlu.UserOuterClass.ListUserInfosResponse>(
                service, METHODID_LIST_USER_INFOS)))
        .addMethod(
          getCreateServerRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.UserOuterClass.CreateServerRoleRequest,
              ondewo.nlu.UserOuterClass.ServerRole>(
                service, METHODID_CREATE_SERVER_ROLE)))
        .addMethod(
          getGetServerRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.UserOuterClass.GetServerRoleRequest,
              ondewo.nlu.UserOuterClass.ServerRole>(
                service, METHODID_GET_SERVER_ROLE)))
        .addMethod(
          getDeleteServerRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.UserOuterClass.DeleteServerRoleRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_SERVER_ROLE)))
        .addMethod(
          getUpdateServerRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.UserOuterClass.UpdateServerRoleRequest,
              ondewo.nlu.UserOuterClass.ServerRole>(
                service, METHODID_UPDATE_SERVER_ROLE)))
        .addMethod(
          getListServerRolesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.UserOuterClass.ListServerRolesRequest,
              ondewo.nlu.UserOuterClass.ListServerRolesResponse>(
                service, METHODID_LIST_SERVER_ROLES)))
        .addMethod(
          getListServerPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.UserOuterClass.ListServerPermissionsRequest,
              ondewo.nlu.UserOuterClass.ListServerPermissionsResponse>(
                service, METHODID_LIST_SERVER_PERMISSIONS)))
        .addMethod(
          getCheckLoginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_CHECK_LOGIN)))
        .addMethod(
          getListNotificationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.ListNotificationsRequest,
              com.ondewo.nlu.ListNotificationsResponse>(
                service, METHODID_LIST_NOTIFICATIONS)))
        .addMethod(
          getSetNotificationsFlaggedStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.SetNotificationsFlaggedStatusRequest,
              com.ondewo.nlu.ListNotificationsResponse>(
                service, METHODID_SET_NOTIFICATIONS_FLAGGED_STATUS)))
        .addMethod(
          getSetNotificationsReadStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.SetNotificationsReadStatusRequest,
              com.ondewo.nlu.ListNotificationsResponse>(
                service, METHODID_SET_NOTIFICATIONS_READ_STATUS)))
        .addMethod(
          getAddNotificationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.AddNotificationsRequest,
              com.ondewo.nlu.AddNotificationsResponse>(
                service, METHODID_ADD_NOTIFICATIONS)))
        .addMethod(
          getGetNotificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.GetNotificationRequest,
              com.ondewo.nlu.Notification>(
                service, METHODID_GET_NOTIFICATION)))
        .addMethod(
          getUpdateNotificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.UpdateNotificationRequest,
              com.ondewo.nlu.Notification>(
                service, METHODID_UPDATE_NOTIFICATION)))
        .addMethod(
          getDeleteNotificationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ondewo.nlu.DeleteNotificationsRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_NOTIFICATIONS)))
        .addMethod(
          getStreamNotificationsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.ondewo.nlu.StreamNotificationsRequest,
              com.ondewo.nlu.Notification>(
                service, METHODID_STREAM_NOTIFICATIONS)))
        .addMethod(
          getGetUserPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.UserOuterClass.GetUserPreferencesRequest,
              ondewo.nlu.UserOuterClass.GetUserPreferencesResponse>(
                service, METHODID_GET_USER_PREFERENCES)))
        .addMethod(
          getSetUserPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.UserOuterClass.SetUserPreferencesRequest,
              ondewo.nlu.UserOuterClass.SetUserPreferencesResponse>(
                service, METHODID_SET_USER_PREFERENCES)))
        .addMethod(
          getDeleteUserPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.UserOuterClass.DeleteUserPreferencesRequest,
              ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse>(
                service, METHODID_DELETE_USER_PREFERENCES)))
        .addMethod(
          getDeleteAllUserPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.UserOuterClass.DeleteAllUserPreferencesRequest,
              ondewo.nlu.UserOuterClass.DeleteUserPreferencesResponse>(
                service, METHODID_DELETE_ALL_USER_PREFERENCES)))
        .build();
  }

  private static abstract class UsersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UsersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ondewo.nlu.UserOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Users");
    }
  }

  private static final class UsersFileDescriptorSupplier
      extends UsersBaseDescriptorSupplier {
    UsersFileDescriptorSupplier() {}
  }

  private static final class UsersMethodDescriptorSupplier
      extends UsersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UsersMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UsersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UsersFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getGetUserInfoMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getListUsersMethod())
              .addMethod(getListUserInfosMethod())
              .addMethod(getCreateServerRoleMethod())
              .addMethod(getGetServerRoleMethod())
              .addMethod(getDeleteServerRoleMethod())
              .addMethod(getUpdateServerRoleMethod())
              .addMethod(getListServerRolesMethod())
              .addMethod(getListServerPermissionsMethod())
              .addMethod(getCheckLoginMethod())
              .addMethod(getListNotificationsMethod())
              .addMethod(getSetNotificationsFlaggedStatusMethod())
              .addMethod(getSetNotificationsReadStatusMethod())
              .addMethod(getAddNotificationsMethod())
              .addMethod(getGetNotificationMethod())
              .addMethod(getUpdateNotificationMethod())
              .addMethod(getDeleteNotificationsMethod())
              .addMethod(getStreamNotificationsMethod())
              .addMethod(getGetUserPreferencesMethod())
              .addMethod(getSetUserPreferencesMethod())
              .addMethod(getDeleteUserPreferencesMethod())
              .addMethod(getDeleteAllUserPreferencesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
