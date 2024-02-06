import java.util.Scanner;

public class Controller {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        TitleScreen.displayAsciiArt("./static/title.txt");

        if (NewGame.gameStart()) {
//            AlienInvasionIntro.welcome();
            boolean isGame = true;
//            Help.displayHelp();
            while (isGame) {
               // PlayerLocation.location();
                System.out.print("> ");
                String userInput = scan.nextLine().trim();
                TextParser.textParser(userInput);
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }
    }
}
