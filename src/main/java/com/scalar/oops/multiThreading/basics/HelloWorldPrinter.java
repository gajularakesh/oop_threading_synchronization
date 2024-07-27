package com.scalar.oops.multiThreading.basics;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello World1"+Thread.currentThread().getName());
        System.out.println("Hello World2"+Thread.currentThread().getName());
    }
}
