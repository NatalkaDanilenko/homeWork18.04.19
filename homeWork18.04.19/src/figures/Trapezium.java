package figures;

public class Trapezium extends Shape {
    private int count = 4;
/*
* Our trapezium is ideal now
 */
    Point a = new Point(0, 0);
    Point b = new Point(0, 5);
    Point c = new Point(2, 2);
    Point d = new Point(3, 2);

    @Override
    public double getPerimetr() {
        return getSide(a, b) + getSide(b, c) + getSide(c, d) + getSide(d, a);
    }

    @Override
    public double getArea() {
        return (getSide(b, c) + getSide(d, a)) / 2 * (b.getY() - a.getY());
    }

    private static double getSide(Point a, Point b){
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }
}
