package com.scalar.oops.multiThreading.basics.producerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private int consumer_id;
    private Store store;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    Consumer(Store store, int Consumer_id,Semaphore consumerSemaphore,Semaphore producerSemaphore ) {
        this.store = store;
        this.consumer_id = Consumer_id;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    public void run() {
        while (true) {
            try {
                consumeItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void consumeItem() throws InterruptedException {
        //  System.out.println("Consumer <---> " + consumer_id);
        consumerSemaphore.acquire();
        store.removeItem(consumer_id);
        producerSemaphore.release();
    }
}
