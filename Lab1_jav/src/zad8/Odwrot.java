package zad8;

    import java.util.Scanner;


public class Odwrot {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj liczbę całkowitą: ");
            int liczba = scanner.nextInt();

            int odwroconaLiczba = 0;

            while (liczba > 0) {
                int ostatniaCyfra = liczba % 10;
                odwroconaLiczba = odwroconaLiczba * 10 + ostatniaCyfra;
                liczba = liczba / 10;
            }

            System.out.println("Odwrócona liczba: " + odwroconaLiczba);

            scanner.close();
        }
    }


