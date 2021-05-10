package com.designPatterns.Creational.abstractFactoryPattern.refactoring_guru;

/**
 * <h1>Product Class</h1>
 * All products families have the same varieties (MacOS/Windows).
 * This is a MacOS variant of a button.
 */
public class MacOSButton implements Button{

    @Override
    public void paint() {
        System.out.println("You have createrd MacOSButton ");
    }
}

