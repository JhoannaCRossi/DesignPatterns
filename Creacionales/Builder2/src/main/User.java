package main;

public class User {

    private String name;
    private String lastName;

    private boolean contact;//optional

    private String email;
    private String telephone;
    private String address;

    private User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.contact = false;
        this.email = "";
        this.telephone = "";
        this.address = "";
    }

    public static User make(String name, String lastName){
        return new User(name, lastName);
    }

    public BuilderUser setContact(boolean contact) {
        if(!contact){
            throw  new IllegalArgumentException("No es posible asignar un valor falso a contacto");
        }
        this.contact = contact;
        return new BuilderUser(this);
    }

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

    public static class BuilderUser{
        private User user;

        public BuilderUser(User user){
            this.user = user;
        }

        public BuilderUser setEmail(String email) {
            user.email = email;
            return this;
        }

        public BuilderUser setTelephone(String telephone) {
            user.telephone = telephone;
            return this;
        }

        public BuilderUser setAddress(String address) {
            user.address = address;
            return this;
        }

        public User build(){
            return user;
        }
    }
}
