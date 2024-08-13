package com.scalar.java8features.methodreferences;

import java.util.function.*;

public class interfacerMain {

    public static void main(String[] args) {
        MethodReferences m = new MethodReferences();
        Intefacer intefacer = m::somthing;
       //intefacer.intfaced();

        Supplier<String> supplyString = () -> "Hello";

       //fucntion and Bifunction
        Function<Integer,Character> function = (x) -> (char)(int)x;
        BiFunction<Integer, Integer, Integer> biFunc = (x, y) -> x + y;

        //System.out.println(biFunc.apply(1, 2));
        //System.out.println(function.apply(97));

        //predicate and BiPredicate
        Predicate<String> predicate = (x) -> x.length() > 5;
        BiPredicate<String, Integer> biPredicate = (x, y) -> x.length() > y;

        //System.out.println(predicate.test("abc"));
        //System.out.println(biPredicate.test("rakesh",5));

        //consumer
        Consumer<String> consumer = System.out::println;
        BiConsumer<String, String> biConsumer = (x, y) -> System.out.println(x+y);
         //   consumer.accept("rakesh");
        //   biConsumer.accept(supplyString.get()," Gajula");








    }
}
