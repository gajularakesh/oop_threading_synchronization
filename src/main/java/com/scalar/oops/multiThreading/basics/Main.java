package com.scalar.oops.multiThreading.basics;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        HelloWorldPrinter hw = new HelloWorldPrinter();
//        Thread thread1 = new Thread(hw);
//        System.out.println("1"+Thread.currentThread().getName());
//        System.out.println("2");
//        System.out.println("3");
//        thread1.start();
//        System.out.println("4");
//        try {
//            Thread.sleep(200);
//        }catch (Exception e) {}
//        System.out.println("5"+ Thread.currentThread().getName());

        for (int i = 1; i < 101; i++) {
            NumPrinter np = new NumPrinter(i);
//            Thread t1 = new Thread(np);
//            t1.start();
            ExecutorService executorService = Executors.newFixedThreadPool(10);


            executorService.execute(np);
        }
    }
}
