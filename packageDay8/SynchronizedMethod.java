package packageDay8;

class SharedResourceTwo {
    synchronized void printNumbers(int n) {  // Synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread3 extends Thread {
    SharedResource obj;
    MyThread3(SharedResource obj) {
        this.obj = obj;
    }
    public void run() {
        obj.printNumbers(2);
    }
}

class MyThread4 extends Thread {
    SharedResource obj;
    MyThread4(SharedResource obj) {
        this.obj = obj;
    }
    public void run() {
        obj.printNumbers(3);
    }
}

public class SynchronizedMethod {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }
}
