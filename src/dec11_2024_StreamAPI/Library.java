package dec11_2024_StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

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

    public Object getBook(Book book) { //даёт понимание существует ли такая книга
        if (book.isAvailable()) {
            return book;
        } else {
            return book + " does not exist or it was borrowed. Try again later.";
        }
    }

    public List getBook() { //сортирует книги по названию
        return books.values().stream().sorted(Comparator.comparing(Book::getTitle)).toList();
    }

    public List<Book> getBookID() { //сортирует книги по ID
        return books.values().stream().sorted(Comparator.comparing(Book::getId)).toList();
    }

    public int getUnavailableBooks(boolean isAvailable) { //возвращает список недоступных книг
        return (int) books.values().stream().filter(book -> book.isAvailable() != isAvailable).count();
    }

    public int bookAmount() {
        return books.size();
    }

    public int bookAmount(Boolean isThereSomeBooks) { //возвращает количество недоступных или доступных книг
        if (isThereSomeBooks) {
            return Math.toIntExact(books.values().stream().filter(Book::isAvailable).count());
        }
        return Math.toIntExact(books.values().stream().filter(book -> !book.isAvailable()).count());
    }

    public Map<Boolean, List<Book>> partitioningByAvailable() { //сортировка доступных и недоступных книг
        return books.values().stream().collect(Collectors.partitioningBy(Book::isAvailable));
    }

    public Map<String, List<Book>> partitioningByAuthor() { //разделяет книги по авторам
        return books.values().stream().collect(Collectors.groupingBy(Book::getAuthor));
    }

    public List getAuthor() { //возвращает список авторов
        List<String> authors = new ArrayList<>();
        books.values().forEach(book -> authors.add(book.getAuthor()));
        return authors.stream().sorted(Comparator.naturalOrder()).distinct().toList();
    }

    @Override
    public String toString() {
        return "All the available books: " + books;
    }
}
