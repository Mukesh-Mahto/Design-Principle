package com.designPatterns.Creational.factoryMethodPattern.refactoring_guru;

/**
 * <h1>Base factory class. Note that "factory" is merely a role for the class.
 * It should have some core business logic which needs different products to be
 * created</h1>
 */
public abstract class Dialog {

    public abstract Button createButton();

    public void renderWindow(){
        Button button = createButton();
        button.render();
    }

}
