package zad2;

public record BankAccount(int accountNumber, double balance) {

    public BankAccount(int accountNumber) {
        this(accountNumber, 0);
    }

    public BankAccount withInterest(double percentage) {
        double newBalance = balance + balance * (percentage / 100.0);
        return new BankAccount(accountNumber, newBalance);
    }
}
