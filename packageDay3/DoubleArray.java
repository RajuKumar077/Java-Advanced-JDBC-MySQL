package packageDay3;

public class DoubleArray {
	
	public static void main(String[] args) {
		
		// Double Type 1D Array
		double[] DoubleArray = {10.5, 20.3, 30.8, 40.1, 50.6};

		System.out.println("1D Double Array Elements:");
		System.out.println("Element at index 0: " + DoubleArray[0]);
		System.out.println("Element at index 1: " + DoubleArray[1]);
		System.out.println("Element at index 2: " + DoubleArray[2]);
		System.out.println("Element at index 3: " + DoubleArray[3]);
		System.out.println("Element at index 4: " + DoubleArray[4]);
		
		System.out.println("1D Double Array Elements: Using for loop \n ");
		for(int j = 0; j < DoubleArray.length; j++) {
			System.out.print(DoubleArray[j] + " ");
		}

		// Double Type 2D  Array
		double[][] twoDDoubleArray = {
				{0, 2.0092, 3.38800},
				{467.4, 5.05, 06.6},
				{7.7, 8.8, 9.9}
		};

		System.out.println("\n2D Double Array Elements:");
		System.out.println("First row, first column: " + twoDDoubleArray[0][0]);
		System.out.println("First row, second column: " + twoDDoubleArray[0][1]);
		System.out.println("First row, third column: " + twoDDoubleArray[0][2]);

		System.out.println("Second row, first column: " + twoDDoubleArray[1][0]);
		System.out.println("Second row, second column: " + twoDDoubleArray[1][1]);
		System.out.println("Second row, third column: " + twoDDoubleArray[1][2]);

		System.out.println("Third row, first column: " + twoDDoubleArray[2][0]);
		System.out.println("Third row, second column: " + twoDDoubleArray[2][1]);
		System.out.println("Third row, third column: " + twoDDoubleArray[2][2]);
		
		System.out.println("\n");
		
		for(int i = 0;i<twoDDoubleArray.length;i++) {
			for(int j = 0; j < twoDDoubleArray[i].length; j++) {
				System.out.print(twoDDoubleArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}

