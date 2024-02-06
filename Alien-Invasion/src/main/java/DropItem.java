public class DropItem {
    public static void dropItem(String userInput) {
            Inventory.getInventory().remove(userInput.trim());
    }
}
