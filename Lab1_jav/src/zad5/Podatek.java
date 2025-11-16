package zad5;

import java.util.Scanner;

public class Podatek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swój dochód: ");
        double dochod = scanner.nextDouble();

        double podatek = 0;

        if (dochod <= 85528) {

            podatek = dochod * 0.18;
        } else {

            podatek = 14839.02 + (dochod - 85528) * 0.32;
        }

        System.out.println("Kwota podatku dochodowego: " + podatek + " PLN");


        scanner.close();
    }
}
