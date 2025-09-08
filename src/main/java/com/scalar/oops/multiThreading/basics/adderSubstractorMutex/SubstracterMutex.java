package com.scalar.oops.multiThreading.basics.adderSubstractorMutex;

import java.util.concurrent.locks.Lock;

public class SubstracterMutex implements  Runnable{

    CountMutex cnt ;
    Lock lock;

    SubstracterMutex(CountMutex cnt, Lock lock){
        this.cnt = cnt;
        this.lock = lock;
    }
    public void run(){
        for(int i = 0 ; i < 100000; i++){
            lock.lock();
            cnt.count = cnt.count-1;
            lock.unlock();
        }
    }
}
