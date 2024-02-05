import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JSONInteractionTest {

    @Test
    void jsonReader() {
        ExamineItems.examine("analyze board");
        JSONInteraction.jsonReader(ExamineItems.getInteractable());
    }
}