package designPatterns.strategy;

import designPatterns.strategy.fly.FlyStrategy;

public class Bird {

    FlyStrategy strategy;

    public Bird(FlyStrategy strategy) {
        this.strategy = strategy;
    }

    public FlyStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(FlyStrategy strategy) {
        this.strategy = strategy;
    }

    public void fly(){
        strategy.fly();
    }

}
