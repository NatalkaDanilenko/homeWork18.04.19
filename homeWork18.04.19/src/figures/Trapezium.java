package figures;

public class Trapezium extends Shape {
    public static final int count = 4;
/*
* Our trapezium is ideal now
 */
    private Point a = new Point();
    private Point b = new Point();
    private Point c = new Point();
    private Point d = new Point();

    public Trapezium() {
    }

    public Trapezium(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

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
