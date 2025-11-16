package zad12;

import java.util.Scanner;

public class NajwiekszaINajmniejsza {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Wprowadź liczby całkowite. Wprowadź liczbę ujemną, aby zakończyć.");

        while (true) {
            int liczba = scanner.nextInt();

            if (liczba < 0) {
                break;  // Przerywamy wczytywanie, gdy napotkamy liczbę ujemną
            }

            if (liczba > max) {
                max = liczba;  // Aktualizujemy największą liczbę
            }

            if (liczba < min) {
                min = liczba;  // Aktualizujemy najmniejszą liczbę
            }
        }

        // Wyświetlamy największą i najmniejszą liczbę
        System.out.println("Największa liczba: " + max);
        System.out.println("Najmniejsza liczba: " + min);

        scanner.close();
    }
}
