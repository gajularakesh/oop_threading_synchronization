package com.scalar.designPatterns.singleton;

import java.util.concurrent.locks.Lock;

public class DBC {
    String url;
    String name;
    String query;
    static Lock lock ;
    private static DBC dbc = null;

    private DBC(){}

    public static DBC getInstance(){
        if(dbc == null) {
            lock.lock();
            if (dbc == null) {
                dbc = new DBC();
                System.out.println("You got the connection");
            }
            lock.unlock();
        }
        return dbc;
    }
}
