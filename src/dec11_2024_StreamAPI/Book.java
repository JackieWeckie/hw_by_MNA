package dec11_2024_StreamAPI;

import java.util.Objects;

public class Book {
    private final int id;
    private String author;
    private String title;
    private boolean isAvailable;

    public Book(int id, String author, String title, boolean isAvailable) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && isAvailable == book.isAvailable && Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, title, isAvailable);
    }

    @Override
    public String toString() {
        return "\nTitle: " + title + "\nAuthor(s): " + author + "\nAvailability: " + isAvailable + "\nID: " + id + "\n";
    }
}
