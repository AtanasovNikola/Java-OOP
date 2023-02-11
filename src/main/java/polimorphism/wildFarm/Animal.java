package polimorphism.wildFarm;

public abstract class Animal {
    private String type;
    private String name;
    private double animalWeight;
    private Integer foodEaten;

    public Animal(String type, String name, double animalWeight) {
        this.type = type;
        this.name = name;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    abstract void makeSound();

    abstract void eat(Food food);


}
