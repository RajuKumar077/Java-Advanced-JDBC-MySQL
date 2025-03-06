package packageDay8;

class SharedResource {
	
    void printNumbers(int n) {
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

class MyThread1 extends Thread {
    SharedResource obj;
    MyThread1(SharedResource obj) {
        this.obj = obj;
    }
    public void run() {
        obj.printNumbers(2);
    }
}

class MyThread2 extends Thread {
    SharedResource obj;
    MyThread2(SharedResource obj) {
        this.obj = obj;
    }
    public void run() {
        obj.printNumbers(3);
    }
}

public class WithoutSynchronization {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }
}
