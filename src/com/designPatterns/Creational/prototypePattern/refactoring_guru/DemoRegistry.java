package com.designPatterns.Creational.prototypePattern.refactoring_guru;

public class DemoRegistry {
    public static void main(String[] args) {
        BundledShapeRegistry registry = new BundledShapeRegistry();

        Shape shape1 = registry.get("Big Green Circle");
        Shape shape2 = registry.get("Medium Blue Rectangle");
        Shape shape3 = registry.get("Medium Blue Rectangle");

        if(shape1 != shape2 && !shape1.equals(shape2)){
            System.out.println("Big Green Circle != Medium Blue Rectangle (yay!)");
        }else{
            System.out.println("Big Green Circle == Medium Blue Rectangle (boooo!)");
        }

        if(shape2 != shape3){
            System.out.println("Medium Blue Rectangles are two different object (YAY!)");
            if(shape2.equals(shape3)){
                System.out.println("And they are identical");
            }else{
                System.out.println("But they are not identical (booooo!)");
            }
        }else{
            System.out.println("Rectangles Objects are same (Booooo!)");
        }

        System.out.println("Size of registry "+registry.registrySize());
    }
}
