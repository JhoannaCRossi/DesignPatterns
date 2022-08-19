package main;

public class Transaction {

    private IEstrategy estrategy;

    public Transaction(IEstrategy estrategy) {
        this.estrategy = estrategy;
    }

    public float executeTransaction(float balance, float cant){
        return this.estrategy.playOperation(balance, cant);
    }
}
