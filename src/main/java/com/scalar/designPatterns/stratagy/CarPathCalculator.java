package com.scalar.designPatterns.stratagy;

public class CarPathCalculator implements PathCalculator{

    public void findpath(String startX, String startY) {
        System.out.println("Car path: start: " + startX + " End: " + startY);
    }
}
