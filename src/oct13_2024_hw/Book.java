package oct13_2024_hw;

public class Book {
    private String title;
    private String author;
    private Integer yearPublished;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Integer yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getBookInfo() {
        return title + " " + yearPublished + " " + author;
    }

}