package packageDay4;

import java.util.Scanner;

class Polymorphism {
    // Method with no arguments
    public void sum() {
        System.out.println("Method with no arguments: sun()");
    }

    // Method with one integer argument
    public void sum(int a) {
        System.out.println("Method with one int argument: sun(" + a + ")");
    }

    // Method with one float argument
    public void sum(float a) {
        System.out.println("Method with one float argument: sun(" + a + ")");
    }

    // Method with two arguments: an integer and a string
    public void sum(int a, String b) {
        System.out.println("Method with int and String arguments: sun(" + a + ", \"" + b + "\")");
    }

    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        Scanner scanner = new Scanner(System.in);

        // Call the method with no arguments
        System.out.println("Calling sum() with no arguments:");
        obj.sum();

        // Call the method with one integer argument
        System.out.print("Enter an integer for sun(int a): ");
        int intInput = scanner.nextInt();
        obj.sum(intInput);

        // Call the method with one float argument
        System.out.print("Enter a float value for sun(float a): ");
        float floatInput = scanner.nextFloat();
        obj.sum(floatInput);

        // Call the method with an integer and a string argument
        System.out.print("Enter an integer for sun(int a, String b): ");
        int intArg = scanner.nextInt();
        
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter a string for sun(int a, String b): ");
        String strArg = scanner.nextLine();
        obj.sum(intArg, strArg);

        scanner.close();
    }
}
