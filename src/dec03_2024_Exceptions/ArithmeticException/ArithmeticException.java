package dec03_2024_Exceptions.ArithmeticException;

public class ArithmeticException {
    static int result(int num, int denominator) {
        try {
            return num / denominator;
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Oops! Something went wrong!");
        }
        return 0;
    }
}
