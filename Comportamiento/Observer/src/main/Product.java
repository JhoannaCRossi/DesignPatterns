package main;

import java.util.LinkedHashSet;
import java.util.Set;

public class Product implements IObservable{
    private int stock;
    private Set<IObserver> observers;

    public Product(int stock) {
        this.stock = stock;
        this.observers = new LinkedHashSet<IObserver>();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void sale(){
        this.setStock(this.stock - 1);
        System.out.println("sold product!");
        this.notifyObserver();
    }

    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer: this.observers) {
            observer.notification("Notification sold");
        }
    }

    @Override
    public void removeObserver() {

    }
}
