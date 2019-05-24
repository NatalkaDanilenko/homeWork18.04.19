package figures;

public class Circle extends Shape {
    public static final int count = 2;
    Point r = new Point();
    Point o = new Point();
    public double rad = Math.sqrt((Math.pow(r.getX() - o.getX(), 2)) + Math.pow(r.getY() - o.getY(), 2));

    public Circle() {
    }

    public Circle(int count, Point r, Point o, double rad) {
        this.r = r;
        this.o = o;
        this.rad = rad;
    }

    public Point getR() {
        return r;
    }

    public void setR(Point r) {
        this.r = r;
    }

    public Point getO() {
        return o;
    }

    public void setO(Point o) {
        this.o = o;
    }

    public double getRad() {
        return rad;
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * rad;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * Math.pow(rad, 2);
    }
}
