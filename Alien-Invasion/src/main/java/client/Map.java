package client;



public class Map {
 private static final String commandFilepath = "./static/commandCenterMap.txt";
 public static void showMap() {
     TitleScreen.displayAsciiArt(commandFilepath);
 }

}