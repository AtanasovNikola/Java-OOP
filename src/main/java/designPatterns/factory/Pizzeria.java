package designPatterns.factory;

public class Pizzeria {
    PizzaFactory factory;

    public Pizzeria(PizzaFactory pizzaFactory) {
        this.factory = pizzaFactory;
    }

    public Pizza orderPizza(PizzaType type, double diameter){
        Pizza pizza = factory.createPizza(type, diameter);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }
}
