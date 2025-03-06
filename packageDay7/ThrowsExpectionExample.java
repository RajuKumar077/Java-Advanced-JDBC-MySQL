package packageDay7;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsExpectionExample {

	// Method declares that it may throw a FileNotFoundException
	public static void readFile(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}

	public static void main(String[] args) {
		try {
			readFile("data.txt"); // Calling the method
		} catch (FileNotFoundException e) {
			System.out.println("Exception caught: File not found!");
		}
	}
}
