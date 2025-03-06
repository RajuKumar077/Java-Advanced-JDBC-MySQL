package packageDay3;

public class StringBufferExample {
    public static void main(String args[]) {
    	
        // Create a StringBuffer object with initial content
        StringBuffer sb = new StringBuffer("Systan.");

        // Print the initial StringBuffer content
        System.out.println(sb);

        // Append " session" to the StringBuffer
        System.out.println(sb.append(" session"));

        // Print the StringBuffer after appending
        System.out.println(sb);

        // Insert "Session" at index 4
        System.out.println(sb.insert(4, "Session"));

        // Insert "valid" at index 11
        System.out.println(sb.insert(11, "valid"));

        // Reverse the StringBuffer content
        System.out.println(sb.reverse());

        // Print the length of the StringBuffer
        System.out.println(sb.length());

        // Print the character at index 1
        System.out.println(sb.charAt(1));
    }
}
