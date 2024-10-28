package oct20_2024_hw;

public final class Bird extends Animal {
    private final boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }

    @Override
    public void move() {
        if (this.canFly) {
            System.out.println(getName() + " is flying!");
        } else {
            System.out.println(getName() + " doesn't flying!");
        }
    }
}
