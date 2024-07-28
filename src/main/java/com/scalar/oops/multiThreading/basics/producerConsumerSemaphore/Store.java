package com.scalar.oops.multiThreading.basics.producerConsumerSemaphore;


import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {

    Queue<Object> items;
    int maxItems;

    public Store(int maxItems) {
        this.maxItems = maxItems;
        this.items = new ConcurrentLinkedDeque<>();
    }

    public void addItem(int producer_id) {
        items.add(new Object());
        System.out.println("Added: size is --> "+items.size()+" By: "+producer_id);
    }

    public void removeItem(int consumer_id  ) {
        items.remove();
        System.out.println("Removed: size is --> "+ items.size()+" By: "+consumer_id);
    }

    public int getMaxItems() {
        return maxItems;
    }

    public Queue<Object> getItems() {
        return items;
    }
}
