package zad6;

public class MinimumValue {

    public static void main(String[] args) {
        int[] liczby = {12, 5, 8, 30, 2, 19};
        int minimum = minimumValue(liczby);
        System.out.println("Najmniejsza liczba w tablicy: " + minimum);
    }

    public static int minimumValue(int[] tablica) {
        int min = tablica[0];

        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i] < min) {
                min = tablica[i];
            }
        }

        return min;
    }
}
