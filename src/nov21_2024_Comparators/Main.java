package nov21_2024_Comparators;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        char spaceChanger = '_';
        String space = " ";
        String s = "java is fun and java is powerful";
        Map<Character, Integer> symbols = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            symbols.put(c, symbols.getOrDefault(c, 0) + 1);
        }

        System.out.println(symbols);
    }
}
