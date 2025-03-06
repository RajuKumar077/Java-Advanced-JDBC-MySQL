package packageDay6;

@FunctionalInterface
interface NumberMultiply {
	int operation(int number);
}

public class LambdaIfElse {


	public static void main(String[] args) {
		
		NumberMultiply obj = (number) -> {
			if (number > 9) {
				return number ;  
			} else {
				return number * 2;  
			}
		};

		
		System.out.println(obj.operation(32)); 
		
	}
}
