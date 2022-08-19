package main;

public interface IObservable {

    void addObserver(IObserver observer);

    void notifyObserver();

    void removeObserver();
}
