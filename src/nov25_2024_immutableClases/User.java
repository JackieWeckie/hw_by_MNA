package nov25_2024_immutableClases;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class User {
    private String user;
    private int userRating;

    public User(String user, int userRating) {
        this.user = user;
        this.userRating = userRating;
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", userRating=" + userRating +
                '}';
    }

    public String getUser() {
        return user;
    }

    public int getUserRating() {
        return userRating;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user1 = (User) o;
        return Objects.equals(user, user1.user) && Objects.equals(userRating, user1.userRating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, userRating);
    }
}
