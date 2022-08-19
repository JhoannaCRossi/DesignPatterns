package main;

public class Drive implements IState{

    private final Car car;

    public Drive(Car car) {
        this.car = car;
    }

    @Override
    public void turnOn() {
        System.out.println("Its On");
    }

    @Override
    public void drive() {
        System.out.println("Its Moving now");
    }

    @Override
    public void turnOff() {
        System.out.println("Its Off");
        car.setState(car.getTurnOff());
    }
}
