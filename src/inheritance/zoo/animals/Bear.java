package inheritance.zoo.animals;

public class Bear extends Mammal {

    public Bear(String name) {
        super(name);
    }
    @Override
    public void call() {
        System.out.printf("Bear %s is kind of Mammal%n", getName());
    }
}
