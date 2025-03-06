package packageDay6;

import java.util.Scanner;

public class FIMOMain implements FIMathOperation , FIMathOperationTwo {

	@Override
	public int operate(int a, int b) {
		return a*b;
	}
	
	
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return FIMathOperation.super.add(a, b);
	}

	public static void main(String[] args) {
		
		FIMathOperation multiplication = new FIMOMain();
		FIMathOperationTwo multiplicationTwo =  new FIMOMain();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value for A: ");
		int a = sc.nextInt();
		System.out.println("Enter Value for B: ");
		int b = sc.nextInt();

		// FIMathOperation.super.add(2,3);
		
		System.out.println("Multiplication result (A*B): " + multiplicationTwo.operate(a, b)); // Output: 15

		// Using the default method 'add'
		System.out.println("Addition result (A+B): " + multiplicationTwo.add(5, 3)); // Output: 8
		
		sc.close();
		
		
		
	}
	
	

}
