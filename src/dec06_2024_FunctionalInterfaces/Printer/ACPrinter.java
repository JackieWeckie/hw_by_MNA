package dec06_2024_FunctionalInterfaces.Printer;

/**
 * ACPrinter - принтер, работающий с анонимным классом
 */

@FunctionalInterface
public interface ACPrinter {
    public void print();

    static void print(String message) {
        System.out.println("Строка распечатывается..." + message);
    }
}
