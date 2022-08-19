package main;

public class Repayment implements IManipulator{
    private IManipulator next;

    @Override
    public void setNextManipulator(IManipulator next) {
        this.next = next;
    }

    @Override
    public void executeTransaction(Transaction transaction) {
        if(transaction.getTransactionType() == TransactionType.Repayment){
            float cant = transaction.getCant() + transaction.getBalance();
            System.out.println("the new balance is cant");
        }else{
            System.out.println("operation is not valid");
        }
    }
}
