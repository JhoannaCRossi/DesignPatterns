package main;

public class Computer {

    private IKeyboard keyboard;
    private IMouse mouse;

    public Computer(IKeyboard keyboard, IMouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void on(){
        this.keyboard.connecting();
        this.mouse.connecting();
    }
}
