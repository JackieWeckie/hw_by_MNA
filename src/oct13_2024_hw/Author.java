package oct13_2024_hw;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName(String name) {
        return name;
    }

    public String getSurname(String surname) {
        return surname;
    }

    public String setName() {
        this.name = name;
        return null;
    }

    public String setSurname() {
        this.surname = surname;
        return null;
    }
}