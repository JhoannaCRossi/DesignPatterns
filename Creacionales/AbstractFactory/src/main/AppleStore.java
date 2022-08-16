package main;

//Factory su labor es retornar el objeto que crea conveniente
public class AppleStore implements IAbstractFactory{

    @Override
    public IComputer createComputer() {
        return new MackBockPro();
    }

    @Override
    public ITablet createTablet() {
        return new IPad();
    }
}
