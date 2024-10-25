package oct20_2024_hw;

import org.w3c.dom.ls.LSOutput;

public abstract class Animal {
    protected String name;
    protected boolean canFly;

    public Animal(String name) {
        this.name = name;
    }

    abstract public void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
