package sep23_2024_hw;

public class second_task {
    public static void main(String[] args) {
      String name = "I like Java!!!";

        System.out.println("Последний символ: " + name.charAt(name.length() - 1));
        System.out.println("Конец подстроки: " + name.endsWith("!"));
        System.out.println("Начало строки: " + name.startsWith("I like"));
        System.out.println("Наличие подстроки Java: " + name.contains("Java"));
        System.out.println("Позиция подстроки Java: " + name.indexOf("Java"));
        System.out.println("Заменены символы a: " + name.replace("a", "o"));
        System.out.println("Строка в верхнем регистре: " + name.toUpperCase());
        System.out.println("Строка в нижнем регистре: " + name.toLowerCase());
    }
}
