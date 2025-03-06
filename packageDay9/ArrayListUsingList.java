package packageDay9;

import java.util.ArrayList;
import java.util.List;


public class ArrayListUsingList {
	public static void main(String[] args) {

		List<Integer> arrlist = new ArrayList<Integer>();

		for(int i =0;i<=45;i=i+5) {
			arrlist.add(i);
		}

		arrlist.add(0, 50);


		System.out.println("Values Store in Arrlist: "+arrlist);
		System.out.println("\nType of Arrlist: "+ arrlist.getClass().getSimpleName());
		System.out.println("\nValues Store in Arrlist: "+arrlist.getClass());
		System.out.println("\nClass of arrlist: "+arrlist.getClass().getSimpleName());
		System.out.println("\nValue present on index 5: "+arrlist.get(0));
		System.out.println("\n34 Value present in Arrlist? \n->"+arrlist.contains(34));
		System.out.println("\nIs Arrlist is Empty? \n->"+arrlist.isEmpty());
		System.out.println("\nReverse the values of Arrlist: "+arrlist.reversed());
		//System.out.println("\nUpdated Values Store in Arrlist: "+arrlist);
		
		
		List<Integer> arrlist2 = new ArrayList<Integer>();

		for(int i =0;i<=49;i=i+7) {
			arrlist2.add(i);
		}

		System.out.println("\nValues Store in Arrlist: "+arrlist2);		
		System.out.println("Using AddAll in Arrlist2: "+arrlist2.addAll(arrlist));
		System.out.println("\nValues Store in Arrlist2 with adding values of arrlist: \n"+arrlist2);

		
	}
}
