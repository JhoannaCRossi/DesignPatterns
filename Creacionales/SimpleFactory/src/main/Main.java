package main;
//SimpleFactory crear objetos complejos de una forma sencilla

public class Main {
    public static void main(String[] args) {

        //WithoutSimpleFactory
        Pizza pizzaPepperoni = new Pizza(8);
        System.out.println(pizzaPepperoni);

        //WithSimpleFactory
        Pizzaria pizzaria = new Pizzaria();
        Pizza pizzariaSmallPepperoni = pizzaria.createSmallPizza();
        System.out.println(pizzariaSmallPepperoni);
    }
}
