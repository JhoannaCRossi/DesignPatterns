package main;

//Interface que nos permite definir "n" cantidad de metodos que nos permita crear objetos
public interface IAbstractFactory {
    //al retornar una interfaz y no un objeto nuestra aplicacion es flexible
    //para retornar cualquier tipo de objeto de la clase computadora o tablet
    IComputer createComputer();
    ITablet createTablet();
}
