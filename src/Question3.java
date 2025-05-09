import java.io.File;

public class Question3 {
    public static void main(String[] args) {
        String fileName = "report.pdf"; // File to check
        File file = new File(fileName); // Create File object

        if (file.exists()) {
            System.out.println("File '" + fileName + "' exists.");
            System.out.println("File size: " + file.length() + " bytes");
        } else {
            System.out.println("File '" + fileName + "' does NOT exist in the current directory.");
        }
    }
}

