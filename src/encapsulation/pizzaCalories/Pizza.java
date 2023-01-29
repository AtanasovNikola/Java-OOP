package encapsulation.pizzaCalories;

import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza() {
    }

    public Pizza(String name, int numOfToppings) {
        this.setName(name);
        this.setToppings(numOfToppings, toppings);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty() || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols");
        }
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setToppings(int numOfToppings, List<Topping> toppings) {
        if (numOfToppings < 0 || numOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in rance [0..10].");
        }
        this.toppings = toppings;
    }


    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double getOverallCalories() {
        double result = 0;
        for (Topping topping : toppings) {
            result += topping.calculateCalories();
        }
        return dough.calculateCalories() + result;
    }
}
