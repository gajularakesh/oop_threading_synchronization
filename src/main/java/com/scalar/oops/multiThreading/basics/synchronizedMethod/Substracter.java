package com.scalar.oops.multiThreading.basics.synchronizedMethod;

public class Substracter implements  Runnable{

    Count cnt ;

    Substracter(Count cnt){
        this.cnt = cnt;
    }
    public void run(){
        for(int i = 0 ; i < 100000; i++){
            cnt.increment(-1);
        }
    }
}
