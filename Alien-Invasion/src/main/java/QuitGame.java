import java.util.Scanner;

public class QuitGame {
    private static Scanner scan = new Scanner(System.in);

    public static void quitGame() {
        System.out.println("Are you sure you want to quit?");
        String userInput = scan.nextLine().trim();

        if (userInput.equals("yes")) {
            System.exit(0);
        }
        else {
            return;
        }
    }
}
