package packageDay8;

class First implements Runnable {
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				Thread.sleep(1000);
				System.out.println(i);
			}
			System.out.println("Current Thread is: "+ Thread.currentThread().getName());
		} catch (Exception e) {
			System.out.println("An Exception has occurred: " + e);
		}
	}
}


/*
 * output -> 1 1 2 2 3 3 4 4 5 5 
 * Current Thread is: Thread-0 
 * Current Thread is: Thread-1
 * Because this means process are going on parallel not one by one .
 */

public class ThreadStart {
	public static void main(String[] args) {
		First f1 = new First();
		Thread t1 = new Thread(f1);
		Thread t2 = new Thread(f1);

		t1.start(); // Start thread t1
		t2.start(); // Start thread t2

	}
}
