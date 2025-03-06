package packageDay8;

class MyThreadTwo extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(3000);  // Sleep for 1 second
                System.out.println(i);  // Print number
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadJoin {
    public static void main(String[] args) {
    	MyThreadTwo t1 = new MyThreadTwo();  // Create thread t1
    	MyThreadTwo t2 = new MyThreadTwo();  // Create thread t2

        t1.start();  // Start t1 thread
        t2.start();  // Start t2 thread

        try {
            t1.join();  // Main thread waits for t1 to finish
            t2.join();  // Main thread waits for t2 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e);
        }

        System.out.println("Both threads are finished. Main thread resumes." + Thread.currentThread().getName());
    }
}
