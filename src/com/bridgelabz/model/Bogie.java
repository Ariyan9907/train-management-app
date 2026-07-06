package com.bridgelabz.model;

public class Bogie {

    private String name;
    private int capacity;
    private String type;

    // Initializes a bogie with name and seating capacity.
    public Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
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

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " --> " + capacity + " Seats";
    }
}