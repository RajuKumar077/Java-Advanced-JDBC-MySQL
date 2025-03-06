package packageDay8;

class BankAccountTwo {
    private int balance = 1000; // Initial balance

    // Withdraw method (only one thread can use at a time)
    synchronized void withdraw(int amount) {
        System.out.println("Trying to withdraw: " + amount);
        while (balance < amount) {  // Use while to prevent spurious wakeups
            System.out.println("Not enough balance, waiting for deposit...");
            try {
                wait();  // Wait until deposit happens
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: " + balance);
    }

    // Deposit method
    synchronized void deposit(int amount) {
        System.out.println("Depositing: " + amount);
        balance += amount;
        System.out.println("Deposit successful! New balance: " + balance);
        notify(); // Notify waiting thread (withdraw)
    }
}

public class SyncNotifyExample {
    public static void main(String[] args) {
        BankAccountTwo account = new BankAccountTwo();

        // Withdraw thread
        new Thread(() -> account.withdraw(2000)).start();

        // Deposit thread (runs after a delay)
        new Thread(() -> {
            try { Thread.sleep(2000); } catch (Exception e) {}
            account.deposit(3000);
        }).start();
    }
}

