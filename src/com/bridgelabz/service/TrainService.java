package com.bridgelabz.service;


import com.bridgelabz.model.Train;

public class TrainService {

    public Train initializeTrain() {

        System.out.println("======================================");
        System.out.println(" Train Consist Management App");
        System.out.println("======================================");
        System.out.println();

        Train train = new Train();

        System.out.println("Train initialized successfully.");
        System.out.println();

        return train;
    }

    public void displayTrainSummary(Train train) {

        System.out.println("========= Train Summary =========");
        System.out.println("Current Bogie Count : " + train.getBogies().size());
    }

    public void addPassengerBogies(Train train) {

        train.getBogies().add("Sleeper");
        train.getBogies().add("AC Chair");
        train.getBogies().add("First Class");

        System.out.println("Passenger bogies added successfully.");
    }

    public void displayBogies(Train train) {

        System.out.println("Current Passenger Bogies:");

        for (String bogie : train.getBogies()) {
            System.out.println(bogie);
        }
    }

    public void removePassengerBogie(Train train, String bogieName) {

        if (train.getBogies().remove(bogieName)) {
            System.out.println("Removed Bogie : " + bogieName);
        } else {
            System.out.println("Bogie not found : " + bogieName);
        }
    }

    public void checkPassengerBogie(Train train, String bogieName) {

        if (train.getBogies().contains(bogieName)) {
            System.out.println("\n" + bogieName + " is available.");
        } else {
            System.out.println("\n" + bogieName + " is not available.");
        }
    }

}
