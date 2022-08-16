package main;

public class Main {
    public static void main(String[] args) {
        User user2 = User.make("Jhoa", "Rossi")
                .setContact(true)//si es falso no te permite agregar los demas datos
                .setAddress("Argentina 2446")
                .setEmail("soporte@soporte.com")
                .setTelephone("xxxx-xx-xx")
                .build();

        System.out.println(user2.toString());
    }
}
