import java.util.Scanner;

public class Movement {
    public static void main(String[] args) {
        Movement will = new Movement();
        will.startPosition();
        System.out.println(will);
        will.processCommand();
    }
    private int x_Axis = 0;
    private int y_Axis = 0;
    private Scanner scanner = new Scanner(System.in);

    public int getX_Axis() {
        return x_Axis;
    }

    public int getY_Axis() {
        return y_Axis;
    }



    //methods
    public void startPosition() {
        System.out.printf("Player position: (%s,%s)", getX_Axis(), getY_Axis());
    }


    public void processCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'GO (north/south/west/east)' to move");
        String command = scanner.nextLine();

        if (command.startsWith("go")) {
            String direction = command.substring(3).trim(); // Extract direction from the command
            movePosition(direction);
        } else {
            System.out.println("Invalid command!");
        }
    }
    private void movePosition(String direction) {
        System.out.println("Enter (north/south/west/east)");
            switch (direction.toLowerCase()) {
                case "north":
                    y_Axis++;
                    System.out.println("You are North");
                    break;
                case "south":
                    y_Axis--;
                    System.out.println("You are South");
                    break;
                case "east":
                    x_Axis++;
                    System.out.println("You are East");
                    break;
                case "west":
                    x_Axis--;
                    System.out.println("You are West");
                    break;
                default:
                    System.out.println("Invalid direction!");
                    return;
            }
            System.out.printf("Player moved to position: (%s,%s)", getX_Axis(), getY_Axis());
        }

    @Override
    public String toString() {
        return "Movement{" +
                "x_Axis=" +getX_Axis() +
                ", y_Axis=" + getY_Axis() +
                '}';
    }
}
