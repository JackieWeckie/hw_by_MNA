package dec06_2024_FunctionalInterfaces.Printer;

import javafx.print.Printer;

public class Main {
    public static void main(String[] args) {
        //реализуем с помощью анонимного класса:
        ACPrinter printer = new ACPrinter() {
            @Override
            public void print() {
                System.out.println("Строка распечатывается... (анон. класс)");
            }
        };
        printer.print();

        //с помощью лямбда-выражений:
        ACPrinter printer2 = () -> System.out.println("Строка распечатывается... (лямбда)");
        printer2.print();

        //лямбда + длина сообщения:
        LambdaPrinter lambdaPrinter = n -> {
            System.out.println("Строка распечатывается...");
            System.out.println("Длина сообщения " + n.length() + " символов");
        };
        lambdaPrinter.print("Распечатывание строки завершено!");

    }
}
