package com.scalar.oops.multiThreading.basics.producerConsumerSemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class ProducerConsumerMain {

    public static void main(String[] args) {

        Store store = new Store( 5);

        Semaphore consumerSemaphore = new Semaphore(0);
        Semaphore producerSemaphore = new Semaphore(5);
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 1; i <11; i++) {
            Producer p = new Producer(i, store,consumerSemaphore,producerSemaphore);
            executorService.execute(p);
            //System.out.println("Producer " + i + " started");
        }
        for (int i = 1; i < 21; i++) {
            Consumer c = new Consumer(store,i,consumerSemaphore,producerSemaphore);
            executorService.execute(c);
            //System.out.println("Consumer " + i + " started");
        }
    }
}
