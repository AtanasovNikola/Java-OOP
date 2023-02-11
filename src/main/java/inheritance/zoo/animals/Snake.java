package inheritance.zoo.animals;

public class Snake extends Reptile {

    public Snake(String name) {
        super(name);
    }
    @Override
    public void call() {
        System.out.printf("Snake %s is kind of Reptile%n", getName());
    }
}
