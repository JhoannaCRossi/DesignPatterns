package main;
//cliente
public class Main {
    public static void main(String[] args) {
        Transaction transaction = new Transaction(100,200, TransactionType.Warehouse);

        IManipulator warehouse = new Warehouse();
        IManipulator withdrawal = new Withdrawal();
        IManipulator repayment = new Repayment();

        warehouse.setNextManipulator(withdrawal);
        withdrawal.setNextManipulator(repayment);

        warehouse.executeTransaction(transaction);
    }
}
