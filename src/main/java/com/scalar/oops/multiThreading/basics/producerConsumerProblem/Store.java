package com.scalar.oops.multiThreading.basics.producerConsumerProblem;

public class Store {
    private int items=0;
    private int maxItems;

    public Store(int maxItems) {
        this.maxItems = maxItems;
    }

    public void setItems(int items) throws Exception {

        if(items>maxItems){
            throw new Exception("Out of Space: "+ items);
        }
            System.out.println("Setting items to: "+items);
        this.items = items;
        System.out.println("Items set to --> "+items);
    }

    public int getItems(){
        return items;
    }

    public int getMaxSize(){
        return  maxItems;
    }

}
