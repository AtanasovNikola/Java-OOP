package polimorphism.shapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shape rectangle = new Rectangle(Double.parseDouble(scanner.nextLine()),Double.parseDouble(scanner.nextLine()));
        Shape circle = new Circle(Double.parseDouble(scanner.nextLine()));

        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());

        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());
    }
}
