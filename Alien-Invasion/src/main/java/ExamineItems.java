public class ExamineItems {
    public static String interactable = "none";


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

    private static String handleExamine(String[] userInput) {
        String item = userInput[1];

        interactable = ItemsJSON.getDescription(item);
        System.out.println(interactable);
        return interactable;
    }

    public static String getInteractable() {
        return interactable;
    }
}