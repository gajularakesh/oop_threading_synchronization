package com.scalar.oops.multiThreading.basics.synchronizedMethod;

public class Adder implements Runnable {

    Count cnt;

    public Adder(Count count) {
        this.cnt = count;
    }

    public void run() {
        for (int i = 0; i < 100000; i++){
                cnt.increment(1);
        }
    }
}
