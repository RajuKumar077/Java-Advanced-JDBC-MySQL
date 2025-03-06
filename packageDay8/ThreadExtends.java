package packageDay8;


public class ThreadExtends extends Thread {
    public void run() {
        System.out.println("Running " + Thread.currentThread().getId());
    }

    public static void main(String args[]) {
    	
        System.out.println("Main thread ID: " + Thread.currentThread().getId());

        ThreadExtends te = new ThreadExtends();
        te.start();
        te.run();
    }
}
