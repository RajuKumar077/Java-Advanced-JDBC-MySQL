package packageDay8;


public class RunnableThreadExample implements Runnable {
    public void run() {
        System.out.println("Thread running " + Thread.currentThread().getId());
    }

    public static void main(String args[]) {
        System.out.println("Main thread ID: " + Thread.currentThread().getId());

        RunnableThreadExample runnable = new RunnableThreadExample();
        Thread te = new Thread(new RunnableThreadExample());
        te.start();
    }
}
