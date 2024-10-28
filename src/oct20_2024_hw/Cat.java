package oct20_2024_hw;

public class Cat extends Animal implements Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void move() {
        System.out.println("He's going by using his paws.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " sharpens his talons.");
    }

    @Override
    public void beFriendly() {
        System.out.println(getName() + " loves to be stroked.");
    }
}
