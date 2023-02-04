package polimorphism.wildFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        while (!input[0].equals("End")) {
            String[] foodInput = scanner.nextLine().split("\\s+");

            Food food = extracted(foodInput);
            animal(input, food);

            input = scanner.nextLine().split("\\s+");
        }
    }

    private static void animal(String[] input, Food food) {
        String animalType = input[0];
        String animalName = input[1];
        String animalWeight = input[2];
        String animalRegion = input[3];

        Animal animal = getAnimal(input, animalType, animalName, animalWeight, animalRegion);

        animal.makeSound();
        animal.eat(food);
        System.out.println(animal);
    }

    private static Animal getAnimal(String[] input, String animalType,
                                    String animalName, String animalWeight, String animalRegion) {
        Animal animal = null;
        switch (animalType) {
            case "Cat" -> {
                String breed = input[4];
                animal = new Cat(animalType, animalName, Double.parseDouble(animalWeight), animalRegion, breed);
            }
            case "Tiger" -> animal = new Tiger(animalType, animalName, Double.parseDouble(animalWeight), animalRegion);
            case "Zebra" -> animal = new Zebra(animalType, animalName, Double.parseDouble(animalWeight), animalRegion);
            case "Mouse" -> animal = new Mouse(animalType, animalName, Double.parseDouble(animalWeight), animalRegion);
        }
        return animal;
    }

    private static Food extracted(String[] foodInput) {
        String foodType = foodInput[0];
        int foodQuantity = Integer.parseInt(foodInput[1]);

        if (foodType.equals("Vegetable")) {
            return new Vegetable(foodQuantity);
        } else if (foodType.equals("Meat")) {
            return new Meat(foodQuantity);
        }
        return null;
    }
}
