package packageDay8;

public class LambdaThread {

	public static void main(String args[]) {
	System.out.println("Thread Running: "+Thread.currentThread().getId());
	
	Thread te = new Thread(() -> {System.out.println("Thread: "+ Thread.currentThread().getId());});
	te.start();
	te.run();
	}
}


