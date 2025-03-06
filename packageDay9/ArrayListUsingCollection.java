package packageDay9;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListUsingCollection {

	public static void main(String[] args) {
		
		Collection<Integer> arrlist = new ArrayList<Integer>();
		
		for(int i =0;i<=33;i=i+3) {
			arrlist.add(i);
		}
		
		System.out.println("Values Store in Arrlist: "+arrlist);
		
		System.out.println("\nType of Arrlist: "+ arrlist.getClass().getSimpleName());
		System.out.println("\nValues Store in Arrlist: "+arrlist.getClass());
		System.out.println("\nClass of arrlist: "+arrlist.getClass().getSimpleName());
	}
}
