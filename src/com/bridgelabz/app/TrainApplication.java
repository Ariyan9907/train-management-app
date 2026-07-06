package com.bridgelabz.app;

import com.bridgelabz.model.Train;
import com.bridgelabz.service.TrainService;

public class TrainApplication {
    public static void main(String[] args) {
        TrainService trainService = new TrainService();

        Train train = trainService.initializeTrain();

        trainService.displayTrainSummary(train);

        trainService.addPassengerBogies(train);

        trainService.displayBogies(train);

        trainService.removePassengerBogie(train, "AC Chair");

        trainService.checkPassengerBogie(train, "Sleeper");

        trainService.displayBogies(train);

        trainService.addBogieIds(train);

        trainService.displayUniqueBogieIds(train);

        trainService.createTrainConsist(train);

        trainService.insertPantryCar(train);

        trainService.removeFirstAndLastBogie(train);

        trainService.displayTrainConsist(train);

        trainService.createTrainFormation(train);

        trainService.displayTrainFormation(train);

        trainService.addBogieCapacity(train);

        trainService.displayBogieCapacity(train);

        trainService.groupBogiesByType(train);

        trainService.calculateTotalSeatingCapacity(train);

        trainService.validateTrainDetails("TRN-1234", "PET-AB");

        trainService.checkSafetyCompliance(train);

        trainService.comparePerformance(train);

        trainService.assignCargo("Petroleum Tank", "Petroleum");

        trainService.bubbleSortPassengerCapacities();

        trainService.sortBogieNames();

        trainService.linearSearchBogieId();

    }



}
