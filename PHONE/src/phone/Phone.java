package phone;

public class Phone extends Point{
    private long number;
    private double x;
    private double y;
    private boolean networkIn = false;

    public Phone(double x, double y, long number, boolean networkIn) {
        super(x, y);
        this.number = number;
        this.networkIn = networkIn;
    }

    public Phone() {
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean isNetworkIn() {
        return networkIn;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setNetworkIn(boolean networkIn) {
        this.networkIn = networkIn;
    }

    //мобильник ловит сигнал базовой станции, если он в сети
    //пр ли точка кругу
    public boolean checkIn(double x, double y, double rad, Phone phone){
        double ll = Math.sqrt(Math.pow((x - phone.getX()), 2) + Math.pow((y - phone.getY()), 2));
        if (ll <= rad){
            return true;
        }
        return false;
    }

    /*public int callInto(){
        //return isNetworkIn() == true ? 1 : 0;
    }*/
}
