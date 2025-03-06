package packageDay6;

class FinalStaticExample {
    static final double PI; // Final static variable

    static {
        PI = 3.14159; // Initialized in static block
    }

    void display() {
        System.out.println("Value of PI: " + PI);
    }
}


class Car {
    int speedLimit;  // Final instance variable
    static final double PI = 3.14159;  // Final static variable

    // Constructor to initialize final instance variable
    Car(int limit) {
        speedLimit = limit;
    }

    void showSpeedLimit() {
        System.out.println("Speed Limit: " + speedLimit);
    }

    void showPI() {
        System.out.println("PI: " + PI);
    }

    void printNumber(final int num) {  // Final parameter
        System.out.println("Number: " + num);
    }
}


public class FinalVariableExample {
    public static void main(String[] args) {
    	
    	FinalStaticExample example = new FinalStaticExample();
        example.display(); // Output: Value of PI: 3.14159
        
        
        // Final reference variable
        final Car myCar = new Car(120);  // Final reference variable
        myCar.showSpeedLimit();  // Output: Speed Limit: 120

        // Final local variable
        final int maxSpeed = 150;  // Final local variable
        System.out.println("Max Speed: " + maxSpeed);  // Output: Max Speed: 150

        myCar.showPI();  // Output: PI: 3.14159

        // Final parameter
        myCar.printNumber(25);  // Output: Number: 25

        // Modifying object properties (final reference variable)
        myCar.speedLimit = 130;  // Allowed: Changing object's property (speedLimit)
        myCar.showSpeedLimit();  // Output: Speed Limit: 130

        // Uncommenting below line will cause an error (cannot reassign final reference)
        // myCar = new Car(200);  // Error: Cannot assign a new object to final reference
    }
}





