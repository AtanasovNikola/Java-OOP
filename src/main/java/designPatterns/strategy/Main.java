package designPatterns.strategy;

import designPatterns.strategy.fly.CantFly;
import designPatterns.strategy.fly.FlyHigh;
import designPatterns.strategy.fly.FlyNearBeach;

public class Main {
    public static void main(String[] args) {

        Bird eagle = new Bird(new FlyHigh());
        eagle.fly();

        eagle.setStrategy(new FlyNearBeach());
        eagle.fly();

        eagle.setStrategy(new CantFly());
        eagle.fly();
    }
}
