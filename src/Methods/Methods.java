package Methods;

public class Methods {
    static byte getSquare(byte number) {
        return (byte) Math.pow(number, 2);
    }

    static String getFullName(String name, String surname) {
        return name + surname;
    }

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
}
