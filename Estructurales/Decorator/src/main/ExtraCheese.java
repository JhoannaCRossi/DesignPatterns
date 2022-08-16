package main;

public class ExtraCheese implements IPizza{

    //composición (envolvemos el objeto y le damos mas funcionalidad)
    private IPizza pizza;

    public ExtraCheese(IPizza pizza){
        this.pizza = pizza;
    }
    public String description(){
        return this.pizza.description() + " + Extra Cheese";
    }

    public float price(){
        return this.pizza.price() + 2;
    }
}
