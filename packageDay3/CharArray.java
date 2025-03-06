package packageDay3;

public class CharArray {
	public static void main(String[] args) {
		
		// Char Type 1D Array
		char[] CharArray = {'A', 'B', 'C', 'D', 'E'};

		System.out.println("1D Char Array Elements:");
		System.out.println("Element at index 0: " + CharArray[0]);
		System.out.println("Element at index 1: " + CharArray[1]);
		System.out.println("Element at index 2: " + CharArray[2]);
		System.out.println("Element at index 3: " + CharArray[3]);
		System.out.println("Element at index 4: " + CharArray[4]);
		
		System.out.println("1D Char Array Elements: Using for loop \n ");
		for(int j = 0; j < CharArray.length; j++) {
			System.out.print(CharArray[j] + " ");
		}

		// Char Type 2D Array
		char[][] twoDCharArray = {
				{'A', 'B', 'C'},
				{'D', 'E', 'F'},
				{'G', 'H', 'I'}
		};

		System.out.println("\n2D Char Array Elements:");
		System.out.println("First row, first column: " + twoDCharArray[0][0]);
		System.out.println("First row, second column: " + twoDCharArray[0][1]);
		System.out.println("First row, third column: " + twoDCharArray[0][2]);

		System.out.println("Second row, first column: " + twoDCharArray[1][0]);
		System.out.println("Second row, second column: " + twoDCharArray[1][1]);
		System.out.println("Second row, third column: " + twoDCharArray[1][2]);

		System.out.println("Third row, first column: " + twoDCharArray[2][0]);
		System.out.println("Third row, second column: " + twoDCharArray[2][1]);
		System.out.println("Third row, third column: " + twoDCharArray[2][2]);
		
		for(int i = 0;i<twoDCharArray.length;i++) {
			for(int j = 0; j < twoDCharArray[i].length; j++) {
				System.out.print(twoDCharArray[i][j] + " ");
			}
			System.out.println();
		}

	}
}
