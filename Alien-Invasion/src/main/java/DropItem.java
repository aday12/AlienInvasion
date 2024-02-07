import java.util.ArrayList;

public class DropItem {
    public static void dropItem(String userInput) {
        ArrayList<Integer> currentCoordinates = new ArrayList<>();
        currentCoordinates.add(Movement.getX_Axis());
        currentCoordinates.add(Movement.getY_Axis());
        Inventory.getInventory().remove(userInput.trim());
        ItemsJSON.setCoordinates(currentCoordinates);
    }
}
