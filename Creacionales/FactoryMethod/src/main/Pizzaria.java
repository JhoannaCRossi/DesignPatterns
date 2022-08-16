package main;

//FactoryMethod es la subclase quien decide que se instancia mediante interfaz
public class Pizzaria implements IPizzaria{

    public Pizza createPizza(String pizzaType){
        if(pizzaType.equals("Peperonni")){
            return new Pizza(8, "Peperonni");
        }
        if(pizzaType.equals("Hawaiian")){
            return new Pizza(8, "Hawaiana");
        }
        if(pizzaType.equals("Stuffed Pizza")){
            return new StuffedPizza(12, "Stuffed");
        }

        return null;
    }
}
