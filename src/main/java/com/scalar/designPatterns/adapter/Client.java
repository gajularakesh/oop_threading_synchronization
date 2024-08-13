package com.scalar.designPatterns.adapter;

public class Client {

    public static void main(String[] args) {
        //implementing icici
        IciciBankAdapter iciciBankApi = new IciciBankAdapter();
        PhonePay phonePay1 = new PhonePay(iciciBankApi);
        System.out.println(phonePay1.addMoney(123,100));

        //implementing yes
        YesBankAdapter yesBankApi = new YesBankAdapter();
        PhonePay phonePay2 = new PhonePay(yesBankApi);
        System.out.println(phonePay2.addMoney(123,100));

    }
}
