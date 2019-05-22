package figures;

public class Triangle extends Shape {
    private int count = 3;
    Point a = new Point(0, 0);
    Point b = new Point(0, 5);
    Point c = new Point(2, 3);

    /**
     * @return perimetr of your triangle
     */
    @Override
    public double getPerimetr() {
        return getSide(b, a) + getSide(c, b) + getSide(c, a);
    }

    /**
     * @return area of your triangle
     */
    @Override
    public double getArea() {
        double p = getPerimetr() / 2;
        return Math.sqrt(p * (p - getSide(a, b)) * (p - getSide(c, b)) * (p - getSide(c, a)));
    }

    /**
     *
     * @param a - this is a point (coord, like A (2,1)) of your figure
     * @param b - this is a point (coord, like B (7,1)) of your figure
     * @return size of side of triangle (like size AB)
     */
    private static double getSide(Point a, Point b){
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }

}
