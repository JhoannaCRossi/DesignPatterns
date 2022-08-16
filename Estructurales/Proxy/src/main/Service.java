package main;

public class Service implements IService{


    @Override
    public void read() {
        System.out.println("Leer");
    }

    @Override
    public void write() {
        System.out.println("Escribir");
    }

    @Override
    public void update() {
        System.out.println("Actualizar");
    }

    @Override
    public void delete() {
        System.out.println("Eliminar");
    }
}
