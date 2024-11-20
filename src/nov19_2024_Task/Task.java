package nov19_2024_Task;

import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;

public class Task implements Comparable<Task> {
    private String name;
    private String category;
    private int priority;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return priority == task.priority && Objects.equals(name, task.name) &&
                Objects.equals(category, task.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category, priority);
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Task(Builder builder) {
        this.name = builder.name;
        this.category = builder.category;
        this.priority = builder.priority;
    }

    @Override
    public int compareTo(Task o) {
        return Comparator.comparing(Task::getName)
                .thenComparing(Task::getCategory)
                .thenComparing(Task::getPriority)
                .compare(this, o);
    }

    public static class Builder {
        private static String name;
        private static String category;
        private static int priority;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public Builder priority(int priority) {
            this.priority = priority;
            return this;
        }

        public Task build() {
            return new Task(this);
        }
    }

    @Override
    public String toString() {
        return "\nTask: " + name + "\nCategory: " + category + "\nPriority: " + priority + "\n";
    }
}
