package main;

import java.util.HashMap;

public class Chat {

    private HashMap<String,User> users;

    public Chat() {
        this.users = new HashMap<String, User>();
    }

    public void addParticipants(User user){
        this.users.put(user.getName(), user);
    }

    public void sendMessage(User userFrom, User userTo, String message){
        if(this.users.get(userFrom.getName()) != null && this.users.get(userTo.getName()) != null){
            message = "From "+ userFrom.getName() + " message "+ message;
            userTo.getMessage(message);
        }
    }
}
