package oct20_2024_hw;

public class Dog extends Animal implements Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void move() {
        System.out.println("She's going by using her paws.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " running to get the stick you threw.");
    }

    @Override
    public void beFriendly() {
        System.out.println(getName() + " very devote to her owner.");
    }
}
