package Thread;

public class BankAccount1 {
    private int balance = 200; // critical section

    public class BankActivity implements Runnable {
        @Override
        public void run() { // we can use here also
            synchronized (this) {
                balance += 10;

            }
        }
    }

    public static void BankBranch() {
        BankAccount1 ba = new BankAccount1();
        Thread[] t = new Thread[1000];

        for (int i = 0; i < 1000; i++) {
            Thread tc = new Thread(ba.new BankActivity());
            t[i] = tc;
        }

        for (int i = 0; i < 1000; i++) {
            t[i].start();
        }

        for (int i = 0; i < 1000; i++) {
            try {
                t[i].join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Final balance: " + ba.balance);
    }

    // Add main method
    public static void main(String[] args) {
        BankBranch();
    }
}

// we are just accessing one common shared variable across 1lakh threads
// each thread is doing increment

// flows -> common shared resources,variable
// -> do not have critical section

// the problem is when t1 came and do increment after that t1 about to change
// the value
// context switch happen and the value remain same thats why it get bugs
// This is exactly why race conditions happen. The updates are lost.

// synchronized (BankAccount1.class)
// This means: acquire a lock on the BankAccount1 class object.
// Only one thread at a time can execute the code inside this synchronized block
// for that lock.
// Other threads trying to enter this block must wait until the lock is
// released.