package org.example.people;

public class Passenger extends Person{


    public int bags;

    public Passenger(String name, int bags) {
        super(name);
        this.bags = bags;
    }

    public int getBags() {
        return bags;
    }

    public void setBags(int bags) {
        this.bags = bags;
    }
}
