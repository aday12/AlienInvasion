import org.junit.jupiter.api.Test;

class JSONInteractionTest {

    @Test
    void jsonReader() {
        ExamineItems.examine("analyze board");
        ItemsJSON.jsonReader(ExamineItems.getInteractable());
    }
}