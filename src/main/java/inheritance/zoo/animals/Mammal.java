package inheritance.zoo.animals;

public class Mammal extends Animal{

    public Mammal(String name) {
        super(name);
    }
    @Override
    public void call() {
        System.out.printf("Mammal %s is kind of Animal%n",getName());

    }
}
