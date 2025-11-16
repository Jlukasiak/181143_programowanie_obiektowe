package zad10;
    import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj n: ");
        int n = scanner.nextInt();

        System.out.print("Podaj m: ");
        int m = scanner.nextInt();

        int suma = 0;

        for (int i = n; i <= m; i++) {
            suma += i;
        }

        System.out.println("Suma liczb od " + n + " do " + m + ": " + suma);

        scanner.close();
    }
}
