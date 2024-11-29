package nov25_2024_immutableClases;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class ImmutableClass {
    private final Integer userID;
    private final List<Integer> friendCount; //максимальное кол-во друзей, что может иметь юзер

    public ImmutableClass(Integer userID, List<Integer> friendCountList) {
        this.userID = userID;
        this.friendCount = new ArrayList<>();
        friendCount.addAll(friendCountList);
    }

    public Integer getUserID() {
        return userID;
    }

    public List<Integer> getFriendCount() {
        return friendCount;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "userID=" + userID +
                ", friendCount=" + friendCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableClass that = (ImmutableClass) o;
        return Objects.equals(userID, that.userID) && Objects.equals(friendCount, that.friendCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, friendCount);
    }
}
