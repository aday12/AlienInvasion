package client;

import java.util.Scanner;

public class Movement {

    private static int x_Axis = 0;
    private static int y_Axis = 0;
    private Scanner scanner = new Scanner(System.in);

    public static int getX_Axis() {
        return x_Axis;
    }

    public static int getY_Axis() {
        return y_Axis;
    }



    //methods
    public void startPosition() {
        System.out.printf("Player position: (%s,%s)", getX_Axis(), getY_Axis());
    }

    public static void processCommand(String command) {

        if (command.startsWith("go")) {
            String direction = command.substring(3).trim(); // Extract direction from the command
            movePosition(direction);
        } else {
            System.out.println("Invalid command!");
        }
    }
    public static void movePosition(String direction) {
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
        return "client.Movement{" +
                "x_Axis=" +getX_Axis() +
                ", y_Axis=" + getY_Axis() +
                '}';
    }
}
