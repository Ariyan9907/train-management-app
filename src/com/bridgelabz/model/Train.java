package com.bridgelabz.model;

import java.util.*;

public class Train {

    private List<String> bogies;
    private Set<String> bogieIds;
    private LinkedList<String> trainConsist;
    private LinkedHashSet<String> trainFormation;

    public Train() {
        bogies = new ArrayList<>();
        bogieIds = new HashSet<>();
        trainFormation = new LinkedHashSet<>();
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


}