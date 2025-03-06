package packageDay5;

import java.util.ArrayList;

public class ForEachArrayList {
	public static void main(String[] args) {

		// Create an ArrayList of Strings
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Kiwi");
		fruits.add("Lemon");
		fruits.add("Orange");
		
		System.out.println("All fruits Names from ArrayList 🍇🍈🍉🥭🍏🍅 ");
		fruits.forEach(name -> System.out.println(name));
		
        fruits.forEach(name -> {
            if (name.equals("Apple")) {
                System.out.println(name);
            }
        });

        
        System.out.println("\nAll numbers of ArrayList 👇 ");
		// Create an ArrayList of Int
		ArrayList<Integer> Number = new ArrayList<>();
		Number.add(51);
		Number.add(19);
		Number.add(34);
		Number.add(32);
		Number.add(73);
		Number.add(79);
		Number.add(37);
		Number.add(20);
		Number.add(86);

		//Foreach Apply print all   
      	Number.forEach(i -> System.out.println(i));

      	System.out.println("\nEVEN numbers of ArrayList 👇 ");
		// find even out of Numbers
		Number.forEach(x ->
		{ if(x%2 ==0)
		{
		System.out.println(x);
		}
		});


	}
}

