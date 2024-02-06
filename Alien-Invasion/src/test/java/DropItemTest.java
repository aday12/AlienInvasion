import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DropItemTest {

    @Test
    void dropItemShouldRemoveFromInventory() {
        Inventory.setInventory("goo");
        Inventory.setInventory("book");
        DropItem.dropItem("goo");
        assertFalse(Inventory.getInventory().contains("goo"));
    }

    @Test
    void dropItemsNothingDropsWhenItemNotInInventory() {
        Inventory.setInventory("goo");
        Inventory.setInventory("book");
        DropItem.dropItem("north");
        assertTrue(Inventory.getInventory().contains("goo"));
        assertTrue(Inventory.getInventory().contains("book"));
    }
}
