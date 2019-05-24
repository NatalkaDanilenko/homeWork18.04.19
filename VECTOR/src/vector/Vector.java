package vector;
/*
Описать класс «Vector3d»
(т. е., он должен описывать вектор в трехмерной,
декартовой системе координат).

В качестве свойств этого класса
возьмите координаты вектора.
Для этого класса реализовать методы
сложения,
скалярного и векторного произведения векторов.
Создайте несколько объектов этого класса и протестируйте их.
 */
public class Vector {
    private double a;
    private double b;
    private double c;

    public Vector() {
    }

    public Vector(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public static double scalarMultipl(Vector v1, Vector v2){
        return v1.getA() * v2.getA() + v1.getB() * v2.getB() + v1.getC() * v2.getC();
    }

    public static Vector vectorMiltipl (Vector v1, Vector v2){
        double c2 = v2.getC();
        double c1 = v1.getC();
        double b2 = v2.getB();
        double b1 = v1.getB();
        double a2 = v2.getA();
        double a1 = v1.getA();
        return new Vector(b1 * c2 - c1 * b2,
                c1 * a2 - a1 * c2,
                a1 * b2 - b1 * a2);
    }

    public static Vector plus (Vector v1, Vector v2){
        double c2 = v2.getC();
        double c1 = v1.getC();
        double b2 = v2.getB();
        double b1 = v1.getB();
        double a2 = v2.getA();
        double a1 = v1.getA();
        return new Vector(a1 + a2, b1+ b2, c1 + c2);
    }

    @Override
    public String toString() {
        return "Vector{" +
                 a +
                ", " + b +
                ", " + c +
                '}';
    }
}
