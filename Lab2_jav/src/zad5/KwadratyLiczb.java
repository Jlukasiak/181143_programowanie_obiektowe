package zad5;

import java.util.Random;

public class KwadratyLiczb {

    public static void main(String[] args) {
        int[] tablica = new int[30];
        Random random = new Random();
        int liczbaKwadratow = 0;


        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(100) + 1;
        }


        for (int i = 0; i < tablica.length; i++) {
            double pierwiastek = Math.sqrt(tablica[i]);
            if (pierwiastek == (int) pierwiastek) {
                liczbaKwadratow++;
            }
        }

        System.out.println("Ilość liczb, które są kwadratami innych liczb: " + liczbaKwadratow);
    }
}
