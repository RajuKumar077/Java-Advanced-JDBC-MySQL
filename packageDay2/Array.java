package packageDay2;


public class Array {

	public static void main(String[] args) {

		int[] marks = new int [100] ;
		System.out.println(marks);

		marks[22] = 99 ;
		System.out.println("Value at marks[22]: "+ marks[22]);
		System.out.println("Length of marks Array: " +marks.length);

		int[] numbers = {10, 20, 30, 40, 50};

		System.out.println("First element: " + numbers[0]);
		System.out.println("Second Element: " + numbers[1]);
		System.out.println("Last element: " + numbers[numbers.length - 1]);

		System.out.println("\nArray elements:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}
		
		for (int i : numbers) {
			System.out.println(i);
			
		}
		
		System.out.println("\n 2D Array \n");

		int[][] matrix = {
				{1, 2},
				{4, 5, 6},
				{7, 8, 9}
		};
		System.out.println("First row, first column: " + matrix[0][0]);
		System.out.println("First row, second column: " + matrix[0][1]);
		System.out.println("Second row, first column: " + matrix[1][0]);
		System.out.println("Second row, third column: " + matrix[1][2]);
		System.out.println("Third row, second column: " + matrix[2][1]);
		System.out.println("Third row, third column: " + matrix[2][2]);
       
		for(int i = 0;i<matrix.length;i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j] + " ");
			}
		}

	}

}
