package main;

public interface IVisitor {

    float visit(IMarket market);

    float visit(IFruit fruit);
}
