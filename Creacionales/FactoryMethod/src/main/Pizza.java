package main;

public class Pizza {

    private int numberSlices;
    private String specialty;

    public Pizza(int numberSlices, String specialty) {
        this.numberSlices = numberSlices;
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "numberSlices=" + numberSlices +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
