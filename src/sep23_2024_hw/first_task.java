package sep23_2024_hw;

import java.util.Scanner;

public class first_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любую букву или цифру: ");
        String s = sc.nextLine();
        int hd = 0;
        int ld = 0;
        int lowerCase = 0;
        int upperCase = 0;

     for (int i = 0; i < s.length(); i++) {
         if (Character.isDigit(s.charAt(i)) && (s.charAt(i)) <= '4') {
             ld++;
         } else if (Character.isDigit(s.charAt(i)) && (s.charAt(i)) <= '9') {
             hd++;
         }
         if (Character.isLetter(s.charAt(i)) && (s.charAt(i)) == Character.toUpperCase(s.charAt(i))) {
           upperCase++;
         } else if (Character.isLetter(s.charAt(i)) && (s.charAt(i)) == Character.toLowerCase(s.charAt(i))) {
           lowerCase++;
         }
     }
        System.out.println("Кол-во цифр от 0 до 4: " + ld);
        System.out.println("Кол-во цифр от 5 до 9: " + hd);
        System.out.println("Кол-во заглавных букв: " + upperCase);
        System.out.println("Кол-во маленьких букв: " + lowerCase);
    }
}
