import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int publishingYear;

    public Book(String title, Author author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.publishingYear;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int setYear(int publishingYear) {
        this.publishingYear = publishingYear;
        return publishingYear;
    }

    @Override
    public String toString() {
        return title + ", " + publishingYear + " - " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }
}




