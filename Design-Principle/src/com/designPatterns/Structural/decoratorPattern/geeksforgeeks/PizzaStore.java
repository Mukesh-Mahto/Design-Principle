package com.designPatterns.Structural.decoratorPattern.geeksforgeeks;

// Driver class and method
public class PizzaStore {
    public static void main(String args[]) {
        // create new margherita pizza
        Pizza pizza = new Margherita();
        System.out.println(pizza.getDescription() + " Cost :" + pizza.getCost());

        // create new FarmHouse pizza
        Pizza pizza2 = new FarmHouse();
        System.out.println(pizza2.getDescription() + " Cost :" + pizza2.getCost());
        // decorate it with freshtomato topping
        pizza2 = new FreshTomato(pizza2);
        System.out.println(pizza2.getDescription() + " Cost :" + pizza2.getCost());
        //decorate it with paneer topping
        pizza2 = new Paneer(pizza2);

        System.out.println(pizza2.getDescription() + " Cost :" + pizza2.getCost());
        Pizza pizza3 = new Barbeque(null); //no specific pizza
        System.out.println(pizza3.getDescription() + " Cost :" + pizza3.getCost());
    }

}
