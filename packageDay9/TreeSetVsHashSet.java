package packageDay9;
import java.util.TreeSet;
import java.util.HashSet;


public class TreeSetVsHashSet {

	public static void main(String[] args) {
		
		
        // TreeSet (Sorted Order)
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Apple");
        ts.add("Banana");
        ts.add("Cherry");
        ts.add("Dragonfruit");
        ts.add("Elderberry");
        ts.add("Fig");
        ts.add("Grapes");
        ts.add("Honeydew");
        ts.add("Indian Fig");
        ts.add("Jackfruit");

        // HashSet (Unordered)
        HashSet<String> hs = new HashSet<>();
        hs.add("Dragonfruit");
        hs.add("Elderberry");
        hs.add("Fig");
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Cherry");
        hs.add("Grapes");
        hs.add("Honeydew");
        hs.add("Indian Fig");
        hs.add("Jackfruit");
		
		
		
		
		/*
		 * // TreeSet (Sorted Order) TreeSet<String> ts = new TreeSet<>(); ts.add("A");
		 * ts.add("B"); ts.add("C"); ts.add("D"); ts.add("E"); ts.add("F"); ts.add("G");
		 * ts.add("H"); ts.add("I"); ts.add("J");
		 * 
		 * // HashSet (Unordered) HashSet<String> hs = new HashSet<>(); hs.add("D");
		 * hs.add("E"); hs.add("F"); hs.add("A"); hs.add("B"); hs.add("C"); hs.add("G");
		 * hs.add("H"); hs.add("I"); hs.add("J");
		 */

		
		
		// Print TreeSet (Always Sorted)
		System.out.println("TreeSet: " + ts);

		// Print HashSet (Should be Unordered)
		System.out.println("HashSet: " + hs);
		
		
		
		
	}
}

