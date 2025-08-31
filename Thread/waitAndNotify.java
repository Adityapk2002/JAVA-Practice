package Thread;

public class waitAndNotify {
    private int balance = 200; // shared state
    private final Object lock = new Object();

    // deposit money
    public void deposit(int amount) {
        synchronized (lock) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", balance = " + balance);
            lock.notifyAll(); // wake up waiting threads (like withdrawers)
        }
    }

    // withdraw money (waits if insufficient funds)
    public void withdraw(int amount) throws InterruptedException {
        synchronized (lock) {
            while (balance < amount) {
                System.out.println(Thread.currentThread().getName() + " waiting, balance = " + balance);
                lock.wait(); // wait until someone deposits
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", balance = " + balance);
        }
    }

    // demo
    public static void main(String[] args) {
        waitAndNotify account = new waitAndNotify();

        Thread t1 = new Thread(() -> {
            try {
                account.withdraw(250); // will block until deposit happens
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Withdrawer");

        Thread t2 = new Thread(() -> account.deposit(100), "Depositor");

        t1.start();
        t2.start();
    }
}

// You have a BankAccount class with a shared balance.
// A lock object (SHARED_LOCK) is used to synchronize access.
// A flag isResourceBusy prevents multiple threads from updating at the same
// time.
// If one thread is inside, others wait (wait()), then after the update you call
// notify() to wake another thread.