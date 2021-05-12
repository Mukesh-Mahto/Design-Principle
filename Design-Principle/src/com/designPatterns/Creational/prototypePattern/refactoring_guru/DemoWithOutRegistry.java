package com.designPatterns.Creational.prototypePattern.refactoring_guru;

import java.util.ArrayList;
import java.util.List;

public class DemoWithOutRegistry {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";

        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";

        shapes.add(rectangle);

        cloneAndCompare(shapes,shapesCopy);

    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy){
        shapes.forEach(shape -> shapesCopy.add(shape.clone()));

        /*int counter =0;
        shapes.stream().filter(shapeCopy -> shapesCopy.stream().anyMatch(shape -> {
            if(shapes != shapesCopy){
                System.out.println(counter+": Shapes are different objects (yay!)");
                if(shapes.equals(shapesCopy)){
                    System.out.println(counter+": And they are identical (yay!)");
                }else{
                    System.out.println(counter+": But they are not identical (yay!)");
                }
            }else{
                System.out.println(counter+": Shapes are same objects (yay!)");
            }
        })).forEach();*/

        for(int i=0; i< shapes.size();i++){
            if(shapes.get(i) != shapesCopy.get(i)){
                System.out.println(i+": Shapes are different objects (yay!)");
                if(shapes.get(i).equals(shapesCopy.get(i))){
                    System.out.println(i+": And they are identical (yay!)");
                }else{
                    System.out.println(i+": But they are not identical (yay!)");
                }
            }else{
                System.out.println(i+": Shapes are same objects (yay!)");
            }
        }

    }
}
