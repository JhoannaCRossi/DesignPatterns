package main;

public class Main {
    public static void main(String[] args) {

        User user = new User("Codi", 31);
        User memento = user.getMemento();

        user.setAge(55);
        user.setName("Carlos");
        System.out.println(user.getName());
        System.out.println(user.getAge());

        user.restartMemento(memento);


        System.out.println(user.getName());
        System.out.println(user.getAge());

    }
}
