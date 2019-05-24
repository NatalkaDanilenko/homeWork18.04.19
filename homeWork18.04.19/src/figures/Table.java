package figures;

import java.io.File;

public class Table {
    // все по клеточкам

    private int h;// высота таблички в клеточках
    private int s;// ширина таблички в клеточках

    public Table() {
    }

    public Table(int h, int s) {
        this.h = h;
        this.s = s;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    /**
     * This method can  add your Figure in choose place.
     * If this operation done, method print "Your figure exist in your choose-place".
     * Else - print "You can not add this figure in choose-place".
     *
     * @param param - this is a array of params of your figure
     */
    public static void addFigure (Point [] points, int h, int s, File file){

    }
    /**
     * This method can  remove your Figure in choose place.
     * If this operation done, method print "Your figure remove from your choose-place".
     * Else - print "You can not done this operation".
     *
     * @param params - this is a array of params of your figure
     */
    public static void removeFigure (Point [] points, int h, int s, File file){

    }
    /**
     * This method can print info about your Figure.
     * Print perimetr and area of figure.
     * If this operation can not done, method print
     * "You can not done this operation".
     *
     */
    public static void printInfo (){

    }

}
