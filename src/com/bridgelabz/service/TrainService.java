package com.bridgelabz.service;


import com.bridgelabz.model.Bogie;
import com.bridgelabz.model.Train;
import com.bridgelabz.util.RegexValidator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    // Adds passenger bogies along with their seating capacity.

    public void addBogieCapacity(Train train) {

        train.getBogieCapacity().put("Sleeper", 72);
        train.getBogieCapacity().put("AC Chair", 56);
        train.getBogieCapacity().put("First Class", 24);

        System.out.println("\nBogie capacities added successfully.");
    }


     // Displays each bogie with its seating capacity.

    public void displayBogieCapacity(Train train) {

        System.out.println("\n========= Bogie Capacity =========");

        for (Map.Entry<String, Integer> entry : train.getBogieCapacity().entrySet()) {

            System.out.println(
                    entry.getKey() + " --> " + entry.getValue() + " Seats"
            );

        }
    }

    // Adds bogie objects with their properties.
    public void addPassengerBogieObjects(Train train) {

        train.getPassengerBogies().add(
                new Bogie("Sleeper",72,"Passenger","Rectangular","Passengers"));

        train.getPassengerBogies().add(
                new Bogie("AC Chair",56,"Passenger","Rectangular","Passengers"));

        train.getPassengerBogies().add(
                new Bogie("First Class",24,"Passenger","Rectangular","Passengers"));

        train.getPassengerBogies().add(
                new Bogie("Coal Wagon",120,"Goods","Rectangular","Coal"));

        train.getPassengerBogies().add(
                new Bogie("Petroleum Tank",150,"Goods","Cylindrical","Petroleum"));

    }

    // Sorts passenger bogies by seating capacity.
    public void sortPassengerBogiesByCapacity(Train train) {

        train.getPassengerBogies()
                .sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\nPassenger bogies sorted successfully.");
    }

    // Displays all passenger bogies in sorted order.
    public void displaySortedPassengerBogies(Train train) {

        System.out.println("\n========= Sorted Passenger Bogies =========");

        for (Bogie bogie : train.getPassengerBogies()) {
            System.out.println(bogie);
        }
    }

    // Filters passenger bogies having capacity greater than 60.
    public void filterPassengerBogies(Train train) {

        List<Bogie> filteredBogies = train.getPassengerBogies()
                .stream()
                .filter(bogie -> bogie.getCapacity() > 60)
                .toList();

        System.out.println("\n========= High Capacity Passenger Bogies =========");

        filteredBogies.forEach(System.out::println);
    }

    // Groups bogies by their type.
    public void groupBogiesByType(Train train) {

        Map<String,List<Bogie>> groupedBogies =
                train.getPassengerBogies()
                        .stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("\n========= Grouped Bogies =========");

        groupedBogies.forEach((type,bogies)->{

            System.out.println("\n"+type);

            bogies.forEach(System.out::println);

        });

    }

    // Calculates the total seating capacity of all bogies.
    public void calculateTotalSeatingCapacity(Train train) {

        int totalSeats = train.getPassengerBogies()
                .stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        System.out.println("\n========= Total Seating Capacity =========");
        System.out.println("Total Seats : " + totalSeats);
    }

    // Validates train ID and cargo code.
    public void validateTrainDetails(String trainId, String cargoCode) {

        RegexValidator validator = new RegexValidator();

        if (validator.validateTrainId(trainId)) {
            System.out.println("\nTrain ID is Valid.");
        } else {
            System.out.println("\nInvalid Train ID.");
        }

        if (validator.validateCargoCode(cargoCode)) {
            System.out.println("Cargo Code is Valid.");
        } else {
            System.out.println("Invalid Cargo Code.");
        }
    }

    // Checks whether all goods bogies satisfy safety rules.
    public void checkSafetyCompliance(Train train) {

        boolean isSafe = train.getPassengerBogies()
                .stream()
                .filter(bogie -> bogie.getType().equals("Goods"))
                .allMatch(bogie ->
                        !bogie.getShape().equals("Cylindrical")
                                || bogie.getCargo().equals("Petroleum"));

        System.out.println("\n========= Safety Compliance =========");

        if (isSafe) {
            System.out.println("Train is Safety Compliant.");
        } else {
            System.out.println("Train is NOT Safety Compliant.");
        }

    }



}
