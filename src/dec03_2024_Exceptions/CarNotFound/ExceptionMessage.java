package dec03_2024_Exceptions.CarNotFound;

public class ExceptionMessage extends RuntimeException {
    public ExceptionMessage(String message) {
        super(message);
    }
}
