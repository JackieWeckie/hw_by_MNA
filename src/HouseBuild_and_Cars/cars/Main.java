package HouseBuild_and_Cars.cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW I8", "White", 2020);
        Car car2 = new Car("Mercedes Maybach", "Black", 2021);
        Car car3 = new Car("Mercedes Maybach", "Black", 2019);
        Car car4 = new Car("Lamborgini Hurricane", "Yellow", 2017);
        Car car5 = new Car("Lamborgini Urus", "Lime", 2020);
        Car car6 = new Car("Porche Cayenne", "White", 2018);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);

        for(Car car : cars) {
            System.out.println(car + "\n");
        }

        Collections.sort(cars, Car::compareTo);

        for(Car car : cars) {
            System.out.println(car + "\n");
        }

        Collections.sort(cars, Car::compareTo);

        for(Car car : cars) {
            System.out.println(car + "\n");
        }
    }
}
