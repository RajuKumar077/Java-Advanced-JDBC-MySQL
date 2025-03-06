package packageDay9;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		// TreeSet (Sorted Order)
		LinkedHashSet<String> lhs = new LinkedHashSet<>();

		lhs.add("Apple");
		lhs.add("Banana");
		lhs.add("Cherry");
		lhs.add("Dragonfruit");
		lhs.add("Elderberry");
		lhs.add("Fig");
		lhs.add("Grapes"); // Only one time it will count and keep it
		lhs.add("Grapes");
		lhs.add("Grapes");
		lhs.add("Grapes");

		System.out.println("Items in LinkedHashSet: \nTreeSet (Sorted Order) ->" + lhs);
		System.out.println("Size of LinkedHashSet: " + lhs.size());

		lhs.addAll(lhs); // No effect after adding
		System.out.println("Size of LinkedHashSet: " + lhs.size());

		lhs.add("Orange"); // No effect after adding
		System.out.println("Size of LinkedHashSet: " + lhs.size());

		lhs.removeAll(lhs);
		System.out.println("Size of LinkedHashSet: " + lhs.size());


		Iterator<String> l = lhs.iterator();

		while(l.hasNext()) { System.out.println(l.next()); }


	}
}
