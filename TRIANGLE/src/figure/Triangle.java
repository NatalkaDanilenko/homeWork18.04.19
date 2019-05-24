package figure;
/*
Описать класс «Triangle».
В качестве свойств возьмите длины сторон треугольника.
Реализуйте метод, который будет возвращать
площадь этого треугольника.
Создайте несколько объектов этого класса
и протестируйте их.
 */
public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
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

    public double getArea() {
        double p = (getA() + getB() + getC()) / 2;
        return Math.sqrt(p * (p - getA()) * (p - getB()) * (p - getC()));
    }


}
