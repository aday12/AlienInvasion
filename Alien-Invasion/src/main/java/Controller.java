import java.util.Scanner;

public class Controller {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        if (NewGame.gameStart()) {
            AlienInvasionIntro.welcome();
            boolean isGame = true;
            while (isGame) {
                PlayerLocation.location();
                String userInput = scan.nextLine().trim();
                TextParser.textParser(userInput);
            }
        }
    }
}
