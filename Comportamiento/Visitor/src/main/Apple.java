package main;

public class Apple implements IFruit, IVisitable{

    @Override
    public float getPrice() {
        return 1f;
    }

    @Override
    public float apllyDiscount(IVisitor visitor) {
        return visitor.visit(this);
    }
}
