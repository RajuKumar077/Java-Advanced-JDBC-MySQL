package packageDay3;

public class WhileLoop {
	public static void main(String[] args) {

		System.out.println("Using while loop:");

		int count = 1;

		while (count <= 5) {

			System.out.println("Count is: " + count);
			count++;
		}

		System.out.println("\nUsing do-while loop:");

		int number = 1;

		do {
			System.out.println("Number is: " + number);
			number++;
		} 

		while (number <= 5); 

		// Main Diff 🔽

		System.out.println("\nDifference example:");

		int x =6;

		System.out.println("Using while loop when condition is false:");

		while (x <= 5) {
			System.out.println("This will not print because the condition is false.");
		}

		System.out.println("\nUsing do-while loop when condition is false:");

		do {
			System.out.println("This will print once even if the condition is false.");
			x++;
		} while (x <= 5);

	}
}