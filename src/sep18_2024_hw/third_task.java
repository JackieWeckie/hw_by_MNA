package sep18_2024_hw;

import java.util.Scanner;

public class third_task {
    public static void main(String[] args) {
        Scanner numb = new Scanner(System.in);
        System.out.println("Введите числитель: ");
        int num = numb.nextInt();
        int n = 10;

        Scanner mult = new Scanner(System.in);
        System.out.println("Введите множитель: ");
        int mul = numb.nextInt();
        int m = 10;

    for (int i = 1; i <= n && i <= m; i++) {
        if (num <= 11 && mul <= 11) {
            System.out.println("Это будет: " + num * mul);
        } else {
            System.out.println("Данное число выходит за рамки таблицы умножения. Пожалуйста, введите число поменьше");
        }
        i *= n;
    }
    }
}

