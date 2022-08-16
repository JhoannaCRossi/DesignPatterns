package main;

public class ConnectionDB {
    public static String host;
    private static ConnectionDB connection;
    private ConnectionDB(){
    }

    //garantizo solo un objeto a pesar de la concurrencia.
    public synchronized static ConnectionDB addConnection(){
        if(connection == null){
            connection = new ConnectionDB();
        }
        return connection;
    }
}
