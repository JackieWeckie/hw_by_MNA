package Methods;

public class Methods {
/** Код ниже выводит квадрат числа */
    static byte getSquare(byte number) {
        return (byte) Math.pow(number, 2); 
    }

    static String getFullName(String name, String surname) {
/** Код ниже выводит полное имя пользователя */
        return name + surname; 
    }
    
    static String[] getCornerValuesArray(String... s) {
/** Код ниже выведет самую короткую и самую длинную строку */
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

/** Дополнение к предыдущему дз от 28/09/2024 -> */

    static int[] getCornerValuesArray(int... i) {
/** Данный код возвращает минимальное и максимальное значение типа int */
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

    static char[] getCornerValuesArray(char... c) {
/** Код ниже возвращает самый малый и самый большой символ типа char */
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
}
