package packageDay3;

public class IntArray {
	public static void main(String[] args) {
		
		// INT Type 1D Array
		int[] oneDArray = {10, 20, 30, 40, 50};

		System.out.println("1D Array Elements:");
		System.out.println("Element at index 0: " + oneDArray[0]);
		System.out.println("Element at index 1: " + oneDArray[1]);
		System.out.println("Element at index 2: " + oneDArray[2]);
		System.out.println("Element at index 3: " + oneDArray[3]);
		System.out.println("Element at index 4: " + oneDArray[4]);

		System.out.println("1D Array Elements:using loop ");
			for(int j = 0; j < oneDArray.length; j++) {
				System.out.print(oneDArray[j] + " ");
			}
		
		
		
		// INT Type 2D Array
		int[][] twoDArray = {
				{21, 62, 73},
				{54, 76    },
				{77, 88, 59}
		};

		System.out.println("\n2D Array Elements:");
		System.out.println("First row, first column: " + twoDArray[0][0]);
		System.out.println("First row, second column: " + twoDArray[0][1]);
		System.out.println("First row, third column: " + twoDArray[0][2]);

		System.out.println("Second row, first column: " + twoDArray[1][0]);
		System.out.println("Second row, third column: " + twoDArray[1][1]);

		System.out.println("Third row, first column: " + twoDArray[2][0]);
		System.out.println("Third row, second column: " + twoDArray[2][1]);
		System.out.println("Third row, third column: " + twoDArray[2][2]);
		
		
		// Using Double For loop
		for(int i = 0;i<twoDArray.length;i++) {
			for(int j = 0; j < twoDArray[i].length; j++) {
				System.out.print(twoDArray[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// Using Foreach
		
		for (int[] i : twoDArray) {
			for (int a:i) {
				System.out.print(a + " ");
			}
			System.out.println();
			
			System.out.println((34*34)*45+45/5);
		}
	}

}
