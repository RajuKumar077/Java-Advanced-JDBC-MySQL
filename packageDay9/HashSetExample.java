package packageDay9;
import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {

		HashSet <String> hs = new HashSet<String>();

		hs.add("Raju");
		hs.add("Sam");
		hs.add("Robert");
		hs.add("Nick");
		hs.add("John");
		hs.add("Lily");

		HashSet <String> hs1 = new HashSet<String>();

		hs1.add("Raju kumar");
		hs1.add("Sam hunter");
		hs1.add("Robert Junior");
		hs1.add("Nick leo");
		hs1.add("John smith");
		hs1.add("Lily put");
			
		
		System.out.println("Item in HashSet: "+ hs);
		System.out.println("Item in HashSet: "+ hs1 );
		System.out.println("Is HashSet1 same as HashSet Main: "+ hs.equals(hs1));
		System.out.println("Size of HashSet 1 : "+ hs1.size());
		System.out.println("Size of HashSet Main : "+ hs.size());
		hs.removeAll(hs); // Removes every item in Hashset Main
		System.out.println("Item in HashSet: "+ hs);
		System.out.println("Item in HashSet: "+ hs.isEmpty());

		
		
	}
}
