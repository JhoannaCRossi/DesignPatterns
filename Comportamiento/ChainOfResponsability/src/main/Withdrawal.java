package main;

public class Withdrawal implements IManipulator{

    private IManipulator next;

    @Override
    public void setNextManipulator(IManipulator next) {
        this.next = next;
    }

    @Override
    public void executeTransaction(Transaction transaction) {
        if(transaction.getTransactionType() == TransactionType.Withdrawal){
            float cant = transaction.getCant() - transaction.getBalance();
            System.out.println("the new balance is cant");
        }else{
            this.executeTransaction(transaction);
        }
    }
}
