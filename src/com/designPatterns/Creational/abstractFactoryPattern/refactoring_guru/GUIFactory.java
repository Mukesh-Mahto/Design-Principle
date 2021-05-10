package com.designPatterns.Creational.abstractFactoryPattern.refactoring_guru;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
