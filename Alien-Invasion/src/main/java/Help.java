import java.util.Scanner;

public class Help {
    private String[] helpWords = {"look", "around", "observe", "inspect", "approach", "interact", "computer", "examine", "door", "read",
            "note", "check", "trashcan", "table", "inspect", "slime", "goo", "open", "take", "attack", "hit", "use", "interact", "discard",
            "throw", "inventory", "items", "unlock", "analyze", "help"};


    public void displayHelp(Scanner scanner) {
        System.out.println("Type 'help' or 'h' for help.");
        String userInput = scanner.next().trim().toLowerCase();
        if (userInput.equals("help") || userInput.equals("h")) {
            for (String word : helpWords) {
                System.out.println(word);
            }
        }
//        if (scanner.equals("help") || scanner.equals("h")) {
//            for (String word : helpWords) {
//                System.out.println(word);
//            }
//        }

    }
}