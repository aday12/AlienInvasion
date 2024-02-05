import com.fasterxml.jackson.databind.ObjectMapper; // json data handling
import java.io.File; // file operations
import java.io.IOException; // input/output errors
import java.util.List; // lists of objects

public class PlayerLocation {
    private static LocationData locationData; // loaded json data

    public static void main(String[] args) {
        loadLocationData(); // load json data

        int currentLocationIndex = 0; // choose location index
        Location currentLocation = locationData.getLocations().get(currentLocationIndex); // get location

        System.out.println("** Current Location: " + currentLocation.getLocation() + " **");
        System.out.println("Description: " + currentLocation.getDescription());
    }

    private static void loadLocationData() {
        ObjectMapper objectMapper = new ObjectMapper(); // json reader

        try {
            locationData = objectMapper.readValue(new File("locations.json"), LocationData.class); // read json
        } catch (IOException e) {
            e.printStackTrace(); // handle errors
        }
    }

    private static class LocationData {
        private List<Location> locations; // list of locations

        public List<Location> getLocations() {
            return locations;
        }

        public void setLocations(List<Location> locations) {
            this.locations = locations;
        }
    }

    private static class Location {
        private String location;
        private String description;

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}