package com.scalar.designPatterns.factory;

import static com.scalar.designPatterns.factory.Platform.IOS;

public class Client {

    public static void main(String[] args) {

        Flutter flutter = new Flutter();

        UiFactory ui = flutter.getUiFactoryInstance(IOS);

        ui.createButton();
        ui.createButton();


    }
}
