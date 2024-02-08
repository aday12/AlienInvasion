package items;

import client.Movement;
import json.ItemsJSON;
import java.io.IOException;
import java.util.ArrayList;

public class DropItem {
    public static void dropItem(String userInput) throws IOException {
        ArrayList<Integer> currentCoordinates = new ArrayList<>();
        currentCoordinates.add(Movement.getX_Axis());
        currentCoordinates.add(Movement.getY_Axis());
        Inventory.getInventory().remove(userInput.trim());
        ItemsJSON.setCoordinates(currentCoordinates, userInput);
        System.out.println("You dropped " + userInput + " at coordinates " + currentCoordinates);
    }
}
