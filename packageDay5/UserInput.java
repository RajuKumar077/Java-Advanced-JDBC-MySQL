package packageDay5;
import java.util.*;

public class UserInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// Using NEXT
        System.out.print("Enter A: ");
        String a = scanner.next(); 

        scanner.nextLine(); 
        
        // Using NEXTLINE
        System.out.print("Enter B: ");
        String b = scanner.nextLine(); 

        System.out.println("Value of A: " + a);
        System.out.println("Value of B: " + b);
		
		
		// Get string input
		System.out.print("Enter your Name: ");
		scanner.nextLine(); 
		String name = scanner.nextLine();
		
		// Get integer input
		System.out.print("Enter your User Id (integer): ");
		int userId = scanner.nextInt();


		// Get integer input
		System.out.print("Enter your Age (integer): ");
		int age = scanner.nextInt();

		// Get double input
		System.out.print("Enter your Height in meters (decimal): ");
		double height = scanner.nextDouble();


		// Get character input
		System.out.print("Enter your grade (single character): ");
		char grade = scanner.next().charAt(0);

		// Get boolean input
		System.out.print("Are you attending class today? (true/false): ");
		boolean isJavaFun = scanner.nextBoolean();
		
		scanner.close();

		// Print all values
		System.out.println("\nUser Input Summary");
		System.out.println("Name: " + name);
		System.out.println("User-Id: " + userId);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height + " meters");
		System.out.println("Grade: " + grade);
		System.out.println("Is Java Fun? " + isJavaFun);
	}
}


