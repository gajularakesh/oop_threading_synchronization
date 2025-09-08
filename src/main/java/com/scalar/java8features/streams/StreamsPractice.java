package com.scalar.java8features.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(12, 23, 54, 57, 87, 6, 8,23,6));

        Map<Boolean, List<Integer>> evenOdd = listOfIntegers.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));

        Map<Integer,Long>  freq  = listOfIntegers.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        for (Map.Entry m : freq.entrySet()) {
           // System.out.println(m.getKey() + " " + m.getValue());
        }

        List<Integer> removeDuplicates = Stream.of(1,2,3,3,4,5,5,6).distinct().collect(Collectors.toList());

        List<Integer> list1 = Stream.of(1,1,2,2,3,4,5,6).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream().filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(list1);


        String str = "Java code of the day";

        Map<Character,Long> charFreq = str.chars().
                mapToObj(c -> (char)c).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));



        List<Double> decimals = Arrays.asList(23.4,45.6,28.6,34.5,12.9);

        List<Double> sortedDecimals = decimals.stream().sorted(Comparator.comparingDouble(e->e)).collect(Collectors.toList());
        //System.out.println(sortedDecimals);


        int number = 1234;
        OptionalInt sum  = String.valueOf(number).chars().map(c -> c - '0').reduce((a, b)->a+b);

        int sum2 = String.valueOf(number).chars().map(Character::getNumericValue).sum();
       // System.out.println(sum2);

        //double avg = decimals.stream().mapToDouble(e->e).average().getAsDouble();

        String reverseEachWord = "sunrisers will win next match";

        String reversed = Stream.of(reverseEachWord.split(" ")).map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining(" "));

        System.out.println(reversed);

    }
}
