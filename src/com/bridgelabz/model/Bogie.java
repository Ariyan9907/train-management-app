package com.bridgelabz.model;

public class Bogie {

    private String name;
    private int capacity;

    // Initializes a bogie with name and seating capacity.
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Returns the bogie name.
    public String getName() {
        return name;
    }

    // Returns the seating capacity.
    public int getCapacity() {
        return capacity;
    }

    // Returns the bogie details as a string.
    @Override
    public String toString() {
        return name + " --> " + capacity + " Seats";
    }
}