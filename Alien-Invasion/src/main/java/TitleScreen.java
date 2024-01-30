
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

class TitleScreen {
    private static String filePath = "C:/Practical_Application/Sprint_One/Alien-Invasion/src/resources/title.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        displayAsciiArtFromFile(filePath);

        System.out.println("Welcome to Alien InVasion");
        System.out.println("Enter any key to continue!");

        scanner.nextLine();
        System.out.print("\033[H\033[2J"); // Clear the console


    }

    public static void displayAsciiArtFromFile(String filePath) {
        try {
            Files.lines(Paths.get(filePath)).forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



