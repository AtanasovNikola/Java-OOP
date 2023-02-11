package polimorphism.wildFarm;

public class Mouse extends Mammal {

    public Mouse(String type, String name, double animalWeight, String livingRegion) {
        super(type, name, animalWeight, livingRegion);
    }

    @Override
    void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")) {
            setFoodEaten(getFoodEaten() + food.getQuantity());
        }else {
            System.out.printf("%s are not eating that type of food!%n",super.getType());
        }
    }

    @Override
    void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }
}
