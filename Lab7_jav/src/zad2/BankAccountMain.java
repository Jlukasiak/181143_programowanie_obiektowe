package zad2;

public class BankAccountMain {  public static void main(String[] args) {
    BankAccount account1 = new BankAccount(123456, 1000.0);
    BankAccount account2 = new BankAccount(987654);

    BankAccount account1WithInterest = account1.withInterest(5.0);
    BankAccount account2WithInterest = account2.withInterest(10.0);

    System.out.println(account1);
    System.out.println(account1WithInterest);
    System.out.println(account2);
    System.out.println(account2WithInterest);
}
}
