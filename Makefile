export

# =====================================================================================
# ondewo-nlu-client-java - Makefile
#
# The ONDEWO NLU (Natural Language Understanding) gRPC client for java.
#
# This repository holds NO hand-written protocol code: the whole library - the maven
# build descriptor (pom.xml), the generated stubs under src/main/java and the packaged
# jar in target/ - is produced by the ondewo-java-proto-compiler docker image from the
# protos of the ondewo-nlu-api submodule.
#
# Quick start:
#   make help                    # list every documented target
#   make makefile_chapters       # list the section headers below
#   make build                   # submodules -> compiler image -> stubs -> jar
#   make test                    # check_build + the maven test suite
#
# Versioning: ONDEWO_NLU_VERSION (below) is the single source of truth. It is
# passed to the compiler image as the maven <version> of the generated library, so the
# pom.xml is rewritten from it on every generation - never edit the pom's version by hand.
# =====================================================================================

# ---------------- BEFORE RELEASE ----------------
# 1 - Update Version Number
# 2 - Update RELEASE.md
# 3 - make build
# -------------- Release Process Steps --------------
# 1 - Get Credentials from devops-accounts repo
# 2 - Create Release Branch and push
# 3 - Create Release Tag and push
# 4 - GitHub Release (the built jars are attached as release assets)
# 5 - Maven Central upload (signed; it then waits in the Portal for a human to press Publish)

########################################################
# 		Variables
########################################################

# MUST BE THE SAME AS THE API in Major and Minor Version Number
# example: API 2.9.0 --> Client 2.9.X
ONDEWO_NLU_VERSION=7.1.0

# Submodule pins. Both are checked out by `make checkout_defined_submodule_versions`, which
# every `make build` runs first, so a build can never silently use whatever the submodule
# happened to be left at.
ONDEWO_NLU_API_GIT_BRANCH=tags/7.1.0
ONDEWO_PROTO_COMPILER_GIT_BRANCH=tags/5.15.0

# You need to setup an access token at https://github.com/settings/tokens - permissions are important
GITHUB_GH_TOKEN?=ENTER_YOUR_TOKEN_HERE

# --- Maven Central (Sonatype Central Portal) credentials
# All four come from ondewo-devops-accounts/account_maven_central.env at release time (see
# run_release_with_devops) and are never written into a file in this repository. `export` at
# the top of this Makefile puts them into the recipe environment, which is how they reach the
# publishing container as bare `docker run -e NAME` forwards - so no secret is ever spelled
# out on a command line.
#
# The two halves of a Central Portal USER TOKEN (https://central.sonatype.com/account ->
# "Generate User Token"), NOT the portal login.
MAVEN_CENTRAL_USERNAME?=ENTER_HERE_YOUR_MAVEN_CENTRAL_USERNAME
MAVEN_CENTRAL_PASSWORD?=ENTER_HERE_YOUR_MAVEN_CENTRAL_PASSWORD
# The PGP secret key Central verifies every artifact against, base64 of
# `gpg --armor --export-secret-keys <fingerprint>`. Base64 because an account_*.env file and
# the `make release VAR=...` hand-off below are both strictly one line per variable, and an
# armored key is not. Its PUBLIC half has to be on a keyserver - see README.md.
MAVEN_GPG_KEY_B64?=ENTER_HERE_YOUR_MAVEN_GPG_KEY_B64
MAVEN_GPG_PASSPHRASE?=ENTER_HERE_YOUR_MAVEN_GPG_PASSPHRASE

# --- Directories
ONDEWO_API_DIR=ondewo-nlu-api
ONDEWO_PROTO_COMPILER_DIR=ondewo-proto-compiler
# The protos to compile. Every ONDEWO api repository keeps them below a single top-level
# `ondewo/` tree, which is what TARGET_PROTOS_SUBDIR scopes the compilation to (an unscoped
# run over a root that spans several top-level trees is refused by the image, on purpose).
TARGET_PROTOS_SUBDIR=ondewo
ONDEWO_PROTOS_DIR=${ONDEWO_API_DIR}/${TARGET_PROTOS_SUBDIR}
# The vendored googleapis tree. The java image gives protoc a SINGLE -I root (the api
# directory), so `import "google/api/annotations.proto"` only resolves when that tree sits at
# <api>/google. Products whose api repository keeps it elsewhere (ondewo-survey-api vendors it
# as googleapis/google) override this variable; the tree is then bind-mounted into the input
# volume at the path protoc expects. Empty for an api that only imports well-known types.
GOOGLE_APIS_DIR=${ONDEWO_API_DIR}/google
# Generated java source root (standard maven layout) - also where hand-written sources live.
STUBS_DIR=src/main/java

# --- The compiler image and the maven coordinates of the generated library
# The image TAG is the only contract with ondewo-proto-compiler: `make build_compiler`
# rebuilds it from the submodule, but any locally built ondewo-java-proto-compiler:latest works.
PROTO_COMPILER_IMAGE=ondewo-java-proto-compiler
MAVEN_GROUP_ID=com.ondewo
MAVEN_ARTIFACT_ID=ondewo-nlu-client-java

# --- Publishing
# The image the release upload runs in, so a release never depends on whatever JDK/maven the
# maintainer happens to have. Same maven and JDK as the proto compiler image builds with.
MAVEN_PUBLISH_IMAGE=maven:3.9-eclipse-temurin-21
# A settings.xml that holds no credential: it interpolates ${env.MAVEN_CENTRAL_*} at run time.
MAVEN_CENTRAL_SETTINGS=maven-central-settings.xml

# Terminate on the ***** separator that delimits release entries, NOT on /\*\*/ - that matches
# the first markdown **bold** span inside the entry and silently truncates the notes there,
# with no error from `gh release create`.
CURRENT_RELEASE_NOTES=`cat RELEASE.md \
	| perl -ne 'print if /Release ONDEWO NLU Java Client ${ONDEWO_NLU_VERSION}/../^\*{5}/'`

GH_REPO="https://github.com/ondewo/ondewo-nlu-client-java"
DEVOPS_ACCOUNT_GIT="ondewo-devops-accounts"
DEVOPS_ACCOUNT_DIR="./${DEVOPS_ACCOUNT_GIT}"

# Console colors for [INFO] / [SUCCESS] / [WARN] / [ERROR] messages
BLUE   := \033[1;34m
GREEN  := \033[0;32m
YELLOW := \033[1;33m
RED    := \033[0;31m
NC     := \033[0m

.DEFAULT_GOAL := help

########################################################
#       ONDEWO Standard Make Targets
########################################################

setup_developer_environment_locally: update_submodules install_precommit_hooks ## Sets up local development environment

install_precommit_hooks: ## Installs pre-commit hooks and sets them up for the ondewo-nlu-client-java repo
	pip install pre-commit
	pre-commit install
	pre-commit install --hook-type commit-msg

precommit_hooks_run_all_files: ## Runs all pre-commit hooks on all files and not just the changed ones
	pre-commit run --all-files

help: ## Print usage info about help targets
	# (first comment after target starting with double hashes ##)
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' Makefile | sort | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-40s\033[0m %s\n", $$1, $$2}'

makefile_chapters: ## Shows all sections of Makefile
	@echo `cat Makefile| grep "########################################################" -A 1 | grep -v "########################################################"`

TEST: ## Prints some important variables
	@echo "Release Notes: \n \n$(CURRENT_RELEASE_NOTES)"
	@echo "GH Token: \t $(if $(filter-out ENTER_YOUR_TOKEN_HERE,$(GITHUB_GH_TOKEN)),<set>,<unset>)"
	@echo "Central Token: \t $(if $(filter-out ENTER_HERE_YOUR_MAVEN_CENTRAL_USERNAME,$(MAVEN_CENTRAL_USERNAME)),<set>,<unset>) / $(if $(filter-out ENTER_HERE_YOUR_MAVEN_CENTRAL_PASSWORD,$(MAVEN_CENTRAL_PASSWORD)),<set>,<unset>)"
	@echo "Signing Key: \t $(if $(filter-out ENTER_HERE_YOUR_MAVEN_GPG_KEY_B64,$(MAVEN_GPG_KEY_B64)),<set>,<unset>) / $(if $(filter-out ENTER_HERE_YOUR_MAVEN_GPG_PASSPHRASE,$(MAVEN_GPG_PASSPHRASE)),<set>,<unset>)"
	@echo "Maven Artifact: \t ${MAVEN_GROUP_ID}:${MAVEN_ARTIFACT_ID}:${ONDEWO_NLU_VERSION}"
	@echo "Api Submodule: \t ${ONDEWO_API_DIR} @ ${ONDEWO_NLU_API_GIT_BRANCH}"
	@echo "Proto Compiler: \t ${ONDEWO_PROTO_COMPILER_DIR} @ ${ONDEWO_PROTO_COMPILER_GIT_BRANCH}"

check_build: ## Checks if all built proto-code is there
# protoc derives the outer class name from the proto FILE name (snake_case -> CamelCase) and
# appends "OuterClass" when a message shares that name, so the generated file is matched by
# the <CamelCase>*.java glob in either case - and also when the proto sets its own
# java_outer_classname (e.g. entity_type.proto -> EntityTypeProto.java).
	@test -d ${ONDEWO_PROTOS_DIR} || { echo "$(RED)[ERROR]$(NC) '${ONDEWO_PROTOS_DIR}' is missing - run 'make update_submodules' first"; exit 1; }
	@test -d ${STUBS_DIR} || { echo "$(RED)[ERROR]$(NC) '${STUBS_DIR}' is missing - run 'make generate_ondewo_protos' first"; exit 1; }
	@find ${ONDEWO_PROTOS_DIR} -type f -name "*.proto" ! -path "*/google/*" -exec basename {} .proto \; \
		| sort -u \
		| while IFS= read -r proto; do \
			outer=$$(echo "$$proto" | awk -F_ '{ o=""; for (i=1;i<=NF;i++) o = o toupper(substr($$i,1,1)) substr($$i,2); print o }'); \
			if [ -z "$$(find ${STUBS_DIR} -type f -name "$$outer*.java" | head -n 1)" ]; then \
				echo "$(RED)[ERROR]$(NC) No java code for $$proto.proto (expected $$outer*.java below ${STUBS_DIR})"; \
				exit 1; \
			fi; \
		done
	@echo "$(GREEN)[SUCCESS]$(NC) every .proto has generated java code"

########################################################
#       Repo Specific Make Targets
########################################################
#		Build

build: update_submodules checkout_defined_submodule_versions build_compiler generate_ondewo_protos check_build package ## Build the client: submodules -> compiler image -> stubs -> jar

build_compiler: ## Build the ondewo-java-proto-compiler docker image from the submodule
	@echo "$(BLUE)[INFO]$(NC) Building the ${PROTO_COMPILER_IMAGE} image from ${ONDEWO_PROTO_COMPILER_DIR} ..."
	cd ${ONDEWO_PROTO_COMPILER_DIR}/java && sh build.sh
	@echo "$(GREEN)[SUCCESS]$(NC) Built ${PROTO_COMPILER_IMAGE}:latest"

# The docker run below is the java image's documented contract, taken from
# ondewo-proto-compiler/java/example/run-compile.sh:
#
#   docker run -v <in>:/input-volume -v <out>:/output-volume ondewo-java-proto-compiler \
#              <relative_protos_dir> [<target_subdir>] [<group_id>] [<artifact_id>] [<version>]
#
# * NO `-it`: it breaks every non-interactive caller with "cannot attach stdin to a TTY-enabled
#   container because stdin is not a terminal". `-it` belongs only on the --entrypoint /bin/bash
#   debug form (see README.md).
# * Input volume: ONLY the api submodule (plus this repo's LICENSE, so the packaged library
#   ships it instead of the image's default). Mounting the whole repository would copy a
#   previously generated pom.xml into the container, where it WINS over the rendered template -
#   and the library version would then silently freeze at whatever that file already said.
# * Output volume: the repository root, which is exactly the maven project the image emits
#   (pom.xml + src/main/java + target/*.jar). The image removes only the leaf packages it
#   regenerates, so hand-written sources in their own package survive - see README.md.
# * The container runs as root (it writes into the root-owned /image-data inside the image),
#   so the output is root-owned; `fix_ownership` hands it back.
generate_ondewo_protos: ## Generate java gRPC stubs + the maven project from the proto files
	@test -d ${ONDEWO_PROTOS_DIR} || { echo "$(RED)[ERROR]$(NC) '${ONDEWO_PROTOS_DIR}' is missing - run 'make update_submodules' first"; exit 1; }
	@echo "$(BLUE)[INFO]$(NC) Generating ${MAVEN_GROUP_ID}:${MAVEN_ARTIFACT_ID}:${ONDEWO_NLU_VERSION} from ${ONDEWO_PROTOS_DIR} ..."
	docker run --rm \
		-v ${shell pwd}/${ONDEWO_API_DIR}:/input-volume/${ONDEWO_API_DIR} \
		$(if $(wildcard ${GOOGLE_APIS_DIR}),-v ${shell pwd}/${GOOGLE_APIS_DIR}:/input-volume/${ONDEWO_API_DIR}/google,) \
		-v ${shell pwd}/LICENSE:/input-volume/LICENSE \
		-v ${shell pwd}:/output-volume \
		${PROTO_COMPILER_IMAGE} \
		${ONDEWO_API_DIR} \
		${TARGET_PROTOS_SUBDIR} \
		${MAVEN_GROUP_ID} \
		${MAVEN_ARTIFACT_ID} \
		${ONDEWO_NLU_VERSION}
	make fix_ownership
	@echo "$(GREEN)[SUCCESS]$(NC) Generated the client into ${STUBS_DIR} and pom.xml"

fix_ownership: ## Hand the generated output (written as root by the compiler image) back to the current user
	@user_id=$$(id -u); group_id=$$(id -g); \
	for path in pom.xml LICENSE ${STUBS_DIR} target; do \
		[ -e "$$path" ] || continue; \
		if [ -n "$$(find "$$path" ! -user $$user_id 2>/dev/null | head -n 1)" ]; then \
			echo "$(YELLOW)[WARN]$(NC) '$$path' is owned by another user - changing ownership to $$(id -un) (sudo may prompt) ..."; \
			sudo chown -R $$user_id:$$group_id "$$path"; \
		fi; \
	done

package: ## Compile the generated stubs and package the jar locally (needs a JDK >= 11 and maven)
	@test -f pom.xml || { echo "$(RED)[ERROR]$(NC) no pom.xml - it is generated, run 'make build' first"; exit 1; }
	mvn -B --no-transfer-progress -DskipTests package

# `verify`, not `test`: the jacoco coverage gate on the hand-written sources is bound to the
# verify phase, so `mvn test` alone would run the suite but skip the gate - and local and CI
# would disagree about what "the tests pass" means.
test: check_build ## Run the java test suite + the coverage gate, and verify every proto produced java code
	@test -f pom.xml || { echo "$(RED)[ERROR]$(NC) no pom.xml - it is generated, run 'make build' first"; exit 1; }
	mvn -B --no-transfer-progress verify

clean: ## Remove the local maven build output (never touches the generated sources)
	rm -rf target

########################################################
#		Submodules

update_submodules: ## Initialize and update all submodules
	@echo "START initializing submodules ..."
	git submodule update --init --recursive
	@echo "DONE initializing submodules"

checkout_defined_submodule_versions: ## Check out the submodule versions pinned above
	@echo "START checking out submodules ..."
	git -C ${ONDEWO_API_DIR} fetch --all
	git -C ${ONDEWO_API_DIR} checkout ${ONDEWO_NLU_API_GIT_BRANCH}
	git -C ${ONDEWO_PROTO_COMPILER_DIR} fetch --all
	git -C ${ONDEWO_PROTO_COMPILER_DIR} checkout ${ONDEWO_PROTO_COMPILER_GIT_BRANCH}
	@echo "DONE checking out submodules"

########################################################
#		Release

release: ## Automate the entire release process
	@echo "Start Release"
# FIRST, before anything is built, branched or tagged: a release that cannot reach Maven
# Central has to fail while it is still a no-op, not after the tag is pushed.
	make check_maven_central_credentials
	make build
	-make precommit_hooks_run_all_files
	make check_build
	git status
# src/ carries both the generated stubs and any hand-written sources beside them; pom.xml is a
# BUILD OUTPUT (rendered by the compiler image from the version above), and is staged so the
# tag always contains the descriptor the jar was built from.
	git add src
	git add pom.xml
	git add Makefile
	git add README.md
	git add RELEASE.md
	git add LICENSE
	git add ${ONDEWO_PROTO_COMPILER_DIR}
	git add ${ONDEWO_API_DIR}
	git status
	-git commit --no-verify -m "Preparing for Release ${ONDEWO_NLU_VERSION}"
	git push
	make create_release_branch
	make create_release_tag
	make push_to_gh
# The tag pushed above ALSO triggers .github/workflows/release.yml, which uploads the very same
# deployment using the GitHub secrets. The two routes are alternatives, not a pipeline: use
# this one when the credentials live in ondewo-devops-accounts (make ondewo_release), and the
# workflow when they live in the repository's Actions secrets. Because the release profile
# sets autoPublish=false, a deployment that arrives twice is two entries waiting for a human
# in the Portal - visible and harmless - not two releases.
	make push_to_maven_central_via_docker
	@echo "Release Finished"

create_release_branch: ## Create Release Branch and push it to origin
	git checkout -b "release/${ONDEWO_NLU_VERSION}"
	git push -u origin "release/${ONDEWO_NLU_VERSION}"

create_release_tag: ## Create Release Tag and push it to origin
	git tag -a ${ONDEWO_NLU_VERSION} -m "release/${ONDEWO_NLU_VERSION}"
	git push origin ${ONDEWO_NLU_VERSION}

login_to_gh: ## Login to Github CLI with Access Token
	@echo $(GITHUB_GH_TOKEN) | gh auth login -p ssh --with-token

build_gh_release: ## Generate Github Release with CLI and attach the built jars
	@test -n "$(wildcard target/*.jar)" || { echo "$(RED)[ERROR]$(NC) no jar in target/ - run 'make build' first"; exit 1; }
	gh release create --repo $(GH_REPO) "$(ONDEWO_NLU_VERSION)" \
		-n "$(CURRENT_RELEASE_NOTES)" \
		-t "Release ${ONDEWO_NLU_VERSION}" \
		$(wildcard target/*.jar)

push_to_gh: login_to_gh build_gh_release ## Logs into GitHub CLI and Releases
	@echo 'Released to Github'

########################################################
#		MAVEN CENTRAL

# The single definition of the publish command, shared by the local and the containerised
# target so the two can never drift apart. `clean deploy`, never -DskipTests: this builds the
# exact artifact users will download, so it runs the suite and the coverage gate on the way.
MAVEN_CENTRAL_DEPLOY_CMD=mvn -B --no-transfer-progress -s ${MAVEN_CENTRAL_SETTINGS} -Prelease clean deploy
# The armored secret key is reconstructed into the environment right before maven starts and
# is never written to disk. MAVEN_GPG_KEY / MAVEN_GPG_PASSPHRASE are the env var names the
# maven-gpg-plugin's `bc` signer reads by default.
# Unquoted %s on purpose: this whole definition is substituted inside a single-quoted
# `sh -c '...'`, where a nested single quote would end the string.
DECODE_MAVEN_GPG_KEY=MAVEN_GPG_KEY=$$(printf %s "$$MAVEN_GPG_KEY_B64" | base64 -d); export MAVEN_GPG_KEY; unset MAVEN_GPG_KEY_B64

check_central_pom: ## Assert pom.xml carries every field and plugin the Maven Central Portal requires
# The Portal validates the pom only AFTER the whole bundle has been uploaded, so everything
# that can be checked locally is checked locally. The top-level elements are anchored at their
# indentation (two spaces = a direct child of <project>), because <name> and <url> also occur
# inside organization, licenses, developers and scm - an unanchored grep would happily pass a
# pom with no project name at all. The scm children are looked for inside the scm block only,
# for the same reason.
	@test -f pom.xml || { echo "$(RED)[ERROR]$(NC) no pom.xml - it is generated, run 'make build' first"; exit 1; }
	@missing=""; \
	for element in groupId artifactId version name description url licenses developers scm; do \
		grep -q "^  <$$element>" pom.xml || missing="$$missing <$$element>"; \
	done; \
	scm_block=$$(sed -n '/^  <scm>/,/^  <\/scm>/p' pom.xml); \
	for element in connection developerConnection url; do \
		echo "$$scm_block" | grep -q "<$$element>" || missing="$$missing <scm><$$element>"; \
	done; \
	for plugin in maven-source-plugin maven-javadoc-plugin maven-gpg-plugin central-publishing-maven-plugin; do \
		grep -q "<artifactId>$$plugin</artifactId>" pom.xml || missing="$$missing $$plugin"; \
	done; \
	if [ -n "$$missing" ]; then \
		echo "$(RED)[ERROR]$(NC) pom.xml would be rejected by Maven Central - missing:$$missing"; \
		echo "$(RED)[ERROR]$(NC) 'make generate_ondewo_protos' overwrites pom.xml - re-apply the HAND-WRITTEN blocks listed in its header comment"; \
		exit 1; \
	fi
	@echo "$(GREEN)[SUCCESS]$(NC) pom.xml carries every mandatory Maven Central field and publishing plugin"

check_maven_central_credentials: ## Fail loudly when a publishing credential is still a placeholder
# Iterates over the NAMES; each value is looked up through the environment (this Makefile
# exports everything) and is never printed, not even partially.
	@missing=""; \
	for name in MAVEN_CENTRAL_USERNAME MAVEN_CENTRAL_PASSWORD MAVEN_GPG_KEY_B64 MAVEN_GPG_PASSPHRASE; do \
		eval "value=\"\$$$$name\""; \
		case "$$value" in "" | ENTER_HERE_YOUR_*) missing="$$missing $$name";; esac; \
	done; \
	if [ -n "$$missing" ]; then \
		echo "$(RED)[ERROR]$(NC) refusing to publish - no credential for:$$missing"; \
		echo "$(RED)[ERROR]$(NC) use 'make ondewo_release', which reads ${DEVOPS_ACCOUNT_GIT}/account_maven_central.env"; \
		exit 1; \
	fi
	@echo "$(GREEN)[SUCCESS]$(NC) every Maven Central credential is set"

dry_run_maven_central: check_central_pom ## Credential-free rehearsal of the release build - signs with a throwaway key and uploads nothing
# This is what CI runs on every push. It exercises the whole packaging path a release takes -
# the release profile, the javadoc jar, the gpg signing - and it CANNOT publish, because the
# central-publishing goal is bound to `deploy` and this stops at `verify`.
#
# The key it signs with is generated here, lives in a temp GNUPGHOME that the trap deletes and
# expires in a day. It is not a credential: a green dry run proves the CONFIGURATION signs, it
# proves nothing about ONDEWO's real release key.
#
# The build runs twice, online and then with maven OFFLINE (-o). The offline pass is what
# catches the classic release-day failure: a plugin that is only ever resolved during the
# release and is therefore never proven to be resolvable at all.
	@command -v mvn >/dev/null 2>&1 || { echo "$(RED)[ERROR]$(NC) maven is not on PATH"; exit 1; }
	@command -v gpg >/dev/null 2>&1 || { echo "$(RED)[ERROR]$(NC) gpg is not on PATH - the signing rehearsal needs it"; exit 1; }
	@set -e; \
	gnupg_home=$$(mktemp -d); \
	trap 'rm -rf "$$gnupg_home"' EXIT; \
	chmod 700 "$$gnupg_home"; \
	echo "$(BLUE)[INFO]$(NC) Generating a throwaway signing key ..."; \
	GNUPGHOME="$$gnupg_home" gpg --batch --quiet --pinentry-mode loopback --passphrase dry-run-only \
		--quick-generate-key "ONDEWO Maven Central dry run <office@ondewo.com>" rsa3072 sign 1d; \
	MAVEN_GPG_KEY=$$(GNUPGHOME="$$gnupg_home" gpg --batch --quiet --pinentry-mode loopback \
		--passphrase dry-run-only --armor --export-secret-keys); export MAVEN_GPG_KEY; \
	MAVEN_GPG_PASSPHRASE=dry-run-only; export MAVEN_GPG_PASSPHRASE; \
	echo "$(BLUE)[INFO]$(NC) mvn -Prelease clean verify - builds, tests and signs, uploads nothing ..."; \
	mvn -B --no-transfer-progress -Prelease clean verify; \
	echo "$(BLUE)[INFO]$(NC) re-running the identical build with maven offline ..."; \
	mvn -B --no-transfer-progress -o -Prelease clean verify; \
	echo "$(BLUE)[INFO]$(NC) Checking the deployment bundle ..."; \
	base=target/${MAVEN_ARTIFACT_ID}-${ONDEWO_NLU_VERSION}; \
	for artifact in "$$base.jar" "$$base-sources.jar" "$$base-javadoc.jar"; do \
		test -s "$$artifact" || { echo "$(RED)[ERROR]$(NC) Maven Central requires $$artifact"; exit 1; }; \
		GNUPGHOME="$$gnupg_home" gpg --batch --quiet --verify "$$artifact.asc" "$$artifact" \
			|| { echo "$(RED)[ERROR]$(NC) $$artifact.asc is missing or does not verify"; exit 1; }; \
		echo "  signed and verified: $$artifact"; \
	done; \
	GNUPGHOME="$$gnupg_home" gpg --batch --quiet --verify "$$base.pom.asc" pom.xml \
		|| { echo "$(RED)[ERROR]$(NC) $$base.pom.asc is missing or does not verify"; exit 1; }; \
	echo "  signed and verified: pom.xml"
	@echo "$(GREEN)[SUCCESS]$(NC) the Maven Central deployment bundle builds, signs and verifies"

publish_to_maven_central: check_central_pom check_maven_central_credentials ## Sign and upload the deployment to the Central Portal (needs a local JDK + maven)
# The upload lands in the Portal as a VALIDATED but UNPUBLISHED deployment, because the release
# profile sets autoPublish=false. Releasing to Central is irreversible - a version can never be
# replaced or withdrawn - so the last step stays a deliberate human click.
	@sh -c '$(DECODE_MAVEN_GPG_KEY); $(MAVEN_CENTRAL_DEPLOY_CMD)'
	@echo "$(GREEN)[SUCCESS]$(NC) uploaded ${MAVEN_GROUP_ID}:${MAVEN_ARTIFACT_ID}:${ONDEWO_NLU_VERSION}"
	@echo "$(YELLOW)[WARN]$(NC) it is NOT public yet - open https://central.sonatype.com/publishing/deployments and press Publish"

push_to_maven_central_via_docker: check_central_pom check_maven_central_credentials ## Publish to Maven Central from the pinned maven image, so a release never depends on the local JDK
# Every secret is forwarded with the bare `-e NAME` form, which copies the value out of this
# recipe's environment: no credential is ever spelled out on a command line, and the whole
# recipe is @-prefixed so make does not echo it either.
	@docker run --rm \
		-v ${shell pwd}:/workspace -w /workspace \
		-e MAVEN_CENTRAL_USERNAME -e MAVEN_CENTRAL_PASSWORD \
		-e MAVEN_GPG_KEY_B64 -e MAVEN_GPG_PASSPHRASE \
		${MAVEN_PUBLISH_IMAGE} \
		sh -c '$(DECODE_MAVEN_GPG_KEY); $(MAVEN_CENTRAL_DEPLOY_CMD)'
	make fix_ownership
	@echo "$(GREEN)[SUCCESS]$(NC) uploaded ${MAVEN_GROUP_ID}:${MAVEN_ARTIFACT_ID}:${ONDEWO_NLU_VERSION}"
	@echo "$(YELLOW)[WARN]$(NC) it is NOT public yet - open https://central.sonatype.com/publishing/deployments and press Publish"

########################################################
#		DEVOPS-ACCOUNTS

ondewo_release: spc clone_devops_accounts run_release_with_devops ## Release with credentials from devops-accounts repo
	@rm -rf ${DEVOPS_ACCOUNT_GIT}

clone_devops_accounts: ## Clones devops-accounts repo
	if [ -d $(DEVOPS_ACCOUNT_GIT) ]; then rm -Rf $(DEVOPS_ACCOUNT_GIT); fi
	git clone git@bitbucket.org:ondewo/${DEVOPS_ACCOUNT_GIT}.git

run_release_with_devops: ## Gets Credentials from devops-repo and run release command with them
# One `grep` per variable, and every account_*.env line is a single VAR=VALUE: that is why the
# signing key is carried base64-encoded (MAVEN_GPG_KEY_B64) - a multi-line armored key could
# not survive this hand-off. The whole `make release` line is @-prefixed so the values are
# never echoed.
	$(eval info:= $(shell cat ${DEVOPS_ACCOUNT_DIR}/account_github.env | grep GITHUB_GH \
		& cat ${DEVOPS_ACCOUNT_DIR}/account_maven_central.env | grep MAVEN_CENTRAL_USERNAME \
		& cat ${DEVOPS_ACCOUNT_DIR}/account_maven_central.env | grep MAVEN_CENTRAL_PASSWORD \
		& cat ${DEVOPS_ACCOUNT_DIR}/account_maven_central.env | grep MAVEN_GPG_KEY_B64 \
		& cat ${DEVOPS_ACCOUNT_DIR}/account_maven_central.env | grep MAVEN_GPG_PASSPHRASE))
	@make release $(info)

spc: ## Checks if the Release Branch, Tag and pom.xml version already exist
	$(eval filtered_branches:= $(shell git branch --all | grep "release/${ONDEWO_NLU_VERSION}"))
	$(eval filtered_tags:= $(shell git tag --list | grep "${ONDEWO_NLU_VERSION}"))
	$(eval pom_version:= $(shell test -f pom.xml && sed -n 's|.*<version>\(.*\)</version>.*|\1|p' pom.xml | head -n 1))
	@if test "$(filtered_branches)" != ""; then echo "-- Test 1: Branch exists!!"; exit 1; else echo "-- Test 1: Branch is fine"; fi
	@if test "$(filtered_tags)" != ""; then echo "-- Test 2: Tag exists!!"; exit 1; else echo "-- Test 2: Tag is fine"; fi
	@if test "$(pom_version)" != "" && test "$(pom_version)" != "${ONDEWO_NLU_VERSION}"; then \
		echo "-- Test 3: pom.xml is at '$(pom_version)', not ${ONDEWO_NLU_VERSION} - run 'make build'!!"; exit 1; \
	else echo "-- Test 3: pom.xml is fine"; fi
