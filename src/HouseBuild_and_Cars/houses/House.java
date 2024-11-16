package HouseBuild_and_Cars.houses;

import java.util.Objects;

public class House {
    private final int floorAmount;
    private final int roomAmount;
    private final boolean hasGarage;

    private House(Builder builder) {
        this.floorAmount = builder.floorAmount;
        this.roomAmount = builder.roomAmount;
        this.hasGarage = builder.hasGarage;
    }

    @Override
    public String toString() {
        return "\nThis house has " + floorAmount + " floors, " +
                roomAmount + " rooms and " +
                ((hasGarage) ? "" : "doesn't ") + "has garage";
    }

    public static class Builder {
        private int floorAmount;
        private int roomAmount;
        private boolean hasGarage;

        public Builder floorAmount(int fNum) {
            this.floorAmount = fNum;
            return this;
        }

        public Builder roomAmount(int rNum) {
            this.roomAmount = rNum;
            return this;
        }

        public Builder hasGarage(boolean hasG) {
            this.hasGarage = hasG;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return floorAmount == house.floorAmount && roomAmount == house.roomAmount && hasGarage == house.hasGarage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(floorAmount, roomAmount, hasGarage);
    }
}
