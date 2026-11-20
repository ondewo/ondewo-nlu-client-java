package ondewo.nlu;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * &lt;p&gt;Reads, follows, exports and erases the logs ONDEWO CAI captures: the log records of the CAI gRPC server
 * processes themselves (every worker of every replica), the output of the docker containers that remote
 * operations run (build cache, training, RAG crawl, LLM evaluation and simulation, RAGFlow upload / removal /
 * re-parse) and of the short-lived helper containers that prepare them (hardware check, GPU pre-allocation).
 * Long-running operations that run inside a CAI worker (agent export, import, restore, re-index, ranking
 * optimization) are covered too: the server records they emit carry the operation&amp;apos;s name.&lt;/p&gt;
 * &lt;p&gt;Entries are served from the CAI database, not from the docker daemon, so the logs of a container that was
 * already removed, and of a server process that already exited, stay readable until retention or
 * &lt;code&gt;DeleteLogs&lt;/code&gt; removes them.&lt;/p&gt;
 * &lt;p&gt;&lt;b&gt;Secrets are redacted server-side&lt;/b&gt; when an entry is captured and again when it is read, so a
 * redaction rule added later also applies to entries captured before it.&lt;/p&gt;
 * &lt;p&gt;Errors are reported as gRPC status codes: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a malformed name, filter,
 * cursor, &lt;code&gt;resume_token&lt;/code&gt;, &lt;code&gt;page_token&lt;/code&gt; or &lt;code&gt;field_mask&lt;/code&gt; (each naming the field);
 * &lt;code&gt;NOT_FOUND&lt;/code&gt; for an unknown log stream or operation, and for one the caller may not read;
 * &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; when the server process already serves its maximum of concurrent streams or
 * exports; &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the logs API is disabled (&lt;code&gt;ONDEWO_NLU_CAI_LOG_API_ENABLED&lt;/code&gt;)
 * or the database cannot be reached; &lt;code&gt;UNAUTHENTICATED&lt;/code&gt; without a valid credential;
 * &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; when the caller may read no logs at all.&lt;/p&gt;
 * &lt;p&gt;Authorization: entries that belong to no project (the server&amp;apos;s own records outside any project RPC
 * or operation) require the server permission &lt;code&gt;ServerPermission.Logs.ReadServerLogs&lt;/code&gt;, granted to
 * &lt;code&gt;SERVER_ADMIN&lt;/code&gt; by default; a caller holding it reads every entry. Without it a caller reads only
 * the entries tagged with a project in which it holds &lt;code&gt;ProjectPermission.Logs.ReadProjectLogs&lt;/code&gt;,
 * granted to &lt;code&gt;PROJECT_DEVELOPER&lt;/code&gt; and above by default; entries of other projects are filtered out
 * and are never reported as existing. &lt;code&gt;DeleteLogs&lt;/code&gt; requires
 * &lt;code&gt;ServerPermission.Logs.DeleteLogs&lt;/code&gt;, granted to &lt;code&gt;SERVER_ADMIN&lt;/code&gt; only. A long-running
 * &lt;code&gt;StreamLogs&lt;/code&gt; or &lt;code&gt;ExportLogs&lt;/code&gt; re-checks the caller periodically and ends when the access
 * was revoked or the credential expired.&lt;/p&gt;
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class LogsGrpc {

  private LogsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.nlu.Logs";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LogsOuterClass.StreamLogsRequest,
      ondewo.nlu.LogsOuterClass.StreamLogsResponse> getStreamLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamLogs",
      requestType = ondewo.nlu.LogsOuterClass.StreamLogsRequest.class,
      responseType = ondewo.nlu.LogsOuterClass.StreamLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LogsOuterClass.StreamLogsRequest,
      ondewo.nlu.LogsOuterClass.StreamLogsResponse> getStreamLogsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LogsOuterClass.StreamLogsRequest, ondewo.nlu.LogsOuterClass.StreamLogsResponse> getStreamLogsMethod;
    if ((getStreamLogsMethod = LogsGrpc.getStreamLogsMethod) == null) {
      synchronized (LogsGrpc.class) {
        if ((getStreamLogsMethod = LogsGrpc.getStreamLogsMethod) == null) {
          LogsGrpc.getStreamLogsMethod = getStreamLogsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LogsOuterClass.StreamLogsRequest, ondewo.nlu.LogsOuterClass.StreamLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LogsOuterClass.StreamLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LogsOuterClass.StreamLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogsMethodDescriptorSupplier("StreamLogs"))
              .build();
        }
      }
    }
    return getStreamLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LogsOuterClass.ListLogsRequest,
      ondewo.nlu.LogsOuterClass.ListLogsResponse> getListLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLogs",
      requestType = ondewo.nlu.LogsOuterClass.ListLogsRequest.class,
      responseType = ondewo.nlu.LogsOuterClass.ListLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LogsOuterClass.ListLogsRequest,
      ondewo.nlu.LogsOuterClass.ListLogsResponse> getListLogsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LogsOuterClass.ListLogsRequest, ondewo.nlu.LogsOuterClass.ListLogsResponse> getListLogsMethod;
    if ((getListLogsMethod = LogsGrpc.getListLogsMethod) == null) {
      synchronized (LogsGrpc.class) {
        if ((getListLogsMethod = LogsGrpc.getListLogsMethod) == null) {
          LogsGrpc.getListLogsMethod = getListLogsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LogsOuterClass.ListLogsRequest, ondewo.nlu.LogsOuterClass.ListLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LogsOuterClass.ListLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LogsOuterClass.ListLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogsMethodDescriptorSupplier("ListLogs"))
              .build();
        }
      }
    }
    return getListLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LogsOuterClass.GetLogStreamRequest,
      ondewo.nlu.LogsOuterClass.CaiLogStream> getGetLogStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLogStream",
      requestType = ondewo.nlu.LogsOuterClass.GetLogStreamRequest.class,
      responseType = ondewo.nlu.LogsOuterClass.CaiLogStream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LogsOuterClass.GetLogStreamRequest,
      ondewo.nlu.LogsOuterClass.CaiLogStream> getGetLogStreamMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LogsOuterClass.GetLogStreamRequest, ondewo.nlu.LogsOuterClass.CaiLogStream> getGetLogStreamMethod;
    if ((getGetLogStreamMethod = LogsGrpc.getGetLogStreamMethod) == null) {
      synchronized (LogsGrpc.class) {
        if ((getGetLogStreamMethod = LogsGrpc.getGetLogStreamMethod) == null) {
          LogsGrpc.getGetLogStreamMethod = getGetLogStreamMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LogsOuterClass.GetLogStreamRequest, ondewo.nlu.LogsOuterClass.CaiLogStream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLogStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LogsOuterClass.GetLogStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LogsOuterClass.CaiLogStream.getDefaultInstance()))
              .setSchemaDescriptor(new LogsMethodDescriptorSupplier("GetLogStream"))
              .build();
        }
      }
    }
    return getGetLogStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LogsOuterClass.ListLogStreamsRequest,
      ondewo.nlu.LogsOuterClass.ListLogStreamsResponse> getListLogStreamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLogStreams",
      requestType = ondewo.nlu.LogsOuterClass.ListLogStreamsRequest.class,
      responseType = ondewo.nlu.LogsOuterClass.ListLogStreamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LogsOuterClass.ListLogStreamsRequest,
      ondewo.nlu.LogsOuterClass.ListLogStreamsResponse> getListLogStreamsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LogsOuterClass.ListLogStreamsRequest, ondewo.nlu.LogsOuterClass.ListLogStreamsResponse> getListLogStreamsMethod;
    if ((getListLogStreamsMethod = LogsGrpc.getListLogStreamsMethod) == null) {
      synchronized (LogsGrpc.class) {
        if ((getListLogStreamsMethod = LogsGrpc.getListLogStreamsMethod) == null) {
          LogsGrpc.getListLogStreamsMethod = getListLogStreamsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LogsOuterClass.ListLogStreamsRequest, ondewo.nlu.LogsOuterClass.ListLogStreamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLogStreams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LogsOuterClass.ListLogStreamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LogsOuterClass.ListLogStreamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogsMethodDescriptorSupplier("ListLogStreams"))
              .build();
        }
      }
    }
    return getListLogStreamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LogsOuterClass.ExportLogsRequest,
      ondewo.nlu.LogsOuterClass.ExportLogsResponse> getExportLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportLogs",
      requestType = ondewo.nlu.LogsOuterClass.ExportLogsRequest.class,
      responseType = ondewo.nlu.LogsOuterClass.ExportLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LogsOuterClass.ExportLogsRequest,
      ondewo.nlu.LogsOuterClass.ExportLogsResponse> getExportLogsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LogsOuterClass.ExportLogsRequest, ondewo.nlu.LogsOuterClass.ExportLogsResponse> getExportLogsMethod;
    if ((getExportLogsMethod = LogsGrpc.getExportLogsMethod) == null) {
      synchronized (LogsGrpc.class) {
        if ((getExportLogsMethod = LogsGrpc.getExportLogsMethod) == null) {
          LogsGrpc.getExportLogsMethod = getExportLogsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LogsOuterClass.ExportLogsRequest, ondewo.nlu.LogsOuterClass.ExportLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LogsOuterClass.ExportLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LogsOuterClass.ExportLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogsMethodDescriptorSupplier("ExportLogs"))
              .build();
        }
      }
    }
    return getExportLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.nlu.LogsOuterClass.DeleteLogsRequest,
      ondewo.nlu.LogsOuterClass.DeleteLogsResponse> getDeleteLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLogs",
      requestType = ondewo.nlu.LogsOuterClass.DeleteLogsRequest.class,
      responseType = ondewo.nlu.LogsOuterClass.DeleteLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.nlu.LogsOuterClass.DeleteLogsRequest,
      ondewo.nlu.LogsOuterClass.DeleteLogsResponse> getDeleteLogsMethod() {
    io.grpc.MethodDescriptor<ondewo.nlu.LogsOuterClass.DeleteLogsRequest, ondewo.nlu.LogsOuterClass.DeleteLogsResponse> getDeleteLogsMethod;
    if ((getDeleteLogsMethod = LogsGrpc.getDeleteLogsMethod) == null) {
      synchronized (LogsGrpc.class) {
        if ((getDeleteLogsMethod = LogsGrpc.getDeleteLogsMethod) == null) {
          LogsGrpc.getDeleteLogsMethod = getDeleteLogsMethod =
              io.grpc.MethodDescriptor.<ondewo.nlu.LogsOuterClass.DeleteLogsRequest, ondewo.nlu.LogsOuterClass.DeleteLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LogsOuterClass.DeleteLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.nlu.LogsOuterClass.DeleteLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogsMethodDescriptorSupplier("DeleteLogs"))
              .build();
        }
      }
    }
    return getDeleteLogsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogsStub>() {
        @java.lang.Override
        public LogsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogsStub(channel, callOptions);
        }
      };
    return LogsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static LogsBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogsBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogsBlockingV2Stub>() {
        @java.lang.Override
        public LogsBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogsBlockingV2Stub(channel, callOptions);
        }
      };
    return LogsBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogsBlockingStub>() {
        @java.lang.Override
        public LogsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogsBlockingStub(channel, callOptions);
        }
      };
    return LogsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogsFutureStub>() {
        @java.lang.Override
        public LogsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogsFutureStub(channel, callOptions);
        }
      };
    return LogsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * &lt;p&gt;Reads, follows, exports and erases the logs ONDEWO CAI captures: the log records of the CAI gRPC server
   * processes themselves (every worker of every replica), the output of the docker containers that remote
   * operations run (build cache, training, RAG crawl, LLM evaluation and simulation, RAGFlow upload / removal /
   * re-parse) and of the short-lived helper containers that prepare them (hardware check, GPU pre-allocation).
   * Long-running operations that run inside a CAI worker (agent export, import, restore, re-index, ranking
   * optimization) are covered too: the server records they emit carry the operation&amp;apos;s name.&lt;/p&gt;
   * &lt;p&gt;Entries are served from the CAI database, not from the docker daemon, so the logs of a container that was
   * already removed, and of a server process that already exited, stay readable until retention or
   * &lt;code&gt;DeleteLogs&lt;/code&gt; removes them.&lt;/p&gt;
   * &lt;p&gt;&lt;b&gt;Secrets are redacted server-side&lt;/b&gt; when an entry is captured and again when it is read, so a
   * redaction rule added later also applies to entries captured before it.&lt;/p&gt;
   * &lt;p&gt;Errors are reported as gRPC status codes: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a malformed name, filter,
   * cursor, &lt;code&gt;resume_token&lt;/code&gt;, &lt;code&gt;page_token&lt;/code&gt; or &lt;code&gt;field_mask&lt;/code&gt; (each naming the field);
   * &lt;code&gt;NOT_FOUND&lt;/code&gt; for an unknown log stream or operation, and for one the caller may not read;
   * &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; when the server process already serves its maximum of concurrent streams or
   * exports; &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the logs API is disabled (&lt;code&gt;ONDEWO_NLU_CAI_LOG_API_ENABLED&lt;/code&gt;)
   * or the database cannot be reached; &lt;code&gt;UNAUTHENTICATED&lt;/code&gt; without a valid credential;
   * &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; when the caller may read no logs at all.&lt;/p&gt;
   * &lt;p&gt;Authorization: entries that belong to no project (the server&amp;apos;s own records outside any project RPC
   * or operation) require the server permission &lt;code&gt;ServerPermission.Logs.ReadServerLogs&lt;/code&gt;, granted to
   * &lt;code&gt;SERVER_ADMIN&lt;/code&gt; by default; a caller holding it reads every entry. Without it a caller reads only
   * the entries tagged with a project in which it holds &lt;code&gt;ProjectPermission.Logs.ReadProjectLogs&lt;/code&gt;,
   * granted to &lt;code&gt;PROJECT_DEVELOPER&lt;/code&gt; and above by default; entries of other projects are filtered out
   * and are never reported as existing. &lt;code&gt;DeleteLogs&lt;/code&gt; requires
   * &lt;code&gt;ServerPermission.Logs.DeleteLogs&lt;/code&gt;, granted to &lt;code&gt;SERVER_ADMIN&lt;/code&gt; only. A long-running
   * &lt;code&gt;StreamLogs&lt;/code&gt; or &lt;code&gt;ExportLogs&lt;/code&gt; re-checks the caller periodically and ends when the access
   * was revoked or the credential expired.&lt;/p&gt;
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * &lt;p&gt;Streams captured log entries as they are written, in the manner of &lt;code&gt;docker logs --follow&lt;/code&gt;.
     * The stream replays &lt;code&gt;tail_lines&lt;/code&gt; historical entries and then follows. It stays open until the
     * capture of every matching log stream has terminated (only possible when the filter selects container
     * streams alone: the server&amp;apos;s own log streams never terminate while the server runs), until the client
     * disconnects, or until the server-side maximum stream duration is reached.&lt;/p&gt;
     * &lt;p&gt;Limits: at most &lt;code&gt;ONDEWO_NLU_CAI_LOG_STREAM_MAX_DURATION_S&lt;/code&gt; (default 3600) seconds per stream,
     * after which the server sends a final message with &lt;code&gt;end_reason_code =
     * CAI_LOG_STREAM_END_REASON_MAX_DURATION&lt;/code&gt; and a &lt;code&gt;resume_token&lt;/code&gt; to reconnect with; at most
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_MAX_CONCURRENT_STREAMS&lt;/code&gt; (default 8) concurrent streams per server process,
     * beyond which a new stream is &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt;. The server sends NO keep-alive message: a
     * quiet filter sends nothing, so a client must not treat silence as a dead stream (use HTTP/2 keep-alive
     * pings to detect a dead connection).&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a filter carrying &lt;code&gt;start_time&lt;/code&gt; or
     * &lt;code&gt;end_time&lt;/code&gt;, an &lt;code&gt;after_seq&lt;/code&gt; with a filter that does not resolve to exactly one log
     * stream, a malformed &lt;code&gt;resume_token&lt;/code&gt;, an invalid &lt;code&gt;regex&lt;/code&gt; or an unknown
     * &lt;code&gt;field_mask&lt;/code&gt; path; &lt;code&gt;NOT_FOUND&lt;/code&gt; for a named log stream or operation the caller may
     * not read; &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; as above, and when one read of the stored entries exceeds
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_QUERY_TIMEOUT_S&lt;/code&gt; (narrow the filter); &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the
     * database cannot be reached (reconnect with the last &lt;code&gt;resume_token&lt;/code&gt;). When the caller&amp;apos;s
     * access is revoked or its credential expires during the stream, the server sends a final message
     * (&lt;code&gt;CAI_LOG_STREAM_END_REASON_PERMISSION_REVOKED&lt;/code&gt; /
     * &lt;code&gt;CAI_LOG_STREAM_END_REASON_CREDENTIALS_EXPIRED&lt;/code&gt;, with a &lt;code&gt;resume_token&lt;/code&gt;) and ends the
     * stream with &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; / &lt;code&gt;UNAUTHENTICATED&lt;/code&gt;.&lt;/p&gt;
     * </pre>
     */
    default void streamLogs(ondewo.nlu.LogsOuterClass.StreamLogsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LogsOuterClass.StreamLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a bounded, filtered page of captured log entries. Supports a time window, severity filtering, a
     * regular expression, a plain-text search and cursor paging in both directions for infinite scrolling.&lt;/p&gt;
     * &lt;p&gt;No time window is required: without &lt;code&gt;start_time&lt;/code&gt; / &lt;code&gt;end_time&lt;/code&gt; the window is the
     * newest &lt;code&gt;max_lines&lt;/code&gt; matching entries (or, with &lt;code&gt;oldest_first&lt;/code&gt;, the oldest after the
     * cursor). With &lt;code&gt;include_counts&lt;/code&gt; the response also carries the number of matching entries per
     * severity. The &lt;code&gt;next_resume_token&lt;/code&gt; of a response can be handed to &lt;code&gt;StreamLogs&lt;/code&gt; to
     * continue live exactly where the page ended, without a gap or a duplicate.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for an invalid or over-long &lt;code&gt;regex&lt;/code&gt;, a
     * &lt;code&gt;start_time&lt;/code&gt; after &lt;code&gt;end_time&lt;/code&gt;, &lt;code&gt;before_seq&lt;/code&gt; / &lt;code&gt;after_seq&lt;/code&gt;
     * combined with &lt;code&gt;resume_token&lt;/code&gt; or with a filter that does not resolve to exactly one log stream, a
     * negative &lt;code&gt;before_seq&lt;/code&gt; / &lt;code&gt;after_seq&lt;/code&gt;, a malformed &lt;code&gt;resume_token&lt;/code&gt; or an
     * unknown &lt;code&gt;field_mask&lt;/code&gt; path; &lt;code&gt;NOT_FOUND&lt;/code&gt; for a named log stream or operation the caller
     * may not read; &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; when the query exceeds
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_QUERY_TIMEOUT_S&lt;/code&gt; (narrow the filter: log streams, time window or severity);
     * &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the database cannot be reached.&lt;/p&gt;
     * &lt;p&gt;A page is bounded by size as well as by &lt;code&gt;max_lines&lt;/code&gt;: when its messages would exceed the
     * server&amp;apos;s size budget it is cut (a forward page keeps its oldest entries, a backward page its newest)
     * and reported with &lt;code&gt;truncated = true&lt;/code&gt;; the cursors continue exactly where it was cut.&lt;/p&gt;
     * </pre>
     */
    default void listLogs(ondewo.nlu.LogsOuterClass.ListLogsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LogsOuterClass.ListLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns one log stream, i.e. the capture of one server process or of one container.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a malformed &lt;code&gt;name&lt;/code&gt; or an unknown
     * &lt;code&gt;field_mask&lt;/code&gt; path; &lt;code&gt;NOT_FOUND&lt;/code&gt; for an unknown log stream or one the caller may not
     * read.&lt;/p&gt;
     * </pre>
     */
    default void getLogStream(ondewo.nlu.LogsOuterClass.GetLogStreamRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LogsOuterClass.CaiLogStream> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLogStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Lists the log streams CAI has captured. A server process yields a new log stream every time it starts,
     * and a container every time it is (re)started under a new container id. Ordered by
     * &lt;code&gt;capture_started_at&lt;/code&gt;, newest first.&lt;/p&gt;
     * &lt;p&gt;A caller without &lt;code&gt;ServerPermission.Logs.ReadServerLogs&lt;/code&gt; sees only the log streams of the
     * projects in which it holds &lt;code&gt;ProjectPermission.Logs.ReadProjectLogs&lt;/code&gt;; the server&amp;apos;s own log
     * streams are not listed to it, although &lt;code&gt;ListLogs&lt;/code&gt; and &lt;code&gt;StreamLogs&lt;/code&gt; return their
     * entries that are tagged with such a project.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a malformed &lt;code&gt;page_token&lt;/code&gt;,
     * &lt;code&gt;CAI_LOG_CAPTURE_STATE_UNSPECIFIED&lt;/code&gt; in &lt;code&gt;capture_states&lt;/code&gt; or an unknown
     * &lt;code&gt;field_mask&lt;/code&gt; path.&lt;/p&gt;
     * </pre>
     */
    default void listLogStreams(ondewo.nlu.LogsOuterClass.ListLogStreamsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LogsOuterClass.ListLogStreamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLogStreamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Exports the captured log entries matching a filter as a file: plain text, NDJSON or CSV, streamed in
     * chunks. Entries are exported oldest first with the same filter semantics and the same server-side secret
     * redaction as &lt;code&gt;ListLogs&lt;/code&gt;; unlike &lt;code&gt;ListLogs&lt;/code&gt; the content filters are applied to EVERY
     * entry of the window. Concatenating the &lt;code&gt;chunk&lt;/code&gt;s of all messages in order yields the file.&lt;/p&gt;
     * &lt;p&gt;A bounded time window is REQUIRED: &lt;code&gt;filter.start_time&lt;/code&gt; AND &lt;code&gt;filter.end_time&lt;/code&gt; must
     * both be set, with &lt;code&gt;start_time&lt;/code&gt; before &lt;code&gt;end_time&lt;/code&gt;.&lt;/p&gt;
     * &lt;p&gt;Limits: each &lt;code&gt;chunk&lt;/code&gt; is at most 1 MiB; an export holds at most
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_EXPORT_MAX_ENTRIES&lt;/code&gt; (default 1000000) entries and at most
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_EXPORT_MAX_BYTES&lt;/code&gt; (default 1 GiB) of output. When a limit is reached the
     * export ends early with &lt;code&gt;truncated = true&lt;/code&gt; on the last message; so does an export one of whose
     * reads exceeds &lt;code&gt;ONDEWO_NLU_CAI_LOG_QUERY_TIMEOUT_S&lt;/code&gt;. At most
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_MAX_CONCURRENT_EXPORTS&lt;/code&gt; (default 1) exports run per server process, beyond
     * which a new one is &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt;.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a missing, empty or inverted time window, an invalid
     * &lt;code&gt;regex&lt;/code&gt; or an unknown &lt;code&gt;format&lt;/code&gt; value; &lt;code&gt;NOT_FOUND&lt;/code&gt; for a named log stream
     * or operation the caller may not read; &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; as above. A revoked access or an
     * expired credential ends the export with &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; / &lt;code&gt;UNAUTHENTICATED&lt;/code&gt; and
     * no last message.&lt;/p&gt;
     * </pre>
     */
    default void exportLogs(ondewo.nlu.LogsOuterClass.ExportLogsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LogsOuterClass.ExportLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExportLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Permanently deletes captured log entries matching a filter. Only the identity filters and the time
     * window apply; content filters are rejected. A time window alone is a valid filter. A log stream whose last
     * entry was deleted is removed too, unless it is still &lt;code&gt;CAI_LOG_CAPTURE_STATE_CAPTURING&lt;/code&gt;. A
     * capture that is still running keeps writing, so entries emitted after the deletion are stored again.&lt;/p&gt;
     * &lt;p&gt;Idempotent: repeating a deletion succeeds and reports &lt;code&gt;0&lt;/code&gt; deleted entries. With
     * &lt;code&gt;validate_only&lt;/code&gt; nothing is deleted and the counts are what would be deleted.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for an empty filter, a content filter (&lt;code&gt;text&lt;/code&gt;,
     * &lt;code&gt;regex&lt;/code&gt;, &lt;code&gt;log_levels&lt;/code&gt;, &lt;code&gt;min_log_level&lt;/code&gt;,
     * &lt;code&gt;include_unleveled_lines&lt;/code&gt;, &lt;code&gt;emitter_prefixes&lt;/code&gt;, &lt;code&gt;thread_names&lt;/code&gt;,
     * &lt;code&gt;trace_ids&lt;/code&gt;; presence alone counts) or a &lt;code&gt;start_time&lt;/code&gt; after &lt;code&gt;end_time&lt;/code&gt;;
     * &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; without &lt;code&gt;ServerPermission.Logs.DeleteLogs&lt;/code&gt;;
     * &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; when one deletion step exceeds &lt;code&gt;ONDEWO_NLU_CAI_LOG_QUERY_TIMEOUT_S&lt;/code&gt;
     * (what was deleted until then stays deleted; repeat the request); &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the database
     * cannot be reached.&lt;/p&gt;
     * </pre>
     */
    default void deleteLogs(ondewo.nlu.LogsOuterClass.DeleteLogsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LogsOuterClass.DeleteLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLogsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Logs.
   * <pre>
   * &lt;p&gt;Reads, follows, exports and erases the logs ONDEWO CAI captures: the log records of the CAI gRPC server
   * processes themselves (every worker of every replica), the output of the docker containers that remote
   * operations run (build cache, training, RAG crawl, LLM evaluation and simulation, RAGFlow upload / removal /
   * re-parse) and of the short-lived helper containers that prepare them (hardware check, GPU pre-allocation).
   * Long-running operations that run inside a CAI worker (agent export, import, restore, re-index, ranking
   * optimization) are covered too: the server records they emit carry the operation&amp;apos;s name.&lt;/p&gt;
   * &lt;p&gt;Entries are served from the CAI database, not from the docker daemon, so the logs of a container that was
   * already removed, and of a server process that already exited, stay readable until retention or
   * &lt;code&gt;DeleteLogs&lt;/code&gt; removes them.&lt;/p&gt;
   * &lt;p&gt;&lt;b&gt;Secrets are redacted server-side&lt;/b&gt; when an entry is captured and again when it is read, so a
   * redaction rule added later also applies to entries captured before it.&lt;/p&gt;
   * &lt;p&gt;Errors are reported as gRPC status codes: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a malformed name, filter,
   * cursor, &lt;code&gt;resume_token&lt;/code&gt;, &lt;code&gt;page_token&lt;/code&gt; or &lt;code&gt;field_mask&lt;/code&gt; (each naming the field);
   * &lt;code&gt;NOT_FOUND&lt;/code&gt; for an unknown log stream or operation, and for one the caller may not read;
   * &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; when the server process already serves its maximum of concurrent streams or
   * exports; &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the logs API is disabled (&lt;code&gt;ONDEWO_NLU_CAI_LOG_API_ENABLED&lt;/code&gt;)
   * or the database cannot be reached; &lt;code&gt;UNAUTHENTICATED&lt;/code&gt; without a valid credential;
   * &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; when the caller may read no logs at all.&lt;/p&gt;
   * &lt;p&gt;Authorization: entries that belong to no project (the server&amp;apos;s own records outside any project RPC
   * or operation) require the server permission &lt;code&gt;ServerPermission.Logs.ReadServerLogs&lt;/code&gt;, granted to
   * &lt;code&gt;SERVER_ADMIN&lt;/code&gt; by default; a caller holding it reads every entry. Without it a caller reads only
   * the entries tagged with a project in which it holds &lt;code&gt;ProjectPermission.Logs.ReadProjectLogs&lt;/code&gt;,
   * granted to &lt;code&gt;PROJECT_DEVELOPER&lt;/code&gt; and above by default; entries of other projects are filtered out
   * and are never reported as existing. &lt;code&gt;DeleteLogs&lt;/code&gt; requires
   * &lt;code&gt;ServerPermission.Logs.DeleteLogs&lt;/code&gt;, granted to &lt;code&gt;SERVER_ADMIN&lt;/code&gt; only. A long-running
   * &lt;code&gt;StreamLogs&lt;/code&gt; or &lt;code&gt;ExportLogs&lt;/code&gt; re-checks the caller periodically and ends when the access
   * was revoked or the credential expired.&lt;/p&gt;
   * </pre>
   */
  public static abstract class LogsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LogsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Logs.
   * <pre>
   * &lt;p&gt;Reads, follows, exports and erases the logs ONDEWO CAI captures: the log records of the CAI gRPC server
   * processes themselves (every worker of every replica), the output of the docker containers that remote
   * operations run (build cache, training, RAG crawl, LLM evaluation and simulation, RAGFlow upload / removal /
   * re-parse) and of the short-lived helper containers that prepare them (hardware check, GPU pre-allocation).
   * Long-running operations that run inside a CAI worker (agent export, import, restore, re-index, ranking
   * optimization) are covered too: the server records they emit carry the operation&amp;apos;s name.&lt;/p&gt;
   * &lt;p&gt;Entries are served from the CAI database, not from the docker daemon, so the logs of a container that was
   * already removed, and of a server process that already exited, stay readable until retention or
   * &lt;code&gt;DeleteLogs&lt;/code&gt; removes them.&lt;/p&gt;
   * &lt;p&gt;&lt;b&gt;Secrets are redacted server-side&lt;/b&gt; when an entry is captured and again when it is read, so a
   * redaction rule added later also applies to entries captured before it.&lt;/p&gt;
   * &lt;p&gt;Errors are reported as gRPC status codes: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a malformed name, filter,
   * cursor, &lt;code&gt;resume_token&lt;/code&gt;, &lt;code&gt;page_token&lt;/code&gt; or &lt;code&gt;field_mask&lt;/code&gt; (each naming the field);
   * &lt;code&gt;NOT_FOUND&lt;/code&gt; for an unknown log stream or operation, and for one the caller may not read;
   * &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; when the server process already serves its maximum of concurrent streams or
   * exports; &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the logs API is disabled (&lt;code&gt;ONDEWO_NLU_CAI_LOG_API_ENABLED&lt;/code&gt;)
   * or the database cannot be reached; &lt;code&gt;UNAUTHENTICATED&lt;/code&gt; without a valid credential;
   * &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; when the caller may read no logs at all.&lt;/p&gt;
   * &lt;p&gt;Authorization: entries that belong to no project (the server&amp;apos;s own records outside any project RPC
   * or operation) require the server permission &lt;code&gt;ServerPermission.Logs.ReadServerLogs&lt;/code&gt;, granted to
   * &lt;code&gt;SERVER_ADMIN&lt;/code&gt; by default; a caller holding it reads every entry. Without it a caller reads only
   * the entries tagged with a project in which it holds &lt;code&gt;ProjectPermission.Logs.ReadProjectLogs&lt;/code&gt;,
   * granted to &lt;code&gt;PROJECT_DEVELOPER&lt;/code&gt; and above by default; entries of other projects are filtered out
   * and are never reported as existing. &lt;code&gt;DeleteLogs&lt;/code&gt; requires
   * &lt;code&gt;ServerPermission.Logs.DeleteLogs&lt;/code&gt;, granted to &lt;code&gt;SERVER_ADMIN&lt;/code&gt; only. A long-running
   * &lt;code&gt;StreamLogs&lt;/code&gt; or &lt;code&gt;ExportLogs&lt;/code&gt; re-checks the caller periodically and ends when the access
   * was revoked or the credential expired.&lt;/p&gt;
   * </pre>
   */
  public static final class LogsStub
      extends io.grpc.stub.AbstractAsyncStub<LogsStub> {
    private LogsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogsStub(channel, callOptions);
    }

    /**
     * <pre>
     * &lt;p&gt;Streams captured log entries as they are written, in the manner of &lt;code&gt;docker logs --follow&lt;/code&gt;.
     * The stream replays &lt;code&gt;tail_lines&lt;/code&gt; historical entries and then follows. It stays open until the
     * capture of every matching log stream has terminated (only possible when the filter selects container
     * streams alone: the server&amp;apos;s own log streams never terminate while the server runs), until the client
     * disconnects, or until the server-side maximum stream duration is reached.&lt;/p&gt;
     * &lt;p&gt;Limits: at most &lt;code&gt;ONDEWO_NLU_CAI_LOG_STREAM_MAX_DURATION_S&lt;/code&gt; (default 3600) seconds per stream,
     * after which the server sends a final message with &lt;code&gt;end_reason_code =
     * CAI_LOG_STREAM_END_REASON_MAX_DURATION&lt;/code&gt; and a &lt;code&gt;resume_token&lt;/code&gt; to reconnect with; at most
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_MAX_CONCURRENT_STREAMS&lt;/code&gt; (default 8) concurrent streams per server process,
     * beyond which a new stream is &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt;. The server sends NO keep-alive message: a
     * quiet filter sends nothing, so a client must not treat silence as a dead stream (use HTTP/2 keep-alive
     * pings to detect a dead connection).&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a filter carrying &lt;code&gt;start_time&lt;/code&gt; or
     * &lt;code&gt;end_time&lt;/code&gt;, an &lt;code&gt;after_seq&lt;/code&gt; with a filter that does not resolve to exactly one log
     * stream, a malformed &lt;code&gt;resume_token&lt;/code&gt;, an invalid &lt;code&gt;regex&lt;/code&gt; or an unknown
     * &lt;code&gt;field_mask&lt;/code&gt; path; &lt;code&gt;NOT_FOUND&lt;/code&gt; for a named log stream or operation the caller may
     * not read; &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; as above, and when one read of the stored entries exceeds
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_QUERY_TIMEOUT_S&lt;/code&gt; (narrow the filter); &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the
     * database cannot be reached (reconnect with the last &lt;code&gt;resume_token&lt;/code&gt;). When the caller&amp;apos;s
     * access is revoked or its credential expires during the stream, the server sends a final message
     * (&lt;code&gt;CAI_LOG_STREAM_END_REASON_PERMISSION_REVOKED&lt;/code&gt; /
     * &lt;code&gt;CAI_LOG_STREAM_END_REASON_CREDENTIALS_EXPIRED&lt;/code&gt;, with a &lt;code&gt;resume_token&lt;/code&gt;) and ends the
     * stream with &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; / &lt;code&gt;UNAUTHENTICATED&lt;/code&gt;.&lt;/p&gt;
     * </pre>
     */
    public void streamLogs(ondewo.nlu.LogsOuterClass.StreamLogsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LogsOuterClass.StreamLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a bounded, filtered page of captured log entries. Supports a time window, severity filtering, a
     * regular expression, a plain-text search and cursor paging in both directions for infinite scrolling.&lt;/p&gt;
     * &lt;p&gt;No time window is required: without &lt;code&gt;start_time&lt;/code&gt; / &lt;code&gt;end_time&lt;/code&gt; the window is the
     * newest &lt;code&gt;max_lines&lt;/code&gt; matching entries (or, with &lt;code&gt;oldest_first&lt;/code&gt;, the oldest after the
     * cursor). With &lt;code&gt;include_counts&lt;/code&gt; the response also carries the number of matching entries per
     * severity. The &lt;code&gt;next_resume_token&lt;/code&gt; of a response can be handed to &lt;code&gt;StreamLogs&lt;/code&gt; to
     * continue live exactly where the page ended, without a gap or a duplicate.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for an invalid or over-long &lt;code&gt;regex&lt;/code&gt;, a
     * &lt;code&gt;start_time&lt;/code&gt; after &lt;code&gt;end_time&lt;/code&gt;, &lt;code&gt;before_seq&lt;/code&gt; / &lt;code&gt;after_seq&lt;/code&gt;
     * combined with &lt;code&gt;resume_token&lt;/code&gt; or with a filter that does not resolve to exactly one log stream, a
     * negative &lt;code&gt;before_seq&lt;/code&gt; / &lt;code&gt;after_seq&lt;/code&gt;, a malformed &lt;code&gt;resume_token&lt;/code&gt; or an
     * unknown &lt;code&gt;field_mask&lt;/code&gt; path; &lt;code&gt;NOT_FOUND&lt;/code&gt; for a named log stream or operation the caller
     * may not read; &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; when the query exceeds
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_QUERY_TIMEOUT_S&lt;/code&gt; (narrow the filter: log streams, time window or severity);
     * &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the database cannot be reached.&lt;/p&gt;
     * &lt;p&gt;A page is bounded by size as well as by &lt;code&gt;max_lines&lt;/code&gt;: when its messages would exceed the
     * server&amp;apos;s size budget it is cut (a forward page keeps its oldest entries, a backward page its newest)
     * and reported with &lt;code&gt;truncated = true&lt;/code&gt;; the cursors continue exactly where it was cut.&lt;/p&gt;
     * </pre>
     */
    public void listLogs(ondewo.nlu.LogsOuterClass.ListLogsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LogsOuterClass.ListLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns one log stream, i.e. the capture of one server process or of one container.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a malformed &lt;code&gt;name&lt;/code&gt; or an unknown
     * &lt;code&gt;field_mask&lt;/code&gt; path; &lt;code&gt;NOT_FOUND&lt;/code&gt; for an unknown log stream or one the caller may not
     * read.&lt;/p&gt;
     * </pre>
     */
    public void getLogStream(ondewo.nlu.LogsOuterClass.GetLogStreamRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LogsOuterClass.CaiLogStream> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLogStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Lists the log streams CAI has captured. A server process yields a new log stream every time it starts,
     * and a container every time it is (re)started under a new container id. Ordered by
     * &lt;code&gt;capture_started_at&lt;/code&gt;, newest first.&lt;/p&gt;
     * &lt;p&gt;A caller without &lt;code&gt;ServerPermission.Logs.ReadServerLogs&lt;/code&gt; sees only the log streams of the
     * projects in which it holds &lt;code&gt;ProjectPermission.Logs.ReadProjectLogs&lt;/code&gt;; the server&amp;apos;s own log
     * streams are not listed to it, although &lt;code&gt;ListLogs&lt;/code&gt; and &lt;code&gt;StreamLogs&lt;/code&gt; return their
     * entries that are tagged with such a project.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a malformed &lt;code&gt;page_token&lt;/code&gt;,
     * &lt;code&gt;CAI_LOG_CAPTURE_STATE_UNSPECIFIED&lt;/code&gt; in &lt;code&gt;capture_states&lt;/code&gt; or an unknown
     * &lt;code&gt;field_mask&lt;/code&gt; path.&lt;/p&gt;
     * </pre>
     */
    public void listLogStreams(ondewo.nlu.LogsOuterClass.ListLogStreamsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LogsOuterClass.ListLogStreamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLogStreamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Exports the captured log entries matching a filter as a file: plain text, NDJSON or CSV, streamed in
     * chunks. Entries are exported oldest first with the same filter semantics and the same server-side secret
     * redaction as &lt;code&gt;ListLogs&lt;/code&gt;; unlike &lt;code&gt;ListLogs&lt;/code&gt; the content filters are applied to EVERY
     * entry of the window. Concatenating the &lt;code&gt;chunk&lt;/code&gt;s of all messages in order yields the file.&lt;/p&gt;
     * &lt;p&gt;A bounded time window is REQUIRED: &lt;code&gt;filter.start_time&lt;/code&gt; AND &lt;code&gt;filter.end_time&lt;/code&gt; must
     * both be set, with &lt;code&gt;start_time&lt;/code&gt; before &lt;code&gt;end_time&lt;/code&gt;.&lt;/p&gt;
     * &lt;p&gt;Limits: each &lt;code&gt;chunk&lt;/code&gt; is at most 1 MiB; an export holds at most
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_EXPORT_MAX_ENTRIES&lt;/code&gt; (default 1000000) entries and at most
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_EXPORT_MAX_BYTES&lt;/code&gt; (default 1 GiB) of output. When a limit is reached the
     * export ends early with &lt;code&gt;truncated = true&lt;/code&gt; on the last message; so does an export one of whose
     * reads exceeds &lt;code&gt;ONDEWO_NLU_CAI_LOG_QUERY_TIMEOUT_S&lt;/code&gt;. At most
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_MAX_CONCURRENT_EXPORTS&lt;/code&gt; (default 1) exports run per server process, beyond
     * which a new one is &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt;.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a missing, empty or inverted time window, an invalid
     * &lt;code&gt;regex&lt;/code&gt; or an unknown &lt;code&gt;format&lt;/code&gt; value; &lt;code&gt;NOT_FOUND&lt;/code&gt; for a named log stream
     * or operation the caller may not read; &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; as above. A revoked access or an
     * expired credential ends the export with &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; / &lt;code&gt;UNAUTHENTICATED&lt;/code&gt; and
     * no last message.&lt;/p&gt;
     * </pre>
     */
    public void exportLogs(ondewo.nlu.LogsOuterClass.ExportLogsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LogsOuterClass.ExportLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getExportLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Permanently deletes captured log entries matching a filter. Only the identity filters and the time
     * window apply; content filters are rejected. A time window alone is a valid filter. A log stream whose last
     * entry was deleted is removed too, unless it is still &lt;code&gt;CAI_LOG_CAPTURE_STATE_CAPTURING&lt;/code&gt;. A
     * capture that is still running keeps writing, so entries emitted after the deletion are stored again.&lt;/p&gt;
     * &lt;p&gt;Idempotent: repeating a deletion succeeds and reports &lt;code&gt;0&lt;/code&gt; deleted entries. With
     * &lt;code&gt;validate_only&lt;/code&gt; nothing is deleted and the counts are what would be deleted.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for an empty filter, a content filter (&lt;code&gt;text&lt;/code&gt;,
     * &lt;code&gt;regex&lt;/code&gt;, &lt;code&gt;log_levels&lt;/code&gt;, &lt;code&gt;min_log_level&lt;/code&gt;,
     * &lt;code&gt;include_unleveled_lines&lt;/code&gt;, &lt;code&gt;emitter_prefixes&lt;/code&gt;, &lt;code&gt;thread_names&lt;/code&gt;,
     * &lt;code&gt;trace_ids&lt;/code&gt;; presence alone counts) or a &lt;code&gt;start_time&lt;/code&gt; after &lt;code&gt;end_time&lt;/code&gt;;
     * &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; without &lt;code&gt;ServerPermission.Logs.DeleteLogs&lt;/code&gt;;
     * &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; when one deletion step exceeds &lt;code&gt;ONDEWO_NLU_CAI_LOG_QUERY_TIMEOUT_S&lt;/code&gt;
     * (what was deleted until then stays deleted; repeat the request); &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the database
     * cannot be reached.&lt;/p&gt;
     * </pre>
     */
    public void deleteLogs(ondewo.nlu.LogsOuterClass.DeleteLogsRequest request,
        io.grpc.stub.StreamObserver<ondewo.nlu.LogsOuterClass.DeleteLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLogsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Logs.
   * <pre>
   * &lt;p&gt;Reads, follows, exports and erases the logs ONDEWO CAI captures: the log records of the CAI gRPC server
   * processes themselves (every worker of every replica), the output of the docker containers that remote
   * operations run (build cache, training, RAG crawl, LLM evaluation and simulation, RAGFlow upload / removal /
   * re-parse) and of the short-lived helper containers that prepare them (hardware check, GPU pre-allocation).
   * Long-running operations that run inside a CAI worker (agent export, import, restore, re-index, ranking
   * optimization) are covered too: the server records they emit carry the operation&amp;apos;s name.&lt;/p&gt;
   * &lt;p&gt;Entries are served from the CAI database, not from the docker daemon, so the logs of a container that was
   * already removed, and of a server process that already exited, stay readable until retention or
   * &lt;code&gt;DeleteLogs&lt;/code&gt; removes them.&lt;/p&gt;
   * &lt;p&gt;&lt;b&gt;Secrets are redacted server-side&lt;/b&gt; when an entry is captured and again when it is read, so a
   * redaction rule added later also applies to entries captured before it.&lt;/p&gt;
   * &lt;p&gt;Errors are reported as gRPC status codes: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a malformed name, filter,
   * cursor, &lt;code&gt;resume_token&lt;/code&gt;, &lt;code&gt;page_token&lt;/code&gt; or &lt;code&gt;field_mask&lt;/code&gt; (each naming the field);
   * &lt;code&gt;NOT_FOUND&lt;/code&gt; for an unknown log stream or operation, and for one the caller may not read;
   * &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; when the server process already serves its maximum of concurrent streams or
   * exports; &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the logs API is disabled (&lt;code&gt;ONDEWO_NLU_CAI_LOG_API_ENABLED&lt;/code&gt;)
   * or the database cannot be reached; &lt;code&gt;UNAUTHENTICATED&lt;/code&gt; without a valid credential;
   * &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; when the caller may read no logs at all.&lt;/p&gt;
   * &lt;p&gt;Authorization: entries that belong to no project (the server&amp;apos;s own records outside any project RPC
   * or operation) require the server permission &lt;code&gt;ServerPermission.Logs.ReadServerLogs&lt;/code&gt;, granted to
   * &lt;code&gt;SERVER_ADMIN&lt;/code&gt; by default; a caller holding it reads every entry. Without it a caller reads only
   * the entries tagged with a project in which it holds &lt;code&gt;ProjectPermission.Logs.ReadProjectLogs&lt;/code&gt;,
   * granted to &lt;code&gt;PROJECT_DEVELOPER&lt;/code&gt; and above by default; entries of other projects are filtered out
   * and are never reported as existing. &lt;code&gt;DeleteLogs&lt;/code&gt; requires
   * &lt;code&gt;ServerPermission.Logs.DeleteLogs&lt;/code&gt;, granted to &lt;code&gt;SERVER_ADMIN&lt;/code&gt; only. A long-running
   * &lt;code&gt;StreamLogs&lt;/code&gt; or &lt;code&gt;ExportLogs&lt;/code&gt; re-checks the caller periodically and ends when the access
   * was revoked or the credential expired.&lt;/p&gt;
   * </pre>
   */
  public static final class LogsBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<LogsBlockingV2Stub> {
    private LogsBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogsBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogsBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * &lt;p&gt;Streams captured log entries as they are written, in the manner of &lt;code&gt;docker logs --follow&lt;/code&gt;.
     * The stream replays &lt;code&gt;tail_lines&lt;/code&gt; historical entries and then follows. It stays open until the
     * capture of every matching log stream has terminated (only possible when the filter selects container
     * streams alone: the server&amp;apos;s own log streams never terminate while the server runs), until the client
     * disconnects, or until the server-side maximum stream duration is reached.&lt;/p&gt;
     * &lt;p&gt;Limits: at most &lt;code&gt;ONDEWO_NLU_CAI_LOG_STREAM_MAX_DURATION_S&lt;/code&gt; (default 3600) seconds per stream,
     * after which the server sends a final message with &lt;code&gt;end_reason_code =
     * CAI_LOG_STREAM_END_REASON_MAX_DURATION&lt;/code&gt; and a &lt;code&gt;resume_token&lt;/code&gt; to reconnect with; at most
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_MAX_CONCURRENT_STREAMS&lt;/code&gt; (default 8) concurrent streams per server process,
     * beyond which a new stream is &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt;. The server sends NO keep-alive message: a
     * quiet filter sends nothing, so a client must not treat silence as a dead stream (use HTTP/2 keep-alive
     * pings to detect a dead connection).&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a filter carrying &lt;code&gt;start_time&lt;/code&gt; or
     * &lt;code&gt;end_time&lt;/code&gt;, an &lt;code&gt;after_seq&lt;/code&gt; with a filter that does not resolve to exactly one log
     * stream, a malformed &lt;code&gt;resume_token&lt;/code&gt;, an invalid &lt;code&gt;regex&lt;/code&gt; or an unknown
     * &lt;code&gt;field_mask&lt;/code&gt; path; &lt;code&gt;NOT_FOUND&lt;/code&gt; for a named log stream or operation the caller may
     * not read; &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; as above, and when one read of the stored entries exceeds
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_QUERY_TIMEOUT_S&lt;/code&gt; (narrow the filter); &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the
     * database cannot be reached (reconnect with the last &lt;code&gt;resume_token&lt;/code&gt;). When the caller&amp;apos;s
     * access is revoked or its credential expires during the stream, the server sends a final message
     * (&lt;code&gt;CAI_LOG_STREAM_END_REASON_PERMISSION_REVOKED&lt;/code&gt; /
     * &lt;code&gt;CAI_LOG_STREAM_END_REASON_CREDENTIALS_EXPIRED&lt;/code&gt;, with a &lt;code&gt;resume_token&lt;/code&gt;) and ends the
     * stream with &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; / &lt;code&gt;UNAUTHENTICATED&lt;/code&gt;.&lt;/p&gt;
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, ondewo.nlu.LogsOuterClass.StreamLogsResponse>
        streamLogs(ondewo.nlu.LogsOuterClass.StreamLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getStreamLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a bounded, filtered page of captured log entries. Supports a time window, severity filtering, a
     * regular expression, a plain-text search and cursor paging in both directions for infinite scrolling.&lt;/p&gt;
     * &lt;p&gt;No time window is required: without &lt;code&gt;start_time&lt;/code&gt; / &lt;code&gt;end_time&lt;/code&gt; the window is the
     * newest &lt;code&gt;max_lines&lt;/code&gt; matching entries (or, with &lt;code&gt;oldest_first&lt;/code&gt;, the oldest after the
     * cursor). With &lt;code&gt;include_counts&lt;/code&gt; the response also carries the number of matching entries per
     * severity. The &lt;code&gt;next_resume_token&lt;/code&gt; of a response can be handed to &lt;code&gt;StreamLogs&lt;/code&gt; to
     * continue live exactly where the page ended, without a gap or a duplicate.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for an invalid or over-long &lt;code&gt;regex&lt;/code&gt;, a
     * &lt;code&gt;start_time&lt;/code&gt; after &lt;code&gt;end_time&lt;/code&gt;, &lt;code&gt;before_seq&lt;/code&gt; / &lt;code&gt;after_seq&lt;/code&gt;
     * combined with &lt;code&gt;resume_token&lt;/code&gt; or with a filter that does not resolve to exactly one log stream, a
     * negative &lt;code&gt;before_seq&lt;/code&gt; / &lt;code&gt;after_seq&lt;/code&gt;, a malformed &lt;code&gt;resume_token&lt;/code&gt; or an
     * unknown &lt;code&gt;field_mask&lt;/code&gt; path; &lt;code&gt;NOT_FOUND&lt;/code&gt; for a named log stream or operation the caller
     * may not read; &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; when the query exceeds
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_QUERY_TIMEOUT_S&lt;/code&gt; (narrow the filter: log streams, time window or severity);
     * &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the database cannot be reached.&lt;/p&gt;
     * &lt;p&gt;A page is bounded by size as well as by &lt;code&gt;max_lines&lt;/code&gt;: when its messages would exceed the
     * server&amp;apos;s size budget it is cut (a forward page keeps its oldest entries, a backward page its newest)
     * and reported with &lt;code&gt;truncated = true&lt;/code&gt;; the cursors continue exactly where it was cut.&lt;/p&gt;
     * </pre>
     */
    public ondewo.nlu.LogsOuterClass.ListLogsResponse listLogs(ondewo.nlu.LogsOuterClass.ListLogsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns one log stream, i.e. the capture of one server process or of one container.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a malformed &lt;code&gt;name&lt;/code&gt; or an unknown
     * &lt;code&gt;field_mask&lt;/code&gt; path; &lt;code&gt;NOT_FOUND&lt;/code&gt; for an unknown log stream or one the caller may not
     * read.&lt;/p&gt;
     * </pre>
     */
    public ondewo.nlu.LogsOuterClass.CaiLogStream getLogStream(ondewo.nlu.LogsOuterClass.GetLogStreamRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetLogStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Lists the log streams CAI has captured. A server process yields a new log stream every time it starts,
     * and a container every time it is (re)started under a new container id. Ordered by
     * &lt;code&gt;capture_started_at&lt;/code&gt;, newest first.&lt;/p&gt;
     * &lt;p&gt;A caller without &lt;code&gt;ServerPermission.Logs.ReadServerLogs&lt;/code&gt; sees only the log streams of the
     * projects in which it holds &lt;code&gt;ProjectPermission.Logs.ReadProjectLogs&lt;/code&gt;; the server&amp;apos;s own log
     * streams are not listed to it, although &lt;code&gt;ListLogs&lt;/code&gt; and &lt;code&gt;StreamLogs&lt;/code&gt; return their
     * entries that are tagged with such a project.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a malformed &lt;code&gt;page_token&lt;/code&gt;,
     * &lt;code&gt;CAI_LOG_CAPTURE_STATE_UNSPECIFIED&lt;/code&gt; in &lt;code&gt;capture_states&lt;/code&gt; or an unknown
     * &lt;code&gt;field_mask&lt;/code&gt; path.&lt;/p&gt;
     * </pre>
     */
    public ondewo.nlu.LogsOuterClass.ListLogStreamsResponse listLogStreams(ondewo.nlu.LogsOuterClass.ListLogStreamsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListLogStreamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Exports the captured log entries matching a filter as a file: plain text, NDJSON or CSV, streamed in
     * chunks. Entries are exported oldest first with the same filter semantics and the same server-side secret
     * redaction as &lt;code&gt;ListLogs&lt;/code&gt;; unlike &lt;code&gt;ListLogs&lt;/code&gt; the content filters are applied to EVERY
     * entry of the window. Concatenating the &lt;code&gt;chunk&lt;/code&gt;s of all messages in order yields the file.&lt;/p&gt;
     * &lt;p&gt;A bounded time window is REQUIRED: &lt;code&gt;filter.start_time&lt;/code&gt; AND &lt;code&gt;filter.end_time&lt;/code&gt; must
     * both be set, with &lt;code&gt;start_time&lt;/code&gt; before &lt;code&gt;end_time&lt;/code&gt;.&lt;/p&gt;
     * &lt;p&gt;Limits: each &lt;code&gt;chunk&lt;/code&gt; is at most 1 MiB; an export holds at most
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_EXPORT_MAX_ENTRIES&lt;/code&gt; (default 1000000) entries and at most
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_EXPORT_MAX_BYTES&lt;/code&gt; (default 1 GiB) of output. When a limit is reached the
     * export ends early with &lt;code&gt;truncated = true&lt;/code&gt; on the last message; so does an export one of whose
     * reads exceeds &lt;code&gt;ONDEWO_NLU_CAI_LOG_QUERY_TIMEOUT_S&lt;/code&gt;. At most
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_MAX_CONCURRENT_EXPORTS&lt;/code&gt; (default 1) exports run per server process, beyond
     * which a new one is &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt;.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a missing, empty or inverted time window, an invalid
     * &lt;code&gt;regex&lt;/code&gt; or an unknown &lt;code&gt;format&lt;/code&gt; value; &lt;code&gt;NOT_FOUND&lt;/code&gt; for a named log stream
     * or operation the caller may not read; &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; as above. A revoked access or an
     * expired credential ends the export with &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; / &lt;code&gt;UNAUTHENTICATED&lt;/code&gt; and
     * no last message.&lt;/p&gt;
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, ondewo.nlu.LogsOuterClass.ExportLogsResponse>
        exportLogs(ondewo.nlu.LogsOuterClass.ExportLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getExportLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Permanently deletes captured log entries matching a filter. Only the identity filters and the time
     * window apply; content filters are rejected. A time window alone is a valid filter. A log stream whose last
     * entry was deleted is removed too, unless it is still &lt;code&gt;CAI_LOG_CAPTURE_STATE_CAPTURING&lt;/code&gt;. A
     * capture that is still running keeps writing, so entries emitted after the deletion are stored again.&lt;/p&gt;
     * &lt;p&gt;Idempotent: repeating a deletion succeeds and reports &lt;code&gt;0&lt;/code&gt; deleted entries. With
     * &lt;code&gt;validate_only&lt;/code&gt; nothing is deleted and the counts are what would be deleted.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for an empty filter, a content filter (&lt;code&gt;text&lt;/code&gt;,
     * &lt;code&gt;regex&lt;/code&gt;, &lt;code&gt;log_levels&lt;/code&gt;, &lt;code&gt;min_log_level&lt;/code&gt;,
     * &lt;code&gt;include_unleveled_lines&lt;/code&gt;, &lt;code&gt;emitter_prefixes&lt;/code&gt;, &lt;code&gt;thread_names&lt;/code&gt;,
     * &lt;code&gt;trace_ids&lt;/code&gt;; presence alone counts) or a &lt;code&gt;start_time&lt;/code&gt; after &lt;code&gt;end_time&lt;/code&gt;;
     * &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; without &lt;code&gt;ServerPermission.Logs.DeleteLogs&lt;/code&gt;;
     * &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; when one deletion step exceeds &lt;code&gt;ONDEWO_NLU_CAI_LOG_QUERY_TIMEOUT_S&lt;/code&gt;
     * (what was deleted until then stays deleted; repeat the request); &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the database
     * cannot be reached.&lt;/p&gt;
     * </pre>
     */
    public ondewo.nlu.LogsOuterClass.DeleteLogsResponse deleteLogs(ondewo.nlu.LogsOuterClass.DeleteLogsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteLogsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Logs.
   * <pre>
   * &lt;p&gt;Reads, follows, exports and erases the logs ONDEWO CAI captures: the log records of the CAI gRPC server
   * processes themselves (every worker of every replica), the output of the docker containers that remote
   * operations run (build cache, training, RAG crawl, LLM evaluation and simulation, RAGFlow upload / removal /
   * re-parse) and of the short-lived helper containers that prepare them (hardware check, GPU pre-allocation).
   * Long-running operations that run inside a CAI worker (agent export, import, restore, re-index, ranking
   * optimization) are covered too: the server records they emit carry the operation&amp;apos;s name.&lt;/p&gt;
   * &lt;p&gt;Entries are served from the CAI database, not from the docker daemon, so the logs of a container that was
   * already removed, and of a server process that already exited, stay readable until retention or
   * &lt;code&gt;DeleteLogs&lt;/code&gt; removes them.&lt;/p&gt;
   * &lt;p&gt;&lt;b&gt;Secrets are redacted server-side&lt;/b&gt; when an entry is captured and again when it is read, so a
   * redaction rule added later also applies to entries captured before it.&lt;/p&gt;
   * &lt;p&gt;Errors are reported as gRPC status codes: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a malformed name, filter,
   * cursor, &lt;code&gt;resume_token&lt;/code&gt;, &lt;code&gt;page_token&lt;/code&gt; or &lt;code&gt;field_mask&lt;/code&gt; (each naming the field);
   * &lt;code&gt;NOT_FOUND&lt;/code&gt; for an unknown log stream or operation, and for one the caller may not read;
   * &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; when the server process already serves its maximum of concurrent streams or
   * exports; &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the logs API is disabled (&lt;code&gt;ONDEWO_NLU_CAI_LOG_API_ENABLED&lt;/code&gt;)
   * or the database cannot be reached; &lt;code&gt;UNAUTHENTICATED&lt;/code&gt; without a valid credential;
   * &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; when the caller may read no logs at all.&lt;/p&gt;
   * &lt;p&gt;Authorization: entries that belong to no project (the server&amp;apos;s own records outside any project RPC
   * or operation) require the server permission &lt;code&gt;ServerPermission.Logs.ReadServerLogs&lt;/code&gt;, granted to
   * &lt;code&gt;SERVER_ADMIN&lt;/code&gt; by default; a caller holding it reads every entry. Without it a caller reads only
   * the entries tagged with a project in which it holds &lt;code&gt;ProjectPermission.Logs.ReadProjectLogs&lt;/code&gt;,
   * granted to &lt;code&gt;PROJECT_DEVELOPER&lt;/code&gt; and above by default; entries of other projects are filtered out
   * and are never reported as existing. &lt;code&gt;DeleteLogs&lt;/code&gt; requires
   * &lt;code&gt;ServerPermission.Logs.DeleteLogs&lt;/code&gt;, granted to &lt;code&gt;SERVER_ADMIN&lt;/code&gt; only. A long-running
   * &lt;code&gt;StreamLogs&lt;/code&gt; or &lt;code&gt;ExportLogs&lt;/code&gt; re-checks the caller periodically and ends when the access
   * was revoked or the credential expired.&lt;/p&gt;
   * </pre>
   */
  public static final class LogsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LogsBlockingStub> {
    private LogsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * &lt;p&gt;Streams captured log entries as they are written, in the manner of &lt;code&gt;docker logs --follow&lt;/code&gt;.
     * The stream replays &lt;code&gt;tail_lines&lt;/code&gt; historical entries and then follows. It stays open until the
     * capture of every matching log stream has terminated (only possible when the filter selects container
     * streams alone: the server&amp;apos;s own log streams never terminate while the server runs), until the client
     * disconnects, or until the server-side maximum stream duration is reached.&lt;/p&gt;
     * &lt;p&gt;Limits: at most &lt;code&gt;ONDEWO_NLU_CAI_LOG_STREAM_MAX_DURATION_S&lt;/code&gt; (default 3600) seconds per stream,
     * after which the server sends a final message with &lt;code&gt;end_reason_code =
     * CAI_LOG_STREAM_END_REASON_MAX_DURATION&lt;/code&gt; and a &lt;code&gt;resume_token&lt;/code&gt; to reconnect with; at most
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_MAX_CONCURRENT_STREAMS&lt;/code&gt; (default 8) concurrent streams per server process,
     * beyond which a new stream is &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt;. The server sends NO keep-alive message: a
     * quiet filter sends nothing, so a client must not treat silence as a dead stream (use HTTP/2 keep-alive
     * pings to detect a dead connection).&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a filter carrying &lt;code&gt;start_time&lt;/code&gt; or
     * &lt;code&gt;end_time&lt;/code&gt;, an &lt;code&gt;after_seq&lt;/code&gt; with a filter that does not resolve to exactly one log
     * stream, a malformed &lt;code&gt;resume_token&lt;/code&gt;, an invalid &lt;code&gt;regex&lt;/code&gt; or an unknown
     * &lt;code&gt;field_mask&lt;/code&gt; path; &lt;code&gt;NOT_FOUND&lt;/code&gt; for a named log stream or operation the caller may
     * not read; &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; as above, and when one read of the stored entries exceeds
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_QUERY_TIMEOUT_S&lt;/code&gt; (narrow the filter); &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the
     * database cannot be reached (reconnect with the last &lt;code&gt;resume_token&lt;/code&gt;). When the caller&amp;apos;s
     * access is revoked or its credential expires during the stream, the server sends a final message
     * (&lt;code&gt;CAI_LOG_STREAM_END_REASON_PERMISSION_REVOKED&lt;/code&gt; /
     * &lt;code&gt;CAI_LOG_STREAM_END_REASON_CREDENTIALS_EXPIRED&lt;/code&gt;, with a &lt;code&gt;resume_token&lt;/code&gt;) and ends the
     * stream with &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; / &lt;code&gt;UNAUTHENTICATED&lt;/code&gt;.&lt;/p&gt;
     * </pre>
     */
    public java.util.Iterator<ondewo.nlu.LogsOuterClass.StreamLogsResponse> streamLogs(
        ondewo.nlu.LogsOuterClass.StreamLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a bounded, filtered page of captured log entries. Supports a time window, severity filtering, a
     * regular expression, a plain-text search and cursor paging in both directions for infinite scrolling.&lt;/p&gt;
     * &lt;p&gt;No time window is required: without &lt;code&gt;start_time&lt;/code&gt; / &lt;code&gt;end_time&lt;/code&gt; the window is the
     * newest &lt;code&gt;max_lines&lt;/code&gt; matching entries (or, with &lt;code&gt;oldest_first&lt;/code&gt;, the oldest after the
     * cursor). With &lt;code&gt;include_counts&lt;/code&gt; the response also carries the number of matching entries per
     * severity. The &lt;code&gt;next_resume_token&lt;/code&gt; of a response can be handed to &lt;code&gt;StreamLogs&lt;/code&gt; to
     * continue live exactly where the page ended, without a gap or a duplicate.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for an invalid or over-long &lt;code&gt;regex&lt;/code&gt;, a
     * &lt;code&gt;start_time&lt;/code&gt; after &lt;code&gt;end_time&lt;/code&gt;, &lt;code&gt;before_seq&lt;/code&gt; / &lt;code&gt;after_seq&lt;/code&gt;
     * combined with &lt;code&gt;resume_token&lt;/code&gt; or with a filter that does not resolve to exactly one log stream, a
     * negative &lt;code&gt;before_seq&lt;/code&gt; / &lt;code&gt;after_seq&lt;/code&gt;, a malformed &lt;code&gt;resume_token&lt;/code&gt; or an
     * unknown &lt;code&gt;field_mask&lt;/code&gt; path; &lt;code&gt;NOT_FOUND&lt;/code&gt; for a named log stream or operation the caller
     * may not read; &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; when the query exceeds
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_QUERY_TIMEOUT_S&lt;/code&gt; (narrow the filter: log streams, time window or severity);
     * &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the database cannot be reached.&lt;/p&gt;
     * &lt;p&gt;A page is bounded by size as well as by &lt;code&gt;max_lines&lt;/code&gt;: when its messages would exceed the
     * server&amp;apos;s size budget it is cut (a forward page keeps its oldest entries, a backward page its newest)
     * and reported with &lt;code&gt;truncated = true&lt;/code&gt;; the cursors continue exactly where it was cut.&lt;/p&gt;
     * </pre>
     */
    public ondewo.nlu.LogsOuterClass.ListLogsResponse listLogs(ondewo.nlu.LogsOuterClass.ListLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns one log stream, i.e. the capture of one server process or of one container.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a malformed &lt;code&gt;name&lt;/code&gt; or an unknown
     * &lt;code&gt;field_mask&lt;/code&gt; path; &lt;code&gt;NOT_FOUND&lt;/code&gt; for an unknown log stream or one the caller may not
     * read.&lt;/p&gt;
     * </pre>
     */
    public ondewo.nlu.LogsOuterClass.CaiLogStream getLogStream(ondewo.nlu.LogsOuterClass.GetLogStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLogStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Lists the log streams CAI has captured. A server process yields a new log stream every time it starts,
     * and a container every time it is (re)started under a new container id. Ordered by
     * &lt;code&gt;capture_started_at&lt;/code&gt;, newest first.&lt;/p&gt;
     * &lt;p&gt;A caller without &lt;code&gt;ServerPermission.Logs.ReadServerLogs&lt;/code&gt; sees only the log streams of the
     * projects in which it holds &lt;code&gt;ProjectPermission.Logs.ReadProjectLogs&lt;/code&gt;; the server&amp;apos;s own log
     * streams are not listed to it, although &lt;code&gt;ListLogs&lt;/code&gt; and &lt;code&gt;StreamLogs&lt;/code&gt; return their
     * entries that are tagged with such a project.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a malformed &lt;code&gt;page_token&lt;/code&gt;,
     * &lt;code&gt;CAI_LOG_CAPTURE_STATE_UNSPECIFIED&lt;/code&gt; in &lt;code&gt;capture_states&lt;/code&gt; or an unknown
     * &lt;code&gt;field_mask&lt;/code&gt; path.&lt;/p&gt;
     * </pre>
     */
    public ondewo.nlu.LogsOuterClass.ListLogStreamsResponse listLogStreams(ondewo.nlu.LogsOuterClass.ListLogStreamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLogStreamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Exports the captured log entries matching a filter as a file: plain text, NDJSON or CSV, streamed in
     * chunks. Entries are exported oldest first with the same filter semantics and the same server-side secret
     * redaction as &lt;code&gt;ListLogs&lt;/code&gt;; unlike &lt;code&gt;ListLogs&lt;/code&gt; the content filters are applied to EVERY
     * entry of the window. Concatenating the &lt;code&gt;chunk&lt;/code&gt;s of all messages in order yields the file.&lt;/p&gt;
     * &lt;p&gt;A bounded time window is REQUIRED: &lt;code&gt;filter.start_time&lt;/code&gt; AND &lt;code&gt;filter.end_time&lt;/code&gt; must
     * both be set, with &lt;code&gt;start_time&lt;/code&gt; before &lt;code&gt;end_time&lt;/code&gt;.&lt;/p&gt;
     * &lt;p&gt;Limits: each &lt;code&gt;chunk&lt;/code&gt; is at most 1 MiB; an export holds at most
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_EXPORT_MAX_ENTRIES&lt;/code&gt; (default 1000000) entries and at most
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_EXPORT_MAX_BYTES&lt;/code&gt; (default 1 GiB) of output. When a limit is reached the
     * export ends early with &lt;code&gt;truncated = true&lt;/code&gt; on the last message; so does an export one of whose
     * reads exceeds &lt;code&gt;ONDEWO_NLU_CAI_LOG_QUERY_TIMEOUT_S&lt;/code&gt;. At most
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_MAX_CONCURRENT_EXPORTS&lt;/code&gt; (default 1) exports run per server process, beyond
     * which a new one is &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt;.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a missing, empty or inverted time window, an invalid
     * &lt;code&gt;regex&lt;/code&gt; or an unknown &lt;code&gt;format&lt;/code&gt; value; &lt;code&gt;NOT_FOUND&lt;/code&gt; for a named log stream
     * or operation the caller may not read; &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; as above. A revoked access or an
     * expired credential ends the export with &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; / &lt;code&gt;UNAUTHENTICATED&lt;/code&gt; and
     * no last message.&lt;/p&gt;
     * </pre>
     */
    public java.util.Iterator<ondewo.nlu.LogsOuterClass.ExportLogsResponse> exportLogs(
        ondewo.nlu.LogsOuterClass.ExportLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getExportLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Permanently deletes captured log entries matching a filter. Only the identity filters and the time
     * window apply; content filters are rejected. A time window alone is a valid filter. A log stream whose last
     * entry was deleted is removed too, unless it is still &lt;code&gt;CAI_LOG_CAPTURE_STATE_CAPTURING&lt;/code&gt;. A
     * capture that is still running keeps writing, so entries emitted after the deletion are stored again.&lt;/p&gt;
     * &lt;p&gt;Idempotent: repeating a deletion succeeds and reports &lt;code&gt;0&lt;/code&gt; deleted entries. With
     * &lt;code&gt;validate_only&lt;/code&gt; nothing is deleted and the counts are what would be deleted.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for an empty filter, a content filter (&lt;code&gt;text&lt;/code&gt;,
     * &lt;code&gt;regex&lt;/code&gt;, &lt;code&gt;log_levels&lt;/code&gt;, &lt;code&gt;min_log_level&lt;/code&gt;,
     * &lt;code&gt;include_unleveled_lines&lt;/code&gt;, &lt;code&gt;emitter_prefixes&lt;/code&gt;, &lt;code&gt;thread_names&lt;/code&gt;,
     * &lt;code&gt;trace_ids&lt;/code&gt;; presence alone counts) or a &lt;code&gt;start_time&lt;/code&gt; after &lt;code&gt;end_time&lt;/code&gt;;
     * &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; without &lt;code&gt;ServerPermission.Logs.DeleteLogs&lt;/code&gt;;
     * &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; when one deletion step exceeds &lt;code&gt;ONDEWO_NLU_CAI_LOG_QUERY_TIMEOUT_S&lt;/code&gt;
     * (what was deleted until then stays deleted; repeat the request); &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the database
     * cannot be reached.&lt;/p&gt;
     * </pre>
     */
    public ondewo.nlu.LogsOuterClass.DeleteLogsResponse deleteLogs(ondewo.nlu.LogsOuterClass.DeleteLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLogsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Logs.
   * <pre>
   * &lt;p&gt;Reads, follows, exports and erases the logs ONDEWO CAI captures: the log records of the CAI gRPC server
   * processes themselves (every worker of every replica), the output of the docker containers that remote
   * operations run (build cache, training, RAG crawl, LLM evaluation and simulation, RAGFlow upload / removal /
   * re-parse) and of the short-lived helper containers that prepare them (hardware check, GPU pre-allocation).
   * Long-running operations that run inside a CAI worker (agent export, import, restore, re-index, ranking
   * optimization) are covered too: the server records they emit carry the operation&amp;apos;s name.&lt;/p&gt;
   * &lt;p&gt;Entries are served from the CAI database, not from the docker daemon, so the logs of a container that was
   * already removed, and of a server process that already exited, stay readable until retention or
   * &lt;code&gt;DeleteLogs&lt;/code&gt; removes them.&lt;/p&gt;
   * &lt;p&gt;&lt;b&gt;Secrets are redacted server-side&lt;/b&gt; when an entry is captured and again when it is read, so a
   * redaction rule added later also applies to entries captured before it.&lt;/p&gt;
   * &lt;p&gt;Errors are reported as gRPC status codes: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a malformed name, filter,
   * cursor, &lt;code&gt;resume_token&lt;/code&gt;, &lt;code&gt;page_token&lt;/code&gt; or &lt;code&gt;field_mask&lt;/code&gt; (each naming the field);
   * &lt;code&gt;NOT_FOUND&lt;/code&gt; for an unknown log stream or operation, and for one the caller may not read;
   * &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; when the server process already serves its maximum of concurrent streams or
   * exports; &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the logs API is disabled (&lt;code&gt;ONDEWO_NLU_CAI_LOG_API_ENABLED&lt;/code&gt;)
   * or the database cannot be reached; &lt;code&gt;UNAUTHENTICATED&lt;/code&gt; without a valid credential;
   * &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; when the caller may read no logs at all.&lt;/p&gt;
   * &lt;p&gt;Authorization: entries that belong to no project (the server&amp;apos;s own records outside any project RPC
   * or operation) require the server permission &lt;code&gt;ServerPermission.Logs.ReadServerLogs&lt;/code&gt;, granted to
   * &lt;code&gt;SERVER_ADMIN&lt;/code&gt; by default; a caller holding it reads every entry. Without it a caller reads only
   * the entries tagged with a project in which it holds &lt;code&gt;ProjectPermission.Logs.ReadProjectLogs&lt;/code&gt;,
   * granted to &lt;code&gt;PROJECT_DEVELOPER&lt;/code&gt; and above by default; entries of other projects are filtered out
   * and are never reported as existing. &lt;code&gt;DeleteLogs&lt;/code&gt; requires
   * &lt;code&gt;ServerPermission.Logs.DeleteLogs&lt;/code&gt;, granted to &lt;code&gt;SERVER_ADMIN&lt;/code&gt; only. A long-running
   * &lt;code&gt;StreamLogs&lt;/code&gt; or &lt;code&gt;ExportLogs&lt;/code&gt; re-checks the caller periodically and ends when the access
   * was revoked or the credential expired.&lt;/p&gt;
   * </pre>
   */
  public static final class LogsFutureStub
      extends io.grpc.stub.AbstractFutureStub<LogsFutureStub> {
    private LogsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a bounded, filtered page of captured log entries. Supports a time window, severity filtering, a
     * regular expression, a plain-text search and cursor paging in both directions for infinite scrolling.&lt;/p&gt;
     * &lt;p&gt;No time window is required: without &lt;code&gt;start_time&lt;/code&gt; / &lt;code&gt;end_time&lt;/code&gt; the window is the
     * newest &lt;code&gt;max_lines&lt;/code&gt; matching entries (or, with &lt;code&gt;oldest_first&lt;/code&gt;, the oldest after the
     * cursor). With &lt;code&gt;include_counts&lt;/code&gt; the response also carries the number of matching entries per
     * severity. The &lt;code&gt;next_resume_token&lt;/code&gt; of a response can be handed to &lt;code&gt;StreamLogs&lt;/code&gt; to
     * continue live exactly where the page ended, without a gap or a duplicate.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for an invalid or over-long &lt;code&gt;regex&lt;/code&gt;, a
     * &lt;code&gt;start_time&lt;/code&gt; after &lt;code&gt;end_time&lt;/code&gt;, &lt;code&gt;before_seq&lt;/code&gt; / &lt;code&gt;after_seq&lt;/code&gt;
     * combined with &lt;code&gt;resume_token&lt;/code&gt; or with a filter that does not resolve to exactly one log stream, a
     * negative &lt;code&gt;before_seq&lt;/code&gt; / &lt;code&gt;after_seq&lt;/code&gt;, a malformed &lt;code&gt;resume_token&lt;/code&gt; or an
     * unknown &lt;code&gt;field_mask&lt;/code&gt; path; &lt;code&gt;NOT_FOUND&lt;/code&gt; for a named log stream or operation the caller
     * may not read; &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; when the query exceeds
     * &lt;code&gt;ONDEWO_NLU_CAI_LOG_QUERY_TIMEOUT_S&lt;/code&gt; (narrow the filter: log streams, time window or severity);
     * &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the database cannot be reached.&lt;/p&gt;
     * &lt;p&gt;A page is bounded by size as well as by &lt;code&gt;max_lines&lt;/code&gt;: when its messages would exceed the
     * server&amp;apos;s size budget it is cut (a forward page keeps its oldest entries, a backward page its newest)
     * and reported with &lt;code&gt;truncated = true&lt;/code&gt;; the cursors continue exactly where it was cut.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LogsOuterClass.ListLogsResponse> listLogs(
        ondewo.nlu.LogsOuterClass.ListLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLogsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns one log stream, i.e. the capture of one server process or of one container.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a malformed &lt;code&gt;name&lt;/code&gt; or an unknown
     * &lt;code&gt;field_mask&lt;/code&gt; path; &lt;code&gt;NOT_FOUND&lt;/code&gt; for an unknown log stream or one the caller may not
     * read.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LogsOuterClass.CaiLogStream> getLogStream(
        ondewo.nlu.LogsOuterClass.GetLogStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLogStreamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Lists the log streams CAI has captured. A server process yields a new log stream every time it starts,
     * and a container every time it is (re)started under a new container id. Ordered by
     * &lt;code&gt;capture_started_at&lt;/code&gt;, newest first.&lt;/p&gt;
     * &lt;p&gt;A caller without &lt;code&gt;ServerPermission.Logs.ReadServerLogs&lt;/code&gt; sees only the log streams of the
     * projects in which it holds &lt;code&gt;ProjectPermission.Logs.ReadProjectLogs&lt;/code&gt;; the server&amp;apos;s own log
     * streams are not listed to it, although &lt;code&gt;ListLogs&lt;/code&gt; and &lt;code&gt;StreamLogs&lt;/code&gt; return their
     * entries that are tagged with such a project.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for a malformed &lt;code&gt;page_token&lt;/code&gt;,
     * &lt;code&gt;CAI_LOG_CAPTURE_STATE_UNSPECIFIED&lt;/code&gt; in &lt;code&gt;capture_states&lt;/code&gt; or an unknown
     * &lt;code&gt;field_mask&lt;/code&gt; path.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LogsOuterClass.ListLogStreamsResponse> listLogStreams(
        ondewo.nlu.LogsOuterClass.ListLogStreamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLogStreamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Permanently deletes captured log entries matching a filter. Only the identity filters and the time
     * window apply; content filters are rejected. A time window alone is a valid filter. A log stream whose last
     * entry was deleted is removed too, unless it is still &lt;code&gt;CAI_LOG_CAPTURE_STATE_CAPTURING&lt;/code&gt;. A
     * capture that is still running keeps writing, so entries emitted after the deletion are stored again.&lt;/p&gt;
     * &lt;p&gt;Idempotent: repeating a deletion succeeds and reports &lt;code&gt;0&lt;/code&gt; deleted entries. With
     * &lt;code&gt;validate_only&lt;/code&gt; nothing is deleted and the counts are what would be deleted.&lt;/p&gt;
     * &lt;p&gt;Errors: &lt;code&gt;INVALID_ARGUMENT&lt;/code&gt; for an empty filter, a content filter (&lt;code&gt;text&lt;/code&gt;,
     * &lt;code&gt;regex&lt;/code&gt;, &lt;code&gt;log_levels&lt;/code&gt;, &lt;code&gt;min_log_level&lt;/code&gt;,
     * &lt;code&gt;include_unleveled_lines&lt;/code&gt;, &lt;code&gt;emitter_prefixes&lt;/code&gt;, &lt;code&gt;thread_names&lt;/code&gt;,
     * &lt;code&gt;trace_ids&lt;/code&gt;; presence alone counts) or a &lt;code&gt;start_time&lt;/code&gt; after &lt;code&gt;end_time&lt;/code&gt;;
     * &lt;code&gt;PERMISSION_DENIED&lt;/code&gt; without &lt;code&gt;ServerPermission.Logs.DeleteLogs&lt;/code&gt;;
     * &lt;code&gt;RESOURCE_EXHAUSTED&lt;/code&gt; when one deletion step exceeds &lt;code&gt;ONDEWO_NLU_CAI_LOG_QUERY_TIMEOUT_S&lt;/code&gt;
     * (what was deleted until then stays deleted; repeat the request); &lt;code&gt;UNAVAILABLE&lt;/code&gt; when the database
     * cannot be reached.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.nlu.LogsOuterClass.DeleteLogsResponse> deleteLogs(
        ondewo.nlu.LogsOuterClass.DeleteLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLogsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STREAM_LOGS = 0;
  private static final int METHODID_LIST_LOGS = 1;
  private static final int METHODID_GET_LOG_STREAM = 2;
  private static final int METHODID_LIST_LOG_STREAMS = 3;
  private static final int METHODID_EXPORT_LOGS = 4;
  private static final int METHODID_DELETE_LOGS = 5;

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
        case METHODID_STREAM_LOGS:
          serviceImpl.streamLogs((ondewo.nlu.LogsOuterClass.StreamLogsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LogsOuterClass.StreamLogsResponse>) responseObserver);
          break;
        case METHODID_LIST_LOGS:
          serviceImpl.listLogs((ondewo.nlu.LogsOuterClass.ListLogsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LogsOuterClass.ListLogsResponse>) responseObserver);
          break;
        case METHODID_GET_LOG_STREAM:
          serviceImpl.getLogStream((ondewo.nlu.LogsOuterClass.GetLogStreamRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LogsOuterClass.CaiLogStream>) responseObserver);
          break;
        case METHODID_LIST_LOG_STREAMS:
          serviceImpl.listLogStreams((ondewo.nlu.LogsOuterClass.ListLogStreamsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LogsOuterClass.ListLogStreamsResponse>) responseObserver);
          break;
        case METHODID_EXPORT_LOGS:
          serviceImpl.exportLogs((ondewo.nlu.LogsOuterClass.ExportLogsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LogsOuterClass.ExportLogsResponse>) responseObserver);
          break;
        case METHODID_DELETE_LOGS:
          serviceImpl.deleteLogs((ondewo.nlu.LogsOuterClass.DeleteLogsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.nlu.LogsOuterClass.DeleteLogsResponse>) responseObserver);
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
          getStreamLogsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              ondewo.nlu.LogsOuterClass.StreamLogsRequest,
              ondewo.nlu.LogsOuterClass.StreamLogsResponse>(
                service, METHODID_STREAM_LOGS)))
        .addMethod(
          getListLogsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LogsOuterClass.ListLogsRequest,
              ondewo.nlu.LogsOuterClass.ListLogsResponse>(
                service, METHODID_LIST_LOGS)))
        .addMethod(
          getGetLogStreamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LogsOuterClass.GetLogStreamRequest,
              ondewo.nlu.LogsOuterClass.CaiLogStream>(
                service, METHODID_GET_LOG_STREAM)))
        .addMethod(
          getListLogStreamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LogsOuterClass.ListLogStreamsRequest,
              ondewo.nlu.LogsOuterClass.ListLogStreamsResponse>(
                service, METHODID_LIST_LOG_STREAMS)))
        .addMethod(
          getExportLogsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              ondewo.nlu.LogsOuterClass.ExportLogsRequest,
              ondewo.nlu.LogsOuterClass.ExportLogsResponse>(
                service, METHODID_EXPORT_LOGS)))
        .addMethod(
          getDeleteLogsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.nlu.LogsOuterClass.DeleteLogsRequest,
              ondewo.nlu.LogsOuterClass.DeleteLogsResponse>(
                service, METHODID_DELETE_LOGS)))
        .build();
  }

  private static abstract class LogsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ondewo.nlu.LogsOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Logs");
    }
  }

  private static final class LogsFileDescriptorSupplier
      extends LogsBaseDescriptorSupplier {
    LogsFileDescriptorSupplier() {}
  }

  private static final class LogsMethodDescriptorSupplier
      extends LogsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LogsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LogsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogsFileDescriptorSupplier())
              .addMethod(getStreamLogsMethod())
              .addMethod(getListLogsMethod())
              .addMethod(getGetLogStreamMethod())
              .addMethod(getListLogStreamsMethod())
              .addMethod(getExportLogsMethod())
              .addMethod(getDeleteLogsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
