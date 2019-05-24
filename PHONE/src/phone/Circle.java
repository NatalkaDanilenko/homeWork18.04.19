package phone;

public class Circle {
    private Point r = new Point();
    private Point o = new Point();

    private double rad = Math.sqrt((Math.pow(r.getX() - o.getX(), 2))
            + Math.pow(r.getY() - o.getY(), 2));

    public Circle(Point r, Point o, double rad) {
        this.r = r;
        this.o = o;
        this.rad = rad;
    }

    public Circle() {
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

}
