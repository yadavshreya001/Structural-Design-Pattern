package com.example.designpattern.decoratordesignpattern;

// Implement the basic coffee
public class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Basic Coffee";   // Default description
    }

    @Override
    public double getCost() {
        return 50.0; // Base price of coffee
    }
}