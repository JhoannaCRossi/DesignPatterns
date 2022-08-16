package main;

//Segundo Factory
public class SamsungStore implements IAbstractFactory{

    @Override
    public IComputer createComputer() {
        return new QX410();
    }

    @Override
    public ITablet createTablet() {
        return new TabS3();
    }
}
