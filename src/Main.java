import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Напишите цифру 1 чтобы начать и потом продолжать: ");
        int num = sc.nextInt();

        switch (num) {
            case 1 -> System.out.println("Взять нужное: Турка, сахар, молотые зёрна, вода");
            default -> System.out.println("Нет. Именно цифру 1");
        }
        System.out.print("Напишите цифру 1, чтобы продолжить: ");
        int numb = sc.nextInt();
        switch (numb) {
            case 1 -> System.out.println("Смешивание ингридиентов: Залить водой зёрна, добавить сахар");
            default -> System.out.println("Нет. Именно цифру 1");
        }
        System.out.print("Напишите цифру 1, чтобы продолжить: ");
        int n = sc.nextInt();
        switch (n) {
            case 1 -> System.out.println("Начинаем варить напиток помешивая");
            default -> System.out.println("Нет. Именно цифру 1");
        }
        System.out.print("Напишите цифру 1, чтобы продолжить: ");
        int nu = sc.nextInt();
        switch (nu) {
            case 1 ->
                    System.out.println("Добавить добавки? Например сироп, молоко, сливки. Напишите 1, чтобы продолжить: ");
            default -> System.out.println("Нет. Именно цифру 1");
        }
        System.out.print("Напишите 1 если да, 2 если нет, чтобы продолжить: ");
        int answer = sc.nextInt();
        switch (answer) {
            case 1 -> System.out.println("Добавляем и завершаем приготовление  \nНажмите 1 чтобы завершить: ");
            case 2 -> System.out.println("Поздравляю! Ваш кофе готов!");
            default -> System.out.println("Нет. Используйте только цифры 1 и 2");
        }
        int ans = sc.nextInt();

        if (ans == 1) {
            System.out.println("Поздравляю! Ваш кофе готов!");
        } else {
            System.out.println(" ");
        }
    }
}
        
