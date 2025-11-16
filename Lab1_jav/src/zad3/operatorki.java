package zad3;

public class operatorki {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int c = 10;
        int d = 20;


        a += 4;
        System.out.println("Wartość a po a += 4: " + a);


        b -= a;
        System.out.println("Wartość b po b -= a: " + b);


        c *= (2 - 4 * a);
        System.out.println("Wartość c po c *= (2 - 4 * a): " + c);


        d /= (4 - a * a);
        System.out.println("Wartość d po d /= (4 - a^2): " + d);
    }
}
