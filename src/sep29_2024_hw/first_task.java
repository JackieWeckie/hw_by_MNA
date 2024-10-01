package sep29_2024_hw;

public class first_task {
    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10};
        int average = 0;

        if (num.length > 0) {
            int sum = 0;
            for (int i = 0; i < num.length; i++) {
                sum += num[i];
            }
            average = sum / num.length;
        }
        System.out.println(num.length);
    }
}
