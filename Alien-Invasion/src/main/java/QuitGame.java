import java.util.Scanner;

public class QuitGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type [Q]uit at any time to end the game!");

        String userInput = scan.nextLine().trim();

        System.out.println("Enter a verb or a verb + a noun to interact: ");


        if (userInput.equalsIgnoreCase("Q")) {
            System.exit(0);
        }
        else {
            String[] cmd = userInput.split(" ");
            System.out.println("Verb: " + cmd[0]);
            System.out.println("Noun: " + cmd[1]);
                if (cmd.length > 2) {
                    System.out.println("Please only enter 1 verb or 1 verb and 1 noun");
                }
        }
        scan.close();
    }
}
