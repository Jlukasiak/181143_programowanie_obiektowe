package zad7;

public class LiczbyParzyste {
    public static void main(String[] args) {

        int i = 2;
        int count = 0;
        System.out.println("Pierwsze 20 liczb parzystych:");
        do {
            System.out.println(i);
            i += 2;
            count++;
        } while (count < 20);


        count = 0;
        i = 1;


        System.out.println("\nPierwsze 20 liczb nieparzystych:");
        do {
            System.out.println(i);
            i += 2;
            count++;
        } while (count < 20);


    }
}