import java.util.Arrays;
import java.util.Dictionary;
import java.util.Scanner;

public class ExamineItems {


    public static void examine(String item) {
//        String[] userInput = {"look", "table"};
        String[] userInput = item.split(" ");
        switch (userInput[0]) {
            case "look":
            case "examine":
            case "inspect":
            case "interact":
            case "analyze":
                handleExamine(userInput);
        }

    }

    private static void handleExamine(String[] userInput) {
        int itemLocationInList = 0;
        String[] interactables = {"computer", "north-door", "west-door", "note", "trashcan", "table", "slime", "goo", "board", "blank-board"};
        String[] interactablesDescriptions = {"As you approach the colossal computer console, you notice a myriad of screens displaying celestial " +
                "maps and data streams. The control panels are adorned with touch-sensitive interfaces, showcasing the technological prowess of Battlestar Alactica. " +
                "It seems capable of navigating the ship through the vastness of space.", "The door to the right stands tall, its surface marked with the scars of countless" +
                " missions. A faint hum emanates from the sealed edges, hinting at the unknown territories that lie beyond. The control panel glows softly, awaiting activation t" +
                "o reveal the secrets of the ship.", "The door to the left beckons with a soft glow from its control panel. It promises access to a different section of Battlestar Alactica, " +
                "perhaps crew quarters or specialized chambers. The panel awaits activation, poised for the touch of those entrusted with the ship's command.", "Unfolding the note, you reveal an " +
                "enigmatic message scrawled upon it. The paper feels slightly worn, suggesting it has passed through many hands before finding its way to the command table. The words resonate " +
                "with the ambiance of the Command Center, reinforcing the gravity of the decisions that await you in space.", "Beside the colossal computer, just before the door, a" +
                " small trashcan discreetly occupies its space. A crumpled piece of paper peeks out, hinting at the discarded remnants of decisions made and messages received. It might be " +
                "worth investigating, as even the smallest detail can hold significance in the vastness of space.", "As you stride towards the sturdy table on the right, " +
                "holographic displays showcase intricate spaceship models and stellar charts. The surface is immaculate, reflecting the meticulous nature of the crew's planning. " +
                "It appears to be a hub for discussions, strategic decisions, and the coordination of Battlestar Alactica's operations.", "In the far left corner, a strange slime " +
                "lies on the floor. " +
                "Its alien composition gleams in hues of iridescence, casting an otherworldly glow. The air around it seems charged with an enigmatic energy. Could this be the " +
                "mysterious slime mentioned in the note you discovered earlier?", "In the far left corner, a strange slime lies on the floor. Its alien composition gleams in hues " +
                "of iridescence, casting an otherworldly glow. The air around it seems charged with an enigmatic energy. Could this be the mysterious slime mentioned in the note " +
                "you discovered earlier?", "Turning to your right, another board comes into view. Filled with dynamic holographic displays and a myriad of annotations, " +
                "it appears to be a strategic overview, detailing recent encounters and mission objectives. It's a visual tapestry of the ongoing narrative of " +
                "Battlestar Alactica's odyssey.", "The blank board on your left dominates the wall, patiently awaiting the strategic orchestrations of the ship's commanders. " +
                "It's a canvas of possibilities, ready to be filled with mission plans, enemy encounters, and the destiny of Battlestar Alactica. The air around it seems charged with " +
                "the weight of decisions yet to be made."};
        for (String item : interactables) {
            if (userInput[1].toLowerCase().equals(item)) {
                itemLocationInList = Arrays.asList(interactables).indexOf(item);
            }
        }
        System.out.println(interactablesDescriptions[itemLocationInList]);
    }
}