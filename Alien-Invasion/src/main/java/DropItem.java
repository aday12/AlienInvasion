public class DropItem {

    public static void dropItem(String userInput) {
        String[] input = userInput.trim().toLowerCase().split(" ");
        if (userInput.contains("drop")) {
            Inventory.getInventory().remove(userInput.trim());
        }
    }
}
