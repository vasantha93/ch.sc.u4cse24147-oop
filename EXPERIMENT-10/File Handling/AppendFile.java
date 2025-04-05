import java.io.FileWriter;
import java.io.IOException;

public class AppendFile{
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt", true); // `true` = append mode
            writer.write("\nThis line was appended to the file.");
            writer.close();
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending to the file: " + e.getMessage());
        }
    }
}
