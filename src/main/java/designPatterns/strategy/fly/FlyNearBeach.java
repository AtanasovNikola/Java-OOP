package designPatterns.strategy.fly;

public class FlyNearBeach implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("I can fly near beach");
    }
}
