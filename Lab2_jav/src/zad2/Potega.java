package zad2;

public class Potega {

    public static void main(String[] args) {
        int n = 3;
        double wynik = liczba7PotegaMinusn(n);
        System.out.println("Wynik 7^(-" + n + ") to: " + wynik);
    }

    public static double liczba7PotegaMinusn(int n) {
        double wynik = 1.0;
        for (int i = 0; i < n; i++) {
            wynik *= 7;
        }
        return 1.0 / wynik;
    }
}
