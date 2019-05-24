package vector;

public class Main {
    public static void main(String[] args) {
        Vector v1  = new Vector(2,4,6);
        Vector v2  = new Vector();
        v2.setA(4);
        v2.setB(5);
        v2.setC(6);

        System.out.println("Scalar multipl of your vectors: " + Vector.scalarMultipl(v1, v2));
        System.out.println("Vector multipl of your vectors: " + Vector.vectorMiltipl(v1, v2).toString());
        System.out.println("Sum of your vectors: " + Vector.plus(v1, v2).toString());

    }
}
