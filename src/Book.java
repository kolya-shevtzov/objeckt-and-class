import java.util.Objects;

public class Book {
    private final String name;
    private int date;
    private Author author;

    public Book(String name, int date, Author author) {
        this.name = name;
        this.date = date;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public int getDate() {
        return this.date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


}
