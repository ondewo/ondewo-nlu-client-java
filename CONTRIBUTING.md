# How to become a contributor and submit your own code (WIP)

## Contributor License Agreements

We'd love to accept your sample apps and patches! Before we can take them, we
have to jump a couple of legal hurdles.

Please fill out either the individual or corporate Contributor License Agreement
(CLA).

If you are an individual writing original source code and you're sure you
    own the intellectual property, then you'll need to sign an [individual CLA](TODO:).
If you work for a company that wants to allow you to contribute your work,
    then you'll need to sign a [corporate CLA](TODO:).

Follow either of the two links above to access the appropriate CLA and
instructions for how to sign and return it. Once we receive it, we'll be able to
accept your pull requests.

## Contributing A Patch

1. Submit an issue describing your proposed change to the repo in question.
1. The repo owner will respond to your issue promptly.
1. If your proposed change is accepted, and you haven't already done so, sign a
   Contributor License Agreement (see details above).
1. Fork the desired repo, develop and test your code changes.
1. Ensure that your code adheres to the existing style in the sample to which
   you are contributing.
1. Ensure that your code has an appropriate set of unit tests which all pass.
1. Submit a pull request.

## Working in this repository

Set up your machine once:

```bash
make setup_developer_environment_locally   # submodules + pre-commit hooks
```

Before you open a pull request:

```bash
make precommit_hooks_run_all_files   # markdownlint + hygiene hooks
make test                            # check_build + the maven test suite
```

Things to keep in mind:

* **Almost nothing here is hand-written.** `src/main/java` and `pom.xml` are produced by the
  `ondewo-java-proto-compiler` image. A change to the generated code belongs in
  [ondewo-nlu-api](https://github.com/ondewo/ondewo-nlu-api) (the protos) or in
  [ondewo-proto-compiler](https://github.com/ondewo/ondewo-proto-compiler) (the generator) - never
  in the generated files, which the next `make build` overwrites.
* **Hand-written classes live in their own java package** (for example
  `src/main/java/com/ondewo/nlu/auth/`). The generator deletes only the leaf packages it
  regenerates, so a class placed in a package that holds stubs disappears on the next run. It must
  also compile against the generated `pom.xml`, which declares gRPC and protobuf and nothing else.
* **Versions are bumped in the `Makefile`**, never in `pom.xml`: `ONDEWO_NLU_VERSION`
  is written into the descriptor by the next `make build`, and must match the `ondewo-nlu-api` release
  in major and minor version.
* **Commit messages** follow [Conventional Commits](https://www.conventionalcommits.org/)
  (`feat: ...`, `fix(scope): ...`, `docs: ...`). The `giticket` hook prepends the JIRA ticket taken
  from the branch name, so do not write the `[OND...-...]` prefix yourself - it would be duplicated.
