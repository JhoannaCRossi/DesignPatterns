package main;

public class User {
    private String name;
    private String lastName;
    private String email;
    private String telephone;
    private String address;

    private User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.email = "";
        this.telephone = "";
        this.address = "";
    }

    public static User make(String name, String lastName){
        return new User(name, lastName);
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    //metodo de instancia
    public User build(){
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + this.name + '\'' +
                ", lastName='" + this.lastName + '\'' +
                ", email='" + this.email + '\'' +
                ", telephone='" + this.telephone + '\'' +
                ", address='" + this.address + '\'' +
                '}';
    }
}
