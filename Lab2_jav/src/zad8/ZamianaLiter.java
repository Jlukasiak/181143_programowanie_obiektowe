package zad8;

public class ZamianaLiter {

    public static void main(String[] args) {
        String napis = "przykład";
        String zmienionyNapis = zamienPierwszaIOstatnia(napis);
        System.out.println("Napis po zamianie: " + zmienionyNapis);
    }

    public static String zamienPierwszaIOstatnia(String napis) {
        if (napis.length() < 2) {
            return napis;
        }

        char pierwsza = napis.charAt(0);
        char ostatnia = napis.charAt(napis.length() - 1);
        String srodek = napis.substring(1, napis.length() - 1);

        return ostatnia + srodek + pierwsza;
    }
}
