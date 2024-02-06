public class TextParser {

    public static void textParser(String userInput) {

        String[] cmd = userInput.split(" ");

        if (cmd.length > 1) {
            if (userInput.trim().equalsIgnoreCase("display inventory")){
                Inventory.displayInventory();
            }
            else if (InvalidInput.checkValidInput(userInput)) {
                switch (cmd[0]) {
                    case "go" :
                        Movement.processCommand(userInput);
                    default :
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