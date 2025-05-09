import java.io.*;

public class Question12 {
    public static void main(String[] args) {
        File folder = new File("documents"); // Folder containing .txt files
        File mergedFile = new File("merged.txt"); // Output file

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile))) {

            if (folder.exists() && folder.isDirectory()) {
                File[] files = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));

                if (files != null && files.length > 0) {
                    for (File file : files) {
                        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                            String line;
                            while ((line = reader.readLine()) != null) {
                                writer.write(line);
                                writer.newLine(); // To preserve line breaks
                            }
                            writer.newLine(); // Add extra line between files
                        }
                    }
                    System.out.println("All .txt files have been merged into merged.txt.");
                } else {
                    System.out.println("No .txt files found in the folder.");
                }
            } else {
                System.out.println("Folder 'documents' does not exist.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred during merging.");
            e.printStackTrace();
        }
    }
}
