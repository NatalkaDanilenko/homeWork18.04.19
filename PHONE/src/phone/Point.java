package phone;

public class Point {
    private double x;
    private double y;

    /**
     * Constructor for init coordinate of point
     * For example : you have a figures.Point O(2,4). x = 2, y = 4.
     * @param x - x-coord of figures.Point
     * @param y - y-coord of figures.Point
     */
    public Point(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    /**
     * default constructor for figures.Point
     */
    public Point() {
    }

    /**
     * This method return x-coord of your point.
     * @return x-coord
     */
    public double getX() {
        return x;
    }

    /**
     * This method set x-coord of your point.
     * @param point - x-coord
     */
    public void setX(double point) {
        this.x = point;
    }

    /**
     * This method return y-coord of your point.
     * @return y-coord
     */
    public double getY() {
        return y;
    }

    /**
     * This method set y-coord of your point.
     * @param point - y-coord of class Point
     */
    public void setY(double point) {
        this.y = point;
    }
}
