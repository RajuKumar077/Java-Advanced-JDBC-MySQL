package packageDay8;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <=2; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: " + i);
            try {
                Thread.sleep(500);  // Simulating some work
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class JoinExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        try {
            t1.join();  // Main thread waits until t1 finishes
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        t2.start();  // t2 starts only after t1 is complete
    }
}


