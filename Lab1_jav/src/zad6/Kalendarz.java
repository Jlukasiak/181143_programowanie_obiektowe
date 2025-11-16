package zad6;

import java.util.Scanner;

public class Kalendarz {
    enum Miesiac {
        STYCZEN, LUTY, MARZEC, KWIECENI, MAJ, CZERWIEC,
        LIPIEC, SIERPIEN, WRZESIEN, PAZDZIERNIK, LISTOPAD, GRUDZIEN
    }


    public static boolean czyRokPrzestepny(int rok) {
        if (rok % 4 == 0) {
            if (rok % 100 == 0) {
                if (rok % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj dzień: ");
        int dzien = scanner.nextInt();

        System.out.print("Podaj miesiąc: ");
        String miesiacString = scanner.next().toUpperCase();

        System.out.print("Podaj rok: ");
        int rok = scanner.nextInt();

        Miesiac miesiac = null;
        try {
            miesiac = Miesiac.valueOf(miesiacString);
        } catch (IllegalArgumentException e) {
            System.out.println("Błędny miesiąc");
            scanner.close();
            return;
        }

        int liczbaDni = 0;

        switch (miesiac) {
            case STYCZEN:
            case MARZEC:
            case MAJ:
            case LIPIEC:
            case SIERPIEN:
            case PAZDZIERNIK:
            case GRUDZIEN:
                liczbaDni = 31;
                break;
            case KWIECENI:
            case CZERWIEC:
            case WRZESIEN:
            case LISTOPAD:
                liczbaDni = 30;
                break;
            case LUTY:

                if (czyRokPrzestepny(rok)) {
                    liczbaDni = 29;
                } else {
                    liczbaDni = 28;
                }
                break;
        }

        if (dzien < 1 || dzien > liczbaDni) {
            System.out.println("Błędna data");
        } else {
            System.out.println("Poprawna data");
        }

        scanner.close();
    }
}
