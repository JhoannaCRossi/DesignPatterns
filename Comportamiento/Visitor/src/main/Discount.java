package main;

public class Discount implements IVisitor{
    @Override
    public float visit(IMarket market) {
        return market.getPrice() * 0.10f;
    }

    @Override
    public float visit(IFruit fruit) {
        return fruit.getPrice() * 0.5f;
    }
}
