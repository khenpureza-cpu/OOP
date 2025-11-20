// Act:4 — Encapsulation
public class BankAccount {
    private double balance;
    
    public BankAccount() {
        this.balance = 0;
    }
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
    
    public double getBalance() {
        return balance;
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println("Initial balance: $" + account.getBalance());
        account.deposit(500);
        System.out.println("Balance after deposit: $" + account.getBalance());
        account.withdraw(200);
        System.out.println("Balance after withdrawal: $" + account.getBalance());
        account.withdraw(2000);
        System.out.println("Balance after failed withdrawal: $" + account.getBalance());
    }
}
