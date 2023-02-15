package designPatterns.factory;

public class PizzaFactory {
    public Pizza createPizza(PizzaType pizzaType, double diameter) {

        Pizza pizza = switch (pizzaType) {
            case BULGARIAN -> new BulgarianPizza(diameter);
            case ITALIAN -> new ItalianPizza(diameter);
        };
        return pizza;
    }

}
