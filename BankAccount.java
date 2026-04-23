public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(6000);

        System.out.println("Initial balance: " + acc.getBalance());

        acc.deposit(300);
        System.out.println("After deposit: " + acc.getBalance());

        acc.withdraw(1000);
        System.out.println("After withdrawal: " + acc.getBalance());
    }
}