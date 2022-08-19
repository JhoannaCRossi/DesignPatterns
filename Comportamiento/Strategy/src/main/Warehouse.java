package main;

public class Warehouse implements IEstrategy{
    @Override
    public float playOperation(float balance, float cant) {
        return balance + cant;
    }
}
