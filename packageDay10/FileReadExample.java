package packageDay10;

import java.io.*;

public class FileReadExample {
    public static void main(String args[]) {
        try {
        	
            // Creating a File object
            File file = new File("R:\\File\\HeyThere.txt"); // Change the file name accordingly
          
            // Creating a FileInputStream to read the file
            FileInputStream fis = new FileInputStream(file);
            
            int line; // Variable to store character values
            
            // Reading the file character by character
            while ((line = fis.read()) != -1) { // -1 indicates end of file
                System.out.print((char) line); // Printing characters
            }
            
            // Closing the stream
            fis.close();
            
            System.out.println("\n\nReading file using FileInputStream\n");
            
            FileInputStream fis2 = new FileInputStream("R:\\File\\HeyThere.txt");
            
            int byteData;
            
            while ((byteData = fis2.read()) != -1) {
            	
                System.out.print((char) byteData); // Reading and printing bytes
            }
            
            fis2.close();
            
            
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
