package packageDay5;

public class Main {
    int roll;

    // Constructor (no return type)
    Main(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Roll number: " + roll;
    }

    public static void main(String[] args) {
    	
        // Create an object with the constructor
        Main obj = new Main(23);
        
        // Print the object's roll number using toString
        System.out.println(obj);
    }
}
