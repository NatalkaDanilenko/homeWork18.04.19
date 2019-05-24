package phone;

public class SystemOn {
    private Phone ph1 = new Phone();
    private Phone ph2 = new Phone();
    private Network network = new Network();

    public SystemOn() {
    }

    public SystemOn(Phone ph1, Phone ph2, Network network) {
        this.ph1 = ph1;
        this.ph2 = ph2;
        this.network = network;
    }

    public Phone getPh1() {
        return ph1;
    }

    public void setPh1(Phone ph1) {
        this.ph1 = ph1;
    }

    public Phone getPh2() {
        return ph2;
    }

    public void setPh2(Phone ph2) {
        this.ph2 = ph2;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }



}
