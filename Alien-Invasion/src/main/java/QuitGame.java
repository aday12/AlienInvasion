import java.util.Scanner;

public class QuitGame {
    private static Scanner scan = new Scanner(System.in);

    public void quitGame() {
        System.out.println("Type [Q]uit at any time to end the game!");
        String userInput = scan.nextLine().trim();
        System.out.println("Enter a verb or a verb + a noun to interact: ");

        if (userInput.equalsIgnoreCase("Q")) {
            System.exit(0);
        }
        scan.close();
    }
}
