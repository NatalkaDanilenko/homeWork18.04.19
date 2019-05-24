package figure;

public class Main {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(12.2, 7.2, 5.9);
        Triangle tr2 = new Triangle();
        tr2.setA(5.0);
        tr2.setB(3);
        tr2.setC(4);
        printArea(tr1, "first");

        printArea(tr2, "second");

    }

    public static void printArea(Triangle tr, String msg) {
        if (existsTriangle(tr.getA(), tr.getB(), tr.getC())) {
            System.out.println("Area of your " + msg + " triangle: " + tr.getArea());
        } else {
            System.out.println("Your " + msg + " triangle can not exist");
        }
    }

    public static boolean existsTriangle(double a, double b, double c){
        if (a + b > c && b + c > a && a+ c > b){
            return true;
        }
        return false;
    }


}
