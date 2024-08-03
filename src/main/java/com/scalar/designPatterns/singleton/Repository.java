package com.scalar.designPatterns.singleton;

public class Repository implements Runnable {

    DBC dbc ;
    public Repository() {}

    @Override
    public void run() {
        dbc = DBC.getInstance();
        System.out.println(dbc+" Repository: " + Thread.currentThread().getName());
    }

}
