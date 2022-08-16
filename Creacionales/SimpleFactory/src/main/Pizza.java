package main;

public class Pizza {
    private int numberSlices;

    public Pizza(int numberSlices){
        this.numberSlices = numberSlices;
    }

    @Override
    public String toString(){
        return "Number of Slices: " + this.numberSlices;
    }
}
