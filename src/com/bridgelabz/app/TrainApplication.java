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

    }
}
