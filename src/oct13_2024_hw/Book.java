package oct13_2024_hw;

public class Book {
    private String title;
    private Author author;
    private Integer yearPublished;

    public Book() {
    }

    public Book(String title, Author author, Integer yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Integer yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor:" + author + "\nThe year of publication: " + yearPublished;
    }
}