package nov11_2024_Lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Bob");
        students.add("George");
        students.add("Sally");
        students.add("Kate");
        students.add("Peter");

        List<String> newStudents = new ArrayList<>();
        newStudents.add("Irvin");
        newStudents.add("Amelia");
        newStudents.add("Jennifer");

        students.addAll(newStudents);

        students.remove("Peter");
        students.remove("Jennifer");

        if (students.contains("Kate")) {
            System.out.println("This student is exist!");
        } else {
            System.out.println("This student does not exist!");
        }

        List<String> anotherStudents = new ArrayList<>();
        anotherStudents.add("Colin");
        anotherStudents.add("Joseph");
        anotherStudents.add("Mary");
        anotherStudents.add("Elizabeth");

        if (students.containsAll(anotherStudents)) {
            System.out.println("This list contains these students.");
        } else {
            System.out.println("This list does not contains these students.");
        }

        System.out.println("The size of this list is " + students.size());

        if (students.isEmpty()) {
            System.out.println("This list is empty!");
        } else {
            System.out.println("This list is not empty!");
        }

        students.clear();

        System.out.println(students);
    }
}
