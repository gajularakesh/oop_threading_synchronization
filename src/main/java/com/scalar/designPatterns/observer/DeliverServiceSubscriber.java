package com.scalar.designPatterns.observer;

public class DeliverServiceSubscriber implements Subscriber {


    public DeliverServiceSubscriber(){
        FlipkartPublisher publisher = FlipkartPublisher.getInstance();
        publisher.registerWith(this);
    }

    @Override
    public void orderPlaced() {
        System.out.println("Informed to Deliver Service that order had placed");
    }
}
