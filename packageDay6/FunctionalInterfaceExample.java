package packageDay6;
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
    	
        // Lambda expression to multiply a number by 2
    	FunctionalInterfaceNumber multiplyByTwo = (number) -> number * 2;
    	
        // Invoke the method
        int result = multiplyByTwo.operate(5); // Example: 5 * 2
        System.out.println("Result: " + result); // Output: 10
    }
}
