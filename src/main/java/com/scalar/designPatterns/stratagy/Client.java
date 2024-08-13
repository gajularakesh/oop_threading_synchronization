package com.scalar.designPatterns.stratagy;

public class Client {

    public static void main(String[] args) {

        BikePathCalculator bikePathCalculator = new BikePathCalculator();
        GoogleMapsPath googleMapsPath = new GoogleMapsPath(bikePathCalculator);
        googleMapsPath.calculatePath();

        googleMapsPath.setCalculator(new CarPathCalculator());
        googleMapsPath.calculatePath();
    }
}
