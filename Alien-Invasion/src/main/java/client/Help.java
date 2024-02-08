package client;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Set;

public class Help {
//    private static final String[] helpWords = {"look", "around", "observe", "inspect", "approach", "interact", "computer", "examine", "door", "read",
//            "note", "check", "trashcan", "table", "inspect", "slime", "goo", "open", "take", "attack", "hit", "use", "interact", "discard",
//            "throw", "inventory", "items", "unlock", "analyze", "help", "quit", "skip"};


    public static void displayHelp() {
        String path = "Alien-Invasion/resourceFile/items.json";
        try {
            Gson gson = new Gson();

            // Read JSON data from the file into a JsonObject
            JsonObject jsonObject = gson.fromJson(new FileReader(path), JsonObject.class);

            JsonObject locationObject = jsonObject.getAsJsonObject("location");
            // Need to update this based on player location in room
            JsonObject commandObject = locationObject.getAsJsonObject("Command Center");
            JsonObject items = commandObject.getAsJsonObject("items");

            JsonPrimitive availableCommands = commandObject.getAsJsonPrimitive("available commands");

            Set<String> entrySet = items.keySet();

            System.out.println("Interactable: " + entrySet);
            System.out.println("Actions: "  + availableCommands);

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}