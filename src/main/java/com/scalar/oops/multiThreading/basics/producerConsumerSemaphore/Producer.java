package com.scalar.oops.multiThreading.basics.producerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    int producer_id;
    Store store;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    public Producer(int producer_id, Store store, Semaphore consumerSemaphore, Semaphore producerSemaphore) {
        this.producer_id = producer_id;
        this.store = store;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
    }


    @Override
    public void run() {
        while (true) {
            try {
                produceItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void produceItem() throws InterruptedException {
        //System.out.println("Producer <---->" + producer_id);
        producerSemaphore.acquire();
        store.addItem(producer_id);
        consumerSemaphore.release();
    }
}
