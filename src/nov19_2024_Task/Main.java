package nov19_2024_Task;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Task> tasks = new PriorityQueue<>();

        Task task1 = new Task.Builder()
                .name("Fix a bug")
                .category("Bug")
                .priority(Integer.parseInt(String.valueOf(3)))
                .build();

        Task task2 = new Task.Builder()
                .name("Add a new feature to our project")
                .category("Feature")
                .priority(Integer.parseInt(String.valueOf(1)))
                .build();

        Task task3 = new Task.Builder()
                .name("Write documentation for the feature we came up")
                .category("Documentation")
                .priority(Integer.parseInt(String.valueOf(2)))
                .build();

        Task task4 = new Task.Builder()
                .name("Defeat the error the intern made")
                .category("Bug")
                .priority(Integer.parseInt(String.valueOf(4)))
                .build();

        Task task5 = new Task.Builder()
                .name("Show the new feature to our lead")
                .category("Feature")
                .priority(Integer.parseInt(String.valueOf(5)))
                .build();

        Task task6 = new Task.Builder()
                .name("Add and fill the README-file on GitHub while creating new repository")
                .category("Documentation")
                .priority(Integer.parseInt(String.valueOf(6)))
                .build();

        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);
        tasks.add(task6);

        System.out.println(tasks);
    }
}
