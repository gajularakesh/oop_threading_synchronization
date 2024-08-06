package com.scalar.designPatterns.singleton.type2code;

import javax.xml.crypto.Data;

public class SingletonTest {

    public static void main(String[] args) {
        // Create multiple threads to access getInstance() simultaneously
        Thread t1 = new Thread(() -> {
            DataBase instance1 = DataBase.getInstance();
            System.out.println(instance1);
        });

        Thread t2 = new Thread(() -> {
            DataBase instance2 = DataBase.getInstance();
            System.out.println(instance2);
        });

        t1.start();
        t2.start();
    }
}
