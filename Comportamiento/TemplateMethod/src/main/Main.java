package main;

public class Main {
    public static void main(String[] args) {
        User manager = new Manager();
        User admin = new Admin();

        admin.authenticated();
        admin.choiceJobEmployed();

        manager.authenticated();
        manager.choiceJobEmployed();

    }
}
