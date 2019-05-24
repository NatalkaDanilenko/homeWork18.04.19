package cat;

/*
Описать класс «Cat»
(в качестве образца можно взять домашнего питомца).
Наделить его свойствами и методами.
Создать несколько экземпляров объектов этого класса.
Использовать эти объекты.
 */
public class Cat {
    private String color;
    private String name;
    private double weight;
    private int year;

    public Cat(String color, String name, double weight, int year) {
        this.color = color;
        this.name = name;
        this.weight = weight;
        this.year = year;
    }

    public Cat() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void murrr() {
        System.out.println("Murrrr! Murrrr");
    }

    public void jump() {
        if (weight < 5) {
            System.out.println("Jump!");
        } else {
            System.out.println("Miau....");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", year=" + year +
                '}';
    }
}
