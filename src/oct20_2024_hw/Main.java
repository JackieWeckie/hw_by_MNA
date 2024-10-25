package oct20_2024_hw;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
        Cat cat = new Cat("Cat");
        Bird bird = new Bird("Bird", true);

        Animal[] animals = {dog, cat, bird};

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says: ");
            animal.makeSound();
        }
    }
}
