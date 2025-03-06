package packageDay6;

import java.util.Scanner;

@FunctionalInterface
interface VowelR {
	boolean operation(String letter);  
}


public class LambdaUserInput {
	public static void main(String[] args) {

		VowelR checkVowel = (letter) -> {
			letter = letter.toLowerCase();
			if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
				return true;  
			} else {
				return false;  
			}
		};

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet top check: ");
		String a = sc.next();
		System.out.println(checkVowel.operation(a));
		sc.close();
	}

}
