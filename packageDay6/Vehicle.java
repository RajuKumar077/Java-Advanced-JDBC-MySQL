package packageDay6;

interface Vehicle {
	
    void start(); // Abstract method
    
    default void stop() {  //default method
        System.out.println("Vehicle stopped.");
    }
    
    static void price() {
    	System.out.println("It costs 15M💲 only. ");
    }

}
