package figures;

import java.io.File;

public class DrawFigure {
    public File file;
    public Table table;

    private int count;

    private Point po1 = new Point();
    private Point po2 = new Point();
    private Point po3 = new Point();
    private Point po4 = new Point();


    public boolean figureCanBeExist(Trapezium trapezium) {
        if (pointCanBeExist(trapezium.getA())
                && pointCanBeExist(trapezium.getB())
                && pointCanBeExist(trapezium.getC())) {
            return true;
        }
        return false;
    }

    public boolean figureCanBeExist(Circle circle) {
        if (pointCanBeExist(circle.getR())
                && pointCanBeExist(circle.getO())) {
            return true;
        }
        return false;
    }

    public boolean figureCanBeExist(Triangle triangle) {
        if (pointCanBeExist(triangle.getA())
                && pointCanBeExist(triangle.getB())
                && pointCanBeExist(triangle.getC())) {
            return true;
        }
        return false;
    }

    public boolean pointCanBeExist(Point point) {
        if (Math.abs(point.getX()) > table.getS()
                || (Math.abs(point.getY()) < table.getH())) {
            throw new RuntimeException("Can not draw your figure!");
        }
        return true;
    }


    //circle
    public void draw(Circle circle, Table table) {
        int r = (int) Math.ceil(circle.getRad());
        for (int i = 0; i < table.getS(); i++) {
            for (int j = 0; j < table.getH(); j++) {
                if (i < i - r / 2 && j < j - r / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //triangle
    public void draw(Point po1, Point po2, Point po3) {

    }

    //trapezium
    public void draw(Point po1, Point po2, Point po3, Point po4) {

    }

}
