import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Set;

public class GetItems {

    public static boolean isItemInteractable(String userInput) {
        String path = "./static/items.json";
        boolean isItem = false;
        String[] input = userInput.trim().split(" ");

        if (input[0].equalsIgnoreCase("get")) {
            try {
                Gson gson = new Gson();

                // Read JSON data from the file into a JsonObject
                JsonObject jsonObject = gson.fromJson(new FileReader(path), JsonObject.class);

                JsonObject locationObject = jsonObject.getAsJsonObject("location");
                JsonObject commandObject = locationObject.getAsJsonObject("Command Center");
                JsonObject itemsObject = commandObject.getAsJsonObject("items");

                Set<Map.Entry<String, JsonElement>> entrySet = itemsObject.entrySet();

                for (Map.Entry<String, JsonElement> entry : entrySet) {
                    String itemName = entry.getKey();
                    if (itemName.equalsIgnoreCase(input[1])) {
                        isItem = true;
                        Inventory.setInventory(input[1]);
                        break;
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return isItem;
    }
}
