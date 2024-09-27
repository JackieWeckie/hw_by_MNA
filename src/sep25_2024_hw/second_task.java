package sep25_2024_hw;

import java.util.Scanner;

public class second_task {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] ca = s.toCharArray();

        for (char c : ca) {
            System.out.println(c);
        }
    }
}
