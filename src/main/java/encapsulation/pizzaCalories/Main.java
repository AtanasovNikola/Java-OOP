package encapsulation.pizzaCalories;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Pizza> pizzaMap = new LinkedHashMap<>();
        List<Topping> toppings = new ArrayList<>();

        String[] pizzaArray = scanner.nextLine().split("\\s+");
        String pizzaName = pizzaArray[1];
        int numOfToppings = Integer.parseInt(pizzaArray[2]);

        try {
            Pizza pizza = new Pizza(pizzaName, numOfToppings);
            pizzaMap.put(pizzaName, pizza);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        String[] doughArr = scanner.nextLine().split("\\s+");
        String flourType = doughArr[1];
        String bakingTechnique = doughArr[2];
        double doughWeight = Double.parseDouble(doughArr[3]);

        try {
            Dough dough = new Dough(flourType, bakingTechnique, doughWeight);
            pizzaMap.get(pizzaName).setDough(dough);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        String[] toppingArr = scanner.nextLine().split("\\s+");

        while (!toppingArr[0].equals("END")) {

            String toppingType = toppingArr[1];
            double toppingWeight = Double.parseDouble(toppingArr[2]);

            try {
                Topping topping = new Topping(toppingType, toppingWeight);
                toppings.add(topping);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
            toppingArr = scanner.nextLine().split("\\s+");
        }
        pizzaMap.get(pizzaName).setToppings(numOfToppings, toppings);

        System.out.printf("%s - %.2f", pizzaName, pizzaMap.get(pizzaName).getOverallCalories());

    }
}
