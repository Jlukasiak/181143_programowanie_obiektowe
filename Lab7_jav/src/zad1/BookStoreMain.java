package zad1;


public class BookStoreMain { public static void main(String[] args) {
    BookDTO book1 = new BookDTO("1984", "George Orwell", 39.99, 1949);
    BookDTO book2 = new BookDTO("Duma i uprzedzenie", "Jane Austen", 29.50, 1813);
    BookDTO book3 = new BookDTO("Władca Pierścieni", "J.R.R. Tolkien", 89.00, 1954);
    BookDTO book4 = new BookDTO("Pan Tadeusz", "Adam Mickiewicz", 24.99, 1834);

    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book3);
    System.out.println(book4);
}
}
