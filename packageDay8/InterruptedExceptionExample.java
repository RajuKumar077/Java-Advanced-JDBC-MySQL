package packageDay8;

public class InterruptedExceptionExample {
	  public static void main(String[] args) {
	try {
	    Thread.sleep(1000);
	} catch (Exception e) {
	    System.out.println("Thread was interrupted.");
	}
	  }
}
