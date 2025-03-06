package packageDay2;

public class HelloJava {
	
	 public static void main(String[] args) {
		 
		    char s ;
		    s = 'R';
		    System.out.println(s);
	        System.out.println("Hello, Java!");
	        
	        // Arithmetic Operators 
	        int a = 23+2;
	        System.out.println("Sum is -> " + a);
	        
	        int b = 23-2;
	        System.out.println("Sub is -> " + b);
	        System.out.println("Division -> " + 12.4/3);
	        long d= 23245L;
	        double f = 234.345D ;
	        System.out.println("Multiplication -> " + d*f);
	        
	        System.out.println("Remainder -> " + d%f );
	        
	        // Relational (Comparison) Operators 
	        
	        if (a == b) {
	        	System.out.println("it is ok");
	        }
	        else {
	        	System.out.println(a/b);
	        }
	        System.out.println(d>f);
	        System.out.println(d!=f);
	        System.out.println(d<f);
	        System.out.println(d<=f);
	        System.out.println(d>=f);
	        
	        //Logical Operators
	        
	        System.out.println("use of Logical operator -> "+  (a>b && d<f));
	        //System.out.println(typeof(a));
	        
	        /*
	         * this is just comment and not in code use
	         * */
	        
	     
	                if (args.length > 1) {
	                    System.out.println(args[1]); // Prints the second argument passed
	                } else {
	                    System.out.println("Insufficient arguments provided.");
	                }
	            
	        


	    }
}
