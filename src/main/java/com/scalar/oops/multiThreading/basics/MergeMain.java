package com.scalar.oops.multiThreading.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class MergeMain {

    public static void main(String[] args) throws Exception  {

        List<Integer> list = List.of(1,3,2,5,4,6,9,8,7);

        ExecutorService executorService = Executors.newCachedThreadPool();

        MergeSorter mergeSorter = new MergeSorter(list,executorService);
        Future<List<Integer>> finalSorded = executorService.submit(mergeSorter);

        executorService.awaitTermination(1, TimeUnit.SECONDS);
       executorService.shutdown();

        System.out.println(finalSorded.get());
    }
}
