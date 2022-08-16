package main;

//Define una interfaz para la creacion de un objeto, pero deja que la subclase, es decir la
//clase que implementa la interfaz, defina que clase instanciar.
public class Main {
    public static void main(String[] args) {

        Pizzaria pizzaria = new Pizzaria();
        Pizza peperonni = pizzaria.createPizza("Hawaiian");
        System.out.println(peperonni);
        Pizza stuffedpizza = pizzaria.createPizza("Stuffed Pizza");
        System.out.println(stuffedpizza);
    }
}
