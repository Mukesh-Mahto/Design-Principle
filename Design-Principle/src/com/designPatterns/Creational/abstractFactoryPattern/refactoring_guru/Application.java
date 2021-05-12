package com.designPatterns.Creational.abstractFactoryPattern.refactoring_guru;

/**
 * Factory users don't care which concrete factory they use since they work
 * with factories and products through abstract interfaces.
 */
public class Application {
    Button button;
    CheckBox checkBox;

    Application(GUIFactory factory){
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }
}
