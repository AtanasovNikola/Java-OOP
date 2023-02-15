package designPatterns.builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza().withName("Margarita")
                .withDiameter(30)
                .withProduct("Cheese")
                .withTopping("Ketchup")
                .isSpicy("yes")
                .hasMeat("yes");

        Pizza pizza2 = new Pizza().withName("Italian Kaprichoza")
                .withDiameter(15)
                .withProduct("Blue cheese")
                .withTopping("Mayonnaise")
                .isSpicy("no")
                .hasMeat("no");

        System.out.println(pizza);
        System.out.println(pizza2);
    }
}
