//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CharacterStatusTest {
//
//    @Test
//    void testGetPlayerLocation() {
//        PlayerLocation.LocationData locationData = new PlayerLocation.LocationData();
//        PlayerLocation.Location location1 = new PlayerLocation.Location();
//        location1.setLocation("Location1");
//        location1.setX(0);
//        location1.setY(0);
//        PlayerLocation.Location location2 = new PlayerLocation.Location();
//        location2.setLocation("Location2");
//        System.out.println();
//        location2.setX(1);
//        location2.setY(1);
//        locationData.setLocations(Arrays.asList(location1, location2));
//        PlayerLocation.locationData = locationData;
//
//        // Test cases
//        assertEquals("Location1", CharacterStatus.getPlayerLocation(0, 0));
//        assertEquals("LocationB", CharacterStatus.getPlayerLocation(1, 1));
//        assertEquals("Unknown location", CharacterStatus.getPlayerLocation(2, 2));
//    }
//@Test
//    void getPlayerLocation_knownLocation_shouldReturnLocation() {
//        // Set up test data
//        PlayerLocation.LocationData locationData = new PlayerLocation.LocationData();
//        PlayerLocation.Location location = new PlayerLocation.Location();
//        location.setLocation("Test Location");
//        location.setX(0);
//        location.setY(0);
//        locationData.setLocations(List.of(location));
//
//        PlayerLocation.locationData = locationData;
//
//        // Call the method being tested
//        String result = CharacterStatus.getPlayerLocation(0, 0);
//
//        // Assert the result
//        assertEquals("Test Location", result);
//    }
//    @Test
//    void getPlayerLocation_unknownLocation_shouldReturnUnknown() {
//        // Set up test data
//        PlayerLocation.LocationData locationData = new PlayerLocation.LocationData();
//        PlayerLocation.Location location = new PlayerLocation.Location();
//        location.setLocation("Test Location");
//        location.setX(1); // Different X coordinate
//        location.setY(1); // Different Y coordinate
//        locationData.setLocations(List.of(location));
//
//        PlayerLocation.locationData = locationData;
//
//        // Call the method being tested
//        String result = CharacterStatus.getPlayerLocation(0, 0);
//
//        // Assert the result
//        assertEquals("Unknown location", result);
//    }
//}