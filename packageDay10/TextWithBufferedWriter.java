package packageDay10;

import java.io.*;

public class TextWithBufferedWriter {
	public static void main(String[] args) {
		try {
			// Creating a BufferedWriter with FileWriter in append mode (true)
			BufferedWriter writer = new BufferedWriter(new FileWriter("R:/File/HeyThere.txt", true));

			// Appending text to the file
			writer.write("Adding more text to the file using BufferedWriter.\n");
			writer.write("This will be added after the previous content.\n");
			writer.newLine();

			writer.append("new line appending");// this line as added to next line because of newLine
			writer.flush();
			// Closing the BufferedWriter stream
			writer.close();

			System.out.println("More text appended to the file successfully!");
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
