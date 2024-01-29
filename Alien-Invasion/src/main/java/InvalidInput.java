public class InvalidInput {
    private String[] validInputWords = {"look", "around", "observe", "inspect", "approach", "interact", "computer", "examine", "door", "read",
            "note", "check", "trashcan", "table", "inspect", "slime", "goo", "open", "take", "attack", "hit", "use", "interact", "discard",
            "throw", "inventory", "items", "unlock", "analyze", "help"};


    private boolean isValid = false;
    public void checkValidInput(String word) {
        for (String valid : validInputWords){
            if (word.equalsIgnoreCase(valid)) {
                isValid = true;
                break;
            }
        }
        if (!isValid){
            System.out.println("The entered text is invalid, please type 'help' if you would like to know a list of valid commands.");
        }
    }
}