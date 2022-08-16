package main;

public class Stuffed implements IPizza{

    //composición (envolvemos el objeto y le damos mas funcionalidad)
    private IPizza pizza;

    public Stuffed(IPizza pizza){
        this.pizza = pizza;
    }
    public String description(){
        return this.pizza.description() + " + Stuffed";
    }

    public float price(){
        return this.pizza.price() + 2;
    }
}
