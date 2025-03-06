package packageDay6;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if (a>18) {
			System.out.println("He is can Vote");

		}
		else {
			System.out.println("no you have to wait ");
		}

		sc.close();

// using switch-Case

		switch (a > 18 ? 1 : 0) {
		case 1:
			System.out.println("He can vote");
			break;
		case 0:
			System.out.println("No, you have to wait");
			break;
		}

		sc.close();
	}


}

