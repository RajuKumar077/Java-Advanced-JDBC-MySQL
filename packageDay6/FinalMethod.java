package packageDay6;

class Parent {
    public final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // This will cause a compilation error
	
	/*
	 * public void display() {
	 * System.out.println("Trying to override final method"); }
	 */
}

public class FinalMethod {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.display();  // Output: This is a final method.
    }
}
