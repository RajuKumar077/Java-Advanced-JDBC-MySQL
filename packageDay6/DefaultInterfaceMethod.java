package packageDay6;

public class DefaultInterfaceMethod implements Vehicle {
	
	@Override	
	public void start() {
		System.out.println("It is working 🚗");
		
	}

    public static void main(String[] args) {
    	
        Vehicle myCar = new DefaultInterfaceMethod();
        myCar.start(); // Calls the implemented start() method
        myCar.stop();  // Calls the default stop() method
        Vehicle.price(); // direct calling Static method without using object
        
    }



}
