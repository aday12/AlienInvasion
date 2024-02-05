import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;

class JSONInteraction {

    public static void jsonReader(String item){
        String path = "./static/gametext.json";

        try {
            FileReader fileReader = new FileReader(path);
            JSONTokener jsonTokener = new JSONTokener(fileReader);

            JSONObject jsonObject = new JSONObject(jsonTokener);

            //This can remain the same
            JSONObject locationObject = jsonObject.getJSONObject("location");

            // We will want to generate this dynamically based on actual player location
//            PlayerLocation.getLocationName()
            JSONObject commandObject = locationObject.getJSONObject("Command Center");

            // This might be able to remain static... depends on how we want to separate inter-actables
            JSONObject itemsObject = commandObject.getJSONObject("items");

            // This will need to be dynamic based on whatever player has input

            String items = itemsObject.getString(item);

            System.out.println(items);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}