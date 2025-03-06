package packageDay9;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String args[]) {
		
		
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		
		hm.put("English",96);
		hm.put("Maths",92);
		hm.put("Physics",(int) 97.5);
		hm.put("History",95);
		hm.put("Evs",99);
		hm.put(null,99);
		hm.put(null,43);
		
		System.out.println("Vaules in HashMap: "+ hm);
		System.out.println("\nAll Subject Names: "+hm.keySet());
		System.out.println("\nAll Subject Marks: "+hm.values());
		
		System.out.println("\n");
		
	    for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key = " + key + ", Value = " + value);
        }
		
	

	}
}