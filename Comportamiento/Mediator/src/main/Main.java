package main;

public class Main {
    public static void main(String[] args) {

        User edu = new User("Edu");
        User codi = new User("Codi");

        Chat chat = new Chat();

        chat.addParticipants(edu);
        chat.addParticipants(codi);

        chat.sendMessage(edu, codi, "hi dude");
    }
}
