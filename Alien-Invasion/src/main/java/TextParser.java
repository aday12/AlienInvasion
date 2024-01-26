import java.util.Scanner;

class TextParser {
    private static Scanner scan = new Scanner(System.in);

    private void textParser() {
        System.out.println("What do you do next?");
        String userInput = scan.nextLine().trim();

        String[] cmd = userInput.split(" ");
        System.out.println("Verb: " + cmd[0]);
        System.out.println("Noun: " + cmd[1]);
        if (cmd.length > 2) {
            System.out.println("Please only enter 1 verb or 1 verb and 1 noun");
        }
        scan.close();
    }
}
