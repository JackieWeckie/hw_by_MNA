package nov28_2024_SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        //задание 2: получить уникальные слова из массива с определённым порядком, используя Linked Hash Set

        String[] words = {"shelf", "table", "shelf", "chair", "chair"};
        System.out.println(uniqueWords(words));
    }

    public static Set<String> uniqueWords(String[] arr2) {
        Set<String> s2 = new LinkedHashSet<>();
        for (String strings : arr2) {
            s2.add(strings);
        }
        return s2;
        //вернулись уникальные слова по порядку
    }
}
