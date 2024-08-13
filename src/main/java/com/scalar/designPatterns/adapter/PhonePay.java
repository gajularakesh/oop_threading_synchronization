package com.scalar.designPatterns.adapter;

public class PhonePay {

    BankApi bankApi;

    public PhonePay(BankApi bankApi) {
        this.bankApi = bankApi;
    }

    public int addMoney(int accountNumber,int money) {
        return bankApi.addMoney(accountNumber,money);
    }
}
