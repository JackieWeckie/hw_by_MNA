package nov28_2024_SetInterface;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {
        int[] nums = {15, 25, 35, 45};
        int target = 30;
        //в случае замены значения target, мы получим другие значения (если 20, то в аутпут будет 15 и 25)
        int[] result = closestNumbers(nums, target); //получаем намс и таргет из массива
        System.out.println(Arrays.toString(result));
    }

    public static int[] closestNumbers(int[] nums, int target) {
        Set<Integer> s3 = new TreeSet<>();
        for (Integer number : nums) {
            s3.add(number);
        }
        Integer lower = ((TreeSet<Integer>) s3).lower(target);
        Integer higher = ((TreeSet<Integer>) s3).higher(target);

        return new int[]{lower, higher};
        //вернулись ловер и хайгер. Всё работает
    }
}
