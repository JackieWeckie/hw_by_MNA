package sep25_2024_hw;

import java.util.Scanner;

import static jdk.internal.org.jline.utils.Colors.s;

public class first_task {
    public static void main(String[] args) {
        String s = "JavaavaJ";
        StringBuilder reversed = new StringBuilder(s).reverse();

        System.out.println("Ваша строка: " + s);
        System.out.println("Реверс вашей строки: " + reversed.toString());

        if (s.equals(reversed.toString())) {
            System.out.println("Эта строка палиндром");
        } else {
            System.out.println("Эта строка не палиндром");
        }
    }
}

