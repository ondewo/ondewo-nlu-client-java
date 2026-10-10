package com.ondewo.nlu.release;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Release credentials never reach a process command line. {@code /proc/<pid>/cmdline} is
 * readable by every user on the release host, so a secret on the argv of make, {@code sh -c},
 * docker or any other program is visible for the life of that process. make expands
 * {@code $(NAME)} and {@code ${NAME}} in a recipe BEFORE the shell runs, so a recipe reads a
 * secret as {@code $$NAME}, which the shell expands from the exported environment.
 */
class ReleaseMakefileHygieneTest {

    private static final String SECRET_NAMES =
            "(?:GITHUB_GH_TOKEN|MAVEN_CENTRAL_USERNAME|MAVEN_CENTRAL_PASSWORD"
                    + "|MAVEN_GPG_KEY_B64|MAVEN_GPG_KEY|MAVEN_GPG_PASSPHRASE)";

    private static String makefile;
    private static List<String> workflowLines;

    @BeforeAll
    static void read() throws IOException {
        makefile = new String(Files.readAllBytes(Paths.get("Makefile")), StandardCharsets.UTF_8);
        workflowLines = new ArrayList<>();
        final Path workflows = Paths.get(".github", "workflows");
        if (Files.isDirectory(workflows)) {
            try (Stream<Path> files = Files.list(workflows)) {
                for (final Path file : files.collect(Collectors.toList())) {
                    workflowLines.addAll(Files.readAllLines(file, StandardCharsets.UTF_8));
                }
            }
        }
    }

    private static String recipe(final String target) {
        final int start = makefile.indexOf("\n" + target + ":");
        assertTrue(start >= 0, "no target " + target);
        final int end = makefile.indexOf("\n\n", start + 1);
        return makefile.substring(start, end < 0 ? makefile.length() : end);
    }

    /** Recipe lines, without the {@code $(filter-out PLACEHOLDER,$(NAME))} checks of the TEST target. */
    private static List<String> recipeLines() {
        return Stream.of(makefile.split("\n"))
                .filter(line -> line.startsWith("\t"))
                .map(line -> line.replaceAll("\\$\\(filter-out [^,]*,\\$\\(" + SECRET_NAMES + "\\)\\)", ""))
                .collect(Collectors.toList());
    }

    @Test
    void makeNeverExpandsASecretIntoARecipeLine() {
        final Pattern expansion = Pattern.compile("(?<!\\$)\\$[{(]" + SECRET_NAMES + "[})]");
        assertEquals(
                List.of(),
                recipeLines().stream()
                        .filter(line -> expansion.matcher(line).find())
                        .collect(Collectors.toList()));
    }

    @Test
    void theDevopsReleaseHandsTheCredentialsOverTheEnvironment() {
        final String recipe = recipe("run_release_with_devops");
        assertFalse(recipe.contains("$(info)"), "make release $(info) puts every credential on argv");
        assertFalse(recipe.contains("$(shell"), "a $(shell ...) credential lands in a recipe line");
        assertTrue(recipe.contains("set -a"));
        assertTrue(Pattern.compile("\\$\\(MAKE\\) release\\s*$").matcher(recipe).find());
        assertTrue(recipe.contains("grep -hE '^GITHUB_GH_TOKEN='"), "the token grep is not anchored");
        assertTrue(
                recipe.contains(
                        "grep -hE '^(MAVEN_CENTRAL_USERNAME|MAVEN_CENTRAL_PASSWORD"
                                + "|MAVEN_GPG_KEY_B64|MAVEN_GPG_PASSPHRASE)='"),
                "the Maven Central grep is not anchored");
    }

    @Test
    void noMakeInvocationGetsASecretAsAnArgument() {
        final Pattern argument =
                Pattern.compile("(?:\\$\\(MAKE\\)|\\bmake)\\b[^\\n]*\\b" + SECRET_NAMES + "=");
        assertFalse(argument.matcher(makefile).find());
    }

    @Test
    void dockerRunForwardsSecretsByNameOnly() {
        assertFalse(
                Pattern.compile("(?:-e|--env)[ =]" + SECRET_NAMES + "=").matcher(makefile).find(),
                "docker run -e NAME=<value> puts the value on docker's argv");
        for (final String name :
                new String[] {
                    "GITHUB_GH_TOKEN",
                    "MAVEN_CENTRAL_USERNAME",
                    "MAVEN_CENTRAL_PASSWORD",
                    "MAVEN_GPG_KEY_B64",
                    "MAVEN_GPG_PASSPHRASE"
                }) {
            assertTrue(
                    Pattern.compile("-e " + name + "\\b(?!=)").matcher(makefile).find(),
                    name + " is not forwarded to the utils image by name");
        }
    }

    @Test
    void workflowsNeverInterpolateASecretIntoACommandLine() {
        final Pattern envMapping = Pattern.compile("^\\s*[A-Za-z_][A-Za-z0-9_]*:\\s*\\$\\{\\{\\s*secrets\\.");
        assertEquals(
                List.of(),
                workflowLines.stream()
                        .filter(line -> line.contains("secrets."))
                        .filter(line -> !envMapping.matcher(line).find())
                        .collect(Collectors.toList()));
    }
}
