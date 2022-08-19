package main;

public class TurnOff implements IState{

    private final Car car;

    public TurnOff(Car car) {
        this.car = car;
    }

    @Override
    public void turnOn() {
        System.out.println("Its On");
        car.setState(car.getTurnOn());
    }

    @Override
    public void drive() {
        System.out.println("No Moving, its off");
    }

    @Override
    public void turnOff() {
        System.out.println("Its Off");
    }
}
