package zad4;

public class AgeCheckTest {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Wiek " + age + " jest za niski. Minimalny wiek to 18.");
        }
        System.out.println("Wiek " + age + " jest poprawny.");
    }

    public static void main(String[] args) {
        int[] ages = {16, 18, 21};

        for (int age : ages) {
            try {
                checkAge(age);
            } catch (IllegalArgumentException e) {
                System.out.println("Błąd: " + e.getMessage());
            }
        }
    }
}
