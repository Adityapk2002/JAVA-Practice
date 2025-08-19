package Constructor;

class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    private String accountType;

    public BankAccount() {
        this("0000000", "Unknown", 0.0, "Savings");
    }

    public BankAccount(String accountNumber, String holderName) {
        this(accountNumber, holderName, 0.0, "Savings");
    }

    public BankAccount(String accountNumber, String holderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public BankAccount(BankAccount other) {
        this.accountNumber = other.accountNumber;
        this.holderName = other.holderName;
        this.balance = other.balance;
        this.accountType = other.accountType;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
    }

    public void withDraw(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            System.out.println("Withdrawn: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayAccount() {
        System.out.println("Account : " + accountNumber +
                " | Holder : " + holderName +
                " | Balance : " + balance +
                " | Type : " + accountType);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount("12345", "Aditya");
        BankAccount acc3 = new BankAccount("123", "Parth", 500.12, "Savings");
        BankAccount acc4 = new BankAccount(acc3);

        acc1.displayAccount();
        acc2.displayAccount();
        acc3.displayAccount();
        acc4.displayAccount();

        System.out.println("----Transactions----");
        acc2.deposit(1500);
        acc3.withDraw(100);

    }

}
