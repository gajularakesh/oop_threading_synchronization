package com.scalar.designPatterns.factory;

public class UiFactoryFactory {

    public static UiFactory getUiFactory(Platform platform){

        switch (platform){
            case WINDOWS:
                return new WindowsUiFactory();
            case ANDRIOD:
                return new AndriodUiFactory();
            case IOS:
                return new IOSUiFactory();
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }

    }
}
