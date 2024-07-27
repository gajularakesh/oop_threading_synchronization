package com.scalar.oops.multiThreading.basics;

import java.util.*;
class Client{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            TableCreator tc = new TableCreator(i);
            ScalerThread thread = new ScalerThread(tc);
            thread.start();
        }
        
    }
}