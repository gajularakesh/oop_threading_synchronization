package com.scalar.designPatterns.Decorator;

public class CreamStone {

    public static void main(String[] args) {

        IceCream iceCream = new ChocoCone(
                new VenilaScoop(
                        new Chips()
                )
        );

        System.out.println("Order: "+ iceCream.getDescription());

        System.out.println("Overall Bill: "+ iceCream.getCost());

        System.out.println("Thanks for Choosing Cream Stone \nWe are waiting for your next Hiii (:");
    }
}
