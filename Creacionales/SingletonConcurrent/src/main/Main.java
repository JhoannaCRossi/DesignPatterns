package main;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConnectionDB connection = ConnectionDB.addConnection();
                System.out.println(connection.hashCode());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConnectionDB connection = ConnectionDB.addConnection();
                System.out.println(connection.hashCode());
            }
        });

        t1.start();
        t2.start();
    }
}
