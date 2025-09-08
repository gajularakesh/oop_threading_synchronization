package com.scalar.designPatterns.observer;

import java.util.Observer;
import com.scalar.designPatterns.observer.FlipkartPublisher;

public class InventrySubscriber implements Subscriber{

    InventrySubscriber(){
        FlipkartPublisher flipkartPublisher = FlipkartPublisher.getInstance();
        flipkartPublisher.registerWith(this);
    }

    @Override
    public void orderPlaced() {
        System.out.println("Informed to Inventry Service that order had placed");
    }
}
