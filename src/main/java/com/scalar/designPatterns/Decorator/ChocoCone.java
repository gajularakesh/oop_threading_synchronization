package com.scalar.designPatterns.Decorator;

public class ChocoCone implements IceCream{

    int cost = 30;
    String description = " ChocolateCone";

    IceCream iceCream;

    ChocoCone(){}

    public ChocoCone(IceCream iceCream) {
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
