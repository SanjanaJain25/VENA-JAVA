import java.io.FileWriter;
import java.io.IOException;

public class Question1 {
    public static void main(String[] args) {
        String fileName = "notes.txt";
        String content = "This is My first Line in Java";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }
    }
}
