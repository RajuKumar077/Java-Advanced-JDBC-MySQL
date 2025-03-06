package packageDay3;

public class FloatArray {
	    public static void main(String[] args) {
	        // Float Type 1D  Array
	        float[] FloatArray = {10.5f, 20.3f, 30.8f, 40.1f, 50.6f};

	        System.out.println("1D Float Array Elements:");
	        System.out.println("Element at index 0: " + FloatArray[0]);
	        System.out.println("Element at index 1: " + FloatArray[1]);
	        System.out.println("Element at index 2: " + FloatArray[2]);
	        System.out.println("Element at index 3: " + FloatArray[3]);
	        System.out.println("Element at index 4: " + FloatArray[4]);
	        
	        System.out.println("1D Float Array Elements: Using for loop \n ");
			for(int j = 0; j < FloatArray.length; j++) {
				System.out.print(FloatArray[j] + " ");
			}

	        // Float Type 2D Float Array
	        float[][] twoDFloatArray = {
	        		
	            {1.345f, 456.2f, 89.3f},
	            {4.74f, 59.5f, 86.6f},
	            {88.8f, 99.9f      }
	            
	        };

	        System.out.println("\n2D Float Array Elements:");
	        System.out.println("First row, first column: " + twoDFloatArray[0][0]);
	        System.out.println("First row, second column: " + twoDFloatArray[0][1]);
	        System.out.println("First row, third column: " + twoDFloatArray[0][2]);

	        System.out.println("Second row, first column: " + twoDFloatArray[1][0]);
	        System.out.println("Second row, second column: " + twoDFloatArray[1][1]);
	        System.out.println("Second row, third column: " + twoDFloatArray[1][2]);

	        System.out.println("Third row, first column: " + twoDFloatArray[2][0]);
	        System.out.println("Third row, second column: " + twoDFloatArray[2][1]);
	        
	        System.out.println("\n");
			
			for(int i = 0;i<twoDFloatArray.length;i++) {
				for(int j = 0; j < twoDFloatArray[i].length; j++) {
					System.out.print(twoDFloatArray[i][j] + " ");
				}
				System.out.println();
			}
	        
	    }
	}

