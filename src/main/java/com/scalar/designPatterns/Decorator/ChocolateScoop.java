package com.scalar.designPatterns.Decorator;

public class ChocolateScoop implements IceCream {
    int cost = 40;
    String description = " ChocolateScoop";

    IceCream iceCream;

    public ChocolateScoop() {}

    public ChocolateScoop(IceCream iceCream) {
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
