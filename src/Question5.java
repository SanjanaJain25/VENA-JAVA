import java.io.*;

public class Question5 {
    public static void main(String[] args) {
        String sourceFile = "source.txt";   // File to copy from
        String destinationFile = "backup.txt";  // File to copy to

        try {
            // Open the source file for reading
            FileReader fr = new FileReader(sourceFile);
            BufferedReader br = new BufferedReader(fr);

            // Open the destination file for writing
            FileWriter fw = new FileWriter(destinationFile);
            BufferedWriter bw = new BufferedWriter(fw);

            String line;
            // Read each line from source and write to destination
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();  // Write a new line in backup file
            }

            // Close both files
            br.close();
            bw.close();

            System.out.println("File copied successfully to " + destinationFile);
        } catch (IOException e) {
            System.out.println("An error occurred during file copy.");
            e.printStackTrace();
        }
    }
}
