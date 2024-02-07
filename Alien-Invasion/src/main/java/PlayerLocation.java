import java.io.IOException; // input/output errors
import java.util.List; // lists of objects
import com.google.gson.Gson; // import Gson for JSON data handling
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken; // TypeToken for list deserialization
import java.io.Reader; // Reader for file reading
import java.io.FileReader; // FileReader for reading files
import java.lang.reflect.Type; // Type for deserialization of List

// nested functions within class for encapsulation purposes
// also to ensure class has full control over how data is accessed/modified
public class PlayerLocation {
<<<<<<< HEAD
    final static String filePath = "Alien-Invasion/static/gameLocations.json";
    public static LocationData locationData; // variable to store loaded JSON data
=======
    private final static String filePath = "Alien-Invasion/static/gameLocations.json";
    public static LocationsData locationData; // variable to store loaded JSON data
>>>>>>> 4f7fd4147fb409d60b7c4ba034391b173f154b76

    public static void loadLocationData (String filePath){// load
        Gson gson = new Gson(); // create a Gson instance for JSON parsing
        try (Reader reader = new FileReader(filePath)) { // try to read JSON data from file
            Type locationListType = new TypeToken<List<Location>>() {
            }.getType();
            System.out.println(locationListType);
            List<Location> locations = gson.fromJson(reader, locationListType); // parse JSON data
<<<<<<< HEAD
            locationData = new LocationData();
            locationData.setLocations(locations);
            System.out.println(locations);// set the parsed list to LocationData instance
=======
            locationData = new LocationsData();
            locationData.setLocations(locations);
>>>>>>> 4f7fd4147fb409d60b7c4ba034391b173f154b76
        } catch (IOException e) { // handle input output errors
            System.err.println("Error loading location data: " + e.getMessage());
        } catch (JsonSyntaxException e) { // handle invalid JSON data
            System.err.println("Error parsing JSON data: " + e.getMessage());
        }
        //reader automatically closed when program exits try block
    }

<<<<<<< HEAD
    public static class LocationData {
        public List<PlayerLocation.Location> locations; // list of locations

        public List<PlayerLocation.Location> getLocations() {
            return locations;
        }

=======

    public static class LocationsData {
        public List<PlayerLocation.Location> locations; // list of locations
        public List<PlayerLocation.Location> getLocations() {
            return locations;
        }
>>>>>>> 4f7fd4147fb409d60b7c4ba034391b173f154b76
        public void setLocations(List<PlayerLocation.Location> locations) {
            this.locations = locations;
        }
    }


    public static class Location {
        int x;
        int y;
        public String location; // location name
        public String description; // location description
        public Location(String location);


        public Location(String location, String description, int xValue, int yValue) {

<<<<<<< HEAD
=======
        public Location(String location, String description, int xValue, int yValue) {
            this.location = location;
>>>>>>> 4f7fd4147fb409d60b7c4ba034391b173f154b76
            this.description = description;
            this.x = xValue;
            this.y = yValue;
        }

        public String getLocation() {
            return location;
        }

        public String getDescription() {
            return description;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

<<<<<<< HEAD
    public static void displayCurrentLocation () {
=======
    public static void displayCurrentLocation() {
>>>>>>> 4f7fd4147fb409d60b7c4ba034391b173f154b76
        if (locationData == null) { // if not loaded, load data
            loadLocationData(filePath);
        }
        List<Location> locations = locationData.getLocations();
        int currentLocationIndex = 0;
        Location currentLocation = locations.get(currentLocationIndex);

        System.out.println("** Current Location: " + currentLocation.getLocation() + " **");
        System.out.println("description: " + currentLocation.getDescription());
        System.out.println("coordinates: (" + currentLocation.getX() + ", " + currentLocation.getY() + ")");

<<<<<<< HEAD
    }

    public static void main(String[] args) {
        PlayerLocation.loadLocationData(filePath);
        PlayerLocation.displayCurrentLocation();
=======
>>>>>>> 4f7fd4147fb409d60b7c4ba034391b173f154b76
    }
}