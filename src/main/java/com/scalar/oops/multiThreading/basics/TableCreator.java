package com.scalar.oops.multiThreading.basics;

class TableCreator implements Runnable{
    int x;
    TableCreator(int x){
        this.x = x;
    }
    public void run() {
        for(int i=1;i<11;i++){
            System.out.println(x+" times "+i+" is "+x*i);
        }
    }

    
}