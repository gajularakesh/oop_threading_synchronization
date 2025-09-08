package com.scalar.designPatterns.observer;

public class MailNotificationSubscriber implements Subscriber{


    public MailNotificationSubscriber(){
        FlipkartPublisher publisher = FlipkartPublisher.getInstance();
        publisher.registerWith(this);
    }



    @Override
    public void orderPlaced() {
        System.out.println("Informed to Mail Notification Service that order had placed");
    }
}
