package com.bridgelabz.model;

import java.util.*;

public class Train {

    private List<String> bogies;
    private Set<String> bogieIds;
    private LinkedList<String> trainConsist;
    private LinkedHashSet<String> trainFormation;
    private Map<String, Integer> bogieCapacity;
    private List<Bogie> passengerBogies;

    public Train() {
        bogies = new ArrayList<>();
        bogieIds = new HashSet<>();
        trainFormation = new LinkedHashSet<>();
        bogieCapacity = new HashMap<>();
        passengerBogies = new ArrayList<>();
    }

    public List<String> getBogies() {
        return bogies;
    }

    public void setBogies(List<String> bogies) {
        this.bogies = bogies;
    }

    public Set<String> getBogieIds() {
        return bogieIds;
    }

    public void setBogieIds(Set<String> bogieIds) {
        this.bogieIds = bogieIds;
    }

    public LinkedList<String> getTrainConsist() {
        return trainConsist;
    }

    public void setTrainConsist(LinkedList<String> trainConsist) {
        this.trainConsist = trainConsist;
    }

    public LinkedHashSet<String> getTrainFormation() {
        return trainFormation;
    }

    public void setTrainFormation(LinkedHashSet<String> trainFormation) {
        this.trainFormation = trainFormation;
    }

    public Map<String, Integer> getBogieCapacity() {
        return bogieCapacity;
    }

    public void setBogieCapacity(Map<String, Integer> bogieCapacity) {
        this.bogieCapacity = bogieCapacity;
    }

    public List<Bogie> getPassengerBogies() {
        return passengerBogies;
    }

    public void setPassengerBogies(List<Bogie> passengerBogies) {
        this.passengerBogies = passengerBogies;
    }


}