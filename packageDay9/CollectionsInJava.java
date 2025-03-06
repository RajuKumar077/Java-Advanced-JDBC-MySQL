package packageDay9;

import java.util.ArrayList;
import java.util.List;



public class CollectionsInJava {
    public static void main(String[] args) {
       

        // 1. List<Integer> (Interface)
        List<Integer> list = new ArrayList<>();  // Can hold multiple integers
        list.add(20);
        list.add(30);
        
        
        // 3. ArrayList<Integer> (Concrete implementation)
        ArrayList<Integer> al = new ArrayList<>();
        al.add(40);
        al.add(50);

        // Printing values
        System.out.println("List<Integer>: " + list);
        System.out.println("ArrayList<Integer>: " + al);
        
        for(int a :list) {
        	System.out.println(a);
        }
        
        
        System.out.println("\nValue stored in al for now 👇");
        for(int a :al) {
        	System.out.println(a);
        }
        
        //adding 34 to ArrayList
        System.out.println("\nAdding 34 to al: "+al.add(34));
        
        System.out.println("\nValue stored in al after adding 34 👇");
        for(int a :al) {
        	System.out.println(a);
        }
        
        System.out.println("\nAdding 99 value at 0 inedex of list 👇");
        list.add(0, 99);
        System.out.println(list);
        
        System.out.println("\nGetting Last Value of List: "+ list.getLast());
        
        
        
        
    }
}
