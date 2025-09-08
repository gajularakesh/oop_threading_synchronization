package com.scalar.designPatterns.factory;

public class Flutter {

    //Non-Factory methods

    void refreshUi(){
        System.out.println("refresh ui");
    }

    void changeTheme(){
        System.out.println("change theme");
    }

    //Factory Methods
     public UiFactory getUiFactoryInstance(Platform platfrom){

        return UiFactoryFactory.getUiFactory(platfrom);
    }
}
