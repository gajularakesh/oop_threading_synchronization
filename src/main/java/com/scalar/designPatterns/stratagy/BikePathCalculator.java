package com.scalar.designPatterns.stratagy;

public class BikePathCalculator implements PathCalculator {


    public void findpath(String startX, String startY) {
        System.out.println("Bike path: start: " + startX + " End: " + startY);
    }
}
