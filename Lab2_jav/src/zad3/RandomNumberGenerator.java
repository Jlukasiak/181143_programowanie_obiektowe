package zad3;

import java.util.Random;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        // Przypadek testowy
        int min = 5;
        int max = 10;
        int randomNum = generateRandomIntInRange(min, max);
        System.out.println("Wygenerowana liczba losowa: " + randomNum);
    }

    public static int generateRandomIntInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
