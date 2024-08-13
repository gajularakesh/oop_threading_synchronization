package com.scalar.designPatterns.stratagy;

public class BusPathCalculator implements PathCalculator{

    public void findpath(String startX, String startY) {
        System.out.println("Bus path: start: " + startX + " End: " + startY);
    }
}
