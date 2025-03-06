package packageDay6;


public class TestFinalClass {
    
    // Final class - cannot be extended
    public final class FinalClass {
        public void display() {
            System.out.println("This is a method in a final class.");
        }
    }

    public static void main(String[] args) {
       
    	
        TestFinalClass test = new TestFinalClass();
        FinalClass obj = test.new FinalClass();
        obj.display();  // Output: This is a method in a final class.

        
        
 
    }
}
