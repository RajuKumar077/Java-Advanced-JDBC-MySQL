package packageDay5;

public class ClassTwo {
 public static void main(String[] args) {
	 
	 
     ClassOne obj = new ClassOne(); // Create object of ClassOne

     // Access public variable
     System.out.println("Public variable: " + obj.number);

     // Access private variable via public method
     System.out.println("Private variable via getter: " + obj.getMessage());

     // Call public method
     obj.display();
     
     
 }
}
