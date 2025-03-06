package packageDay7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryWithFinally {
	public static void main(String[] args) {

		try {
			FileInputStream loc = new FileInputStream("c//");
			
			System.out.println(loc);int []a = {1,2,3,4}; // This will not run
			System.out.println(a[23]); // same this
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {  

			try {
				int []a = {1,2,3,4};
				System.out.println(a[23]);
			} catch (Exception e) {
				System.out.println("This is from try inside Finally \n");
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			System.out.println("\n😂 i am in Fianlly Block heheh");
		}


		try {
			int []a = {1,2,3,4};
			System.out.println(a[23]);
		} catch (Exception e) {

			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		try {
			String b = "Hello";
			System.out.println( Integer.parseInt(b));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("as B contain  '"+e.getCause()+"' "+ e.getMessage());
		}
	}
}
