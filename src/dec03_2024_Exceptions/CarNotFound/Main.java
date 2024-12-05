package dec03_2024_Exceptions.CarNotFound;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(new Car("BMW I8", 2020),
                new Car("DeLorean", 1989)));

        Car car = new Car("Dacia", 2004);

        getCar(car, cars);
    }

    public static Car getCar(Car car, List<Car> cars) {
        try {
            if (!cars.contains(car)) {
                throw new ExceptionMessage("This car is not found!");
            }
        } catch (ExceptionMessage e) {
            System.out.println(e.getMessage());
        }
        return car;
    }
}
