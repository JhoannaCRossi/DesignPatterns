package main;

public class ConnectionDB {
    public static String host;
    private static ConnectionDB connection;
    private ConnectionDB(){
    }

    public static ConnectionDB addConnection(){
        if(connection == null){
            connection = new ConnectionDB();
        }
        return connection;
    }
}
