package sep18_2024_hw;

import java.util.Scanner;

public class second_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = sc.nextInt();
        int j = 1;

        for (int i = 1; i <= n; i++) {
            j *= i;
        }
        System.out.println("Произведение чисел от 1 до " + n + " равно " + j);
    }
}
