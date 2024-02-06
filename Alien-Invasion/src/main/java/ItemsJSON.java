import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ItemsJSON {

    public static void jsonReader(String item) {
        String path = "./static/items.json";

        try {
            Gson gson = new Gson();
            // Read JSON data from the file into a JsonObject
            JsonObject jsonObject = gson.fromJson(new FileReader(path), JsonObject.class);

            // This can remain the same
            JsonObject locationObject = jsonObject.getAsJsonObject("location");

            // We will want to generate this dynamically based on actual player location
            // PlayerLocation.getLocationName()
            JsonObject commandObject = locationObject.getAsJsonObject("Command Center");

            // This might be able to remain static... depends on how we want to separate inter-actables
            JsonObject itemsObject = commandObject.getAsJsonObject("items");

            // This will need to be dynamic based on whatever player has input
            String items = itemsObject.get(item).getAsString();

            System.out.println(items);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
