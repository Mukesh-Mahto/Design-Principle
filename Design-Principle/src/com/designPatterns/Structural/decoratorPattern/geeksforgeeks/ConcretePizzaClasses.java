package com.designPatterns.Structural.decoratorPattern.geeksforgeeks;

// Concrete pizza classes
class PeppyPaneer extends Pizza {

    public PeppyPaneer() { this.description = "PeppyPaneer"; }

    @Override
    public int getCost() { return 100; }
}
class FarmHouse extends Pizza {

    public FarmHouse() { this.description = "FarmHouse"; }

    @Override
    public int getCost() { return 200; }
}
class Margherita extends Pizza {

    public Margherita() { this.description = "Margherita"; }

    @Override
    public int getCost() { return 100; }
}
class ChickenFiesta extends Pizza {

    public ChickenFiesta() { this.description = "ChickenFiesta"; }

    @Override
    public int getCost() { return 200; }
}
class SimplePizza extends Pizza {

    public SimplePizza() { this.description = "SimplePizza"; }

    @Override
    public int getCost() { return 50; }
}
