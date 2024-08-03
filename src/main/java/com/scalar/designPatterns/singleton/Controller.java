package com.scalar.designPatterns.singleton;

public class Controller implements Runnable{

    DBC dbc ;

    public Controller(){}

    @Override
    public void run() {
        DBC dbc = DBC.getInstance();
        System.out.println(dbc+" Controller: " + Thread.currentThread().getName());
    }
}
