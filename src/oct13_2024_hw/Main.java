package oct13_2024_hw;

public class Main {
    public static void main(String[] args) {
      Author author1 = new Author("John", "Tolkien");
      Book book1 = new Book("Leaf by Niggle", author1, 1945);
      Book book2 = new Book("Pride and Prejudice", new Author("Jane", "Austen"), 1813);

      book1.setTitle("A leaf");
      book1.setYearPublished(1946);
      book2.setAuthor(new Author("Nikita", "Morozov"));

        System.out.println("Title: " + book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println("Publication year: " + book1.getYearPublished().toString());

        System.out.println("\nTitle: " + book2.getTitle());
        System.out.println(book2.getAuthor());
        System.out.println("Publication year: " + book2.getYearPublished().toString());
    }
}