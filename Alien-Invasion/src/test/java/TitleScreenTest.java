import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

public class TitleScreenTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream("TestInput\n".getBytes());

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setIn(inContent);
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
        System.setIn(System.in);
    }

    @Test
    public void testDisplayTitleScreen() {
        String filepath = "C:\\Practical_Application\\Sprint_One\\Alien-Invasion\\src\\resources";
        Path testFilePath = Paths.get(filepath, "testfile.txt");

        // Assuming testfile.txt contains some test content
        // Add your test file content here...

        // Redirect the standard input stream to the test input
        System.setIn(new ByteArrayInputStream("\n".getBytes()));

        // Redirect the standard output stream to capture the printed content
        System.setOut(new PrintStream(outContent));

        TitleScreen.displayTitleScreen(testFilePath.toString());

        // Assert the content printed to the console
        String expectedOutput = "TestFileContent";  // Replace with the expected content
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
