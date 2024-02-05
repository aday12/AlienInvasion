import java.util.ArrayList;

public class Inventory {
    private static ArrayList<String> inventory = new ArrayList<>();

    public static void displayInventory(String userInput){
        String[] input = userInput.trim().split(" ");
        if (userInput.trim().equalsIgnoreCase("display inventory")){
            System.out.println(getInventory());
        }
    }

    public static ArrayList<String> getInventory() {
        return inventory;
    }

    public static void setInventory(String inventory) {
        Inventory.inventory.add(inventory);
    }
}