package com.scalar.designPatterns.singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class DbcClient {

    public static void main(String[] args) {
        DBC.lock = new ReentrantLock();
        DBC.getInstance();

        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=0;i<10;i++){
            Service s1 = new Service();
            executorService.execute(s1);
            Repository res = new Repository();
            executorService.execute(res);
            Controller c1 = new Controller();
            executorService.execute(c1);
        }
    }


}
