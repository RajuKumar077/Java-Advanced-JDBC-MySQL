package packageDay7;

public class ThrowExample {
	
	public static void main(String []  args){
		int a =18;
		try {
		if (a<23) {
			throw new ArithmeticException() ;
		}
		else {
			System.out.println("wait for: ");
		}
		}
		catch (Exception e) {
			System.out.println("He can have Fun");
		}
		
	}

}
