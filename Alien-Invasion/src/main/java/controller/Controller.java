package controller;

import client.CharacterStatus;
import client.NewGame;
import client.TitleScreen;
import text_parser.TextParser;

import java.io.IOException;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner scan = new Scanner(System.in);
        TitleScreen.displayAsciiArt("./static/title.txt");

        if (NewGame.gameStart()) {
//            client.AlienInvasionIntro.welcome();
            boolean isGame = true;
//            client.Help.displayHelp();
            while (isGame) {
               // client.PlayerLocation.location();
                CharacterStatus.displayCharacterStatus();
                System.out.println("What's your next move Commander?");
                System.out.print("> ");
                String userInput = scan.nextLine().trim();
                TextParser.textParser(userInput);
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }
    }
}
