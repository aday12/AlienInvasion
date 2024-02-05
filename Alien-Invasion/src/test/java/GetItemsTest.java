import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetItemsTest {

    @Test
    void isItemInteractactable() {
        String getNote = "get note";
        GetItems.isItemInteractactable(getNote);
        System.out.println(GetItems.getInventory());
        String getGoo = "get goo";
        GetItems.isItemInteractactable(getGoo);
        String getNothing = "get nothing";
        GetItems.isItemInteractactable(getNothing);
        System.out.println(GetItems.getInventory());
    }
}