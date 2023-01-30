package inheritance.zoo.animals;

public class Gorilla extends Mammal{

    public Gorilla(String name) {
        super(name);
    }
    @Override
    public void call() {
        System.out.printf("Gorilla %s is kind of Mammal%n", getName());
    }
}
