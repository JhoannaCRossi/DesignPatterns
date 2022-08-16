package main;

public class Main {
    public static void main(String[] args) {

        //sin patron de diseño build
        //User user1 = new User(name, lastName, email, telephone, address);

        //con patron de diseño build
        User user2 = User.make("Jhoa", "Rossi")
                .setAddress("Argentina 2446")
                .setEmail("soporte@soporte.com")
                .setTelephone("xxxx-xx-xx")
                .build();

        System.out.println(user2.toString());
    }
}
