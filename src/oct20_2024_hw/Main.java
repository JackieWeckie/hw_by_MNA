package oct20_2024_hw;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
        Cat cat = new Cat("Cat");
        Bird bird = new Bird("Ostrich", false);
        Bird bird1 = new Bird("Parrot", true);

        Animal[] animals = {dog, cat, bird, bird1};

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says: ");
            animal.makeSound();
            System.out.println(" How does this animal moves?: ");
            animal.move();
        }

        if (dog instanceof Pet) {
            ((Pet) dog).play();
            ((Pet) dog).beFriendly();
        }
        if (cat instanceof Pet) {
            ((Pet) cat).play();
            ((Pet) cat).beFriendly();
        }
    }
}
