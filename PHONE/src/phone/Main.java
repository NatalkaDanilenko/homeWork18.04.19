package phone;

import java.util.Scanner;

/*
Опишите класс Phone (одним из свойств должен быть его номер).
Также опишите класс Network (сеть мобильного оператора).
Телефон должен иметь метод регистрации в сети мобильного оператора.
Также у телефона должен быть метод call (номер другого телефона),
который переберет все телефоны, зарегистрированные в сети.
Если такой номер будет найден, то осуществить вызов, если нет - вывести
сообщение об ошибочности набранного номера.
 */
public class Main {
    public static void main(String[] args) {
        String LIKE = "like point O(x , y). First input x. Than input y.";
        Phone ph1 = new Phone();
        Phone ph2 = new Phone();
        initPhones(LIKE, ph1, ph2);
        Network network = new Network();
        initNetwork(LIKE, network);
        calling(ph1, ph2, network);
    }

    private static void calling(Phone ph1, Phone ph2, Network network) {
        if (flag(ph1, network)) {
            ph1.setNetworkIn(true);
            System.out.println("Your phone in of network coverage");
        } else {
            throw new RuntimeException("Your phone out of network coverage");
        }

        if (ph1.isNetworkIn()) {
            if (flag(ph2, network)) {
                System.out.println("Subscriber in of network coverage");
                System.out.println("SUPER! CALLING... \n" +
                        "Listen to the song by Monatik...");
            } else {
                throw new RuntimeException("Subscriber out of network coverage");
            }
        }
    }

    private static boolean flag(Phone ph, Network network) {
        return ph.checkIn(ph.getX(), ph.getY(),
                network.getStationOne().getRad(), ph);
    }

    private static void initNetwork(String LIKE, Network network) {
        System.out.println("Input Radius base-station of your Operator and central-point O. \n" +
                "Looks like this: " + LIKE + " \n" +
                "Than input radius " + LIKE + " ");
        network.setStationOne(setCircle());
    }

    private static void initPhones(String LIKE, Phone ph1, Phone ph2) {
        ph1.setNumber(380111111111L);
        ph2.setNumber(380222222222L);
        System.out.println("Input your position on map " + LIKE);
        setCoord(ph1);
        System.out.println("Input position your friend on map " + LIKE);
        setCoord(ph2);
    }

    private static Circle setCircle() {
        Circle bs = new Circle();
        bs.setO(setCoord());
        bs.setR(setCoord());
        return bs;
    }

    private static void setCoord(Phone ph) {
        double[] arr = myScanner();
        ph.setX(arr[0]);
        ph.setY(arr[1]);
    }

    private static Point setCoord() {
        Point p = new Point();
        double[] arr = myScanner();
        p.setX(arr[0]);
        p.setY(arr[1]);
        return p;
    }

    /**
     * This method scan array of coord for point and return it.
     * For example: for point A you should input 2 coord A(0, 2).
     *
     * @return array of points for your figure
     */
    public static double[] myScanner() {
        double[] coordOfFigure = new double[2];
        Scanner sc = new Scanner(System.in);
        coordOfFigure[0] = sc.nextDouble();
        coordOfFigure[1] = sc.nextDouble();
        //sc.close();
        return coordOfFigure;
    }

}
