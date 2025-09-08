package com.scalar.designPatterns.factory.button;

public class WindowsButton implements Button {

    @Override
    public void displayButton() {
        System.out.println("Windows Button");
    }
}
