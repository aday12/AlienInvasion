import java.util.ArrayList;

public class Inventory {
    public static ArrayList<String> inventory = new ArrayList<>();

    public static void displayInventory() {
        if (!inventory.isEmpty()) {
            for (String i : inventory) {
                System.out.println(i);
            }
        }
    }

    public static ArrayList<String> getInventory() {
        return inventory;
    }

    public static void setInventory(String inventory) {
        Inventory.inventory.add(inventory);
    }
}