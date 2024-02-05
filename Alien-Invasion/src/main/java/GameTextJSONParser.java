import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;

class GameTextJSONParser {
    public static void jsonReader(){
        String path = "./static/storyText.json";

        try {
            FileReader fileReader = new FileReader(path);
            JSONTokener jsonTokener = new JSONTokener(fileReader);

            JSONObject jsonObject = new JSONObject(jsonTokener);

            //This can remain the same
            JSONObject storyObject = jsonObject.getJSONObject("Story");

            // We will want to generate this dynamically based on actual player location/ scene progression
            JSONObject sceneObject = storyObject.getJSONObject("Scene 1");


            // This will need to be dynamic based on whatever player has input
            String story = sceneObject.getString("Story");

            System.out.println(story);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}