import java.util.Scanner;

public class TextParser {

    public static void textParser(String userInput) {

//            switch (userInput) {
//                case "quit":
//                case "q":
//                    QuitGame.quitGame();
//                case "help":
//                case "h":
//                    Help.displayHelp();
//            }

        String[] cmd = userInput.split(" ");
        if (InvalidInput.checkValidInput(cmd[0]) && InvalidInput.checkValidInput(cmd[1])) {
            ExamineItems.examine(userInput);
            if (userInput.equals("q") || userInput.equals("quit")) {
                QuitGame.quitGame();
            } else if (userInput.equals("h") || userInput.equals("help")){
                Help.displayHelp();
            }
        }
        if (cmd.length > 2) {
            System.out.println("Please only enter 1 verb or 1 verb and 1 noun");
        }
    }
}
