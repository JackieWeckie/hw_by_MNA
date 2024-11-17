package HouseBuild_and_Cars.cars;

import java.util.Objects;

public class Car implements Comparable<Car> {
   private String model;
   private String color;
   private int year;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Objects.equals(year, car.year) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, year);
    }

    @Override
    public int compareTo(Car o) {
        Car newCar = (Car) o;
        int compareModel = model.compareTo(model);
        if (compareModel == 0) {
            return Integer.compare(year, o.year);
        }
        if (year == o.year) {
            return color.compareTo(o.color);
        }
        return compareModel;
    }

    @Override
    public String toString() {
        return "Model - " + model + "\nColor - " + color + "\nYear - " + year;
    }
}
