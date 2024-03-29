package client;

import items.Inventory;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

public class CharacterStatus {
    private static PlayerLocation.LocationsData locationData;

    public CharacterStatus() {
        PlayerLocation.loadLocationData(PlayerLocation.filePath);
        locationData = PlayerLocation.locationData;
    }

    private static class CharacterState {
        private int health;
        private String currentLocal;
        private String[] inventoryStats;
        private LocalTime currentTime;

        public CharacterState(int health, String currentLocal, String[] inventoryStats, LocalTime currentTime) {
            this.health = health;
            this.currentLocal = currentLocal;
            this.inventoryStats = inventoryStats;
            this.currentTime = currentTime;
        }

        public int getHealth() {
            return health;
        }

        public String getCurrentLocal() {
            return currentLocal;
        }

        public String[] getInventoryStats() {
            return inventoryStats;
        }

        public LocalTime getCurrentTime() {
            return currentTime;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            CharacterState that = (CharacterState) obj;
            return health == that.health &&
                    Objects.equals(currentLocal, that.currentLocal) &&
                    Arrays.equals(inventoryStats, that.inventoryStats) &&
                    Objects.equals(currentTime, that.currentTime);
        }

        @Override
        public int hashCode() {
            int result = Objects.hash(health, currentLocal, currentTime);
            result = 31 * result + Arrays.hashCode(inventoryStats);
            return result;
        }
    }

    public static void displayCharacterStatus() {
        CharacterState previousState = null;

        //while (true) {
        int health = 100; // hp hard set to 100 points

        // Retrieve current location dynamically
        String currentLocal = getCurrentLocation();
        String[] inventoryStats = Inventory.getInventory().toArray(new String[0]);
        LocalTime currentTime = LocalTime.now();
        CharacterState currentState = new CharacterState(health, currentLocal, inventoryStats, currentTime);

        // Move the cursor to the start of the output
//        System.out.print("\033[H");

        // Display character status
        System.out.println("Character Status:");
        System.out.println("  Health: " + health);
        //TODO fix location data
        System.out.println("  Location: Command Center");

        System.out.println("  items.Inventory: " + Inventory.getInventory());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = currentTime.format(formatter);
        System.out.println("  Time: " + formattedTime);

//        if (locationData == null) {
//            System.out.println("Error: Location data is not loaded.");
//            return;
//        }

        // Retrieve the current location
        PlayerLocation.Location currentLocation = getCurrentLocationObject();

        // Display current location
        System.out.println("Coordinates: (" + Movement.getX_Axis() + ", " + Movement.getY_Axis() + ")");

        previousState = currentState;


    }

    private static String getCurrentLocation() {  ///gets location index as a string
        if (locationData != null && !locationData.getLocations().isEmpty()) {
            int currentLocationIndex = getCurrentLocationIndex();
            return locationData.getLocations().get(currentLocationIndex).getLocation();
        } else {
            return "Unknown";
        }
    }

    private static PlayerLocation.Location getCurrentLocationObject() { //get location index as an object
        if (locationData != null && !locationData.getLocations().isEmpty()) {
            int currentLocationIndex = getCurrentLocationIndex();
            return locationData.getLocations().get(currentLocationIndex);
        } else {
            return new PlayerLocation.Location("Unknown");
        }
    }

    private static int getCurrentLocationIndex() {
        int playerX = Movement.getX_Axis();
        int playerY = Movement.getY_Axis();

        List<PlayerLocation.Location> locations = locationData.getLocations();

        for (int i = 0; i < locations.size(); i++) {
            PlayerLocation.Location location = locations.get(i);
            if (location.getX() == playerX && location.getY() == playerY) { //compares movement and location matches
                return i; //returns location index if matches
            }
        }

        return 0; // Default index if no matching location is found
    }

}
