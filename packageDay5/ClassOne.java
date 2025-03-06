package packageDay5;


public class ClassOne {
	
 public int number = 1; 
 private String message = "Hello from Class - 1"; 

 // Public method to return private variable
 public String getMessage() {
     return message;
 }

 // Public method
 public void display() {
     System.out.println("This is a method from Class 1.");
 }
}
