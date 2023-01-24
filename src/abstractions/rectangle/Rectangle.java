package abstractions.rectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }


    public boolean isInside(Point point) {
        return point.isGreaterThan(bottomLeft) && point.isLessThanOrEqual(topRight);
    }
}
