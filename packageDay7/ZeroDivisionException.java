package packageDay7;

import java.util.Scanner;

public class ZeroDivisionException {
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 try {
			 System.out.println("Enter Value A: ");
			 int a = sc.nextInt();
			 System.out.println("Enter Value B: ");
			 int b= sc.nextInt();
			 int c= a/b;
			 System.out.println(c);
			 sc.close();
		}catch (ArithmeticException e) {
			// TODO: handle exception]
			System.out.println("Can not be Divided "+ e.getLocalizedMessage());
			
		} 
		 
		 catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	 }
}
