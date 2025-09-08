package com.scalar.designPatterns.factory;

import com.scalar.designPatterns.factory.button.AndriodButton;
import com.scalar.designPatterns.factory.button.Button;
import com.scalar.designPatterns.factory.button.WindowsButton;
import com.scalar.designPatterns.factory.menu.AndriodMenu;
import com.scalar.designPatterns.factory.menu.Menu;

public class AndriodUiFactory implements UiFactory{

    @Override
    public void createButton() {
        Button button = new AndriodButton();
        button.displayButton();
    }

    @Override
    public void createMenu() {

        Menu menu = new AndriodMenu();
        menu.displayMenu();

    }
}
