package zad9;

import java.util.Scanner;

public class Nww {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();

        int nwd = nwd(a, b);
        int nww = Math.abs(a * b) / nwd;

        System.out.println("Najmniejsza wspólna wielokrotność (NWW): " + nww);

        scanner.close();
    }

    public static int nwd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
