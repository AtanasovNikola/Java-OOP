package polimorphism.wildFarm;

public class Cat extends Felime {
    private String breed;


    public Cat(String type, String name, double animalWeight, String livingRegion, String breed) {
        super(type, name, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    void eat(Food food) {
        setFoodEaten(getFoodEaten() + food.getQuantity());
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }
}
