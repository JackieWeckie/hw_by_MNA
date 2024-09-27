package sep25_2024_hw;

import java.util.Scanner;

public class second_task {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите строку: ");
                String s = scanner.nextLine();

                if (isPalindrome(s)) {
                    System.out.println("Эта строка палиндром");
                } else {
                    System.out.println("Эта строка не палиндром");
                }
            }

            public static boolean isPalindrome(String str) {
                int l = str.length();

                for (int i = 0; i < l / 2; i++) {
                    if (str.charAt(i) != str.charAt(l - i - 1)) {
                        return false; 
                    }
                }
                return true;
            }
        }