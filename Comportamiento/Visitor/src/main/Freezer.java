package main;

public class Freezer implements IMarket, IVisitable{
    @Override
    public float getPrice() {
        return 2f;
    }

    @Override
    public float apllyDiscount(IVisitor visitor) {
        return visitor.visit(this);
    }
}
