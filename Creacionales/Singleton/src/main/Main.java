package main;

public class Main {
    public static void main(String[] args) {
        ConnectionDB connection = ConnectionDB.addConnection();
        ConnectionDB connection2 = ConnectionDB.addConnection();

        //same object
        System.out.println(connection.hashCode());
        System.out.println(connection2.hashCode());

        //same object?
        connection.host = "localhost";
        System.out.println(connection.host);
        System.out.println(connection2.host);
        //yes!
        /*1580066828
         *1580066828
         *localhost
         *localhost
        * */
    }
}
