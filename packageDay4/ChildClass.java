
package packageDay4;

public class ChildClass extends ParentClass {
    public static void main(String[] args) {
        // Creating an object of the child class
        ChildClass obj = new ChildClass();

        // Using the inherited method from the parent class
        obj.sum(23, 34); // Calls the sum method from ParentClass
    }
}
