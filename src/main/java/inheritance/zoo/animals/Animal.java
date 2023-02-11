package inheritance.zoo.animals;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void call (){
        System.out.println("Animal " + name);
    }
}
