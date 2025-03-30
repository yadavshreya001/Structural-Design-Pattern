package com.example.designpattern.decoratordesignpattern;

// Create a concrete decorator (MilkDecorator)
public class MilkDecorator extends CoffeeDecorator {
    // Constructor: Wraps a Coffee object
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";  // Appends "Milk" to the description
    }

    @Override
    public double getCost() {
        return super.getCost() + 10.0; // Adds ₹10 to the cost
    }
}