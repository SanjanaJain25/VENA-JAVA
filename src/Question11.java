import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question11 {
    public static void main(String[] args) {
        String sourceFile = "image.jpg";
        String destFile = "image_copy.jpg";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[1024]; // 1 KB buffer
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Image copied successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred during file copy.");
            e.printStackTrace();
        }
    }
}
