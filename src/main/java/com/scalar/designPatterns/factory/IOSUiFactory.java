package com.scalar.designPatterns.factory;

import com.scalar.designPatterns.factory.button.Button;
import com.scalar.designPatterns.factory.button.IOSButton;
import com.scalar.designPatterns.factory.button.WindowsButton;
import com.scalar.designPatterns.factory.menu.IOSMenu;
import com.scalar.designPatterns.factory.menu.Menu;

public class IOSUiFactory implements UiFactory {


    @Override
    public void createButton() {

        Button button = new IOSButton();
        button.displayButton();
    }

    @Override
    public void createMenu() {

        Menu menu = new IOSMenu();
        menu.displayMenu();
    }
}
