import java.io.*;
import java.time.LocalDate;

public class Question7 {
    public static void main(String[] args) {
        String fileName = "log.txt";

        try {
            // Open file in append mode
            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);

            // Get current date
            LocalDate currentDate = LocalDate.now();

            // Append the line
            bw.write("Last updated on " + currentDate.toString());
            bw.newLine();  // Adds a new line at the end

            bw.close();

            System.out.println("Date appended successfully to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}

