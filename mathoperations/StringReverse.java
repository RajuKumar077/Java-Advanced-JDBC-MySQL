package mathoperations;

public class StringReverse {

	public static void main(String[] args)
	{ 
		String str = "Hello, World!";

		String reversed = new StringBuilder(str).reverse().toString();

		System.out.println(reversed); 
	}

}

