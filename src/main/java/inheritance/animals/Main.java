package inheritance.animals;

import inheritance.animals.animalHierarchy.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Animal> animals = new LinkedHashMap<>();

        String animalType = scanner.nextLine();

        while (!animalType.equals("Beast!")) {

            String[] animalParam = scanner.nextLine().split("\\s+");

            String name = animalParam[0];
            int age = Integer.parseInt(animalParam[1]);
            String gender = animalParam[2];

            addAnimal(animalType, name, age, gender, animals);

            animalType = scanner.nextLine();
        }

        for (var entry : animals.entrySet()) {
            System.out.println(entry.getKey());
            System.out.printf("%s %d %s%n",
                    entry.getValue().getName(), entry.getValue().getAge(), entry.getValue().getGender());
            entry.getValue().produceSound();
        }
    }

    public static Map<String, Animal> addAnimal(String animalType, String name, int age, String gender, Map<String, Animal> animals) {
        try {


            switch (animalType) {
                case "Dog" -> {
                    Dog dog = new Dog(name, age, gender);
                    animals.put(animalType, dog);
                }
                case "Cat" -> {
                    Cat cat = new Cat(name, age, gender);
                    animals.put(animalType, cat);
                }
                case "Frog" -> {
                    Frog frog = new Frog(name, age, gender);
                    animals.put(animalType, frog);
                }
                case "Kittens" -> {
                    Kittens kittens = new Kittens(name, age);
                    animals.put(animalType, kittens);
                }
                case "Tomcat" -> {
                    Tomcat tomcat = new Tomcat(name, age);
                    animals.put(animalType, tomcat);
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return animals;
    }
}
