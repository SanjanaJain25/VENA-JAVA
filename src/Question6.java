import java.io.*;

public class Question6 {
    public static void main(String[] args) {
        String fileName = "paragraph.txt";
        int count = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {

                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equals("Java")) {
                        count++;
                    }
                }
            }

            reader.close();
            System.out.println("The word 'Java' appears " + count + " times.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            e.printStackTrace();
        }
    }
}
