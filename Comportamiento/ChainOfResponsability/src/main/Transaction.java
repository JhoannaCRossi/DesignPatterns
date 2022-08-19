package main;

public class Transaction {

    private float cant;
    private float balance;
    private TransactionType transactionType;

    public Transaction(float cant, float balance, TransactionType transactionType) {
        this.cant = cant;
        this.balance = balance;
        this.transactionType = transactionType;
    }

    public float getCant() {
        return cant;
    }

    public void setCant(float cant) {
        this.cant = cant;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
}
