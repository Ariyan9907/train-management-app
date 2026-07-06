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

}
