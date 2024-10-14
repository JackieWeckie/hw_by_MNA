package oct13_2024_hw;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("John", "Doe");
        Book book = new Book("The Great Gatsby", "John", "Doe", 1925);
        System.out.println("Author: " + author.getName("John") + " " + author.getSurname("Doe"));
        System.out.println("Book: " + book.getTitle("The Great Gatsby") + " (" + book.getYearPublished(1925) + ")");

        Author author2 = new Author("Murasaki", "Shikibu");
        Book book2 = new Book("The Tale of Genji", "Murasaki", "Shikibu", 2003);
        System.out.println("Author: " + author.getName("Murasaki") + " " + author.getSurname("Shikibu"));
        System.out.println("Book: " + book.getTitle("The Tale of Genji") + " (" + book.getYearPublished(2003) + ")");
    }
}