package json;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import controller.Controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Set;

class NPCDialog {
    private int dialogueOption;

    private static double randDialogue() {
        double rand = Math.random() * ((dialogue.length()) + 1);
        return "NPC says: " + dialouge[rand];
    }


}
