package com.designPatterns.Structural.decoratorPattern.geeksforgeeks;

// The decorator class : It extends Pizza to be interchangable with it topings decorator can also be implemented as an interface
public abstract class ToppingsDecorator extends Pizza{
    public abstract String getDescription();
}
