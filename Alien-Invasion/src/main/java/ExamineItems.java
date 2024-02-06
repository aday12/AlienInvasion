import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Locale;
import java.util.Scanner;

public class ExamineItems {
    public static String interactable = "none";


    public static void examine(String item) {
//        String[] userInput = {"look", "table"};
        String[] userInput = item.split(" ");
        switch (userInput[0]) {
            case "look":
            case "examine":
            case "inspect":
            case "interact":
            case "analyze":
                handleExamine(userInput);
        }

    }

    private static String handleExamine(String[] userInput) {
        String item = userInput[1];

        interactable = ItemsJSON.jsonReader(item);
        System.out.println(interactable);
        return interactable;
    }

    public static String getInteractable() {
        return interactable;
    }
}