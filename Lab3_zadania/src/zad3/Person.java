package zad3;

public class Person {
    public String name;
    private String password;

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // Prosty sposób na „legalny” dostęp – metoda wewnątrz klasy
    public boolean verifyPassword(String attempt) {
        return this.password.equals(attempt);
    }
}