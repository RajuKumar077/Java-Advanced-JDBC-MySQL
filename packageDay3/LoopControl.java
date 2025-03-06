package packageDay3;


public class LoopControl {
	public static void main(String[] args) {

		// Example with break
		System.out.println("Using break in the loop:");
		for (int i = 1; i <= 10; i++) {
			if (i == 6) {
				System.out.println("Breaking the loop at i = " + i);
				break; // Exits the loop when i is 6
			}
			System.out.println("i = " + i);
		}

		// Example with continue
		System.out.println("\nUsing continue in the loop:");
		for (int i = 1; i <= 10; i++) {
			if (i == 6) {
				System.out.println("Skipping i = " + i);
				System.out.println("i = " + i);
				continue; // Immediately skips the rest of the loop for this iteration

			}
			System.out.println("i = " + i);
		}
	}
}

