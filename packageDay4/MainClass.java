package packageDay4;

import java.util.*;

public class MainClass {
	
	static int b = 12; // static variable 
	int instanceVar = 25; // predefined value
	int instanceVar2 ; // later in code defined by Scnner class

	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	// defining the object of MainClass for initializing the value of instanceVar2
    	MainClass obj = new MainClass();
    	
    	System.out.print("Here we are giving value to Enter instance variable: ");
    	
    	
    	obj.instanceVar2 = scanner.nextInt() ;
    	
    	System.out.println(obj.instanceVar2);
    	
    	char a = scanner.next().charAt(0);
    	System.out.println(a);
    	
    	
    
    	
    	System.out.print("Enter first Number : ");
    	int num1 = scanner.nextInt();
    	System.out.print("Enter Second Number: ");
    	int num2 = scanner.nextInt();
    	
    	int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner
        scanner.close();
    	
        
  	    int roll = 0;
    	System.out.println("Roll Number is: "+roll);
    	
    	// Create an object of the MainClass to access the instance variable
        MainClass mainObj = new MainClass();

        // Access the instance variable using the object
        System.out.println("Value of instance variable: " + mainObj.instanceVar);
        
        // Access the static variable directly
    	System.out.println("Value of static b: " + b);
    	
        // Create an object of the SumCalculator class
    	MethodCall calculator = new MethodCall();
    	MethodCall nameObj = new MethodCall();
        
        // Input numbers
        int number1 = 10;
        int number2 = 20;

        // Call the method to calculate the sum
        int result = calculator.calculateSum(number1, number2);

        // Print the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + result);
        
        nameObj.name("Raju"); 
        
    }
}
