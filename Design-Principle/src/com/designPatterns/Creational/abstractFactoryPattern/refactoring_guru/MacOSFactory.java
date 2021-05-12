package com.designPatterns.Creational.abstractFactoryPattern.refactoring_guru;

public class MacOSFactory implements GUIFactory{

/**
 * EN: Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
