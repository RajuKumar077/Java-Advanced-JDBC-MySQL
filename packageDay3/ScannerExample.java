package packageDay3;
import java.util.*;

public class ScannerExample {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking different types of input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read a string input

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // Read an integer input

        System.out.print("Enter your height (in cm): ");
        double height = scanner.nextDouble();  // Read a double input

        // Output the inputs
        System.out.println("\nYour details are:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");

        
        int number = scanner.nextInt();  // Read an integer input

        // Type Conversion: Convert integer (age) to double
        double numberInDouble = (double)number;  // Casting int to double

        // Output the inputs with type conversion result
        System.out.println("\nYour Number as a double is: " + numberInDouble);
        

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
