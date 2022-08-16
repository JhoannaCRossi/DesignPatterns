package main;

public class Main {
    public static void main(String[] args) {
        User user = new User(4);
        IService service = new ProxyService(new Service(), user);

        service.read();
        service.write();
        service.update();
        service.delete();

    }
}
