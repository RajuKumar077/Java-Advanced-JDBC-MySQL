package packageDay6;

public class FIMOUsingLambda {
	    public static void main(String[] args) {
	        // Using lambda expression to implement the 'operate' method
	        FIMathOperation multiplication = (a, b) -> a * b;

	        // Call the lambda expression for the 'operate' method
	        System.out.println("Multiplication result: " + multiplication.operate(54, 35)); // Output: 15

	        // Using the default 'add' method from the interface
	        System.out.println("Addition result: " + multiplication.add(52, 6)); // Output: 8
	    }
	}


