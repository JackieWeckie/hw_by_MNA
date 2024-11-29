package nov28_2024_SetInterface;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        //задание 1: получить уникальные цифры из массива с использованием Hash Set

        int[] numbers = {1, 3, 2, 3, 5, 4, 6, 5};
        System.out.println(uniqueNums(numbers));
    }

    public static Set<Integer> uniqueNums(int[] arr1) {
        Set<Integer> s1 = new HashSet<>();
        for (Integer nums : arr1) {
            s1.add(nums);
        }
        return s1;
        //вернулись уникальные числа
    }
}
