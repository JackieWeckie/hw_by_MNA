package Methods;

public class Methods {
    static byte getSquare(byte number) {
        return (byte) Math.pow(number, 2); //* Выводит квадрат числа */
    }

    static String getFullName(String name, String surname) {
        return name + surname; //* Выводит полное имя пользователя */
    }

    //* Код ниже выведет самую короткую и самую длинную строку */
    static String[] getCornerValuesArray(String... s) {
        byte shortLine = (byte) s[0].length();
        byte longLine = (byte) s[0].length();
        String shortWord = s[0];
        String longWord = s[0];

        for (String letter : s) {
            if (letter.length() < shortLine) {
                shortWord = letter;
            }
            if (letter.length() > longLine) {
                longWord = letter;
            }
        }
        return new String[]{shortWord, longWord};
    }

    //* Дополнение к предыдущему дз от 28/09/2024. -> */

    //* Данный код возвращает минимальное и максимальное значение типа int */
    static int[] getCornerValuesArray(int... i) {
        int minNum = i[0];
        int maxNum = i[0];

        for (int letter : i) {
            if (minNum > letter) {
                minNum = letter;
            }
            if (maxNum < letter) {
                maxNum = letter;
            }
        }
        return new int[]{minNum, maxNum};
    }

    //* Код ниже возвращает самый малый и самый большой символ типа char */

    static char[] getCornerValuesArray(char... c) {
        char minChar = c[0];
        char maxChar = c[0];

        for (char symbol : c) {
            if (minChar > symbol) {
                minChar = symbol;
            }
            if (maxChar < symbol) {
                maxChar = symbol;
            }
        }
        return new char[]{minChar, maxChar};
    }

    static String[] getCornerCases(String... str) {
        return str;
    }

    static int getFactorial(int sum) {
        int result = 1;

        for (int i = 1; i <= sum; i++) {
            result = result * i;
        }
        return result;
    }
}