package packageDay8;

public class ThreadExampleInDetail extends Thread {
    public void run() {
        Thread te = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Child thread executing...");
            } catch (InterruptedException e) {
                System.out.println("Child thread interrupted");
            }
        });

        System.out.println("Before");
        System.out.println("State before start: " + te.getState()); // NEW
        te.start();
        System.out.println("State after start: " + te.getState()); // RUNNABLE or TIMED_WAITING

        try {
            Thread.sleep(500);
            System.out.println("State during sleep: " + te.getState()); // RUNNABLE or TIMED_WAITING
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        try {
            te.join(); // Ensures this thread waits for te to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("After join, state: " + te.getState()); // TERMINATED
    }

    public static void main(String[] args) {
        ThreadExampleInDetail t = new ThreadExampleInDetail();
        t.start();
    }
}
