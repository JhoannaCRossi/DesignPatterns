package main;

public class Main {
    public static void main(String[] args) {

        IPizza pizzaPeperonni = new ExtraCheese(new PizzaPeperonni());

        System.out.println(pizzaPeperonni.description());
        System.out.println(pizzaPeperonni.price());

        IPizza pizzaHawaian = new Stuffed(new PizzaHawaian());

        System.out.println(pizzaHawaian.description());
        System.out.println(pizzaHawaian.price());

        IPizza pizzaPeperonni2 = new Stuffed(new ExtraCheese(new PizzaPeperonni()));

        System.out.println(pizzaPeperonni2.description());
        System.out.println(pizzaPeperonni2.price());

    }
}
