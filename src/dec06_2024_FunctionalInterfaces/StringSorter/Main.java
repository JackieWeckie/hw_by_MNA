package dec06_2024_FunctionalInterfaces.StringSorter;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kevin", "Robert", "Christopher", "Maya", "Victoria");
        System.out.println("Default list: " + names);

        Collections.sort(names);
        System.out.println("The first sorting: " + names);

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        names.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println("The second sorting: " + names);
    }
}
