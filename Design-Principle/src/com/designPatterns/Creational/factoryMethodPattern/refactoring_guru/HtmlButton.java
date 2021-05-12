package com.designPatterns.Creational.factoryMethodPattern.refactoring_guru;

public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>HTML Button<button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click !! Button Says - 'Hello World");
    }
}
