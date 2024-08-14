package com.scalar.designPatterns.Decorator;

public class VenilaScoop implements IceCream{
    int cost = 40;
    String description = " VenilaScoop";

    IceCream iceCream;

    VenilaScoop(){}

    public VenilaScoop(IceCream iceCream) {
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
