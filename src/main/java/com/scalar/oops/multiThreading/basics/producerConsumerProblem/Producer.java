package com.scalar.oops.multiThreading.basics.producerConsumerProblem;

public class Producer implements Runnable{
    int producer_id;
    Store store;

    public Producer(int producer_id, Store store) {
        this.producer_id = producer_id;
        this.store = store;
    }


    @Override
    public void run() {
        while(true){
            System.out.println("producer id "+producer_id+" items status "+store.getItems());
            synchronized (store) {
                if (store.getItems() < store.getMaxSize()) {
                    try {
                        store.setItems(store.getItems() + 1);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
