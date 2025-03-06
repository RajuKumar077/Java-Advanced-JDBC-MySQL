package packageDay10;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        // Open the file for writing (with append mode)
        FileOutputStream fout = new FileOutputStream("R:/File/HeyThere.txt", true);
        
        // String data to be written to the file
        String data = "Hello, this is an example text to append to the file.";
        
        // Convert the string into a character array
        char[] ch = data.toCharArray();
        
        // Loop through the character array and write each character to the file
        for (int i = 0; i < ch.length; i++) {
            fout.write(ch[i]);  // Writing one character at a time
        }
        
        // Close the file output stream
        fout.close();
        
        System.out.println("Data has been written to the file successfully.");
    }
}
