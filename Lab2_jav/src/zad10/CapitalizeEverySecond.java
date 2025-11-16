package zad10;

public class CapitalizeEverySecond {

    public static void main(String[] args) {
        StringBuffer text = new StringBuffer("hello world");
        capitalizeEverySecond(text);
        System.out.println("Zmieniony tekst: " + text);
    }

    public static void capitalizeEverySecond(StringBuffer text) {
        for (int i = 1; i < text.length(); i += 2) {
            char currentChar = text.charAt(i);
            // Jeśli jest to litera mała, zmieniamy ją na wielką
            if (Character.isLowerCase(currentChar)) {
                text.setCharAt(i, Character.toUpperCase(currentChar));
            }
        }
    }
}
