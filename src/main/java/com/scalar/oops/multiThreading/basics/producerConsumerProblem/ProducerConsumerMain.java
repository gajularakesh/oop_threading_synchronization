package com.scalar.oops.multiThreading.basics.producerConsumerProblem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerMain {

    public static void main(String[] args) {

        Store store = new Store( 3);

        for (int i = 1; i < 4; i++) {
            Producer p = new Producer(i, store);
            ExecutorService executorService = Executors.newCachedThreadPool();
            executorService.execute(p);
        }
        for (int i = 1; i < 11; i++) {
            Consumer c = new Consumer(store,i);
            ExecutorService executorService = Executors.newCachedThreadPool();
            executorService.execute(c);
        }
    }
}
