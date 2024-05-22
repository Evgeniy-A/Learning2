package triangle;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getDistanceTo(Point p2) {
        double katet1 = Math.abs(this.x - p2.x);
        double katet2 = Math.abs(this.y - p2.y);
        return Math.sqrt(Math.pow(katet1, 2) + Math.pow(katet2, 2));
    }
}
