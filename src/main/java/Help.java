import java.util.Scanner;

public class Help {
    private static final String[] helpWords = {"look", "around", "observe", "inspect", "approach", "interact", "computer", "examine", "door", "read",
            "note", "check", "trashcan", "table", "inspect", "slime", "goo", "open", "take", "attack", "hit", "use", "interact", "discard",
            "throw", "inventory", "items", "unlock", "analyze", "help", "quit"};


    public static void displayHelp() {
        for (String word : helpWords) {
            System.out.println(word);
        }
    }
}