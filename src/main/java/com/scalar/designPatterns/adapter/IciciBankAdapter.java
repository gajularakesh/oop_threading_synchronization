package com.scalar.designPatterns.adapter;

public class IciciBankAdapter implements BankApi{

    private IciciBankApi iciciBankApi = new IciciBankApi(123,100);

    public int addMoney(int accountNumber,int amount) {

        return iciciBankApi.addMoneyIciciBankSpecific(accountNumber,amount);
    }
}
