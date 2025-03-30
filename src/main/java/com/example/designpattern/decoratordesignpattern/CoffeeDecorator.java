package com.example.designpattern.decoratordesignpattern;

// Create an abstract decorator class that wraps a Coffee object
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee; // Wrapped coffee object

    // Constructor: Accepts a Coffee object to decorate
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription(); // Calls wrapped object's description
    }

    @Override
    public double getCost() {
        return coffee.getCost(); // Calls wrapped object's cost
    }
}