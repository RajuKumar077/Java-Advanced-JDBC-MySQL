package packageDay9;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("filename.txt"); // Replace with your file name
        int i;
        while ((i = fr.read()) != -1) { // Read character by character
            System.out.print((char) i);
        }
        fr.close();
    }
}
