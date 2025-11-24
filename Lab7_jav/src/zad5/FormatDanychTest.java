package zad5;

class NiepoprawnyFormatDanychException extends Exception {
    public NiepoprawnyFormatDanychException(String message) {
        super(message);
    }
}

public class FormatDanychTest { public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException {
    int atIndex = dane.indexOf('@');
    int dotIndex = dane.lastIndexOf('.');

    boolean poprawnyEmail =
            atIndex > 0 &&
                    dotIndex > atIndex + 1 &&
                    dotIndex < dane.length() - 1;

    if (!poprawnyEmail) {
        throw new NiepoprawnyFormatDanychException("Niepoprawny format danych: " + dane);
    }

    System.out.println("Poprawny format danych: " + dane);
}

    public static void main(String[] args) {
        String[] testData = {
                "jan.kowalski@example.com",
                "zlyFormat",
                "brakKropki@domena",
                "@bezLoginu.com"
        };

        for (String dane : testData) {
            try {
                sprawdzFormatDanych(dane);
            } catch (NiepoprawnyFormatDanychException e) {
                System.out.println("Błąd: " + e.getMessage());
            }
        }
    }
}
