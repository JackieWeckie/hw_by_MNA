package oct10_2024_hw;

import java.util.Arrays;

public class second_task {
    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 9, 3, 2};
        arrays(array);
    }

    static void arrays(int[] array) {
        int[] sec_array = array.clone();
        for (int i = 0; i < sec_array.length - 1; i++) {
            if (sec_array[i] >= sec_array[i + 1]) {
                sec_array[i] -= sec_array[i + 1];
            } else {
                sec_array[i] += sec_array[i + 1];
            }
        }
        if (sec_array[sec_array.length - 1] >= array[0]) {
            sec_array[sec_array.length - 1] -= array[0];
        } else {
            sec_array[sec_array.length - 1] += array[0];
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.println("Новый массив: " + Arrays.toString(sec_array));
    }
}
