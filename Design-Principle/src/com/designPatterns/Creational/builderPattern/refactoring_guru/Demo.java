package com.designPatterns.Creational.builderPattern.refactoring_guru;

/**
 * Everything comes together here
 */
public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products
        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder carManualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportCar(carManualBuilder);
        Manual carManual = carManualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

        director.constructSUV(carManualBuilder);
        carManual = carManualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

    }
}
