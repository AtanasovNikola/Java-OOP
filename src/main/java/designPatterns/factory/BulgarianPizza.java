package designPatterns.factory;

public class BulgarianPizza extends Pizza {

    public BulgarianPizza(double diameter) {
        super(diameter);
    }

    @Override
    public void prepare() {
        System.out.println("Prepare Bulgarian pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Italian pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Italian pizza");
    }
}
