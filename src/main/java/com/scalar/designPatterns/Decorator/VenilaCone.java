package com.scalar.designPatterns.Decorator;

public class VenilaCone implements IceCream {

    int cost = 25;
    String description = " VenilaCone ";

    IceCream iceCream;

    VenilaCone(){}

    public VenilaCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public int getCost(){
        if(iceCream == null){
            return cost;
        }
        return iceCream.getCost()+cost;
    }

    public String getDescription(){
        if(iceCream == null){
            return description;
        }
        return iceCream.getDescription()+description;
    }
}
