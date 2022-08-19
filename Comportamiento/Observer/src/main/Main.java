package main;

public class Main {
    public static void main(String[] args) {

        Product avocado = new Product(10);

        User user = new User();
        User user2 = new User();

        avocado.addObserver(user);
        avocado.addObserver(user2);
        avocado.sale();
    }
}
