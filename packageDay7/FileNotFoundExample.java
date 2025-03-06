package packageDay7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class FileNotFoundExample {
    public static void main(String[] args) {
        
        try {
          FileInputStream loc = new FileInputStream("c//");
          System.out.println(loc);int []a = {1,2,3,4};
		  System.out.println(a[23]);
		} catch (FileNotFoundException e) {
            
            System.out.println("File not found: " + e.getMessage());
        }catch (Exception e) {
			
			// TODO: handle exception
			System.out.println(e.getMessage());
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
