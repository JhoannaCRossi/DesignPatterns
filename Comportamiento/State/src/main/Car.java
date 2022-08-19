package main;

public class Car implements IState{

    private IState turnOn;
    private IState driving;
    private IState turnOff;
    private IState state;


    public Car() {
        this.turnOn = new TurnOn(this);
        this.driving = new Drive(this);
        this.turnOff = new TurnOff(this);
        this.state = this.turnOn;
    }

    @Override
    public void turnOn() {
        this.state.turnOn();
    }

    @Override
    public void drive() {
        this.state.drive();
    }

    @Override
    public void turnOff() {
        this.state.turnOff();
    }

    public IState getTurnOn() {
        return turnOn;
    }

    public void setTurnOn(IState turnOn) {
        this.turnOn = turnOn;
    }

    public IState getDriving() {
        return driving;
    }

    public void setDriving(IState driving) {
        this.driving = driving;
    }

    public IState getTurnOff() {
        return turnOff;
    }

    public void setTurnOff(IState turnOff) {
        this.turnOff = turnOff;
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }
}
