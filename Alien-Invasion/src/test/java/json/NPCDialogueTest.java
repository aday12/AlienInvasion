package json;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NPCDialogueTest {

    @Test
    void randDialogue() {
        NPCDialogue.randDialogue("general");
    }

    @Test
    void robotReturnsSpecificDialogue() {
        NPCDialogue.randDialogue("robot");

    }
}