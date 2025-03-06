package packageDay6;

@FunctionalInterface
interface Vowel {
	boolean operation(String letter);  
}

//True - Vowel
//False - Not Vowel

public class LambdaIfElseVowel {
	public static void main(String[] args) {

		Vowel checkVowel = (letter) -> {
			letter = letter.toLowerCase();
			if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
				return true;  
			} else {
				return false;  
			}
		};

		// Test the lambda expression
		System.out.println(checkVowel.operation("A")); 
		System.out.println(checkVowel.operation("b"));  
	}
}

