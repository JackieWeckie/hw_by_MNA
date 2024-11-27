package nov25_2024_immutableClases;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ImmutableClass immutableClass1 = new ImmutableClass(12345678, Collections.singletonList(100));
        //неизменяемый класс с полями ID и максимальное кол-во друзей
        User user1 = new User("Random_username", 5);
        //а этот класс можно менять. Юзер может менять имя да и рейтинг тоже изменяется

        ImmutableClass immutableClass2 = new ImmutableClass(11112222, Collections.singletonList(100));
        User user2 = new User("John", 4);

        System.out.println(immutableClass1);
        System.out.println(user1);
        System.out.println(immutableClass2);
        System.out.println(user2);

        user1.setUser("New_username"); //меняем информацию о юзере1
        user2.setUserRating(3); //у юзера 2 упал рейтинг

        System.out.println("\n" + user1);
        System.out.println(immutableClass1);

        System.out.println(user2);
        System.out.println(immutableClass2);

        System.out.println("\n============================================================");

        Box<String> box1 = new Box<>("_");
        Box<Double> box2 = new Box<>(11.4);
        Box<Integer> box3 = new Box<>(null);

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);

        box3.setContains(256);
        System.out.println("Обновлённое значение бокса: " + box3.getContains());

        box1.clear();
    }
}
