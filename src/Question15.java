import java.io.*;
import java.util.*;

public class Question15 {
    public static void main(String[] args) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        File inputFile = new File("input.txt");
        File outputFile = new File("charcount.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            int ch;

            // Read character-by-character
            while ((ch = reader.read()) != -1) {
                char character = (char) ch;

                // Increment count for this character
                charCountMap.put(character, charCountMap.getOrDefault(character, 0) + 1);
            }

            // Write the result to charcount.txt
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                    writer.write("'" + entry.getKey() + "' : " + entry.getValue());
                    writer.newLine();
                }
            }

            System.out.println("Character frequencies written to charcount.txt");

        } catch (IOException e) {
            System.out.println("An error occurred while processing the file.");
            e.printStackTrace();
        }
    }
}
