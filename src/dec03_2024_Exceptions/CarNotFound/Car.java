package dec03_2024_Exceptions.CarNotFound;

import java.util.Objects;

public class Car {
    private String model;
    private Integer year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car {" + "\nModel: " + model + "\nManufacture year: " + year + "}";
    }
}
