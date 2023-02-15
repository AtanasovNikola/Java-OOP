package designPatterns.factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Welcome to our Pizzeria!%n" +
                "We have the the following types of pizza:%n" +
                "%s%n%s%nPlease write the one you want to order.%n",PizzaType.BULGARIAN,PizzaType.ITALIAN);
        PizzaType pizzaType = PizzaType.valueOf(scanner.nextLine().toUpperCase());
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizzeria pizzeria = new Pizzeria(pizzaFactory);
        pizzeria.orderPizza(pizzaType, 22);

    }
}
