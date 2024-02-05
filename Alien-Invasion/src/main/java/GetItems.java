import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

public class GetItems {


    public static boolean isItemInteractactable(String userInput) {
        String path = "./static/items.json";
        boolean isItem = false;
        String[] input = userInput.trim().split(" ");
        if (input[0].equalsIgnoreCase("get")) {

            try {
                FileReader fileReader = new FileReader(path);
                JSONTokener jsonTokener = new JSONTokener(fileReader);

                JSONObject jsonObject = new JSONObject(jsonTokener);
                JSONObject locationObject = jsonObject.getJSONObject("location");
                JSONObject commandObject = locationObject.getJSONObject("Command Center");
                JSONObject itemsObject = commandObject.getJSONObject("items");

                for (Iterator<String> it = itemsObject.keys(); it.hasNext(); ) {
                    String i = it.next();
                    if (i.equalsIgnoreCase(input[1])) {
                        isItem = true;
                        Inventory.setInventory(i);
                        break;
                    }
//                    System.out.println(i);
                }


            } catch (
                    FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return isItem;
    }
}