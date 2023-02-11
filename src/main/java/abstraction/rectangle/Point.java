package abstraction.rectangle;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isGreaterThan (Point point){
        return x>= point.x && y>=point.y;
    }

    public boolean isLessThanOrEqual(Point point){
        return x<= point.x && y<=point.y;
    }
}
