package com.scalar.designPatterns.factory.button;

public class IOSButton implements Button {


    @Override
    public void displayButton() {
        System.out.println("IOS Button");
    }
}
