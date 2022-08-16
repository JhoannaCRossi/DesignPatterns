package main;

//SimpleFactory
public class Pizzaria {

    public Pizza createSmallPizza(){
        return new Pizza(4);
    }

    public Pizza createMediumPizza(){
        return new Pizza(6);
    }

    public Pizza createLargePizza(){
        return new Pizza(8);
    }
}
