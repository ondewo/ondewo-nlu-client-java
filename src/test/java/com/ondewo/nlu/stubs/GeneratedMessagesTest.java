package com.ondewo.nlu.stubs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.protobuf.Timestamp;
import com.ondewo.nlu.AudioEncoding;
import com.ondewo.nlu.Context;
import java.util.stream.Stream;
import ondewo.nlu.AgentOuterClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Exercises the committed protoc output. These are the tests that catch a broken generator:
 * they build a message, push it through the real binary marshaller and read it back.
 *
 * <p>The ondewo protos come in two java flavours and both are covered here: those that set
 * {@code java_multiple_files} (context.proto, entity_type.proto, session.proto, common.proto)
 * produce top-level classes in {@code com.ondewo.nlu}, all the others nest their messages in
 * an outer class in {@code ondewo.nlu}.
 */
class GeneratedMessagesTest {

    @Test
    void roundTripsAMultiFileMessage() throws Exception {
        final Context original =
                Context.newBuilder()
                        .setName("welcome")
                        .setLifespanCount(5)
                        .putParameters(
                                "city",
                                Context.Parameter.newBuilder()
                                        .setName("city")
                                        .setDisplayName("City")
                                        .setValue("Vienna")
                                        .setCreatedAt(Timestamp.newBuilder().setSeconds(1_700_000_000L).build())
                                        .build())
                        .setCreatedBy("6a1b2c3d-0000-4000-8000-000000000000")
                        .build();

        final byte[] wire = original.toByteArray();
        final Context parsed = Context.parseFrom(wire);

        assertEquals(original, parsed);
        assertEquals("welcome", parsed.getName());
        assertEquals(5, parsed.getLifespanCount());
        assertEquals("Vienna", parsed.getParametersOrThrow("city").getValue());
        assertEquals(1_700_000_000L, parsed.getParametersOrThrow("city").getCreatedAt().getSeconds());
        assertTrue(wire.length > 0);
    }

    @Test
    void roundTripsAnOuterClassMessage() throws Exception {
        final AgentOuterClass.Agent original =
                AgentOuterClass.Agent.newBuilder()
                        .setParent("projects/6a1b2c3d-0000-4000-8000-000000000000/agent")
                        .setDisplayName("test-agent")
                        .setDefaultLanguageCode("de")
                        .addSupportedLanguageCodes("en")
                        .addSupportedLanguageCodes("fr")
                        .setTimeZone("Europe/Vienna")
                        .build();

        final AgentOuterClass.Agent parsed = AgentOuterClass.Agent.parseFrom(original.toByteArray());

        assertEquals(original, parsed);
        assertEquals("test-agent", parsed.getDisplayName());
        assertEquals(2, parsed.getSupportedLanguageCodesCount());
        assertEquals("fr", parsed.getSupportedLanguageCodes(1));
    }

    /**
     * {@code optional float lifespan_time = 4} in context.proto. Explicit presence is what
     * lets a client send the zero value; losing it is the exact regression that broke the
     * angular target, so it is asserted on the wire here.
     */
    @Test
    void keepsExplicitPresenceOfAnOptionalScalar() throws Exception {
        final Context unset = Context.newBuilder().setName("welcome").build();
        final Context explicitZero = Context.newBuilder().setName("welcome").setLifespanTime(0.0f).build();

        assertFalse(Context.parseFrom(unset.toByteArray()).hasLifespanTime());
        assertTrue(Context.parseFrom(explicitZero.toByteArray()).hasLifespanTime());
        assertEquals(0.0f, Context.parseFrom(explicitZero.toByteArray()).getLifespanTime());
        // An explicitly set zero has to reach the wire, an unset field must not.
        assertTrue(explicitZero.toByteArray().length > unset.toByteArray().length);
    }

    @Test
    void keepsTheProtoPackageInTheDescriptor() {
        // The java_package of these protos is rewritten to com.ondewo.nlu by the compiler
        // image, but the PROTO package - what goes on the wire - must stay ondewo.nlu.
        assertEquals("ondewo.nlu.Context", Context.getDescriptor().getFullName());
        assertEquals("ondewo.nlu.Agent", AgentOuterClass.Agent.getDescriptor().getFullName());
    }

    @ParameterizedTest(name = "{0} has the zero value {1}")
    @MethodSource("zeroValues")
    void everyEnumStartsAtItsUnspecifiedMember(final String name, final int number, final Object zeroValue) {
        assertEquals(0, number, name);
        assertEquals(name, zeroValue.toString());
    }

    private static Stream<Arguments> zeroValues() {
        return Stream.of(
                Arguments.of(
                        "AUDIO_ENCODING_UNSPECIFIED",
                        AudioEncoding.AUDIO_ENCODING_UNSPECIFIED.getNumber(),
                        AudioEncoding.forNumber(0)),
                Arguments.of(
                        "AGENT_VIEW_UNSPECIFIED",
                        AgentOuterClass.AgentView.AGENT_VIEW_UNSPECIFIED.getNumber(),
                        AgentOuterClass.AgentView.forNumber(0)));
    }

    @Test
    void defaultInstancesAreEmpty() {
        assertEquals("", Context.getDefaultInstance().getName());
        assertEquals(0, Context.getDefaultInstance().getLifespanCount());
        assertFalse(Context.getDefaultInstance().hasLifespanTime());
        assertEquals(0, Context.getDefaultInstance().getSerializedSize());
    }
}
