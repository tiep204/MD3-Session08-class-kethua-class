package ra;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
    }

    @Override
    public String makeSound() {
        return "meo meo meooooo";
    }
}