package com.designPatterns.Creational.factoryMethodPattern.refactoring_guru;

/**
 * <h1>Factory Method Implementation</h1>
 */
public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
