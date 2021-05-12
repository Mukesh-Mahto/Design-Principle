package com.designPatterns.Structural.decoratorPattern.geeksforgeeks;

// Concrete toppings classes
class FreshTomato extends ToppingsDecorator {
    // we need a reference to obj we are decorating
    Pizza pizza;

    public FreshTomato(Pizza pizza) { this.pizza = pizza;}

    @Override
    public String getDescription() { return pizza.getDescription() + ", Fresh Tomato "; }

    @Override
    public int getCost() { return 40 + pizza.getCost(); }
}

class Barbeque extends ToppingsDecorator {
    Pizza pizza;

    public Barbeque(Pizza pizza) { this.pizza = pizza; }

    @Override
    public String getDescription() { return pizza.getDescription() + ", Barbeque "; }

	@Override
    public int getCost() { return 90 + pizza.getCost(); }
}

class Paneer extends ToppingsDecorator {
    Pizza pizza;

    public Paneer(Pizza pizza) { this.pizza = pizza; }

	@Override
    public String getDescription() { return pizza.getDescription() + ", Paneer "; }

	@Override
    public int getCost() { return 70 + pizza.getCost(); }
}

// Other toppings can be coded in a similar way
