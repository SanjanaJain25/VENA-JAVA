package LogFileAnalyzer;

import java.io.*;

public class LogAnalyzer {
    public static void main(String[] args) {
        File inputFile = new File("server.log");
        File outputFile = new File("summary.txt");

        int totalLines = 0;
        int errorCount = 0;
        int warningCount = 0;

        // Step 1 & 2: Read the file and analyze data
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;

            while ((line = reader.readLine()) != null) {
                totalLines++;

                if (line.contains("ERROR")) {
                    errorCount++;
                }

                if (line.contains("WARNING")) {
                    warningCount++;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: 'server.log' file not found.");
            return; // Exit the program if file is missing
        } catch (IOException e) {
            System.out.println("Error reading the log file.");
            e.printStackTrace();
            return;
        }

        // Step 3: Write summary to summary.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("===== Log Summary Report =====\n");
            writer.write("Total log entries : " + totalLines + "\n");
            writer.write("ERROR entries     : " + errorCount + "\n");
            writer.write("WARNING entries   : " + warningCount + "\n");
            writer.write("==============================\n");

            System.out.println("Summary report written to summary.txt");
        } catch (IOException e) {
            System.out.println("Error writing to summary.txt");
            e.printStackTrace();
        }
    }
}

