package packageDay5;

import java.util.*;

import mathoperations.MathOperations;

public class MainMathOperations {
	
	public static void  main(String [] args) {
		
		Scanner sc =  new Scanner(System.in);
		MathOperations mo = new MathOperations();

		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		
		
		// Perform operations
        System.out.println("Addition: " + mo.add(num1, num2));
        System.out.println("Subtraction: " + mo.subtract(num1, num2));
        System.out.println("Multiplication: " + mo.multiply(num1, num2));
        System.out.println("Division: " + mo.divide(num1, num2));
        System.out.println("Mod: "+ mo.mod(num1, num2));

        sc.close();
	}
}