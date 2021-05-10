package com.designPatterns.Behavioural.visitorPattern.geeksforgeeks;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit  fruit );
}

