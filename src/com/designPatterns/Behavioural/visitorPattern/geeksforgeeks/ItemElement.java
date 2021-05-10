package com.designPatterns.Behavioural.visitorPattern.geeksforgeeks;

public interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
}
