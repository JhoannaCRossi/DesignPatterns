package main;

public class Withdrawal implements IEstrategy{
    @Override
    public float playOperation(float balance, float cant) {
        return balance - cant;
    }
}
