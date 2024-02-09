package text_parser;

import client.Help;
import client.InvalidInput;
import client.Movement;
import client.QuitGame;
import items.DropItem;
import items.ExamineItems;
import items.GetItems;
import items.Inventory;

import java.io.IOException;

public class TextParser {

    public static void textParser(String userInput) throws IOException {

        String[] cmd = userInput.split(" ");

        if (cmd.length > 1) {
            if (userInput.trim().equalsIgnoreCase("display inventory")) {
                System.out.println(Inventory.getInventory());
            }
            else if (InvalidInput.checkValidInput(userInput)) {

                if (cmd[0].equalsIgnoreCase("go")){
                    Movement.processCommand(userInput);
                } else if (cmd[0].equalsIgnoreCase("get")) {
                    GetItems.isItemInteractable(userInput);
                } else if (cmd[0].equalsIgnoreCase("drop")) {
                    DropItem.dropItem(cmd[1]);
                }
                else if (cmd[0].equalsIgnoreCase("talk")){
                    TalkNPC.interactNPC(userInput);
                }
                else if (cmd[0].equalsIgnoreCase("examine") ||
                        cmd[0].equalsIgnoreCase("look") ||
                        cmd[0].equalsIgnoreCase("inspect") ||
                        cmd[0].equalsIgnoreCase("interact") ||
                        cmd[0].equalsIgnoreCase("analyze")){
                    ExamineItems.examine(userInput);
                } else {
                    System.out.println("Sorry that was a invalid action");
                }
            }
        } else if (cmd.length == 1) {
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
        } else {
            System.out.println("Sorry that was an unrecognizable text length.");
        }
    }
}