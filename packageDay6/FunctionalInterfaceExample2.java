package packageDay6;

@FunctionalInterface
interface Functional {
    void singleMethod(); // Only one abstract method

    default void defaultMethod() {
        System.out.println("Default Method");
    }

    static void staticMethod() {
        System.out.println("Static Method");
    }
}

public class FunctionalInterfaceExample2  {
	public static void main(String [] args) {
		
		Functional obj = () -> System.out.println("Single Method implementation using Lambda");
		obj.singleMethod();
		
		Functional.staticMethod(); // Static method
		
		obj.defaultMethod(); // default called by object
		
		
	}

}
