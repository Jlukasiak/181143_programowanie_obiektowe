package zad5;

public class Book {


    private String title;
    private String author;
    private int publicationYear;


    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.publicationYear = 0;
    }


    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }


    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + publicationYear;
    }


    public static void main(String[] args) {

        Book defaultBook = new Book();
        System.out.println(defaultBook);

        Book specificBook = new Book("1984", "George Orwell", 1949);
        System.out.println(specificBook);
    }
}
