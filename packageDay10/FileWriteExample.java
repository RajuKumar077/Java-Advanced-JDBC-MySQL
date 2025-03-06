package packageDay10;

import java.io.*;

public class FileWriteExample {
    public static void main(String[] args) {
        try {
            // Creating a File object for the target file
            FileWriter writer = new FileWriter("R:\\File\\HeyThere.txt"); 
            
            // Writing text to the file
            writer.write("\n HAHAHA I am enjoying in another world \n");
            writer.write("written successfully!");
            writer.write("Adding more text to the file.\n");
            writer.write("This will be added after the previous content.\n");

            writer.append("\n i am new ");
        

            // Closing the writer stream
            writer.close();

            System.out.println("Text written to the file successfully!");
            
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
