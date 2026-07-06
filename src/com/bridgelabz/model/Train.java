package com.bridgelabz.model;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private List<String> bogies;

    public Train(){
        this.bogies=new ArrayList<>();
    }
    public List<String> getBogies(){
        return bogies;
    }

    public void setBogies(List<String> bogies){
        this.bogies=bogies;
    }


}
