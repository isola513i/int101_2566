package int101.homework01.work04;

public class BankAccount {
    private int number;
    private Person owner;
    private double balance;

    public BankAccount(int number, Person owner) {
        this.number = number;
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
        return balance;
    }

    public void transfer(double amount, BankAccount account) {
        if (amount <= account.balance) {
            withdraw(amount);
            account.deposit(amount);
        } else {
            System.out.println("Insufficient funds for transfer");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number=" + number +
                ", owner=" + owner +
                '}';
    }
}
