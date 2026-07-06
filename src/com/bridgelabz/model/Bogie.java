package com.bridgelabz.model;

public class Bogie {

    private String name;
    private int capacity;
    private String type;
    private String shape;
    private String cargo;

    // Initializes a bogie with its details.
    public Bogie(String name, int capacity, String type, String shape, String cargo) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
        this.shape = shape;
        this.cargo = cargo;
    }

    // Returns the bogie name.
    public String getName() {
        return name;
    }

    // Returns the seating capacity.
    public int getCapacity() {
        return capacity;
    }


    public String getType() {
        return type;
    }

    public String getShape() {
        return shape;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return name + " --> " + capacity + " Seats";
    }
}