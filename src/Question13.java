import java.io.*;

public class Question13 {
    public static void main(String[] args) {
        File logFile = new File("server.log");

        try (BufferedReader reader = new BufferedReader(new FileReader(logFile))) {
            String line;

            System.out.println("Monitoring 'server.log' for errors...");

            while ((line = reader.readLine()) != null) {
                if (line.contains("Error")) {
                    System.out.println(line);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Log file 'server.log' not found.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the log file.");
            e.printStackTrace();
        }
    }
}

