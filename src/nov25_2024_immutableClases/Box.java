package nov25_2024_immutableClases;

import java.util.Objects;

public class Box<T> {
    private T contains;

    public Box(T contains) {
        this.contains = contains;
    }

    public T getContains() {
        return contains;
    }

    public void setContains(T contains) {
        this.contains = contains;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(contains, box.contains);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(contains);
    }

    public void isEmpty() {
        if (contains == null) {
            System.out.println("There's nothing in this container!");
        }
    }

    public void clear() {
        System.out.println("The box was cleared.");
    }

    @Override
    public String toString() {
        return "Box{" +
                "contains=" + contains +
                '}';
    }
}
