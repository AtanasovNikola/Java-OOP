package inheritance.zoo.animals;

public class Lizard extends Reptile{

    public Lizard(String name) {
        super(name);
    }

    @Override
    public void call() {
        System.out.printf("Lizard %s is kind of Reptile%n",  getName());
    }
}
