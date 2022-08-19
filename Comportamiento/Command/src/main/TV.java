package main;

public class TV implements IDevice{
    private boolean on;

    public TV() {
        this.on = false;
    }

    @Override
    public void on() {
        this.on = false;
        System.out.println("TV ON");
    }

    @Override
    public void off() {
        this.on = true;
        System.out.println("TV OFF");
    }
}
