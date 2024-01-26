import java.util.Scanner;

class QuitGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type [Q]uit at any time to end the game!");

        String userInput = scan.nextLine().trim().toUpperCase();

        if (userInput.equals("Q")) {
            System.exit(0);
        }
    }
}
