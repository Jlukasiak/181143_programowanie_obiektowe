package zad11;
    import java.util.Scanner;
public class Podzial {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Podaj liczbę a: ");
    int a = scanner.nextInt();

    System.out.print("Podaj liczbę b: ");
    int b = scanner.nextInt();

    System.out.print("Podaj liczbę c: ");
    int c = scanner.nextInt();

    System.out.println("Liczby większe od " + b + " i mniejsze lub równe " + a + " oraz podzielne przez " + c + ":");

    for (int i = b + 1; i <= a; i++) {
        if (i % c == 0) {
            System.out.println(i);
        }
    }

    scanner.close();
}
}
