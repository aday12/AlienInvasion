import java.util.Scanner;

public class ExamineItems {
    private final String[] interactables = {"computer", "north-door", "west-door", "note", "trashcan", "table", "slime", "goo", "board", "blank-board", };

    public static void examine(Scanner scanner){
        String[] userInput = scanner.next().split(" ");

        switch (userInput[0]) {
            case "look":
            case "examine":
            case "inspect":
            case "interact":
            case "analyze":

        }

    }
    private static void handleExamine(String[] userInput) {

    }
}