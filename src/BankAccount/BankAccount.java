package BankAccount;

public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public BankAccount() {
        this.owner = "unknown";
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Положено на счет " + amount + " у.е. Ваш баланс: " + getBalance());
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Снято со счета " + amount + " у.е. Ваш баланс:" + getBalance());
        } else {
            System.out.println("Недостаточно средств. Ваш баланс: " + getBalance());
        }
    }

    public String getBalance() {
        return String.format("%.2f", balance);
    }
}

