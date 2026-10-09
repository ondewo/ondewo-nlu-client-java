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
submodule). Everything under `src/main/java` except the hand-written classes is therefore build
output that happens to be committed, so the repository can be consumed and opened in an IDE
without Docker. The `pom.xml` is hand-maintained; a regeneration keeps it and only writes the
version into it.

## Requirements

| For | You need |
| --- | --- |
| Using the library | JDK 11 or newer (the jar is compiled with `maven.compiler.release=11`) |
| Building the jar locally | JDK 11+ and Maven 3.6+ (`make package`), or only Docker and GNU Make (`make package_via_docker`) |
| Regenerating the stubs (`make build`) | Docker, GNU Make, git, perl |
| Releasing | GNU Make, git (with ssh access to GitHub and Bitbucket), Docker, perl — maven, the JDK, gpg, curl and the GitHub CLI run in the `ondewo-nlu-client-utils-java` image built from `Dockerfile.utils` |

## Installation

### Maven Central

The published coordinates are `com.ondewo:ondewo-nlu-client-java`. Maven:

```xml
<dependency>
  <groupId>com.ondewo</groupId>
  <artifactId>ondewo-nlu-client-java</artifactId>
  <version>VERSION</version>
</dependency>
```

Gradle:

```groovy
dependencies { implementation 'com.ondewo:ondewo-nlu-client-java:VERSION' }
```

No `<repositories>` block is needed - Maven Central is the default repository of both build
tools. Every published version ships the binary jar, a sources jar and a javadoc jar, each with
a detached PGP signature, so an IDE resolves sources and docs automatically.

> Which versions are on Maven Central is listed at
> [search.maven.org](https://search.maven.org/artifact/com.ondewo/ondewo-nlu-client-java).
> Versions released before the namespace was verified are only available through the two
> fallbacks below.

### JitPack

[JitPack](https://jitpack.io) builds this repository straight from its git tag, so it works for
every tag, including ones that predate the Maven Central release:

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

### Jar from a GitHub release (up to 7.1.0)

The [releases](https://github.com/ondewo/ondewo-nlu-client-java/releases) up to 7.1.0 carry the
built `ondewo-nlu-client-java-<version>.jar` and its sources jar as assets. From 7.2.0 on the
jars are published only to Maven Central, and the GitHub release carries the release notes. Install
such a jar into your local repository with the `pom.xml` of the matching tag, so the transitive
gRPC and protobuf dependencies come along:

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
make package        # compiles the committed stubs into target/*.jar (local JDK + maven)
make package_via_docker   # the same inside the utils image - needs only Docker
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
import com.ondewo.nlu.auth.BearerToken;
import com.ondewo.nlu.channel.ClientConfig;
import com.ondewo.nlu.channel.GrpcChannels;
import io.grpc.ManagedChannel;

String host = System.getenv("ONDEWO_HOST");
int port = Integer.parseInt(System.getenv("ONDEWO_PORT"));
String accessToken = System.getenv("ONDEWO_TOKEN");

// TLS against the JVM trust store; a custom CA, mutual TLS and plaintext are described in
// "TLS, mutual TLS and certificates" below.
ManagedChannel channel = GrpcChannels.newChannel(
    ClientConfig.builder().host(host).port(port).build());

// Replace <Service> with one of the services declared in the ondewo-nlu-api protos.
<Service>Grpc.<Service>BlockingStub stub = new BearerToken(accessToken)
    .attachTo(<Service>Grpc.newBlockingStub(channel));

// ... issue requests through `stub`, then shut the channel down:
channel.shutdownNow();
```

`BearerToken` is a hand-written class of this client, like the `channel` package below (see
[Hand-written code beside the stubs](#hand-written-code-beside-the-stubs)); it wraps the
`authorization: Bearer <token>` header every ONDEWO server expects. Attaching the header by hand
with `MetadataUtils.newAttachHeadersInterceptor(...)` works just as well.

Note that the protos do not set `java_multiple_files`, so messages are nested inside the outer
class protoc names after the proto file (`entity_type.proto` → `EntityTypeProto`,
`agent.proto` → `Agent` or `AgentOuterClass` when a message of the same name exists).

## TLS, mutual TLS and certificates

`com.ondewo.nlu.channel` opens the channel for you: `ClientConfig` holds where to connect and
the certificate material, `GrpcChannels` turns it into a `ManagedChannel` (or a
`ManagedChannelBuilder` to add your own settings). Both are hand-written and live outside the
generated packages, so a regeneration keeps them.

| Mode                           | `useSecureChannel` | Config fields                                                                  |
|--------------------------------|--------------------|--------------------------------------------------------------------------------|
| Plaintext (not for production) | `false`            | none                                                                           |
| TLS, JVM trust store           | `true` (default)   | none                                                                           |
| TLS, custom CA                 | `true` (default)   | `grpcCert` = PEM of the CA that signed the server certificate                  |
| Mutual TLS                     | `true` (default)   | `grpcClientCert` and `grpcClientKey`, plus `grpcCert` unless the JVM trusts the server |

Rules the code enforces:

* The three fields hold **PEM content**, **not file paths**. Read the files yourself
  (`Files.readString(Path.of(...))`). Something that is not PEM - typically a path - makes
  `GrpcChannels` throw `IllegalArgumentException` before any connection is attempted.
* `grpcClientCert` and `grpcClientKey` go together: setting only one makes
  `ClientConfig.Builder.build()` throw `IllegalArgumentException`. Neither set (or both empty)
  means plain server-authenticated TLS.
* `useSecureChannel(false)` with a client identity throws `IllegalArgumentException` instead of
  silently dropping the identity. A plaintext channel logs a `WARNING` naming `host:port`
  through the `java.util.logging` logger `com.ondewo.nlu.channel.GrpcChannels`; the library never
  touches your logging configuration.
* No error message and no `toString()` renders a PEM or the key (see the security notes below).
* `grpcClientKey` must be an **unencrypted PKCS#8** PEM, which is what `openssl req -newkey ... -nodes`
  (OpenSSL 3) writes. Convert a traditional EC / RSA key with
  `openssl pkcs8 -topk8 -nocrypt -in old.key -out client.key`.
* The server certificate is verified against `grpcCert` (the JVM's default trust store when it is
  empty), and the host you connect to must match one of the certificate's subject alternative
  names (SAN). When you connect by an IP the certificate does not list, name the host to check
  with `overrideAuthority(...)` on the builder.
* A bare IPv6 literal host is bracketed for you (`::1` → `[::1]:50051`).

```java
import com.ondewo.nlu.channel.ClientConfig;
import com.ondewo.nlu.channel.GrpcChannels;
import io.grpc.ManagedChannel;
import java.nio.file.Files;
import java.nio.file.Path;

ClientConfig config = ClientConfig.builder()
    .host("10.0.0.5")
    .port(50051)
    .grpcCert(Files.readString(Path.of("certs/ca.pem")))
    .grpcClientCert(Files.readString(Path.of("certs/client.pem")))   // leave both out for
    .grpcClientKey(Files.readString(Path.of("certs/client.key")))    // server-authenticated TLS
    .build();

ManagedChannel channel = GrpcChannels.newChannelBuilder(config)
    .overrideAuthority("nlu.example.internal")   // only when connecting by an IP the SAN lacks
    .build();
```

`GrpcChannels.newChannel(config)` is the short form without extra settings. One channel serves
every stub of every service of this client: build it once, share it, and shut it down at the end.

### Channel defaults

`GrpcChannels` applies the channel options of the ONDEWO Python clients where grpc-java exposes
them, and documents where it cannot:

| Python client (grpc-core)                                         | Java client (grpc-java)                                            |
|-------------------------------------------------------------------|--------------------------------------------------------------------|
| `keepalive_time_ms=30000`                                         | `keepAliveTime` **5 minutes** - see below                          |
| `keepalive_timeout_ms=20000`, `http2.ping_timeout_ms=20000`       | `keepAliveTimeout` 20 s: how long grpc-java waits for the ping ack |
| `keepalive_permit_without_calls=0`                                | `keepAliveWithoutCalls(false)`                                     |
| `http2.max_pings_without_data=2`                                  | not available in grpc-java                                         |
| `max_reconnect_backoff_ms=5000`                                   | not available in grpc-java's public API (its default backoff caps at 120 s) |
| max receive / send message length `2^31-1`                        | `maxInboundMessageSize(Integer.MAX_VALUE)`; grpc-java has no send limit |
| retry policy for idempotent methods                               | none configured: only gRPC's transparent retries                   |

Why 5 minutes and not 30 seconds: the Python clients stop pinging after two pings without data
(`http2.max_pings_without_data=2`), and grpc-java has no such limit. A grpc-java client pinging
every 30 s keeps pinging a stream on which nothing is sent, and a default grpc-core server (every
ONDEWO Python server) answers the third such ping with a `too_many_pings` GOAWAY - measured
against a grpcio 1.81 server: a server stream silent for 170 s failed with
`UNAVAILABLE: Too many pings` after 150 s at 30 s, and one silent for 640 s completed at 5 minutes.
Five minutes is the ping rate a default grpc-core or grpc-go server accepts without data, so the
keepalive still detects a dead connection under an active call without ever tearing down a
healthy one. A server that permits faster pings can be paired with a shorter `keepAliveTime` on
the builder.

### A test PKI with openssl

A CA, a server certificate with SANs, and a client certificate with the `clientAuth` extended key
usage. For tests only: the keys are unencrypted.

```bash
openssl req -x509 -newkey ec -pkeyopt ec_paramgen_curve:prime256v1 -nodes -days 365 \
  -subj "/CN=Test CA" -keyout ca.key -out ca.pem

printf 'subjectAltName=DNS:localhost,IP:127.0.0.1\nextendedKeyUsage=serverAuth\n' > server.ext
openssl req -newkey ec -pkeyopt ec_paramgen_curve:prime256v1 -nodes \
  -subj "/CN=localhost" -keyout server.key -out server.csr
openssl x509 -req -in server.csr -CA ca.pem -CAkey ca.key -CAcreateserial -days 365 \
  -extfile server.ext -out server.pem

printf 'extendedKeyUsage=clientAuth\n' > client.ext
openssl req -newkey ec -pkeyopt ec_paramgen_curve:prime256v1 -nodes \
  -subj "/CN=my-client" -keyout client.key -out client.csr
openssl x509 -req -in client.csr -CA ca.pem -CAkey ca.key -CAcreateserial -days 365 \
  -extfile client.ext -out client.pem

chmod 600 *.key
openssl verify -CAfile ca.pem server.pem client.pem
```

The client then uses `ca.pem` / `client.pem` / `client.key`; a server that requires client
certificates uses `server.pem` / `server.key` and trusts `ca.pem` for its clients. The test suite
builds the same PKI in memory at test time (`TestPki`), so no key is ever committed.

### TLS security notes

* `ClientConfig.toString()` shows `grpcClientKey` as `***REDACTED***` (empty when unset) and the
  certificates only as their length, so logging a config never leaks the key.
  `getGrpcClientKey()` returns the key in clear text: never log it.
* `ClientConfig` has no serialized form. Keep the key out of configuration files and source
  control; load it from a file with mode `0600` or a secret store at startup.
* `BearerToken` keeps the access token in memory only and does not render it in `toString()`.

### TLS troubleshooting

A failed handshake surfaces as `StatusRuntimeException` with status `UNAVAILABLE` (description
`ssl exception` or `io exception`); the cause chain names the reason:

* **`PKIX path building failed` / `unable to find valid certification path to requested target`**:
  `grpcCert` is not the CA that issued the server certificate, the server does not send its
  intermediate certificates, or `grpcCert` is empty and the JVM trust store does not know the CA.
* **`No subject alternative names matching IP address ...` / `No name matching ... found`**: the
  host you connect to is not in the server certificate's SAN. Connect by a name in the SAN, add
  the SAN, or set `overrideAuthority(...)`.
* **`TLSV1_ALERT_CERTIFICATE_REQUIRED`** (or another alert) against a server that requires client
  certificates: no client certificate was presented, or one the server's CA did not issue. Set
  `grpcClientCert` / `grpcClientKey` to an identity that CA signed.
* **`IllegalArgumentException: GrpcChannels: could not create the channel to ...`** with the cause
  `No certificate data found`, `Input stream not contain valid certificates` or
  `Input stream does not contain valid private key`: a field holds a file path or other non-PEM
  text, or the key is encrypted or not PKCS#8. Pass `Files.readString(...)` of the PEM file.

## Repository structure

```
.
├── ondewo-nlu-api/               <----- submodule: the .proto definitions (input)
├── ondewo-proto-compiler/    <----- submodule: the code generator (pinned to a release tag)
├── src/
│   └── main/java/            <----- generated stubs (committed), plus hand-written sources
├── pom.xml                   <----- hand-maintained build descriptor; `make` writes its version
├── target/                   <----- build output (git-ignored)
├── .m2/                      <----- maven cache of the utils image (git-ignored)
├── Makefile                  <----- every workflow: build, test, release
├── Dockerfile.utils          <----- the utils image: maven, JDK, gpg, gh
├── maven-central-settings.xml <---- publishing settings; holds env references, no credential
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
1. `build_compiler` — `chmod -R a+rX ondewo-proto-compiler/java` (see the `--user` note below),
   then `cd ondewo-proto-compiler/java && sh build.sh`, which builds the
   `ondewo-java-proto-compiler:latest` image. The image tag is the only contract; any locally
   built image with that tag is used.
1. `generate_ondewo_protos` — the single `docker run` below, wrapped so that the hand-maintained
   `pom.xml` survives it (see below), followed by `update_pom_version`.
1. `check_build` — asserts that every `.proto` produced java code.
1. `package_via_docker` — `mvn -DskipTests package` against `pom.xml`, inside the
   `ondewo-nlu-client-utils-java` image (`Dockerfile.utils`), so no local JDK or maven is needed.

The generation step is exactly the contract documented in
`ondewo-proto-compiler/java/example/run-compile.sh`:

```bash
docker run --rm --user $(id -u):$(id -g) \
  -e HOME=/tmp -e TEMP_SRC_DIRECTORY=/tmp/src \
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
  freeze the library version at whatever that file says.
* **The output volume is the repository root**, which is precisely the maven project the image
  emits. Expect a loud `WARNING: ... pom.xml ... is about to be OVERWRITTEN` on every run: the
  image writes its rendered template over `pom.xml`, which lacks the hand-written test, coverage,
  javadoc, Maven Central and signing configuration. `make generate_ondewo_protos` therefore saves
  `pom.xml` before the run and restores it afterwards, and `update_pom_version` writes
  `ONDEWO_NLU_VERSION` into it. The rendered template is used for one check only: when its
  toolchain pins (`maven.compiler.release`, `grpc.version`, `protobuf.version`,
  `google.common.protos.version`) differ from the ones in `pom.xml`, the run fails and prints
  both, because the stubs were generated for the rendered ones — copy them into `pom.xml`.
* **The container runs as the invoking user** (`--user`), so nothing it writes is root-owned
  and no `sudo` is needed. `TEMP_SRC_DIRECTORY` moves the image's scratch copy of the input out
  of the root-owned `/image-data` to `/tmp`. The scripts in `/image-data` keep the file modes of
  the submodule checkout, so `build_compiler` makes them world-readable first; under a
  restrictive umask (`umask 077`) they would otherwise be unreadable for that user.
* **Generation needs no network** once the image exists: the maven build inside the container
  runs offline against a repository pre-warmed at image-build time.

### Hand-written code beside the stubs

The image deletes only the *leaf* java packages it regenerates, so hand-written classes survive
a regeneration as long as they live in their own package (for example
`src/main/java/com/ondewo/nlu/auth/`). Two rules follow from the pipeline:

* Never put a hand-written class in a package that holds generated stubs — it is deleted on the
  next run.
* Hand-written code compiles against `pom.xml`, which declares gRPC, protobuf and nothing else at
  runtime (`java.net.http` covers HTTP/token work). An extra dependency goes into `pom.xml`, which
  a regeneration keeps; the image's own offline build compiles the generated stubs only.

## Testing

```bash
make test          # check_build + mvn verify (suite + coverage gate)
make test_via_docker   # the same inside the utils image - needs only Docker
mvn -B verify      # the same without the submodule-dependent check_build
```

The JUnit 5 suite under `src/test/java` exercises the **committed** stubs — it never builds the
compiler image and never runs protoc:

| Test class | What it proves |
| --- | --- |
| `com.ondewo.nlu.stubs.GeneratedMessagesTest` | messages of both java flavours (`java_multiple_files` → `com.ondewo.nlu`, outer class → `ondewo.nlu`) survive a serialize/parse round trip, `optional` scalars keep explicit presence on the wire, enums start at their `*_UNSPECIFIED` zero value, and the proto package in the descriptor is untouched by the `java_package` rewrite |
| `com.ondewo.nlu.stubs.GeneratedServicesTest` | every generated `*Grpc` class (found on the compiled classpath, not listed by hand) exposes a usable `ServiceDescriptor`; a unary call runs end to end over the in-process transport and the real generated marshallers; all three stub flavours build against a plain target channel |
| `com.ondewo.nlu.auth.BearerTokenTest` | the hand-written `BearerToken` — validation, header shape, stub immutability |
| `com.ondewo.nlu.channel.ClientConfigTest` | `ClientConfig` validation (host, port, both-or-neither client identity, no identity on plaintext), IPv6 target bracketing, and that neither an error message nor `toString()` renders a PEM or the key |
| `com.ondewo.nlu.channel.GrpcChannelsTest` | real TLS handshakes against a Netty server on a loopback socket with a PKI generated at test time: TLS with a custom CA, mutual TLS (the server sees the client certificate), CRLF PEMs, IPv6 `[::1]`, empty identity = plain TLS; refused handshakes (no client certificate, client from an unrelated CA, wrong CA, JVM trust store against a test CA) end in `UNAVAILABLE`; plaintext logs a warning naming `host:port`; non-PEM material is refused without being echoed |
| `com.ondewo.nlu.release.ReleaseNotesTest` | every `RELEASE.md` heading uses the spelling `CURRENT_RELEASE_NOTES` slices, every section ends at its `*****` separator, and the current version has non-empty notes - so a GitHub release is never published without a body |

Coverage is measured with **JaCoCo over the hand-written sources only**
(`com/ondewo/nlu/auth/**` and `com/ondewo/nlu/channel/**`). Generated stubs are machine output and are excluded from the metric,
but they are exercised by the two test classes above. The gate is bound to `verify` and fails the
build below **100 %** instruction, branch and method coverage; the HTML report lands in
`target/site/jacoco/`.

CI runs the whole thing on `ubuntu-latest` for JDK 11 and JDK 21 on every push and pull request
— see `.github/workflows/ci.yml`. No step is conditional: a missing or truncated client turns the
run red instead of skipping.

## Release

A release runs **entirely on a maintainer's machine**, from `make ondewo_release`. CI builds and
publishes nothing: `.github/workflows/ci.yml` only lints and tests, and there is no other workflow.
The credentials live **only** in the `ondewo-devops-accounts` repository — never in a GitHub
repository or organisation secret, and never in a file of this repository. No step needs a human:
Maven Central publishes the deployment automatically, and the release waits until it has.

Versions are defined once, in the `Makefile`: `ONDEWO_NLU_VERSION` must match the
`ondewo-nlu-api` release in major and minor version, and is written into `pom.xml` by
`make update_pom_version`, which `make build` and `make ondewo_release` both run.

1. Bump `ONDEWO_NLU_VERSION` and the submodule pins in the `Makefile`.
1. Add the release entry at the top of `RELEASE.md`.
1. Run `make ondewo_release` from `master`.

`make release_all_clients` in `ondewo-nlu-api` does all three steps for this client: it clones
the repository, inserts a generated `RELEASE.md` entry, rewrites the version and the submodule
pins in the `Makefile`, and runs `make ondewo_release`.

`make ondewo_release` stops at the first failure, and everything that can be checked in advance
runs before the first push:

1. `update_pom_version`, then `spc`: the release branch and tag must not exist yet, and `pom.xml`
   must carry the version.
1. `clone_devops_accounts` + `run_release_with_devops`: reads exactly `GITHUB_GH_TOKEN` from
   `account_github.env` and `MAVEN_CENTRAL_USERNAME`, `MAVEN_CENTRAL_PASSWORD`,
   `MAVEN_GPG_KEY_B64` and `MAVEN_GPG_PASSPHRASE` from `account_maven_central.env` (anchored
   `^NAME=` matches, so the comment lines of those files never leak in), and hands them to
   `make release`.
1. `make release`:
   1. every credential is set: not empty, not a placeholder (`check_release_credentials`);
   1. every credential is accepted, proven read-only in the utils image
      (`validate_release_credentials_via_docker_image`): GitHub reports `permissions.push=true` on
      this repository for the token; the Central Portal accepts the user token and reports this
      version as not yet published; the signing key decodes to an ASCII-armoured secret key that
      signs a probe file with the passphrase;
   1. `RELEASE.md` has an entry for the version;
   1. `make build`, the pre-commit hooks, `check_build`, `check_central_pom` and the Maven
      Central dry run (see below);
   1. commit, push `master`, then push the branch `release/<version>` and the tag `<version>`;
   1. the Maven Central deployment (`push_to_maven_central_via_docker`), the only upload there is:
      signed with the release key, published automatically, and waited for until Central reports
      it `PUBLISHED`;
   1. the GitHub release with the release notes, **last** (the jars are distributed by Maven
      Central). A GitHub release therefore always means the version is complete everywhere.

Every step that needs maven, the JDK, gpg, curl or the GitHub CLI runs in the
`ondewo-nlu-client-utils-java` image (`Dockerfile.utils`, built by `make build_utils_docker_image`),
with the repository mounted and as the invoking user, so the release host needs only GNU Make,
git with ssh access to GitHub and Bitbucket, Docker and perl.

`make release` is the step `run_release_with_devops` calls with those five values; run
`make ondewo_release`, not `make release`.

### If a release stops after the tag

Once the tag is pushed, `make spc` refuses to run the release again. Look at what exists, then
run only the step that is still missing:

| Stopped in | What exists | What to do |
| --- | --- | --- |
| `push_to_maven_central_via_docker`: failed before the upload, or the Portal rejected the deployment (`FAILED`) | nothing on Maven Central | fix the cause and re-run that step, then the GitHub release step; a defect in the tagged tree needs a new patch version instead |
| `push_to_maven_central_via_docker`: not `PUBLISHED` within `waitMaxTime` (3600 s) | the Portal may still publish it | wait until `https://repo1.maven.org/maven2/com/ondewo/ondewo-nlu-client-java/<version>/` lists it, then run only the GitHub release step — never upload the version a second time |
| `release_to_github_via_docker_image` | the version is on Maven Central, no GitHub release | re-run that step |

Both steps take their credentials from `ondewo-devops-accounts`, exactly as
`run_release_with_devops` does, from the checkout the release left behind:

```bash
make clone_devops_accounts
make push_to_maven_central_via_docker $(grep -hE '^(MAVEN_CENTRAL_USERNAME|MAVEN_CENTRAL_PASSWORD|MAVEN_GPG_KEY_B64|MAVEN_GPG_PASSPHRASE)=' ondewo-devops-accounts/account_maven_central.env)
make release_to_github_via_docker_image $(grep -hE '^GITHUB_GH_TOKEN=' ondewo-devops-accounts/account_github.env)
rm -rf ondewo-devops-accounts
```

## Publishing to Maven Central

The artifact is published to Maven Central through the
[Sonatype Central Portal](https://central.sonatype.com), by `make release` and nothing else. The
`release` profile of `pom.xml` sets `autoPublish=true` and `waitUntil=published`: the Portal
validates the deployment and publishes it without a human, and the upload step returns only once
Central reports the version `PUBLISHED`. A rejected deployment, or one that is not published within
`waitMaxTime=3600` seconds, fails the release before the GitHub release is created. A published
version can never be replaced or withdrawn, which is why everything that can be checked is checked
before the tag is pushed.

### What is checked, and when

| When | What |
| --- | --- |
| Every push (CI) | `mvn verify` on JDK 11 and 21 — the test suite, the coverage gate and the javadoc build. No credential, no signing, no upload. |
| `make release`, before anything is pushed | `validate_release_credentials_via_docker_image` — the GitHub token may push, the Central user token is accepted and the version is not published yet, the signing key signs with its passphrase. `check_central_pom` — the pom carries every field the Portal validates. `dry_run_maven_central_via_docker` — builds with the `release` profile, signs everything with a throwaway key, verifies the signatures, and re-runs the whole build with maven offline. |
| The upload | `push_to_maven_central_via_docker` (`mvn -Prelease clean deploy` in the utils image) — the only upload: signs with the release key, uploads, publishes automatically and waits for `PUBLISHED`. |

`make dry_run_maven_central` and `make dry_run_maven_central_via_docker` need no credential and
can be run at any time.

### Credentials

Four values, kept **only** in `ondewo-devops-accounts/account_maven_central.env`. The `Makefile`
declares them with `ENTER_HERE_YOUR_...` placeholders, so a release without them fails loudly
instead of publishing.

| Name | What it is | How to obtain it |
| --- | --- | --- |
| `MAVEN_CENTRAL_USERNAME` | Username half of a Central Portal **user token** — not the portal login. | [central.sonatype.com/account](https://central.sonatype.com/account) → *Generate User Token*. |
| `MAVEN_CENTRAL_PASSWORD` | Password half of that same user token. | Same dialog; it is shown once. |
| `MAVEN_GPG_KEY_B64` | The PGP **secret** key that signs the artifacts, ASCII-armoured, then base64 on a single line. | `gpg --armor --export-secret-keys <fingerprint> \| base64 -w0` |
| `MAVEN_GPG_PASSPHRASE` | Passphrase of that key. | Chosen when the key is created. |

`MAVEN_GPG_KEY_B64` is base64-encoded because both carriers are strictly one line per variable:
an `account_*.env` line, and the `make release VAR=...` hand-off in `run_release_with_devops`. For
the upload it is decoded into `MAVEN_GPG_KEY` in the process environment immediately before maven
starts and is never written to disk. The `bc` signer of `maven-gpg-plugin` reads it from there, so
no keyring, `gpg` binary or `gpg-agent` has to exist in the publishing container. Only the
pre-push key check imports it into a temporary keyring inside its own throwaway utils container,
and deletes that keyring again.

The GitHub release uses `GITHUB_GH_TOKEN` from `ondewo-devops-accounts/account_github.env`; it
must be allowed to push to this repository.

### One-time setup (a human, once)

1. **Own the namespace.** `com.ondewo` is the reverse of `ondewo.com`, so it is ONDEWO's to
   claim. Add the namespace at
   [central.sonatype.com/publishing/namespaces](https://central.sonatype.com/publishing/namespaces)
   and complete the DNS proof: the Portal hands out a verification code that has to appear as a
   `TXT` record on `ondewo.com`. Until the namespace shows *Verified*, every upload is rejected.
2. **Create the signing key** (4096-bit RSA, with a passphrase), publish its public half to a
   keyserver Central checks, and note its fingerprint:

   ```bash
   gpg --full-generate-key
   gpg --list-secret-keys --keyid-format=long
   gpg --keyserver keyserver.ubuntu.com --send-keys <fingerprint>
   ```

   Central verifies the signature against the public key, so a key that is not on a keyserver
   fails validation even though the upload itself succeeded.
3. **Generate the user token** and store all four values in
   `ondewo-devops-accounts/account_maven_central.env`.

## Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md). Install the hooks once with
`make install_precommit_hooks`; `make precommit_hooks_run_all_files` runs them over the whole
repository.

Commit messages follow [Conventional Commits](https://www.conventionalcommits.org/); the
`giticket` hook prepends the JIRA ticket taken from the branch name, so never write the ticket
prefix yourself.

## License

Apache License 2.0 — see [LICENSE](LICENSE).

## Links

* [ONDEWO NLU API (protos)](https://github.com/ondewo/ondewo-nlu-api)
* [ONDEWO proto compiler](https://github.com/ondewo/ondewo-proto-compiler)
* [ONDEWO](https://www.ondewo.com)
