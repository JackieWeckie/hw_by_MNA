package oct13_2024_hw;

public class Book {
    private String title;
    private int yearPublished;

    public Book(String title, String name, String surname, int yearPublished) {
        this.title = title;
        this.yearPublished = yearPublished;
    }

    public String getTitle(String title) {
        return title;
    }

    public int getYearPublished(int yearPublished) {
        return yearPublished;
    }

    public String setTitle() {
        this.title = title;
        return null;
    }

    public int setYearPublished() {
        this.yearPublished = yearPublished;
        return 0;
    }
}