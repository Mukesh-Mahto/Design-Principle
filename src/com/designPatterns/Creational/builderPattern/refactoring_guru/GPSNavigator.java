package com.designPatterns.Creational.builderPattern.refactoring_guru;

/**
 * Just another feature of Car
 */
public class GPSNavigator {
    private String route;

    public GPSNavigator(){
        this.route = " 345, Bangalore, India (Dummy route) ";
    }

    public GPSNavigator(String manualRoute){
        this.route = manualRoute;
    }

    public String getRoute(){
        return route;
    }
}
