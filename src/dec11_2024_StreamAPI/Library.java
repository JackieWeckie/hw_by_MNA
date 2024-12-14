package dec11_2024_StreamAPI;

import java.util.*;

public class Library {
    public static Map<Integer, Book> books = new HashMap<>();

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public Book getBook(int id) {
        return books.get(id);
    }

    public Object getBook(Book book) {
        if (book.isAvailable()) {
            return book + " is Available to get!";
        } else {
            return book + " does not exist or it was borrowed. Try again later.";
        }
    }

    public List getBook() {
        return books.values().stream().sorted(Comparator.comparing(Book::getTitle)).toList();
    }

    public List getBook(Boolean b) {
        if (b) {
            return books.values().stream().filter(Book::isAvailable).toList();
        }
        return Collections.singletonList((int) books.values().size());
    }

    public int bookAmount() {
        return books.size();
    }

    public int bookAmount(Boolean b) {
        if (b) {
            return Math.toIntExact(books.values().stream().filter(Book::isAvailable).count());
        }
        return Math.toIntExact(books.values().stream().filter(book -> !book.isAvailable()).count());
    }

    public List getAuthor() {
        List<String> authors = new ArrayList<>();
        books.values().forEach(book -> authors.add(book.getAuthor()));
        return authors.stream().sorted(Comparator.naturalOrder()).distinct().toList();
    }

    @Override
    public String toString() {
        return "All the available books: " + books;
    }
}
