package packageDay8;

public class WrapperInteger {
    public static void main(String[] args) {
        // Using Integer.valueOf with different examples
        Integer a = Integer.valueOf(45);
        Integer b = Integer.valueOf("001110", 2);  // 2 indicates binary
        Integer c = Integer.valueOf("0010");     // Parses as decimal
        Integer d = Integer.valueOf("1234211", 10); // 10 indicates decimal
        Integer e = Integer.parseInt("2343543");
        Integer f = Integer.valueOf("ff", 16); // hexadecimal (base 16)

        //Converting String into Interger 
        Integer g = Integer.parseInt("23");
        
        
       
        // Printing the results
        System.out.println(a);  // Prints: 45
        System.out.println(b);  // Prints: 2 (binary "0010" is 2)
        System.out.println(c);  // Prints: 10 (decimal "0010" is 10)
        System.out.println(d);  // Prints: 1211
        System.out.println(e);  // Prints: 2343543
        System.out.println(f);  // Prints: 255
        System.out.println(g+2); // prints: 23+2 = 25
        System.out.println(Integer.valueOf("23")+23);
    }
}
