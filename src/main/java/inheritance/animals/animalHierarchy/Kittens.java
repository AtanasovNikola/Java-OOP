package inheritance.animals.animalHierarchy;

public class Kittens extends Cat {

    public Kittens(String name, int age) {
        super(name, age, "Female");

    }

    @Override
    public void produceSound() {
        System.out.println("Meow");
    }
}
