package figures;

/**
 * Создайте классы, которые описывают,
 * как минимум, три геометрические фигуры
 * (они должны быть подклассами Shape).
 * При этом они в качестве свойств должны содержать классы Point.
 */
public class Triangle extends Shape {
    public static final int count = 3;
    private Point a = new Point();
    private Point b = new Point();
    private Point c = new Point();

    public Triangle() {
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
