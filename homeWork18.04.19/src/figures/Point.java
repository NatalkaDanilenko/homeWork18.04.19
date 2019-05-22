package figures;

import java.util.Scanner;

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
     * @param x - x-coord
     */
    public void setX(double x) {
        this.x = x;
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
     * @param y - y-coord
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * This method scan array of point for create your figure and return it.
     * @param count - count of points for create your figure.
     *              For example: for figures.Circle you should input 2 points (O(0.0) and R (2.0)).
     * @return array of points for your figure
     */
    public double [] myScanner(int count) {
        double[] coordOfFigure = new double[count];
        for (int i = 0; i < count; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input " + count + " point of your figure");
            coordOfFigure[i] = sc.nextDouble();
        }
        return coordOfFigure;
    }
}
