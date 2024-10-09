package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        first_task();
//        second_task();
//        third_task();
        recursion();
        factorial();
    }

    static void first_task() {
        byte fstNum = 2;
        byte scndNum = 4;
        byte thrdNum = 5;
        byte fthNum = 3;

        System.out.println(Methods.getSquare(fstNum));
        System.out.println(Methods.getSquare(scndNum));
        System.out.println(Methods.getSquare(thrdNum));
        System.out.println(Methods.getSquare(fthNum));
    }

    static void second_task() {
        System.out.println("Введите ваше имя: ");
        Scanner sc1 = new Scanner(System.in);
        String name = sc1.nextLine();

        System.out.println("Введите вашу фамилию: ");
        Scanner sc2 = new Scanner(System.in);
        String surname = sc2.nextLine();

        System.out.println("Full name: " + name + " " + surname);
    }

    static void third_task() {
        String[] words = new String[]{"Java", "Programming", "Git"};
        System.out.println(Arrays.toString(Methods.getCornerValuesArray(words)));
        System.out.println(Arrays.toString(Methods.getCornerValuesArray(3, 4, 1, -2, 2)));
        System.out.println(Arrays.toString(Methods.getCornerValuesArray('9', 'b', '1', '!')));
    }

    static void recursion() {
        //* Корнер-кейсы */

        String[] array1 = new String[]{};
        String[] array2 = new String[]{"A"};
        String[] array3 = new String[]{"Java", "Java", "Java", "Java"};

        System.out.println(Arrays.toString(Methods.getCornerCases(array1)));
        System.out.println(Arrays.toString(Methods.getCornerCases(array2)));
        System.out.println(Arrays.toString(Methods.getCornerCases(array3)));
    }

    static void factorial() {
        //* Нахождение факториала */

        System.out.println(Methods.getFactorial(3));
        System.out.println(Methods.getFactorial(5));
        System.out.println(Methods.getFactorial(7));
    }
}