package triangle;

public class Triangle {
    Point [] points;
   double side0;
   double side1;
   double side2;

    public Triangle(Point p1, Point p2, Point p3) {
        this.points =new Point[]{p1, p2 ,p3};
        side0 = points[0].getDistanceTo(points[1]);
        side1 = points[1].getDistanceTo(points[2]);
        side2 = points[2].getDistanceTo(points[0]);
    }
    public double  getPerimeter(){
        return side0 + side1 + side2;
    }
    public double getSquare(){
        double halfPerimeter = this.getPerimeter() * 0.5;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side0) * (halfPerimeter - side1)* (halfPerimeter -side2));
    }
}
