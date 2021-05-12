package com.designPatterns.Creational.builderPattern.refactoring_guru;

/**
 * Just another feature of a car
 */
public class TripComputer {
    private Car car;

    public void setCar(Car car){
        this.car = car;
    }

    public void showFuelLevel(){
        System.out.println("Fuel Level : "+car.getFuel());
    }

    public void showStatus(){
        if(this.car.getEngine().isStarted()){
            System.out.println("Car is Started");
        }else{
            System.out.println("Car isn't started");
        }
    }
}
