package mathoperations;


// This package is meant for importing it into different package file 

public class MathOperations {

    // Add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divide two numbers
    public double divide(int a, int b) {
        if (b != 0) {
            return (float) a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }
    
    // Mod two numbers
    public float mod(int a , int b) {
    	return a%b ;
    }

}
