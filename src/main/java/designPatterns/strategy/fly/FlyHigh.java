package designPatterns.strategy.fly;

public class FlyHigh implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("I can fly high");
    }
}
