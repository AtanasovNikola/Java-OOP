package designPatterns.factory;

public abstract class Pizza {

    private double diameter;

    public Pizza(double diameter) {
        this.diameter = diameter;
    }
    public abstract void prepare();
    public abstract void bake();
    public abstract void box();
}
