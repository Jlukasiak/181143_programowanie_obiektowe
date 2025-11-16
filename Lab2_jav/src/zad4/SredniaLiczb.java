package zad4;

import java.util.Random;

public class SredniaLiczb {

    public static void main(String[] args) {
        int[] tablica = new int[20];
        Random random = new Random();
        int suma = 0;


        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(100) + 1;
            suma += tablica[i];
        }


        double srednia = suma / 20.0;


        System.out.println("Wygenerowane liczby:");
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println("\nŚrednia wartość: " + srednia);
    }
}
