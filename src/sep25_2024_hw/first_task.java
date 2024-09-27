package sep25_2024_hw;

import java.util.Scanner;

public class first_task {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder resb = sb.reverse();
        System.out.println(resb);
    }
}
