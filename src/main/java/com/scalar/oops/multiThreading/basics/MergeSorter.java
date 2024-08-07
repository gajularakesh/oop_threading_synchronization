package com.scalar.oops.multiThreading.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    List<Integer> listToBeSorted;
    ExecutorService executor;

    public MergeSorter(List<Integer> listToBeSorted, ExecutorService executorService) {
        this.listToBeSorted = listToBeSorted;
        this.executor = executorService;
    }
    @Override
    public List<Integer> call() throws Exception {
        int n = listToBeSorted.size();

        if (n <= 1) {
            return listToBeSorted; // Base case: a list with 0 or 1 elements is already sorted
        }

        int mid = n / 2;

        ArrayList<Integer> leftList = new ArrayList();
        ArrayList<Integer> rightList = new ArrayList();
        for (int i = 0; i < mid; i++) {
            leftList.add(listToBeSorted.get(i));
        }
        for (int i = mid; i < n; i++) {
            rightList.add(listToBeSorted.get(i));
        }

        MergeSorter mergeSorter1 = new MergeSorter(leftList, executor);
        Future<List<Integer>> futureLeftList =  executor.submit(mergeSorter1);
        MergeSorter mergeSorter2 = new MergeSorter(rightList, executor);
        Future<List<Integer>> futureRightList =  executor.submit(mergeSorter2);

        ArrayList<Integer> sortedLeftList = new ArrayList<>();
        ArrayList<Integer> sortedRightList = new ArrayList<>();

        sortedLeftList.addAll(futureLeftList.get());
        sortedRightList.addAll(futureRightList.get());

        ArrayList<Integer> mergedList = new ArrayList<>();

        int i=0, j=0;
        while(i < sortedLeftList.size() && j < sortedRightList.size()) {

            if(sortedLeftList.get(i) <= (sortedRightList.get(j))) {
                mergedList.add(sortedLeftList.get(i));
                i++;
            }
            else{
                mergedList.add(sortedRightList.get(j));
                j++;
            }
        }
        if(i < sortedLeftList.size()) {
            mergedList.addAll(sortedLeftList);
        }
        else {
            mergedList.addAll(sortedRightList);
        }

        return mergedList;
    }
}
