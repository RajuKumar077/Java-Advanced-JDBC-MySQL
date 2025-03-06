package packageDay8;

public class RunnableThreadExampleTryCatch implements Runnable{

	@Override
	public void run() {
		try {
			System.out.println("Thread running: " + Thread.currentThread());

		} catch (Exception e) {
			System.out.println("Error in thread");
		}

	}

	public static void main(String args[]) {

		try {
			System.out.println("Main thread ID: " + Thread.currentThread().getId());

			RunnableThreadExample runnable = new RunnableThreadExample();
			Thread te = new Thread(new RunnableThreadExample());
			te.start();
		}catch (Exception e) {
			System.out.println("Error in main");}



	}
}
