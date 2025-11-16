package zad4;

public class Company {
    public static void main(String[] args) {
        System.out.println("Przed dostępem do pola:");

        Employee e = new Employee();
        e.name = "Jan";
        e.position = "Developer";

        System.out.println("Po dostępie do pola:");
        System.out.println("Pracownik: " + e.name + ", stanowisko: " + e.position);

    }
}

class Employee {
    public String name;
    String position;
}
