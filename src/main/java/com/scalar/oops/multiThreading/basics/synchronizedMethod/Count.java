package com.scalar.oops.multiThreading.basics.synchronizedMethod;

public class Count {
    private int count ;

    //only one method will accessed in count object which are synchronized at a time
    //not synchronized object will accessed by more than one thread along with 1 synchronized method
    synchronized void increment(int value) {
        count = count + value;
    }
    int getCount() {
        return count;
    }
}
