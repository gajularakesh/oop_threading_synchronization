package com.scalar.oops.multiThreading.basics.Generics;

public class PairMain {

    public static void main(String[] args) {
        Pair<Integer,Integer> p = new Pair<Integer,Integer>(1,2);
        System.out.println(p.getFirst()+" "+p.getSecond());
        Pair<String,String> p1 = new Pair<String,String>("rakesh","venkatesh");
        System.out.println(p1.getFirst()+" "+p1.getSecond());

        System.out.println(Pair.print("Charan"));
    }
}
