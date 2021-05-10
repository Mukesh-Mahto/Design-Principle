package com.designPatterns.Creational.abstractFactoryPattern.refactoring_guru;

/**
 * <h1>Product</h1>
 * All products families have the same varieties (MacOS/Window).
 * This is variant of a checkbox.
 */
public class MacOSCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("You have Created MacOSCheckBox");
    }
}
