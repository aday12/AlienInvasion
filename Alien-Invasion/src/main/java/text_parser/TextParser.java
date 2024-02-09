package text_parser;

import client.Help;
import client.InvalidInput;
import client.Movement;
import client.QuitGame;
import items.DropItem;
import items.ExamineItems;
import items.GetItems;
import items.Inventory;
import json.SynonymsJson;

import java.io.IOException;

public class TextParser {

    public static void textParser(String userInput) throws IOException {

        String[] cmd = userInput.split(" ");

        if (cmd.length > 1) {
            if (userInput.trim().equalsIgnoreCase("display inventory")){
                System.out.println(Inventory.getInventory());
            }

            else if (InvalidInput.checkValidInput(userInput)) {

                if (SynonymsJson.goSynonyms(cmd[0])) {
                    Movement.processCommand(cmd[1]);
                } else if (SynonymsJson.getSynonyms(cmd[0])) {
                    GetItems.isItemInteractable(userInput);
                } else if (SynonymsJson.dropSynonyms(cmd[0])) {
                    DropItem.dropItem(cmd[1]);
                } else if (SynonymsJson.examineSynonyms(cmd[0])) {
                    ExamineItems.examine(userInput);
                } else if (SynonymsJson.talkSynonyms(cmd[0])){
                    TalkNPC.interactNPC(userInput);
                } else {
                    System.out.println("Sorry that was a invalid action");
                }
            }
        }
        else if (cmd.length == 1) {
            switch (cmd[0]) {
                case "quit":
                case "q":
                    QuitGame.quitGame();
                    break;
                case "help":
                case "h":
                    Help.displayHelp();
                default:
                    System.out.println("Sorry that was an unrecognizable command.");
            }
        }
        else {
            System.out.println("Sorry that was an unrecognizable text length.");
        }
    }
}