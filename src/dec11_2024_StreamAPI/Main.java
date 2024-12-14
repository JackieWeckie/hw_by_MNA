package dec11_2024_StreamAPI;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(123184, "Raju Gandhi", "Head First Git", true);
        Book book2 = new Book(639133, "Wladston Ferreira Filho",
                "Computer Science Distilled", false);
        Book book3 = new Book(422851, "Joshua Bloch", "Effective Java", false);
        Book book4 = new Book(518602, "Thompson Carter",
                "Java Programming For Game Developing", true);
        Book book5 = new Book(620122, "Michael Kofler", "Java", true);
        Book book6 = new Book(338519, "Herbert Schildt", "Java: A beginner's guide", false);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        List bookList = library.getBook();

        for(Object o : bookList) {
            System.out.println(o);
        }

        System.out.println(library.getBook(422851));
        System.out.println(library.getBook(book2));
        System.out.println(library.getAuthor());
        System.out.println(library.bookAmount());
    }
}
