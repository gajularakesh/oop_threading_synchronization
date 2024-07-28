package com.scalar.oops.multiThreading.basics.producerConsumerProblem;

public class Consumer implements Runnable{
    private int Consumer_id;
    private Store store;

    Consumer(Store store, int Consumer_id) {
        this.store = store;
        this.Consumer_id = Consumer_id;
    }

    public void run() {
        while (true) {
            synchronized (store) {
                if (store.getItems() > 0) {
                    System.out.println("Consumer id = " + Consumer_id + " Nth items: " + store.getItems());
                    try {
                        store.setItems(store.getItems() - 1);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
