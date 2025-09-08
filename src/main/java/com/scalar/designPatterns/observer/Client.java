package com.scalar.designPatterns.observer;

public class Client {
    public static void main(String[] args) {

        FlipkartPublisher flipkartPublisher = FlipkartPublisher.getInstance();


        MailNotificationSubscriber newMailNotificationSubscriber = new MailNotificationSubscriber();

        DeliverServiceSubscriber deliverServiceSubscriber = new DeliverServiceSubscriber();

        InventrySubscriber inventrySubscriber = new InventrySubscriber();

        flipkartPublisher.orderPlaced();


    }
}
