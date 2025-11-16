package zad9;

import java.util.Scanner;

public class Piramida {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj znak: ");
        char znak = scanner.next().charAt(0);

        System.out.print("Podaj wysokość piramidy (n): ");
        int n = scanner.nextInt();

        buildPyramid(znak, n);

        scanner.close();
    }

    public static void buildPyramid(char znak, int n) {
        StringBuilder piramida = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                piramida.append(" ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                piramida.append(znak);
            }

            piramida.append("\n");
        }

        System.out.println(piramida.toString());
    }
}
