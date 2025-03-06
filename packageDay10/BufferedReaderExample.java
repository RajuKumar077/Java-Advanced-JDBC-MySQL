package packageDay10;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String args[]) {
        try {
            // Creating a File object
            File file = new File("R:\\File\\HeyThere.txt"); // Ensure the file path is correct
            
            // Creating a BufferedReader using FileReader
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String line; // Variable to store each line
            
            // Reading the file line by line
            while ((line = br.readLine()) != null) { // NULL indicates end of file
                System.out.println(line); // Printing lines
            }
            
            // Closing the stream
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
