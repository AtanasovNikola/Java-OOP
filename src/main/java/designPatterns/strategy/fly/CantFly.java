package designPatterns.strategy.fly;

public class CantFly implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
