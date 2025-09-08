package com.scalar.multithreading.custumThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomizedThreadPool {



    public static void main(String args[]){

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,
                4,
                20000,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                new CustomThreadFactory(),
                new CustomRejectedExecutionHandler()
        );

        threadPoolExecutor.allowCoreThreadTimeOut(true);


        for(int i = 0;i<8 ;i++){
            int taskNumber = i;
            threadPoolExecutor.submit(
                    () ->{

                        try{
                            Thread.sleep(10000);
                        }
                        catch(Exception ex){}

                    System.out.println("Task "+ taskNumber +" "+ Thread.currentThread().getName());
                    }
            );
        }
        threadPoolExecutor.shutdown();
    }

}
