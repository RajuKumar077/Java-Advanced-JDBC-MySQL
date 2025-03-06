package packageDay3Subfile;

import java.util.ArrayList;

public class ArrayListFor {
    public static void main(String[] args) {
    	
        // Creating an ArrayList of fruits using add() method
        ArrayList<String> fruits = new ArrayList<>();
        
        // Adding fruit names individually using add()
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Pineapple");

        // Printing the ArrayList
        System.out.println("Fruits: " + fruits);
        
        System.out.println("\nDown is printing using :: 👇 ");
        
        // Using Foreach 
        fruits.forEach(System.out::println);
        
    }
}


