import java.io.File;

public class Question10 {
    public static void main(String[] args) {
        File folder = new File("documents"); // Folder name

        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();

            if (files != null && files.length > 0) {
                System.out.println("Files and directories in 'documents':");
                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println("[DIR]  " + file.getName());
                    } else {
                        System.out.println("[FILE] " + file.getName());
                    }
                }
            } else {
                System.out.println("The 'documents' folder is empty.");
            }
        } else {
            System.out.println("The 'documents' folder does not exist.");
        }
    }
}
