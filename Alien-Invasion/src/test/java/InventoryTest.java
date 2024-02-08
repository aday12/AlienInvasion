import items.GetItems;
import items.Inventory;
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

    @Test
    void displayInventory() {
//        items.Inventory.setInventory("goo");
//        items.Inventory.setInventory("note");
        GetItems.isItemInteractable("get goo");
        Inventory.displayInventory();
    }
}