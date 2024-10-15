package oct13_2024_hw;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Author author1 = new Author();
        Author author2 = new Author();

        author1.setName("John");
        author1.setSurname("Tolkien");
        author2.setName("George");
        author2.setSurname("Martin");
        book1.setTitle("The Lord of the Rings");
        book1.setYearPublished(1954);
        book1.setAuthor(author1.getAuthorInfo());
        book2.setTitle("Game of Thrones");
        book2.setYearPublished(1996);
        book2.setAuthor(author2.getAuthorInfo());
        System.out.println(book1.getBookInfo());
        System.out.println(book2.getBookInfo());
    }
}