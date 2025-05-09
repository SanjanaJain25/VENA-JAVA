import java.io.*;

public class Question4 {
    public static void main(String[] args) {
        String fileName = "data.txt";
        int lineCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while (reader.readLine() != null) {
                lineCount++;  // Increment line count for every non-null line
            }
            reader.close();

            System.out.println("Total number of lines in " + fileName + ": " + lineCount);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + fileName);
            e.printStackTrace();
        }
    }
}

