package packageDay10;

import java.io.File;

public class FileFunctionsDemo {
    public static void main(String[] args) {
        // Specify the file or directory path
        File file = new File("R:\\File\\HeyThere.txt"); // Change the file path accordingly

        // Check if the file exists
        System.out.println("Does the file exist? " + file.exists());

        // Check if it's a file (not a directory)
        System.out.println("Is it a file? " + file.isFile());

        // Check if it's a directory
        System.out.println("Is it a directory? " + file.isDirectory());

        // Check the length of the file (in bytes)
        if (file.isFile()) {
            System.out.println("File size: " + file.length() + " bytes");
        }

        // Check the last modified timestamp of the file
        System.out.println("Last modified: " + file.lastModified());

        // Get the absolute path of the file
        System.out.println("Absolute path: " + file.getAbsolutePath());

        // Get the canonical path of the file
        try {
            System.out.println("Canonical path: " + file.getCanonicalPath());
        } catch (Exception e) {
            System.out.println("Error while getting canonical path: " + e.getMessage());
        }

        // Rename the file (or move it)
        File newFile = new File("R:\\File\\HeyThereRenamed.txt");
        if (file.renameTo(newFile)) {
            System.out.println("File renamed successfully to: " + newFile.getName());
        } else {
            System.out.println("Failed to rename the file.");
        }

        // Create a new directory using mkdir() (single directory)
        File dir = new File("R:\\File\\NewDir");
        if (dir.mkdir()) {
            System.out.println("Directory created: " + dir.getName());
        } else {
            System.out.println("Failed to create directory.");
        }

        // Create directories using mkdirs() (including parent directories)
        File multipleDirs = new File("R:\\File\\NewDir\\SubDir");
        if (multipleDirs.mkdirs()) {
            System.out.println("Directories created: " + multipleDirs.getPath());
        } else {
            System.out.println("Failed to create directories.");
        }

        // Delete the file or directory
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
        
        
    }
}
