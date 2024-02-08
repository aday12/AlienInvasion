package text_parser;

import client.Help;
import client.InvalidInput;
import client.Movement;
import client.QuitGame;
import items.*;


import java.io.IOException;

public class TextParser {

    public static void textParser(String userInput) throws IOException {

        String[] cmd = userInput.split(" ");

        if (cmd.length > 1) {
            if (userInput.trim().equalsIgnoreCase("display inventory")) {
                System.out.println(Inventory.getInventory());
            } else if (InvalidInput.checkValidInput(userInput)) {
//                switch (cmd[0]) {
//                    case "go" :
//                        client.Movement.processCommand(userInput);
//                    case "get":
//                        items.GetItems.isItemInteractable(userInput);
//                    case "drop":
//                        items.DropItem.dropItem(userInput);
//                    default :
//                        items.ExamineItems.examine(userInput);
//                }
                if (cmd[0].equalsIgnoreCase("go")) {
                    Movement.processCommand(userInput);
                } else if (cmd[0].equalsIgnoreCase("get")) {
                    GetItems.isItemInteractable(userInput);
                } else if (cmd[0].equalsIgnoreCase("drop")) {
                    DropItem.dropItem(cmd[1]);
                } else if (cmd[0].equalsIgnoreCase("examine")) {
                    ExamineItems.examine(userInput);
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
            }
        } else {
            System.out.println("Sorry that was an unrecognizable text length.");
        }
    }
}