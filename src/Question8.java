import java.io.*;

public class Question8 {
    public static void main(String[] args) {
        String fileName = "employees.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line.toUpperCase());  // Convert line to uppercase and print
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

