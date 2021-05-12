package com.designPatterns.Creational.builderPattern.refactoring_guru;

/**
 * Unlike other creational patterns, Builder can construct unrelated products,
 * which don't have the common interface
 *
 * In this case we build a user manual for a car, using the same steps as we build
 * a car. This allows to produce manuals for specific car models, configured with
 * different features
 */
public class CarManualBuilder implements Builder{
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public Manual getResult(){
        return new Manual(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }
}
