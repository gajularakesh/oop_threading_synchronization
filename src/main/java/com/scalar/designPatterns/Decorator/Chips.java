package com.scalar.designPatterns.Decorator;

public class Chips implements IceCream{
    int cost = 15;
    String description = " Chips";

    IceCream iceCream;

    Chips(){}

    public Chips(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public int getCost(){
        if(iceCream == null ){
            return cost;
        }
        return iceCream.getCost()+cost;
    }

    public String getDescription(){
        if(iceCream == null ){
            return description;
        }
        return iceCream.getDescription()+description;
    }
}
