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
}




