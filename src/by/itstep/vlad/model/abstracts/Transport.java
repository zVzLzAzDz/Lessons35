package by.itstep.vlad.model.abstracts;

//abstract-entity
public class Transport {
    private int tank;

    public Transport() {
    }


    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public Transport(int tank) {
        this.tank = tank;

    }
}
