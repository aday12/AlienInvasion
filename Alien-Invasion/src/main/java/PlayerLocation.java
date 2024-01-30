public class PlayerLocation {

    public static void location() {

        // Step1: Hard Code a location description
        System.out.println("** Current Location: Command Center **");
//        System.out.println(
//                "Description: You are in the main hub of the ship, surrounded by flashing consoles and crew members working diligently.");

        // Step2: Set a variable with the location description and display it
//        String locationDescription = "You find yourself in a dimly lit corridor, with eerie silence filling the air.";
//        System.out.println("\n** Current Location: Corridor **");
//        System.out.println("Description: " + locationDescription);

        // Step3: Use an Array with location descriptions and display the correct value
//        String[] locationDescriptions = {
//                "As you step through the entrance, you are greeted by a room bustling with activity.\r\n" + //
//                        "\r\n" + //
//                        "Eastern Wall: The entire eastern wall is lined with an array of high-tech decryption equipment. These sophisticated machines hum with activity, ensuring the secure and encrypted communication of the starship's data.\r\n"
//                        + //
//                        "\r\n" + //
//                        "Western Wall: Turning your attention to the west, you notice a sturdy metal door, a portal leading to uncharted areas of the starship. It beckons with the promise of undiscovered mysteries and adventures.\r\n"
//                        + //
//                        "\r\n" + //
//                        "Northern Wall: On your left, another solid metal door stands, leading northward. This door conceals the secrets of the starship's inner workings and its fascinating journey through the cosmos.\r\n"
//                        + //
//                        "\r\n" + //
//                        "Panoramic Window: Casting your gaze to the north wall, a breathtaking panoramic window offers a mesmerizing view of the vast expanse of space. Beyond this window, the universe unfolds in all its glory, with stars glistening like diamonds against the velvety black backdrop.\r\n"
//                        + //
//                        "\r\n" + //
//                        "Central Area: In the center of the room, a specialized command computer takes center stage. This powerful machine, adorned with blinking lights and illuminated buttons, serves as the nerve center for receiving and decoding radio transmissions from across the galaxy. It's a hub of communication and decision-making.\r\n"
//                        + //
//                        "\r\n" + //
//                        "South Wall: Along the southern wall, an information board hangs, displaying a dynamic stream of mission-critical updates, star charts, and real-time status reports. It provides the crew with essential data for their journey.\r\n"
//                        + //
//                        "\r\n" + //
//                        "Computer Desk: Adjacent to the command computer, a simple desk supports the vital machinery. On this desk, a discreet trashcan is positioned, serving as a practical and organized space for disposing of waste and maintaining cleanliness.\"",
//
//                "As you step closer to the entrance, the ambiance shifts dramatically. The lighting within this room is dimmed, creating an atmosphere of otherworldly mystique. Walls adorned with sleek, futuristic panels seem to pulse with faint, ethereal light.\r\n"
//                        + //
//                        "\r\n" + //
//                        "In the center of the room, there stands a raised platform, upon which rests a high-tech console. Upon this console, you spot a state-of-the-art virtual reality headset and a matching body suit, both exuding an air of cutting-edge technology. The headset appears to promise a journey into a digital realm, while the body suit suggests an immersive experience that engages all your senses.\r\n"
//                        + //
//                        "\r\n" + //
//                        "The walls of the chamber are adorned with abstract patterns, resembling a digital dreamscape. Large screens are embedded in the walls, suggesting that observers outside can monitor and enjoy the experience of the user within.\r\n"
//                        + //
//                        "\r\n" + //
//                        "The room seems to invite you to step in and explore a world beyond the stars, a simulated adventure that transcends the boundaries of the physical ship and plunges you into realms uncharted.\r\n"
//                        + //
//                        "\r\n" + //
//                        "For now, the headset and body suit sit silently, awaiting their next wearer. This virtual reality chamber holds the promise of transporting you to distant galaxies or realms of pure imagination. Its presence hints at a world of possibilities and adventures yet to be experienced within the TLG Alactica.",
//                "This is the sleeping quarters of the starship.",
//                "Welcome to the Mystery Room!"
//        };
//
//        int currentLocationIndex = 1; // Change this index to display different descriptions
//        System.out.println("\n** Current Location: " + getLocationName(currentLocationIndex) + " **");
//        System.out.println("Description: " + locationDescriptions[currentLocationIndex]);
    }

    // helper method to get a location name based on its index in the array
    private static String getLocationName(int index) {
        switch (index) {
            case 0:
                return "Command Center";
            case 1:
                return "Virtual Reality Chamber";
            case 2:
                return "Sleep Quarters";
            case 3:
                return "Mystery Room";
            default:
                return "Unknown Location";
        }
    }
}