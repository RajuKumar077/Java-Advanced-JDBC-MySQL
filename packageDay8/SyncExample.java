package packageDay8;

class BankAccount {
    private int balance = 1000; // Initial balance

    // Withdraw method (only one thread can use at a time)
    synchronized void withdraw(int amount) {
        System.out.println("Trying to withdraw: " + amount);
        if (balance < amount) {
            System.out.println("Not enough balance, waiting for deposit...");
            try {
                wait(); // Wait until deposit happens
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

public class SyncExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Withdraw thread
        new Thread(() -> account.withdraw(2000)).start();

        // Deposit thread (runs after a delay)
        new Thread(() -> {
            try { Thread.sleep(2000); } catch (Exception e) {}
            account.deposit(3000);
        }).start();
    }
}


