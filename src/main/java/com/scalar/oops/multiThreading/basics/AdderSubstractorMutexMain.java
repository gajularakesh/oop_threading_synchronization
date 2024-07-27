package com.scalar.oops.multiThreading.basics;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AdderSubstractorMutexMain {


    public static void main(String[] args)throws InterruptedException {
        CountMutex cnt = new CountMutex();
        Lock lock = new ReentrantLock();//To lock the Critical section
        SubstracterMutex sub = new SubstracterMutex(cnt,lock);//same lock is shared between both the
        AdderMutex ad = new AdderMutex(cnt,lock);//objects that are being sharing C.S.
        Thread t1 = new Thread(ad);
        Thread t2 = new Thread(sub);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Substracter count: " + cnt.count);

    }
}
