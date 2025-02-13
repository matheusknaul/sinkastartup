package com.matheusknaul.simplestartup.domain;

import java.util.ArrayList;

public class Startup {
	
	private String name;
	
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String checkYourself(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        
        if(index >= 0) {
        	locationCells.remove(index);
        	if(locationCells.isEmpty()) {
        		result = "kill";
        		System.out.println("Ouch! You sunk " + this.name + " : (");
        	}else {
        		result = "hit";
        	}
        }
        return result;
    }
}
