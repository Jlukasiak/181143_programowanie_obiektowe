package zad2;

public class Point {
    public double x;
    public double y;

    public double distance(Point otherPoint) {
        double dx = this.x - otherPoint.x;
        double dy = this.y - otherPoint.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
