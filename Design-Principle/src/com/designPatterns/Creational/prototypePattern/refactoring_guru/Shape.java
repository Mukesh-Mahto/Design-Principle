package com.designPatterns.Creational.prototypePattern.refactoring_guru;

/**
 * Abstract class of product
 */
public abstract class Shape {
    public int x;
    public int y;
    public String color;

    Shape(){}

    // *** Product classes should have constructor with class name argument.
    public Shape(Shape target){
        if(target != null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {
        if(!(obj  instanceof Shape)) return false;
        Shape shape = (Shape) obj;
        return this.x == shape.x && this.y == shape.y && this.color.equals(shape.color);
    }
}
