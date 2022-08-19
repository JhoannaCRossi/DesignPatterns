package main;
//cadena de responsabilidades
public interface IManipulator {
    //metodo que apunta al otro objeto si el actual no puede manejar la info
    void setNextManipulator(IManipulator next);

    //concreción
    void executeTransaction(Transaction transaction);
}
