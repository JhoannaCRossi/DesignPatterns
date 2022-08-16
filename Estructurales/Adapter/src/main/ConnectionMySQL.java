package main;

public class ConnectionMySQL implements IConnectionSQL{

    public void connection(){
        System.out.println("Connecting with MYSQL");
    }

    public String runQuery(){
        return "Consulting MYSQL";
    }
}
