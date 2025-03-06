package packageDay3;

public class StringBuilderExample {
	public static void main(String args[]) {


		// Create a StringBuilder object with initial content
		StringBuilder sb = new StringBuilder("Session");

		// Print the initial StringBuilder content
		System.out.println(sb);

		// Append " session" to the StringBuilder
		System.out.println(sb.append(" session"));

		// Print the StringBuilder after appending
		System.out.println(sb);

		// Insert "Session" at index 4
		System.out.println(sb.insert(4, "Session"));

		// Insert "valid" at index 11
		System.out.println(sb.insert(11, "valid"));

		// Reverse the StringBuilder content
		System.out.println("Reverse the StringBuilder content: "+sb.reverse());

		// Print the length of the StringBuilder
		System.out.println(sb.length());

		// Print the character at index 1
		System.out.println(sb.charAt(1));
		
		// Returns the index within this string of the first occurrence
		System.out.println(sb);
		System.out.println(sb.indexOf("o"));
	}
}
