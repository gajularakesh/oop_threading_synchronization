package com.scalar.designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class FlipkartPublisher {


    Subscriber subscriber;

    List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public static FlipkartPublisher flipkartPublisher;

    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }

    public static FlipkartPublisher getInstance() {
        if (flipkartPublisher == null) {
            flipkartPublisher = new FlipkartPublisher();
        }
        return flipkartPublisher;
    }

    public void registerWith(Subscriber subscriber) {

        subscribers.add(subscriber);
        System.out.println(subscribers.size());
    }

    public void unregisterWith(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void orderPlaced() {



        for (Subscriber subscriber : subscribers) {
            System.out.println("came1");
            subscriber.orderPlaced();
        }
    }
}
