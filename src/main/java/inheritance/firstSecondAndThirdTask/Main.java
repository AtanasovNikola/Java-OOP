package inheritance.firstSecondAndThirdTask;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();

        Dog dog = new Dog();

        Puppy puppy = new Puppy();

        Cat cat = new Cat();

        animal.eat();

        dog.eat();
        dog.bark();

        puppy.eat();
        puppy.bark();
        puppy.weep();

        cat.eat();
        cat.meow();
    }
}
