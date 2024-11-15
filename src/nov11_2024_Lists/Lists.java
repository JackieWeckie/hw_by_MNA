package nov11_2024_Lists;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class Lists {
    public static List<Integer> arrayList = new ArrayList<>();
    public static List<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        System.out.println("Adding to the end (Array List): " + getComplitingTime(arrayList));
        System.out.println("Adding to the end (Linked List): " + getComplitingTime(linkedList));

        System.out.println();

        System.out.println("The random index of the Array List: " + getRandomIndex(arrayList));
        System.out.println("The random index of the Linked List: " + getRandomIndex(linkedList));
    }

    public static long getComplitingTime(List<Integer> list) {
        LocalTime start = LocalTime.now();
        for (int i = 0; i <= 1_000_000; i++) {
            list.add(i);
        }

        LocalTime end = LocalTime.now();
        Duration time = Duration.between(start, end);
        long duration = time.toMillis();
        return duration;
    }

    public static long getRandomIndex(List<Integer> list) {
        LocalTime start1 = LocalTime.now();
        Collections.shuffle(arrayList);
        Collections.shuffle(linkedList);
        Random rnd = new Random();

        for (int i = 0; i < 100_000; i++) {
            int randomIndex = rnd.nextInt(0, 100_000 - 1);
            arrayList.get(randomIndex);
            linkedList.get(randomIndex);
        }

        LocalTime end1 = LocalTime.now();
        Duration time = Duration.between(start1, end1);
        long duration1 = time.toMillis();

        return duration1;
    }
}
