package packageDay8;
public class ThreadExample2InDetail extends Thread {
    public void run() {
    	
        Thread te = new Thread();  // 1
        System.out.println("Before");  // 2
        te.start();  // 3
        te.run();
        System.out.println("Runnable:- " + te.getState());  // 4
        
        try {
            Thread.sleep(2000);  // 5 Main thread which is running the flow of code that is why it will
            // wait for 2 second
            System.out.println("Thread:- " + te.getState());  // 6
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");  // 7
        }

        try {
            te.join();  // 8
        } catch (InterruptedException e) {
            e.printStackTrace();  // 9
        }
        System.out.println("After join:- " + te.getState());  // 10
    }

    public static void main(String[] args) {
        ThreadExample2InDetail t = new ThreadExample2InDetail();  // 11
        t.start();  // 12
    }
}

