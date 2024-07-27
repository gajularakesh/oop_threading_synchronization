package com.scalar.oops.multiThreading.basics;

import java.util.Random;

public class NumPrinter implements Runnable {
    int numberToPrint;
    NumPrinter(int numberToPrint){
        this.numberToPrint = numberToPrint;
    }
    public void run() {
        Random rand = new Random();
        int num = rand.nextInt(100,250);
        try {
            Thread.sleep(num);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(numberToPrint+" "+Thread.currentThread().getName());
    }

}
