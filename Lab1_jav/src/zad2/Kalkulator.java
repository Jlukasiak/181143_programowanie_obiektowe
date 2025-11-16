package zad2;
import java.util.Scanner;

public class Kalkulator {
    public static double dodaj(double a, double b) {
        return a + b;
    }
    public static double odejmij(double a, double b) {
        return a - b;
    }
    public static double pomnoz(double a, double b) {
        return a * b;
    }
    public static double podziel(double a, double b) {
        if (b==0){
            System.out.println("Błąd dzielenie przez zero");
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        double num1 = scanner.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        double num2 = scanner.nextDouble();

        System.out.println("Wybierz operację:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");

        int wybor = scanner.nextInt();

        double wynik = 0;

        switch (wybor) {
            case 1:
                wynik = dodaj(num1, num2);
                break;
            case 2:
                wynik = odejmij(num1, num2);
                break;
            case 3:
                wynik = pomnoz(num1, num2);
                break;
            case 4:
                wynik = podziel(num1, num2);
                break;
            default:
                System.out.println("Nieprawidłowy wybór.");
                return;
        }

        System.out.println("Wynik: " + wynik);
        scanner.close();


    }
}
