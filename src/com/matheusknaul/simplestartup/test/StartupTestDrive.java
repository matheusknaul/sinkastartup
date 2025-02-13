package com.matheusknaul.simplestartup.test;

import java.util.ArrayList;

import com.matheusknaul.simplestartup.domain.Startup;

public class StartupTestDrive{
    public static void main(String[] args){
    	
    	ArrayList<Startup> startups = new ArrayList<Startup>();
    	
    	Startup startup1 = new Startup();
    	startup1.setName("Tesla");
    	
    	Startup startup2 = new Startup();
    	startup2.setName("Open AI");
    	
    	Startup startup3 = new Startup();
    	startup3.setName("Intelbras");
    	
    	startups.add(startup1);
    	startups.add(startup2);
    	startups.add(startup3);
    	
    	int i = 1;
    	
    	for(Startup startup: startups) {
    		System.out.print("Startup " + i +": ");
    		System.out.print(startup.getName());
    		System.out.print(" | ");
    		i++;
    	}
    	
    	
    }
}