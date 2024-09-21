package sep16_2024_hw;

import java.util.Scanner;

public class first_task {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int age = s.nextInt();

        if (age >= 2 && age <= 6) {
            System.out.println("Если ваш возраст " + age + " лет" + ", вам надо идти в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если ваш возраст " + age + " лет" + ", вам следует идти в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если ваш возраст " + age + " лет" + ", вам нужно идти в университет");
        } else if (age >= 25 && age <= 64) {
            System.out.println("Если ваш возраст " + age + " лет" + ", вам надо идти на работу");
        } else if (age <= 2) {
            System.out.println("Если ваш возраст " + age + " год" + ", вы ещё слишком молоды");
        } else {
            System.out.println("Если ваш возраст " + age + " лет" + ", вам пора на пенсию, а потом в гроб:)");
        }
    }
}
