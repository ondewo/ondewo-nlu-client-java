# Release History

*****************

## Release ONDEWO NLU Java Client 0.1.0

### New Features

* Initial release of the ONDEWO NLU (Natural Language Understanding) gRPC client for Java. The library
  is generated from the protobuf definitions of [ondewo-nlu-api](https://github.com/ondewo/ondewo-nlu-api)
  by the `ondewo-java-proto-compiler` image of the
  [ONDEWO proto compiler](https://github.com/ondewo/ondewo-proto-compiler) release
  `5.15.0`: `protoc --java_out` for the message classes, `protoc-gen-grpc-java` for the
  service stubs, and a rendered `pom.xml` that pins the gRPC, protobuf and
  `proto-google-common-protos` versions the stubs were generated against. The packaged artifact is
  `com.ondewo:ondewo-nlu-client-java`, compiled with `maven.compiler.release=11`, and ships a
  sources jar alongside the binary jar.
* `make build` regenerates the whole client from the pinned submodules - api protos and proto
  compiler - and `make test` verifies that every `.proto` produced java code before running the
  maven test suite. Both run in CI on JDK 11 and JDK 21.

*****************
