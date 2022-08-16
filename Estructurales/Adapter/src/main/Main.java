package main;

public class Main {
    //para este caso el main es mi cliente
    public static void main(String[] args) {
        IConnectionSQL connection = new AdapterDB(new ConnectionMongoDB());
        connection.connection();
        String result = connection.runQuery();
        System.out.println(result);
    }
}
