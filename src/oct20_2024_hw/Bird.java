package oct20_2024_hw;

public class Bird extends Animal {
    protected boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }
}
