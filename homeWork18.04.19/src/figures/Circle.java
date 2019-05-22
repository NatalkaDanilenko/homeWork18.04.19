package figures;

public class Circle extends Shape {
    private int count = 2;

    Point r = new Point(2 , 3);
    Point o = new Point(0, 0);
    private double rad = Math.sqrt((Math.pow(r.getX() - o.getX(), 2)) + Math.pow(r.getY() - o.getY(), 2));

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * rad;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * Math.pow(rad, 2);
    }
}
