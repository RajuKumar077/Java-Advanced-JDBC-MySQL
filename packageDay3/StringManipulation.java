package packageDay3;

public class StringManipulation {
    public static void main(String[] args) {
        // Original String
        String original = "Hello, There! How are you";

        // 1. Concatenation
        System.out.println(original + " Welcome to Java.");
        
        // 2. Substring
        String substring = original.substring(7, 12); // Extract "World"
        System.out.println("Substring: " + substring);

        // 3. Replace
        String replaced = original.replace("Hello", "Hi");
        System.out.println("Replaced String: " + replaced);

        // 4. Convert to Uppercase
        String uppercase = original.toUpperCase();
        System.out.println("Uppercase: " + uppercase);

        // 5. Convert to Lowercase
        String lowercase = original.toLowerCase();
        System.out.println("Lowercase: " + lowercase);

        // 6. Find the length of the string
        int length = original.length();
        System.out.println("Length of String: " + length);
        

        // 7. Check if String contains a word
        boolean containsWord = original.contains("World");
        System.out.println("Contains 'World': " + containsWord);

        // 8. Trim whitespace
        String stringWithSpaces = "   Java Programming   ";
        System.out.println("Trimmed String: "+ "'"+stringWithSpaces.trim()+"'");
        

        // 9. Compare strings
        String anotherString = "hello, world!";
        boolean isEqual = original.equalsIgnoreCase(anotherString); // Case-insensitive comparison
        System.out.println("Strings are equal (ignoring case): " + isEqual);
       
        //10. char at index 3
        System.out.println("char at index 3: "+original.charAt(3));
        
        
        
    }
}
