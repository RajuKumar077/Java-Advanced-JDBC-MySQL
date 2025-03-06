package packageDay3Subfile;
import java.util.ArrayList;

class Fruit {
	String name;

	// Constructor to initialize the fruit name
	Fruit(String name) {
		this.name = name;
		System.out.println("Added fruit: " + this.name);
	}
}

public class UsingNew {
	public static void main(String[] args) {
		
		// Creating an ArrayList of fruit names manually using add()
		ArrayList<String> fruits = new ArrayList<>();

		// Adding fruit names individually using add()
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Pineapple");

		// Using method reference for constructor to create Fruit objects
		fruits.forEach(Fruit::new);  // CLASS::new is a reference to the constructor of Fruit class
		
	}
}


