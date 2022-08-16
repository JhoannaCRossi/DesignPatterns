package main;

public class ConnectionMongoDB implements IConnectionNoSQL{

    public void connection(){
        System.out.println("Connecting with MongoDB");
    }

    public String executeSentence(){
        return "Consulting MongoDB";
    }
}
