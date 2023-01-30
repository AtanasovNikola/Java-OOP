package inheritance.zoo.animals;

public class Reptile extends Animal{

    public Reptile(String name){
        super(name);
    }

    @Override
    public void call() {
        System.out.printf("Reptile %s is kind of Animal%n", getName());
    }
}
