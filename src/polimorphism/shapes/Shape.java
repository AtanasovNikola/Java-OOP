package polimorphism.shapes;

public abstract class Shape {
    private double perimeter;
    private double area;

    abstract double calculatePerimeter();
    abstract double calculateArea();

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }
}
