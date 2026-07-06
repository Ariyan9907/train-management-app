package com.bridgelabz.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Train {

    private List<String> bogies;
    private Set<String> bogieIds;

    public Train() {
        bogies = new ArrayList<>();
        bogieIds = new HashSet<>();
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
}