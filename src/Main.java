import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 32;
        short sh = 49;
        byte b = 9;
        char a = 'a';
        long l = 241;
        double doub = 7.135;
        float fl = 8.351F;

        int fst = 12;
        int scnd = 4;

        int sum = fst + scnd; //сложение
        int diff = fst - scnd; //вычитание
        int product = fst * scnd; //умножение
        int quotient = fst / scnd; //деление
        int remind = fst % scnd; //остаток от деления

        System.out.println("Сложение: " + sum);
        System.out.println("Вычитание: " + diff);
        System.out.println("Умножение: " + product);
        System.out.println("Деление: " + quotient);
        System.out.println("Остаток от деления: " + remind);

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");
        int numb = sc.nextInt();

        Random rand = new Random();
        int randnumb1 = rand.nextInt(2418);
        int randnumb2 = rand.nextInt(2418);
        int randnumb3 = rand.nextInt(2418);
        int randnumb4 = rand.nextInt(2418);

        //преобразование в char

        char ch1 = (char) randnumb1;
        char ch2 = (char) randnumb2;
        char ch3 = (char) randnumb3;
        char ch4 = (char) randnumb4;

        System.out.print("ваш код: " + ch1 + ch2 + ch3 + ch4);

        long l1 = 12_342_132_761L;
        int intNumber = (int) l1;
        System.out.println(intNumber);
     }
    }