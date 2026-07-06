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

    public void addBogieIds(Train train) {

        train.getBogieIds().add("BG101");
        train.getBogieIds().add("BG102");
        train.getBogieIds().add("BG103");

        // Duplicate IDs
        train.getBogieIds().add("BG101");
        train.getBogieIds().add("BG102");

        System.out.println("\nBogie IDs added successfully.");
    }

    public void displayUniqueBogieIds(Train train) {

        System.out.println("\n========= Unique Bogie IDs =========");

        for (String id : train.getBogieIds()) {
            System.out.println(id);
        }
    }

    public void createTrainConsist(Train train) {

        train.getTrainConsist().add("Engine");
        train.getTrainConsist().add("Sleeper");
        train.getTrainConsist().add("AC");
        train.getTrainConsist().add("Cargo");
        train.getTrainConsist().add("Guard");

        System.out.println("\nTrain consist created successfully.");
    }

    public void insertPantryCar(Train train) {

        train.getTrainConsist().add(2, "Pantry Car");

        System.out.println("\nPantry Car inserted successfully.");
    }

    public void removeFirstAndLastBogie(Train train) {

        train.getTrainConsist().removeFirst();
        train.getTrainConsist().removeLast();

        System.out.println("\nFirst and Last bogies removed.");
    }

    public void displayTrainConsist(Train train) {

        System.out.println("\n========= Ordered Train Consist =========");

        for (String bogie : train.getTrainConsist()) {
            System.out.println(bogie);
        }
    }

    public void createTrainFormation(Train train) {

        train.getTrainFormation().add("Engine");
        train.getTrainFormation().add("Sleeper");
        train.getTrainFormation().add("Cargo");
        train.getTrainFormation().add("Guard");


        train.getTrainFormation().add("Sleeper");

        System.out.println("\nTrain formation created successfully.");
    }

    public void displayTrainFormation(Train train) {

        System.out.println("Train Formation");

        for (String bogie : train.getTrainFormation()) {
            System.out.println(bogie);
        }
    }

}
