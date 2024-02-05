import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetItemsTest {

    @Test
    void isItemInteractactableShouldReturnTrue() {
        String getNote = "get note";
        GetItems.isItemInteractactable(getNote);
//        System.out.println(GetItems.getInventory());
        String getGoo = "get goo";
        GetItems.isItemInteractactable(getGoo);
        assertTrue(GetItems.isItemInteractactable(getGoo));

//        System.out.println(GetItems.getInventory());
    }

    @Test
    void isItemInteractableShouldReturnFalse(){
        String getNothing = "get nothing";
        assertFalse(GetItems.isItemInteractactable(getNothing));
    }
}