package main;

public class TurnOn implements IState{

    private final Car car;

    public TurnOn(Car car) {
        this.car = car;
    }

    @Override
    public void turnOn() {
        System.out.println("Its On");
    }

    @Override
    public void drive() {
        System.out.println("Its Moving");
        car.setState(car.getDriving());
    }

    @Override
    public void turnOff() {
        System.out.println("Its Off");
        car.setState(car.getTurnOff());
    }
}
