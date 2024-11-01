package oct31_2024_HouseBuild;

public class Main {
    public static void main(String[] args) {
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

        System.out.println(house1);
        System.out.println(house2);
    }
}
