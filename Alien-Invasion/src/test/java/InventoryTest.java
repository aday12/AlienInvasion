import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    @Test
    void setInventory() {
        Inventory.setInventory("goo");
        Inventory.setInventory("note");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("goo");
        expected.add("note");
        System.out.println(Inventory.getInventory());
        assertEquals(expected, Inventory.getInventory());

    }
}