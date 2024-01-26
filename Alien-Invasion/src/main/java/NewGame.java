import java.util.Scanner;

class NewGame {
    private static boolean isNewGame;
    private static String openingMessage = "Would you like to start a new game? (yes/no)";
    private static Scanner scanner = new Scanner(System.in);

    public boolean gameStart() {
        System.out.println(openingMessage);
        String response = scanner.next().trim().toLowerCase();

        switch (response) {
            case "yes":
            case "y":
                isNewGame = true;
                break;
            case "no":
            case "n":
                isNewGame = false;
                break;
            default:
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        }

        return isNewGame;
    }

    public static void closeScanner() {
        scanner.close();
    }

}