package HouseBuild_and_Cars.houses;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<House> houses = new ArrayList<>();
        House house1 = new House.Builder()
                .floorAmount(2)
                .roomAmount(4)
                .hasGarage(true)
                .build();

        House house2 = new House.Builder()
                .floorAmount(3)
                .roomAmount(5)
                .hasGarage(false)
                .build();

        House house3 = new House.Builder()
                .floorAmount(2)
                .roomAmount(4)
                .hasGarage(false)
                .build();

        House house4 = new House.Builder()
                .floorAmount(1)
                .roomAmount(2)
                .hasGarage(false)
                .build();

        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);

        if (houses.contains(house2)) {
            System.out.println("This house is exist!");
        } else {
            System.out.println("This house is not exist!");
        }

        System.out.println(houses.indexOf(house1));
        System.out.println(houses.indexOf(house3));

        System.out.println(houses);
    }
}
