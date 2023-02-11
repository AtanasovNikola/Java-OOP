package inheritance.zoo;

import inheritance.zoo.animals.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Animal animal = new Animal(scanner.nextLine());

        Reptile reptile = new Reptile(scanner.nextLine());

        Mammal mammal = new Mammal(scanner.nextLine());

        Lizard lizard = new Lizard(scanner.nextLine());

        Snake snake = new Snake(scanner.nextLine());

        Gorilla gorilla = new Gorilla(scanner.nextLine());

        Bear bear = new Bear(scanner.nextLine());

        animal.call();
        reptile.call();
        mammal.call();
        lizard.call();
        snake.call();
        gorilla.call();
        bear.call();
    }
}
