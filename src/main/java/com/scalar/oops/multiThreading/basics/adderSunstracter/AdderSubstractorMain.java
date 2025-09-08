package com.scalar.oops.multiThreading.basics.adderSunstracter;

public class AdderSubstractorMain {


    public static void main(String[] args)throws InterruptedException {
        Count cnt = new Count();
        Adder ad = new Adder(cnt);
        Substracter sub = new Substracter(cnt);
        Thread t1 = new Thread(ad);
        Thread t2 = new Thread(sub);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Substracter count: " + cnt.count);

    }
}
