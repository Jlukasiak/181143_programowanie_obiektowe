package zad7;

public class Odwrot {

    public static void main(String[] args) {
        int[] liczby = {1, 2, 3, 4, 5};
        int[] odwroconaTablica = reverseArray(liczby);


        System.out.print("Odwrócona tablica: ");
        for (int liczba : odwroconaTablica) {
            System.out.print(liczba + " ");
        }
    }

    public static int[] reverseArray(int[] tablica) {
        int[] odwrocona = new int[tablica.length];


        int j = 0;
        for (int i = tablica.length - 1; i >= 0; i--) {
            odwrocona[j] = tablica[i];
            j++;
        }

        return odwrocona;
    }
}


