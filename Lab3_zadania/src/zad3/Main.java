package zad3;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Ala", "tajne123");


        System.out.println("Imię: " + p.name);


        // System.out.println(p.password); // error: password has private access in Person

        // Poprawny sposób: użyć metody udostępnionej przez klasę
        System.out.println("Sprawdź hasło : " + p.verifyPassword("tajne12"));
        System.out.println("Sprawdź hasło : " + p.verifyPassword("tajne123"));
    }
}

