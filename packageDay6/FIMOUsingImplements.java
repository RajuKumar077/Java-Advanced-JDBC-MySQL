package packageDay6;

import java.util.Scanner;

public class FIMOUsingImplements implements FIMathOperation {

	@Override
	public int operate(int a, int b) {
		return a * b; // Implementation of multiplication
	}

	public static void main(String[] args) {

		// Using the functional interface to implement the abstract method (operate)
		FIMathOperation multiplication = new FIMOUsingImplements();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value for A: ");
		int a = sc.nextInt();
		System.out.println("Enter Value for B: ");
		int b = sc.nextInt();

		
		
		System.out.println("Multiplication result (A*B): " + multiplication.operate(a, b)); // Output: 15

		// Using the default method 'add'
		System.out.println("Addition result (A+B): " + multiplication.add(5, 3)); // Output: 8
		
		sc.close();
	}


}