package packageDay9;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample  {
	public static void main(String[] args) {

		TreeSet <String> ts = new TreeSet<String>();

		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("D");
		ts.add("E");
		ts.add("F");

		TreeSet <String> ts1 = new TreeSet<String>();

		ts1.add("Raju kumar");
		ts1.add("Sam hunter");
		ts1.add("Robert Junior");
		ts1.add("Nick leo");
		ts1.add("John smith");
		ts1.add("Lily put");
	
		
		System.out.println("Item in (Sorted Order) TreeSet: "+ ts); // Sorted Order
		System.out.println("Item in TreeSet: "+ ts1 );
		System.out.println("Is TreeSet1 same as TreeSet Main: "+ ts.equals(ts1));
		System.out.println("Size of TreeSet 1 : "+ ts1.size());
		System.out.println("Size of TreeSet Main : "+ ts.size());
		ts.removeAll(ts); // Removes every item in Hashset Main
		System.out.println("Item in TreeSet: "+ ts);
		System.out.println("Item in TreeSet: "+ ts.isEmpty());

		
		
	}
}
