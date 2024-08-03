package com.scalar.designPatterns.singleton;

public class Service implements Runnable {

    DBC dbc ;
    public Service() {}

    @Override
    public void run() {
        DBC dbc = DBC.getInstance();
        System.out.println(dbc+" Service: " + Thread.currentThread().getName());
    }
}
