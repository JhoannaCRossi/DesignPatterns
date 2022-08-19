package main;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Freezer freezer = new Freezer();

        IVisitor discount = new Discount();

        System.out.println(apple.apllyDiscount(discount));
        System.out.println(freezer.apllyDiscount(discount));
    }
}
