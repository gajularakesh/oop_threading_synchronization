package com.scalar.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;

public class AllMactch {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Predicate<Integer> predicate = i -> i > 0;
        System.out.println(predicate.test(5));
        System.out.println(list.stream().allMatch(predicate));
    }
}
