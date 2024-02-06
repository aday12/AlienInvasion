//import com.fasterxml.jackson.databind.ObjectMapper; // json data handling
//import java.io.File; // file operations
//import java.io.IOException; // input/output errors
//import java.util.List; // lists of objects
//
//public class PlayerLocation {
//    public static LocationData locationData; // loaded json data
//
//    public static void location() {
//        loadLocationData(); // load json data
//
//        int currentLocationIndex = 0; // choose location index
//        Location currentLocation = locationData.getLocations().get(currentLocationIndex); // get location
//
//        System.out.println("** Current Location: " + currentLocation.getLocation() + " **");
//        System.out.println("Description: " + currentLocation.getDescription());
//    }
//
//    static void loadLocationData() {
//        ObjectMapper objectMapper = new ObjectMapper(); // json reader
//
//        try {
//            locationData = objectMapper.readValue(new File("locations.json"), LocationData.class); // read json
//        } catch (IOException e) {
//            e.printStackTrace(); // handle errors
//        }
//    }
//
//    public static class LocationData {
//        private List<Location> locations; // list of locations
//
//        public List<Location> getLocations() {
//            return locations;
//        }
//
//        public void setLocations(List<Location> locations) {
//            this.locations = locations;
//        }
//    }
//
//    public static class Location {
//        int x;
//        int y;
//        private String location;
//        private String description;
//
//        public String getLocation() {
//            return location;
//        }
//
//        public void setLocation(String location) {
//            this.location = location;
//        }
//
//        public String getDescription() {
//            return description;
//        }
//
//        public void setDescription(String description) {
//            this.description = description;
//        }
//
//        //added x-y axis to location
//        public int getX() {
//            return Movement.getX_Axis();
//        }
//
//        public int getY() {
//            return Movement.getY_Axis();
//        }
//
//        public void setX(int x) {
//            this.x = x;
//        }
//
//        public void setY(int y) {
//            this.y = y;
//        }
//    }
//}

//import java.io.File; // file operations
//import java.io.IOException; // input/output errors
//import java.util.List; // lists of objects
//import com.google.gson.Gson; // import Gson for JSON data handling
//import com.google.gson.JsonSyntaxException;
//import com.google.gson.reflect.TypeToken; // TypeToken for list deserialization
//import java.io.Reader; // Reader for file reading
//import java.io.FileReader; // FileReader for reading files
//import java.lang.reflect.Type; // Type for deserialization of List
//
//public class PlayerLocation {
//    public static LocationData locationData; // variable to store loaded JSON data
//
//    public static void loadLocationData(String filePath) {// load
//        Gson gson = new Gson(); // create a Gson instance for JSON parsing
//        try (Reader reader = new FileReader(filePath)) { // try to read JSON data from file
//            Type locationListType = new TypeToken<List<Location>>() {
//            }.getType();
//            List<Location> locations = gson.fromJson(reader, locationListType); // parse JSON data
//            locationData = new LocationData();
//            locationData.setLocations(locations); // set the parsed list to LocationData instance
//        } catch (IOException e) { // handle input output errors
//            System.err.println("Error loading location data: " + e.getMessage());
//        } catch (JsonSyntaxException e) { // handle invalid JSON data
//            System.err.println("Error parsing JSON data: " + e.getMessage());
//        }
//    }
//
//    public static void displayCurrentLocation() {
//        if (locationData == null) { // if not loaded, load data
//            loadLocationData();
//        }
//
//        List<Location> locations = locationData.getLocations();
//        int currentLocationIndex = 0;
//        Location currentLocation = locations.get(currentLocationIndex);
//
//        System.out.println("** Current Location: " + currentLocation.getLocation() + " **");
//        System.out.println("description: " + currentLocation.getDescription());
//    }
//
//    public static class LocationData {
//        public List<Location> locations; // list of locations
//
//        public List<Location> getLocations() {
//            return locations;
//        }
//
//        public void setLocations(List<Location> locations) {
//            this.locations = locations;
//        }
//    }
//
//    public static class Location {
//        public String location; // location name
//        public String description; // location description
//
//        public Location(String location, String description) {
//            this.location = location;
//            this.description = description;
//        }
//
//        public String getLocation() {
//            return location;
//        }
//
//        public void setLocation(String location) {
//            this.location = location;
//        }
//
//        public String getDescription() {
//            return description;
//        }
//
//        public void setDescription(String description) {
//            this.description = description;
//        }
//    }
//}