package text_parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TalkNPCTest {

    @Test
    void interactNPCShouldGiveGenericStringIfNPCNotInJsonDoc() {
        String expected = "That is not something you can talk to.";
        assertEquals(expected, TalkNPC.interactNPC("nobody"));
    }

    @Test
    void interactNPCShouldStateWhoIsBeingInteractedWithIfNameInJsonDoc() {
        String expected = "You are talking to robot";
        assertEquals(expected, TalkNPC.interactNPC("robot"));
    }
}