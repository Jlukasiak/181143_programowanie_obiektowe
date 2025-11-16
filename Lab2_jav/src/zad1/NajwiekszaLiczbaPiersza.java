package zad1;

public class NajwiekszaLiczbaPiersza {

    public static void main(String[] args) {
        int n = 50;
        int wynik = największaLiczbaPierwsza(n);
        System.out.println("Największa liczba pierwsza mniejsza niż " + n + " to: " + wynik);
    }

    public static int największaLiczbaPierwsza(int n) {
        for (int i = n - 1; i > 1; i--) {
            if (czyPierwsza(i)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean czyPierwsza(int liczba) {
        if (liczba <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(liczba); i++) {
            if (liczba % i == 0) {
                return false;
            }
        }
        return true;
    }
}
