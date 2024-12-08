package dec06_2024_FunctionalInterfaces.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "fig", "date", "kiwi", "grape");
        List<String> newWords = new ArrayList<>();
        System.out.println("Исходный массив: " + words);

        newWords = words.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Массив в верхнем регистре: " + newWords);

        newWords = words.stream()
                .filter(n -> n.length() > 4)
                .toList();
        System.out.println("Массив с элементами, где больше 4-ёх символов: " + newWords);

        newWords = words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
        System.out.println("Сортировка элементов массива по кол-ву символов (по возрастанию): " + newWords);
    }
}
