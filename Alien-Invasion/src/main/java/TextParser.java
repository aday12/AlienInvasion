import java.io.IOException;

public class TextParser {

    public static void textParser(String userInput) throws IOException {

        String[] cmd = userInput.split(" ");

        if (cmd.length > 1) {
            if (userInput.trim().equalsIgnoreCase("display inventory")){
                System.out.println(Inventory.getInventory());
            }
            else if (InvalidInput.checkValidInput(userInput)) {
//                switch (cmd[0]) {
//                    case "go" :
//                        Movement.processCommand(userInput);
//                    case "get":
//                        GetItems.isItemInteractable(userInput);
//                    case "drop":
//                        DropItem.dropItem(userInput);
//                    default :
//                        ExamineItems.examine(userInput);
//                }
                if (cmd[0].equalsIgnoreCase("go")){
                    Movement.processCommand(userInput);
                }
                else if (cmd[0].equalsIgnoreCase("get")){
                    GetItems.isItemInteractable(userInput);
                }
                else if (cmd[0].equalsIgnoreCase("drop")){
                    DropItem.dropItem(cmd[1]);
                }
                else if (cmd[0].equalsIgnoreCase("examine")){
                    ExamineItems.examine(userInput);
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
                case "skip":
                case "s":
//                    throw Skip.methodSkipException("moving along");
            }
        }
        else {
            System.out.println("Sorry that was an unrecognizable text length.");
        }
    }
}