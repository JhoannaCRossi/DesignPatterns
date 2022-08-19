package main;

public class Main {
    public static void main(String[] args) {
        //warehouse
        //withdrawal
        Transaction one = new Transaction(new Warehouse());
        System.out.println(one.executeTransaction(100,20));

        Transaction two = new Transaction(new Withdrawal());
        System.out.println(two.executeTransaction(100,20));
    }
}
