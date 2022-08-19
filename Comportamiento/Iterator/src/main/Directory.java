package main;

import java.util.ArrayList;

public class Directory {

    private ArrayList<String> phones;

    public Directory() {
        this.phones = new ArrayList<String>();
    }

    public void add(String phone){
        this.phones.add(phone);
    }

    public ArrayList<String> getPhones() {
        return this.phones;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }
}
