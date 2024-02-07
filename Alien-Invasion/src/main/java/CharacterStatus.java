//import java.time.LocalTime;
//
//public class CharacterStatus {
//
//    public static String getPlayerLocation(int x, int y) {
//        for (PlayerLocation.Location location : PlayerLocation.locationData.getLocations()) {
//            if (location.getX() == x && location.getY() == y) {
//                return PlayerLocation.Location.getLocation();
//            }
//        }
//        return "Unknown location";
//    }
//    private static void displayCharacterStats() {
//        int health = 100;
//        String currentLocation = getPlayerLocation(Movement.getX_Axis(), Movement.getY_Axis());
//        String[] inventoryStats = Inventory.getInventory().toArray(new String[0]);
//        LocalTime currentTime;
//
//        while (true) {
//            // Display character status
//            System.out.println("Character Status:");
//            System.out.println("  Health: " + health);
//            System.out.println("  Location: " + currentLocation);
//            System.out.println("  Inventory: " + inventoryStats);
//            currentTime = LocalTime.now();
//            System.out.println("  Time: " + currentTime);
//
//            try {
//                Thread.sleep(1000); // Sleep for 1 second wait
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            // Clear the console (optional)
//            clearScreen();
//        }
//    }
//
//    private static void clearScreen() {
//        // Clear the console screen
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
//    }
//}