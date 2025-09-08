package com.scalar.designPatterns.stratagy;

public class GoogleMapsPath {

    PathCalculator calculator;

    public GoogleMapsPath(PathCalculator calculator) {

        this.calculator = calculator;
    }

    public void setCalculator(PathCalculator calculator) {

        this.calculator = calculator;
    }

    public void calculatePath() {

        calculator.findpath("Hyderabad","Bangalore");
    }



}
