package com.designPatterns.Creational.prototypePattern.refactoring_guru;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeRegistry {
    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeRegistry() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";

        cache.put("Big Green Circle", circle);
        cache.put("Medium Blue Rectangle",rectangle );
    }

    public Shape put(String key, Shape shape){
        cache.put(key,shape);
        return shape;
    }

    public Shape get(String key){
        return cache.get(key).clone();
    }

    public int registrySize(){
        return cache.size();
    }
}
