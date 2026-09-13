<div align="center">
  <table>
    <tr>
      <td>
        <a href="https://ondewo.com/en/">
            <img width="400px" src="https://raw.githubusercontent.com/ondewo/ondewo-logos/master/ondewo_we_automate_your_phone_calls.png"/>
        </a>
      </td>
    </tr>
    <tr>
        <td align="center">
          <a href="https://www.linkedin.com/company/ondewo "><img width="40px" src="https://cdn-icons-png.flaticon.com/512/3536/3536505.png"></a>
          <a href="https://www.facebook.com/ondewo"><img width="40px" src="https://cdn-icons-png.flaticon.com/512/733/733547.png"></a>
          <a href="https://twitter.com/ondewo"><img width="40px" src="https://cdn-icons-png.flaticon.com/512/733/733579.png"> </a>
          <a href="https://www.instagram.com/ondewo.ai/"><img width="40px" src="https://cdn-icons-png.flaticon.com/512/174/174855.png"></a>
        </td>
    </tr>
  </table>
  <h1>
  ONDEWO NLU Client Java Library
  </h1>
</div>

This library gives a Java application a typed, ready-to-use gRPC client for the ONDEWO
NLU (Natural Language Understanding) server.

It contains no hand-written protocol code. The service and message classes are generated from
the protobuf definitions in the [ondewo-nlu-api](https://github.com/ondewo/ondewo-nlu-api) repository
(vendored here as a git submodule) by the
[ONDEWO proto compiler](https://github.com/ondewo/ondewo-proto-compiler) (vendored as a second
submodule), which also renders the `pom.xml` and packages the jar. Everything under
`src/main/java` and the `pom.xml` are therefore build output that happens to be committed, so
the repository can be consumed and opened in an IDE without Docker.

## Requirements

| For | You need |
| --- | --- |
| Using the library | JDK 11 or newer (the jar is compiled with `maven.compiler.release=11`) |
| Building the jar locally | JDK 11+ and Maven 3.6+ |
| Regenerating the stubs | Docker, GNU Make, git |

## Installation

The library is not published to Maven Central. Pick whichever of the following fits your build.

### JitPack

[JitPack](https://jitpack.io) builds this repository straight from its git tag, so no extra
infrastructure is needed:

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependency>
  <groupId>com.github.ondewo</groupId>
  <artifactId>ondewo-nlu-client-java</artifactId>
  <version>VERSION</version>
</dependency>
```

Gradle:

```groovy
repositories { maven { url 'https://jitpack.io' } }
dependencies { implementation 'com.github.ondewo:ondewo-nlu-client-java:VERSION' }
```

### Jar from the GitHub release

Every [release](https://github.com/ondewo/ondewo-nlu-client-java/releases) carries the built
`ondewo-nlu-client-java-<version>.jar` and its sources jar as assets. Install one into
your local repository with the `pom.xml` of the matching tag, so the transitive gRPC and
protobuf dependencies come along:

```bash
mvn install:install-file \
  -Dfile=ondewo-nlu-client-java-<version>.jar \
  -DpomFile=pom.xml
```

It is then available as:

```xml
<dependency>
  <groupId>com.ondewo</groupId>
  <artifactId>ondewo-nlu-client-java</artifactId>
  <version>VERSION</version>
</dependency>
```

### From source

```bash
git clone --recurse-submodules https://github.com/ondewo/ondewo-nlu-client-java.git
cd ondewo-nlu-client-java
make package        # compiles the committed stubs into target/*.jar
```

## Usage

The generated classes keep the java package protoc derives from the proto package, so the
service stubs of this client live in `ondewo.nlu`. Each proto service `Foo` becomes a
`FooGrpc` class with a blocking, a future and an async stub; list what is available with:

```bash
ls src/main/java/ondewo/nlu/*Grpc.java
```

A minimal call, with the bearer token ONDEWO servers expect attached to every request:

```java
import io.grpc.CallCredentials;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;

String host = System.getenv("ONDEWO_HOST");
int port = Integer.parseInt(System.getenv("ONDEWO_PORT"));
String accessToken = System.getenv("ONDEWO_TOKEN");

ManagedChannel channel = ManagedChannelBuilder
    .forAddress(host, port)
    .useTransportSecurity()   // .usePlaintext() for a local, unencrypted server
    .build();

Metadata headers = new Metadata();
headers.put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER), "Bearer " + accessToken);

// Replace <Service> with one of the services declared in the ondewo-nlu-api protos.
<Service>Grpc.<Service>BlockingStub stub = <Service>Grpc
    .newBlockingStub(channel)
    .withInterceptors(MetadataUtils.newAttachHeadersInterceptor(headers));

// ... issue requests through `stub`, then shut the channel down:
channel.shutdownNow();
```

Note that the protos do not set `java_multiple_files`, so messages are nested inside the outer
class protoc names after the proto file (`entity_type.proto` → `EntityTypeProto`,
`agent.proto` → `Agent` or `AgentOuterClass` when a message of the same name exists).

## Repository structure

```
.
├── ondewo-nlu-api/               <----- submodule: the .proto definitions (input)
├── ondewo-proto-compiler/    <----- submodule: the code generator (pinned to a release tag)
├── src/
│   └── main/java/            <----- generated stubs (committed), plus hand-written sources
├── pom.xml                   <----- generated build descriptor (committed)
├── target/                   <----- build output (git-ignored)
├── Makefile                  <----- every workflow: build, test, release
├── RELEASE.md
└── README.md
```

## Regenerating the stubs

```bash
make build
```

That target runs the whole pipeline and is the only supported way to regenerate:

1. `update_submodules` — `git submodule update --init --recursive`.
1. `checkout_defined_submodule_versions` — checks out the `ondewo-nlu-api` and
   `ondewo-proto-compiler` revisions pinned at the top of the `Makefile`.
1. `build_compiler` — `cd ondewo-proto-compiler/java && sh build.sh`, which builds the
   `ondewo-java-proto-compiler:latest` image. The image tag is the only contract; any locally
   built image with that tag is used.
1. `generate_ondewo_protos` — the single `docker run` below.
1. `check_build` — asserts that every `.proto` produced java code.
1. `package` — `mvn -DskipTests package` against the freshly rendered `pom.xml`.

The generation step is exactly the contract documented in
`ondewo-proto-compiler/java/example/run-compile.sh`:

```bash
docker run --rm \
  -v $(pwd)/ondewo-nlu-api:/input-volume/ondewo-nlu-api \
  -v $(pwd)/LICENSE:/input-volume/LICENSE \
  -v $(pwd):/output-volume \
  ondewo-java-proto-compiler \
  ondewo-nlu-api ondewo com.ondewo ondewo-nlu-client-java <version>
```

The positional arguments are `<relative_protos_dir> <target_subdir> <group_id> <artifact_id>
<version>`; the last three are the java target's equivalent of the node targets' library name,
because java has nothing in the input volume to read the library identity from.

Things worth knowing about that invocation:

* **No `-it`.** It breaks every non-interactive caller with `cannot attach stdin to a
  TTY-enabled container because stdin is not a terminal`. Keep `-it` only for the debug form:
  `docker run -it --entrypoint /bin/bash -v ... ondewo-java-proto-compiler`.
* **Only the api submodule is mounted as input**, not the whole repository. A `pom.xml` found at
  the input-volume root *wins* over the rendered template, so mounting the repository root would
  freeze the library version at whatever the previously generated file says.
* **The output volume is the repository root**, which is precisely the maven project the image
  emits. Expect a loud `WARNING: ... pom.xml ... is about to be OVERWRITTEN` on every run — that
  is the descriptor being re-rendered from `ONDEWO_NLU_VERSION`, and is intended.
* **The container runs as root** (it writes into the root-owned `/image-data` inside the image),
  so the output is root-owned. `make fix_ownership` runs right after and `chown`s it back, which
  may prompt for `sudo`.
* **Generation needs no network** once the image exists: the maven build inside the container
  runs offline against a repository pre-warmed at image-build time.

### Hand-written code beside the stubs

The image deletes only the *leaf* java packages it regenerates, so hand-written classes survive
a regeneration as long as they live in their own package (for example
`src/main/java/com/ondewo/nlu/auth/`). Two rules follow from the pipeline:

* Never put a hand-written class in a package that holds generated stubs — it is deleted on the
  next run.
* Hand-written code must compile against the generated `pom.xml`, i.e. against gRPC, protobuf
  and the JDK only (`java.net.http` covers HTTP/token work). Extra dependencies require a
  hand-maintained `pom.xml` mounted at the input-volume root, and every version it names must be
  one that the compiler image pre-warmed, because the packaging step runs `mvn --offline`.

## Testing

```bash
make test
```

runs `check_build` (every proto produced java code) and then `mvn test`. The same two steps run
in CI for JDK 11 and JDK 21 on every push — see `.github/workflows/ci.yml`.

## Release

Versions are defined once, in the `Makefile`: `ONDEWO_NLU_VERSION` must match the
`ondewo-nlu-api` release in major and minor version, and is written into the generated `pom.xml` by
the next `make build`.

1. Bump `ONDEWO_NLU_VERSION` and the submodule pins in the `Makefile`.
1. Add the release entry at the top of `RELEASE.md`.
1. `make ondewo_release` — checks that the branch/tag/pom version are consistent (`spc`), fetches
   the GitHub credentials from the `ondewo-devops-accounts` repository, rebuilds everything,
   commits, creates the release branch and tag, and publishes the GitHub release with the built
   jars attached.

`make release` does the same with credentials taken from the environment
(`GITHUB_GH_TOKEN=... make release`).

## Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md). Install the hooks once with
`make install_precommit_hooks`; `make precommit_hooks_run_all_files` runs them over the whole
repository.

Commit messages follow [Conventional Commits](https://www.conventionalcommits.org/); the
`giticket` hook prepends the JIRA ticket taken from the branch name, so never write the ticket
prefix yourself.

## Links

* [ONDEWO NLU API (protos)](https://github.com/ondewo/ondewo-nlu-api)
* [ONDEWO proto compiler](https://github.com/ondewo/ondewo-proto-compiler)
* [ONDEWO](https://www.ondewo.com)
