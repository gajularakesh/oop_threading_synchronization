package com.scalar.oops.multiThreading.basics.adderSubstractorMutex;

import java.util.concurrent.locks.Lock;

public class AdderMutex implements Runnable{

    CountMutex cnt;
    Lock lock;
    public AdderMutex(CountMutex count,Lock lock ) {
        this.cnt = count;
        this.lock = lock;
    }
    public void run() {
        for (int i = 0; i < 100000; i++) {
            lock.lock();
            cnt.count = cnt.count+1;
            lock.unlock();
        }
    }
}
