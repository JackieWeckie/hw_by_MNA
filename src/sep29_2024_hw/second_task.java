package sep29_2024_hw;

import java.util.Arrays;

public class second_task {
    public static void main(String[] args) {
        double[] num = new double[]{2.1, -4.3, 9.5, 6.9, 3.17};
        double min = 0;
        double max = 0;

        for (double j = 0; min < 0 && max > 0; j++) {
            System.out.println(Arrays.toString(num));
        }
        System.out.println("min: " + Arrays.stream(num).min() + "\nmax: " + Arrays.stream(num).max());
    }
}
