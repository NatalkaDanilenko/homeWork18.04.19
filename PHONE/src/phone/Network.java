package phone;

public class Network {
    private Circle stationOne = new Circle();
    private Circle stationTwo = new Circle();
    /*private Circle stationThree = new Circle();
    private Circle stationFour = new Circle();
    private Circle stationFive = new Circle();*/

    public Network() {
    }

    public Network(Circle stationOne, Circle stationTwo
            /*, Circle stationThree, Circle stationFour, Circle stationFive*/) {
        this.stationOne = stationOne;
        this.stationTwo = stationTwo;
        /*this.stationThree = stationThree;
        this.stationFour = stationFour;
        this.stationFive = stationFive;*/
    }

    public Circle getStationOne() {
        return stationOne;
    }

    public void setStationOne(Circle stationOne) {
        this.stationOne = stationOne;
    }

    public Circle getStationTwo() {
        return stationTwo;
    }

    public void setStationTwo(Circle stationTwo) {
        this.stationTwo = stationTwo;
    }

/*    public Circle getStationThree() {
        return stationThree;
    }

    public void setStationThree(Circle stationThree) {
        this.stationThree = stationThree;
    }

    public Circle getStationFour() {
        return stationFour;
    }

    public void setStationFour(Circle stationFour) {
        this.stationFour = stationFour;
    }

    public Circle getStationFive() {
        return stationFive;
    }

    public void setStationFive(Circle stationFive) {
        this.stationFive = stationFive;
    }*/
}
