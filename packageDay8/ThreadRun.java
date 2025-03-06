package packageDay8;


class ThreadDefine implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
            
            System.out.println("Starting New Thread: "+ Thread.currentThread().getName() );
        } catch (Exception e) {
            System.out.println("An Exception has occurred: " + e);
        }
    }
}

public class ThreadRun {
    public static void main(String[] args) {
    	ThreadDefine f1 = new ThreadDefine();
        Thread t1 = new Thread(f1);
        Thread t2 = new Thread(f1);
        
        Thread t3 = new Thread(new ThreadDefine()) ;

        t1.run(); // Start thread t1
        t2.run(); // Start thread t2
        t3.run(); // Start thread t3 using direct object creation 
    }
}
