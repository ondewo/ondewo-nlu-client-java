# Release History

*****************

## Release ONDEWO NLU Java Client 7.3.1

### New Features

* TLS and mutual TLS helper in the hand-written package `com.ondewo.nlu.channel` (kept by a
  regeneration): `ClientConfig` (`host`, `port`, `grpcCert`, `grpcClientCert`, `grpcClientKey`,
  `useSecureChannel`, default `true`) and `GrpcChannels.newChannel(config)` /
  `GrpcChannels.newChannelBuilder(config)`. One channel serves every stub of the client.
  * The certificate fields take **PEM content, not file paths**. Non-PEM material (typically a path) or an
    encrypted / non-PKCS#8 key is refused with `IllegalArgumentException` before any connection is
    attempted. An empty `grpcCert` means the JVM trust store.
  * `grpcClientCert` and `grpcClientKey` are both-or-neither: setting only one makes
    `ClientConfig.Builder.build()` throw. Both empty means plain server-authenticated TLS.
  * `useSecureChannel(false)` with a client identity throws instead of silently dropping it. A plaintext
    channel logs a `WARNING` naming `host:port` through `java.util.logging`; the logging configuration of
    the application is never touched.
  * `ClientConfig.toString()` shows `grpcClientKey` as `***REDACTED***` (empty when unset) and the
    certificates only as their length; no error message renders a PEM, the key or a whole config.
  * A bare IPv6 literal host is bracketed (`::1` -> `[::1]:50051`); PEMs with CRLF line endings work.
* Channel defaults aligned with the ONDEWO Python clients where grpc-java exposes them: keepalive timeout
  20 s, `keepAliveWithoutCalls(false)`, `maxInboundMessageSize(Integer.MAX_VALUE)`.
  * Keepalive time is **5 minutes**, not the Python clients' 30 s: grpc-java has no
    `http2.max_pings_without_data`, so a 30 s ping on a silent stream is answered by a default grpc-core
    server with a `too_many_pings` GOAWAY (measured against a grpcio 1.81 server). Pair a server that
    permits faster pings with a shorter `keepAliveTime` on the builder.
  * Not available in grpc-java and documented as gaps: `http2.max_pings_without_data`,
    `max_reconnect_backoff_ms` (grpc-java's backoff caps at 120 s), and no retry policy is configured
    (only gRPC's transparent retries).

### Improvements

* Still tracking API Version [7.3.0](https://github.com/ondewo/ondewo-nlu-api/releases/tag/7.3.0)
* README section "TLS, mutual TLS and certificates": modes, loading PEMs from files, a test PKI with openssl,
  channel defaults, security notes and troubleshooting.

### Tests

* `ClientConfigTest` and `GrpcChannelsTest`: real TLS handshakes against a loopback Netty server with a PKI
  generated at test time (BouncyCastle, test scope only; no key is committed) - TLS with a custom CA, mutual
  TLS, CRLF PEMs, IPv6 `[::1]`, empty identity = plain TLS; missing client certificate, client from an
  unrelated CA and wrong CA end in `UNAVAILABLE`; half pair, plaintext with identity, insecure warning and
  redaction edge cases. The 100 % JaCoCo gate now also covers `com/ondewo/nlu/channel/**`.
* `ReleaseNotesTest` pins the `RELEASE.md` heading spelling and the `*****` separator the GitHub release
  body is sliced by, and that the current version has non-empty notes.

*****************

## Release ONDEWO NLU Java Client 7.3.0

### Improvements

* Tracking API Version [7.3.0](https://github.com/ondewo/ondewo-nlu-api/releases/tag/7.3.0) ( [Documentation](https://ondewo.github.io/ondewo-nlu-api/) )

*****************

## Release ONDEWO NLU Java Client 7.2.0

### Improvements

* Tracking API Version [7.2.0](https://github.com/ondewo/ondewo-nlu-api/releases/tag/7.2.0) ( [Documentation](https://ondewo.github.io/ondewo-nlu-api/) )

*****************

## Release ONDEWO NLU Java Client 7.1.0

### New Features

* Initial release of the ONDEWO NLU (Natural Language Understanding) gRPC client for Java. The library
  is generated from the protobuf definitions of [ondewo-nlu-api](https://github.com/ondewo/ondewo-nlu-api)
  by the `ondewo-java-proto-compiler` image of the
  [ONDEWO proto compiler](https://github.com/ondewo/ondewo-proto-compiler) release
  `5.15.1`: `protoc --java_out` for the message classes, `protoc-gen-grpc-java` for the
  service stubs, and a rendered `pom.xml` that pins the gRPC, protobuf and
  `proto-google-common-protos` versions the stubs were generated against. The packaged artifact is
  `com.ondewo:ondewo-nlu-client-java`, compiled with `maven.compiler.release=11`, and ships a
  sources jar alongside the binary jar.
* `make build` regenerates the whole client from the pinned submodules - api protos and proto
  compiler - and `make test` verifies that every `.proto` produced java code before running the
  maven test suite. Both run in CI on JDK 11 and JDK 21.

*****************
