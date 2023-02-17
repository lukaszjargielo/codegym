package pl.codegym.task.task15.task1529;

public class Plane implements CanFly{
    private int passengersNum;

    public Plane(int passengersNum) {
        this.passengersNum = passengersNum;
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying.");
    }
}
