package designPatterns.observer;

public class CarEnthusiast implements Observer {

    @Override
    public void update(String magazineName) {
        System.out.println(magazineName + " is opened.");
    }
}
