package cat;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Black", "Barsik", 3.5, 2);
        Cat cat2 = new Cat("White", "Murka", 7.62, 4);
        Cat cat3 = new Cat();
        cat3.setYear(6);
        cat3.setColor("Foxy");
        cat3.setWeight(2.8);

        System.out.println(cat1.getYear());

        System.out.println(cat2);
        System.out.println(cat3);

    }

}
