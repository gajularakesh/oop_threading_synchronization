package com.scalar.oops.multiThreading.basics.Generics;

//T1 and T2 are the Generic type will assigned at runtime These are generics avaliable from java 5
public class Pair <T1, T2> {
    private T1 first;
    private T2 second;
    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }
    public T1 getFirst() {
        return first;
    }
    public void setFirst(T1 first) {
        this.first = first;
    }
    public T2 getSecond() {
        return second;
    }
    public void setSecond(T2 second) {
        this.second = second;
    }
    //first declare the generics and then use it
    public static <T> T print(T str) {
        //System.out.println(str);
        return str;
    }

}
