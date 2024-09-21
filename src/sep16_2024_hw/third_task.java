package sep16_2024_hw;

import java.util.Scanner;

public class third_task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите номер месяца: ");
        int monthNumber = scan.nextInt();

        String m = switch (monthNumber) {
            case 1 -> "Январь";
            case 2 -> "Февраль";
            case 3 -> "Март";
            case 4 -> "Апрель";
            case 5 -> "Май";
            case 6 -> "Июнь";
            case 7 -> "Июль";
            case 8 -> "Август";
            case 9 -> "Сентябрь";
            case 10 -> "Октябрь";
            case 11 -> "Ноябрь";
            case 12 -> "Декабрь";
            default -> "Неверно указан месяц";
        };
        System.out.println(m);

        m = switch(monthNumber) {
            case 12, 1, 2 -> "Зимний месяц";
            case 3, 4, 5 -> "Весенний месяц";
            case 6, 7, 8 -> "Летний месяц";
            case 9, 10, 11 -> "Осенний месяц";
            default -> "Не принадлежит ни к какому времени года";
        };
        System.out.println(m);
    }
}
