package Thread;

public class BankAccount {

    int balance = 200; // critical section

    public class BankActivity implements Runnable {
        @Override
        public void run() {
            balance += 100;
        }
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        Thread t1 = new Thread(ba.new BankActivity());
        Thread t2 = new Thread(ba.new BankActivity());
        Thread t3 = new Thread(ba.new BankActivity());

        t1.start(); // native thread to jvm start (T1)
        t2.start();
        t3.start(); // this will get ignore because of race conditons

        System.out.println(ba.balance); // answer will be +200 in balance
    }
}
