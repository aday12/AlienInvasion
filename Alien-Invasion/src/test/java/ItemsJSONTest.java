import json.ItemsJSON;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ItemsJSONTest {

    @Test
    void getDescription() {
    }

    @Test
    void getCoordinates() {
        ItemsJSON.getCoordinates("note");
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(1);
        assertEquals(expected, ItemsJSON.getCoordinates("note"));
    }

    @Test
    void setCoordinates() throws IOException {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(1);
        ItemsJSON.setCoordinates(expected, "note");
        assertEquals(expected, ItemsJSON.getCoordinates("note"));
    }

//    @Test
//    void setCoordinatesToNull() {
//        json.ItemsJSON.setCoordinatesToNull("note");
//        assertEquals("null", json.ItemsJSON.getCoordinates("note"));
//    }
}