package main;

public class Fachada {

    private Computer computer;

    public Fachada() {
        IKeyboard keyboard = new Keyboard();
        IMouse mouse = new Mouse();
        this.computer = new Computer(keyboard, mouse);
    }

    public void on(){
        this.computer.on();
    }
}
