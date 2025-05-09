import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Question14 {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("source.txt");
        Path destinationPath = Paths.get("destination.txt");

        try {
            // Read all lines from source.txt
            List<String> lines = Files.readAllLines(sourcePath);

            // Write all lines to destination.txt
            Files.write(destinationPath, lines);

            System.out.println("File copied successfully using NIO.");
        } catch (IOException e) {
            System.out.println("An error occurred during file operations.");
            e.printStackTrace();
        }
    }
}

